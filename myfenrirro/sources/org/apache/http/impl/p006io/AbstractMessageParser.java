package org.apache.http.impl.p006io;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.MessageConstraintException;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.config.MessageConstraints;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.LineParser;
import org.apache.http.message.TokenParser;
import org.apache.http.p007io.HttpMessageParser;
import org.apache.http.p007io.SessionInputBuffer;
import org.apache.http.params.HttpParamConfig;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

/* renamed from: org.apache.http.impl.io.AbstractMessageParser */
public abstract class AbstractMessageParser<T extends HttpMessage> implements HttpMessageParser<T> {
    private static final int HEADERS = 1;
    private static final int HEAD_LINE = 0;
    private final List<CharArrayBuffer> headerLines;
    protected final LineParser lineParser;
    private T message;
    private final MessageConstraints messageConstraints;
    private final SessionInputBuffer sessionBuffer;
    private int state;

    /* access modifiers changed from: protected */
    public abstract T parseHead(SessionInputBuffer sessionInputBuffer);

    @Deprecated
    public AbstractMessageParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser2, HttpParams httpParams) {
        Args.notNull(sessionInputBuffer, "Session input buffer");
        Args.notNull(httpParams, "HTTP parameters");
        this.sessionBuffer = sessionInputBuffer;
        this.messageConstraints = HttpParamConfig.getMessageConstraints(httpParams);
        this.lineParser = lineParser2 != null ? lineParser2 : BasicLineParser.INSTANCE;
        this.headerLines = new ArrayList();
        this.state = 0;
    }

    public AbstractMessageParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser2, MessageConstraints messageConstraints2) {
        this.sessionBuffer = (SessionInputBuffer) Args.notNull(sessionInputBuffer, "Session input buffer");
        this.lineParser = lineParser2 != null ? lineParser2 : BasicLineParser.INSTANCE;
        this.messageConstraints = messageConstraints2 != null ? messageConstraints2 : MessageConstraints.DEFAULT;
        this.headerLines = new ArrayList();
        this.state = 0;
    }

    public static Header[] parseHeaders(SessionInputBuffer sessionInputBuffer, int i, int i2, LineParser lineParser2) {
        return parseHeaders(sessionInputBuffer, i, i2, lineParser2 != null ? lineParser2 : BasicLineParser.INSTANCE, new ArrayList());
    }

    public static Header[] parseHeaders(SessionInputBuffer sessionInputBuffer, int i, int i2, LineParser lineParser2, List<CharArrayBuffer> list) {
        Args.notNull(sessionInputBuffer, "Session input buffer");
        Args.notNull(lineParser2, "Line parser");
        Args.notNull(list, "Header line list");
        CharArrayBuffer charArrayBuffer = null;
        CharArrayBuffer charArrayBuffer2 = null;
        while (true) {
            if (charArrayBuffer == null) {
                charArrayBuffer = new CharArrayBuffer(64);
            } else {
                charArrayBuffer.clear();
            }
            if (sessionInputBuffer.readLine(charArrayBuffer) == -1 || charArrayBuffer.length() <= 0) {
                Header[] headerArr = new Header[list.size()];
                int i3 = 0;
            } else {
                if ((charArrayBuffer.charAt(0) == ' ' || charArrayBuffer.charAt(0) == 9) && charArrayBuffer2 != null) {
                    int i4 = 0;
                    while (i4 < charArrayBuffer.length()) {
                        char charAt = charArrayBuffer.charAt(i4);
                        if (charAt != ' ' && charAt != 9) {
                            break;
                        }
                        i4++;
                    }
                    if (i2 <= 0 || ((charArrayBuffer2.length() + 1) + charArrayBuffer.length()) - i4 <= i2) {
                        charArrayBuffer2.append((char) TokenParser.f9030SP);
                        charArrayBuffer2.append(charArrayBuffer, i4, charArrayBuffer.length() - i4);
                    } else {
                        throw new MessageConstraintException("Maximum line length limit exceeded");
                    }
                } else {
                    list.add(charArrayBuffer);
                    charArrayBuffer2 = charArrayBuffer;
                    charArrayBuffer = null;
                }
                if (i > 0 && list.size() >= i) {
                    throw new MessageConstraintException("Maximum header count exceeded");
                }
            }
        }
        Header[] headerArr2 = new Header[list.size()];
        int i32 = 0;
        while (i32 < list.size()) {
            try {
                headerArr2[i32] = lineParser2.parseHeader((CharArrayBuffer) list.get(i32));
                i32++;
            } catch (ParseException e) {
                throw new ProtocolException(e.getMessage());
            }
        }
        return headerArr2;
    }

    public T parse() {
        switch (this.state) {
            case 0:
                try {
                    this.message = parseHead(this.sessionBuffer);
                    this.state = 1;
                    break;
                } catch (ParseException e) {
                    throw new ProtocolException(e.getMessage(), e);
                }
            case 1:
                break;
            default:
                throw new IllegalStateException("Inconsistent parser state");
        }
        this.message.setHeaders(parseHeaders(this.sessionBuffer, this.messageConstraints.getMaxHeaderCount(), this.messageConstraints.getMaxLineLength(), this.lineParser, this.headerLines));
        T t = this.message;
        this.message = null;
        this.headerLines.clear();
        this.state = 0;
        return t;
    }
}
