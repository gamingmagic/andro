package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.蟚 */
final class C1747 extends C0762sz {
    C1747() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 441;
        int i3 = byteBuffer.getInt();
        if (!z) {
            C0540lv r2 = C1014.f6142.mo3978(i3);
            if (r2 != null) {
                C0520le leVar = r2.f1769;
                C1919 r0 = C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null;
                C1919 r3 = r0;
                if (r0 != null) {
                    r3.f8655 = null;
                    r2.f1734 = null;
                }
            }
        }
    }
}
