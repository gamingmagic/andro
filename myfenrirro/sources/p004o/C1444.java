package p004o;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

/* renamed from: o.䁄 */
class C1444 implements OnKeyListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1695 f7066;

    C1444(C1695 r1) {
        this.f7066 = r1;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 66 || keyEvent.getAction() != 1) {
            return false;
        }
        C1695 r3 = this.f7066;
        r3.f7746.onClick(r3.f7750);
        r3.mo3538();
        return true;
    }
}
