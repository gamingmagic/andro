package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.Β */
final class C1261 extends C0762sz {

    /* renamed from: Ą */
    int f6420;

    /* renamed from: ą */
    byte f6421;

    /* renamed from: Ć */
    byte f6422;

    /* renamed from: ć */
    byte f6423;

    /* renamed from: ȃ */
    short f6424;

    /* renamed from: ˮ͈ */
    short f6425;

    /* renamed from: 櫯 */
    int f6426;

    /* renamed from: 鷭 */
    int f6427;

    C1261() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2506;
        this.f6427 = byteBuffer.getInt();
        this.f6426 = byteBuffer.getInt();
        this.f6425 = byteBuffer.getShort();
        this.f6424 = byteBuffer.getShort();
        this.f6420 = byteBuffer.getInt();
        this.f6421 = byteBuffer.get();
        this.f6422 = byteBuffer.get();
        this.f6423 = byteBuffer.get();
        byteBuffer.get(new byte[i]);
        if (!z) {
            C1386.m2092(this.f6427, this.f6426, this.f6425, this.f6424, this.f6420, this.f6421, this.f6422 != 0, this.f6423);
        }
    }
}
