package p004o;

/* renamed from: o.ɤ */
class C1140 implements Runnable {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ C1919 f6237;

    /* renamed from: 櫯 */
    private final /* synthetic */ C1632 f6238;

    /* renamed from: 鷭 */
    final /* synthetic */ C1372 f6239;

    C1140(C1372 r1, C1632 r2, C1919 r3) {
        this.f6239 = r1;
        this.f6238 = r2;
        this.f6237 = r3;
    }

    public final void run() {
        C1014.f6142.f1680.f1187.add(this.f6238);
        if (this.f6237.f1629 == C0587nn.PC) {
            C0206bb bbVar = (C0206bb) this.f6237;
            String r4 = C1014.f6158.f674.f614.mo3973(C1014.f6158.f674.mo3612(bbVar.f461, bbVar.f457).mo4457());
            if (r4 != null) {
                C1014.f6136.mo4428(r4, 1.0f);
            }
        }
    }
}
