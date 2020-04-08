package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: o.ʔ */
class C1166 implements OnCancelListener {

    /* renamed from: 櫯 */
    private final /* synthetic */ int f6271;

    /* renamed from: 鷭 */
    final /* synthetic */ C1769 f6272;

    C1166(C1769 r1, int i) {
        this.f6272 = r1;
        this.f6271 = i;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C1014.f6144.mo3652((C0839ue) new C1038(this.f6271, false));
    }
}
