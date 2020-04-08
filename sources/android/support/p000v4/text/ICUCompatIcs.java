package android.support.p000v4.text;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: android.support.v4.text.ICUCompatIcs */
class ICUCompatIcs {
    private static final String TAG = "ICUCompatIcs";
    private static Method sAddLikelySubtagsMethod = null;
    private static Method sGetScriptMethod = null;

    ICUCompatIcs() {
    }

    static {
        try {
            Class cls = Class.forName("libcore.icu.ICU");
            if (cls != null) {
                sGetScriptMethod = cls.getMethod("getScript", new Class[]{String.class});
                sAddLikelySubtagsMethod = cls.getMethod("addLikelySubtags", new Class[]{String.class});
            }
        } catch (Exception unused) {
            sGetScriptMethod = null;
            sAddLikelySubtagsMethod = null;
        }
    }

    public static String maximizeAndGetScript(Locale locale) {
        String addLikelySubtags = addLikelySubtags(locale);
        if (addLikelySubtags != null) {
            return getScript(addLikelySubtags);
        }
        return null;
    }

    private static String getScript(String str) {
        try {
            if (sGetScriptMethod != null) {
                return (String) sGetScriptMethod.invoke(null, new Object[]{str});
            }
        } catch (IllegalAccessException unused) {
        } catch (InvocationTargetException unused2) {
        }
        return null;
    }

    private static String addLikelySubtags(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (sAddLikelySubtagsMethod != null) {
                return (String) sAddLikelySubtagsMethod.invoke(null, new Object[]{locale2});
            }
        } catch (IllegalAccessException unused) {
        } catch (InvocationTargetException unused2) {
        }
        return locale2;
    }
}
