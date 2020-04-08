package org.apache.http.impl.p006io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.p007io.SessionOutputBuffer;

/* renamed from: org.apache.http.impl.io.ChunkedOutputStream */
public class ChunkedOutputStream extends OutputStream {
    private final byte[] cache;
    private int cachePosition;
    private boolean closed;
    private final SessionOutputBuffer out;
    private boolean wroteLastChunk;

    @Deprecated
    public ChunkedOutputStream(SessionOutputBuffer sessionOutputBuffer, int i) {
        this(i, sessionOutputBuffer);
    }

    @Deprecated
    public ChunkedOutputStream(SessionOutputBuffer sessionOutputBuffer) {
        this(2048, sessionOutputBuffer);
    }

    public ChunkedOutputStream(int i, SessionOutputBuffer sessionOutputBuffer) {
        this.cachePosition = 0;
        this.wroteLastChunk = false;
        this.closed = false;
        this.cache = new byte[i];
        this.out = sessionOutputBuffer;
    }

    /* access modifiers changed from: protected */
    public void flushCache() {
        if (this.cachePosition > 0) {
            this.out.writeLine(Integer.toHexString(this.cachePosition));
            this.out.write(this.cache, 0, this.cachePosition);
            this.out.writeLine("");
            this.cachePosition = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void flushCacheWithAppend(byte[] bArr, int i, int i2) {
        this.out.writeLine(Integer.toHexString(this.cachePosition + i2));
        this.out.write(this.cache, 0, this.cachePosition);
        this.out.write(bArr, i, i2);
        this.out.writeLine("");
        this.cachePosition = 0;
    }

    /* access modifiers changed from: protected */
    public void writeClosingChunk() {
        this.out.writeLine("0");
        this.out.writeLine("");
    }

    public void finish() {
        if (!this.wroteLastChunk) {
            flushCache();
            writeClosingChunk();
            this.wroteLastChunk = true;
        }
    }

    public void write(int i) {
        if (this.closed) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.cache[this.cachePosition] = (byte) i;
        this.cachePosition++;
        if (this.cachePosition == this.cache.length) {
            flushCache();
        }
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        if (this.closed) {
            throw new IOException("Attempted write to closed stream.");
        } else if (i2 >= this.cache.length - this.cachePosition) {
            flushCacheWithAppend(bArr, i, i2);
        } else {
            System.arraycopy(bArr, i, this.cache, this.cachePosition, i2);
            this.cachePosition += i2;
        }
    }

    public void flush() {
        flushCache();
        this.out.flush();
    }

    public void close() {
        if (!this.closed) {
            this.closed = true;
            finish();
            this.out.flush();
        }
    }
}
