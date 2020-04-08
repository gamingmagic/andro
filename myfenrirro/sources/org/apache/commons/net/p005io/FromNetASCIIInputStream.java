package org.apache.commons.net.p005io;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import org.apache.commons.net.SocketClient;

/* renamed from: org.apache.commons.net.io.FromNetASCIIInputStream */
public final class FromNetASCIIInputStream extends PushbackInputStream {
    static final String _lineSeparator;
    static final byte[] _lineSeparatorBytes = _lineSeparator.getBytes();
    static final boolean _noConversionRequired;
    private int __length = 0;

    static {
        String property = System.getProperty("line.separator");
        _lineSeparator = property;
        _noConversionRequired = property.equals(SocketClient.NETASCII_EOL);
    }

    public static final boolean isConversionRequired() {
        return !_noConversionRequired;
    }

    public FromNetASCIIInputStream(InputStream inputStream) {
        super(inputStream, _lineSeparatorBytes.length + 1);
    }

    private int __read() {
        int read = super.read();
        if (read == 13) {
            int read2 = super.read();
            if (read2 == 10) {
                unread(_lineSeparatorBytes);
                read = super.read();
                this.__length--;
            } else {
                if (read2 != -1) {
                    unread(read2);
                }
                return 13;
            }
        }
        return read;
    }

    public final int read() {
        if (_noConversionRequired) {
            return super.read();
        }
        return __read();
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (_noConversionRequired) {
            return super.read(bArr, i, i2);
        }
        if (i2 <= 0) {
            return 0;
        }
        int available = available();
        this.__length = i2 > available ? available : i2;
        if (this.__length <= 0) {
            this.__length = 1;
        }
        int __read = __read();
        if (__read == -1) {
            return -1;
        }
        int i3 = i;
        do {
            int i4 = i;
            i++;
            bArr[i4] = (byte) __read;
            int i5 = this.__length - 1;
            this.__length = i5;
            if (i5 <= 0) {
                break;
            }
            __read = __read();
        } while (__read != -1);
        return i - i3;
    }

    public final int available() {
        if (this.in != null) {
            return (this.buf.length - this.pos) + this.in.available();
        }
        throw new IOException("Stream closed");
    }
}
