package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.濋 */
class C1668 extends C0762sz {
    C1668() {
    }

    /* renamed from: 鷭 */
    public void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2307;
        C1888[] r4 = new C1888[i];
        for (int i3 = 0; i3 < r4.length; i3++) {
            r4[i3] = C1888.m2560(byteBuffer, C1014.f6140.f4470, false);
        }
        if (!z) {
            m2333(r4);
        }
    }

    /* renamed from: 鷭 */
    static void m2333(C1888[] r6) {
        C1888[] r5 = r6;
        int length = r6.length;
        for (int i = 0; i < length; i++) {
            C1888 r62 = r5[i];
            C1014.f6137.f1636.f6498.put(Integer.valueOf(r62.f8526 - 2), new C1992(r62));
        }
        C1014.f6147.f51.f1445.mo4533(C0572mz.CART);
    }
}
