package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: o.kl */
class C0498kl implements OnCancelListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0455 f1540;

    C0498kl(C0455 r1) {
        this.f1540 = r1;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f1540.f1466 = null;
        C0453ix.this.f1432.mo3538();
        C0453ix.this.f1387.mo3538();
        if (C1014.f6144 != null) {
            C1014.f6144.mo3652((C0839ue) new C1610(this.f1540.f1465, -1));
        }
    }
}
