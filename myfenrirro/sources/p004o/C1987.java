package p004o;

import p004o.C0638pa.C0640;

/* renamed from: o.셟 */
class C1987 implements Runnable {

    /* renamed from: Ą */
    private final /* synthetic */ C0583nj f8811;

    /* renamed from: ą */
    private final /* synthetic */ int f8812;

    /* renamed from: Ć */
    private final /* synthetic */ int f8813;

    /* renamed from: ć */
    private final /* synthetic */ C0640 f8814;

    /* renamed from: ȃ */
    private final /* synthetic */ C0540lv f8815;

    /* renamed from: Ȋ */
    private final /* synthetic */ C0540lv f8816;

    /* renamed from: ˮ͈ */
    private final /* synthetic */ short f8817;

    /* renamed from: ˮ͍ */
    private final /* synthetic */ boolean f8818;

    /* renamed from: 岱 */
    private final /* synthetic */ C1919 f8819;

    /* renamed from: 櫯 */
    private final /* synthetic */ int f8820;

    /* renamed from: 鷭 */
    final /* synthetic */ C1742 f8821;

    C1987(C1742 r1, int i, short s, C0540lv lvVar, C0583nj njVar, int i2, int i3, C0640 r8, boolean z, C1919 r10, C0540lv lvVar2) {
        this.f8821 = r1;
        this.f8820 = i;
        this.f8817 = s;
        this.f8815 = lvVar;
        this.f8811 = njVar;
        this.f8812 = i2;
        this.f8813 = i3;
        this.f8814 = r8;
        this.f8818 = z;
        this.f8819 = r10;
        this.f8816 = lvVar2;
    }

    public final void run() {
        C0570mx mxVar;
        int i = this.f8820 / this.f8817;
        C0540lv lvVar = this.f8815;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f8811 == C0583nj.ATTACK_CRITICAL) {
            mxVar = C0570mx.CRITICAL;
        } else {
            mxVar = C0570mx.FIXED_DIR;
        }
        C1632 r0 = new C1632(i, lvVar, currentTimeMillis, mxVar);
        C1014.f6142.f1680.f1187.add(r0);
        C0540lv lvVar2 = this.f8815;
        C0561mo moVar = C0561mo.TAKEDAMAGE;
        lvVar2.mo4634(((C1720) lvVar2.f8954).mo4468(moVar, lvVar2.f1776), System.currentTimeMillis());
        lvVar2.f1772 = moVar;
        lvVar2.mo3991();
        if (this.f8813 > 0) {
            this.f8815.f8946 = (long) this.f8813;
        }
        if (this.f8814 != null && (this.f8814.f4236 != null || (this.f8818 && this.f8814.f4235 != null))) {
            C1014.f6158.mo3387((Runnable) new C1329(this, this.f8818, this.f8814, this.f8815, this.f8816));
        }
        if (this.f8819 != null && this.f8819.f1629 == C0587nn.PC) {
            C0206bb bbVar = (C0206bb) this.f8819;
            String r7 = C1014.f6158.f674.f614.mo3973(C1014.f6158.f674.mo3612(bbVar.f461, bbVar.f457).mo4458());
            if (r7 != null) {
                C1014.f6136.mo4428(r7, 1.0f);
            }
        }
    }
}
