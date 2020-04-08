package p004o;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;

/* renamed from: o.鬒 */
class C1832 implements OnItemLongClickListener {
    /* access modifiers changed from: 0000 */

    /* renamed from: 鷭 */
    public final /* synthetic */ C1331 f8420;

    C1832(C1331 r1) {
        this.f8420 = r1;
    }

    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        C1340 r4 = (C1340) this.f8420.f6858.getItemAtPosition(i);
        Builder builder = new Builder(C1014.f6147);
        builder.setTitle(r4.f6872.name());
        builder.setIcon(r4.f6870.getDrawable());
        builder.setItems(new String[]{"Use", "Hotkey"}, new C1886(this, r4));
        builder.show();
        return true;
    }
}
