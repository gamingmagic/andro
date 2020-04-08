package p004o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: o.栓 */
class C1635 implements OnItemClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1315 f7589;

    C1635(C1315 r1) {
        this.f7589 = r1;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f7589.mo3538();
        this.f7589.f6613.mo3669((C0512ky) this.f7589.f6616.getItemAtPosition(i));
    }
}
