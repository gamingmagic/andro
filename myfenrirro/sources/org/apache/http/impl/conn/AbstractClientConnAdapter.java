package org.apache.http.impl.conn;

import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.protocol.HttpContext;

@Deprecated
public abstract class AbstractClientConnAdapter implements ManagedClientConnection, HttpContext {
    private final ClientConnectionManager connManager;
    private volatile long duration = Long.MAX_VALUE;
    private volatile boolean markedReusable = false;
    private volatile boolean released = false;
    private volatile OperatedClientConnection wrappedConnection;

    protected AbstractClientConnAdapter(ClientConnectionManager clientConnectionManager, OperatedClientConnection operatedClientConnection) {
        this.connManager = clientConnectionManager;
        this.wrappedConnection = operatedClientConnection;
    }

    /* access modifiers changed from: protected */
    public synchronized void detach() {
        this.wrappedConnection = null;
        this.duration = Long.MAX_VALUE;
    }

    /* access modifiers changed from: protected */
    public OperatedClientConnection getWrappedConnection() {
        return this.wrappedConnection;
    }

    public ClientConnectionManager getManager() {
        return this.connManager;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public final void assertNotAborted() {
        if (isReleased()) {
            throw new InterruptedIOException("Connection has been shut down");
        }
    }

    /* access modifiers changed from: protected */
    public boolean isReleased() {
        return this.released;
    }

    /* access modifiers changed from: protected */
    public final void assertValid(OperatedClientConnection operatedClientConnection) {
        if (isReleased() || operatedClientConnection == null) {
            throw new ConnectionShutdownException();
        }
    }

    public boolean isOpen() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        if (wrappedConnection2 == null) {
            return false;
        }
        return wrappedConnection2.isOpen();
    }

    public boolean isStale() {
        if (isReleased()) {
            return true;
        }
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        if (wrappedConnection2 == null) {
            return true;
        }
        return wrappedConnection2.isStale();
    }

    public void setSocketTimeout(int i) {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        wrappedConnection2.setSocketTimeout(i);
    }

    public int getSocketTimeout() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        return wrappedConnection2.getSocketTimeout();
    }

    public HttpConnectionMetrics getMetrics() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        return wrappedConnection2.getMetrics();
    }

    public void flush() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        wrappedConnection2.flush();
    }

    public boolean isResponseAvailable(int i) {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        return wrappedConnection2.isResponseAvailable(i);
    }

    public void receiveResponseEntity(HttpResponse httpResponse) {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        unmarkReusable();
        wrappedConnection2.receiveResponseEntity(httpResponse);
    }

    public HttpResponse receiveResponseHeader() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        unmarkReusable();
        return wrappedConnection2.receiveResponseHeader();
    }

    public void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        unmarkReusable();
        wrappedConnection2.sendRequestEntity(httpEntityEnclosingRequest);
    }

    public void sendRequestHeader(HttpRequest httpRequest) {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        unmarkReusable();
        wrappedConnection2.sendRequestHeader(httpRequest);
    }

    public InetAddress getLocalAddress() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        return wrappedConnection2.getLocalAddress();
    }

    public int getLocalPort() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        return wrappedConnection2.getLocalPort();
    }

    public InetAddress getRemoteAddress() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        return wrappedConnection2.getRemoteAddress();
    }

    public int getRemotePort() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        return wrappedConnection2.getRemotePort();
    }

    public boolean isSecure() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        return wrappedConnection2.isSecure();
    }

    public void bind(Socket socket) {
        throw new UnsupportedOperationException();
    }

    public Socket getSocket() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        if (!isOpen()) {
            return null;
        }
        return wrappedConnection2.getSocket();
    }

    public SSLSession getSSLSession() {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        if (!isOpen()) {
            return null;
        }
        SSLSession sSLSession = null;
        Socket socket = wrappedConnection2.getSocket();
        if (socket instanceof SSLSocket) {
            sSLSession = ((SSLSocket) socket).getSession();
        }
        return sSLSession;
    }

    public void markReusable() {
        this.markedReusable = true;
    }

    public void unmarkReusable() {
        this.markedReusable = false;
    }

    public boolean isMarkedReusable() {
        return this.markedReusable;
    }

    public void setIdleDuration(long j, TimeUnit timeUnit) {
        if (j > 0) {
            this.duration = timeUnit.toMillis(j);
        } else {
            this.duration = -1;
        }
    }

    public synchronized void releaseConnection() {
        if (!this.released) {
            this.released = true;
            this.connManager.releaseConnection(this, this.duration, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:6|7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void abortConnection() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.released     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)     // Catch:{ all -> 0x001c }
            return
        L_0x0007:
            r0 = 1
            r5.released = r0     // Catch:{ all -> 0x001c }
            r5.unmarkReusable()     // Catch:{ all -> 0x001c }
            r5.shutdown()     // Catch:{ IOException -> 0x0011 }
        L_0x0011:
            org.apache.http.conn.ClientConnectionManager r0 = r5.connManager     // Catch:{ all -> 0x001c }
            long r1 = r5.duration     // Catch:{ all -> 0x001c }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x001c }
            r0.releaseConnection(r5, r1, r3)     // Catch:{ all -> 0x001c }
            monitor-exit(r5)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.AbstractClientConnAdapter.abortConnection():void");
    }

    public Object getAttribute(String str) {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        if (wrappedConnection2 instanceof HttpContext) {
            return ((HttpContext) wrappedConnection2).getAttribute(str);
        }
        return null;
    }

    public Object removeAttribute(String str) {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        if (wrappedConnection2 instanceof HttpContext) {
            return ((HttpContext) wrappedConnection2).removeAttribute(str);
        }
        return null;
    }

    public void setAttribute(String str, Object obj) {
        OperatedClientConnection wrappedConnection2 = getWrappedConnection();
        assertValid(wrappedConnection2);
        if (wrappedConnection2 instanceof HttpContext) {
            ((HttpContext) wrappedConnection2).setAttribute(str, obj);
        }
    }
}
