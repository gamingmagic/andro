package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.귑 */
class C1886 implements OnClickListener {

    /* renamed from: 櫯 */
    private final /* synthetic */ C1340 f8512;

    /* renamed from: 鷭 */
    final /* synthetic */ C1832 f8513;

    C1886(C1832 r1, C1340 r2) {
        this.f8513 = r1;
        this.f8512 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            C1014.f6144.mo3652((C0839ue) new C1775(this.f8512.f6872));
            return;
        }
        C1014.f6147.f51.mo3876(C0501.EMOTION, this.f8512.f6872.ordinal(), -1, 0, 0);
        this.f8513.f8420.mo3538();
    }
}
