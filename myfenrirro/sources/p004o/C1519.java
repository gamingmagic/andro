package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.会 */
final class C1519 extends C0762sz {

    /* renamed from: ˮ͈ */
    byte f7269;

    /* renamed from: 櫯 */
    byte f7270;

    /* renamed from: 鷭 */
    short f7271;

    C1519() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 188;
        this.f7271 = byteBuffer.getShort();
        this.f7270 = byteBuffer.get();
        this.f7269 = byteBuffer.get();
        if (!z) {
            if (this.f7270 == 0) {
                C1014.f6147.f51.f1427.mo4490("Failed to raise stats.", 16711680);
            } else {
                C1404.m2108(this, this.f7271, C0622ot.m730(this.f7269));
            }
        }
    }
}
