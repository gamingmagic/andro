package org.apache.http.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.entity.ContentType;
import org.apache.http.protocol.HTTP;

public final class EntityUtils {
    private static final int DEFAULT_BUFFER_SIZE = 4096;

    private EntityUtils() {
    }

    public static void consumeQuietly(HttpEntity httpEntity) {
        try {
            consume(httpEntity);
        } catch (IOException unused) {
        }
    }

    public static void consume(HttpEntity httpEntity) {
        if (httpEntity != null && httpEntity.isStreaming()) {
            InputStream content = httpEntity.getContent();
            if (content != null) {
                content.close();
            }
        }
    }

    public static void updateEntity(HttpResponse httpResponse, HttpEntity httpEntity) {
        Args.notNull(httpResponse, "Response");
        consume(httpResponse.getEntity());
        httpResponse.setEntity(httpEntity);
    }

    public static byte[] toByteArray(HttpEntity httpEntity) {
        Args.notNull(httpEntity, "Entity");
        InputStream content = httpEntity.getContent();
        if (content == null) {
            return null;
        }
        try {
            Args.check(httpEntity.getContentLength() <= 2147483647L, "HTTP entity too large to be buffered in memory");
            int contentLength = (int) httpEntity.getContentLength();
            if (contentLength < 0) {
                contentLength = 4096;
            }
            ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(contentLength);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = content.read(bArr);
                if (read == -1) {
                    return byteArrayBuffer.toByteArray();
                }
                byteArrayBuffer.append(bArr, 0, read);
            }
        } finally {
            content.close();
        }
    }

    @Deprecated
    public static String getContentCharSet(HttpEntity httpEntity) {
        Args.notNull(httpEntity, "Entity");
        if (httpEntity.getContentType() == null) {
            return null;
        }
        HeaderElement[] elements = httpEntity.getContentType().getElements();
        if (elements.length <= 0) {
            return null;
        }
        NameValuePair parameterByName = elements[0].getParameterByName("charset");
        if (parameterByName != null) {
            return parameterByName.getValue();
        }
        return null;
    }

    @Deprecated
    public static String getContentMimeType(HttpEntity httpEntity) {
        Args.notNull(httpEntity, "Entity");
        if (httpEntity.getContentType() == null) {
            return null;
        }
        HeaderElement[] elements = httpEntity.getContentType().getElements();
        if (elements.length > 0) {
            return elements[0].getName();
        }
        return null;
    }

    private static String toString(HttpEntity httpEntity, ContentType contentType) {
        InputStream content = httpEntity.getContent();
        if (content == null) {
            return null;
        }
        try {
            Args.check(httpEntity.getContentLength() <= 2147483647L, "HTTP entity too large to be buffered in memory");
            int contentLength = (int) httpEntity.getContentLength();
            if (contentLength < 0) {
                contentLength = 4096;
            }
            Charset charset = null;
            if (contentType != null) {
                charset = contentType.getCharset();
                if (charset == null) {
                    ContentType byMimeType = ContentType.getByMimeType(contentType.getMimeType());
                    charset = byMimeType != null ? byMimeType.getCharset() : null;
                }
            }
            if (charset == null) {
                charset = HTTP.DEF_CONTENT_CHARSET;
            }
            InputStreamReader inputStreamReader = new InputStreamReader(content, charset);
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(contentLength);
            char[] cArr = new char[1024];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    return charArrayBuffer.toString();
                }
                charArrayBuffer.append(cArr, 0, read);
            }
        } finally {
            content.close();
        }
    }

    public static String toString(HttpEntity httpEntity, Charset charset) {
        Args.notNull(httpEntity, "Entity");
        ContentType contentType = null;
        try {
            contentType = ContentType.get(httpEntity);
        } catch (UnsupportedCharsetException e) {
            if (charset == null) {
                throw new UnsupportedEncodingException(e.getMessage());
            }
        }
        if (contentType == null) {
            contentType = ContentType.DEFAULT_TEXT.withCharset(charset);
        } else if (contentType.getCharset() == null) {
            contentType = contentType.withCharset(charset);
        }
        return toString(httpEntity, contentType);
    }

    public static String toString(HttpEntity httpEntity, String str) {
        return toString(httpEntity, str != null ? Charset.forName(str) : null);
    }

    public static String toString(HttpEntity httpEntity) {
        Args.notNull(httpEntity, "Entity");
        return toString(httpEntity, ContentType.get(httpEntity));
    }
}
