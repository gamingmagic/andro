package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.ea */
class C0296ea implements OnClickListener {

    /* renamed from: 櫯 */
    private final /* synthetic */ C0512ky f811;

    /* renamed from: 鷭 */
    final /* synthetic */ C0294dz f812;

    C0296ea(C0294dz dzVar, C0512ky kyVar) {
        this.f812 = dzVar;
        this.f811 = kyVar;
    }

    public final void onClick(View view) {
        int parseInt = Integer.parseInt(this.f812.f809.f798.f7750.getText().toString());
        if (parseInt > 0 && parseInt <= this.f811.f1595.f8846) {
            C1014.f6144.mo3652((C0839ue) new C1068(this.f811.f1598, parseInt));
        }
    }
}
