package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.揚 */
final class C1614 extends C0762sz {
    C1614() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 246;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        if (!z) {
            short s2 = (short) (s - 1);
            C1992 r5 = (C1992) C1014.f6137.f1636.f6501.get(Integer.valueOf(s2));
            if (r5 != null) {
                r5.f8846 -= i3;
                if (r5.f8846 <= 0) {
                    C1014.f6137.f1636.f6501.remove(Integer.valueOf(s2));
                }
                if (C1014.f6147.f51.f1421.f1626.getParent() != null) {
                    C1014.f6147.f51.f1421.mo3828(C0572mz.m662(r5.f8839));
                }
            }
        }
    }
}
