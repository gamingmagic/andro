package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ɰ */
final class C1145 extends C0762sz {
    C1145() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 158;
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        byte b = byteBuffer.get();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        short s4 = byteBuffer.getShort();
        if (!z) {
            int i4 = i3;
            int r1 = C0622ot.m731(s);
            C1014.f6158.f674.f608.mo4465(C0622ot.m731(s));
            m1905(i4, r1, b, s2, s3, b2, b3, s4);
        }
    }

    /* renamed from: 鷭 */
    static void m1905(int i, int i2, byte b, short s, short s2, byte b2, byte b3, short s3) {
        C1645 r9 = new C1645(i, i2, b, s, s2, ((b2 - 3) - 6) * 5, ((b3 - 3) - 6) * 5, s3);
        C1014 r0 = C1014.f6161;
        C1014.m1841((C0520le) r9);
    }
}
