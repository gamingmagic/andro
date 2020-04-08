package p004o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: o.듦 */
class C1930 implements OnItemClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1629 f8715;

    C1930(C1629 r1) {
        this.f8715 = r1;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C1629 r3 = this.f8715;
        r3.f7564.setAdapter(new C1753((C1379[]) C0619oq.m712((T[]) r3.mo4420(), i)));
        r3.mo4418g_();
    }
}
