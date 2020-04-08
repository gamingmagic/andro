package p004o;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Date;
import java.util.UUID;

/* renamed from: o.aah */
public final class aah implements UncaughtExceptionHandler {

    /* renamed from: ˮ͈ */
    private UncaughtExceptionHandler f124;

    /* renamed from: 櫯 */
    private boolean f125 = false;

    /* renamed from: 鷭 */
    aag f126;

    public aah(UncaughtExceptionHandler uncaughtExceptionHandler, aag aag, boolean z) {
        this.f124 = uncaughtExceptionHandler;
        this.f125 = z;
        this.f126 = aag;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        aax.m61();
        if (C1012zy.f6130 == null) {
            this.f124.uncaughtException(thread, th);
            return;
        }
        BufferedWriter bufferedWriter = this.f126;
        Thread thread2 = thread;
        Throwable th2 = th;
        Date date = new Date();
        Date date2 = new Date(C1013zz.f6132);
        th2.printStackTrace(new PrintWriter(new StringWriter()));
        String uuid = UUID.randomUUID().toString();
        abo abo = new abo(uuid, th2);
        abo abo2 = abo;
        abo.f190 = C1012zy.f6126;
        abo2.f184 = C1012zy.f6129;
        abo2.f186 = C1012zy.f6127;
        abo2.f185 = date2;
        abo2.f180 = date;
        abo2.f181 = C1012zy.f6122;
        abo2.f182 = C1012zy.f6123;
        abo2.f183 = C1012zy.f6125;
        abo2.f188 = C1012zy.f6124;
        if (thread2 != null) {
            abo2.f192 = thread2.getName() + "-" + thread2.getId();
        }
        if (C1012zy.f6128 != null) {
            abo2.f187 = C1012zy.f6128;
        }
        abo abo3 = abo2;
        bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(C1012zy.f6130 + "/" + abo3.f191 + ".stacktrace"));
            bufferedWriter = bufferedWriter2;
            abo.m81(bufferedWriter2, "Package", abo3.f190);
            abo.m81(bufferedWriter, "Version Code", abo3.f184);
            abo.m81(bufferedWriter, "Version Name", abo3.f186);
            abo.m81(bufferedWriter, "Android", abo3.f181);
            abo.m81(bufferedWriter, "Android Build", abo3.f182);
            abo.m81(bufferedWriter, "Manufacturer", abo3.f183);
            abo.m81(bufferedWriter, "Model", abo3.f188);
            abo.m81(bufferedWriter, "Thread", abo3.f192);
            abo.m81(bufferedWriter, "CrashReporter Key", abo3.f187);
            abo.m81(bufferedWriter, "Start Date", abo.f179.format(abo3.f185));
            abo.m81(bufferedWriter, "Date", abo.f179.format(abo3.f180));
            bufferedWriter.write("\n");
            bufferedWriter.write(abo3.f189);
            bufferedWriter.flush();
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                String str = "Error saving crash report!";
                IOException iOException = e;
                String str2 = "HockeyApp";
                if (acr.f312 <= 6) {
                    Log.e(str2, str, iOException);
                }
            }
        } catch (IOException e2) {
            String str3 = "Error saving crash report!";
            IOException iOException2 = e2;
            String str4 = "HockeyApp";
            if (acr.f312 <= 6) {
                Log.e(str4, str3, iOException2);
            }
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e3) {
                    String str5 = "Error saving crash report!";
                    IOException iOException3 = e3;
                    String str6 = "HockeyApp";
                    if (acr.f312 <= 6) {
                        Log.e(str6, str5, iOException3);
                    }
                }
            }
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e4) {
                    String str7 = "Error saving crash report!";
                    IOException iOException4 = e4;
                    String str8 = "HockeyApp";
                    if (acr.f312 <= 6) {
                        Log.e(str8, str7, iOException4);
                    }
                }
            }
        }
        if (bufferedWriter != null) {
            String str9 = null;
            try {
                if (!TextUtils.isEmpty(null)) {
                    String str10 = null;
                    if (str10.length() > 255) {
                        String str11 = null;
                        str9 = str11.substring(0, 255);
                    }
                }
                m58(str9, uuid + ".user");
                String str12 = null;
                if (!TextUtils.isEmpty(null)) {
                    String str13 = null;
                    if (str13.length() > 255) {
                        String str14 = null;
                        str12 = str14.substring(0, 255);
                    }
                }
                m58(str12, uuid + ".contact");
                m58(null, uuid + ".description");
            } catch (IOException e5) {
                String str15 = "Error saving crash meta data!";
                IOException iOException5 = e5;
                String str16 = "HockeyApp";
                if (acr.f312 <= 6) {
                    Log.e(str16, str15, iOException5);
                }
            }
        }
        if (!this.f125) {
            this.f124.uncaughtException(thread, th);
            return;
        }
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    /* renamed from: 鷭 */
    private static void m58(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            BufferedWriter bufferedWriter = null;
            try {
                String str3 = C1012zy.f6130 + "/" + str2;
                if (!TextUtils.isEmpty(str) && TextUtils.getTrimmedLength(str) > 0) {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(str3));
                    bufferedWriter = bufferedWriter2;
                    bufferedWriter2.write(str);
                    bufferedWriter.flush();
                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException unused) {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (Throwable th) {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                throw th;
            }
        }
    }
}
