package p004o;

import android.opengl.Matrix;
import android.util.FloatMath;

/* renamed from: o.ತ */
final class C1341 {

    /* renamed from: 鷭 */
    float[] f6874 = new float[16];

    C1341() {
    }

    C1341(float[] fArr) {
        this.f6874 = fArr;
    }

    /* renamed from: 鷭 */
    static C1341 m2062(C1341... r11) {
        C1341 r8 = new C1341();
        Matrix.setIdentityM(r8.f6874, 0);
        C1341 r6 = r8;
        for (C1341 r0 : r11) {
            C1341 r82 = r6;
            float[] fArr = new float[16];
            Matrix.multiplyMM(fArr, 0, r82.f6874, 0, r0.f6874, 0);
            r82.f6874 = fArr;
        }
        return r6;
    }

    /* renamed from: 鷭 */
    static C1341 m2060(float f, float f2, float f3, float f4) {
        C1341 r3 = new C1341();
        Matrix.setIdentityM(r3.f6874, 0);
        float sqrt = FloatMath.sqrt((f2 * f2) + (f3 * f3) + (f4 * f4));
        if (sqrt == 0.0f) {
            return r3;
        }
        if (sqrt != 1.0f) {
            float f5 = 1.0f / sqrt;
            f2 *= f5;
            f3 *= f5;
            f4 *= f5;
        }
        float sin = FloatMath.sin(f);
        float cos = FloatMath.cos(f);
        float f6 = 1.0f - cos;
        float f7 = r3.f6874[0];
        float f8 = r3.f6874[1];
        float f9 = r3.f6874[2];
        float f10 = r3.f6874[3];
        float f11 = r3.f6874[4];
        float f12 = r3.f6874[5];
        float f13 = r3.f6874[6];
        float f14 = r3.f6874[7];
        float f15 = r3.f6874[8];
        float f16 = r3.f6874[9];
        float f17 = r3.f6874[10];
        float f18 = r3.f6874[11];
        float f19 = (f2 * f2 * f6) + cos;
        float f20 = (f3 * f2 * f6) + (f4 * sin);
        float f21 = ((f4 * f2) * f6) - (f3 * sin);
        float f22 = ((f2 * f3) * f6) - (f4 * sin);
        float f23 = (f3 * f3 * f6) + cos;
        float f24 = (f4 * f3 * f6) + (f2 * sin);
        float f25 = (f2 * f4 * f6) + (f3 * sin);
        float f26 = ((f3 * f4) * f6) - (f2 * sin);
        float f27 = (f4 * f4 * f6) + cos;
        r3.f6874[0] = (f7 * f19) + (f11 * f20) + (f15 * f21);
        r3.f6874[1] = (f8 * f19) + (f12 * f20) + (f16 * f21);
        r3.f6874[2] = (f9 * f19) + (f13 * f20) + (f17 * f21);
        r3.f6874[3] = (f10 * f19) + (f14 * f20) + (f18 * f21);
        r3.f6874[4] = (f7 * f22) + (f11 * f23) + (f15 * f24);
        r3.f6874[5] = (f8 * f22) + (f12 * f23) + (f16 * f24);
        r3.f6874[6] = (f9 * f22) + (f13 * f23) + (f17 * f24);
        r3.f6874[7] = (f10 * f22) + (f14 * f23) + (f18 * f24);
        r3.f6874[8] = (f7 * f25) + (f11 * f26) + (f15 * f27);
        r3.f6874[9] = (f8 * f25) + (f12 * f26) + (f16 * f27);
        r3.f6874[10] = (f9 * f25) + (f13 * f26) + (f17 * f27);
        r3.f6874[11] = (f10 * f25) + (f14 * f26) + (f18 * f27);
        return r3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4309(float f) {
        float sin = FloatMath.sin(f);
        float cos = FloatMath.cos(f);
        float f2 = this.f6874[4];
        float f3 = this.f6874[5];
        float f4 = this.f6874[6];
        float f5 = this.f6874[7];
        float f6 = this.f6874[8];
        float f7 = this.f6874[9];
        float f8 = this.f6874[10];
        float f9 = this.f6874[11];
        this.f6874[4] = (f2 * cos) + (f6 * sin);
        this.f6874[5] = (f3 * cos) + (f7 * sin);
        this.f6874[6] = (f4 * cos) + (f8 * sin);
        this.f6874[7] = (f5 * cos) + (f9 * sin);
        this.f6874[8] = ((-sin) * f2) + (f6 * cos);
        this.f6874[9] = ((-sin) * f3) + (f7 * cos);
        this.f6874[10] = ((-sin) * f4) + (f8 * cos);
        this.f6874[11] = ((-sin) * f5) + (f9 * cos);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo4308(float f) {
        float sin = FloatMath.sin(f);
        float cos = FloatMath.cos(f);
        float f2 = this.f6874[0];
        float f3 = this.f6874[1];
        float f4 = this.f6874[2];
        float f5 = this.f6874[3];
        float f6 = this.f6874[8];
        float f7 = this.f6874[9];
        float f8 = this.f6874[10];
        float f9 = this.f6874[11];
        this.f6874[0] = (f2 * cos) + ((-sin) * f6);
        this.f6874[1] = (f3 * cos) + ((-sin) * f7);
        this.f6874[2] = (f4 * cos) + ((-sin) * f8);
        this.f6874[3] = (f5 * cos) + ((-sin) * f9);
        this.f6874[8] = (f2 * sin) + (f6 * cos);
        this.f6874[9] = (f3 * sin) + (f7 * cos);
        this.f6874[10] = (f4 * sin) + (f8 * cos);
        this.f6874[11] = (f5 * sin) + (f9 * cos);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final void mo4307(float f) {
        float sin = FloatMath.sin(f);
        float cos = FloatMath.cos(f);
        float f2 = this.f6874[0];
        float f3 = this.f6874[1];
        float f4 = this.f6874[2];
        float f5 = this.f6874[3];
        float f6 = this.f6874[4];
        float f7 = this.f6874[5];
        float f8 = this.f6874[6];
        float f9 = this.f6874[7];
        this.f6874[0] = (f2 * cos) + (f6 * sin);
        this.f6874[1] = (f3 * cos) + (f7 * sin);
        this.f6874[2] = (f4 * cos) + (f8 * sin);
        this.f6874[3] = (f5 * cos) + (f9 * sin);
        this.f6874[4] = ((-sin) * f2) + (f6 * cos);
        this.f6874[5] = ((-sin) * f3) + (f7 * cos);
        this.f6874[6] = ((-sin) * f4) + (f8 * cos);
        this.f6874[7] = ((-sin) * f5) + (f9 * cos);
    }

    /* renamed from: 鷭 */
    static float[] m2063(float[] fArr, C1341 r8) {
        float[] fArr2 = new float[4];
        Matrix.multiplyMV(fArr2, 0, r8.f6874, 0, fArr.length >= 4 ? fArr : new float[]{fArr[0], fArr[1], fArr[2], 1.0f}, 0);
        return fArr2;
    }

    /* renamed from: 鷭 */
    static C1341 m2061(float[] fArr) {
        return new C1341(new float[]{fArr[0], fArr[1], fArr[2], 0.0f, fArr[3], fArr[4], fArr[5], 0.0f, fArr[6], fArr[7], fArr[8], 0.0f, 0.0f, 0.0f, 0.0f, 1.0f});
    }
}
