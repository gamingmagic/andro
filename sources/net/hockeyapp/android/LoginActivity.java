package net.hockeyapp.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import p004o.aar;
import p004o.aas;
import p004o.aat;
import p004o.aay.C0164if;
import p004o.aay.C0165;
import p004o.aay.C0166;
import p004o.ack;
import p004o.acn;
import p004o.acx;

public class LoginActivity extends Activity {

    /* renamed from: Ą */
    private Handler f88;

    /* renamed from: ą */
    private Button f89;

    /* renamed from: ȃ */
    private ack f90;

    /* renamed from: ˮ͈ */
    private int f91;

    /* renamed from: 櫯 */
    private String f92;

    /* renamed from: 鷭 */
    private String f93;

    /* renamed from: 鷭 */
    public static /* synthetic */ void m48(LoginActivity loginActivity) {
        if (!acx.m145((Context) loginActivity)) {
            Toast.makeText(loginActivity, C0165.hockeyapp_error_no_network_message, 1).show();
            return;
        }
        String obj = ((EditText) loginActivity.findViewById(C0164if.input_email)).getText().toString();
        String obj2 = ((EditText) loginActivity.findViewById(C0164if.input_password)).getText().toString();
        boolean z = false;
        HashMap hashMap = new HashMap();
        if (loginActivity.f91 == 1) {
            z = !TextUtils.isEmpty(obj);
            hashMap.put("email", obj);
            hashMap.put("authcode", m47(loginActivity.f92 + obj));
        } else if (loginActivity.f91 == 2) {
            z = !TextUtils.isEmpty(obj) && !TextUtils.isEmpty(obj2);
            hashMap.put("email", obj);
            hashMap.put("password", obj2);
        }
        if (z) {
            LoginActivity loginActivity2 = loginActivity;
            loginActivity.f90 = new ack(loginActivity2, loginActivity2.f88, loginActivity.f93, loginActivity.f91, hashMap);
            acn.m116(loginActivity.f90);
            return;
        }
        Toast.makeText(loginActivity, loginActivity.getString(C0165.hockeyapp_login_missing_credentials_toast), 1).show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0166.hockeyapp_activity_login);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f93 = extras.getString("url");
            this.f92 = extras.getString("secret");
            this.f91 = extras.getInt("mode");
        }
        if (this.f91 == 1) {
            ((EditText) findViewById(C0164if.input_password)).setVisibility(4);
        }
        ((TextView) findViewById(C0164if.text_headline)).setText(this.f91 == 1 ? C0165.hockeyapp_login_headline_text_email_only : C0165.hockeyapp_login_headline_text);
        this.f89 = (Button) findViewById(C0164if.button_login);
        this.f89.setOnClickListener(new aar(this));
        this.f88 = new aas(this);
        Object lastNonConfigurationInstance = getLastNonConfigurationInstance();
        if (lastNonConfigurationInstance != null) {
            this.f90 = (ack) lastNonConfigurationInstance;
            ack ack = this.f90;
            Handler handler = this.f88;
            ack.f280 = this;
            ack.f279 = handler;
        }
    }

    public Object onRetainNonConfigurationInstance() {
        if (this.f90 != null) {
            ack ack = this.f90;
            ack.f280 = null;
            ack.f279 = null;
            ack.f278 = null;
        }
        return this.f90;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || aat.f148 != null) {
            return super.onKeyDown(i, keyEvent);
        }
        Intent intent = new Intent(this, aat.f149);
        intent.setFlags(67108864);
        intent.putExtra("net.hockeyapp.android.EXIT", true);
        startActivity(intent);
        return true;
    }

    /* renamed from: 鷭 */
    private static String m47(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }
}
