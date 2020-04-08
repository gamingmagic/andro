package p004o;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DialogFragment;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.json.JSONArray;
import org.json.JSONException;
import p004o.aay.C0164if;
import p004o.aay.C0165;
import p004o.aay.C0166;

@TargetApi(11)
/* renamed from: o.abg */
public class abg extends DialogFragment implements OnClickListener, abj {

    /* renamed from: ȃ */
    private ada f165;

    /* renamed from: ˮ͈ */
    private String f166;

    /* renamed from: 櫯 */
    private JSONArray f167;

    /* renamed from: 鷭 */
    private acg f168;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.f166 = getArguments().getString("url");
            this.f167 = new JSONArray(getArguments().getString("versionInfo"));
            setStyle(1, 16973939);
        } catch (JSONException unused) {
            dismiss();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getActivity());
        LayoutInflater.from(getActivity()).inflate(C0166.hockeyapp_fragment_update, linearLayout);
        LinearLayout linearLayout2 = linearLayout;
        this.f165 = new ada(getActivity(), this.f167.toString(), this);
        ((TextView) linearLayout2.findViewById(C0164if.label_title)).setText(m68());
        TextView textView = (TextView) linearLayout2.findViewById(C0164if.label_version);
        String str = "Version " + this.f165.mo3517();
        String r6 = this.f165.mo3516();
        String str2 = "Unknown size";
        long r0 = this.f165.mo3515();
        long j = r0;
        if (r0 >= 0) {
            str2 = String.format("%.2f", new Object[]{Float.valueOf(((float) j) / 1048576.0f)}) + " MB";
        } else {
            acn.m116(new acj(getActivity(), this.f166, new abh(this, textView, str, r6)));
        }
        textView.setText(getString(C0165.hockeyapp_update_version_details_label, new Object[]{str, r6, str2}));
        ((Button) linearLayout2.findViewById(C0164if.button_update)).setOnClickListener(this);
        WebView webView = (WebView) linearLayout2.findViewById(C0164if.web_update_details);
        webView.clearCache(true);
        webView.destroyDrawingCache();
        webView.loadDataWithBaseURL("https://sdk.hockeyapp.net/", this.f165.mo3514(), "text/html", "utf-8", null);
        return linearLayout2;
    }

    public void onClick(View view) {
        if (VERSION.SDK_INT < 23 || getActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            m69(getActivity());
            dismiss();
            return;
        }
        requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
    }

    /* renamed from: 鷭 */
    public final int mo3419() {
        char c = 65535;
        try {
            return getActivity().getPackageManager().getPackageInfo(getActivity().getPackageName(), 128).versionCode;
        } catch (NameNotFoundException unused) {
            return c;
        } catch (NullPointerException unused2) {
            return c;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: 鷭 */
    public void m69(Activity activity) {
        this.f168 = new acg(activity, this.f166, new abi(this, activity));
        acn.m116(this.f168);
    }

    /* renamed from: 櫯 */
    private String m68() {
        Activity activity = getActivity();
        try {
            PackageManager packageManager = activity.getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(activity.getPackageName(), 0)).toString();
        } catch (NameNotFoundException unused) {
            return "";
        }
    }
}
