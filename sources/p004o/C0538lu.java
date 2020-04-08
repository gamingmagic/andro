package p004o;

import android.graphics.Point;
import android.opengl.Matrix;
import com.roworkshop.andro.c_point;

/* renamed from: o.lu */
class C0538lu extends C2042 {

    /* renamed from: Ȋ */
    private static /* synthetic */ int[] f1702;

    /* renamed from: đ */
    C0525li f1703;

    /* renamed from: Ē */
    final float f1704;

    /* renamed from: ܕ */
    Point f1705;

    /* renamed from: 䒧 */
    C0539 f1706;

    /* renamed from: 庸 */
    C0526lj f1707;

    /* renamed from: 躆 */
    Point f1708;

    /* renamed from: o.lu$鷭 */
    enum C0539 {
        SCREEN,
        WORLD
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:3|4|5|6|7|8|10) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* renamed from: ą */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] mo3989() {
        /*
            int[] r0 = f1702
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.lu$鷭[] r0 = p004o.C0538lu.C0539.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.lu$鷭 r0 = p004o.C0538lu.C0539.SCREEN     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.lu$鷭 r0 = p004o.C0538lu.C0539.WORLD     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            f1702 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0538lu.mo3989():int[]");
    }

    protected C0538lu() {
        super(null, (float) C1014.f6142.f1680.f1198.f1308);
        this.f1706 = C0539.WORLD;
        this.f1708 = new Point();
        this.f1705 = new Point();
        this.f1707 = new C0526lj();
        this.f1703 = new C0525li();
        this.f1704 = 0.15f;
    }

    C0538lu(C0408hl hlVar, c_point c_point) {
        super(hlVar, (float) C1014.f6142.f1680.f1198.f1308);
        this.f1706 = C0539.WORLD;
        this.f1708 = new Point();
        this.f1705 = new Point();
        this.f1707 = new C0526lj();
        this.f1703 = new C0525li();
        this.f1704 = 0.15f;
        this.f1706 = C0539.SCREEN;
        float f = this.f1703.f1649;
        float f2 = this.f1703.f1648;
        C1341 r7 = new C1341();
        Matrix.setIdentityM(r7.f6874, 0);
        Matrix.translateM(r7.f6874, 0, f, f2, 0.0f);
        C1341 r6 = new C1341();
        Matrix.setIdentityM(r6.f6874, 0);
        Matrix.scaleM(r6.f6874, 0, 0.005f, 0.005f, 1.0f);
        C1341 r9 = r7;
        C1341 r10 = r7;
        float[] fArr = new float[16];
        float[] fArr2 = fArr;
        Matrix.multiplyMM(fArr2, 0, r10.f6874, 0, r6.f6874, 0);
        r10.f6874 = fArr;
        C1341 r0 = r9;
        C1341 r92 = r0;
        C1341 r102 = r0;
        float[] fArr3 = new float[16];
        float[] fArr4 = fArr3;
        Matrix.multiplyMM(fArr4, 0, r102.f6874, 0, C1341.m2060(0.0f, 0.0f, 0.0f, 1.0f).f6874, 0);
        r102.f6874 = fArr3;
        this.f8953 = r92;
    }

    /* access modifiers changed from: 0000 */
    @Deprecated
    /* renamed from: 鷭 */
    public final void mo3988(C0408hl hlVar, Point point, c_point c_point) {
        this.f8954 = hlVar;
        this.f1708.set(point.x, point.y);
        this.f1705.set(c_point.x, c_point.y);
        mo3985();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public void mo3987() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ȃ */
    public void mo3986() {
        mo3987();
        this.f1707 = C1014.f6142.mo3977(this.f1708.x, this.f1708.y, this.f1705.x, this.f1705.y);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ą */
    public void mo3985() {
        switch (mo3989()[this.f1706.ordinal()]) {
            case 1:
                return;
            case 2:
                mo3986();
                float f = this.f1707.f1652;
                float f2 = this.f1707.f1651 / this.f8952;
                float f3 = this.f1707.f1650;
                C1341 r9 = new C1341();
                Matrix.setIdentityM(r9.f6874, 0);
                Matrix.translateM(r9.f6874, 0, f, f2, f3);
                C0534lq lqVar = C1014.f6142;
                float f4 = 0.15f * this.f8952;
                float f5 = this.f8952 * -0.15f;
                C1341 r7 = new C1341();
                Matrix.setIdentityM(r7.f6874, 0);
                Matrix.scaleM(r7.f6874, 0, f5, f4, 1.0f);
                this.f8953 = C1341.m2062(r9, C1341.m2060(((-C1014.f6142.f1689.f7999) / 180.0f) * 3.1415927f, 0.0f, 1.0f, 0.0f), C1341.m2060(0.7853982f, 1.0f, 0.0f, 0.0f), r7);
                return;
            default:
                throw new C0588no();
        }
    }
}
