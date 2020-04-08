package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: o.搭 */
class C1618 implements OnCancelListener {

    /* renamed from: 櫯 */
    private final /* synthetic */ int f7542;

    /* renamed from: 鷭 */
    final /* synthetic */ C1170 f7543;

    C1618(C1170 r1, int i) {
        this.f7543 = r1;
        this.f7542 = i;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C1014.f6144.mo3652((C0839ue) new C1042(this.f7542, false));
    }
}
