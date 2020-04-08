package p004o;

import p004o.C0638pa.C0640;

/* renamed from: o.ઓ */
class C1329 implements Runnable {

    /* renamed from: Ą */
    private final /* synthetic */ C0540lv f6851;

    /* renamed from: ȃ */
    private final /* synthetic */ C0540lv f6852;

    /* renamed from: ˮ͈ */
    private final /* synthetic */ C0640 f6853;

    /* renamed from: 櫯 */
    private final /* synthetic */ boolean f6854;

    /* renamed from: 鷭 */
    final /* synthetic */ C1987 f6855;

    C1329(C1987 r1, boolean z, C0640 r3, C0540lv lvVar, C0540lv lvVar2) {
        this.f6855 = r1;
        this.f6854 = z;
        this.f6853 = r3;
        this.f6852 = lvVar;
        this.f6851 = lvVar2;
    }

    public final void run() {
        if (this.f6854 && this.f6853.f4235 != null) {
            C0540lv lvVar = this.f6852;
            C1885 r4 = new C1885(this.f6852, this.f6851, this.f6853.f4235);
            synchronized (lvVar.f1773) {
                lvVar.f1773.add(r4);
            }
        }
        if (this.f6853.f4236 != null) {
            C0540lv lvVar2 = this.f6852;
            C1885 r42 = new C1885(this.f6852, this.f6851, this.f6853.f4236);
            synchronized (lvVar2.f1773) {
                lvVar2.f1773.add(r42);
            }
        }
    }
}
