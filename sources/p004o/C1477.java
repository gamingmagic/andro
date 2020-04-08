package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.䓞 */
final class C1477 extends C0762sz {
    C1477() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        C1919 r0;
        this.f4671 = 436;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        if (!z) {
            C0520le leVar = (C0520le) C1014.f6137.f1637.get(i3);
            if (leVar == null) {
                r0 = null;
            } else {
                r0 = C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null;
            }
            C1919 r3 = r0;
            if (r0 != null) {
                r3.f8637 = i4;
                r3.f8638 = s;
            }
        }
    }
}
