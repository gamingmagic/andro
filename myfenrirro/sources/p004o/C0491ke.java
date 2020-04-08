package p004o;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.ke */
class C0491ke implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0453ix f1533;

    C0491ke(C0453ix ixVar) {
        this.f1533 = ixVar;
    }

    public final void onClick(View view) {
        if (C1014.f6137.f1636.f6548 == null) {
            Builder builder = new Builder(C1014.f6147);
            builder.setMessage("Skill information not loaded. Please try again later");
            builder.show();
            return;
        }
        if (!(this.f1533.f1435.f1626.getParent() != null)) {
            this.f1533.f1435.mo3537h_();
        } else {
            this.f1533.f1435.mo3538();
        }
    }
}
