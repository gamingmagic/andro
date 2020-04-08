package p004o;

import java.nio.ByteBuffer;
import p004o.C0643pc.aux;

/* renamed from: o.酴 */
final class C1773 extends C0762sz {
    C1773() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        boolean z2 = C1014.f6140.f4443 != aux.iRO_Renewal && C1014.f6140.f4470 >= 20090603;
        this.f4671 = 257;
        short s = byteBuffer.getShort();
        byteBuffer.getShort();
        byte b = z2 ? byteBuffer.get() : 0;
        byte b2 = z2 ? byteBuffer.get() : 0;
        if (!z) {
            C1596.m2277(s, b, b2);
        }
    }
}
