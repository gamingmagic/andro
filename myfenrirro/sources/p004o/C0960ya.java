package p004o;

/* renamed from: o.ya */
public final class C0960ya extends C0951xw {

    /* renamed from: Ć */
    private int f5699;

    /* renamed from: ć */
    private short f5700;

    public C0960ya(C0951xw xwVar, byte[] bArr) {
        super(xwVar);
        int i = 0;
        if (mo4153()) {
            this.f5699 = C0947xs.m1640(bArr, 0);
            i = 0 + 4;
        }
        if (mo4151()) {
            byte[] bArr2 = bArr;
            int i2 = i;
            byte[] bArr3 = bArr2;
            this.f5700 = (short) (((short) (((short) ((bArr3[i2 + 1] & 255) + 0)) << 8)) + (bArr3[i2] & 255));
        }
    }
}
