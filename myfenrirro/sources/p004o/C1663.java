package p004o;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.湟 */
class C1663 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1629 f7641;

    C1663(C1629 r1) {
        this.f7641 = r1;
    }

    public final void onClick(View view) {
        new Builder(C1014.f6147).setMessage("Cash points can be purchased from character selection screen").show();
    }
}
