package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.jg */
class C0467jg implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0453ix f1488;

    C0467jg(C0453ix ixVar) {
        this.f1488 = ixVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C0567mu[] muVarArr = {C0567mu.HOMUN_INFORM, C0567mu.FEED};
        C1014.f6144.mo3652((C0839ue) new C1310((byte) muVarArr[i].ordinal()));
        if (muVarArr[i].ordinal() == 0) {
            C1014.f6147.f51.f1376.mo3537h_();
        }
    }
}
