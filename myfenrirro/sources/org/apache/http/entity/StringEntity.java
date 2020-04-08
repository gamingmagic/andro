package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;

public class StringEntity extends AbstractHttpEntity implements Cloneable {
    protected final byte[] content;

    public StringEntity(String str, ContentType contentType) {
        Args.notNull(str, "Source string");
        Charset charset = contentType != null ? contentType.getCharset() : null;
        if (charset == null) {
            charset = HTTP.DEF_CONTENT_CHARSET;
        }
        this.content = str.getBytes(charset);
        if (contentType != null) {
            setContentType(contentType.toString());
        }
    }

    @Deprecated
    public StringEntity(String str, String str2, String str3) {
        Args.notNull(str, "Source string");
        if (str2 == null) {
            str2 = HTTP.PLAIN_TEXT_TYPE;
        }
        if (str3 == null) {
            str3 = "ISO-8859-1";
        }
        this.content = str.getBytes(str3);
        setContentType(str2 + HTTP.CHARSET_PARAM + str3);
    }

    public StringEntity(String str, String str2) {
        this(str, ContentType.create(ContentType.TEXT_PLAIN.getMimeType(), str2));
    }

    public StringEntity(String str, Charset charset) {
        this(str, ContentType.create(ContentType.TEXT_PLAIN.getMimeType(), charset));
    }

    public StringEntity(String str) {
        this(str, ContentType.DEFAULT_TEXT);
    }

    public boolean isRepeatable() {
        return true;
    }

    public long getContentLength() {
        return (long) this.content.length;
    }

    public InputStream getContent() {
        return new ByteArrayInputStream(this.content);
    }

    public void writeTo(OutputStream outputStream) {
        Args.notNull(outputStream, "Output stream");
        outputStream.write(this.content);
        outputStream.flush();
    }

    public boolean isStreaming() {
        return false;
    }

    public Object clone() {
        return super.clone();
    }
}
