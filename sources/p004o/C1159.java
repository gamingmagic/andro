package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ʌ */
final class C1159 extends C0762sz {
    C1159() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        C1671[] r3;
        this.f4671 = 522;
        byteBuffer.getInt();
        int i3 = byteBuffer.getInt();
        if (!z) {
            int i4 = 0;
            while (i4 < C1014.f6137.f1636.f6519.length && C1014.f6137.f1636.f6519[i4].f7650 != i3) {
                i4++;
            }
            if (i4 != C1014.f6137.f1636.f6519.length) {
                C1014.f6137.f1636.f6519[i4] = null;
                C1671[] r5 = new C1671[(C1014.f6137.f1636.f6519.length - 1)];
                int i5 = 0;
                for (C1671 r7 : C1014.f6137.f1636.f6519) {
                    if (r7 != null) {
                        int i6 = i5;
                        i5++;
                        r5[i6] = r7;
                    }
                }
                C1014.f6137.f1636.f6519 = r5;
                if (C1014.f6147.f51.f1410.f1626.getParent() != null) {
                    C1014.f6147.f51.f1410.mo4624(false);
                }
                if (C1014.f6147.f51.f1422.f1626.getParent() != null) {
                    C1014.f6147.f51.f1422.mo4455b_();
                }
            }
        }
    }
}
