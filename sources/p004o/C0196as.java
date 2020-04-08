package p004o;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

/* renamed from: o.as */
class C0196as implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0192ao f422;

    C0196as(C0192ao aoVar) {
        this.f422 = aoVar;
    }

    public final void onClick(View view) {
        String editable = this.f422.f415.getText().toString();
        if (editable == null || editable.length() < 4) {
            Toast.makeText(C1014.f6147, "Name is too short.", 1).show();
        } else {
            C1014.f6144.mo3652((C0839ue) new C1998(editable, this.f422.f412, this.f422.f417));
        }
    }
}
