package p004o;

import net.hockeyapp.android.UpdateActivity;

/* renamed from: o.abe */
public class abe implements Runnable {

    /* renamed from: 鷭 */
    final /* synthetic */ UpdateActivity f163;

    public abe(UpdateActivity updateActivity) {
        this.f163 = updateActivity;
    }

    public final void run() {
        this.f163.showDialog(0);
    }
}
