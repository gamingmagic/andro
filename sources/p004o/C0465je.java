package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.je */
class C0465je implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0464jd f1486;

    C0465je(C0464jd jdVar) {
        this.f1486 = jdVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            C0453ix r3 = this.f1486.f1485;
            r3.f1457 = null;
            r3.f1426.setVisibility(8);
            r3.f1447.setVisibility(8);
            r3.mo3864();
        }
    }
}
