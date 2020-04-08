package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.kd */
class C0490kd implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0453ix f1532;

    C0490kd(C0453ix ixVar) {
        this.f1532 = ixVar;
    }

    public final void onClick(View view) {
        if (this.f1532.f1416.f1626.getParent() != null) {
            C0234cb cbVar = this.f1532.f1416;
            cbVar.mo3538();
            cbVar.f544.mo3537h_();
            return;
        }
        if (this.f1532.f1416.f544.f1626.getParent() != null) {
            this.f1532.f1416.f544.mo3538();
        } else {
            this.f1532.f1416.mo3537h_();
        }
    }
}
