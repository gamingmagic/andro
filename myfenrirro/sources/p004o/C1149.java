package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ɷ */
final class C1149 extends C0762sz {
    C1149() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 170;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        if (C1014.f6140.f4470 >= 20100629) {
            byteBuffer.getShort();
        }
        byte b = byteBuffer.get();
        if (!z) {
            C1513.m2209(s, s2, b == 1);
        }
    }
}
