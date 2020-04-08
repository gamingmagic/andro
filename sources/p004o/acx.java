package p004o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Patterns;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.protocol.HTTP;
import p004o.aay.C0165;

/* renamed from: o.acx */
public final class acx {

    /* renamed from: ˮ͈ */
    private static final ThreadLocal<DateFormat> f329 = new acy();

    /* renamed from: 櫯 */
    private static final char[] f330 = "0123456789ABCDEF".toCharArray();

    /* renamed from: 鷭 */
    private static final Pattern f331 = Pattern.compile("[0-9a-f]+", 2);

    static {
    }

    /* renamed from: 鷭 */
    public static String m144(String str) {
        try {
            return URLEncoder.encode(str, HTTP.UTF_8);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: 櫯 */
    public static final boolean m140(String str) {
        return !TextUtils.isEmpty(str) && Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: 鷭 */
    public static Boolean m142() {
        try {
            return Boolean.valueOf(VERSION.SDK_INT >= 11 && m136("android.app.Fragment"));
        } catch (NoClassDefFoundError unused) {
            return Boolean.valueOf(false);
        }
    }

    /* renamed from: 鷭 */
    public static Boolean m143(WeakReference<Activity> weakReference) {
        if (weakReference != null) {
            Activity activity = (Activity) weakReference.get();
            if (activity != null) {
                Configuration configuration = activity.getResources().getConfiguration();
                return Boolean.valueOf((configuration.screenLayout & 15) == 3 || (configuration.screenLayout & 15) == 4);
            }
        }
        return Boolean.valueOf(false);
    }

    /* renamed from: ˮ͈ */
    public static String m137(String str) {
        if (str == null) {
            throw new IllegalArgumentException("App ID must not be null.");
        }
        String trim = str.trim();
        Matcher matcher = f331.matcher(trim);
        if (trim.length() != 32) {
            throw new IllegalArgumentException("App ID length must be 32 characters.");
        } else if (matcher.matches()) {
            return trim;
        } else {
            throw new IllegalArgumentException("App ID must match regex pattern /[0-9a-f]+/i");
        }
    }

    /* renamed from: ȃ */
    private static boolean m136(String str) {
        try {
            return Class.forName(str) != null;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: 鷭 */
    public static Notification m141(Context context, PendingIntent pendingIntent, String str, String str2, int i) {
        if (!(VERSION.SDK_INT >= 11 && m136("android.app.Notification.Builder"))) {
            return m138(context, pendingIntent, str, str2, i);
        }
        Builder smallIcon = new Builder(context).setContentTitle(str).setContentText(str2).setContentIntent(pendingIntent).setSmallIcon(i);
        return VERSION.SDK_INT < 16 ? smallIcon.getNotification() : smallIcon.build();
    }

    /* renamed from: 櫯 */
    private static Notification m138(Context context, PendingIntent pendingIntent, String str, String str2, int i) {
        Notification notification = new Notification(i, "", System.currentTimeMillis());
        try {
            notification.getClass().getMethod("setLatestEventInfo", new Class[]{Context.class, CharSequence.class, CharSequence.class, PendingIntent.class}).invoke(notification, new Object[]{context, str, str2, pendingIntent});
        } catch (Exception unused) {
        }
        return notification;
    }

    /* renamed from: 鷭 */
    public static boolean m145(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: 櫯 */
    public static String m139(Context context) {
        if (context == null) {
            return "";
        }
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getApplicationInfo().packageName, 0);
        } catch (NameNotFoundException unused) {
        }
        if (applicationInfo != null) {
            return (String) packageManager.getApplicationLabel(applicationInfo);
        }
        return context.getString(C0165.hockeyapp_crash_dialog_app_name_fallback);
    }
}
