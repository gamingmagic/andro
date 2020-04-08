package p004o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: o.ὁ */
class C1378 implements OnItemClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C2027 f6938;

    C1378(C2027 r1) {
        this.f6938 = r1;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C2027 r2 = this.f6938;
        r2.f8919 = i;
        r2.f8920.show();
    }
}
