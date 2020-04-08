package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.㯒 */
class C1427 extends C0762sz {
    C1427() {
    }

    /* renamed from: 鷭 */
    public void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2422;
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        C0622ot.m741(bArr, opVar);
        C1888[] r6 = new C1888[i];
        for (int i3 = 0; i3 < r6.length; i3++) {
            r6[i3] = C1888.m2560(byteBuffer, C1014.f6140.f4470, true);
        }
        if (!z) {
            m2125(r6);
        }
    }

    /* renamed from: 鷭 */
    static void m2125(C1888[] r6) {
        C1888[] r5 = r6;
        int length = r6.length;
        for (int i = 0; i < length; i++) {
            C1888 r62 = r5[i];
            C1014.f6137.f1636.f6501.put(Integer.valueOf(r62.f8526 - 1), new C1992(r62));
            C1014.f6158.f674.f608.mo4465(r62.f8524);
        }
        C1014.f6147.f51.f1421.mo3828(null);
    }
}
