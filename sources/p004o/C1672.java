package p004o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.灶 */
class C1672 implements Runnable {

    /* renamed from: 鷭 */
    final /* synthetic */ C1428 f7652;

    C1672(C1428 r1) {
        this.f7652 = r1;
    }

    public final void run() {
        try {
            C1428 r3 = this.f7652;
            synchronized (r3.f7018.f4656) {
                C0758sw swVar = r3.f7018;
                C1357 r6 = r3.f7003;
                C0660pj pjVar = r3.f7000;
                C0663pk pkVar = r3.f7001;
                if (swVar.f4655) {
                    if (!(swVar.f4656 == null || swVar.f4656.f4677 == 0)) {
                        C0624ov.m756();
                    }
                } else if (swVar.f4656.f4677 != 0) {
                    ByteBuffer order = ByteBuffer.wrap(swVar.f4656.f4679, swVar.f4656.f4678, swVar.f4656.f4677).order(ByteOrder.LITTLE_ENDIAN);
                    do {
                        boolean z = r6 != null && r6.f2995;
                        if (!swVar.mo4091(order, pjVar, pkVar)) {
                            break;
                        } else if (z && order.position() % 16 > 0) {
                            order.position(((order.position() / 16) * 16) + 16);
                        }
                    } while (!swVar.f4655);
                    swVar.f4656.f4678 = Math.min(order.position(), swVar.f4656.f4677);
                    swVar.f4656.mo4099();
                }
                if (r3.f7007 != null && r3.f7007.f7024 && !r3.f7018.f4655) {
                    C0758sw swVar2 = r3.f7018;
                    swVar2.f4656.f4678 = 0;
                    swVar2.f4656.f4677 = 0;
                }
            }
            synchronized (r3.f7004) {
                r3.f7004.notify();
            }
        } catch (C0823ts e) {
            C0592ns.m674(e.getMessage());
            C0758sw swVar3 = this.f7652.f7018;
            swVar3.f4656.f4678 = 0;
            swVar3.f4656.f4677 = 0;
        }
    }
}
