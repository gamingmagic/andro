package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ɸ */
final class C1150 extends C0762sz {
    C1150() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2256;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byteBuffer.getShort();
        byte b = byteBuffer.get();
        if (!z) {
            C1513.m2209(s, s2, b == 0);
        }
    }
}
