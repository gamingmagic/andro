package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ʎ */
final class C1160 extends C0762sz {

    /* renamed from: o.ʎ$鷭 */
    class C1161 {

        /* renamed from: ˮ͈ */
        String f6259;

        /* renamed from: 櫯 */
        int f6260;

        /* renamed from: 鷭 */
        int f6261;

        C1161(ByteBuffer byteBuffer) {
            this.f6261 = byteBuffer.getInt();
            this.f6260 = byteBuffer.getInt();
            C0618op opVar = C0618op.LOCAL;
            ByteBuffer byteBuffer2 = byteBuffer;
            byte[] bArr = new byte[24];
            byteBuffer2.get(bArr);
            this.f6259 = C0622ot.m741(bArr, opVar);
        }
    }

    C1160() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 332;
        C1161[] r6 = new C1161[i];
        for (int i3 = 0; i3 < r6.length; i3++) {
            r6[i3] = new C1161(byteBuffer);
        }
        if (!z) {
            if (C1014.f6137.f1636.f6541 == null) {
                C1014.f6137.f1636.f6541 = new C1503();
            }
            C1503 r8 = C1014.f6137.f1636.f6541;
            r8.f7217.clear();
            r8.f7205.clear();
            C1161[] r2 = r6;
            int length = r6.length;
            for (int i4 = 0; i4 < length; i4++) {
                C1161 r5 = r2[i4];
                C1507 r3 = new C1507(r5.f6260, r5.f6259);
                if (r5.f6261 > 0) {
                    r8.f7217.add(r3);
                } else {
                    r8.f7205.add(r3);
                }
            }
            if (C1014.f6147.f51.f1383.f1626.getParent() != null) {
                C1014.f6147.f51.f1383.f7304.mo4444();
            }
        }
    }
}
