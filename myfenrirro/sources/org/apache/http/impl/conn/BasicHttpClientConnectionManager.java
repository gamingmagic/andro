package org.apache.http.impl.conn;

import java.io.Closeable;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.Lookup;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.ConnectionRequest;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.HttpClientConnectionOperator;
import org.apache.http.conn.HttpConnectionFactory;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.LangUtils;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
public class BasicHttpClientConnectionManager implements Closeable, HttpClientConnectionManager {
    private ManagedHttpClientConnection conn;
    private ConnectionConfig connConfig;
    private final HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> connFactory;
    private final HttpClientConnectionOperator connectionOperator;
    private long expiry;
    private final AtomicBoolean isShutdown;
    private boolean leased;
    private final Log log;
    private HttpRoute route;
    private SocketConfig socketConfig;
    private Object state;
    private long updated;

    private static Registry<ConnectionSocketFactory> getDefaultRegistry() {
        return RegistryBuilder.create().register(HttpHost.DEFAULT_SCHEME_NAME, PlainConnectionSocketFactory.getSocketFactory()).register("https", SSLConnectionSocketFactory.getSocketFactory()).build();
    }

    public BasicHttpClientConnectionManager(Lookup<ConnectionSocketFactory> lookup, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory, SchemePortResolver schemePortResolver, DnsResolver dnsResolver) {
        this((HttpClientConnectionOperator) new DefaultHttpClientConnectionOperator(lookup, schemePortResolver, dnsResolver), httpConnectionFactory);
    }

    public BasicHttpClientConnectionManager(HttpClientConnectionOperator httpClientConnectionOperator, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory) {
        this.log = LogFactory.getLog(getClass());
        this.connectionOperator = (HttpClientConnectionOperator) Args.notNull(httpClientConnectionOperator, "Connection operator");
        this.connFactory = httpConnectionFactory != null ? httpConnectionFactory : ManagedHttpClientConnectionFactory.INSTANCE;
        this.expiry = Long.MAX_VALUE;
        this.socketConfig = SocketConfig.DEFAULT;
        this.connConfig = ConnectionConfig.DEFAULT;
        this.isShutdown = new AtomicBoolean(false);
    }

    public BasicHttpClientConnectionManager(Lookup<ConnectionSocketFactory> lookup, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory) {
        this(lookup, httpConnectionFactory, null, null);
    }

    public BasicHttpClientConnectionManager(Lookup<ConnectionSocketFactory> lookup) {
        this(lookup, null, null, null);
    }

    public BasicHttpClientConnectionManager() {
        this(getDefaultRegistry(), null, null, null);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    public void close() {
        if (this.isShutdown.compareAndSet(false, true)) {
            closeConnection();
        }
    }

    /* access modifiers changed from: 0000 */
    public HttpRoute getRoute() {
        return this.route;
    }

    /* access modifiers changed from: 0000 */
    public Object getState() {
        return this.state;
    }

    public synchronized SocketConfig getSocketConfig() {
        return this.socketConfig;
    }

    public synchronized void setSocketConfig(SocketConfig socketConfig2) {
        this.socketConfig = socketConfig2 != null ? socketConfig2 : SocketConfig.DEFAULT;
    }

    public synchronized ConnectionConfig getConnectionConfig() {
        return this.connConfig;
    }

    public synchronized void setConnectionConfig(ConnectionConfig connectionConfig) {
        this.connConfig = connectionConfig != null ? connectionConfig : ConnectionConfig.DEFAULT;
    }

    public final ConnectionRequest requestConnection(final HttpRoute httpRoute, final Object obj) {
        Args.notNull(httpRoute, "Route");
        return new ConnectionRequest() {
            public boolean cancel() {
                return false;
            }

            public HttpClientConnection get(long j, TimeUnit timeUnit) {
                return BasicHttpClientConnectionManager.this.getConnection(httpRoute, obj);
            }
        };
    }

    private synchronized void closeConnection() {
        if (this.conn != null) {
            this.log.debug("Closing connection");
            try {
                this.conn.close();
            } catch (IOException e) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug("I/O exception closing connection", e);
                }
            }
            this.conn = null;
        }
    }

    private void checkExpiry() {
        if (this.conn != null && System.currentTimeMillis() >= this.expiry) {
            if (this.log.isDebugEnabled()) {
                this.log.debug("Connection expired @ " + new Date(this.expiry));
            }
            closeConnection();
        }
    }

    /* access modifiers changed from: 0000 */
    public synchronized HttpClientConnection getConnection(HttpRoute httpRoute, Object obj) {
        Asserts.check(!this.isShutdown.get(), "Connection manager has been shut down");
        if (this.log.isDebugEnabled()) {
            this.log.debug("Get connection for route " + httpRoute);
        }
        Asserts.check(!this.leased, "Connection is still allocated");
        if (!LangUtils.equals((Object) this.route, (Object) httpRoute) || !LangUtils.equals(this.state, obj)) {
            closeConnection();
        }
        this.route = httpRoute;
        this.state = obj;
        checkExpiry();
        if (this.conn == null) {
            this.conn = (ManagedHttpClientConnection) this.connFactory.create(httpRoute, this.connConfig);
        }
        this.conn.setSocketTimeout(this.socketConfig.getSoTimeout());
        this.leased = true;
        return this.conn;
    }

    public synchronized void releaseConnection(HttpClientConnection httpClientConnection, Object obj, long j, TimeUnit timeUnit) {
        String str;
        Args.notNull(httpClientConnection, "Connection");
        Asserts.check(httpClientConnection == this.conn, "Connection not obtained from this manager");
        if (this.log.isDebugEnabled()) {
            this.log.debug("Releasing connection " + httpClientConnection);
        }
        if (!this.isShutdown.get()) {
            try {
                this.updated = System.currentTimeMillis();
                if (!this.conn.isOpen()) {
                    this.conn = null;
                    this.route = null;
                    this.conn = null;
                    this.expiry = Long.MAX_VALUE;
                } else {
                    this.state = obj;
                    this.conn.setSocketTimeout(0);
                    if (this.log.isDebugEnabled()) {
                        if (j > 0) {
                            str = "for " + j + " " + timeUnit;
                        } else {
                            str = "indefinitely";
                        }
                        this.log.debug("Connection can be kept alive " + str);
                    }
                    if (j > 0) {
                        this.expiry = this.updated + timeUnit.toMillis(j);
                    } else {
                        this.expiry = Long.MAX_VALUE;
                    }
                }
                this.leased = false;
            } catch (Throwable th) {
                this.leased = false;
                throw th;
            }
        }
    }

    public void connect(HttpClientConnection httpClientConnection, HttpRoute httpRoute, int i, HttpContext httpContext) {
        HttpHost httpHost;
        Args.notNull(httpClientConnection, "Connection");
        Args.notNull(httpRoute, "HTTP route");
        Asserts.check(httpClientConnection == this.conn, "Connection not obtained from this manager");
        if (httpRoute.getProxyHost() != null) {
            httpHost = httpRoute.getProxyHost();
        } else {
            httpHost = httpRoute.getTargetHost();
        }
        this.connectionOperator.connect(this.conn, httpHost, httpRoute.getLocalSocketAddress(), i, this.socketConfig, httpContext);
    }

    public void upgrade(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) {
        Args.notNull(httpClientConnection, "Connection");
        Args.notNull(httpRoute, "HTTP route");
        Asserts.check(httpClientConnection == this.conn, "Connection not obtained from this manager");
        this.connectionOperator.upgrade(this.conn, httpRoute.getTargetHost(), httpContext);
    }

    public void routeComplete(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void closeExpiredConnections() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.isShutdown     // Catch:{ all -> 0x0014 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r2)     // Catch:{ all -> 0x0014 }
            return
        L_0x000b:
            boolean r0 = r2.leased     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x0012
            r2.checkExpiry()     // Catch:{ all -> 0x0014 }
        L_0x0012:
            monitor-exit(r2)     // Catch:{ all -> 0x0014 }
            return
        L_0x0014:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.BasicHttpClientConnectionManager.closeExpiredConnections():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void closeIdleConnections(long r9, java.util.concurrent.TimeUnit r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "Time unit"
            org.apache.http.util.Args.notNull(r11, r0)     // Catch:{ all -> 0x0032 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.isShutdown     // Catch:{ all -> 0x0032 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0010
            monitor-exit(r8)     // Catch:{ all -> 0x0032 }
            return
        L_0x0010:
            boolean r0 = r8.leased     // Catch:{ all -> 0x0032 }
            if (r0 != 0) goto L_0x0030
            long r0 = r11.toMillis(r9)     // Catch:{ all -> 0x0032 }
            r4 = r0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0021
            r4 = 0
        L_0x0021:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0032 }
            long r6 = r0 - r4
            long r0 = r8.updated     // Catch:{ all -> 0x0032 }
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0030
            r8.closeConnection()     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r8)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.BasicHttpClientConnectionManager.closeIdleConnections(long, java.util.concurrent.TimeUnit):void");
    }

    public void shutdown() {
        close();
    }
}
