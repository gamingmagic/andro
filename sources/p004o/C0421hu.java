package p004o;

import android.content.pm.PackageManager.NameNotFoundException;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;

/* renamed from: o.hu */
public final class C0421hu extends C0499km {

    /* renamed from: Ą */
    private Button f1217;

    /* renamed from: ą */
    private Button f1218;

    /* renamed from: Ć */
    private Button f1219;

    /* renamed from: ć */
    private OnClickListener f1220 = new C0422hv(this);

    /* renamed from: ȃ */
    private TextView f1221;

    /* renamed from: ˮ͈ */
    private TextView f1222;

    /* renamed from: ˮ͍ */
    private OnClickListener f1223 = new C0423hw(this);

    /* renamed from: 岱 */
    private OnClickListener f1224 = new C0424hx(this);

    /* renamed from: 櫯 */
    private RelativeLayout f1225;

    /* renamed from: 鷭 */
    public c_activity f1226;

    C0421hu(c_activity c_activity) {
        this.f1226 = c_activity;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ȃ */
    public final void mo3812() {
        if (C1014.f6147.f48 != null) {
            this.f1221.setVisibility(0);
            this.f1221.setMovementMethod(LinkMovementMethod.getInstance());
            C0252cp cpVar = C1014.f6158;
            String r3 = C1014.f6160.mo3796(311);
            this.f1221.setText(Html.fromHtml(new StringBuilder(String.valueOf(r3 == null ? "MSG311" : r3)).append("<br><a href='").append(C1014.f6147.f48).append("'>Download latest APK</a>").toString()));
            return;
        }
        this.f1221.setVisibility(4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final boolean mo3539() {
        View findViewById = ((ViewGroup) this.f1226.findViewById(16908290)).findViewById(R.id.relativeLayout1);
        return findViewById != null && findViewById == this.f1225;
    }

    /* renamed from: h_ */
    public final void mo3537h_() {
        this.f1226.setContentView(R.layout.start);
        this.f1225 = (RelativeLayout) this.f1226.findViewById(R.id.relativeLayout1);
        this.f1222 = (TextView) this.f1226.findViewById(R.id.tv_version);
        this.f1221 = (TextView) this.f1226.findViewById(R.id.tv_update);
        this.f1217 = (Button) this.f1226.findViewById(R.id.tv_startgame);
        this.f1218 = (Button) this.f1226.findViewById(R.id.btn_settings);
        this.f1219 = (Button) this.f1226.findViewById(R.id.btn_updatefeedback);
        this.f1217.setOnClickListener(this.f1220);
        this.f1218.setOnClickListener(this.f1223);
        this.f1219.setOnClickListener(this.f1224);
        try {
            this.f1222.setText("v" + this.f1226.getPackageManager().getPackageInfo(C1014.f6147.getPackageName(), 0).versionName);
        } catch (NameNotFoundException unused) {
        }
        C0453ix.m477(R.id.relativeLayout1);
        mo3812();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final void mo3538() {
    }
}
