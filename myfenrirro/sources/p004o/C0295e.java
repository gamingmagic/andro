package p004o;

import android.view.View;
import android.view.View.OnClickListener;
import com.roworkshop.andro.c_activity;

/* renamed from: o.e */
class C0295e implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0265d f810;

    C0295e(C0265d dVar) {
        this.f810 = dVar;
    }

    public final void onClick(View view) {
        C0265d dVar = this.f810;
        c_activity c_activity = (c_activity) dVar.f714.getContext();
        C1014.f6144.mo3652((C0839ue) new C1576(dVar.f711, false));
        c_activity.f51.f1412.removeView(dVar.f714);
    }
}
