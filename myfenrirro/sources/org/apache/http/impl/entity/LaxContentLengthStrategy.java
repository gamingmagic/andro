package org.apache.http.impl.entity;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpMessage;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
public class LaxContentLengthStrategy implements ContentLengthStrategy {
    public static final LaxContentLengthStrategy INSTANCE = new LaxContentLengthStrategy();
    private final int implicitLen;

    static {
    }

    public LaxContentLengthStrategy(int i) {
        this.implicitLen = i;
    }

    public LaxContentLengthStrategy() {
        this(-1);
    }

    public long determineLength(HttpMessage httpMessage) {
        Args.notNull(httpMessage, "HTTP message");
        Header firstHeader = httpMessage.getFirstHeader("Transfer-Encoding");
        if (firstHeader != null) {
            try {
                HeaderElement[] elements = firstHeader.getElements();
                int length = elements.length;
                if (HTTP.IDENTITY_CODING.equalsIgnoreCase(firstHeader.getValue())) {
                    return -1;
                }
                if (length <= 0 || !HTTP.CHUNK_CODING.equalsIgnoreCase(elements[length - 1].getName())) {
                    return -1;
                }
                return -2;
            } catch (ParseException e) {
                throw new ProtocolException("Invalid Transfer-Encoding header value: " + firstHeader, e);
            }
        } else if (httpMessage.getFirstHeader("Content-Length") == null) {
            return (long) this.implicitLen;
        } else {
            long j = -1;
            Header[] headers = httpMessage.getHeaders("Content-Length");
            int length2 = headers.length - 1;
            while (length2 >= 0) {
                try {
                    j = Long.parseLong(headers[length2].getValue());
                    break;
                } catch (NumberFormatException unused) {
                    length2--;
                }
            }
            if (j >= 0) {
                return j;
            }
            return -1;
        }
    }
}
