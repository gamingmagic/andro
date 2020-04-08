package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ᡝ */
final class C1367 extends C0762sz {

    /* renamed from: Ą */
    byte f6907;

    /* renamed from: ą */
    byte f6908;

    /* renamed from: Ć */
    byte f6909;

    /* renamed from: ȃ */
    short f6910;

    /* renamed from: ˮ͈ */
    short f6911;

    /* renamed from: 櫯 */
    int f6912;

    /* renamed from: 鷭 */
    int f6913;

    C1367() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2247;
        this.f6913 = byteBuffer.getInt();
        this.f6912 = byteBuffer.getInt();
        this.f6911 = byteBuffer.getShort();
        this.f6910 = byteBuffer.getShort();
        this.f6907 = byteBuffer.get();
        this.f6908 = byteBuffer.get();
        this.f6909 = byteBuffer.get();
        byteBuffer.get(new byte[i]);
        if (!z) {
            C1386.m2092(this.f6913, this.f6912, this.f6911, this.f6910, this.f6907, this.f6908, this.f6909 != 0, 1);
        }
    }
}
