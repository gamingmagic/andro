package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.kv */
class C0509kv implements OnClickListener {
    /* access modifiers changed from: 0000 */

    /* renamed from: 鷭 */
    public final /* synthetic */ C0500kn f1584;

    C0509kv(C0500kn knVar) {
        this.f1584 = knVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case 0:
                C0500kn.m522(this.f1584);
                return;
            case 1:
                C0500kn.m524(this.f1584);
                return;
            case 2:
                C1014.f6147.mo3387((Runnable) new C0510kw(this));
                break;
        }
    }
}
