package p004o;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

/* renamed from: o.ԅ */
class C1298 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1896 f6482;

    C1298(C1896 r1) {
        this.f6482 = r1;
    }

    public final void onClick(View view) {
        C1896 r5 = this.f6482;
        Builder builder = new Builder(C1014.f6147);
        C0252cp cpVar = C1014.f6158;
        String r3 = C1014.f6160.mo3796(524);
        builder.setMessage(r3 == null ? "MSG524" : r3);
        EditText editText = new EditText(C1014.f6147);
        builder.setView(editText);
        builder.setPositiveButton("OK", new C1306(r5, editText));
        builder.setNegativeButton("Cancel", null);
        builder.show();
    }
}
