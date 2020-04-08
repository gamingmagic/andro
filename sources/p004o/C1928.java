package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.뒫 */
final class C1928 extends C0762sz {
    C1928() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2615;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        int i3 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        C1111 r0 = new C1111(byteBuffer);
        int i4 = byteBuffer.getInt();
        byte b4 = byteBuffer.get();
        byte b5 = byteBuffer.get();
        int i5 = byteBuffer.getInt();
        short s3 = byteBuffer.getShort();
        C1665 r02 = new C1665(byteBuffer);
        byte b6 = byteBuffer.get();
        short s4 = byteBuffer.getShort();
        if (!z) {
            C2005.m2676(s, s2, i3, b, b2, b3, r0, i4, b4, b5, i5, s3, r02, b6, s4);
        }
    }
}
