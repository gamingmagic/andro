package p004o;

/* renamed from: o.ˮ̛ */
class C1220 implements C0597nx {

    /* renamed from: 櫯 */
    private final /* synthetic */ C1992[] f6344;

    /* renamed from: 鷭 */
    final /* synthetic */ C1218 f6345;

    C1220(C1218 r1, C1992[] r2) {
        this.f6345 = r1;
        this.f6344 = r2;
    }

    /* renamed from: 鷭 */
    public final void mo3669(C0512ky kyVar) {
        short s = 0;
        int i = 0;
        while (true) {
            if (i >= this.f6344.length) {
                break;
            } else if (kyVar.f1595.mo4615(C1014.f6158.f674.f608).equals(this.f6344[i].mo4615(C1014.f6158.f674.f608))) {
                s = this.f6345.f6338[i].f6343;
                break;
            } else {
                i++;
            }
        }
        C1014.f6144.mo3652((C0839ue) new C1065(s));
    }

    /* renamed from: 鷭 */
    public final void mo3668() {
        C1014.f6144.mo3652((C0839ue) new C1065(0));
    }
}
