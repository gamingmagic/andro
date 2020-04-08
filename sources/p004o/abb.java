package p004o;

import android.widget.TextView;
import net.hockeyapp.android.UpdateActivity;
import p004o.aay.C0165;

/* renamed from: o.abb */
public class abb extends abn {

    /* renamed from: ȃ */
    final /* synthetic */ UpdateActivity f157;

    /* renamed from: ˮ͈ */
    final /* synthetic */ String f158;

    /* renamed from: 櫯 */
    final /* synthetic */ String f159;

    /* renamed from: 鷭 */
    final /* synthetic */ TextView f160;

    public abb(UpdateActivity updateActivity, TextView textView, String str, String str2) {
        this.f157 = updateActivity;
        this.f160 = textView;
        this.f159 = str;
        this.f158 = str2;
    }

    /* renamed from: 鷭 */
    public final void mo3449(acg acg) {
        if (acg instanceof acj) {
            long j = ((acj) acg).f273;
            String str = String.format("%.2f", new Object[]{Float.valueOf(((float) j) / 1048576.0f)}) + " MB";
            this.f160.setText(this.f157.getString(C0165.hockeyapp_update_version_details_label, new Object[]{this.f159, this.f158, str}));
        }
    }
}
