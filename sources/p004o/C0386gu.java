package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.gu */
class C0386gu implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0383gr f1093;

    C0386gu(C0383gr grVar) {
        this.f1093 = grVar;
    }

    public final void onClick(View view) {
        C0383gr grVar = this.f1093;
        C1014.f6147.f51.mo3876(C0501.SKILL, grVar.f1087.f1053, grVar.f1084.getVisibility() == 0 ? grVar.f1084.getProgress() + 1 : grVar.f1087.f1051, 0, 0);
        grVar.mo3538();
        C1014.f6147.f51.f1435.mo3538();
    }
}
