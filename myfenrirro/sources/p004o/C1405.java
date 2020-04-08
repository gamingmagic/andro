package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.㐂 */
final class C1405 extends C0762sz {
    C1405() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 168;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        if (!z) {
            int i3 = s - 2;
            if (((C1992) C1014.f6137.f1636.f6528.get(Integer.valueOf(i3))) != null) {
                C2030.m2699(this, i3, C1014.f6137.f1636.f1630, s2, b);
            }
        }
    }
}
