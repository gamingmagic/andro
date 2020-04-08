package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.fz */
class C0359fz implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0357fy f988;

    C0359fz(C0357fy fyVar) {
        this.f988 = fyVar;
    }

    public final void onClick(View view) {
        int i;
        try {
            i = Integer.parseInt(this.f988.f980.f7750.getText().toString());
        } catch (NumberFormatException unused) {
            i = 1;
        }
        this.f988.mo3728(this.f988.f975, i);
    }
}
