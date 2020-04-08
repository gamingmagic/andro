package org.apache.http.impl;

import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.config.MessageConstraints;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.p006io.DefaultHttpRequestWriterFactory;
import org.apache.http.impl.p006io.DefaultHttpResponseParserFactory;
import org.apache.http.p007io.HttpMessageParser;
import org.apache.http.p007io.HttpMessageParserFactory;
import org.apache.http.p007io.HttpMessageWriter;
import org.apache.http.p007io.HttpMessageWriterFactory;
import org.apache.http.util.Args;

public class DefaultBHttpClientConnection extends BHttpConnectionBase implements HttpClientConnection {
    private final HttpMessageWriter<HttpRequest> requestWriter;
    private final HttpMessageParser<HttpResponse> responseParser;

    public DefaultBHttpClientConnection(int i, int i2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, MessageConstraints messageConstraints, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, HttpMessageWriterFactory<HttpRequest> httpMessageWriterFactory, HttpMessageParserFactory<HttpResponse> httpMessageParserFactory) {
        super(i, i2, charsetDecoder, charsetEncoder, messageConstraints, contentLengthStrategy, contentLengthStrategy2);
        this.requestWriter = (httpMessageWriterFactory != null ? httpMessageWriterFactory : DefaultHttpRequestWriterFactory.INSTANCE).create(getSessionOutputBuffer());
        this.responseParser = (httpMessageParserFactory != null ? httpMessageParserFactory : DefaultHttpResponseParserFactory.INSTANCE).create(getSessionInputBuffer(), messageConstraints);
    }

    public DefaultBHttpClientConnection(int i, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, MessageConstraints messageConstraints) {
        int i2 = i;
        this(i2, i2, charsetDecoder, charsetEncoder, messageConstraints, null, null, null, null);
    }

    public DefaultBHttpClientConnection(int i) {
        int i2 = i;
        this(i2, i2, null, null, null, null, null, null, null);
    }

    /* access modifiers changed from: protected */
    public void onResponseReceived(HttpResponse httpResponse) {
    }

    /* access modifiers changed from: protected */
    public void onRequestSubmitted(HttpRequest httpRequest) {
    }

    public void bind(Socket socket) {
        super.bind(socket);
    }

    public boolean isResponseAvailable(int i) {
        ensureOpen();
        try {
            return awaitInput(i);
        } catch (SocketTimeoutException unused) {
            return false;
        }
    }

    public void sendRequestHeader(HttpRequest httpRequest) {
        Args.notNull(httpRequest, "HTTP request");
        ensureOpen();
        this.requestWriter.write(httpRequest);
        onRequestSubmitted(httpRequest);
        incrementRequestCount();
    }

    public void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        Args.notNull(httpEntityEnclosingRequest, "HTTP request");
        ensureOpen();
        HttpEntity entity = httpEntityEnclosingRequest.getEntity();
        if (entity != null) {
            OutputStream prepareOutput = prepareOutput(httpEntityEnclosingRequest);
            entity.writeTo(prepareOutput);
            prepareOutput.close();
        }
    }

    public HttpResponse receiveResponseHeader() {
        ensureOpen();
        HttpResponse httpResponse = (HttpResponse) this.responseParser.parse();
        onResponseReceived(httpResponse);
        if (httpResponse.getStatusLine().getStatusCode() >= 200) {
            incrementResponseCount();
        }
        return httpResponse;
    }

    public void receiveResponseEntity(HttpResponse httpResponse) {
        Args.notNull(httpResponse, "HTTP response");
        ensureOpen();
        httpResponse.setEntity(prepareInput(httpResponse));
    }

    public void flush() {
        ensureOpen();
        doFlush();
    }
}
