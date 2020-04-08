package p004o;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: o.ap */
class C0193ap implements OnCheckedChangeListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0192ao f419;

    C0193ap(C0192ao aoVar) {
        this.f419 = aoVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            if (compoundButton == this.f419.f407) {
                this.f419.f416 = C0579nf.EACH_TAKE;
                this.f419.f400.setChecked(false);
                return;
            }
            this.f419.f416 = C0579nf.EVEN_SHARE;
            this.f419.f407.setChecked(false);
        }
    }
}
