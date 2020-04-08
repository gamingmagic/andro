package p004o;

import java.nio.ByteBuffer;
import p004o.C0643pc.C0645;

/* renamed from: o.䂚 */
final class C1446 extends C0762sz {
    C1446() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 746;
        C1510[] r4 = new C1510[i];
        if (C1014.f6140.f4447 == C0645.HERCULES && byteBuffer.position() >= 4 && byteBuffer.getShort(byteBuffer.position() - 2) == 28) {
            r4 = new C1510[0];
        }
        for (int i3 = 0; i3 < r4.length; i3++) {
            r4[i3] = C1510.m2208(byteBuffer, C1014.f6140.f4470, false);
        }
        if (!z) {
            C1544.m2231(r4);
        }
    }
}
