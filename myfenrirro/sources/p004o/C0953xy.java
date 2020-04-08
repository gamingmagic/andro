package p004o;

/* renamed from: o.xy */
public final class C0953xy extends C0951xw {

    /* renamed from: Ć */
    private short f5669;

    /* renamed from: ć */
    private byte f5670;

    /* renamed from: ˮ͍ */
    private byte f5671;

    /* renamed from: 岱 */
    private short f5672;

    public C0953xy(C0951xw xwVar, byte[] bArr) {
        super(xwVar);
        byte[] bArr2 = bArr;
        this.f5669 = (short) (((short) (((short) ((bArr2[1] & 255) + 0)) << 8)) + (bArr2[0] & 255));
        this.f5670 = (byte) (this.f5670 | (bArr[2] & 255));
        this.f5671 = (byte) (this.f5671 | (bArr[3] & 255));
        byte[] bArr3 = bArr;
        this.f5672 = (short) (((short) (((short) ((bArr3[5] & 255) + 0)) << 8)) + (bArr3[4] & 255));
    }
}
