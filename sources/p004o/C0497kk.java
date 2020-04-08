package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.kk */
class C0497kk implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0455 f1539;

    C0497kk(C0455 r1) {
        this.f1539 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1539.f1466 = null;
        if (C1014.f6144 != null) {
            C1014.f6144.mo3652((C0839ue) new C1610(this.f1539.f1465, (byte) (i + 1)));
        }
    }
}
