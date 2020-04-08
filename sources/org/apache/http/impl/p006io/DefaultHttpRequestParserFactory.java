package org.apache.http.impl.p006io;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.config.MessageConstraints;
import org.apache.http.impl.DefaultHttpRequestFactory;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.LineParser;
import org.apache.http.p007io.HttpMessageParser;
import org.apache.http.p007io.HttpMessageParserFactory;
import org.apache.http.p007io.SessionInputBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* renamed from: org.apache.http.impl.io.DefaultHttpRequestParserFactory */
public class DefaultHttpRequestParserFactory implements HttpMessageParserFactory<HttpRequest> {
    public static final DefaultHttpRequestParserFactory INSTANCE = new DefaultHttpRequestParserFactory();
    private final LineParser lineParser;
    private final HttpRequestFactory requestFactory;

    static {
    }

    public DefaultHttpRequestParserFactory(LineParser lineParser2, HttpRequestFactory httpRequestFactory) {
        this.lineParser = lineParser2 != null ? lineParser2 : BasicLineParser.INSTANCE;
        this.requestFactory = httpRequestFactory != null ? httpRequestFactory : DefaultHttpRequestFactory.INSTANCE;
    }

    public DefaultHttpRequestParserFactory() {
        this(null, null);
    }

    public HttpMessageParser<HttpRequest> create(SessionInputBuffer sessionInputBuffer, MessageConstraints messageConstraints) {
        return new DefaultHttpRequestParser(sessionInputBuffer, this.lineParser, this.requestFactory, messageConstraints);
    }
}
