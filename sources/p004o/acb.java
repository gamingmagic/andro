package p004o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.regex.Pattern;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.protocol.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.acb */
public class acb extends AsyncTask<Void, String, JSONArray> {

    /* renamed from: Ą */
    protected abl f252;

    /* renamed from: ą */
    private long f253 = 0;

    /* renamed from: ȃ */
    protected Boolean f254 = Boolean.valueOf(false);

    /* renamed from: ˮ͈ */
    public Context f255 = null;

    /* renamed from: 櫯 */
    protected String f256 = null;

    /* renamed from: 鷭 */
    protected String f257 = null;

    /* access modifiers changed from: protected */
    public /* synthetic */ Object doInBackground(Object[] objArr) {
        return m87();
    }

    public acb(WeakReference<? extends Context> weakReference, String str, String str2, abl abl) {
        long j;
        this.f256 = str2;
        this.f257 = str;
        this.f252 = abl;
        Context context = null;
        if (weakReference != null) {
            context = (Context) weakReference.get();
        }
        if (context != null) {
            this.f255 = context.getApplicationContext();
            Context context2 = context;
            if (!aaz.m64(context)) {
                j = 0;
            } else {
                SharedPreferences sharedPreferences = context2.getSharedPreferences("HockeyApp", 0);
                long j2 = sharedPreferences.getLong("usageTime" + C1012zy.f6129, 0);
                long j3 = j2;
                if (j2 < 0) {
                    sharedPreferences.edit().remove("usageTime" + C1012zy.f6129).apply();
                    j = 0;
                } else {
                    j = j3 / 1000;
                }
            }
            this.f253 = j;
            C1012zy.m1810(context);
        }
    }

    /* renamed from: 櫯 */
    private JSONArray m87() {
        try {
            int parseInt = Integer.parseInt(C1012zy.f6129);
            Context context = this.f255;
            JSONArray jSONArray = new JSONArray(context != null ? context.getSharedPreferences("HockeyApp", 0).getString(acz.f332, "[]") : "[]");
            if (m90(jSONArray, parseInt)) {
                return jSONArray;
            }
            URLConnection openConnection = new URL(mo3475("json")).openConnection();
            openConnection.addRequestProperty("User-Agent", "HockeySDK/Android");
            if (VERSION.SDK_INT <= 9) {
                openConnection.setRequestProperty("connection", "close");
            }
            openConnection.connect();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(openConnection.getInputStream());
            BufferedInputStream bufferedInputStream2 = bufferedInputStream;
            String r6 = m89(bufferedInputStream);
            bufferedInputStream2.close();
            JSONArray jSONArray2 = new JSONArray(r6);
            if (m90(jSONArray2, parseInt)) {
                return m88(jSONArray2);
            }
            return null;
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: 鷭 */
    private boolean m90(JSONArray jSONArray, int i) {
        boolean z = false;
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                boolean z2 = jSONObject.getInt(ClientCookie.VERSION_ATTR) > i;
                boolean z3 = jSONObject.getInt(ClientCookie.VERSION_ATTR) == i && ada.m155(this.f255, jSONObject.getLong("timestamp"));
                String string = jSONObject.getString("minimum_os_version");
                String str = VERSION.RELEASE;
                String str2 = (str == null || str.equalsIgnoreCase("L")) ? "5.0" : str.equalsIgnoreCase("M") ? "6.0" : str.equalsIgnoreCase("N") ? "7.0" : Pattern.matches("^[a-zA-Z]+", str) ? "99.0" : str;
                boolean z4 = ada.m150(string, str2) <= 0;
                if ((z2 || z3) && z4) {
                    if (jSONObject.has("mandatory")) {
                        this.f254 = Boolean.valueOf(this.f254.booleanValue() | jSONObject.getBoolean("mandatory"));
                    }
                    z = true;
                }
                i2++;
            } catch (JSONException unused) {
                return false;
            }
        }
        return z;
    }

    /* renamed from: 櫯 */
    private static JSONArray m88(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < Math.min(jSONArray.length(), 25); i++) {
            try {
                jSONArray2.put(jSONArray.get(i));
            } catch (JSONException unused) {
            }
        }
        return jSONArray2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public void onPostExecute(JSONArray jSONArray) {
        if (jSONArray != null && this.f252 != null) {
            this.f252.mo3457(jSONArray, mo3475("apk"));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public void mo3476() {
        this.f257 = null;
        this.f256 = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public final String mo3475(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f257);
        sb.append("api/2/apps/");
        sb.append(this.f256 != null ? this.f256 : this.f255.getPackageName());
        sb.append("?format=" + str);
        if (Secure.getString(this.f255.getContentResolver(), "android_id") != null) {
            sb.append("&udid=" + m86(Secure.getString(this.f255.getContentResolver(), "android_id")));
        }
        sb.append("&os=Android");
        sb.append("&os_version=" + m86(C1012zy.f6122));
        sb.append("&device=" + m86(C1012zy.f6124));
        sb.append("&oem=" + m86(C1012zy.f6125));
        sb.append("&app_version=" + m86(C1012zy.f6129));
        sb.append("&sdk=" + m86("HockeySDK"));
        sb.append("&sdk_version=" + m86("4.1.0-alpha.2"));
        sb.append("&lang=" + m86(Locale.getDefault().getLanguage()));
        sb.append("&usage_time=" + this.f253);
        return sb.toString();
    }

    /* renamed from: 櫯 */
    private static String m86(String str) {
        try {
            return URLEncoder.encode(str, HTTP.UTF_8);
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: 鷭 */
    private static String m89(BufferedInputStream bufferedInputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream), 1024);
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine + "\n");
                } else {
                    try {
                        break;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                try {
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            } finally {
                try {
                    bufferedInputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
        }
        return sb.toString();
    }
}
