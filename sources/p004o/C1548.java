package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.塼 */
class C1548 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1877 f7330;

    C1548(C1877 r1) {
        this.f7330 = r1;
    }

    public final void onClick(View view) {
        C1877 r8 = this.f7330;
        C1646 r5 = (C1646) r8.f8467.getAdapter();
        C1646 r6 = (C1646) r8.f8469.getAdapter();
        if (r5 != null) {
            C1014.f6144.mo3652((C0839ue) new C1439(r8.f8479, r8.f8482, r5.f7605));
            for (int i = 0; i < r6.f7605.size(); i++) {
                ((C1999) r6.f7605.get(i)).f8872.f8846 = ((C1999) r6.f7605.get(i)).f8872.f8846;
            }
            r8.f8484 = 0;
            r8.f8480 = 0;
            r8.f8485 = 0;
            r8.mo3538();
        }
    }
}
