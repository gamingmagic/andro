package org.apache.commons.net.p005io;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: org.apache.commons.net.io.FromNetASCIIOutputStream */
public final class FromNetASCIIOutputStream extends FilterOutputStream {
    private boolean __lastWasCR = false;

    public FromNetASCIIOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    private void __write(int i) {
        switch (i) {
            case 10:
                if (this.__lastWasCR) {
                    this.out.write(FromNetASCIIInputStream._lineSeparatorBytes);
                    this.__lastWasCR = false;
                    return;
                }
                this.__lastWasCR = false;
                this.out.write(10);
                return;
            case 13:
                this.__lastWasCR = true;
                return;
            default:
                if (this.__lastWasCR) {
                    this.out.write(13);
                    this.__lastWasCR = false;
                }
                this.out.write(i);
                return;
        }
    }

    public final synchronized void write(int i) {
        if (FromNetASCIIInputStream._noConversionRequired) {
            this.out.write(i);
        } else {
            __write(i);
        }
    }

    public final synchronized void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        if (FromNetASCIIInputStream._noConversionRequired) {
            this.out.write(bArr, i, i2);
            return;
        }
        while (true) {
            int i3 = i2;
            i2 = i3 - 1;
            if (i3 > 0) {
                int i4 = i;
                i++;
                __write(bArr[i4]);
            } else {
                return;
            }
        }
    }

    public final synchronized void close() {
        if (FromNetASCIIInputStream._noConversionRequired) {
            super.close();
            return;
        }
        if (this.__lastWasCR) {
            this.out.write(13);
        }
        super.close();
    }
}
