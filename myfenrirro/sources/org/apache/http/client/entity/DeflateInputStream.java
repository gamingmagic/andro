package org.apache.http.client.entity;

import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;

public class DeflateInputStream extends InputStream {
    private final InputStream sourceStream;

    static class DeflateStream extends InflaterInputStream {
        private boolean closed = false;

        public DeflateStream(InputStream inputStream, Inflater inflater) {
            super(inputStream, inflater);
        }

        public void close() {
            if (!this.closed) {
                this.closed = true;
                this.inf.end();
                super.close();
            }
        }
    }

    public DeflateInputStream(InputStream inputStream) {
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 2);
        PushbackInputStream pushbackInputStream2 = pushbackInputStream;
        int read = pushbackInputStream.read();
        int read2 = pushbackInputStream2.read();
        if (read == -1 || read2 == -1) {
            throw new ZipException("Unexpected end of stream");
        }
        pushbackInputStream2.unread(read2);
        pushbackInputStream2.unread(read);
        boolean z = true;
        int i = read & 255;
        int i2 = (i >> 4) & 15;
        int i3 = read2 & 255;
        if ((i & 15) == 8 && i2 <= 7 && ((i << 8) | i3) % 31 == 0) {
            z = false;
        }
        this.sourceStream = new DeflateStream(pushbackInputStream2, new Inflater(z));
    }

    public int read() {
        return this.sourceStream.read();
    }

    public int read(byte[] bArr) {
        return this.sourceStream.read(bArr);
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.sourceStream.read(bArr, i, i2);
    }

    public long skip(long j) {
        return this.sourceStream.skip(j);
    }

    public int available() {
        return this.sourceStream.available();
    }

    public void mark(int i) {
        this.sourceStream.mark(i);
    }

    public void reset() {
        this.sourceStream.reset();
    }

    public boolean markSupported() {
        return this.sourceStream.markSupported();
    }

    public void close() {
        this.sourceStream.close();
    }
}
