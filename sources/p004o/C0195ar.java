package p004o;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: o.ar */
class C0195ar implements OnCheckedChangeListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0192ao f421;

    C0195ar(C0192ao aoVar) {
        this.f421 = aoVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            if (compoundButton == this.f421.f413) {
                this.f421.f417 = C0581nh.PICKER;
                this.f421.f408.setChecked(false);
                return;
            }
            this.f421.f417 = C0581nh.RANDOM;
            this.f421.f413.setChecked(false);
        }
    }
}
