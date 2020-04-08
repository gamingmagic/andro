package p004o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.security.MessageDigest;
import org.apache.http.protocol.HTTP;

/* renamed from: o.zy */
public final class C1012zy {

    /* renamed from: Ą */
    public static String f6122 = null;

    /* renamed from: ą */
    public static String f6123 = null;

    /* renamed from: Ć */
    public static String f6124 = null;

    /* renamed from: ć */
    public static String f6125 = null;

    /* renamed from: ȃ */
    public static String f6126 = null;

    /* renamed from: ˮ͈ */
    public static String f6127 = null;

    /* renamed from: ˮ͍ */
    public static String f6128 = null;

    /* renamed from: 櫯 */
    public static String f6129 = null;

    /* renamed from: 鷭 */
    public static String f6130 = null;

    static {
    }

    /* renamed from: 鷭 */
    public static void m1810(Context context) {
        f6122 = VERSION.RELEASE;
        f6123 = Build.DISPLAY;
        f6124 = Build.MODEL;
        f6125 = Build.MANUFACTURER;
        Context context2 = context;
        if (context != null) {
            try {
                File filesDir = context2.getFilesDir();
                if (filesDir != null) {
                    f6130 = filesDir.getAbsolutePath();
                }
            } catch (Exception e) {
                String str = "Exception thrown when accessing the files dir:";
                String str2 = "HockeyApp";
                if (acr.f312 <= 6) {
                    Log.e(str2, str);
                }
                e.printStackTrace();
            }
        }
        Context context3 = context;
        if (context != null) {
            try {
                PackageManager packageManager = context3.getPackageManager();
                PackageInfo packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
                f6126 = packageInfo.packageName;
                f6129 = packageInfo.versionCode;
                f6127 = packageInfo.versionName;
                int r2 = m1807(context3, packageManager);
                if (r2 != 0 && r2 > packageInfo.versionCode) {
                    f6129 = String.valueOf(r2);
                }
            } catch (NameNotFoundException e2) {
                String str3 = "Exception thrown when accessing the package info:";
                String str4 = "HockeyApp";
                if (acr.f312 <= 6) {
                    Log.e(str4, str3);
                }
                e2.printStackTrace();
            }
        }
        String string = Secure.getString(context.getContentResolver(), "android_id");
        if (!TextUtils.isEmpty(f6126) && !TextUtils.isEmpty(string)) {
            String str5 = f6126 + ":" + string + ":" + m1806();
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                byte[] bytes = str5.getBytes(HTTP.UTF_8);
                instance.update(bytes, 0, bytes.length);
                f6128 = m1809(instance.digest());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: 鷭 */
    public static File m1808() {
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/HockeyApp");
        File file2 = file;
        if (!file.exists()) {
            file2.mkdirs();
        }
        return file2;
    }

    /* renamed from: 鷭 */
    private static int m1807(Context context, PackageManager packageManager) {
        try {
            Bundle bundle = packageManager.getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                return bundle.getInt("buildNumber", 0);
            }
        } catch (NameNotFoundException e) {
            String str = "Exception thrown when accessing the application info:";
            String str2 = "HockeyApp";
            if (acr.f312 <= 6) {
                Log.e(str2, str);
            }
            e.printStackTrace();
        }
        return 0;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: 櫯 */
    private static String m1806() {
        String str;
        if (VERSION.SDK_INT >= 21) {
            str = Build.SUPPORTED_ABIS[0];
        } else {
            str = Build.CPU_ABI;
        }
        String str2 = "HA" + (Build.BOARD.length() % 10) + (Build.BRAND.length() % 10) + (str.length() % 10) + (Build.PRODUCT.length() % 10);
        String str3 = "";
        try {
            str3 = Build.class.getField("SERIAL").get(null).toString();
        } catch (Throwable unused) {
        }
        return str2 + ":" + str3;
    }

    /* renamed from: 鷭 */
    private static String m1809(byte[] bArr) {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            cArr[i * 2] = charArray[b >>> 4];
            cArr[(i * 2) + 1] = charArray[b & 15];
        }
        return new String(cArr).replaceAll("(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})", "$1-$2-$3-$4-$5");
    }
}
