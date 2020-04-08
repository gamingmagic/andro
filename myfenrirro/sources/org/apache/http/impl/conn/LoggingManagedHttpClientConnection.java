package org.apache.http.impl.conn;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.commons.logging.Log;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.config.MessageConstraints;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.p007io.HttpMessageParserFactory;
import org.apache.http.p007io.HttpMessageWriterFactory;

class LoggingManagedHttpClientConnection extends DefaultManagedHttpClientConnection {
    private final Log headerlog;
    private final Log log;
    private final Wire wire;

    public LoggingManagedHttpClientConnection(String str, Log log2, Log log3, Log log4, int i, int i2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, MessageConstraints messageConstraints, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, HttpMessageWriterFactory<HttpRequest> httpMessageWriterFactory, HttpMessageParserFactory<HttpResponse> httpMessageParserFactory) {
        super(str, i, i2, charsetDecoder, charsetEncoder, messageConstraints, contentLengthStrategy, contentLengthStrategy2, httpMessageWriterFactory, httpMessageParserFactory);
        this.log = log2;
        this.headerlog = log3;
        this.wire = new Wire(log4, str);
    }

    public void close() {
        if (super.isOpen()) {
            if (this.log.isDebugEnabled()) {
                this.log.debug(getId() + ": Close connection");
            }
            super.close();
        }
    }

    public void setSocketTimeout(int i) {
        if (this.log.isDebugEnabled()) {
            this.log.debug(getId() + ": set socket timeout to " + i);
        }
        super.setSocketTimeout(i);
    }

    public void shutdown() {
        if (this.log.isDebugEnabled()) {
            this.log.debug(getId() + ": Shutdown connection");
        }
        super.shutdown();
    }

    /* access modifiers changed from: protected */
    public InputStream getSocketInputStream(Socket socket) {
        InputStream socketInputStream = super.getSocketInputStream(socket);
        if (this.wire.enabled()) {
            return new LoggingInputStream(socketInputStream, this.wire);
        }
        return socketInputStream;
    }

    /* access modifiers changed from: protected */
    public OutputStream getSocketOutputStream(Socket socket) {
        OutputStream socketOutputStream = super.getSocketOutputStream(socket);
        if (this.wire.enabled()) {
            return new LoggingOutputStream(socketOutputStream, this.wire);
        }
        return socketOutputStream;
    }

    /* access modifiers changed from: protected */
    public void onResponseReceived(HttpResponse httpResponse) {
        if (httpResponse != null && this.headerlog.isDebugEnabled()) {
            this.headerlog.debug(getId() + " << " + httpResponse.getStatusLine().toString());
            for (Header obj : httpResponse.getAllHeaders()) {
                this.headerlog.debug(getId() + " << " + obj.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRequestSubmitted(HttpRequest httpRequest) {
        if (httpRequest != null && this.headerlog.isDebugEnabled()) {
            this.headerlog.debug(getId() + " >> " + httpRequest.getRequestLine().toString());
            for (Header obj : httpRequest.getAllHeaders()) {
                this.headerlog.debug(getId() + " >> " + obj.toString());
            }
        }
    }
}
