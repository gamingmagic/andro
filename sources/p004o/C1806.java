package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.餻 */
final class C1806 extends C0762sz {

    /* renamed from: o.餻$鷭 */
    class C1807 {

        /* renamed from: 櫯 */
        String f8335;

        /* renamed from: 鷭 */
        int f8336;

        C1807(ByteBuffer byteBuffer) {
            this.f8336 = byteBuffer.getInt();
            C0618op opVar = C0618op.LOCAL;
            ByteBuffer byteBuffer2 = byteBuffer;
            byte[] bArr = new byte[24];
            byteBuffer2.get(bArr);
            this.f8335 = C0622ot.m741(bArr, opVar);
        }
    }

    C1806() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 358;
        C1807[] r4 = new C1807[i];
        for (int i3 = 0; i3 < r4.length; i3++) {
            r4[i3] = new C1807(byteBuffer);
        }
        if (!z) {
            if (C1014.f6137.f1636.f6541 == null) {
                C1014.f6137.f1636.f6541 = new C1503();
            }
            C1807[] r5 = r4;
            int length = r4.length;
            for (int i4 = 0; i4 < length; i4++) {
                C1807 r6 = r5[i4];
                C1014.f6137.f1636.f6541.mo4362(r6.f8336).f7226 = r6.f8335;
            }
            if (C1014.f6147.f51.f1383.f1626.getParent() != null) {
                C1014.f6147.f51.f1383.f7300.mo4444();
                C1014.f6147.f51.f1383.f7301.f7633.setAdapter(new C2055());
            }
        }
    }
}
