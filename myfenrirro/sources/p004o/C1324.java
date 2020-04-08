package p004o;

import p004o.C0638pa.C0640;

/* renamed from: o.ओ */
class C1324 implements Runnable {

    /* renamed from: ȃ */
    private final /* synthetic */ C0640 f6627;

    /* renamed from: ˮ͈ */
    private final /* synthetic */ C0540lv f6628;

    /* renamed from: 櫯 */
    private final /* synthetic */ C0540lv f6629;

    /* renamed from: 鷭 */
    final /* synthetic */ C1742 f6630;

    C1324(C1742 r1, C0540lv lvVar, C0540lv lvVar2, C0640 r4) {
        this.f6630 = r1;
        this.f6629 = lvVar;
        this.f6628 = lvVar2;
        this.f6627 = r4;
    }

    public final void run() {
        C0540lv lvVar = this.f6629;
        C1885 r4 = new C1885(this.f6629, this.f6628, this.f6627.f4239);
        synchronized (lvVar.f1773) {
            lvVar.f1773.add(r4);
        }
    }
}
