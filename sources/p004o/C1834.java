package p004o;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;

/* renamed from: o.鬠 */
class C1834 implements OnItemLongClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1536 f8421;

    C1834(C1536 r1) {
        this.f8421 = r1;
    }

    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        C1536 r0 = this.f8421;
        C1536 r4 = r0;
        C1537if ifVar = ((C1538) adapterView.getItemAtPosition(i)).f7325;
        C1536 r5 = r0;
        Builder builder = new Builder(C1014.f6147);
        builder.setTitle("Add hotkey");
        builder.setItems(new String[]{"Hotkey"}, new C1809(r5, ifVar));
        builder.show();
        r4.mo3538();
        return true;
    }
}
