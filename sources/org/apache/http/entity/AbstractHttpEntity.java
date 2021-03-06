package org.apache.http.entity;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

public abstract class AbstractHttpEntity implements HttpEntity {
    protected static final int OUTPUT_BUFFER_SIZE = 4096;
    protected boolean chunked;
    protected Header contentEncoding;
    protected Header contentType;

    protected AbstractHttpEntity() {
    }

    public Header getContentType() {
        return this.contentType;
    }

    public Header getContentEncoding() {
        return this.contentEncoding;
    }

    public boolean isChunked() {
        return this.chunked;
    }

    public void setContentType(Header header) {
        this.contentType = header;
    }

    public void setContentType(String str) {
        BasicHeader basicHeader = null;
        if (str != null) {
            basicHeader = new BasicHeader("Content-Type", str);
        }
        setContentType((Header) basicHeader);
    }

    public void setContentEncoding(Header header) {
        this.contentEncoding = header;
    }

    public void setContentEncoding(String str) {
        BasicHeader basicHeader = null;
        if (str != null) {
            basicHeader = new BasicHeader("Content-Encoding", str);
        }
        setContentEncoding((Header) basicHeader);
    }

    public void setChunked(boolean z) {
        this.chunked = z;
    }

    @Deprecated
    public void consumeContent() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        if (this.contentType != null) {
            sb.append("Content-Type: ");
            sb.append(this.contentType.getValue());
            sb.append(',');
        }
        if (this.contentEncoding != null) {
            sb.append("Content-Encoding: ");
            sb.append(this.contentEncoding.getValue());
            sb.append(',');
        }
        long contentLength = getContentLength();
        long j = contentLength;
        if (contentLength >= 0) {
            sb.append("Content-Length: ");
            sb.append(j);
            sb.append(',');
        }
        sb.append("Chunked: ");
        sb.append(this.chunked);
        sb.append(']');
        return sb.toString();
    }
}
