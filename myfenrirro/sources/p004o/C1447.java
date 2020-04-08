package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.䃝 */
final class C1447 extends C0762sz {
    C1447() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2572;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        C1111 r0 = new C1111(byteBuffer);
        int i3 = byteBuffer.getInt();
        byte b4 = byteBuffer.get();
        byte b5 = byteBuffer.get();
        int i4 = byteBuffer.getInt();
        short s4 = byteBuffer.getShort();
        C1665 r26 = new C1665(byteBuffer);
        if (!z) {
            C2005.m2676(s, s2, C0622ot.m731(s3), b, b2, b3, r0, i3, b4, b5, i4, s4, r26, 0, 0);
        }
    }
}
