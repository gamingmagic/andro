package p004o;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: o.aq */
class C0194aq implements OnCheckedChangeListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0192ao f420;

    C0194aq(C0192ao aoVar) {
        this.f420 = aoVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            if (compoundButton == this.f420.f402) {
                this.f420.f412 = C0580ng.KILLER;
                this.f420.f403.setChecked(false);
                return;
            }
            this.f420.f412 = C0580ng.ANYONE;
            this.f420.f402.setChecked(false);
        }
    }
}
