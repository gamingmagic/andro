package p004o;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: o.襑 */
class C1750 implements OnCheckedChangeListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1907 f8038;

    C1750(C1907 r1) {
        this.f8038 = r1;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            if (compoundButton == this.f8038.f8593) {
                this.f8038.f8589.setChecked(false);
            } else if (compoundButton == this.f8038.f8589) {
                this.f8038.f8593.setChecked(false);
            }
            this.f8038.mo4565();
        }
    }
}
