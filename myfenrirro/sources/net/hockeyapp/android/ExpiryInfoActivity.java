package net.hockeyapp.android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import p004o.aay.C0164if;
import p004o.aay.C0165;
import p004o.aay.C0166;
import p004o.acx;

public class ExpiryInfoActivity extends Activity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getString(C0165.hockeyapp_expiry_info_title));
        setContentView(C0166.hockeyapp_activity_expiry_info);
        String r4 = acx.m139((Context) this);
        ((TextView) findViewById(C0164if.label_message)).setText(String.format(getString(C0165.hockeyapp_expiry_info_text), new Object[]{r4}));
    }
}
