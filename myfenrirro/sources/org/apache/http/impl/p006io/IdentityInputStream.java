package org.apache.http.impl.p006io;

import java.io.InputStream;
import org.apache.http.p007io.BufferInfo;
import org.apache.http.p007io.SessionInputBuffer;
import org.apache.http.util.Args;

/* renamed from: org.apache.http.impl.io.IdentityInputStream */
public class IdentityInputStream extends InputStream {
    private boolean closed = false;

    /* renamed from: in */
    private final SessionInputBuffer f9026in;

    public IdentityInputStream(SessionInputBuffer sessionInputBuffer) {
        this.f9026in = (SessionInputBuffer) Args.notNull(sessionInputBuffer, "Session input buffer");
    }

    public int available() {
        if (this.f9026in instanceof BufferInfo) {
            return ((BufferInfo) this.f9026in).length();
        }
        return 0;
    }

    public void close() {
        this.closed = true;
    }

    public int read() {
        if (this.closed) {
            return -1;
        }
        return this.f9026in.read();
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.closed) {
            return -1;
        }
        return this.f9026in.read(bArr, i, i2);
    }
}
