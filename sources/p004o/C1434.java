package p004o;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

/* renamed from: o.㶇 */
class C1434 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1585 f7046;

    C1434(C1585 r1) {
        this.f7046 = r1;
    }

    public final void onClick(View view) {
        C1585 r8 = this.f7046;
        String editable = r8.f7500.getText().toString();
        String editable2 = r8.f7499.getText().toString();
        String editable3 = r8.f7498.getText().toString();
        if (editable != null) {
            editable = editable.trim();
        }
        if (editable3 != null) {
            editable3 = editable3.trim();
        }
        if (editable == null || editable.length() <= 0) {
            Toast.makeText(C1014.f6147, "You should enter a room title", 1).show();
            return;
        }
        byte[] r6 = (editable2 == null || editable2.length() == 0) ? new byte[8] : C0622ot.m749(editable2, C0618op.LOCAL, 8);
        try {
            int parseInt = Integer.parseInt(editable3);
            r8.mo3538();
            C1014.f6144.mo3652((C0839ue) new C1859(parseInt, editable2 != null && editable2.length() > 0, r6, editable));
        } catch (NumberFormatException unused) {
            Toast.makeText(C1014.f6147, "Invalid users count", 1).show();
        }
    }
}
