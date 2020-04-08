package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.䔚 */
final class C1482 extends C0762sz {

    /* renamed from: o.䔚$鷭 */
    class C1483 {

        /* renamed from: 櫯 */
        String f7163;

        /* renamed from: 鷭 */
        int f7164;

        C1483(ByteBuffer byteBuffer) {
            this.f7164 = byteBuffer.getInt();
            C0618op opVar = C0618op.LOCAL;
            ByteBuffer byteBuffer2 = byteBuffer;
            byte[] bArr = new byte[24];
            byteBuffer2.get(bArr);
            this.f7163 = C0622ot.m741(bArr, opVar);
        }
    }

    C1482() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 219;
        int i3 = byteBuffer.getInt();
        C1483[] r4 = new C1483[i];
        for (int i4 = 0; i4 < i; i4++) {
            r4[i4] = new C1483(byteBuffer);
        }
        if (!z) {
            if (C1014.f6137.f1636.f6522 == null) {
                C1014.f6137.f1636.f6522 = new C2012();
            }
            C2012 r5 = C1014.f6137.f1636.f6522;
            r5.f8903 = i3;
            r5.f8900.clear();
            for (int i5 = 0; i5 < i; i5++) {
                r5.f8900.add(new C2013(r4[i5].f7163, r4[i5].f7164 != 0));
            }
            C1014.f6147.f51.f1390.mo3537h_();
        }
    }
}
