package org.apache.http.impl.p006io;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.apache.http.Consts;
import org.apache.http.p007io.BufferInfo;
import org.apache.http.p007io.HttpTransportMetrics;
import org.apache.http.p007io.SessionInputBuffer;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* renamed from: org.apache.http.impl.io.AbstractSessionInputBuffer */
public abstract class AbstractSessionInputBuffer implements BufferInfo, SessionInputBuffer {
    private boolean ascii;
    private byte[] buffer;
    private int bufferlen;
    private int bufferpos;
    private CharBuffer cbuf;
    private Charset charset;
    private CharsetDecoder decoder;
    private InputStream instream;
    private ByteArrayBuffer linebuffer;
    private int maxLineLen;
    private HttpTransportMetricsImpl metrics;
    private int minChunkLimit;
    private CodingErrorAction onMalformedCharAction;
    private CodingErrorAction onUnmappableCharAction;

    /* access modifiers changed from: protected */
    public void init(InputStream inputStream, int i, HttpParams httpParams) {
        Args.notNull(inputStream, "Input stream");
        Args.notNegative(i, "Buffer size");
        Args.notNull(httpParams, "HTTP parameters");
        this.instream = inputStream;
        this.buffer = new byte[i];
        this.bufferpos = 0;
        this.bufferlen = 0;
        this.linebuffer = new ByteArrayBuffer(i);
        String str = (String) httpParams.getParameter(CoreProtocolPNames.HTTP_ELEMENT_CHARSET);
        this.charset = str != null ? Charset.forName(str) : Consts.ASCII;
        this.ascii = this.charset.equals(Consts.ASCII);
        this.decoder = null;
        this.maxLineLen = httpParams.getIntParameter(CoreConnectionPNames.MAX_LINE_LENGTH, -1);
        this.minChunkLimit = httpParams.getIntParameter(CoreConnectionPNames.MIN_CHUNK_LIMIT, 512);
        this.metrics = createTransportMetrics();
        CodingErrorAction codingErrorAction = (CodingErrorAction) httpParams.getParameter(CoreProtocolPNames.HTTP_MALFORMED_INPUT_ACTION);
        this.onMalformedCharAction = codingErrorAction != null ? codingErrorAction : CodingErrorAction.REPORT;
        CodingErrorAction codingErrorAction2 = (CodingErrorAction) httpParams.getParameter(CoreProtocolPNames.HTTP_UNMAPPABLE_INPUT_ACTION);
        this.onUnmappableCharAction = codingErrorAction2 != null ? codingErrorAction2 : CodingErrorAction.REPORT;
    }

    /* access modifiers changed from: protected */
    public HttpTransportMetricsImpl createTransportMetrics() {
        return new HttpTransportMetricsImpl();
    }

    public int capacity() {
        return this.buffer.length;
    }

    public int length() {
        return this.bufferlen - this.bufferpos;
    }

    public int available() {
        return capacity() - length();
    }

    /* access modifiers changed from: protected */
    public int fillBuffer() {
        if (this.bufferpos > 0) {
            int i = this.bufferlen - this.bufferpos;
            if (i > 0) {
                System.arraycopy(this.buffer, this.bufferpos, this.buffer, 0, i);
            }
            this.bufferpos = 0;
            this.bufferlen = i;
        }
        int i2 = this.bufferlen;
        int read = this.instream.read(this.buffer, i2, this.buffer.length - i2);
        if (read == -1) {
            return -1;
        }
        this.bufferlen = i2 + read;
        this.metrics.incrementBytesTransferred((long) read);
        return read;
    }

    /* access modifiers changed from: protected */
    public boolean hasBufferedData() {
        return this.bufferpos < this.bufferlen;
    }

    public int read() {
        while (!hasBufferedData()) {
            if (fillBuffer() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.buffer;
        int i = this.bufferpos;
        this.bufferpos = i + 1;
        return bArr[i] & 255;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return 0;
        }
        if (hasBufferedData()) {
            int min = Math.min(i2, this.bufferlen - this.bufferpos);
            System.arraycopy(this.buffer, this.bufferpos, bArr, i, min);
            this.bufferpos += min;
            return min;
        } else if (i2 > this.minChunkLimit) {
            int read = this.instream.read(bArr, i, i2);
            if (read > 0) {
                this.metrics.incrementBytesTransferred((long) read);
            }
            return read;
        } else {
            while (!hasBufferedData()) {
                if (fillBuffer() == -1) {
                    return -1;
                }
            }
            int min2 = Math.min(i2, this.bufferlen - this.bufferpos);
            System.arraycopy(this.buffer, this.bufferpos, bArr, i, min2);
            this.bufferpos += min2;
            return min2;
        }
    }

    public int read(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return read(bArr, 0, bArr.length);
    }

    private int locateLF() {
        for (int i = this.bufferpos; i < this.bufferlen; i++) {
            if (this.buffer[i] == 10) {
                return i;
            }
        }
        return -1;
    }

    public int readLine(CharArrayBuffer charArrayBuffer) {
        Args.notNull(charArrayBuffer, "Char array buffer");
        int i = 0;
        boolean z = true;
        while (z) {
            int locateLF = locateLF();
            if (locateLF == -1) {
                if (hasBufferedData()) {
                    this.linebuffer.append(this.buffer, this.bufferpos, this.bufferlen - this.bufferpos);
                    this.bufferpos = this.bufferlen;
                }
                i = fillBuffer();
                if (i == -1) {
                    z = false;
                }
            } else if (this.linebuffer.isEmpty()) {
                return lineFromReadBuffer(charArrayBuffer, locateLF);
            } else {
                z = false;
                this.linebuffer.append(this.buffer, this.bufferpos, (locateLF + 1) - this.bufferpos);
                this.bufferpos = locateLF + 1;
            }
            if (this.maxLineLen > 0 && this.linebuffer.length() >= this.maxLineLen) {
                throw new IOException("Maximum line length limit exceeded");
            }
        }
        if (i != -1 || !this.linebuffer.isEmpty()) {
            return lineFromLineBuffer(charArrayBuffer);
        }
        return -1;
    }

    private int lineFromLineBuffer(CharArrayBuffer charArrayBuffer) {
        int length = this.linebuffer.length();
        if (length > 0) {
            if (this.linebuffer.byteAt(length - 1) == 10) {
                length--;
            }
            if (length > 0 && this.linebuffer.byteAt(length - 1) == 13) {
                length--;
            }
        }
        if (this.ascii) {
            charArrayBuffer.append(this.linebuffer, 0, length);
        } else {
            length = appendDecoded(charArrayBuffer, ByteBuffer.wrap(this.linebuffer.buffer(), 0, length));
        }
        this.linebuffer.clear();
        return length;
    }

    private int lineFromReadBuffer(CharArrayBuffer charArrayBuffer, int i) {
        int i2 = this.bufferpos;
        int i3 = i;
        this.bufferpos = i + 1;
        if (i > i2 && this.buffer[i - 1] == 13) {
            i3--;
        }
        int i4 = i3 - i2;
        if (!this.ascii) {
            return appendDecoded(charArrayBuffer, ByteBuffer.wrap(this.buffer, i2, i4));
        }
        charArrayBuffer.append(this.buffer, i2, i4);
        return i4;
    }

    private int appendDecoded(CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.decoder == null) {
            this.decoder = this.charset.newDecoder();
            this.decoder.onMalformedInput(this.onMalformedCharAction);
            this.decoder.onUnmappableCharacter(this.onUnmappableCharAction);
        }
        if (this.cbuf == null) {
            this.cbuf = CharBuffer.allocate(1024);
        }
        this.decoder.reset();
        int i = 0;
        while (byteBuffer.hasRemaining()) {
            i += handleDecodingResult(this.decoder.decode(byteBuffer, this.cbuf, true), charArrayBuffer, byteBuffer);
        }
        int handleDecodingResult = i + handleDecodingResult(this.decoder.flush(this.cbuf), charArrayBuffer, byteBuffer);
        this.cbuf.clear();
        return handleDecodingResult;
    }

    private int handleDecodingResult(CoderResult coderResult, CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.cbuf.flip();
        int remaining = this.cbuf.remaining();
        while (this.cbuf.hasRemaining()) {
            charArrayBuffer.append(this.cbuf.get());
        }
        this.cbuf.compact();
        return remaining;
    }

    public String readLine() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(64);
        if (readLine(charArrayBuffer) != -1) {
            return charArrayBuffer.toString();
        }
        return null;
    }

    public HttpTransportMetrics getMetrics() {
        return this.metrics;
    }
}
