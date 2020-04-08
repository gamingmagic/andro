package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.cv */
class C0260cv implements OnClickListener {

    /* renamed from: 櫯 */
    private final /* synthetic */ boolean[] f701;

    /* renamed from: 鷭 */
    final /* synthetic */ C0259cu f702;

    C0260cv(C0259cu cuVar, boolean[] zArr) {
        this.f702 = cuVar;
        this.f701 = zArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        synchronized (this.f701) {
            this.f701.notify();
        }
    }
}
