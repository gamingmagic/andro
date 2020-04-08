package p004o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: o.ig */
class C0434ig implements OnItemClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0432ie f1290;

    C0434ig(C0432ie ieVar) {
        this.f1290 = ieVar;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0512ky kyVar = (C0512ky) this.f1290.f1276.getAdapter().getItem(i);
        if (kyVar != null) {
            if (C1014.f6147.f51.f1445.f8434 == C0572mz.CART) {
                kyVar.mo3938(C0513.FROM_STORAGE_TO_CART, -1);
                return;
            }
            kyVar.mo3938(C0513.FROM_STORAGE_TO_INVENTORY, -1);
        }
    }
}
