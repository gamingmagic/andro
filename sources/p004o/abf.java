package p004o;

import net.hockeyapp.android.UpdateActivity;

/* renamed from: o.abf */
public class abf implements Runnable {

    /* renamed from: 鷭 */
    final /* synthetic */ UpdateActivity f164;

    public abf(UpdateActivity updateActivity) {
        this.f164 = updateActivity;
    }

    public final void run() {
        this.f164.showDialog(0);
    }
}
