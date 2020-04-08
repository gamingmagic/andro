package p004o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.ada */
public final class ada {

    /* renamed from: ȃ */
    private int f338;

    /* renamed from: ˮ͈ */
    private abj f339;

    /* renamed from: 櫯 */
    private JSONObject f340;

    /* renamed from: 鷭 */
    private ArrayList<JSONObject> f341;

    public ada(Activity activity, String str, abj abj) {
        this.f339 = abj;
        m154(activity, str);
        Collections.sort(this.f341, new adb(this));
    }

    /* renamed from: 鷭 */
    private void m154(Activity activity, String str) {
        this.f340 = new JSONObject();
        this.f341 = new ArrayList<>();
        this.f338 = this.f339.mo3419();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int r2 = this.f339.mo3419();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                boolean z = jSONObject.getInt(ClientCookie.VERSION_ATTR) > r2;
                boolean z2 = jSONObject.getInt(ClientCookie.VERSION_ATTR) == r2 && m155((Context) activity, jSONObject.getLong("timestamp"));
                if (z || z2) {
                    this.f340 = jSONObject;
                    r2 = jSONObject.getInt(ClientCookie.VERSION_ATTR);
                }
                this.f341.add(jSONObject);
            }
        } catch (JSONException unused) {
        } catch (NullPointerException unused2) {
        }
    }

    /* renamed from: 鷭 */
    public final String mo3517() {
        return m153(this.f340, "shortversion", "") + " (" + m153(this.f340, ClientCookie.VERSION_ATTR, "") + ")";
    }

    @SuppressLint({"SimpleDateFormat"})
    /* renamed from: 櫯 */
    public final String mo3516() {
        return new SimpleDateFormat("dd.MM.yyyy").format(new Date(1000 * m152(this.f340, "timestamp")));
    }

    /* renamed from: ˮ͈ */
    public final long mo3515() {
        boolean booleanValue = Boolean.valueOf(m153(this.f340, "external", "false")).booleanValue();
        long r4 = m152(this.f340, "appsize");
        if (!booleanValue || r4 != 0) {
            return r4;
        }
        return -1;
    }

    /* renamed from: 鷭 */
    private static String m153(JSONObject jSONObject, String str, String str2) {
        try {
            return jSONObject.getString(str);
        } catch (JSONException unused) {
            return str2;
        }
    }

    /* renamed from: 鷭 */
    private static long m152(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getLong(str);
        } catch (JSONException unused) {
            return 0;
        }
    }

    /* renamed from: ȃ */
    public final String mo3514() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<body style='padding: 0px 0px 20px 0px'>");
        int i = 0;
        Iterator it = this.f341.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            if (i > 0) {
                sb.append("<hr style='border-top: 1px solid #c8c8c8; border-bottom: 0px; margin: 40px 10px 0px 10px;' />");
            }
            JSONObject jSONObject2 = jSONObject;
            int i2 = i;
            StringBuilder sb2 = new StringBuilder();
            int r10 = m151(this.f340);
            int r11 = m151(jSONObject2);
            String r8 = m149(jSONObject2);
            sb2.append("<div style='padding: 20px 10px 10px;'><strong>");
            if (i2 == 0) {
                sb2.append("Newest version:");
            } else {
                sb2.append("Version " + r8 + " (" + r11 + "): ");
                if (r11 != r10 && r11 == this.f338) {
                    this.f338 = -1;
                    sb2.append("[INSTALLED]");
                }
            }
            sb2.append("</strong></div>");
            sb.append(sb2.toString());
            JSONObject jSONObject3 = jSONObject;
            StringBuilder sb3 = new StringBuilder();
            String r6 = m153(jSONObject3, "notes", "");
            sb3.append("<div style='padding: 0px 10px;'>");
            if (r6.trim().length() == 0) {
                sb3.append("<em>No information.</em>");
            } else {
                sb3.append(r6);
            }
            sb3.append("</div>");
            sb.append(sb3.toString());
            i++;
        }
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    /* renamed from: 鷭 */
    private static int m151(JSONObject jSONObject) {
        boolean z = false;
        try {
            return jSONObject.getInt(ClientCookie.VERSION_ATTR);
        } catch (JSONException unused) {
            return z;
        }
    }

    /* renamed from: 櫯 */
    private static String m149(JSONObject jSONObject) {
        String str = "";
        try {
            return jSONObject.getString("shortversion");
        } catch (JSONException unused) {
            return str;
        }
    }

    /* renamed from: 鷭 */
    public static int m150(String str, String str2) {
        if (str == null || str2 == null) {
            return 0;
        }
        try {
            Scanner scanner = new Scanner(str.replaceAll("\\-.*", ""));
            Scanner scanner2 = new Scanner(str2.replaceAll("\\-.*", ""));
            scanner.useDelimiter("\\.");
            scanner2.useDelimiter("\\.");
            while (scanner.hasNextInt() && scanner2.hasNextInt()) {
                int nextInt = scanner.nextInt();
                int nextInt2 = scanner2.nextInt();
                if (nextInt < nextInt2) {
                    return -1;
                }
                if (nextInt > nextInt2) {
                    return 1;
                }
            }
            if (scanner.hasNextInt()) {
                return 1;
            }
            if (scanner2.hasNextInt()) {
                return -1;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: 鷭 */
    public static boolean m155(Context context, long j) {
        if (context == null) {
            return false;
        }
        try {
            return j > (new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir).lastModified() / 1000) + 1800;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
