package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.la */
class C0516la implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0512ky f1620;

    C0516la(C0512ky kyVar) {
        this.f1620 = kyVar;
    }

    public final void onClick(View view) {
        C0512ky kyVar = this.f1620;
        try {
            int parseInt = Integer.parseInt(kyVar.f1594.f7750.getText().toString());
            if (parseInt > 0) {
                if (parseInt > kyVar.f1595.f8846) {
                    parseInt = kyVar.f1595.f8846;
                }
                kyVar.mo3938(kyVar.f1597, parseInt);
            }
        } catch (NumberFormatException unused) {
        }
    }
}
