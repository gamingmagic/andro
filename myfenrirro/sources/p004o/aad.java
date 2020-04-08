package p004o;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import org.apache.http.client.methods.HttpPost;

/* renamed from: o.aad */
class aad extends Thread {

    /* renamed from: ˮ͈ */
    final /* synthetic */ abq f120 = null;

    /* renamed from: 櫯 */
    final /* synthetic */ aag f121;

    /* renamed from: 鷭 */
    final /* synthetic */ WeakReference f122;

    aad(WeakReference weakReference, aag aag, abq abq) {
        this.f122 = weakReference;
        this.f121 = aag;
    }

    public final void run() {
        WeakReference weakReference = this.f122;
        aag aag = this.f121;
        abq abq = this.f120;
        String[] r6 = C1013zz.m1822();
        Boolean valueOf = Boolean.valueOf(false);
        if (r6 != null && r6.length > 0) {
            new StringBuilder("Found ").append(r6.length).append(" stacktrace(s).");
            for (int i = 0; i < r6.length; i++) {
                HttpURLConnection httpURLConnection = null;
                try {
                    String str = r6[i];
                    String r11 = C1013zz.m1811(weakReference, str);
                    if (r11.length() > 0) {
                        String r12 = C1013zz.m1811(weakReference, str.replace(".stacktrace", ".user"));
                        String r13 = C1013zz.m1811(weakReference, str.replace(".stacktrace", ".contact"));
                        if (abq != null) {
                            String str2 = abq.f198;
                            if (!TextUtils.isEmpty(str2)) {
                                r12 = str2;
                            }
                            String str3 = abq.f199;
                            if (!TextUtils.isEmpty(str3)) {
                                r13 = str3;
                            }
                        }
                        String r14 = C1013zz.m1811(weakReference, str.replace(".stacktrace", ".description"));
                        String str4 = abq != null ? abq.f200 : "";
                        if (!TextUtils.isEmpty(r14)) {
                            str4 = !TextUtils.isEmpty(str4) ? String.format("%s\n\nLog:\n%s", new Object[]{str4, r14}) : String.format("Log:\n%s", new Object[]{r14});
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("raw", r11);
                        hashMap.put("userID", r12);
                        hashMap.put("contact", r13);
                        hashMap.put("description", str4);
                        hashMap.put("sdk", "HockeySDK");
                        hashMap.put("sdk_version", "4.1.0-alpha.2");
                        acs acs = new acs(C1013zz.f6134 + "api/2/apps/" + C1013zz.f6135 + "/crashes/");
                        acs.f318 = HttpPost.METHOD_NAME;
                        HttpURLConnection r0 = acs.mo3502(hashMap).mo3500();
                        httpURLConnection = r0;
                        int responseCode = r0.getResponseCode();
                        valueOf = Boolean.valueOf(responseCode == 202 || responseCode == 201);
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (valueOf.booleanValue()) {
                        C1013zz.m1812(weakReference, r6[i]);
                        if (aag != null) {
                            C1013zz.m1814(weakReference, r6[i]);
                        }
                    } else if (aag != null) {
                        C1013zz.m1818(weakReference, r6[i]);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (valueOf.booleanValue()) {
                        C1013zz.m1812(weakReference, r6[i]);
                        if (aag != null) {
                            C1013zz.m1814(weakReference, r6[i]);
                        }
                    } else if (aag != null) {
                        C1013zz.m1818(weakReference, r6[i]);
                    }
                } catch (Throwable th) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (valueOf.booleanValue()) {
                        C1013zz.m1812(weakReference, r6[i]);
                        if (aag != null) {
                            C1013zz.m1814(weakReference, r6[i]);
                        }
                    } else if (aag != null) {
                        C1013zz.m1818(weakReference, r6[i]);
                    }
                    throw th;
                }
            }
        }
        C1013zz.f6133 = false;
    }
}
