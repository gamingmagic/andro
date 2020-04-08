package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.蚟 */
class C1744 implements OnClickListener {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ Thread f8021;

    /* renamed from: 櫯 */
    private final /* synthetic */ Throwable f8022;

    /* renamed from: 鷭 */
    final /* synthetic */ C1493 f8023;

    C1744(C1493 r1, Throwable th, Thread thread) {
        this.f8023 = r1;
        this.f8022 = th;
        this.f8021 = thread;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8023.mo4355("Corrupted file name", ((C0821tq) this.f8022).f5009.getAbsolutePath(), this.f8021, this.f8022);
    }
}
