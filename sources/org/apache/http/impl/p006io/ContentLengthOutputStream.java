package org.apache.http.impl.p006io;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.p007io.SessionOutputBuffer;
import org.apache.http.util.Args;

/* renamed from: org.apache.http.impl.io.ContentLengthOutputStream */
public class ContentLengthOutputStream extends OutputStream {
    private boolean closed = false;
    private final long contentLength;
    private final SessionOutputBuffer out;
    private long total = 0;

    public ContentLengthOutputStream(SessionOutputBuffer sessionOutputBuffer, long j) {
        this.out = (SessionOutputBuffer) Args.notNull(sessionOutputBuffer, "Session output buffer");
        this.contentLength = Args.notNegative(j, "Content length");
    }

    public void close() {
        if (!this.closed) {
            this.closed = true;
            this.out.flush();
        }
    }

    public void flush() {
        this.out.flush();
    }

    public void write(byte[] bArr, int i, int i2) {
        if (this.closed) {
            throw new IOException("Attempted write to closed stream.");
        } else if (this.total < this.contentLength) {
            long j = this.contentLength - this.total;
            int i3 = i2;
            if (((long) i2) > j) {
                i3 = (int) j;
            }
            this.out.write(bArr, i, i3);
            this.total += (long) i3;
        }
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(int i) {
        if (this.closed) {
            throw new IOException("Attempted write to closed stream.");
        } else if (this.total < this.contentLength) {
            this.out.write(i);
            this.total++;
        }
    }
}
