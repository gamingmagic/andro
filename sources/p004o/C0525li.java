package p004o;

/* renamed from: o.li */
final class C0525li {

    /* renamed from: 櫯 */
    public float f1648;

    /* renamed from: 鷭 */
    public float f1649;

    public C0525li() {
    }

    public C0525li(C0525li liVar) {
        this.f1649 = liVar.f1649;
        this.f1648 = liVar.f1648;
    }

    public C0525li(float f, float f2) {
        this.f1649 = f;
        this.f1648 = f2;
    }

    /* renamed from: 鷭 */
    public final float mo3959() {
        if (this.f1649 == 0.0f) {
            if (this.f1648 == 0.0f) {
                return 0.0f;
            }
            if (this.f1648 > 0.0f) {
                return 1.5707964f;
            }
            if (this.f1648 < 0.0f) {
                return -1.5707964f;
            }
        }
        float atan = (float) Math.atan((double) (this.f1648 / this.f1649));
        if (this.f1649 > 0.0f) {
            return atan;
        }
        return 3.1415927f + atan;
    }
}
