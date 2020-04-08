package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ʻ */
final class C1186 extends C0762sz {

    /* renamed from: ˮ͈ */
    short f6298;

    /* renamed from: 櫯 */
    short f6299;

    /* renamed from: 鷭 */
    int f6300;

    C1186() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 262;
        this.f6300 = byteBuffer.getInt();
        this.f6299 = byteBuffer.getShort();
        this.f6298 = byteBuffer.getShort();
        if (!z) {
            C1187.m1940(this.f6300, (int) this.f6299, (int) this.f6298, false);
        }
    }
}
