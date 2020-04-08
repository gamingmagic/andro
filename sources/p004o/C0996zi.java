package p004o;

/* renamed from: o.zi */
public final class C0996zi extends C0992zf {

    /* renamed from: 鷭 */
    private int f5985;

    public C0996zi(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: 鷭 */
    public final int mo4219() {
        if (this.f5971 != null) {
            this.f5985 = C0947xs.m1640(this.f5971, this.f5972);
        }
        return this.f5985;
    }

    /* renamed from: 鷭 */
    public final void mo4221(C0996zi ziVar) {
        int r2 = ziVar.mo4202();
        this.f5985 = r2;
        if (this.f5971 != null) {
            C0947xs.m1642(this.f5971, this.f5972, r2);
        }
    }

    /* renamed from: 鷭 */
    public final void mo4220(int i) {
        this.f5985 = i;
        if (this.f5971 != null) {
            C0947xs.m1642(this.f5971, this.f5972, i);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("State[");
        sb.append("\n  pos=");
        sb.append(this.f5972);
        sb.append("\n  size=");
        sb.append(4);
        sb.append("\n  next=");
        if (this.f5971 != null) {
            this.f5985 = C0947xs.m1640(this.f5971, this.f5972);
        }
        sb.append(this.f5985);
        sb.append("\n]");
        return sb.toString();
    }
}
