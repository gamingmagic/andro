package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ɧ */
final class C1141 extends C0762sz {
    C1141() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 293;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        if (!z) {
            short s2 = (short) (s - 2);
            C1992 r5 = (C1992) C1014.f6137.f1636.f6498.get(Integer.valueOf(s2));
            if (r5 != null) {
                r5.f8846 -= i3;
                if (r5.f8846 <= 0) {
                    C1014.f6137.f1636.f6498.remove(Integer.valueOf(s2));
                }
                C1014.f6147.f51.f1445.mo4533(C0572mz.CART);
            }
        }
    }
}
