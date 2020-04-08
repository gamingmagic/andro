package p004o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: o.藐 */
class C1743 implements OnItemClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1536 f8020;

    C1743(C1536 r1) {
        this.f8020 = r1;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f8020.mo4384(((C1538) adapterView.getItemAtPosition(i)).f7325);
    }
}
