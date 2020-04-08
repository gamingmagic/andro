package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.ҏ */
class C1287 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1724 f6453;

    C1287(C1724 r1) {
        this.f6453 = r1;
    }

    public final void onClick(View view) {
        try {
            C1014.f6144.mo3652((C0839ue) new C1059(Integer.parseInt(this.f6453.f7955.getText().toString())));
        } catch (NumberFormatException unused) {
        }
    }
}
