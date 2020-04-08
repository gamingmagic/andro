package p004o;

/* renamed from: o.hm */
class C0411hm implements Runnable {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ C0405hk f1179;

    /* renamed from: 櫯 */
    private final /* synthetic */ String f1180;

    /* renamed from: 鷭 */
    final /* synthetic */ C0410 f1181;

    C0411hm(C0410 r1, String str, C0405hk hkVar) {
        this.f1181 = r1;
        this.f1180 = str;
        this.f1179 = hkVar;
    }

    public final void run() {
        C1641 r0 = C1014.f6136;
        if (!r0.f7599.containsKey(this.f1180)) {
            try {
                C1014.f6136.mo4429(this.f1180, (byte[]) C1014.f6158.f677.mo3613("data\\wav\\" + this.f1180, false));
            } catch (C0825tu e) {
                C0592ns.m674("SFX for " + this.f1179.f1151 + " not found: " + e.f5011);
            }
        }
    }
}
