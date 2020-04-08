package p004o;

import android.widget.TextView;
import p004o.aay.C0165;

/* renamed from: o.abh */
class abh extends abn {

    /* renamed from: ȃ */
    final /* synthetic */ abg f169;

    /* renamed from: ˮ͈ */
    final /* synthetic */ String f170;

    /* renamed from: 櫯 */
    final /* synthetic */ String f171;

    /* renamed from: 鷭 */
    final /* synthetic */ TextView f172;

    abh(abg abg, TextView textView, String str, String str2) {
        this.f169 = abg;
        this.f172 = textView;
        this.f171 = str;
        this.f170 = str2;
    }

    /* renamed from: 鷭 */
    public final void mo3449(acg acg) {
        if (acg instanceof acj) {
            long j = ((acj) acg).f273;
            String str = String.format("%.2f", new Object[]{Float.valueOf(((float) j) / 1048576.0f)}) + " MB";
            this.f172.setText(this.f169.getString(C0165.hockeyapp_update_version_details_label, new Object[]{this.f171, this.f170, str}));
        }
    }
}
