package p004o;

import android.view.View;
import android.view.View.OnClickListener;
import com.roworkshop.andro.c_activity;

/* renamed from: o.f */
class C0332f implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0265d f901;

    C0332f(C0265d dVar) {
        this.f901 = dVar;
    }

    public final void onClick(View view) {
        C0265d dVar = this.f901;
        c_activity c_activity = (c_activity) dVar.f714.getContext();
        C1014.f6144.mo3652((C0839ue) new C1576(dVar.f711, true));
        c_activity.f51.f1412.removeView(dVar.f714);
    }
}
