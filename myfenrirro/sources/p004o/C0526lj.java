package p004o;

import android.util.FloatMath;

/* renamed from: o.lj */
final class C0526lj {

    /* renamed from: ˮ͈ */
    public float f1650;

    /* renamed from: 櫯 */
    public float f1651;

    /* renamed from: 鷭 */
    public float f1652;

    C0526lj() {
    }

    C0526lj(float[] fArr) {
        this(fArr, 0);
    }

    private C0526lj(float[] fArr, int i) {
        this.f1652 = fArr[0];
        this.f1651 = fArr[1];
        this.f1650 = fArr[2];
    }

    C0526lj(C0526lj ljVar) {
        this.f1652 = ljVar.f1652;
        this.f1651 = ljVar.f1651;
        this.f1650 = ljVar.f1650;
    }

    C0526lj(float f, float f2, float f3) {
        this.f1652 = f;
        this.f1651 = f2;
        this.f1650 = f3;
    }

    /* renamed from: 鷭 */
    public final C0526lj mo3963(C0526lj ljVar) {
        this.f1652 += ljVar.f1652;
        this.f1651 += ljVar.f1651;
        this.f1650 += ljVar.f1650;
        return this;
    }

    /* renamed from: 鷭 */
    public final float mo3962() {
        return FloatMath.sqrt((this.f1652 * this.f1652) + (this.f1651 * this.f1651) + (this.f1650 * this.f1650));
    }

    /* renamed from: 櫯 */
    public final C0526lj mo3960() {
        float r3 = 1.0f / mo3962();
        this.f1652 *= r3;
        this.f1651 *= r3;
        this.f1650 *= r3;
        return this;
    }

    /* renamed from: 櫯 */
    public final C0526lj mo3961(C0526lj ljVar) {
        this.f1652 -= ljVar.f1652;
        this.f1651 -= ljVar.f1651;
        this.f1650 -= ljVar.f1650;
        return this;
    }
}
