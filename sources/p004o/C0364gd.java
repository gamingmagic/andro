package p004o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.roworkshop.andro.c_activity;

/* renamed from: o.gd */
class C0364gd implements OnItemLongClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0357fy f998;

    C0364gd(C0357fy fyVar) {
        this.f998 = fyVar;
    }

    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        c_activity c_activity = (c_activity) view.getContext();
        c_activity.f51.f1380.mo4599(((C0353fu) adapterView.getAdapter()).f942[i].f947);
        c_activity.f51.f1380.mo3537h_();
        return true;
    }
}
