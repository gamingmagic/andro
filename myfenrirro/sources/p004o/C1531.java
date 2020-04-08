package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.匿 */
class C1531 implements OnClickListener {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ Throwable f7296;

    /* renamed from: 櫯 */
    private final /* synthetic */ Thread f7297;

    /* renamed from: 鷭 */
    final /* synthetic */ C1493 f7298;

    C1531(C1493 r1, Thread thread, Throwable th) {
        this.f7298 = r1;
        this.f7297 = thread;
        this.f7296 = th;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f7298.mo4356(this.f7297, this.f7296);
    }
}
