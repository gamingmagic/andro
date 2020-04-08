package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.䑎 */
final class C1461 extends C0762sz {
    C1461() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 316;
        short s = byteBuffer.getShort();
        if (!z) {
            int i3 = s - 2;
            C1992 r4 = (C1992) C1014.f6137.f1636.f6528.get(Integer.valueOf(i3));
            if (r4 != null) {
                r4.f8836 = 32768;
                C1842 r5 = C1014.f6147.f51.f1445;
                C1472 r6 = r4.f8839;
                if (r5.f1626.getParent() != null) {
                    r5.mo4533(C0572mz.m662(r6));
                }
                C1014.f6147.f51.f1420.mo4589(C1246.AMMO, r4, i3);
                return;
            }
            C1014.f6137.f1636.f6546 = i3;
        }
    }
}
