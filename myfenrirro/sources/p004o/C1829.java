package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.髵 */
final class C1829 extends C0762sz {
    C1829() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2248;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        int i6 = byteBuffer.getInt();
        int i7 = byteBuffer.getInt();
        byteBuffer.get();
        short s = byteBuffer.getShort();
        byte b = byteBuffer.get();
        int i8 = byteBuffer.getInt();
        if (!z) {
            C1139.m1897(i3, i4, i5, i6, i7, s, b, i8);
        }
    }
}
