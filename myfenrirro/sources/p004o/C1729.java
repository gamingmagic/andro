package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.繪 */
final class C1729 extends C0762sz {

    /* renamed from: Ą */
    int f7965;

    /* renamed from: ą */
    byte f7966;

    /* renamed from: Ć */
    byte f7967;

    /* renamed from: ȃ */
    short f7968;

    /* renamed from: ˮ͈ */
    short f7969;

    /* renamed from: 櫯 */
    int f7970;

    /* renamed from: 鷭 */
    int f7971;

    C1729() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2463;
        this.f7971 = byteBuffer.getInt();
        this.f7970 = byteBuffer.getInt();
        this.f7969 = byteBuffer.getShort();
        this.f7968 = byteBuffer.getShort();
        this.f7965 = byteBuffer.getInt();
        this.f7966 = byteBuffer.get();
        this.f7967 = byteBuffer.get();
        if (C1014.f6140.f4515) {
            byteBuffer.getInt();
        }
        byteBuffer.get(new byte[i]);
        if (!z) {
            C1386.m2092(this.f7971, this.f7970, this.f7969, this.f7968, this.f7965, this.f7966, this.f7967 != 0, 1);
        }
    }
}
