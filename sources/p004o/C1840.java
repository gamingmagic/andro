package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.魉 */
final class C1840 extends C0762sz {
    C1840() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2560;
        C1392[] r3 = new C1392[38];
        byteBuffer.get();
        for (int i3 = 0; i3 < r3.length; i3++) {
            r3[i3] = new C1392(byteBuffer);
        }
        if (!z) {
            throw new C0828tx(this);
        }
    }
}
