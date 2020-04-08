package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.甄 */
class C1691 implements OnClickListener {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ Throwable f7742;

    /* renamed from: 櫯 */
    private final /* synthetic */ Thread f7743;

    /* renamed from: 鷭 */
    final /* synthetic */ C1493 f7744;

    C1691(C1493 r1, Thread thread, Throwable th) {
        this.f7744 = r1;
        this.f7743 = thread;
        this.f7742 = th;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f7744.mo4356(this.f7743, this.f7742);
    }
}
