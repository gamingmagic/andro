package p004o;

import android.app.AlertDialog.Builder;
import android.content.ClipData;
import android.content.ClipboardManager;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: o.䖫 */
public final class C1493 implements UncaughtExceptionHandler {

    /* renamed from: 鷭 */
    private UncaughtExceptionHandler f7171 = Thread.getDefaultUncaughtExceptionHandler();

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4356(Thread thread, Throwable th) {
        Class<OutOfMemoryError> cls = th.getClass();
        if ((cls == C0822tr.class && !((C0822tr) th).f5010) || cls == C0821tq.class || cls == OutOfMemoryError.class) {
            System.exit(1);
        } else {
            this.f7171.uncaughtException(thread, th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4355(String str, String str2, Thread thread, Throwable th) {
        ((ClipboardManager) C1014.f6147.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, str2));
        Builder builder = new Builder(C1014.f6147);
        builder.setMessage(new StringBuilder(String.valueOf(str)).append(" has been copied to clipboard").toString());
        builder.setCancelable(true);
        builder.setOnCancelListener(new C1963(this, thread, th));
        builder.show();
    }

    /* renamed from: 櫯 */
    public final void mo4354(Thread thread, Throwable th) {
        if (C1014.f6158 != null) {
            C1014.f6158.f1341.interrupt();
        }
        if (!(C1014.f6147 == null || C1014.f6147.f56 == null)) {
            C1014.f6147.f56 = null;
        }
        if (!(C1014.f6142 == null || C1014.f6142.f1698 == null)) {
            C1812 r4 = C1014.f6142.f1698;
            C1657 r3 = new C1657(this);
            C1812 r2 = r4;
            synchronized (r4) {
                r2.f8360.add(r3);
            }
        }
        if (C1014.f6148 != null) {
            C1014.f6148.f1341.interrupt();
            C1014.f6148 = null;
        }
        Builder builder = new Builder(C1014.f6147);
        if (th.getClass() == C0825tu.class) {
            builder.setTitle("Resource not found");
            builder.setPositiveButton("Copy and quit", new C1856(this, th, thread));
            builder.setNegativeButton("Quit", new C1531(this, thread, th));
        } else if (th.getClass() == OutOfMemoryError.class) {
            builder.setTitle("Out of memory");
        } else if (th.getClass() == C0821tq.class) {
            builder.setTitle("Corrupted patch file");
            builder.setPositiveButton("Delete file and quit", new C1524(this, th, thread));
            builder.setNeutralButton("Copy file name and quit", new C1744(this, th, thread));
            builder.setNegativeButton("Quit", new C1691(this, thread, th));
        } else {
            builder.setTitle("Fatal Error");
        }
        builder.setMessage(th.getMessage());
        builder.setCancelable(true);
        if (C0595nv.f2879 == C0564mr.all) {
            th.printStackTrace();
        }
        builder.setOnCancelListener(new C1883(this, thread, th)).show();
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        Throwable th2 = th;
        Thread thread2 = thread;
        if (Thread.currentThread().getName().equals("main")) {
            this.f7171.uncaughtException(thread, th);
        } else {
            C1014.f6147.mo3387((Runnable) new C1816(this, thread2, th2));
        }
    }
}
