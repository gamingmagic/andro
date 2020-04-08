package p004o;

import android.opengl.Matrix;

/* renamed from: o.掂 */
class C1612 implements Runnable {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ int f7528;

    /* renamed from: 櫯 */
    private final /* synthetic */ int f7529;

    /* renamed from: 鷭 */
    final /* synthetic */ C1812 f7530;

    C1612(C1812 r1, int i, int i2) {
        this.f7530 = r1;
        this.f7529 = i;
        this.f7528 = i2;
    }

    public final void run() {
        C1014 r0 = C1014.f6161;
        int i = this.f7529;
        int i2 = this.f7528;
        C0534lq lqVar = C1014.f6142;
        lqVar.f1690.x = i;
        lqVar.f1690.y = i2;
        C0534lq lqVar2 = lqVar;
        float f = ((float) lqVar.f1690.x) / ((float) lqVar2.f1690.y);
        int i3 = lqVar2.f1690.x;
        int i4 = lqVar2.f1690.y;
        Matrix.frustumM(lqVar2.f1681.f6874, 0, -f, f, -1.0f, 1.0f, 5.0f, C0595nv.f2862);
        C1735 r9 = lqVar2.f1689;
        r9.f7996 = f > 1.0f ? f - ((f - 1.0f) / 2.0f) : f + ((1.0f - f) / 2.0f);
        r9.mo4475(10000.0f);
        C0534lq lqVar3 = lqVar;
        C1341 r12 = new C1341();
        Matrix.setIdentityM(r12.f6874, 0);
        C1341 r11 = r12;
        Matrix.translateM(r12.f6874, 0, -1.0f, -1.0f, 0.0f);
        C1341 r02 = r11;
        float f2 = 2.0f / ((float) lqVar3.f1690.x);
        float f3 = 2.0f / ((float) lqVar3.f1690.y);
        C1341 r122 = new C1341();
        Matrix.setIdentityM(r122.f6874, 0);
        C1341 r112 = r122;
        Matrix.scaleM(r122.f6874, 0, f2, f3, 1.0f);
        float[] fArr = new float[16];
        float[] fArr2 = fArr;
        Matrix.multiplyMM(fArr2, 0, r02.f6874, 0, r112.f6874, 0);
        C1341 r10 = new C1341();
        r10.f6874 = fArr;
        lqVar.f1683 = r10;
        if (lqVar.f1695 != null && lqVar.f1695.f7347 != null) {
            lqVar.f1695.f7347.mo3591();
        }
    }
}
