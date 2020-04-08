package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.q */
class C0681q implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0546m f4630;

    C0681q(C0546m mVar) {
        this.f4630 = mVar;
    }

    public final void onClick(View view) {
        try {
            this.f4630.mo4012(Integer.parseInt(this.f4630.f1753.f7750.getText().toString()));
        } catch (NumberFormatException unused) {
        }
    }
}
