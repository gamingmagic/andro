package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ଥ */
final class C1335 extends C0762sz {

    /* renamed from: o.ଥ$鷭 */
    class C1336 {

        /* renamed from: ˮ͈ */
        int f6860;

        /* renamed from: 櫯 */
        int f6861;

        /* renamed from: 鷭 */
        short f6862;

        C1336(ByteBuffer byteBuffer) {
            this.f6862 = byteBuffer.getShort();
            this.f6861 = byteBuffer.getInt();
            this.f6860 = byteBuffer.getInt();
        }
    }

    C1335() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2437;
        for (int i3 = 0; i3 < i; i3++) {
            new C1336(byteBuffer);
        }
        if (!z) {
            throw new C0828tx(this);
        }
    }
}
