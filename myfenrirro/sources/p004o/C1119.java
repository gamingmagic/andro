package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.Ȟ */
final class C1119 extends C0762sz {
    C1119() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        C1919 r0;
        this.f4671 = 156;
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        byte b = byteBuffer.get();
        if (!z) {
            C0520le leVar = (C0520le) C1014.f6137.f1637.get(i3);
            if (leVar == null) {
                r0 = null;
            } else {
                r0 = C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null;
            }
            C1919 r3 = r0;
            if (r0 != null) {
                r3.f8639 = b;
                C1919 r4 = r3;
                C0206bb bbVar = C0206bb.class.isAssignableFrom(r4.getClass()) ? r4 : null;
                if (bbVar != null) {
                    bbVar.f459 = s;
                }
            }
        }
    }
}
