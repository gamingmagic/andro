package p004o;

/* renamed from: o.tn */
class C0817tn implements C0938xk {

    /* renamed from: 櫯 */
    private final /* synthetic */ String f5000;

    /* renamed from: 鷭 */
    final /* synthetic */ C0814tm f5001;

    C0817tn(C0814tm tmVar, String str) {
        this.f5001 = tmVar;
        this.f5000 = str;
    }

    /* renamed from: 鷭 */
    public final void mo4116(long j, long j2) {
        if (j2 == 0) {
            j2 = 1;
        }
        this.f5001.f4986.mo3957(this.f5000 + "\n" + ((100 * j) / j2) + "% [" + C0622ot.m736(j) + "/" + C0622ot.m736(j2) + "] Extracting...");
    }

    /* renamed from: 鷭 */
    public final boolean mo4117(C0944xp xpVar) {
        new StringBuilder("isNextVolumeReady ").append(xpVar);
        C0624ov.m757();
        return false;
    }
}
