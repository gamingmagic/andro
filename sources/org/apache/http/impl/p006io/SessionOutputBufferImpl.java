package org.apache.http.impl.p006io;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import org.apache.http.p007io.BufferInfo;
import org.apache.http.p007io.HttpTransportMetrics;
import org.apache.http.p007io.SessionOutputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

/* renamed from: org.apache.http.impl.io.SessionOutputBufferImpl */
public class SessionOutputBufferImpl implements BufferInfo, SessionOutputBuffer {
    private static final byte[] CRLF = {13, 10};
    private ByteBuffer bbuf;
    private final ByteArrayBuffer buffer;
    private final CharsetEncoder encoder;
    private final int fragementSizeHint;
    private final HttpTransportMetricsImpl metrics;
    private OutputStream outstream;

    static {
    }

    public SessionOutputBufferImpl(HttpTransportMetricsImpl httpTransportMetricsImpl, int i, int i2, CharsetEncoder charsetEncoder) {
        Args.positive(i, "Buffer size");
        Args.notNull(httpTransportMetricsImpl, "HTTP transport metrcis");
        this.metrics = httpTransportMetricsImpl;
        this.buffer = new ByteArrayBuffer(i);
        this.fragementSizeHint = i2 >= 0 ? i2 : 0;
        this.encoder = charsetEncoder;
    }

    public SessionOutputBufferImpl(HttpTransportMetricsImpl httpTransportMetricsImpl, int i) {
        this(httpTransportMetricsImpl, i, i, null);
    }

    public void bind(OutputStream outputStream) {
        this.outstream = outputStream;
    }

    public boolean isBound() {
        return this.outstream != null;
    }

    public int capacity() {
        return this.buffer.capacity();
    }

    public int length() {
        return this.buffer.length();
    }

    public int available() {
        return capacity() - length();
    }

    private void streamWrite(byte[] bArr, int i, int i2) {
        Asserts.notNull(this.outstream, "Output stream");
        this.outstream.write(bArr, i, i2);
    }

    private void flushStream() {
        if (this.outstream != null) {
            this.outstream.flush();
        }
    }

    private void flushBuffer() {
        int length = this.buffer.length();
        if (length > 0) {
            streamWrite(this.buffer.buffer(), 0, length);
            this.buffer.clear();
            this.metrics.incrementBytesTransferred((long) length);
        }
    }

    public void flush() {
        flushBuffer();
        flushStream();
    }

    public void write(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i2 > this.fragementSizeHint || i2 > this.buffer.capacity()) {
                flushBuffer();
                streamWrite(bArr, i, i2);
                this.metrics.incrementBytesTransferred((long) i2);
                return;
            }
            if (i2 > this.buffer.capacity() - this.buffer.length()) {
                flushBuffer();
            }
            this.buffer.append(bArr, i, i2);
        }
    }

    public void write(byte[] bArr) {
        if (bArr != null) {
            write(bArr, 0, bArr.length);
        }
    }

    public void write(int i) {
        if (this.fragementSizeHint > 0) {
            if (this.buffer.isFull()) {
                flushBuffer();
            }
            this.buffer.append(i);
            return;
        }
        flushBuffer();
        this.outstream.write(i);
    }

    public void writeLine(String str) {
        if (str != null) {
            if (str.length() > 0) {
                if (this.encoder == null) {
                    for (int i = 0; i < str.length(); i++) {
                        write((int) str.charAt(i));
                    }
                } else {
                    writeEncoded(CharBuffer.wrap(str));
                }
            }
            write(CRLF);
        }
    }

    public void writeLine(CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer != null) {
            if (this.encoder == null) {
                int i = 0;
                int length = charArrayBuffer.length();
                while (length > 0) {
                    int min = Math.min(this.buffer.capacity() - this.buffer.length(), length);
                    if (min > 0) {
                        this.buffer.append(charArrayBuffer, i, min);
                    }
                    if (this.buffer.isFull()) {
                        flushBuffer();
                    }
                    i += min;
                    length -= min;
                }
            } else {
                writeEncoded(CharBuffer.wrap(charArrayBuffer.buffer(), 0, charArrayBuffer.length()));
            }
            write(CRLF);
        }
    }

    private void writeEncoded(CharBuffer charBuffer) {
        if (charBuffer.hasRemaining()) {
            if (this.bbuf == null) {
                this.bbuf = ByteBuffer.allocate(1024);
            }
            this.encoder.reset();
            while (charBuffer.hasRemaining()) {
                handleEncodingResult(this.encoder.encode(charBuffer, this.bbuf, true));
            }
            handleEncodingResult(this.encoder.flush(this.bbuf));
            this.bbuf.clear();
        }
    }

    private void handleEncodingResult(CoderResult coderResult) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.bbuf.flip();
        while (this.bbuf.hasRemaining()) {
            write((int) this.bbuf.get());
        }
        this.bbuf.compact();
    }

    public HttpTransportMetrics getMetrics() {
        return this.metrics;
    }
}
