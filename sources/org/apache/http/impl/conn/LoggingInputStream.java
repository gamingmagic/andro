package org.apache.http.impl.conn;

import java.io.IOException;
import java.io.InputStream;

class LoggingInputStream extends InputStream {

    /* renamed from: in */
    private final InputStream f9020in;
    private final Wire wire;

    public LoggingInputStream(InputStream inputStream, Wire wire2) {
        this.f9020in = inputStream;
        this.wire = wire2;
    }

    public int read() {
        try {
            int read = this.f9020in.read();
            if (read == -1) {
                this.wire.input("end of stream");
            } else {
                this.wire.input(read);
            }
            return read;
        } catch (IOException e) {
            this.wire.input("[read] I/O error: " + e.getMessage());
            throw e;
        }
    }

    public int read(byte[] bArr) {
        try {
            int read = this.f9020in.read(bArr);
            if (read == -1) {
                this.wire.input("end of stream");
            } else if (read > 0) {
                this.wire.input(bArr, 0, read);
            }
            return read;
        } catch (IOException e) {
            this.wire.input("[read] I/O error: " + e.getMessage());
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            int read = this.f9020in.read(bArr, i, i2);
            if (read == -1) {
                this.wire.input("end of stream");
            } else if (read > 0) {
                this.wire.input(bArr, i, read);
            }
            return read;
        } catch (IOException e) {
            this.wire.input("[read] I/O error: " + e.getMessage());
            throw e;
        }
    }

    public long skip(long j) {
        try {
            return super.skip(j);
        } catch (IOException e) {
            this.wire.input("[skip] I/O error: " + e.getMessage());
            throw e;
        }
    }

    public int available() {
        try {
            return this.f9020in.available();
        } catch (IOException e) {
            this.wire.input("[available] I/O error : " + e.getMessage());
            throw e;
        }
    }

    public void mark(int i) {
        super.mark(i);
    }

    public void reset() {
        super.reset();
    }

    public boolean markSupported() {
        return false;
    }

    public void close() {
        try {
            this.f9020in.close();
        } catch (IOException e) {
            this.wire.input("[close] I/O error: " + e.getMessage());
            throw e;
        }
    }
}
