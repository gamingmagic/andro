package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ꃶ */
final class C1870 extends C0762sz {
    C1870() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        C1919 r0;
        this.f4671 = 432;
        int i3 = byteBuffer.getInt();
        byteBuffer.get();
        int i4 = byteBuffer.getInt();
        if (!z) {
            C0520le leVar = (C0520le) C1014.f6137.f1637.get(i3);
            if (leVar == null) {
                r0 = null;
            } else {
                r0 = C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null;
            }
            C1919 r5 = r0;
            if (r0 != null && r5.f1633 != i4) {
                r5.f1633 = i4;
                ((C0548mb) C1014.f6142.f1680.f1189.get(Integer.valueOf(i3))).mo4018();
            }
        }
    }
}
