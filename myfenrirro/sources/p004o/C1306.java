package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;

/* renamed from: o.յ */
class C1306 implements OnClickListener {

    /* renamed from: 櫯 */
    private final /* synthetic */ EditText f6600;

    /* renamed from: 鷭 */
    final /* synthetic */ C1896 f6601;

    C1306(C1896 r1, EditText editText) {
        this.f6601 = r1;
        this.f6600 = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C1014.f6144.mo3652((C0839ue) new C1438(this.f6600.getText().toString()));
    }
}
