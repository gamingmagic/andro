package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.玕 */
final class C1684 extends C0762sz {
    C1684() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 157;
        int i3 = byteBuffer.getInt();
        int i4 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        byte b = byteBuffer.get();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        if (!z) {
            C1645 r15 = new C1645(i3, i4, b, s, s2, ((b2 - 3) - 6) * 5, ((b3 - 3) - 6) * 5, s3);
            C1014 r0 = C1014.f6161;
            C1014.m1841((C0520le) r15);
        }
    }
}
