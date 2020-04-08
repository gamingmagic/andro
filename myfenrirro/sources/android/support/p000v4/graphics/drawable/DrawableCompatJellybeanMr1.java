package android.support.p000v4.graphics.drawable;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.graphics.drawable.DrawableCompatJellybeanMr1 */
class DrawableCompatJellybeanMr1 {
    private static final String TAG = "DrawableCompatJellybeanMr1";
    private static Method sGetLayoutDirectionMethod = null;
    private static boolean sGetLayoutDirectionMethodFetched = false;
    private static Method sSetLayoutDirectionMethod = null;
    private static boolean sSetLayoutDirectionMethodFetched = false;

    DrawableCompatJellybeanMr1() {
    }

    public static void setLayoutDirection(Drawable drawable, int i) {
        if (!sSetLayoutDirectionMethodFetched) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                sSetLayoutDirectionMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sSetLayoutDirectionMethodFetched = true;
        }
        if (sSetLayoutDirectionMethod != null) {
            try {
                sSetLayoutDirectionMethod.invoke(drawable, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused2) {
                sSetLayoutDirectionMethod = null;
            }
        }
    }

    public static int getLayoutDirection(Drawable drawable) {
        if (!sGetLayoutDirectionMethodFetched) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                sGetLayoutDirectionMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sGetLayoutDirectionMethodFetched = true;
        }
        if (sGetLayoutDirectionMethod != null) {
            try {
                return ((Integer) sGetLayoutDirectionMethod.invoke(drawable, new Object[0])).intValue();
            } catch (Exception unused2) {
                sGetLayoutDirectionMethod = null;
            }
        }
        return -1;
    }
}
