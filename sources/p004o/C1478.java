package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.䓪 */
final class C1478 extends C0762sz {
    C1478() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2725;
        C1178[] r5 = new C1178[i];
        for (int i3 = 0; i3 < r5.length; i3++) {
            ByteBuffer byteBuffer2 = byteBuffer;
            C1178 r2 = new C1178();
            r2.f6297 = byteBuffer2.getInt();
            r2.f6295 = byteBuffer2.getInt();
            r2.f6292 = byteBuffer2.getShort();
            r2.f6290 = byteBuffer2.getShort();
            r2.f6285 = byteBuffer2.getShort();
            r2.f6286 = byteBuffer2.getShort();
            r2.f6287 = byteBuffer2.getShort();
            r2.f6288 = byteBuffer2.getInt();
            r2.f6293 = byteBuffer2.getInt();
            r2.f6294 = byteBuffer2.getInt();
            r2.f6296 = byteBuffer2.getInt();
            r5[i3] = r2;
        }
        if (!z) {
            C1177.m1929(r5);
        }
    }
}
