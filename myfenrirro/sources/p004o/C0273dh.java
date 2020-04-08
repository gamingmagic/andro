package p004o;

import p004o.C1782.C1786;

/* renamed from: o.dh */
class C0273dh implements C1786 {

    /* renamed from: 鷭 */
    final /* synthetic */ C0271df f731;

    C0273dh(C0271df dfVar) {
        this.f731 = dfVar;
    }

    /* renamed from: 鷭 */
    public final void mo3640(C1530 r3, C1375 r4) {
        this.f731.f726 = null;
        this.f731.f727 = false;
        if (!(r4.f6936 == 0)) {
            C0592ns.m674("Error while consuming: " + r4.f6935);
            return;
        }
        new StringBuilder("Consumption finished. Purchase: ").append(r3).append(", result: ").append(r4);
        C1014.f6147.mo3387((Runnable) new C0473jm(C1014.f6147.f51));
        C0271df dfVar = this.f731;
        C1530 r32 = (C1530) dfVar.f722.poll();
        if (r32 != null) {
            dfVar.mo3639(r32);
        }
    }
}
