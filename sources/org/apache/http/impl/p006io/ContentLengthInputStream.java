package org.apache.http.impl.p006io;

import android.support.p000v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.ConnectionClosedException;
import org.apache.http.p007io.BufferInfo;
import org.apache.http.p007io.SessionInputBuffer;
import org.apache.http.util.Args;

/* renamed from: org.apache.http.impl.io.ContentLengthInputStream */
public class ContentLengthInputStream extends InputStream {
    private static final int BUFFER_SIZE = 2048;
    private boolean closed = false;
    private final long contentLength;

    /* renamed from: in */
    private SessionInputBuffer f9025in = null;
    private long pos = 0;

    public ContentLengthInputStream(SessionInputBuffer sessionInputBuffer, long j) {
        this.f9025in = (SessionInputBuffer) Args.notNull(sessionInputBuffer, "Session input buffer");
        this.contentLength = Args.notNegative(j, "Content length");
    }

    public void close() {
        if (!this.closed) {
            try {
                if (this.pos < this.contentLength) {
                    do {
                    } while (read(new byte[2048]) >= 0);
                }
            } finally {
                this.closed = true;
            }
        }
    }

    public int available() {
        if (this.f9025in instanceof BufferInfo) {
            return Math.min(((BufferInfo) this.f9025in).length(), (int) (this.contentLength - this.pos));
        }
        return 0;
    }

    public int read() {
        if (this.closed) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.pos >= this.contentLength) {
            return -1;
        } else {
            int read = this.f9025in.read();
            if (read != -1) {
                this.pos++;
            } else if (this.pos < this.contentLength) {
                throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: " + this.contentLength + "; received: " + this.pos);
            }
            return read;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.closed) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.pos >= this.contentLength) {
            return -1;
        } else {
            int i3 = i2;
            if (this.pos + ((long) i2) > this.contentLength) {
                i3 = (int) (this.contentLength - this.pos);
            }
            int read = this.f9025in.read(bArr, i, i3);
            if (read != -1 || this.pos >= this.contentLength) {
                if (read > 0) {
                    this.pos += (long) read;
                }
                return read;
            }
            throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: " + this.contentLength + "; received: " + this.pos);
        }
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public long skip(long j) {
        if (j <= 0) {
            return 0;
        }
        byte[] bArr = new byte[2048];
        long min = Math.min(j, this.contentLength - this.pos);
        long j2 = 0;
        while (min > 0) {
            int read = read(bArr, 0, (int) Math.min(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH, min));
            if (read == -1) {
                break;
            }
            j2 += (long) read;
            min -= (long) read;
        }
        return j2;
    }
}
