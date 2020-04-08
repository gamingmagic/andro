package org.apache.http.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.ConnectionClosedException;
import org.apache.http.Header;
import org.apache.http.HttpConnection;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntity;
import org.apache.http.HttpInetConnection;
import org.apache.http.HttpMessage;
import org.apache.http.config.MessageConstraints;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.entity.LaxContentLengthStrategy;
import org.apache.http.impl.entity.StrictContentLengthStrategy;
import org.apache.http.impl.p006io.ChunkedInputStream;
import org.apache.http.impl.p006io.ChunkedOutputStream;
import org.apache.http.impl.p006io.ContentLengthInputStream;
import org.apache.http.impl.p006io.ContentLengthOutputStream;
import org.apache.http.impl.p006io.EmptyInputStream;
import org.apache.http.impl.p006io.HttpTransportMetricsImpl;
import org.apache.http.impl.p006io.IdentityInputStream;
import org.apache.http.impl.p006io.IdentityOutputStream;
import org.apache.http.impl.p006io.SessionInputBufferImpl;
import org.apache.http.impl.p006io.SessionOutputBufferImpl;
import org.apache.http.p007io.SessionInputBuffer;
import org.apache.http.p007io.SessionOutputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.NetUtils;

public class BHttpConnectionBase implements HttpConnection, HttpInetConnection {
    private final HttpConnectionMetricsImpl connMetrics;
    private final SessionInputBufferImpl inbuffer;
    private final ContentLengthStrategy incomingContentStrategy;
    private final MessageConstraints messageConstraints;
    private final SessionOutputBufferImpl outbuffer;
    private final ContentLengthStrategy outgoingContentStrategy;
    private final AtomicReference<Socket> socketHolder;

    protected BHttpConnectionBase(int i, int i2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, MessageConstraints messageConstraints2, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2) {
        Args.positive(i, "Buffer size");
        HttpTransportMetricsImpl httpTransportMetricsImpl = new HttpTransportMetricsImpl();
        HttpTransportMetricsImpl httpTransportMetricsImpl2 = new HttpTransportMetricsImpl();
        this.inbuffer = new SessionInputBufferImpl(httpTransportMetricsImpl, i, -1, messageConstraints2 != null ? messageConstraints2 : MessageConstraints.DEFAULT, charsetDecoder);
        this.outbuffer = new SessionOutputBufferImpl(httpTransportMetricsImpl2, i, i2, charsetEncoder);
        this.messageConstraints = messageConstraints2;
        this.connMetrics = new HttpConnectionMetricsImpl(httpTransportMetricsImpl, httpTransportMetricsImpl2);
        this.incomingContentStrategy = contentLengthStrategy != null ? contentLengthStrategy : LaxContentLengthStrategy.INSTANCE;
        this.outgoingContentStrategy = contentLengthStrategy2 != null ? contentLengthStrategy2 : StrictContentLengthStrategy.INSTANCE;
        this.socketHolder = new AtomicReference<>();
    }

    /* access modifiers changed from: protected */
    public void ensureOpen() {
        Socket socket = (Socket) this.socketHolder.get();
        if (socket == null) {
            throw new ConnectionClosedException("Connection is closed");
        }
        if (!this.inbuffer.isBound()) {
            this.inbuffer.bind(getSocketInputStream(socket));
        }
        if (!this.outbuffer.isBound()) {
            this.outbuffer.bind(getSocketOutputStream(socket));
        }
    }

    public InputStream getSocketInputStream(Socket socket) {
        return socket.getInputStream();
    }

    public OutputStream getSocketOutputStream(Socket socket) {
        return socket.getOutputStream();
    }

    /* access modifiers changed from: protected */
    public void bind(Socket socket) {
        Args.notNull(socket, "Socket");
        this.socketHolder.set(socket);
        this.inbuffer.bind(null);
        this.outbuffer.bind(null);
    }

    /* access modifiers changed from: protected */
    public SessionInputBuffer getSessionInputBuffer() {
        return this.inbuffer;
    }

    /* access modifiers changed from: protected */
    public SessionOutputBuffer getSessionOutputBuffer() {
        return this.outbuffer;
    }

    /* access modifiers changed from: protected */
    public void doFlush() {
        this.outbuffer.flush();
    }

    public boolean isOpen() {
        return this.socketHolder.get() != null;
    }

    public Socket getSocket() {
        return (Socket) this.socketHolder.get();
    }

    /* access modifiers changed from: protected */
    public OutputStream createOutputStream(long j, SessionOutputBuffer sessionOutputBuffer) {
        if (j == -2) {
            return new ChunkedOutputStream(2048, sessionOutputBuffer);
        }
        if (j == -1) {
            return new IdentityOutputStream(sessionOutputBuffer);
        }
        return new ContentLengthOutputStream(sessionOutputBuffer, j);
    }

    /* access modifiers changed from: protected */
    public OutputStream prepareOutput(HttpMessage httpMessage) {
        return createOutputStream(this.outgoingContentStrategy.determineLength(httpMessage), this.outbuffer);
    }

    /* access modifiers changed from: protected */
    public InputStream createInputStream(long j, SessionInputBuffer sessionInputBuffer) {
        if (j == -2) {
            return new ChunkedInputStream(sessionInputBuffer, this.messageConstraints);
        }
        if (j == -1) {
            return new IdentityInputStream(sessionInputBuffer);
        }
        if (j == 0) {
            return EmptyInputStream.INSTANCE;
        }
        return new ContentLengthInputStream(sessionInputBuffer, j);
    }

    /* access modifiers changed from: protected */
    public HttpEntity prepareInput(HttpMessage httpMessage) {
        BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
        long determineLength = this.incomingContentStrategy.determineLength(httpMessage);
        InputStream createInputStream = createInputStream(determineLength, this.inbuffer);
        if (determineLength == -2) {
            basicHttpEntity.setChunked(true);
            basicHttpEntity.setContentLength(-1);
            basicHttpEntity.setContent(createInputStream);
        } else if (determineLength == -1) {
            basicHttpEntity.setChunked(false);
            basicHttpEntity.setContentLength(-1);
            basicHttpEntity.setContent(createInputStream);
        } else {
            basicHttpEntity.setChunked(false);
            basicHttpEntity.setContentLength(determineLength);
            basicHttpEntity.setContent(createInputStream);
        }
        Header firstHeader = httpMessage.getFirstHeader("Content-Type");
        if (firstHeader != null) {
            basicHttpEntity.setContentType(firstHeader);
        }
        Header firstHeader2 = httpMessage.getFirstHeader("Content-Encoding");
        if (firstHeader2 != null) {
            basicHttpEntity.setContentEncoding(firstHeader2);
        }
        return basicHttpEntity;
    }

    public InetAddress getLocalAddress() {
        Socket socket = (Socket) this.socketHolder.get();
        if (socket != null) {
            return socket.getLocalAddress();
        }
        return null;
    }

    public int getLocalPort() {
        Socket socket = (Socket) this.socketHolder.get();
        if (socket != null) {
            return socket.getLocalPort();
        }
        return -1;
    }

    public InetAddress getRemoteAddress() {
        Socket socket = (Socket) this.socketHolder.get();
        if (socket != null) {
            return socket.getInetAddress();
        }
        return null;
    }

    public int getRemotePort() {
        Socket socket = (Socket) this.socketHolder.get();
        if (socket != null) {
            return socket.getPort();
        }
        return -1;
    }

    public void setSocketTimeout(int i) {
        Socket socket = (Socket) this.socketHolder.get();
        if (socket != null) {
            try {
                socket.setSoTimeout(i);
            } catch (SocketException unused) {
            }
        }
    }

    public int getSocketTimeout() {
        Socket socket = (Socket) this.socketHolder.get();
        if (socket == null) {
            return -1;
        }
        try {
            return socket.getSoTimeout();
        } catch (SocketException unused) {
            return -1;
        }
    }

    public void shutdown() {
        Socket socket = (Socket) this.socketHolder.getAndSet(null);
        if (socket != null) {
            try {
                socket.setSoLinger(true, 0);
            } catch (IOException unused) {
            } finally {
                socket.close();
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x001a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicReference<java.net.Socket> r0 = r4.socketHolder
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            java.net.Socket r0 = (java.net.Socket) r0
            r2 = r0
            if (r2 == 0) goto L_0x0028
            org.apache.http.impl.io.SessionInputBufferImpl r0 = r4.inbuffer     // Catch:{ all -> 0x0023 }
            r0.clear()     // Catch:{ all -> 0x0023 }
            org.apache.http.impl.io.SessionOutputBufferImpl r0 = r4.outbuffer     // Catch:{ all -> 0x0023 }
            r0.flush()     // Catch:{ all -> 0x0023 }
            r2.shutdownOutput()     // Catch:{ IOException -> 0x001a }
        L_0x001a:
            r2.shutdownInput()     // Catch:{ IOException -> 0x001e }
            goto L_0x001f
        L_0x001e:
        L_0x001f:
            r2.close()
            return
        L_0x0023:
            r3 = move-exception
            r2.close()
            throw r3
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.BHttpConnectionBase.close():void");
    }

    private int fillInputBuffer(int i) {
        Socket socket = (Socket) this.socketHolder.get();
        int soTimeout = socket.getSoTimeout();
        try {
            socket.setSoTimeout(i);
            return this.inbuffer.fillBuffer();
        } finally {
            socket.setSoTimeout(soTimeout);
        }
    }

    /* access modifiers changed from: protected */
    public boolean awaitInput(int i) {
        if (this.inbuffer.hasBufferedData()) {
            return true;
        }
        fillInputBuffer(i);
        return this.inbuffer.hasBufferedData();
    }

    public boolean isStale() {
        if (!isOpen()) {
            return true;
        }
        try {
            return fillInputBuffer(1) < 0;
        } catch (SocketTimeoutException unused) {
            return false;
        } catch (IOException unused2) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void incrementRequestCount() {
        this.connMetrics.incrementRequestCount();
    }

    /* access modifiers changed from: protected */
    public void incrementResponseCount() {
        this.connMetrics.incrementResponseCount();
    }

    public HttpConnectionMetrics getMetrics() {
        return this.connMetrics;
    }

    public String toString() {
        Socket socket = (Socket) this.socketHolder.get();
        if (socket == null) {
            return "[Not bound]";
        }
        StringBuilder sb = new StringBuilder();
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        SocketAddress localSocketAddress = socket.getLocalSocketAddress();
        if (!(remoteSocketAddress == null || localSocketAddress == null)) {
            NetUtils.formatAddress(sb, localSocketAddress);
            sb.append("<->");
            NetUtils.formatAddress(sb, remoteSocketAddress);
        }
        return sb.toString();
    }
}
