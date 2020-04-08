package p004o;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: o.gh */
class C0369gh implements TextWatcher {

    /* renamed from: 鷭 */
    final /* synthetic */ C0368 f1015;

    C0369gh(C0368 r1) {
        this.f1015 = r1;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        this.f1015.f1006 = editable.toString();
    }
}
