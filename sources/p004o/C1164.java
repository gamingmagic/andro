package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ʐ */
final class C1164 extends C0762sz {
    C1164() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 388;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        if (!z && C1014.f6137.f1636.f6541 != null) {
            if (i4 != 0) {
                int i5 = 0;
                while (true) {
                    if (i5 >= C1014.f6137.f1636.f6541.f7217.size()) {
                        break;
                    } else if (((C1507) C1014.f6137.f1636.f6541.f7217.get(i5)).f7243 == i3) {
                        C1014.f6137.f1636.f6541.f7217.remove(i5);
                        break;
                    } else {
                        i5++;
                    }
                }
            } else {
                int i6 = 0;
                while (true) {
                    if (i6 >= C1014.f6137.f1636.f6541.f7205.size()) {
                        break;
                    } else if (((C1507) C1014.f6137.f1636.f6541.f7205.get(i6)).f7243 == i3) {
                        C1014.f6137.f1636.f6541.f7205.remove(i6);
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            if (C1014.f6147.f51.f1383.f1626.getParent() != null) {
                C1014.f6147.f51.f1383.f7304.mo4444();
            }
        }
    }
}
