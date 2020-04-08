package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: o.ʈ */
class C1157 implements OnCancelListener {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ int f6255;

    /* renamed from: 櫯 */
    private final /* synthetic */ int f6256;

    /* renamed from: 鷭 */
    final /* synthetic */ C1869 f6257;

    C1157(C1869 r1, int i, int i2) {
        this.f6257 = r1;
        this.f6256 = i;
        this.f6255 = i2;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C1014.f6144.mo3652((C0839ue) new C2008(this.f6256, this.f6255, false));
    }
}
