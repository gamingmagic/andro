package p004o;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: o.ᗔ */
class C1361 implements OnCheckedChangeListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1916 f6903;

    C1361(C1916 r1) {
        this.f6903 = r1;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C1014.f6160.mo3805("save_password", 0, String.valueOf(z));
        if (z) {
            this.f6903.f8618.setChecked(true);
        }
    }
}
