package p004o;

import net.hockeyapp.android.UpdateActivity;

/* renamed from: o.abd */
public class abd implements Runnable {

    /* renamed from: 鷭 */
    final /* synthetic */ UpdateActivity f162;

    public abd(UpdateActivity updateActivity) {
        this.f162 = updateActivity;
    }

    public final void run() {
        this.f162.showDialog(0);
    }
}
