package p004o;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: o.롑 */
final class C1951 extends C0762sz {
    C1951() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 225;
        int i3 = byteBuffer.getInt();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r3 = C0622ot.m741(bArr, opVar);
        if (!z && C1014.f6137.f1636.f6522 != null) {
            Iterator it = C1014.f6137.f1636.f6522.f8900.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C2013 r5 = (C2013) it.next();
                if (r5.f8906.equals(r3)) {
                    r5.f8907 = i3 > 0;
                }
            }
            C1014.f6147.f51.f1390.mo4284();
        }
    }
}
