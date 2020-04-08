package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.뛗 */
final class C1939 extends C0762sz {
    C1939() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2247;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        byteBuffer.get(new byte[i]);
        if (!z) {
            C1386.m2092(i3, i4, s, s2, b, b2, b3 == 1, 1);
        }
    }
}
