package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.kb */
class C0488kb implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0453ix f1530;

    C0488kb(C0453ix ixVar) {
        this.f1530 = ixVar;
    }

    public final void onClick(View view) {
        C1746 r2 = this.f1530.f1427;
        if (r2.f8028.getVisibility() == 0) {
            r2.mo3538();
        } else {
            r2.mo3537h_();
        }
    }
}
