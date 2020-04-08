package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.cr */
class C0256cr implements OnClickListener {

    /* renamed from: 櫯 */
    private final /* synthetic */ boolean[] f692;

    /* renamed from: 鷭 */
    final /* synthetic */ C0255cq f693;

    C0256cr(C0255cq cqVar, boolean[] zArr) {
        this.f693 = cqVar;
        this.f692 = zArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f692[0] = true;
    }
}
