package p004o;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

/* renamed from: o.䐼 */
class C1460 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1681 f7119;

    C1460(C1681 r1) {
        this.f7119 = r1;
    }

    public final void onClick(View view) {
        String editable = this.f7119.f7708.f7750.getText().toString();
        if (editable == null || editable.length() < 4) {
            Toast.makeText(C1014.f6147, "Guild name is too short", 1).show();
        } else {
            C1014.f6144.mo3652((C0839ue) new C1039(editable));
        }
    }
}
