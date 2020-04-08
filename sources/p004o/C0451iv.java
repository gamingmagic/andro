package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.iv */
class C0451iv implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0448is f1364;

    C0451iv(C0448is isVar) {
        this.f1364 = isVar;
    }

    public final void onClick(View view) {
        this.f1364.f1351.setEnabled(false);
        if (this.f1364.f1355.isEnabled()) {
            this.f1364.f1355.setEnabled(false);
            try {
                this.f1364.f1358 = Math.min(C1014.f6137.f1636.f6542, Integer.parseInt(this.f1364.f1352.getText().toString()));
            } catch (NumberFormatException unused) {
                this.f1364.f1358 = 0;
            }
            if (this.f1364.f1358 > 0) {
                C1014.f6144.mo3652((C0839ue) new C1792(-2, this.f1364.f1358));
            }
            C1014.f6144.mo3652((C0839ue) new C1543());
            return;
        }
        C1014.f6144.mo3652((C0839ue) new C1721());
    }
}
