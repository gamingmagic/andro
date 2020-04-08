package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.ic */
class C0430ic implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0429ib f1271;

    C0430ic(C0429ib ibVar) {
        this.f1271 = ibVar;
    }

    public final void onClick(View view) {
        C1328 r4;
        View view2 = view;
        C0429ib ibVar = this.f1271;
        if (view2 == ibVar.f1267) {
            r4 = C1328.STR;
        } else if (view2 == ibVar.f1261) {
            r4 = C1328.AGI;
        } else if (view2 == ibVar.f1268) {
            r4 = C1328.VIT;
        } else if (view2 == ibVar.f1258) {
            r4 = C1328.INT;
        } else if (view2 == ibVar.f1264) {
            r4 = C1328.DEX;
        } else if (view2 == ibVar.f1247) {
            r4 = C1328.LUK;
        } else {
            C0592ns.m674("Unexpected view pressed " + view2);
            return;
        }
        C1014.f6144.mo3652((C0839ue) new C1679(r4));
    }
}
