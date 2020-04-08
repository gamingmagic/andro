package org.apache.http.impl.conn;

import java.io.IOException;
import java.io.OutputStream;

class LoggingOutputStream extends OutputStream {
    private final OutputStream out;
    private final Wire wire;

    public LoggingOutputStream(OutputStream outputStream, Wire wire2) {
        this.out = outputStream;
        this.wire = wire2;
    }

    public void write(int i) {
        try {
            this.wire.output(i);
        } catch (IOException e) {
            this.wire.output("[write] I/O error: " + e.getMessage());
            throw e;
        }
    }

    public void write(byte[] bArr) {
        try {
            this.wire.output(bArr);
            this.out.write(bArr);
        } catch (IOException e) {
            this.wire.output("[write] I/O error: " + e.getMessage());
            throw e;
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        try {
            this.wire.output(bArr, i, i2);
            this.out.write(bArr, i, i2);
        } catch (IOException e) {
            this.wire.output("[write] I/O error: " + e.getMessage());
            throw e;
        }
    }

    public void flush() {
        try {
            this.out.flush();
        } catch (IOException e) {
            this.wire.output("[flush] I/O error: " + e.getMessage());
            throw e;
        }
    }

    public void close() {
        try {
            this.out.close();
        } catch (IOException e) {
            this.wire.output("[close] I/O error: " + e.getMessage());
            throw e;
        }
    }
}
