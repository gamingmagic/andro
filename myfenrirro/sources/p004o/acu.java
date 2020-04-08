package p004o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/* renamed from: o.acu */
public final class acu {

    /* renamed from: ȃ */
    private Editor f319;

    /* renamed from: ˮ͈ */
    private SharedPreferences f320;

    /* renamed from: 櫯 */
    public Editor f321;

    /* renamed from: 鷭 */
    public SharedPreferences f322;

    /* renamed from: o.acu$鷭 */
    public static class C0176 {

        /* renamed from: 鷭 */
        public static final acu f323 = new acu();

        static {
        }
    }

    private acu() {
    }

    /* renamed from: 鷭 */
    public final void mo3505(Context context, String str) {
        if (context != null) {
            this.f320 = context.getSharedPreferences("net.hockeyapp.android.prefs_feedback_token", 0);
            if (this.f320 != null) {
                this.f319 = this.f320.edit();
                this.f319.putString("net.hockeyapp.android.prefs_key_feedback_token", str);
                this.f319.apply();
            }
        }
    }

    /* renamed from: 鷭 */
    public final String mo3504(Context context) {
        if (context == null) {
            return null;
        }
        this.f320 = context.getSharedPreferences("net.hockeyapp.android.prefs_feedback_token", 0);
        if (this.f320 == null) {
            return null;
        }
        return this.f320.getString("net.hockeyapp.android.prefs_key_feedback_token", null);
    }

    /* renamed from: 櫯 */
    public final String mo3503(Context context) {
        if (context == null) {
            return null;
        }
        this.f322 = context.getSharedPreferences("net.hockeyapp.android.prefs_name_email", 0);
        if (this.f322 == null) {
            return null;
        }
        return this.f322.getString("net.hockeyapp.android.prefs_key_name_email", null);
    }
}
