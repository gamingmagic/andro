package org.apache.http.impl;

import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpServerConnection;
import org.apache.http.config.MessageConstraints;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.entity.DisallowIdentityContentLengthStrategy;
import org.apache.http.impl.p006io.DefaultHttpRequestParserFactory;
import org.apache.http.impl.p006io.DefaultHttpResponseWriterFactory;
import org.apache.http.p007io.HttpMessageParser;
import org.apache.http.p007io.HttpMessageParserFactory;
import org.apache.http.p007io.HttpMessageWriter;
import org.apache.http.p007io.HttpMessageWriterFactory;
import org.apache.http.util.Args;

public class DefaultBHttpServerConnection extends BHttpConnectionBase implements HttpServerConnection {
    private final HttpMessageParser<HttpRequest> requestParser;
    private final HttpMessageWriter<HttpResponse> responseWriter;

    public DefaultBHttpServerConnection(int i, int i2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, MessageConstraints messageConstraints, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, HttpMessageParserFactory<HttpRequest> httpMessageParserFactory, HttpMessageWriterFactory<HttpResponse> httpMessageWriterFactory) {
        super(i, i2, charsetDecoder, charsetEncoder, messageConstraints, contentLengthStrategy != null ? contentLengthStrategy : DisallowIdentityContentLengthStrategy.INSTANCE, contentLengthStrategy2);
        this.requestParser = (httpMessageParserFactory != null ? httpMessageParserFactory : DefaultHttpRequestParserFactory.INSTANCE).create(getSessionInputBuffer(), messageConstraints);
        this.responseWriter = (httpMessageWriterFactory != null ? httpMessageWriterFactory : DefaultHttpResponseWriterFactory.INSTANCE).create(getSessionOutputBuffer());
    }

    public DefaultBHttpServerConnection(int i, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, MessageConstraints messageConstraints) {
        int i2 = i;
        this(i2, i2, charsetDecoder, charsetEncoder, messageConstraints, null, null, null, null);
    }

    public DefaultBHttpServerConnection(int i) {
        int i2 = i;
        this(i2, i2, null, null, null, null, null, null, null);
    }

    /* access modifiers changed from: protected */
    public void onRequestReceived(HttpRequest httpRequest) {
    }

    /* access modifiers changed from: protected */
    public void onResponseSubmitted(HttpResponse httpResponse) {
    }

    public void bind(Socket socket) {
        super.bind(socket);
    }

    public HttpRequest receiveRequestHeader() {
        ensureOpen();
        HttpRequest httpRequest = (HttpRequest) this.requestParser.parse();
        onRequestReceived(httpRequest);
        incrementRequestCount();
        return httpRequest;
    }

    public void receiveRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        Args.notNull(httpEntityEnclosingRequest, "HTTP request");
        ensureOpen();
        httpEntityEnclosingRequest.setEntity(prepareInput(httpEntityEnclosingRequest));
    }

    public void sendResponseHeader(HttpResponse httpResponse) {
        Args.notNull(httpResponse, "HTTP response");
        ensureOpen();
        this.responseWriter.write(httpResponse);
        onResponseSubmitted(httpResponse);
        if (httpResponse.getStatusLine().getStatusCode() >= 200) {
            incrementResponseCount();
        }
    }

    public void sendResponseEntity(HttpResponse httpResponse) {
        Args.notNull(httpResponse, "HTTP response");
        ensureOpen();
        HttpEntity entity = httpResponse.getEntity();
        if (entity != null) {
            OutputStream prepareOutput = prepareOutput(httpResponse);
            entity.writeTo(prepareOutput);
            prepareOutput.close();
        }
    }

    public void flush() {
        ensureOpen();
        doFlush();
    }
}
