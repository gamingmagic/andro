package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.魕 */
final class C1841 extends C0762sz {
    C1841() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        short s;
        this.f4671 = 164;
        C1888[] r25 = new C1888[i];
        for (int i3 = 0; i3 < r25.length; i3++) {
            short s2 = byteBuffer.getShort();
            short s3 = byteBuffer.getShort();
            byte b = byteBuffer.get();
            byte b2 = byteBuffer.get();
            short s4 = byteBuffer.getShort();
            short s5 = byteBuffer.getShort();
            byte b3 = byteBuffer.get();
            byte b4 = byteBuffer.get();
            C1111 r0 = new C1111(byteBuffer);
            short s6 = s2;
            int r2 = C0622ot.m731(s3);
            byte b5 = b;
            short s7 = s4;
            short s8 = s5;
            byte b6 = b4;
            C1111 r7 = r0;
            if (C1014.f6158 != null) {
                C1701 r8 = C1014.f6158.f674.f608.mo4465(C0622ot.m731(s3));
                s = (short) (r8 == null ? -1 : r8.f7762);
            } else {
                s = 0;
            }
            r25[i3] = new C1888(s6, r2, b5, s7, s8, b6, r7, 0, 0, s, 0, null, (byte) ((b2 != 0 ? 1 : 0) | (b3 != 0 ? 2 : 0)));
        }
        if (!z) {
            C1193.m1948(r25);
        }
    }
}
