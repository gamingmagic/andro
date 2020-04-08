package p004o;

import android.app.AlertDialog.Builder;
import android.widget.EditText;

/* renamed from: o.ff */
final class C0338ff extends C0329ex {

    /* renamed from: ą */
    String f911;

    /* renamed from: Ć */
    String f912;

    C0338ff(String str, String str2, String str3) {
        this.f911 = str2;
        this.f912 = str3;
        String str4 = str;
        this.f897 = str4;
        this.f896 = str3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3700() {
        Builder builder = new Builder(C1014.f6147);
        builder.setTitle(this.f897);
        EditText editText = new EditText(C1014.f6147);
        editText.setText(this.f912);
        builder.setView(editText);
        builder.setPositiveButton("OK", new C0339fg(this, editText));
        builder.show();
    }
}
