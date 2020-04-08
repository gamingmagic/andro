package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.傻 */
class C1524 implements OnClickListener {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ Thread f7274;

    /* renamed from: 櫯 */
    private final /* synthetic */ Throwable f7275;

    /* renamed from: 鷭 */
    final /* synthetic */ C1493 f7276;

    C1524(C1493 r1, Throwable th, Thread thread) {
        this.f7276 = r1;
        this.f7275 = th;
        this.f7274 = thread;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ((C0821tq) this.f7275).f5009.delete();
        this.f7276.mo4356(this.f7274, this.f7275);
    }
}
