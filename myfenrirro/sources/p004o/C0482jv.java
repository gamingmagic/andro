package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.jv */
class C0482jv implements OnClickListener {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ short f1514;

    /* renamed from: 櫯 */
    private final /* synthetic */ String[] f1515;

    /* renamed from: 鷭 */
    final /* synthetic */ C0453ix f1516;

    C0482jv(C0453ix ixVar, String[] strArr, short s) {
        this.f1516 = ixVar;
        this.f1515 = strArr;
        this.f1514 = s;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == this.f1515.length - 1) {
            C1014.f6144.mo3652((C0839ue) new C1440(this.f1514, "cancel"));
            C1014.f6144.mo3652((C0839ue) new C1636());
            return;
        }
        C1014.f6144.mo3652((C0839ue) new C1440(this.f1514, this.f1515[i]));
    }
}
