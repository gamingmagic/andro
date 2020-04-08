package p004o;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

/* renamed from: o.橻 */
class C1649 implements OnKeyListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1294 f7612;

    C1649(C1294 r1) {
        this.f7612 = r1;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 66 || keyEvent.getAction() != 1) {
            return false;
        }
        this.f7612.mo4283i_();
        return true;
    }
}
