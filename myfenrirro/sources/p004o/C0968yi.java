package p004o;

/* renamed from: o.yi */
public final class C0968yi extends C0952xx {

    /* renamed from: ċ */
    private byte f5747;

    /* renamed from: Ȋ */
    private int f5748;

    /* renamed from: ˮ͍ */
    private byte f5749;

    /* renamed from: 岱 */
    private short f5750;

    public C0968yi(C0952xx xxVar, byte[] bArr) {
        super(xxVar);
        this.f5749 = (byte) (this.f5749 | (bArr[0] & 255));
        byte[] bArr2 = bArr;
        this.f5750 = (short) (((short) (((short) ((bArr2[1] & 255) + 0)) << 8)) + (bArr2[0] & 255));
        this.f5748 = C0947xs.m1640(bArr, 2);
        this.f5747 = (byte) (this.f5747 | (bArr[6] & 255));
    }
}
