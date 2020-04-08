package p004o;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnLongClickListener;

/* renamed from: o.jd */
class C0464jd implements OnLongClickListener {
    /* access modifiers changed from: 0000 */

    /* renamed from: 鷭 */
    public final /* synthetic */ C0453ix f1485;

    C0464jd(C0453ix ixVar) {
        this.f1485 = ixVar;
    }

    public final boolean onLongClick(View view) {
        Builder builder = new Builder(C1014.f6147);
        if (C1014.f6147.f51.f1457 == null) {
            return false;
        }
        builder.setItems(new String[]{"Clear hotkey", "Cancel"}, new C0465je(this));
        builder.show();
        return true;
    }
}
