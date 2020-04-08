package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.Ȓ */
class C1115 extends C0762sz {
    C1115() {
    }

    /* renamed from: 鷭 */
    public void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2306;
        C1510[] r4 = new C1510[i];
        for (int i3 = 0; i3 < r4.length; i3++) {
            r4[i3] = C1510.m2208(byteBuffer, C1014.f6140.f4470, false);
        }
        if (!z) {
            m1875(r4);
        }
    }

    /* renamed from: 鷭 */
    static void m1875(C1510[] r6) {
        C1510[] r5 = r6;
        int length = r6.length;
        for (int i = 0; i < length; i++) {
            C1510 r62 = r5[i];
            C1014.f6137.f1636.f6498.put(Integer.valueOf(r62.f7263 - 2), new C1992(r62));
        }
        if (C1014.f6142.f1680.f1195.f1729 == null) {
            C1014.f6142.f1680.f1195.mo3994(0, false);
        }
        C1014.f6147.f51.f1445.mo4533(C0572mz.CART);
    }
}
