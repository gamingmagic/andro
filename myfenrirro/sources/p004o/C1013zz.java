package p004o;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.roworkshop.andro.c_activity;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import p004o.aay.C0165;

/* renamed from: o.zz */
public final class C1013zz {

    /* renamed from: Ą */
    private static boolean f6131 = false;

    /* renamed from: ȃ */
    static long f6132;

    /* renamed from: ˮ͈ */
    static boolean f6133 = false;

    /* renamed from: 櫯 */
    static String f6134 = null;

    /* renamed from: 鷭 */
    static String f6135 = null;

    static {
    }

    /* renamed from: 鷭 */
    public static void m1817(c_activity c_activity, String str) {
        c_activity c_activity2 = c_activity;
        c_activity c_activity3 = c_activity2;
        String str2 = str;
        String str3 = "https://sdk.hockeyapp.net/";
        c_activity c_activity4 = c_activity2;
        if (c_activity2 != null) {
            if (f6132 == 0) {
                f6132 = System.currentTimeMillis();
            }
            f6134 = str3;
            f6135 = acx.m137(str2);
            f6131 = false;
            C1012zy.m1810((Context) c_activity4);
            if (f6135 == null) {
                f6135 = C1012zy.f6126;
            }
        }
        c_activity c_activity5 = c_activity3;
        Boolean valueOf = Boolean.valueOf(false);
        WeakReference weakReference = new WeakReference(c_activity5);
        int r7 = m1815(weakReference);
        if (r7 == 1) {
            f6131 = true;
            if (!Boolean.valueOf(Boolean.valueOf(!(c_activity5 instanceof Activity)).booleanValue() | PreferenceManager.getDefaultSharedPreferences(c_activity5).getBoolean("always_send_crash_reports", false)).booleanValue()) {
                boolean booleanValue = valueOf.booleanValue();
                WeakReference weakReference2 = weakReference;
                Context context = (Context) weakReference.get();
                if (context != null) {
                    Builder builder = new Builder(context);
                    builder.setTitle(String.format(context.getString(C0165.hockeyapp_crash_dialog_title), new Object[]{acx.m139(context)}));
                    builder.setMessage(C0165.hockeyapp_crash_dialog_message);
                    builder.setNegativeButton(C0165.hockeyapp_crash_dialog_negative_button, new aaa(null, weakReference2, booleanValue));
                    builder.setNeutralButton(C0165.hockeyapp_crash_dialog_neutral_button, new aab(null, weakReference2, booleanValue));
                    builder.setPositiveButton(C0165.hockeyapp_crash_dialog_positive_button, new aac(null, weakReference2, booleanValue));
                    builder.create().show();
                }
                return;
            }
            m1819(weakReference, null, valueOf.booleanValue());
        } else if (r7 == 2) {
            m1819(weakReference, null, valueOf.booleanValue());
        } else {
            m1820((aag) null, valueOf.booleanValue());
        }
    }

    /* renamed from: 鷭 */
    private static int m1815(WeakReference<Context> weakReference) {
        String[] r3 = m1822();
        List list = null;
        if (r3 == null || r3.length <= 0) {
            return 0;
        }
        List list2 = null;
        if (weakReference != null) {
            try {
                Context context = (Context) weakReference.get();
                if (context != null) {
                    list2 = Arrays.asList(context.getSharedPreferences("HockeySDK", 0).getString("ConfirmedFilenames", "").split("\\|"));
                }
            } catch (Exception unused) {
            }
        }
        list = list2;
        if (list != null) {
            String[] strArr = r3;
            int length = r3.length;
            int i = 0;
            while (i < length) {
                if (list.contains(strArr[i])) {
                    i++;
                }
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: 鷭 */
    public static boolean m1821(abp abp, aag aag, WeakReference<Context> weakReference, boolean z) {
        switch (aaf.f123[abp.ordinal()]) {
            case 1:
                WeakReference<Context> weakReference2 = weakReference;
                String[] r3 = m1822();
                if (r3 != null && r3.length > 0) {
                    new StringBuilder("Found ").append(r3.length).append(" stacktrace(s).");
                    for (int i = 0; i < r3.length; i++) {
                        if (weakReference2 != null) {
                            try {
                                new StringBuilder("Delete stacktrace ").append(r3[i]).append(".");
                                m1812(weakReference2, r3[i]);
                                Context context = (Context) weakReference2.get();
                                if (context != null) {
                                    context.deleteFile(r3[i]);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
                m1820(aag, z);
                return true;
            case 2:
                Context context2 = null;
                if (weakReference != null) {
                    context2 = (Context) weakReference.get();
                }
                if (context2 == null) {
                    return false;
                }
                PreferenceManager.getDefaultSharedPreferences(context2).edit().putBoolean("always_send_crash_reports", true).apply();
                m1819(weakReference, aag, z);
                return true;
            case 3:
                m1819(weakReference, aag, z);
                return true;
            default:
                return false;
        }
    }

    /* renamed from: 鷭 */
    private static void m1819(WeakReference<Context> weakReference, aag aag, boolean z) {
        m1813(weakReference);
        m1820(aag, z);
        Context context = (Context) weakReference.get();
        if ((context == null || acx.m145(context)) && !f6133) {
            f6133 = true;
            new aad(weakReference, aag, null).start();
        }
    }

    /* renamed from: 鷭 */
    private static void m1820(aag aag, boolean z) {
        if (!TextUtils.isEmpty(C1012zy.f6129) && !TextUtils.isEmpty(C1012zy.f6126)) {
            UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                new StringBuilder("Current handler class = ").append(defaultUncaughtExceptionHandler.getClass().getName());
            }
            if (defaultUncaughtExceptionHandler instanceof aah) {
                ((aah) defaultUncaughtExceptionHandler).f126 = aag;
            } else {
                Thread.setDefaultUncaughtExceptionHandler(new aah(defaultUncaughtExceptionHandler, aag, z));
            }
        }
    }

    /* renamed from: 鷭 */
    static void m1818(WeakReference<Context> weakReference, String str) {
        if (weakReference != null) {
            Context context = (Context) weakReference.get();
            if (context != null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("HockeySDK", 0);
                Editor edit = sharedPreferences.edit();
                int i = sharedPreferences.getInt("RETRY_COUNT: " + str, 0);
                if (i > 0) {
                    m1812(weakReference, str);
                    m1814(weakReference, str);
                    return;
                }
                edit.putInt("RETRY_COUNT: " + str, i + 1);
                edit.apply();
            }
        }
    }

    /* renamed from: 櫯 */
    static void m1814(WeakReference<Context> weakReference, String str) {
        if (weakReference != null) {
            Context context = (Context) weakReference.get();
            if (context != null) {
                Editor edit = context.getSharedPreferences("HockeySDK", 0).edit();
                edit.remove("RETRY_COUNT: " + str);
                edit.apply();
            }
        }
    }

    /* renamed from: ˮ͈ */
    static void m1812(WeakReference<Context> weakReference, String str) {
        if (weakReference != null) {
            Context context = (Context) weakReference.get();
            if (context != null) {
                context.deleteFile(str);
                context.deleteFile(str.replace(".stacktrace", ".user"));
                context.deleteFile(str.replace(".stacktrace", ".contact"));
                context.deleteFile(str.replace(".stacktrace", ".description"));
            }
        }
    }

    /* renamed from: ȃ */
    static String m1811(WeakReference<Context> weakReference, String str) {
        if (weakReference != null) {
            Context context = (Context) weakReference.get();
            if (context != null) {
                StringBuilder sb = new StringBuilder();
                String str2 = null;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.openFileInput(str)));
                    while (true) {
                        str2 = bufferedReader.readLine();
                        if (str2 != null) {
                            sb.append(str2);
                            sb.append(System.getProperty("line.separator"));
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    bufferedReader.close();
                } catch (FileNotFoundException unused2) {
                    if (str2 != null) {
                        try {
                            str2.close();
                        } catch (IOException unused3) {
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    if (str2 != null) {
                        try {
                            str2.close();
                        } catch (IOException unused4) {
                        }
                    }
                } finally {
                    if (str2 != null) {
                        try {
                            str2.close();
                        } catch (IOException unused5) {
                        }
                    }
                }
                return sb.toString();
            }
        }
        return null;
    }

    /* renamed from: 櫯 */
    private static void m1813(WeakReference<Context> weakReference) {
        if (weakReference != null) {
            Context context = (Context) weakReference.get();
            if (context != null) {
                try {
                    String[] r2 = m1822();
                    Editor edit = context.getSharedPreferences("HockeySDK", 0).edit();
                    edit.putString("ConfirmedFilenames", m1816(r2, "|"));
                    edit.apply();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: 鷭 */
    private static String m1816(String[] strArr, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArr.length; i++) {
            stringBuffer.append(strArr[i]);
            if (i < strArr.length - 1) {
                stringBuffer.append(str);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: 鷭 */
    static String[] m1822() {
        if (C1012zy.f6130 == null) {
            return null;
        }
        new StringBuilder("Looking for exceptions in: ").append(C1012zy.f6130);
        File file = new File(C1012zy.f6130 + "/");
        if (file.mkdir() || file.exists()) {
            return file.list(new aae());
        }
        return new String[0];
    }
}
