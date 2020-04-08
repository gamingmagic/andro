package p004o;

/* renamed from: o.yj */
public final class C0969yj extends C0951xw {

    /* renamed from: Ć */
    private int f5751 = 0;

    /* renamed from: ć */
    private short f5752 = 0;

    /* renamed from: ˮ͍ */
    private short f5753 = 0;

    public C0969yj(C0951xw xwVar, byte[] bArr) {
        super(xwVar);
        this.f5751 = C0947xs.m1640(bArr, 0);
        byte[] bArr2 = bArr;
        this.f5752 = (short) (((short) (((short) ((bArr2[5] & 255) + 0)) << 8)) + (bArr2[4] & 255));
        byte[] bArr3 = bArr;
        this.f5753 = (short) (((short) (((short) ((bArr3[7] & 255) + 0)) << 8)) + (bArr3[6] & 255));
    }
}
