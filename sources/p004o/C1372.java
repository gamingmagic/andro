package p004o;

import com.roworkshop.andro.c_activity;

/* renamed from: o.ᥳ */
class C1372 implements Runnable {

    /* renamed from: Ą */
    private final /* synthetic */ C0583nj f6920;

    /* renamed from: ą */
    private final /* synthetic */ int f6921;

    /* renamed from: Ć */
    private final /* synthetic */ C0520le f6922;

    /* renamed from: ć */
    private final /* synthetic */ C0540lv f6923;

    /* renamed from: ȃ */
    private final /* synthetic */ int f6924;

    /* renamed from: ˮ͈ */
    private final /* synthetic */ long f6925;

    /* renamed from: ˮ͍ */
    private final /* synthetic */ C1919 f6926;

    /* renamed from: 櫯 */
    private final /* synthetic */ C0540lv f6927;

    /* renamed from: 鷭 */
    private final /* synthetic */ int f6928;

    C1372(int i, C0540lv lvVar, long j, int i2, C0583nj njVar, int i3, C0520le leVar, C0540lv lvVar2, C1919 r10) {
        this.f6928 = i;
        this.f6927 = lvVar;
        this.f6925 = j;
        this.f6924 = i2;
        this.f6920 = njVar;
        this.f6921 = i3;
        this.f6922 = leVar;
        this.f6923 = lvVar2;
        this.f6926 = r10;
    }

    public final void run() {
        int i = this.f6928;
        C0540lv lvVar = this.f6927;
        long j = this.f6925;
        C0570mx mxVar = this.f6924 > 0 ? C0570mx.FIXED_DIR : (this.f6920 == C0583nj.ATTACK_CRITICAL || this.f6920 == C0583nj.MULTI_HIT_CRITICAL) ? C0570mx.CRITICAL : C0570mx.NORMAL;
        C1632 r0 = new C1632(i, lvVar, j, mxVar);
        C1014.f6142.f1680.f1187.add(r0);
        C0540lv lvVar2 = this.f6927;
        C0561mo moVar = C0561mo.TAKEDAMAGE;
        lvVar2.mo4634(((C1720) lvVar2.f8954).mo4468(moVar, lvVar2.f1776), System.currentTimeMillis());
        lvVar2.f1772 = moVar;
        lvVar2.mo3991();
        C1014.f6158.mo3387((Runnable) new C1601(this, this.f6927, this.f6923));
        if (this.f6921 > 0) {
            this.f6927.f8946 = (long) this.f6921;
        }
        if (this.f6922.f1629 == C0587nn.PC) {
            C0206bb bbVar = (C0206bb) this.f6922;
            String r7 = C1014.f6158.f674.f614.mo3973(C1014.f6158.f674.mo3612(bbVar.f461, bbVar.f457).mo4458());
            if (r7 != null) {
                C1014.f6136.mo4428(r7, 1.0f);
            }
        }
        if (this.f6924 > 0) {
            C1632 r02 = new C1632(this.f6924, this.f6927, this.f6925 + 250, C0570mx.NORMAL);
            c_activity c_activity = C1014.f6147;
            C1140 r8 = new C1140(this, r02, this.f6926);
            c_activity c_activity2 = c_activity;
            if (c_activity.f56 != null) {
                c_activity2.f56.postDelayed(new C1348(c_activity2, r8), 250);
            }
        }
    }
}
