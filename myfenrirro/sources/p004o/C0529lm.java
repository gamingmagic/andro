package p004o;

/* renamed from: o.lm */
final class C0529lm {

    /* renamed from: ˮ͈ */
    int[] f1662 = new int[32];

    /* renamed from: 櫯 */
    int f1663;

    /* renamed from: 鷭 */
    int f1664;

    C0529lm() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final double mo3971() {
        double d;
        double d2 = 0.0d;
        for (int i = 0; i < this.f1664; i++) {
            int i2 = this.f1662[i];
            if (i2 == -1) {
                break;
            }
            if ((i2 & 1) != 0) {
                d = 1.4d;
            } else {
                d = 1.0d;
            }
            d2 += d;
        }
        return d2;
    }
}
