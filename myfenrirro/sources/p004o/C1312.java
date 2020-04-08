package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.م */
class C1312 extends C0762sz {
    C1312() {
    }

    /* renamed from: 鷭 */
    public void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2554;
        byteBuffer.getShort();
        C1770[] r5 = new C1770[i];
        for (int i3 = 0; i3 < r5.length; i3++) {
            ByteBuffer byteBuffer2 = byteBuffer;
            C1770 r2 = new C1770();
            r2.f8305 = byteBuffer2.getInt();
            r2.f8303 = byteBuffer2.getInt();
            r2.f8302 = byteBuffer2.getShort();
            r2.f8301 = byteBuffer2.getShort();
            r5[i3] = r2;
        }
        if (!z) {
            C1254.m2005(r5);
        }
    }
}
