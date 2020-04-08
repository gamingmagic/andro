package p004o;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* renamed from: o.xw */
public class C0951xw {

    /* renamed from: Ą */
    protected short f5660 = 0;

    /* renamed from: ą */
    protected short f5661 = 0;

    /* renamed from: ȃ */
    protected byte f5662 = 0;

    /* renamed from: ˮ͈ */
    protected short f5663 = 0;

    /* renamed from: 櫯 */
    protected long f5664;

    /* renamed from: 鷭 */
    Log f5665 = LogFactory.getLog(C0951xw.class.getName());

    public C0951xw() {
    }

    public C0951xw(C0951xw xwVar) {
        this.f5660 = xwVar.f5660;
        this.f5663 = xwVar.f5663;
        this.f5662 = C0973yn.m1677(xwVar.f5662).f5781;
        this.f5661 = xwVar.f5661;
        this.f5664 = xwVar.f5664;
    }

    public C0951xw(byte[] bArr) {
        byte[] bArr2 = bArr;
        this.f5663 = (short) (((short) (((short) ((bArr2[1] & 255) + 0)) << 8)) + (bArr2[0] & 255));
        this.f5662 = (byte) (this.f5662 | (bArr[2] & 255));
        byte[] bArr3 = bArr;
        this.f5660 = (short) (((short) (((short) ((bArr3[4] & 255) + 0)) << 8)) + (bArr3[3] & 255));
        byte[] bArr4 = bArr;
        this.f5661 = (short) (((short) (((short) ((bArr4[6] & 255) + 0)) << 8)) + (bArr4[5] & 255));
    }

    /* renamed from: 鷭 */
    public final boolean mo4153() {
        return (this.f5660 & 2) != 0;
    }

    /* renamed from: 櫯 */
    public final boolean mo4151() {
        return (this.f5660 & 8) != 0;
    }

    /* renamed from: ˮ͈ */
    public final boolean mo4148() {
        return (this.f5660 & 512) != 0;
    }

    /* renamed from: ȃ */
    public final boolean mo4147() {
        if (C0973yn.SubHeader.f5781 == this.f5662) {
            return true;
        }
        if (!(C0973yn.NewSubHeader.f5781 == this.f5662) || (this.f5660 & 16) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: Ą */
    public final long mo4143() {
        return this.f5664;
    }

    /* renamed from: ą */
    public final short mo4144() {
        return this.f5660;
    }

    /* renamed from: Ć */
    public final short mo4145() {
        return this.f5663;
    }

    /* renamed from: ć */
    public final short mo4146() {
        return this.f5661;
    }

    /* renamed from: ˮ͍ */
    public final C0973yn mo4149() {
        return C0973yn.m1677(this.f5662);
    }

    /* renamed from: 鷭 */
    public final void mo4152(long j) {
        this.f5664 = j;
    }

    /* renamed from: 岱 */
    public void mo4150() {
        StringBuilder sb = new StringBuilder();
        sb.append("HeaderType: " + C0973yn.m1677(this.f5662));
        sb.append("\nHeadCRC: " + Integer.toHexString(this.f5663));
        sb.append("\nFlags: " + Integer.toHexString(this.f5660));
        sb.append("\nHeaderSize: " + this.f5661);
        sb.append("\nPosition in file: " + this.f5664);
        this.f5665.info(sb.toString());
    }
}
