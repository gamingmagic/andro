package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.磘 */
final class C1705 extends C0762sz {

    /* renamed from: o.磘$鷭 */
    class C1706 {

        /* renamed from: 櫯 */
        int f7770;

        /* renamed from: 鷭 */
        int f7771;

        C1706(ByteBuffer byteBuffer) {
            this.f7771 = byteBuffer.getInt();
            this.f7770 = byteBuffer.getInt();
        }
    }

    C1705() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 513;
        C1706[] r7 = new C1706[i];
        for (int i3 = 0; i3 < r7.length; i3++) {
            r7[i3] = new C1706(byteBuffer);
        }
        if (!z) {
            C1014.f6137.f1636.f6519 = new C1671[r7.length];
            for (int i4 = 0; i4 < r7.length; i4++) {
                C1014.f6137.f1636.f6519[i4] = new C1671(r7[i4].f7771, r7[i4].f7770, false);
            }
            if (C1014.f6147.f51.f1410.f1626.getParent() != null) {
                C1014.f6147.f51.f1410.mo4624(false);
            }
        }
    }
}
