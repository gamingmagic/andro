package p004o;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.Map;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.ack */
public final class ack extends acf<Void, Void, Boolean> {

    /* renamed from: Ą */
    private final int f274;

    /* renamed from: ą */
    private final String f275;

    /* renamed from: Ć */
    private final Map<String, String> f276;

    /* renamed from: ȃ */
    private boolean f277 = true;

    /* renamed from: ˮ͈ */
    public ProgressDialog f278;

    /* renamed from: 櫯 */
    public Handler f279;

    /* renamed from: 鷭 */
    public Context f280;

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m111();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (this.f278 != null) {
            try {
                this.f278.dismiss();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.f279 != null) {
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putBoolean("success", bool.booleanValue());
            message.setData(bundle);
            this.f279.sendMessage(message);
        }
    }

    public ack(Context context, Handler handler, String str, int i, Map<String, String> map) {
        this.f280 = context;
        this.f279 = handler;
        this.f275 = str;
        this.f274 = i;
        this.f276 = map;
        if (context != null) {
            C1012zy.m1810(context);
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        if ((this.f278 == null || !this.f278.isShowing()) && this.f277) {
            this.f278 = ProgressDialog.show(this.f280, "", "Please wait...", true, false);
        }
    }

    /* renamed from: 鷭 */
    private Boolean m111() {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            int i = this.f274;
            Map<String, String> map = this.f276;
            if (i == 1) {
                acs acs = new acs(this.f275);
                acs.f318 = HttpPost.METHOD_NAME;
                httpURLConnection = acs.mo3502(map).mo3500();
            } else if (i == 2) {
                acs acs2 = new acs(this.f275);
                acs2.f318 = HttpPost.METHOD_NAME;
                acs acs3 = acs2;
                String str = (String) map.get("email");
                String str2 = "Basic " + aco.m117((str + ":" + ((String) map.get("password"))).getBytes());
                acs3.f317.put("Authorization", str2);
                httpURLConnection = acs3.mo3500();
            } else if (i == 3) {
                String str3 = (String) map.get("type");
                httpURLConnection = new acs(this.f275 + "?" + str3 + "=" + ((String) map.get("id"))).mo3500();
            } else {
                throw new IllegalArgumentException("Login mode " + i + " not supported.");
            }
            HttpURLConnection httpURLConnection3 = httpURLConnection;
            httpURLConnection.connect();
            if (httpURLConnection3.getResponseCode() == 200) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection3.getInputStream());
                String r6 = acf.m100(bufferedInputStream);
                bufferedInputStream.close();
                String str4 = r6;
                if (!TextUtils.isEmpty(r6)) {
                    Boolean valueOf = Boolean.valueOf(m112(str4));
                    if (httpURLConnection3 != null) {
                        httpURLConnection3.disconnect();
                    }
                    return valueOf;
                }
            }
            if (httpURLConnection3 != null) {
                httpURLConnection3.disconnect();
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
        } catch (Throwable th) {
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
        return Boolean.valueOf(false);
    }

    /* renamed from: 鷭 */
    private boolean m112(String str) {
        SharedPreferences sharedPreferences = this.f280.getSharedPreferences("net.hockeyapp.android.login", 0);
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject;
            String string = jSONObject.getString("status");
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            if (this.f274 == 1) {
                if (string.equals("identified")) {
                    String string2 = jSONObject2.getString("iuid");
                    if (!TextUtils.isEmpty(string2)) {
                        sharedPreferences.edit().putString("iuid", string2).apply();
                        return true;
                    }
                }
            } else if (this.f274 == 2) {
                if (string.equals("authorized")) {
                    String string3 = jSONObject2.getString("auid");
                    if (!TextUtils.isEmpty(string3)) {
                        sharedPreferences.edit().putString("auid", string3).apply();
                        return true;
                    }
                }
            } else if (this.f274 != 3) {
                throw new IllegalArgumentException("Login mode " + this.f274 + " not supported.");
            } else if (string.equals("validated")) {
                return true;
            } else {
                sharedPreferences.edit().remove("iuid").remove("auid").apply();
            }
            return false;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }
}
