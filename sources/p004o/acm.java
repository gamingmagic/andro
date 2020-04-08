package p004o;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p000v4.p002os.EnvironmentCompat;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import p004o.aay.C0165;

/* renamed from: o.acm */
public final class acm extends acf<Void, Void, HashMap<String, String>> {

    /* renamed from: Ą */
    private String f286;

    /* renamed from: ą */
    private String f287;

    /* renamed from: Ć */
    private String f288;

    /* renamed from: ć */
    private String f289;

    /* renamed from: ċ */
    private boolean f290 = true;

    /* renamed from: ȃ */
    private String f291;

    /* renamed from: Ȋ */
    private boolean f292;

    /* renamed from: ˮ͈ */
    private Handler f293;

    /* renamed from: ˮ͍ */
    private List<Uri> f294;

    /* renamed from: 岱 */
    private String f295;

    /* renamed from: 櫯 */
    public ProgressDialog f296;

    /* renamed from: 纫 */
    private int f297 = -1;

    /* renamed from: 鷭 */
    public Context f298;

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        File[] listFiles;
        if (this.f292 && this.f295 != null) {
            return m113();
        }
        if (this.f292) {
            return null;
        }
        if (this.f294.isEmpty()) {
            return m115();
        }
        HashMap r3 = m114();
        if (r3 != null) {
            String str = (String) r3.get("status");
            if (!(str == null || !str.startsWith("2") || this.f298 == null)) {
                File file = new File(this.f298.getCacheDir(), "HockeyApp");
                File file2 = file;
                if (file.exists()) {
                    for (File file3 : file2.listFiles()) {
                        if (file3 != null) {
                            file3.delete();
                        }
                    }
                }
            }
        }
        return r3;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        HashMap hashMap = (HashMap) obj;
        if (this.f296 != null) {
            try {
                this.f296.dismiss();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.f293 != null) {
            Message message = new Message();
            Bundle bundle = new Bundle();
            if (hashMap != null) {
                bundle.putString("request_type", (String) hashMap.get("type"));
                bundle.putString("feedback_response", (String) hashMap.get("response"));
                bundle.putString("feedback_status", (String) hashMap.get("status"));
            } else {
                bundle.putString("request_type", EnvironmentCompat.MEDIA_UNKNOWN);
            }
            message.setData(bundle);
            this.f293.sendMessage(message);
        }
    }

    public acm(Context context, String str, String str2, String str3, String str4, String str5, List<Uri> list, String str6, Handler handler, boolean z) {
        this.f298 = context;
        this.f291 = str;
        this.f286 = str2;
        this.f287 = str3;
        this.f288 = str4;
        this.f289 = str5;
        this.f294 = list;
        this.f295 = str6;
        this.f293 = handler;
        this.f292 = z;
        if (context != null) {
            C1012zy.m1810(context);
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        String string = this.f298.getString(C0165.hockeyapp_feedback_sending_feedback_text);
        if (this.f292) {
            string = this.f298.getString(C0165.hockeyapp_feedback_fetching_feedback_text);
        }
        if ((this.f296 == null || !this.f296.isShowing()) && this.f290) {
            this.f296 = ProgressDialog.show(this.f298, "", string, true, false);
        }
    }

    /* renamed from: 鷭 */
    private HashMap<String, String> m115() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("type", "send");
        HttpURLConnection httpURLConnection = null;
        try {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("name", this.f286);
            hashMap2.put("email", this.f287);
            hashMap2.put("subject", this.f288);
            hashMap2.put("text", this.f289);
            hashMap2.put("bundle_identifier", C1012zy.f6126);
            hashMap2.put("bundle_short_version", C1012zy.f6127);
            hashMap2.put("bundle_version", C1012zy.f6129);
            hashMap2.put("os_version", C1012zy.f6122);
            hashMap2.put("oem", C1012zy.f6125);
            hashMap2.put("model", C1012zy.f6124);
            if (this.f295 != null) {
                this.f291 += this.f295 + "/";
            }
            acs acs = new acs(this.f291);
            acs.f318 = this.f295 != null ? HttpPut.METHOD_NAME : HttpPost.METHOD_NAME;
            HttpURLConnection r0 = acs.mo3502(hashMap2).mo3500();
            HttpURLConnection httpURLConnection2 = r0;
            r0.connect();
            hashMap.put("status", String.valueOf(httpURLConnection2.getResponseCode()));
            BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection2.getInputStream());
            String r4 = acf.m100(bufferedInputStream);
            bufferedInputStream.close();
            hashMap.put("response", r4);
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
        } catch (IOException e) {
            e.printStackTrace();
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
        return hashMap;
    }

    /* renamed from: 櫯 */
    private HashMap<String, String> m114() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("type", "send");
        HttpURLConnection httpURLConnection = null;
        try {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("name", this.f286);
            hashMap2.put("email", this.f287);
            hashMap2.put("subject", this.f288);
            hashMap2.put("text", this.f289);
            hashMap2.put("bundle_identifier", C1012zy.f6126);
            hashMap2.put("bundle_short_version", C1012zy.f6127);
            hashMap2.put("bundle_version", C1012zy.f6129);
            hashMap2.put("os_version", C1012zy.f6122);
            hashMap2.put("oem", C1012zy.f6125);
            hashMap2.put("model", C1012zy.f6124);
            if (this.f295 != null) {
                this.f291 += this.f295 + "/";
            }
            acs acs = new acs(this.f291);
            acs.f318 = this.f295 != null ? HttpPut.METHOD_NAME : HttpPost.METHOD_NAME;
            HttpURLConnection r0 = acs.mo3501(hashMap2, this.f298, this.f294).mo3500();
            HttpURLConnection httpURLConnection2 = r0;
            r0.connect();
            hashMap.put("status", String.valueOf(httpURLConnection2.getResponseCode()));
            BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection2.getInputStream());
            String r4 = acf.m100(bufferedInputStream);
            bufferedInputStream.close();
            hashMap.put("response", r4);
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
        } catch (IOException e) {
            e.printStackTrace();
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
        return hashMap;
    }

    /* renamed from: ˮ͈ */
    private HashMap<String, String> m113() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f291 + acx.m144(this.f295));
        if (this.f297 != -1) {
            sb.append("?last_message_id=" + this.f297);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = new acs(sb.toString()).mo3500();
            hashMap.put("type", "fetch");
            httpURLConnection.connect();
            hashMap.put("status", String.valueOf(httpURLConnection.getResponseCode()));
            BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
            BufferedInputStream bufferedInputStream2 = bufferedInputStream;
            String r6 = acf.m100(bufferedInputStream);
            bufferedInputStream2.close();
            hashMap.put("response", r6);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (IOException e) {
            e.printStackTrace();
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
        return hashMap;
    }
}
