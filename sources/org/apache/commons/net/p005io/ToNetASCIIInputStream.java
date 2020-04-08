package org.apache.commons.net.p005io;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: org.apache.commons.net.io.ToNetASCIIInputStream */
public final class ToNetASCIIInputStream extends FilterInputStream {
    private static final int __LAST_WAS_CR = 1;
    private static final int __LAST_WAS_NL = 2;
    private static final int __NOTHING_SPECIAL = 0;
    private int __status = 0;

    public ToNetASCIIInputStream(InputStream inputStream) {
        super(inputStream);
    }

    public final int read() {
        if (this.__status == 2) {
            this.__status = 0;
            return 10;
        }
        int read = this.in.read();
        switch (read) {
            case 10:
                if (this.__status != 1) {
                    this.__status = 2;
                    return 13;
                }
                break;
            case 13:
                this.__status = 1;
                return 13;
        }
        this.__status = 0;
        return read;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return 0;
        }
        int available = available();
        if (i2 > available) {
            i2 = available;
        }
        if (i2 <= 0) {
            i2 = 1;
        }
        int read = read();
        if (read == -1) {
            return -1;
        }
        int i3 = i;
        do {
            int i4 = i;
            i++;
            bArr[i4] = (byte) read;
            i2--;
            if (i2 <= 0) {
                break;
            }
            read = read();
        } while (read != -1);
        return i - i3;
    }

    public final boolean markSupported() {
        return false;
    }

    public final int available() {
        int available = this.in.available();
        if (this.__status == 2) {
            return available + 1;
        }
        return available;
    }
}
