package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.厺 */
class C1533 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C2009 f7299;

    C1533(C2009 r1) {
        this.f7299 = r1;
    }

    public final void onClick(View view) {
        C1919 r0;
        C2009 r6 = this.f7299;
        C0520le leVar = (C0520le) C1014.f6137.f1637.get(C1014.f6137.f1636.f6524.f6567.f6595);
        if (leVar == null) {
            r0 = null;
        } else {
            r0 = C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null;
        }
        C1919 r3 = r0;
        if (r0 != null) {
            r6.f8896.setEnabled(false);
            r6.f8896.setInputType(524288);
            r6.f8896.setTextColor(-1);
            r3.f8657 = r6.f8896.getText().toString();
            r6.f8889.setVisibility(4);
            C1014.f6144.mo3652((C0839ue) new C1044(r3.f8657));
        }
    }
}
