package p004o;

import android.app.AlertDialog.Builder;
import com.roworkshop.andro.c_activity;
import java.io.File;

/* renamed from: o.썫 */
public class C1991 implements Runnable {

    /* renamed from: 鷭 */
    final /* synthetic */ c_activity f8829;

    public C1991(c_activity c_activity) {
        this.f8829 = c_activity;
    }

    public final void run() {
        c_activity c_activity = this.f8829;
        if (C0441in.f1306 <= 0 || C0441in.f1306 >= 2048) {
            if (C0441in.f1306 < 4096) {
                C0595nv.f2868 = false;
                C0595nv.f2870 = false;
                C1014.f6160.mo3792();
            }
            if (C0595nv.f2879 == C0564mr.localclient) {
                File file = new File(C0595nv.f2874);
                if (!C0653pe.m800(file) || C1014.f6155) {
                    C1014.f6155 = false;
                    c_activity.f51.f1413.mo3537h_();
                    return;
                }
                C0595nv.f2869 = C0595nv.f2874;
                c_activity.mo3386(file);
                return;
            }
            c_activity.f54 = new C0280do("Temporary masterserver thread");
            c_activity.f55 = System.currentTimeMillis();
            C0280do doVar = c_activity.f54;
            int i = c_activity.f45[10] - 1;
            String r11 = c_activity.m24(i, i, i);
            C0585nl nlVar = C0585nl.MASTER;
            C1903 r13 = new C1903(c_activity);
            C1984 r15 = new C1984(c_activity);
            C1624 r0 = new C1624(c_activity);
            doVar.mo3387(new C1976(doVar, r11, 4121, nlVar, c_activity, r13, r15, r0));
            Runnable runnable = c_activity.f52;
            c_activity c_activity2 = c_activity;
            if (c_activity.f56 != null) {
                c_activity2.f56.postDelayed(new C1348(c_activity2, runnable), 100);
            }
            return;
        }
        Builder builder = new Builder(c_activity);
        builder.setMessage("Sorry, this application is not compatible with your device (max. texture dimension=" + C0441in.f1306 + " < 2048");
        builder.show();
        builder.setOnCancelListener(new C1342(c_activity));
    }
}
