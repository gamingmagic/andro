package org.apache.http.impl;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import org.apache.http.HttpInetConnection;
import org.apache.http.impl.p006io.SocketInputBuffer;
import org.apache.http.impl.p006io.SocketOutputBuffer;
import org.apache.http.p007io.SessionInputBuffer;
import org.apache.http.p007io.SessionOutputBuffer;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Deprecated
public class SocketHttpServerConnection extends AbstractHttpServerConnection implements HttpInetConnection {
    private volatile boolean open;
    private volatile Socket socket = null;

    /* access modifiers changed from: protected */
    public void assertNotOpen() {
        Asserts.check(!this.open, "Connection is already open");
    }

    /* access modifiers changed from: protected */
    public void assertOpen() {
        Asserts.check(this.open, "Connection is not open");
    }

    /* access modifiers changed from: protected */
    public SessionInputBuffer createSessionInputBuffer(Socket socket2, int i, HttpParams httpParams) {
        return new SocketInputBuffer(socket2, i, httpParams);
    }

    /* access modifiers changed from: protected */
    public SessionOutputBuffer createSessionOutputBuffer(Socket socket2, int i, HttpParams httpParams) {
        return new SocketOutputBuffer(socket2, i, httpParams);
    }

    /* access modifiers changed from: protected */
    public void bind(Socket socket2, HttpParams httpParams) {
        Args.notNull(socket2, "Socket");
        Args.notNull(httpParams, "HTTP parameters");
        this.socket = socket2;
        int intParameter = httpParams.getIntParameter(CoreConnectionPNames.SOCKET_BUFFER_SIZE, -1);
        init(createSessionInputBuffer(socket2, intParameter, httpParams), createSessionOutputBuffer(socket2, intParameter, httpParams), httpParams);
        this.open = true;
    }

    /* access modifiers changed from: protected */
    public Socket getSocket() {
        return this.socket;
    }

    public boolean isOpen() {
        return this.open;
    }

    public InetAddress getLocalAddress() {
        if (this.socket != null) {
            return this.socket.getLocalAddress();
        }
        return null;
    }

    public int getLocalPort() {
        if (this.socket != null) {
            return this.socket.getLocalPort();
        }
        return -1;
    }

    public InetAddress getRemoteAddress() {
        if (this.socket != null) {
            return this.socket.getInetAddress();
        }
        return null;
    }

    public int getRemotePort() {
        if (this.socket != null) {
            return this.socket.getPort();
        }
        return -1;
    }

    public void setSocketTimeout(int i) {
        assertOpen();
        if (this.socket != null) {
            try {
                this.socket.setSoTimeout(i);
            } catch (SocketException unused) {
            }
        }
    }

    public int getSocketTimeout() {
        if (this.socket == null) {
            return -1;
        }
        try {
            return this.socket.getSoTimeout();
        } catch (SocketException unused) {
            return -1;
        }
    }

    public void shutdown() {
        this.open = false;
        Socket socket2 = this.socket;
        if (socket2 != null) {
            socket2.close();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:3|4|5|6|7|8|9|11|12) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r3 = this;
            boolean r0 = r3.open
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r3.open = r0
            r0 = 0
            r3.open = r0
            java.net.Socket r1 = r3.socket
            r3.doFlush()     // Catch:{ all -> 0x001d }
            r1.shutdownOutput()     // Catch:{ IOException -> 0x0014 }
        L_0x0014:
            r1.shutdownInput()     // Catch:{ IOException -> 0x0018 }
            goto L_0x0019
        L_0x0018:
        L_0x0019:
            r1.close()
            return
        L_0x001d:
            r2 = move-exception
            r1.close()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.SocketHttpServerConnection.close():void");
    }

    private static void formatAddress(StringBuilder sb, SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
            sb.append(inetSocketAddress.getAddress() != null ? inetSocketAddress.getAddress().getHostAddress() : inetSocketAddress.getAddress()).append(':').append(inetSocketAddress.getPort());
            return;
        }
        sb.append(socketAddress);
    }

    public String toString() {
        if (this.socket == null) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        SocketAddress remoteSocketAddress = this.socket.getRemoteSocketAddress();
        SocketAddress localSocketAddress = this.socket.getLocalSocketAddress();
        if (!(remoteSocketAddress == null || localSocketAddress == null)) {
            formatAddress(sb, localSocketAddress);
            sb.append("<->");
            formatAddress(sb, remoteSocketAddress);
        }
        return sb.toString();
    }
}
