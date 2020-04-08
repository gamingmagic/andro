package p004o;

/* renamed from: o.cn */
class C0250cn extends C0759sx {

    /* renamed from: Ą */
    private final /* synthetic */ int f636;

    /* renamed from: ȃ */
    private final /* synthetic */ int f637;

    /* renamed from: ˮ͈ */
    private final /* synthetic */ String f638;

    /* renamed from: 櫯 */
    private final /* synthetic */ C0453ix f639;

    /* renamed from: 鷭 */
    final /* synthetic */ C0248cl f640;

    C0250cn(C0248cl clVar, boolean z, C0453ix ixVar, String str, int i, int i2) {
        this.f640 = clVar;
        this.f639 = ixVar;
        this.f638 = str;
        this.f637 = i;
        this.f636 = i2;
        super(true);
    }

    /* renamed from: 鷭 */
    public final void mo3614(long j, long j2, int i) {
        C0453ix ixVar = this.f639;
        String str = "Caching GRF files [" + this.f638 + "," + (this.f637 + 1) + "/" + this.f636 + "]";
        int i2 = (i / 2) + 50;
        if (ixVar.f1369 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar));
        }
        C1014.f6147.mo3387((Runnable) new C0469ji(ixVar, str, null, i2, -1));
    }
}
