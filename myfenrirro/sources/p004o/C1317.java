package p004o;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

/* renamed from: o.ڶ */
class C1317 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1916 f6619;

    C1317(C1916 r1) {
        this.f6619 = r1;
    }

    public final void onClick(View view) {
        C1916 r6 = this.f6619;
        String editable = r6.f8627.getText().toString();
        String editable2 = r6.f8624.getText().toString();
        if (editable.length() < 4) {
            new Builder(C1014.f6147).setTitle(null).setMessage("Login is too short").show();
        } else if (editable2.length() < 4) {
            new Builder(C1014.f6147).setTitle(null).setMessage("Password is too short").show();
        } else {
            InputMethodManager inputMethodManager = (InputMethodManager) C1014.f6147.getSystemService("input_method");
            inputMethodManager.hideSoftInputFromWindow(r6.f8627.getWindowToken(), 0);
            inputMethodManager.hideSoftInputFromWindow(r6.f8624.getWindowToken(), 0);
            C1014.m1843(C1014.f6140, editable, editable2);
        }
    }
}
