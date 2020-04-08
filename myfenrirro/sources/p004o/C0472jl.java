package p004o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

/* renamed from: o.jl */
class C0472jl implements OnItemSelectedListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0453ix f1498;

    C0472jl(C0453ix ixVar) {
        this.f1498 = ixVar;
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C1014.f6160.mo3805("last_char_server", 0, String.valueOf(i));
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
