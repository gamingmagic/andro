package net.hockeyapp.android;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import p004o.aay.C0164if;
import p004o.aay.C0165;
import p004o.aay.C0166;
import p004o.aba;
import p004o.abb;
import p004o.abc;
import p004o.abd;
import p004o.abe;
import p004o.abf;
import p004o.abj;
import p004o.abr;
import p004o.acg;
import p004o.acj;
import p004o.acn;
import p004o.acx;
import p004o.ada;

public class UpdateActivity extends Activity implements OnClickListener, abj {

    /* renamed from: ȃ */
    private Context f96;
    /* access modifiers changed from: private */

    /* renamed from: ˮ͈ */
    public abr f97;

    /* renamed from: 櫯 */
    protected ada f98;

    /* renamed from: 鷭 */
    protected acg f99;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("App Update");
        setContentView(getLayoutInflater().inflate(C0166.hockeyapp_activity_update, null));
        this.f96 = this;
        this.f98 = new ada(this, getIntent().getStringExtra("json"), this);
        ((TextView) findViewById(C0164if.label_title)).setText(m53());
        TextView textView = (TextView) findViewById(C0164if.label_version);
        String str = "Version " + this.f98.mo3517();
        String r8 = this.f98.mo3516();
        String str2 = "Unknown size";
        long r0 = this.f98.mo3515();
        long j = r0;
        if (r0 >= 0) {
            str2 = String.format("%.2f", new Object[]{Float.valueOf(((float) j) / 1048576.0f)}) + " MB";
        } else {
            acn.m116(new acj(this, getIntent().getStringExtra("url"), new abb(this, textView, str, r8)));
        }
        textView.setText(getString(C0165.hockeyapp_update_version_details_label, new Object[]{str, r8, str2}));
        ((Button) findViewById(C0164if.button_update)).setOnClickListener(this);
        WebView webView = (WebView) findViewById(C0164if.web_update_details);
        webView.clearCache(true);
        webView.destroyDrawingCache();
        webView.loadDataWithBaseURL("https://sdk.hockeyapp.net/", this.f98.mo3514(), "text/html", "utf-8", null);
        this.f99 = (acg) getLastNonConfigurationInstance();
        if (this.f99 != null) {
            this.f99.mo3487(this);
        }
    }

    public Object onRetainNonConfigurationInstance() {
        if (this.f99 != null) {
            this.f99.mo3485();
        }
        return this.f99;
    }

    /* access modifiers changed from: protected */
    public Dialog onCreateDialog(int i) {
        return onCreateDialog(i, null);
    }

    /* access modifiers changed from: protected */
    public Dialog onCreateDialog(int i, Bundle bundle) {
        switch (i) {
            case 0:
                return new Builder(this).setMessage("An error has occured").setCancelable(false).setTitle("Error").setIcon(17301543).setPositiveButton("OK", new aba(this)).create();
            default:
                return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onPrepareDialog(int i, Dialog dialog) {
        switch (i) {
            case 0:
                AlertDialog alertDialog = (AlertDialog) dialog;
                if (this.f97 == null) {
                    alertDialog.setMessage("An unknown error has occured.");
                    break;
                } else {
                    alertDialog.setMessage(this.f97.f201);
                    return;
                }
        }
    }

    /* renamed from: 鷭 */
    public final int mo3419() {
        char c = 65535;
        try {
            return getPackageManager().getPackageInfo(getPackageName(), 128).versionCode;
        } catch (NameNotFoundException unused) {
            return c;
        }
    }

    public void onClick(View view) {
        if (!acx.m145(this.f96)) {
            this.f97 = new abr();
            this.f97.f201 = getString(C0165.hockeyapp_error_no_network_message);
            runOnUiThread(new abd(this));
        } else {
            if (!(this.f96.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0)) {
                if (VERSION.SDK_INT >= 23) {
                    requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
                } else {
                    this.f97 = new abr();
                    this.f97.f201 = "The permission to access the external storage permission is not set. Please contact the developer.";
                    runOnUiThread(new abe(this));
                }
            } else if (!m52()) {
                this.f97 = new abr();
                this.f97.f201 = "The installation from unknown sources is not enabled. Please check the device settings.";
                runOnUiThread(new abf(this));
            } else {
                this.f99 = new acg(this, getIntent().getStringExtra("url"), new abc(this));
                acn.m116(this.f99);
            }
        }
        view.setEnabled(false);
    }

    /* renamed from: 櫯 */
    public final void mo3418() {
        String stringExtra = getIntent().getStringExtra("url");
        this.f99 = new acg(this, stringExtra, new abc(this));
        acn.m116(this.f99);
    }

    /* renamed from: ˮ͈ */
    private String m53() {
        try {
            PackageManager packageManager = getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(getPackageName(), 0)).toString();
        } catch (NameNotFoundException unused) {
            return "";
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: ȃ */
    private boolean m52() {
        try {
            return (VERSION.SDK_INT < 17 || VERSION.SDK_INT >= 21) ? Secure.getInt(getContentResolver(), "install_non_market_apps") == 1 : Global.getInt(getContentResolver(), "install_non_market_apps") == 1;
        } catch (SettingNotFoundException unused) {
            return true;
        }
    }
}
