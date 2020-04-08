package p004o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import java.util.Arrays;

/* renamed from: o.ih */
class C0435ih implements OnItemLongClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0432ie f1291;

    C0435ih(C0432ie ieVar) {
        this.f1291 = ieVar;
    }

    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0512ky kyVar = (C0512ky) this.f1291.f1276.getAdapter().getItem(i);
        if (kyVar != null) {
            C0513[] r4 = new C0513[C0513.values().length];
            int i2 = 0 + 1;
            r4[0] = C0513.FROM_STORAGE_TO_INVENTORY;
            C1301 r6 = C1014.f6137.f1636;
            if (r6.f8640.containsKey(C0586nm.ON_PUSH_CART) || (r6.f8646 & 1928) > 0) {
                i2++;
                r4[1] = C0513.FROM_STORAGE_TO_CART;
            }
            int i3 = i2;
            int i4 = i2 + 1;
            r4[i3] = C0513.VIEW;
            kyVar.mo3939((C0513[]) Arrays.copyOf(r4, i4));
        }
        return true;
    }
}
