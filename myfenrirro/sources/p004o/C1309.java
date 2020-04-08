package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.ևֵ */
class C1309 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1724 f6605;

    C1309(C1724 r1) {
        this.f6605 = r1;
    }

    public final void onClick(View view) {
        try {
            C1014.f6144.mo3652((C0839ue) new C1060(Integer.parseInt(this.f6605.f7955.getText().toString())));
        } catch (NumberFormatException unused) {
        }
    }
}
