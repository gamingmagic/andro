package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.邴 */
final class C1764 extends C0762sz {
    C1764() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 138;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        int i6 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        short s3 = byteBuffer.getShort();
        if (!z) {
            C1139.m1897(i3, i4, i5, i6, s, s2, b, s3);
        }
    }
}
