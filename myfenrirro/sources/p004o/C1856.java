package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.鳿 */
class C1856 implements OnClickListener {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ Thread f8449;

    /* renamed from: 櫯 */
    private final /* synthetic */ Throwable f8450;

    /* renamed from: 鷭 */
    final /* synthetic */ C1493 f8451;

    C1856(C1493 r1, Throwable th, Thread thread) {
        this.f8451 = r1;
        this.f8450 = th;
        this.f8449 = thread;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8451.mo4355("Resource name", ((C0825tu) this.f8450).f5011, this.f8449, this.f8450);
    }
}
