package p004o;

/* renamed from: o.cm */
class C0249cm extends C0759sx {

    /* renamed from: Ą */
    private final /* synthetic */ int f631;

    /* renamed from: ȃ */
    private final /* synthetic */ int f632;

    /* renamed from: ˮ͈ */
    private final /* synthetic */ String f633;

    /* renamed from: 櫯 */
    private final /* synthetic */ C0453ix f634;

    /* renamed from: 鷭 */
    final /* synthetic */ C0248cl f635;

    C0249cm(C0248cl clVar, boolean z, C0453ix ixVar, String str, int i, int i2) {
        this.f635 = clVar;
        this.f634 = ixVar;
        this.f633 = str;
        this.f632 = i;
        this.f631 = i2;
        super(true);
    }

    /* renamed from: 鷭 */
    public final void mo3614(long j, long j2, int i) {
        C0453ix ixVar = this.f634;
        String str = "Caching GRF files [" + this.f633 + "," + (this.f632 + 1) + "/" + this.f631 + "]";
        int i2 = i / 2;
        if (ixVar.f1369 != null) {
            C1014.f6147.mo3387((Runnable) new C0473jm(ixVar));
        }
        C1014.f6147.mo3387((Runnable) new C0469ji(ixVar, str, null, i2, -1));
    }
}
