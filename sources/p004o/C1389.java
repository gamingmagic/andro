package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.こ */
final class C1389 extends C0762sz {

    /* renamed from: o.こ$鷭 */
    class C1390 {

        /* renamed from: 櫯 */
        int f6960;

        /* renamed from: 鷭 */
        short f6961;

        C1390(ByteBuffer byteBuffer) {
            this.f6961 = byteBuffer.getShort();
            this.f6960 = byteBuffer.getInt();
        }
    }

    C1389() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 1086;
        for (int i3 = 0; i3 < i; i3++) {
            new C1390(byteBuffer);
        }
        if (!z) {
            throw new C0828tx(this);
        }
    }
}
