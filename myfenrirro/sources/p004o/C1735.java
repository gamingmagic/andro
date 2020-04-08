package p004o;

/* renamed from: o.羇 */
final class C1735 implements Cloneable {

    /* renamed from: Ą */
    static float f7980 = 60.0f;

    /* renamed from: ą */
    static float f7981 = 45.0f;

    /* renamed from: Ć */
    static float f7982 = 120.0f;

    /* renamed from: ć */
    static float f7983 = 300.0f;

    /* renamed from: ȃ */
    static float f7984 = 30.0f;

    /* renamed from: ˮ͈ */
    static float f7985 = 160.0f;

    /* renamed from: ˮ͍ */
    static float f7986 = (300.0f - ((300.0f - f7982) / 3.0f));

    /* renamed from: 櫯 */
    static float f7987 = 200.0f;

    /* renamed from: 鷭 */
    static float f7988 = 120.0f;

    /* renamed from: ċ */
    float[] f7989 = new float[3];

    /* renamed from: đ */
    float[] f7990 = new float[3];

    /* renamed from: Ē */
    final float f7991 = 5.0f;

    /* renamed from: ē */
    float f7992;

    /* renamed from: Ȋ */
    float[] f7993 = new float[4];

    /* renamed from: ܕ */
    boolean f7994 = true;

    /* renamed from: 䒧 */
    final float f7995 = 45.0f;

    /* renamed from: 岱 */
    float f7996 = 1.0f;

    /* renamed from: 庸 */
    boolean f7997 = true;

    /* renamed from: 纫 */
    float f7998;

    /* renamed from: 躆 */
    float f7999 = 0.0f;

    /* renamed from: 띥 */
    final float f8000 = 1.0f;

    C1735() {
    }

    static {
    }

    /* renamed from: 鷭 */
    public final C1735 mo4474() {
        try {
            return (C1735) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4475(float f) {
        float f2 = this.f7998;
        float f3 = f7988 / this.f7996;
        float f4 = f7987 / this.f7996;
        float f5 = f7982 / this.f7996;
        float f6 = f7983 / this.f7996;
        this.f7998 = f;
        if (C1014.f6142.f1695 != null) {
            if (C1014.f6142.f1695.f7343) {
                if (this.f7998 < f3) {
                    this.f7998 = f3;
                }
                if (this.f7998 > f4) {
                    this.f7998 = f4;
                }
            } else {
                if (this.f7998 < f5) {
                    this.f7998 = f5;
                }
                if (this.f7998 > f6) {
                    this.f7998 = f6;
                }
            }
            if (this.f7998 != f2) {
                this.f7994 = true;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo4473(float f) {
        float f2 = this.f7999;
        this.f7999 = f;
        while (this.f7999 > 180.0f) {
            this.f7999 -= 360.0f;
        }
        while (this.f7999 < -180.0f) {
            this.f7999 += 360.0f;
        }
        if (C1014.f6142.f1695.f7343) {
            if (this.f7999 < f7984) {
                this.f7999 = f7984;
            }
            if (this.f7999 > f7980) {
                this.f7999 = f7980;
            }
        }
        if (this.f7999 != f2) {
            this.f7997 = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo4472() {
        if (C1014.f6142.f1695 != null && C1014.f6142.f1680.f1195 != null) {
            C0543ly lyVar = C1014.f6142.f1680.f1195;
            C0526lj ljVar = new C0526lj();
            C0438ik ikVar = C1014.f6142.f1695.f7338;
            ljVar.f1652 = (-(((((float) (((lyVar.f1769.f1634 * 100) + lyVar.f1769.f1632.x) + 50)) / 100.0f) / 2.0f) - ((float) (ikVar.f1296 / 2)))) * ikVar.f1303;
            C0438ik ikVar2 = C1014.f6142.f1695.f7338;
            ljVar.f1650 = (((((float) (((lyVar.f1769.f1631 * 100) + lyVar.f1769.f1632.y) + 50)) / 100.0f) / 2.0f) - ((float) (ikVar2.f1297 / 2))) * ikVar2.f1303;
            ljVar.f1651 = C1014.f6142.f1695.mo4389(ljVar.f1652, ljVar.f1650);
            float f = ljVar.f1652;
            float f2 = ljVar.f1651;
            float f3 = ljVar.f1650;
            float f4 = f;
            if (!(this.f7989[0] == f4 && this.f7989[1] == f2 && this.f7989[2] == f3)) {
                this.f7994 = true;
            }
            this.f7989[0] = f4;
            this.f7989[1] = f2;
            this.f7989[2] = f3;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final void mo4471() {
        if (C1014.f6142.f1695.f7343) {
            mo4473(f7981);
            mo4475(f7985 / this.f7996);
            return;
        }
        mo4473(0.0f);
        mo4475(f7986 / this.f7996);
    }
}
