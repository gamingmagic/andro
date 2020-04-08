package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

/* renamed from: o.fg */
class C0339fg implements OnClickListener {

    /* renamed from: 櫯 */
    private final /* synthetic */ EditText f913;

    /* renamed from: 鷭 */
    final /* synthetic */ C0338ff f914;

    C0339fg(C0338ff ffVar, EditText editText) {
        this.f914 = ffVar;
        this.f913 = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String editable = this.f913.getText().toString();
        if (editable.length() > 1) {
            Toast.makeText(C1014.f6147, "Prefix' length must be 1 character", 1).show();
            return;
        }
        this.f914.f912 = editable;
        this.f913.setText(this.f914.f912);
        this.f914.f893.setText(this.f914.f912);
        C1014.f6160.mo3805(this.f914.f911, 0, this.f914.f912);
        C1014.f6160.mo3794();
    }
}
