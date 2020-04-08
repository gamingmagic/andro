package p004o;

/* renamed from: o.ht */
class C0420ht extends C0759sx {

    /* renamed from: 鷭 */
    final /* synthetic */ C0415hp f1216;

    C0420ht(C0415hp hpVar, boolean z) {
        this.f1216 = hpVar;
        super(true);
    }

    /* renamed from: 鷭 */
    public final void mo3614(long j, long j2, int i) {
        C0453ix ixVar = C1014.f6147.f51;
        int i2 = ((int) ((80 * j) / j2)) + 20;
        String str = "Updating file list";
        C0453ix ixVar2 = ixVar;
        if (ixVar.f1369 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar2));
        }
        C1014.f6147.mo3387((Runnable) new C0469ji(ixVar2, str, null, i2, -1));
    }
}
