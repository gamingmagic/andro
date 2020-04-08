package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.dw */
class C0291dw implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0290dv f806;

    C0291dw(C0290dv dvVar) {
        this.f806 = dvVar;
    }

    public final void onClick(View view) {
        String editable = this.f806.f805.getText().toString();
        if (editable.length() <= 0) {
            C1746 r0 = C1014.f6147.f51.f1427;
            C0252cp cpVar = C1014.f6158;
            String r4 = C1014.f6160.mo3796(2596);
            r0.mo4490(r4 == null ? "MSG2596" : r4, 16776960);
            return;
        }
        C1014.f6144.mo3652((C0839ue) new C1674(editable));
    }
}
