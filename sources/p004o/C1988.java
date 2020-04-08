package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.슐 */
final class C1988 extends C0762sz {

    /* renamed from: Ą */
    byte f8822;

    /* renamed from: ą */
    byte f8823;

    /* renamed from: ȃ */
    short f8824;

    /* renamed from: ˮ͈ */
    short f8825;

    /* renamed from: 櫯 */
    int f8826;

    /* renamed from: 鷭 */
    int f8827;

    C1988() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 287;
        this.f8827 = byteBuffer.getInt();
        this.f8826 = byteBuffer.getInt();
        this.f8825 = byteBuffer.getShort();
        this.f8824 = byteBuffer.getShort();
        this.f8822 = byteBuffer.get();
        if (C1014.f6140.f4515) {
            byteBuffer.getInt();
        } else {
            this.f8823 = byteBuffer.get();
        }
        if (!z) {
            C1386.m2092(this.f8827, this.f8826, this.f8825, this.f8824, this.f8822, 1, this.f8823 != 0, 1);
        }
    }
}
