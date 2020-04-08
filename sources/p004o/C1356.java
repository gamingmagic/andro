package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.ኾ */
class C1356 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1941 f6898;

    C1356(C1941 r1) {
        this.f6898 = r1;
    }

    public final void onClick(View view) {
        C1942 r0;
        C1942 r8;
        View view2 = view;
        C1942[] r6 = this.f6898.f8726;
        int length = r6.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r0 = null;
                break;
            }
            r8 = r6[i];
            if (view2 == r8.f8732 || view2 == r8.f8727 || view2 == r8.f8734) {
                r0 = r8;
            } else {
                i++;
            }
        }
        r0 = r8;
        C1942 r82 = r0;
        if (r0 != null) {
            C1014.f6144.mo3652((C0839ue) new C1088((short) r82.f8729));
        }
    }
}
