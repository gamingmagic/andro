package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.鬁 */
final class C1830 extends C0762sz {
    C1830() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2781;
        int i3 = byteBuffer.getInt();
        int i4 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        byteBuffer.getShort();
        byte b = byteBuffer.get();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        short s3 = byteBuffer.getShort();
        byteBuffer.get();
        byteBuffer.getShort();
        if (!z) {
            C1145.m1905(i3, i4, b, s, s2, b2, b3, s3);
        }
    }
}
