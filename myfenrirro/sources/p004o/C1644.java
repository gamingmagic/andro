package p004o;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.樕 */
class C1644 implements OnClickListener {
    /* access modifiers changed from: 0000 */

    /* renamed from: 鷭 */
    public final /* synthetic */ C1681 f7602;

    C1644(C1681 r1) {
        this.f7602 = r1;
    }

    public final void onClick(View view) {
        if (C1014.f6137.f1636.f6502 != null) {
            this.f7602.mo3538();
            C1014.f6147.f51.f1381.mo3537h_();
            return;
        }
        Builder builder = new Builder(C1014.f6147);
        builder.setTitle(null);
        builder.setMessage("You are not in a party. Do you want to organize your own?");
        builder.setPositiveButton("Yes", new C2018(this));
        builder.setNegativeButton("No", null);
        builder.show();
    }
}
