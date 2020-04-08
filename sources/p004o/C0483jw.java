package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: o.jw */
class C0483jw implements OnCancelListener {

    /* renamed from: 櫯 */
    private final /* synthetic */ short f1517;

    /* renamed from: 鷭 */
    final /* synthetic */ C0453ix f1518;

    C0483jw(C0453ix ixVar, short s) {
        this.f1518 = ixVar;
        this.f1517 = s;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C1014.f6144.mo3652((C0839ue) new C1440(this.f1517, "cancel"));
    }
}
