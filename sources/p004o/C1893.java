package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.꽵 */
class C1893 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1907 f8528;

    C1893(C1907 r1) {
        this.f8528 = r1;
    }

    public final void onClick(View view) {
        C1907 r0 = this.f8528;
        C0252cp cpVar = C1014.f6158;
        int i = this.f8528.f8591 + 1;
        while (i < 0) {
            i += 9;
        }
        while (i > 8) {
            i -= 9;
        }
        r0.f8591 = i;
        this.f8528.mo4565();
    }
}
