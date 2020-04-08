package p004o;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.gw */
class C0389gw implements OnClickListener {
    /* access modifiers changed from: 0000 */

    /* renamed from: 鷭 */
    public final /* synthetic */ C0387gv f1109;

    C0389gw(C0387gv gvVar) {
        this.f1109 = gvVar;
    }

    public final void onClick(View view) {
        C0381gq r5 = C1014.f6158.f674.f609.mo3752(this.f1109.f1104.f1053);
        if (C0595nv.f2880) {
            C1014.f6144.mo3652((C0839ue) new C1344(this.f1109.f1104.f1053));
            return;
        }
        Builder builder = new Builder(C1014.f6147);
        builder.setTitle(null);
        builder.setMessage("Are you sure you want to learn " + r5.f1071 + " [Lv. " + (this.f1109.f1104.f1051 + 1) + "] ?");
        builder.setPositiveButton("Yes", new C0390gx(this));
        builder.setNegativeButton("No", new C0391gy(this));
        builder.show();
    }
}
