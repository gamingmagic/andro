package p004o;

import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;

/* renamed from: o.憍 */
final class C1595 extends C0762sz {
    C1595() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 713;
        byte b = byteBuffer.get();
        if (!z) {
            if (C1014.f6137.f1636 == null) {
                C0592ns.m674("too early PKT_MC_PARTYINVITESTATE");
                return;
            }
            C1014.f6137.f1636.f6531 = b;
            C1014.f6137.f1636.f6543 = true;
            C1746 r0 = C1014.f6147.f51.f1427;
            c_activity c_activity = C1014.f6147;
            r0.mo4489(C1746.f8026);
        }
    }
}
