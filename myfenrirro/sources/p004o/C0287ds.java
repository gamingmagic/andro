package p004o;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.roworkshop.andro.c_activity;

/* renamed from: o.ds */
class C0287ds implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0286dr f786;

    C0287ds(C0286dr drVar) {
        this.f786 = drVar;
    }

    public final void onClick(View view) {
        if (this.f786.f780 > 0 || (this.f786.f778 != null && this.f786.f778.length > 0)) {
            c_activity c_activity = C1014.f6147;
            C0252cp cpVar = C1014.f6158;
            String r6 = C1014.f6160.mo3796(2613);
            Toast.makeText(c_activity, r6 == null ? "MSG2613" : r6, 0).show();
            return;
        }
        C1014.f6144.mo3652((C0839ue) new C1070(this.f786.f782.f8783, this.f786.f782.f8782));
    }
}
