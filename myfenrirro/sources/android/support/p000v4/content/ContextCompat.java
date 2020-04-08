package android.support.p000v4.content;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import java.io.File;

/* renamed from: android.support.v4.content.ContextCompat */
public class ContextCompat {
    private static final String DIR_ANDROID = "Android";
    private static final String DIR_CACHE = "cache";
    private static final String DIR_DATA = "data";
    private static final String DIR_FILES = "files";
    private static final String DIR_OBB = "obb";
    private static final String TAG = "ContextCompat";

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        int i = VERSION.SDK_INT;
        if (i >= 16) {
            ContextCompatJellybean.startActivities(context, intentArr, bundle);
            return true;
        } else if (i < 11) {
            return false;
        } else {
            ContextCompatHoneycomb.startActivities(context, intentArr);
            return true;
        }
    }

    public static File[] getObbDirs(Context context) {
        File file;
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            return ContextCompatKitKat.getObbDirs(context);
        }
        if (i >= 11) {
            file = ContextCompatHoneycomb.getObbDir(context);
        } else {
            file = buildPath(Environment.getExternalStorageDirectory(), DIR_ANDROID, DIR_OBB, context.getPackageName());
        }
        return new File[]{file};
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        File file;
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            return ContextCompatKitKat.getExternalFilesDirs(context, str);
        }
        if (i >= 8) {
            file = ContextCompatFroyo.getExternalFilesDir(context, str);
        } else {
            file = buildPath(Environment.getExternalStorageDirectory(), DIR_ANDROID, DIR_DATA, context.getPackageName(), DIR_FILES, str);
        }
        return new File[]{file};
    }

    public static File[] getExternalCacheDirs(Context context) {
        File file;
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            return ContextCompatKitKat.getExternalCacheDirs(context);
        }
        if (i >= 8) {
            file = ContextCompatFroyo.getExternalCacheDir(context);
        } else {
            file = buildPath(Environment.getExternalStorageDirectory(), DIR_ANDROID, DIR_DATA, context.getPackageName(), DIR_CACHE);
        }
        return new File[]{file};
    }

    private static File buildPath(File file, String... strArr) {
        for (String str : strArr) {
            if (file == null) {
                file = new File(str);
            } else if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    public static final Drawable getDrawable(Context context, int i) {
        if (VERSION.SDK_INT >= 21) {
            return ContextCompatApi21.getDrawable(context, i);
        }
        return context.getResources().getDrawable(i);
    }

    public static final ColorStateList getColorStateList(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return ContextCompatApi23.getColorStateList(context, i);
        }
        return context.getResources().getColorStateList(i);
    }

    public static final int getColor(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return ContextCompatApi23.getColor(context, i);
        }
        return context.getResources().getColor(i);
    }

    public static int checkSelfPermission(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public final File getNoBackupFilesDir(Context context) {
        if (VERSION.SDK_INT >= 21) {
            return ContextCompatApi21.getNoBackupFilesDir(context);
        }
        return createFilesDir(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    public static File getCodeCacheDir(Context context) {
        if (VERSION.SDK_INT >= 21) {
            return ContextCompatApi21.getCodeCacheDir(context);
        }
        return createFilesDir(new File(context.getApplicationInfo().dataDir, "code_cache"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.io.File createFilesDir(java.io.File r2) {
        /*
            java.lang.Class<android.support.v4.content.ContextCompat> r1 = android.support.p000v4.content.ContextCompat.class
            monitor-enter(r1)
            boolean r0 = r2.exists()     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x001d
            boolean r0 = r2.mkdirs()     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x001d
            boolean r0 = r2.exists()     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0017
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            return r2
        L_0x0017:
            r2.getPath()     // Catch:{ all -> 0x001f }
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            r0 = 0
            return r0
        L_0x001d:
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            return r2
        L_0x001f:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.content.ContextCompat.createFilesDir(java.io.File):java.io.File");
    }
}
