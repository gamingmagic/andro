package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ઽે */
final class C1332 extends C0762sz {
    C1332() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 453;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        short s2 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        byte b4 = byteBuffer.get();
        C1111 r15 = new C1111(byteBuffer);
        if (!z) {
            m2056(s, i3, C0622ot.m731(s2), b, b2, b3, b4, r15, null);
        }
    }

    /* renamed from: 鷭 */
    static void m2056(short s, int i, int i2, byte b, byte b2, byte b3, byte b4, C1111 r22, C1665 r23) {
        short s2 = (short) (s - 2);
        C1992 r16 = new C1992(i2, i, b4, C1472.values()[b], b3 != 0, b2 != 0, false, 0, 0, 0, r22, 0, 0, r23);
        C1992 r15 = (C1992) C1014.f6137.f1636.f6498.put(Integer.valueOf(s2), r16);
        if (r15 != null) {
            r16.f8846 += r15.f8846;
        }
        C1014.f6147.f51.f1445.mo4533(C0572mz.CART);
    }
}
