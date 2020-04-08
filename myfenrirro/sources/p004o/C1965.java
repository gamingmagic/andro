package p004o;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.묜 */
class C1965 implements OnClickListener {
    /* access modifiers changed from: 0000 */

    /* renamed from: 鷭 */
    public final /* synthetic */ C1681 f8763;

    C1965(C1681 r1) {
        this.f8763 = r1;
    }

    public final void onClick(View view) {
        if (C1014.f6137 != null && C1014.f6137.f1636 != null) {
            if (C1014.f6137.f1636.f8637 == 0) {
                Builder builder = new Builder(C1014.f6147);
                builder.setMessage("Do you want to create a Guild?");
                builder.setPositiveButton("Yes", new C1794(this));
                builder.setNegativeButton("No", null);
                builder.show();
                return;
            }
            this.f8763.mo3538();
            C1014.f6147.f51.f1383.mo3537h_();
        }
    }
}
