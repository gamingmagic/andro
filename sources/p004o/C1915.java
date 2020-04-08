package p004o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;

/* renamed from: o.뎲 */
class C1915 implements OnItemLongClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1291 f8610;

    C1915(C1291 r1) {
        this.f8610 = r1;
    }

    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f8610.mo4279(i);
        return true;
    }
}
