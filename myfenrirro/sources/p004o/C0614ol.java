package p004o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.ol */
public final class C0614ol {

    /* renamed from: ˮ͈ */
    public long f2999;

    /* renamed from: 櫯 */
    byte[] f3000 = new byte[2048];

    /* renamed from: 鷭 */
    public InputStream f3001;

    /* renamed from: 鷭 */
    public final void mo4038(byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            int read = this.f3001.read(bArr, i2, i - i2);
            if (read == -1) {
                throw new IOException("Unexpected end of stream");
            }
            i2 += read;
        }
        this.f2999 += (long) i;
    }

    /* renamed from: 鷭 */
    public final byte[] mo4039() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = this.f3001.read(this.f3000);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(this.f3000, 0, read);
        }
    }

    public C0614ol(InputStream inputStream) {
        this.f3001 = inputStream;
    }

    /* renamed from: 櫯 */
    public final int mo4034() {
        mo4038(this.f3000, 4);
        return (this.f3000[3] << 24) | ((this.f3000[2] & 255) << 16) | ((this.f3000[1] & 255) << 8) | (this.f3000[0] & 255);
    }

    /* renamed from: ˮ͈ */
    public final short mo4033() {
        mo4038(this.f3000, 2);
        return (short) (((this.f3000[1] & 255) << 8) | (this.f3000[0] & 255));
    }

    /* renamed from: ȃ */
    public final byte mo4032() {
        int read = this.f3001.read();
        if (read == -1) {
            throw new IOException("Unexpected end of stream");
        }
        this.f2999++;
        return (byte) read;
    }

    /* renamed from: 鷭 */
    public final void mo4037(byte[] bArr) {
        mo4038(bArr, bArr.length);
    }

    /* renamed from: 鷭 */
    public final byte[] mo4040(int i) {
        byte[] bArr = new byte[i];
        mo4038(bArr, bArr.length);
        return bArr;
    }

    /* renamed from: 櫯 */
    public final void mo4036(byte[] bArr, int i) {
        mo4038(bArr, i);
    }

    /* renamed from: 櫯 */
    public final void mo4035(int i) {
        long j = 0;
        while (j < ((long) i)) {
            j += this.f3001.skip(((long) i) - j);
        }
        this.f2999 += (long) i;
    }
}
