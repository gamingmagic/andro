package p004o;

import android.util.Log;
import com.roworkshop.andro.c_activity;

/* renamed from: o.ns */
public final class C0592ns {

    /* renamed from: ȃ */
    static long f2853;

    /* renamed from: ˮ͈ */
    static long f2854;

    /* renamed from: 櫯 */
    static int f2855;

    /* renamed from: 鷭 */
    static c_activity f2856;

    /* renamed from: 鷭 */
    public static void m674(String str) {
        Log.e("AndRO", "" + str);
        if (C1014.f6149 != null && C1014.f6149.f729 != null && f2853 < System.currentTimeMillis()) {
            C1014.f6149.f729.mo3652((C0839ue) new C1032(str));
            if (System.currentTimeMillis() - f2854 < 5000) {
                f2855++;
            } else {
                f2855 = 0;
            }
            if (f2855 >= 10) {
                f2853 = System.currentTimeMillis() + 30000;
            }
            f2854 = System.currentTimeMillis();
        }
    }
}
