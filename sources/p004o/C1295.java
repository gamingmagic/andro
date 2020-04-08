package p004o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: o.Ӎ */
class C1295 implements OnItemClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1331 f6479;

    C1295(C1331 r1) {
        this.f6479 = r1;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C1014.f6144.mo3652((C0839ue) new C1775(((C1340) this.f6479.f6858.getItemAtPosition(i)).f6872));
        this.f6479.mo3538();
    }
}
