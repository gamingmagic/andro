package p004o;

/* renamed from: o.퀭 */
class C2031 implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ C0212bg f8925;

    /* renamed from: 鷭 */
    final /* synthetic */ C1642 f8926;

    C2031(C1642 r1, C0212bg bgVar) {
        this.f8926 = r1;
        this.f8925 = bgVar;
    }

    public final void run() {
        C0214bi biVar = C1014.f6148;
        C0599nz nzVar = C1014.f6161.f6165 == null ? null : C1014.f6161.f6165;
        String str = C1014.f6161.f6166.f6181;
        C0212bg bgVar = this.f8925;
        short s = (short) (((bgVar.f489[0] & 255) << 2) | ((bgVar.f489[1] & 255) >> 6));
        C0212bg bgVar2 = this.f8925;
        biVar.mo3564(nzVar, str, s, (short) ((((bgVar2.f489[1] & 255) & 63) << 4) | ((bgVar2.f489[2] & 255) >> 4)));
    }
}
