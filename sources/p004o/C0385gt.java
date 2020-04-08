package p004o;

import android.view.View;
import android.view.View.OnClickListener;
import com.roworkshop.andro.c_activity;

/* renamed from: o.gt */
class C0385gt implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0383gr f1092;

    C0385gt(C0383gr grVar) {
        this.f1092 = grVar;
    }

    public final void onClick(View view) {
        c_activity c_activity = C1014.f6147;
        C0453ix.m482(this.f1092.f1087.f1053, this.f1092.f1084.getVisibility() == 0 ? this.f1092.f1084.getProgress() + 1 : this.f1092.f1087.f1051);
        this.f1092.mo3538();
        C1014.f6147.f51.f1435.mo3538();
    }
}
