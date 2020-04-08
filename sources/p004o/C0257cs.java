package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.cs */
class C0257cs implements OnClickListener {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ boolean[] f694;

    /* renamed from: 櫯 */
    private final /* synthetic */ boolean[] f695;

    /* renamed from: 鷭 */
    final /* synthetic */ C0255cq f696;

    C0257cs(C0255cq cqVar, boolean[] zArr, boolean[] zArr2) {
        this.f696 = cqVar;
        this.f695 = zArr;
        this.f694 = zArr2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f695[0] = true;
        this.f694[0] = true;
    }
}
