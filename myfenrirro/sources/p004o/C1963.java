package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* renamed from: o.뫙 */
class C1963 implements OnCancelListener {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ Throwable f8759;

    /* renamed from: 櫯 */
    private final /* synthetic */ Thread f8760;

    /* renamed from: 鷭 */
    final /* synthetic */ C1493 f8761;

    C1963(C1493 r1, Thread thread, Throwable th) {
        this.f8761 = r1;
        this.f8760 = thread;
        this.f8759 = th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f8761.mo4356(this.f8760, this.f8759);
    }
}
