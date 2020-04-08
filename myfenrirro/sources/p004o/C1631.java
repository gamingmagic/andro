package p004o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: o.枓 */
class C1631 implements OnItemClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1629 f7571;

    C1631(C1629 r1) {
        this.f7571 = r1;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C1629 r1 = this.f7571;
        r1.f7558 = i;
        r1.mo4417f_();
    }
}
