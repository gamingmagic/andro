package p004o;

/* renamed from: o.db */
class C0267db extends C0658ph {

    /* renamed from: 鷭 */
    final /* synthetic */ C0252cp f716;

    C0267db(C0252cp cpVar) {
        this.f716 = cpVar;
    }

    /* renamed from: 鷭 */
    public final void mo3626(long j, long j2) {
        if (j2 < 1) {
            C0453ix ixVar = C1014.f6147.f51;
            String str = "Downloading new file list\n[" + C0622ot.m736(j) + "] bytes";
            C0453ix ixVar2 = ixVar;
            if (ixVar.f1370 != null) {
                C1014.f6147.mo3387((Runnable) new C0473jm(ixVar2));
            }
            C1014.f6147.mo3387((Runnable) new C0471jk(ixVar2, str));
            return;
        }
        C0453ix ixVar3 = C1014.f6147.f51;
        int i = (int) ((100 * j) / (j2 == 0 ? -1 : j2));
        String str2 = "Downloading new file list";
        C0453ix ixVar4 = ixVar3;
        if (ixVar3.f1369 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar4));
        }
        C1014.f6147.mo3387((Runnable) new C0469ji(ixVar4, str2, null, i, -1));
    }
}
