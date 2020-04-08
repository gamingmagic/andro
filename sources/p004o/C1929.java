package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.뒷 */
class C1929 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1907 f8714;

    C1929(C1907 r1) {
        this.f8714 = r1;
    }

    public final void onClick(View view) {
        C1907 r0 = this.f8714;
        C0252cp cpVar = C1014.f6158;
        int i = this.f8714.f8591 - 1;
        while (i < 0) {
            i += 9;
        }
        while (i > 8) {
            i -= 9;
        }
        r0.f8591 = i;
        this.f8714.mo4565();
    }
}
