package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.鱾 */
final class C1853 extends C0762sz {
    C1853() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2063;
        short s = byteBuffer.getShort();
        byte b = byteBuffer.get();
        int i3 = byteBuffer.getInt();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        byte b4 = byteBuffer.get();
        C1111 r13 = new C1111(byteBuffer);
        if (!z) {
            m2524(C0622ot.m731(s), b, i3, b2, b3, b4, r13, null);
        }
    }

    /* renamed from: 鷭 */
    static void m2524(int i, byte b, int i2, byte b2, byte b3, byte b4, C1111 r21, C1665 r22) {
        C1472 r4;
        if (i == 0) {
            C1014.f6147.f51.f1384.mo3846(i2);
            return;
        }
        int i3 = i;
        int i4 = i2;
        byte b5 = b4;
        if (b == -1) {
            C1701 r42 = C1014.f6158.f674.f608.mo4465(i);
            r4 = r42 == null ? null : r42.f7765;
        } else {
            r4 = C1472.values()[b];
        }
        C1014.f6147.f51.f1384.mo3848(new C1992(i3, i4, b5, r4, b3 != 0, b2 != 0, false, 0, 0, 0, r21, 0, 0, r22));
    }
}
