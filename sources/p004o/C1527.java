package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.兙 */
class C1527 implements OnClickListener {

    /* renamed from: 櫯 */
    private final /* synthetic */ int f7280;

    /* renamed from: 鷭 */
    final /* synthetic */ C1978 f7281;

    C1527(C1978 r1, int i) {
        this.f7281 = r1;
        this.f7280 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C1978 r3 = this.f7281;
        r3.mo4599(new C1992((int) (short) r3.f8806.f8845[this.f7280]));
    }
}
