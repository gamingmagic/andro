package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.䕢 */
final class C1491 extends C0762sz {
    C1491() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2569;
        int i3 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        byte b = byteBuffer.get();
        int i4 = byteBuffer.getInt();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        byte b4 = byteBuffer.get();
        C1111 r12 = new C1111(byteBuffer);
        C1665 r14 = new C1665(byteBuffer);
        if (!z) {
            C1853.m2524(i3, b, i4, b2, b3, b4, r12, r14);
        }
    }
}
