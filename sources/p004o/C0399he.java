package p004o;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

/* renamed from: o.he */
class C0399he implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0396hc f1132;

    C0399he(C0396hc hcVar) {
        this.f1132 = hcVar;
    }

    public final void onClick(View view) {
        int r3 = ((C0400hf) this.f1132.f1124.getAdapter()).mo3774((RelativeLayout) view);
        if (r3 >= 0) {
            this.f1132.mo3767(r3);
        }
    }
}
