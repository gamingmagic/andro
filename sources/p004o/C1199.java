package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;

/* renamed from: o.ˢ */
final class C1199 extends C0762sz {
    C1199() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 377;
        short s = byteBuffer.getShort();
        byte b = byteBuffer.get();
        if (!z) {
            if (b > 0) {
                C1014.f6147.f51.f1427.mo4490("Failed to identify item", 16711680);
                return;
            }
            C1992 r4 = (C1992) C1014.f6137.f1636.f6528.get(Integer.valueOf(s - 2));
            if (r4 != null) {
                r4.f8837 = true;
                C1842 r0 = C1014.f6147.f51.f1445;
                C1472 r5 = r4.f8839;
                C1842 r42 = r0;
                if (r0.f1626.getParent() != null) {
                    r42.mo4533(C0572mz.m662(r5));
                }
                C1014.f6147.f51.f1427.mo4490("Item has been identified", (int) SupportMenu.USER_MASK);
            }
        }
    }
}
