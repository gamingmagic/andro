package p004o;

/* renamed from: o.懱 */
class C1601 implements Runnable {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ C0540lv f7513;

    /* renamed from: 櫯 */
    private final /* synthetic */ C0540lv f7514;

    /* renamed from: 鷭 */
    final /* synthetic */ C1372 f7515;

    C1601(C1372 r1, C0540lv lvVar, C0540lv lvVar2) {
        this.f7515 = r1;
        this.f7514 = lvVar;
        this.f7513 = lvVar2;
    }

    public final void run() {
        C1885 r3 = new C1885(this.f7514, this.f7513, C0626ox.HIT1);
        C0540lv lvVar = this.f7514;
        C1885 r4 = r3;
        C0540lv lvVar2 = lvVar;
        synchronized (lvVar.f1773) {
            lvVar2.f1773.add(r4);
        }
    }
}
