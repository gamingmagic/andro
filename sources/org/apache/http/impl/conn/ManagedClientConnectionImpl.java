package org.apache.http.impl.conn;

import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Deprecated
class ManagedClientConnectionImpl implements ManagedClientConnection {
    private volatile long duration = Long.MAX_VALUE;
    private final ClientConnectionManager manager;
    private final ClientConnectionOperator operator;
    private volatile HttpPoolEntry poolEntry;
    private volatile boolean reusable = false;

    ManagedClientConnectionImpl(ClientConnectionManager clientConnectionManager, ClientConnectionOperator clientConnectionOperator, HttpPoolEntry httpPoolEntry) {
        Args.notNull(clientConnectionManager, "Connection manager");
        Args.notNull(clientConnectionOperator, "Connection operator");
        Args.notNull(httpPoolEntry, "HTTP pool entry");
        this.manager = clientConnectionManager;
        this.operator = clientConnectionOperator;
        this.poolEntry = httpPoolEntry;
    }

    public String getId() {
        return null;
    }

    /* access modifiers changed from: 0000 */
    public HttpPoolEntry getPoolEntry() {
        return this.poolEntry;
    }

    /* access modifiers changed from: 0000 */
    public HttpPoolEntry detach() {
        HttpPoolEntry httpPoolEntry = this.poolEntry;
        this.poolEntry = null;
        return httpPoolEntry;
    }

    public ClientConnectionManager getManager() {
        return this.manager;
    }

    private OperatedClientConnection getConnection() {
        HttpPoolEntry httpPoolEntry = this.poolEntry;
        if (httpPoolEntry == null) {
            return null;
        }
        return (OperatedClientConnection) httpPoolEntry.getConnection();
    }

    private OperatedClientConnection ensureConnection() {
        HttpPoolEntry httpPoolEntry = this.poolEntry;
        if (httpPoolEntry != null) {
            return (OperatedClientConnection) httpPoolEntry.getConnection();
        }
        throw new ConnectionShutdownException();
    }

    private HttpPoolEntry ensurePoolEntry() {
        HttpPoolEntry httpPoolEntry = this.poolEntry;
        if (httpPoolEntry != null) {
            return httpPoolEntry;
        }
        throw new ConnectionShutdownException();
    }

    public void close() {
        HttpPoolEntry httpPoolEntry = this.poolEntry;
        if (httpPoolEntry != null) {
            OperatedClientConnection operatedClientConnection = (OperatedClientConnection) httpPoolEntry.getConnection();
            httpPoolEntry.getTracker().reset();
            operatedClientConnection.close();
        }
    }

    public void shutdown() {
        HttpPoolEntry httpPoolEntry = this.poolEntry;
        if (httpPoolEntry != null) {
            OperatedClientConnection operatedClientConnection = (OperatedClientConnection) httpPoolEntry.getConnection();
            httpPoolEntry.getTracker().reset();
            operatedClientConnection.shutdown();
        }
    }

    public boolean isOpen() {
        OperatedClientConnection connection = getConnection();
        if (connection != null) {
            return connection.isOpen();
        }
        return false;
    }

    public boolean isStale() {
        OperatedClientConnection connection = getConnection();
        if (connection != null) {
            return connection.isStale();
        }
        return true;
    }

    public void setSocketTimeout(int i) {
        ensureConnection().setSocketTimeout(i);
    }

    public int getSocketTimeout() {
        return ensureConnection().getSocketTimeout();
    }

    public HttpConnectionMetrics getMetrics() {
        return ensureConnection().getMetrics();
    }

    public void flush() {
        ensureConnection().flush();
    }

    public boolean isResponseAvailable(int i) {
        return ensureConnection().isResponseAvailable(i);
    }

    public void receiveResponseEntity(HttpResponse httpResponse) {
        ensureConnection().receiveResponseEntity(httpResponse);
    }

    public HttpResponse receiveResponseHeader() {
        return ensureConnection().receiveResponseHeader();
    }

    public void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        ensureConnection().sendRequestEntity(httpEntityEnclosingRequest);
    }

    public void sendRequestHeader(HttpRequest httpRequest) {
        ensureConnection().sendRequestHeader(httpRequest);
    }

    public InetAddress getLocalAddress() {
        return ensureConnection().getLocalAddress();
    }

    public int getLocalPort() {
        return ensureConnection().getLocalPort();
    }

    public InetAddress getRemoteAddress() {
        return ensureConnection().getRemoteAddress();
    }

    public int getRemotePort() {
        return ensureConnection().getRemotePort();
    }

    public boolean isSecure() {
        return ensureConnection().isSecure();
    }

    public void bind(Socket socket) {
        throw new UnsupportedOperationException();
    }

    public Socket getSocket() {
        return ensureConnection().getSocket();
    }

    public SSLSession getSSLSession() {
        Socket socket = ensureConnection().getSocket();
        if (socket instanceof SSLSocket) {
            return ((SSLSocket) socket).getSession();
        }
        return null;
    }

    public Object getAttribute(String str) {
        OperatedClientConnection ensureConnection = ensureConnection();
        if (ensureConnection instanceof HttpContext) {
            return ((HttpContext) ensureConnection).getAttribute(str);
        }
        return null;
    }

    public Object removeAttribute(String str) {
        OperatedClientConnection ensureConnection = ensureConnection();
        if (ensureConnection instanceof HttpContext) {
            return ((HttpContext) ensureConnection).removeAttribute(str);
        }
        return null;
    }

    public void setAttribute(String str, Object obj) {
        OperatedClientConnection ensureConnection = ensureConnection();
        if (ensureConnection instanceof HttpContext) {
            ((HttpContext) ensureConnection).setAttribute(str, obj);
        }
    }

    public HttpRoute getRoute() {
        return ensurePoolEntry().getEffectiveRoute();
    }

    public void open(HttpRoute httpRoute, HttpContext httpContext, HttpParams httpParams) {
        Args.notNull(httpRoute, "Route");
        Args.notNull(httpParams, "HTTP parameters");
        synchronized (this) {
            if (this.poolEntry == null) {
                throw new ConnectionShutdownException();
            }
            RouteTracker tracker = this.poolEntry.getTracker();
            Asserts.notNull(tracker, "Route tracker");
            Asserts.check(!tracker.isConnected(), "Connection already open");
            OperatedClientConnection operatedClientConnection = (OperatedClientConnection) this.poolEntry.getConnection();
            HttpHost proxyHost = httpRoute.getProxyHost();
            this.operator.openConnection(operatedClientConnection, proxyHost != null ? proxyHost : httpRoute.getTargetHost(), httpRoute.getLocalAddress(), httpContext, httpParams);
            synchronized (this) {
                if (this.poolEntry == null) {
                    throw new InterruptedIOException();
                }
                RouteTracker tracker2 = this.poolEntry.getTracker();
                if (proxyHost == null) {
                    tracker2.connectTarget(operatedClientConnection.isSecure());
                } else {
                    tracker2.connectProxy(proxyHost, operatedClientConnection.isSecure());
                }
            }
        }
    }

    public void tunnelTarget(boolean z, HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        synchronized (this) {
            if (this.poolEntry == null) {
                throw new ConnectionShutdownException();
            }
            RouteTracker tracker = this.poolEntry.getTracker();
            Asserts.notNull(tracker, "Route tracker");
            Asserts.check(tracker.isConnected(), "Connection not open");
            Asserts.check(!tracker.isTunnelled(), "Connection is already tunnelled");
            HttpHost targetHost = tracker.getTargetHost();
            OperatedClientConnection operatedClientConnection = (OperatedClientConnection) this.poolEntry.getConnection();
            operatedClientConnection.update(null, targetHost, z, httpParams);
            synchronized (this) {
                if (this.poolEntry == null) {
                    throw new InterruptedIOException();
                }
                this.poolEntry.getTracker().tunnelTarget(z);
            }
        }
    }

    public void tunnelProxy(HttpHost httpHost, boolean z, HttpParams httpParams) {
        Args.notNull(httpHost, "Next proxy");
        Args.notNull(httpParams, "HTTP parameters");
        synchronized (this) {
            if (this.poolEntry == null) {
                throw new ConnectionShutdownException();
            }
            RouteTracker tracker = this.poolEntry.getTracker();
            Asserts.notNull(tracker, "Route tracker");
            Asserts.check(tracker.isConnected(), "Connection not open");
            OperatedClientConnection operatedClientConnection = (OperatedClientConnection) this.poolEntry.getConnection();
            operatedClientConnection.update(null, httpHost, z, httpParams);
            synchronized (this) {
                if (this.poolEntry == null) {
                    throw new InterruptedIOException();
                }
                this.poolEntry.getTracker().tunnelProxy(httpHost, z);
            }
        }
    }

    public void layerProtocol(HttpContext httpContext, HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        synchronized (this) {
            if (this.poolEntry == null) {
                throw new ConnectionShutdownException();
            }
            RouteTracker tracker = this.poolEntry.getTracker();
            Asserts.notNull(tracker, "Route tracker");
            Asserts.check(tracker.isConnected(), "Connection not open");
            Asserts.check(tracker.isTunnelled(), "Protocol layering without a tunnel not supported");
            Asserts.check(!tracker.isLayered(), "Multiple protocol layering not supported");
            HttpHost targetHost = tracker.getTargetHost();
            OperatedClientConnection operatedClientConnection = (OperatedClientConnection) this.poolEntry.getConnection();
            this.operator.updateSecureConnection(operatedClientConnection, targetHost, httpContext, httpParams);
            synchronized (this) {
                if (this.poolEntry == null) {
                    throw new InterruptedIOException();
                }
                this.poolEntry.getTracker().layerProtocol(operatedClientConnection.isSecure());
            }
        }
    }

    public Object getState() {
        return ensurePoolEntry().getState();
    }

    public void setState(Object obj) {
        ensurePoolEntry().setState(obj);
    }

    public void markReusable() {
        this.reusable = true;
    }

    public void unmarkReusable() {
        this.reusable = false;
    }

    public boolean isMarkedReusable() {
        return this.reusable;
    }

    public void setIdleDuration(long j, TimeUnit timeUnit) {
        if (j > 0) {
            this.duration = timeUnit.toMillis(j);
        } else {
            this.duration = -1;
        }
    }

    public void releaseConnection() {
        synchronized (this) {
            if (this.poolEntry == null) {
                return;
            }
            this.manager.releaseConnection(this, this.duration, TimeUnit.MILLISECONDS);
            this.poolEntry = null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:7|8|9|10|11|12|13|14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void abortConnection() {
        /*
            r6 = this;
            r4 = r6
            monitor-enter(r6)
            org.apache.http.impl.conn.HttpPoolEntry r0 = r6.poolEntry     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0008
            monitor-exit(r4)     // Catch:{ all -> 0x0026 }
            return
        L_0x0008:
            r0 = 0
            r6.reusable = r0     // Catch:{ all -> 0x0026 }
            org.apache.http.impl.conn.HttpPoolEntry r0 = r6.poolEntry     // Catch:{ all -> 0x0026 }
            java.lang.Object r0 = r0.getConnection()     // Catch:{ all -> 0x0026 }
            org.apache.http.conn.OperatedClientConnection r0 = (org.apache.http.conn.OperatedClientConnection) r0     // Catch:{ all -> 0x0026 }
            r5 = r0
            r5.shutdown()     // Catch:{ IOException -> 0x0018 }
        L_0x0018:
            org.apache.http.conn.ClientConnectionManager r0 = r6.manager     // Catch:{ all -> 0x0026 }
            long r1 = r6.duration     // Catch:{ all -> 0x0026 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0026 }
            r0.releaseConnection(r6, r1, r3)     // Catch:{ all -> 0x0026 }
            r0 = 0
            r6.poolEntry = r0     // Catch:{ all -> 0x0026 }
            monitor-exit(r4)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0026 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.ManagedClientConnectionImpl.abortConnection():void");
    }
}
