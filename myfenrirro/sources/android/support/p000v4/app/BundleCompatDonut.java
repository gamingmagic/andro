package android.support.p000v4.app;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.app.BundleCompatDonut */
class BundleCompatDonut {
    private static final String TAG = "BundleCompatDonut";
    private static Method sGetIBinderMethod = null;
    private static boolean sGetIBinderMethodFetched = false;
    private static Method sPutIBinderMethod = null;
    private static boolean sPutIBinderMethodFetched = false;

    BundleCompatDonut() {
    }

    public static IBinder getBinder(Bundle bundle, String str) {
        if (!sGetIBinderMethodFetched) {
            try {
                Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                sGetIBinderMethod = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sGetIBinderMethodFetched = true;
        }
        if (sGetIBinderMethod != null) {
            try {
                return (IBinder) sGetIBinderMethod.invoke(bundle, new Object[]{str});
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                sGetIBinderMethod = null;
            }
        }
        return null;
    }

    public static void putBinder(Bundle bundle, String str, IBinder iBinder) {
        if (!sPutIBinderMethodFetched) {
            try {
                Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                sPutIBinderMethod = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sPutIBinderMethodFetched = true;
        }
        if (sPutIBinderMethod != null) {
            try {
                sPutIBinderMethod.invoke(bundle, new Object[]{str, iBinder});
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                sPutIBinderMethod = null;
            }
        }
    }
}
