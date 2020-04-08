package p004o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: o.ez */
class C0331ez implements OnItemClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0330ey f900;

    C0331ez(C0330ey eyVar) {
        this.f900 = eyVar;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0329ex) this.f900.f899.getItemAtPosition(i)).mo3700();
    }
}
