package p004o;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import com.roworkshop.andro.c_activity;

/* renamed from: o.hg */
class C0401hg implements OnClickListener {
    /* access modifiers changed from: 0000 */

    /* renamed from: 鷭 */
    public final /* synthetic */ C0400hf f1136;

    C0401hg(C0400hf hfVar) {
        this.f1136 = hfVar;
    }

    public final void onClick(View view) {
        c_activity c_activity = (c_activity) view.getContext();
        int r5 = this.f1136.mo3774((RelativeLayout) view.getParent());
        if (r5 != -1) {
            if (C0595nv.f2880) {
                C1014.f6144.mo3652((C0839ue) new C1344(this.f1136.f1135[r5].f2974.f1053));
                return;
            }
            Builder builder = new Builder(c_activity);
            Builder builder2 = builder;
            builder.setTitle(null);
            builder2.setMessage("Are you sure you want to learn " + this.f1136.f1135[r5].f2973.f1071 + " [Lv. " + (this.f1136.f1135[r5].f2974.f1051 + 1) + "] ?");
            builder2.setPositiveButton("Yes", new C0402hh(this, r5));
            builder2.setNegativeButton("No", new C0403hi(this));
            builder2.create().show();
        }
    }
}
