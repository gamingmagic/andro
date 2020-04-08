package p004o;

/* renamed from: o.zc */
public final class C0989zc extends C0992zf {
    public C0989zc(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: 鷭 */
    public final C0989zc mo4186(byte[] bArr) {
        this.f5971 = bArr;
        this.f5972 = 0;
        return this;
    }

    /* renamed from: 鷭 */
    public final int mo4185() {
        byte[] bArr = this.f5971;
        int i = this.f5972;
        return ((short) (((short) (((short) ((bArr[i + 1] & 255) + 0)) << 8)) + (bArr[i] & 255))) & 65535;
    }

    /* renamed from: 鷭 */
    public final void mo4187(int i) {
        byte[] bArr = this.f5971;
        int i2 = this.f5972;
        short s = (short) i;
        byte[] bArr2 = bArr;
        bArr[i2 + 1] = (byte) (s >>> 8);
        bArr2[i2] = (byte) (s & 255);
    }

    /* renamed from: 櫯 */
    public final void mo4184(int i) {
        byte[] bArr = this.f5971;
        int i2 = this.f5972;
        int i3 = i;
        byte[] bArr2 = bArr;
        int i4 = ((bArr[i2] & 255) + (i3 & 255)) >>> 8;
        bArr2[i2] = (byte) (bArr2[i2] + (i3 & 255));
        if (i4 > 0 || (65280 & i3) != 0) {
            int i5 = i2 + 1;
            bArr2[i5] = (byte) (bArr2[i5] + ((i3 >>> 8) & 255) + i4);
        }
    }

    /* renamed from: 櫯 */
    public final int mo4183() {
        return C0947xs.m1640(this.f5971, this.f5972 + 2);
    }

    /* renamed from: 鷭 */
    public final void mo4188(C0998zk zkVar) {
        C0947xs.m1642(this.f5971, this.f5972 + 2, zkVar.mo4202());
    }

    /* renamed from: a_ */
    public final void mo4181a_(int i) {
        C0947xs.m1642(this.f5971, this.f5972 + 2, i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FreqData[");
        sb.append("\n  pos=");
        sb.append(this.f5972);
        sb.append("\n  size=");
        sb.append(6);
        sb.append("\n  summFreq=");
        sb.append(mo4185());
        sb.append("\n  stats=");
        sb.append(C0947xs.m1640(this.f5971, this.f5972 + 2));
        sb.append("\n]");
        return sb.toString();
    }
}
