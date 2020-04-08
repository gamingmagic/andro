package p004o;

import android.os.Handler;
import android.os.Message;
import p004o.aby.C0169if;

/* renamed from: o.abz */
class abz extends Handler {

    /* renamed from: 鷭 */
    final /* synthetic */ aby f248;

    abz(aby aby) {
        this.f248 = aby;
    }

    public final void handleMessage(Message message) {
        C0169if ifVar = (C0169if) this.f248.f237.poll();
        if (!ifVar.f239) {
            int i = ifVar.f238 - 1;
            ifVar.f238 = i;
            if (i >= 0) {
                postDelayed(new aca(this, ifVar), 3000);
            }
        }
        this.f248.f236 = false;
        this.f248.mo3465();
    }
}
