package p004o;

import android.app.Activity;
import android.content.SharedPreferences.Editor;

/* renamed from: o.acz */
public final class acz {

    /* renamed from: 鷭 */
    public static String f332 = "versionInfo";

    static {
    }

    /* renamed from: 鷭 */
    public static void m146(Activity activity, String str) {
        if (activity != null) {
            Editor edit = activity.getSharedPreferences("HockeyApp", 0).edit();
            edit.putString(f332, str);
            edit.apply();
        }
    }
}
