package p004o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: o.됚 */
class C1918 implements OnItemClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1528 f8630;

    C1918(C1528 r1) {
        this.f8630 = r1;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f8630.mo3538();
        this.f8630.f7283.mo3669((C0512ky) this.f8630.f7284.getItemAtPosition(i));
    }
}
