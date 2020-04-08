package p004o;

import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p004o.C1428.C1429;

/* renamed from: o.뼠 */
class C1976 implements Runnable {

    /* renamed from: Ą */
    private final /* synthetic */ C0598ny f8784;

    /* renamed from: ą */
    private final /* synthetic */ Runnable f8785;

    /* renamed from: Ć */
    private final /* synthetic */ Runnable f8786;

    /* renamed from: ć */
    private final /* synthetic */ Runnable f8787;

    /* renamed from: ȃ */
    private final /* synthetic */ C0585nl f8788;

    /* renamed from: ˮ͈ */
    private final /* synthetic */ int f8789;

    /* renamed from: 櫯 */
    private final /* synthetic */ String f8790;

    /* renamed from: 鷭 */
    final /* synthetic */ C1428 f8791;

    C1976(C1428 r1, String str, int i, C0585nl nlVar, c_activity c_activity, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        this.f8791 = r1;
        this.f8790 = str;
        this.f8789 = i;
        this.f8788 = nlVar;
        this.f8784 = c_activity;
        this.f8785 = runnable;
        this.f8786 = runnable2;
        this.f8787 = runnable3;
    }

    public final void run() {
        C1428 r3 = this.f8791;
        String str = this.f8790;
        int i = this.f8789;
        C0585nl nlVar = this.f8788;
        C0598ny nyVar = this.f8784;
        Runnable runnable = this.f8785;
        Runnable runnable2 = this.f8786;
        Runnable runnable3 = this.f8787;
        r3.f7009 = new C1429();
        r3.f7009.f7033 = str;
        r3.f7009.f7031 = i;
        r3.f7009.f7027 = nlVar;
        r3.f7009.f7025 = nyVar != null ? nyVar : C1014.f6147;
        r3.f7009.f7020 = runnable;
        r3.f7009.f7021 = runnable2;
        r3.f7009.f7022 = runnable3;
        r3.f7009.f7023 = System.currentTimeMillis();
        r3.f7009.f7028 = new C0765ta(r3.f7011);
        r3.f7009.f7032 = (ByteBuffer) ByteBuffer.allocate(r3.f7014).order(ByteOrder.LITTLE_ENDIAN).position(0);
        if (!(r3.f7009.f7027 == C0585nl.RESOURCE)) {
            C1014.f6147.mo3387((Runnable) new C0162a(r3));
        }
    }
}
