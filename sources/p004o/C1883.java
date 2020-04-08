package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: o.굶 */
class C1883 implements OnCancelListener {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ Throwable f8495;

    /* renamed from: 櫯 */
    private final /* synthetic */ Thread f8496;

    /* renamed from: 鷭 */
    final /* synthetic */ C1493 f8497;

    C1883(C1493 r1, Thread thread, Throwable th) {
        this.f8497 = r1;
        this.f8496 = thread;
        this.f8495 = th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f8497.mo4356(this.f8496, this.f8495);
    }
}
