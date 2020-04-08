package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.ko */
class C0502ko implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0500kn f1575;

    C0502ko(C0500kn knVar) {
        this.f1575 = knVar;
    }

    public final void onClick(View view) {
        if (this.f1575.f1566 == C0501.SKILL) {
            C0500kn.m534(this.f1575);
        } else if (this.f1575.f1566 == C0501.ITEM) {
            C0500kn.m532(this.f1575);
        } else if (this.f1575.f1566 == C0501.EMOTION) {
            C1014.f6144.mo3652((C0839ue) new C1775(C0569mw.values()[this.f1575.f1558]));
        } else if (this.f1575.f1566 == C0501.HOMUN) {
            C0500kn.m527(this.f1575);
        } else if (this.f1575.f1566 == C0501.MERC) {
            C0500kn.m519(this.f1575);
        } else if (this.f1575.f1566 == C0501.GAMEMENU) {
            C1014.f6147.f51.f1442.mo4384(C1537if.values()[this.f1575.f1558]);
        } else {
            C0592ns.m674("unexpceted hotkey type" + this.f1575.f1566);
        }
    }
}
