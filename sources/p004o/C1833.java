package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;

/* renamed from: o.鬙 */
final class C1833 extends C0762sz {
    C1833() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 518;
        byteBuffer.getInt();
        int i3 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        if (!z) {
            m2500(i3, b != 0);
        }
    }

    /* renamed from: 鷭 */
    static void m2500(int i, boolean z) {
        int i2 = 0;
        while (true) {
            if (i2 >= C1014.f6137.f1636.f6519.length) {
                break;
            } else if (C1014.f6137.f1636.f6519[i2].f7650 == i) {
                C1014.f6137.f1636.f6519[i2].f7649 = !z;
                if (C1014.f6147.f51.f1410.f1626.getParent() != null) {
                    C1014.f6147.f51.f1410.mo4624(true);
                }
            } else {
                i2++;
            }
        }
        C1746 r0 = C1014.f6147.f51.f1427;
        C0252cp cpVar = C1014.f6158;
        int i3 = z ? 1043 : 1042;
        String r7 = C1014.f6160.mo3796(i3);
        r0.mo4490(String.format(r7 == null ? "MSG" + i3 : r7, new Object[]{C1014.f6152.f7977.get(Integer.valueOf(i))}), (int) SupportMenu.USER_MASK);
    }
}
