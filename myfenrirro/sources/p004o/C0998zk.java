package p004o;

/* renamed from: o.zk */
public final class C0998zk extends C0992zf {
    public C0998zk(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: 鷭 */
    public final C0998zk mo4233(byte[] bArr) {
        this.f5971 = bArr;
        this.f5972 = 0;
        return this;
    }

    /* renamed from: 鷭 */
    public final int mo4232() {
        return this.f5971[this.f5972] & 255;
    }

    /* renamed from: 鷭 */
    public final void mo4234(int i) {
        this.f5971[this.f5972] = (byte) i;
    }

    /* renamed from: 櫯 */
    public final int mo4230() {
        return this.f5971[this.f5972 + 1] & 255;
    }

    /* renamed from: 櫯 */
    public final void mo4231(int i) {
        this.f5971[this.f5972 + 1] = (byte) i;
    }

    /* renamed from: ȃ */
    public final void mo4229(int i) {
        byte[] bArr = this.f5971;
        int i2 = this.f5972 + 1;
        bArr[i2] = (byte) (bArr[i2] + i);
    }

    /* renamed from: ȃ */
    public final int mo4228() {
        return C0947xs.m1640(this.f5971, this.f5972 + 2);
    }

    /* renamed from: Ą */
    public final void mo4226(int i) {
        C0947xs.m1642(this.f5971, this.f5972 + 2, i);
    }

    /* renamed from: 鷭 */
    public final void mo4235(C0998zk zkVar) {
        System.arraycopy(zkVar.f5971, zkVar.f5972, this.f5971, this.f5972, 6);
    }

    /* renamed from: Ą */
    public final C0998zk mo4225() {
        mo4193(this.f5972 - 6);
        return this;
    }

    /* renamed from: ą */
    public final C0998zk mo4227() {
        mo4193(this.f5972 + 6);
        return this;
    }

    /* renamed from: 鷭 */
    public static void m1760(C0998zk zkVar, C0998zk zkVar2) {
        byte[] bArr = zkVar.f5971;
        byte[] bArr2 = zkVar2.f5971;
        int i = 0;
        int i2 = zkVar.f5972;
        int i3 = zkVar2.f5972;
        while (i < 6) {
            byte b = bArr[i2];
            bArr[i2] = bArr2[i3];
            bArr2[i3] = b;
            i++;
            i2++;
            i3++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("State[");
        sb.append("\n  pos=");
        sb.append(this.f5972);
        sb.append("\n  size=");
        sb.append(6);
        sb.append("\n  symbol=");
        sb.append(this.f5971[this.f5972] & 255);
        sb.append("\n  freq=");
        sb.append(this.f5971[this.f5972 + 1] & 255);
        sb.append("\n  successor=");
        sb.append(C0947xs.m1640(this.f5971, this.f5972 + 2));
        sb.append("\n]");
        return sb.toString();
    }
}
