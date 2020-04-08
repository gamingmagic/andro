package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: o.㥲 */
class C1421 implements OnCancelListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1624 f6992;

    C1421(C1624 r1) {
        this.f6992 = r1;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        throw new C0822tr("Disconnected from master-server", false);
    }
}
