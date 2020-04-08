package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.dx */
class C0292dx implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0290dv f807;

    C0292dx(C0290dv dvVar) {
        this.f807 = dvVar;
    }

    public final void onClick(View view) {
        if (this.f807.f805.getText().toString().length() <= 0) {
            C1746 r0 = C1014.f6147.f51.f1427;
            C0252cp cpVar = C1014.f6158;
            String r9 = C1014.f6160.mo3796(2596);
            r0.mo4490(r9 == null ? "MSG2596" : r9, 16776960);
            return;
        }
        String editable = this.f807.f796.getText().toString();
        if (editable.length() < 4 || editable.length() > 50) {
            C1746 r02 = C1014.f6147.f51.f1427;
            C0252cp cpVar2 = C1014.f6158;
            String r92 = C1014.f6160.mo3796(2597);
            r02.mo4490(r92 == null ? "MSG2597" : r92, 16776960);
        } else if (C1014.f6140.f4470 > 20160600) {
            C1014.f6144.mo3652((C0839ue) new C1076(this.f807.f805.getText().toString(), this.f807.mo3661(), this.f807.f796.getText().toString(), this.f807.f794.getText().toString(), this.f807.f804));
        } else {
            C1014.f6144.mo3652((C0839ue) new C1075(this.f807.f805.getText().toString(), this.f807.mo3661(), this.f807.f796.getText().toString(), this.f807.f794.getText().toString()));
        }
    }
}
