package p004o;

import java.io.InputStream;

/* renamed from: o.xu */
public final class C0949xu extends InputStream {

    /* renamed from: ˮ͈ */
    private final long f5653;

    /* renamed from: 櫯 */
    private long f5654;

    /* renamed from: 鷭 */
    private C0946xr f5655;

    public C0949xu(C0946xr xrVar, long j, long j2) {
        this.f5655 = xrVar;
        this.f5654 = j;
        this.f5653 = j2;
        xrVar.mo4139(this.f5654);
    }

    public final int read() {
        if (this.f5654 == this.f5653) {
            return -1;
        }
        int read = this.f5655.read();
        this.f5654++;
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f5654 == this.f5653) {
            return -1;
        }
        int read = this.f5655.read(bArr, i, (int) Math.min((long) i2, this.f5653 - this.f5654));
        this.f5654 += (long) read;
        return read;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
