package p004o;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: o.웹 */
class C1997 implements OnCheckedChangeListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1907 f8863;

    C1997(C1907 r1) {
        this.f8863 = r1;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            if (compoundButton == this.f8863.f8587) {
                this.f8863.f8594.setChecked(false);
            } else if (compoundButton == this.f8863.f8594) {
                this.f8863.f8587.setChecked(false);
            }
            this.f8863.mo4565();
        }
    }
}
