package p004o;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: o.钇 */
class C1787 implements OnCheckedChangeListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1916 f8317;

    C1787(C1916 r1) {
        this.f8317 = r1;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C1014.f6160.mo3805("save_login", 0, String.valueOf(z));
        if (!z) {
            this.f8317.f8616.setChecked(false);
        }
    }
}
