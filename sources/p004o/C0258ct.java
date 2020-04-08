package p004o;

/* renamed from: o.ct */
class C0258ct extends C0658ph {

    /* renamed from: 櫯 */
    private final /* synthetic */ int f697;

    /* renamed from: 鷭 */
    final /* synthetic */ C0252cp f698;

    C0258ct(C0252cp cpVar, int i) {
        this.f698 = cpVar;
        this.f697 = i;
    }

    /* renamed from: 鷭 */
    public final void mo3626(long j, long j2) {
        C0453ix ixVar = C1014.f6147.f51;
        String str = "Downloading background music [" + (this.f697 + 1) + "/172]";
        int i = (this.f697 * 100) / 172;
        int i2 = (int) ((100 * j) / j2);
        String str2 = C0622ot.m736(j) + "/" + C0622ot.m736(j2);
        int i3 = i;
        String str3 = str;
        C0453ix ixVar2 = ixVar;
        if (ixVar.f1369 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar2));
        }
        C1014.f6147.mo3387((Runnable) new C0469ji(ixVar2, str3, str2, i3, i2));
    }
}
