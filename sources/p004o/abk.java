package p004o;

import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

/* renamed from: o.abk */
public final class abk {

    /* renamed from: 櫯 */
    private static abl f175 = null;

    /* renamed from: 鷭 */
    private static acb f176 = null;

    static {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        if (r0 == false) goto L_0x0037;
     */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m76(com.roworkshop.andro.c_activity r8, java.lang.String r9, p004o.C1285 r10) {
        /*
            java.lang.String r0 = "https://sdk.hockeyapp.net/"
            r6 = r10
            r10 = r9
            r9 = r0
            java.lang.String r10 = p004o.acx.m137(r10)
            f175 = r6
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r8)
            r8 = r0
            java.lang.Boolean r0 = p004o.acx.m142()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r8.get()
            android.app.Activity r0 = (android.app.Activity) r0
            r7 = r0
            if (r7 == 0) goto L_0x0034
            android.app.FragmentManager r0 = r7.getFragmentManager()
            java.lang.String r1 = "hockey_update_dialog"
            android.app.Fragment r0 = r0.findFragmentByTag(r1)
            if (r0 == 0) goto L_0x0032
            r0 = 1
            goto L_0x0035
        L_0x0032:
            r0 = 0
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            if (r0 != 0) goto L_0x0076
        L_0x0037:
            boolean r0 = m77(r8)
            if (r0 != 0) goto L_0x0076
            r0 = r8
            r7 = r9
            r9 = r6
            r8 = r10
            r10 = r0
            o.acb r0 = f176
            if (r0 == 0) goto L_0x0050
            o.acb r0 = f176
            android.os.AsyncTask$Status r0 = r0.getStatus()
            android.os.AsyncTask$Status r1 = android.os.AsyncTask.Status.FINISHED
            if (r0 != r1) goto L_0x0060
        L_0x0050:
            o.acc r0 = new o.acc
            r1 = r10
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            f176 = r0
            p004o.acn.m116(r0)
            return
        L_0x0060:
            o.acb r0 = f176
            r7 = r10
            r10 = r0
            java.lang.Object r0 = r7.get()
            android.content.Context r0 = (android.content.Context) r0
            r8 = r0
            if (r8 == 0) goto L_0x0076
            android.content.Context r0 = r8.getApplicationContext()
            r10.f255 = r0
            p004o.C1012zy.m1810(r8)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.abk.m76(com.roworkshop.andro.c_activity, java.lang.String, o.њ):void");
    }

    /* renamed from: 鷭 */
    private static boolean m77(WeakReference<? extends Context> weakReference) {
        Context context = (Context) weakReference.get();
        if (context == null) {
            return false;
        }
        try {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            return !TextUtils.isEmpty(installerPackageName) || (installerPackageName != null && !TextUtils.equals(installerPackageName, "adb"));
        } catch (Throwable unused) {
            return false;
        }
    }
}
