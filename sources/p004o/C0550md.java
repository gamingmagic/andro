package p004o;

/* renamed from: o.md */
class C0550md implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ C1720 f1779;

    /* renamed from: 鷭 */
    final /* synthetic */ C0549mc f1780;

    C0550md(C0549mc mcVar, C1720 r2) {
        this.f1780 = mcVar;
        this.f1779 = r2;
    }

    public final void run() {
        C0548mb mbVar = this.f1780.f1778;
        mbVar.f8954 = this.f1779;
        mbVar.mo4634(mbVar.f8950, mbVar.f8945);
        this.f1780.f1778.f1774 = false;
        if ((this.f1780.f1778.f1769.f1629 == C0587nn.MOB || this.f1780.f1778.f1769.f1629 == C0587nn.NPC) && this.f1780.f1778.f1769.f1633 != C1430.FLAG_CLASS.f7044) {
            C1014.f6142.f1680.f1182.put(Integer.valueOf(this.f1780.f1778.f1769.f1633), this.f1779);
            return;
        }
        if (this.f1780.f1778.f1769.f1629 == C0587nn.ITEM) {
            C1014.f6142.f1680.f1183.put(Integer.valueOf(this.f1780.f1778.f1769.f1633), this.f1779);
        }
    }
}
