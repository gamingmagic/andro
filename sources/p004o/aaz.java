package p004o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.roworkshop.andro.c_activity;

/* renamed from: o.aaz */
public final class aaz {
    /* renamed from: 鷭 */
    public static void m63(c_activity c_activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (c_activity != null) {
            Editor edit = c_activity.getSharedPreferences("HockeyApp", 0).edit();
            edit.putLong("startTime" + c_activity.hashCode(), currentTimeMillis);
            edit.apply();
        }
    }

    /* renamed from: 櫯 */
    public static void m62(c_activity c_activity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (c_activity != null && m64((Context) c_activity)) {
            SharedPreferences sharedPreferences = c_activity.getSharedPreferences("HockeyApp", 0);
            long j = sharedPreferences.getLong("startTime" + c_activity.hashCode(), 0);
            long j2 = sharedPreferences.getLong("usageTime" + C1012zy.f6129, 0);
            if (j > 0) {
                long j3 = currentTimeMillis - j;
                long j4 = j2 + j3;
                if (j3 > 0 && j4 >= 0) {
                    Editor edit = sharedPreferences.edit();
                    edit.putLong("usageTime" + C1012zy.f6129, j4);
                    edit.apply();
                }
            }
        }
    }

    /* renamed from: 鷭 */
    public static boolean m64(Context context) {
        if (C1012zy.f6129 == null) {
            C1012zy.m1810(context);
            if (C1012zy.f6129 == null) {
                return false;
            }
        }
        return true;
    }
}
