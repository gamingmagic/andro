package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ʠ */
final class C1174 extends C0762sz {

    /* renamed from: o.ʠ$鷭 */
    class C1175 {

        /* renamed from: ˮ͈ */
        String f6282;

        /* renamed from: 櫯 */
        String f6283;

        /* renamed from: 鷭 */
        String f6284;

        C1175(ByteBuffer byteBuffer) {
            String str;
            C0618op opVar = C0618op.LOCAL;
            byte[] bArr = new byte[24];
            byteBuffer.get(bArr);
            this.f6284 = C0622ot.m741(bArr, opVar);
            if (C1014.f6140.f4452) {
                str = null;
            } else {
                C0618op opVar2 = C0618op.LOCAL;
                byte[] bArr2 = new byte[24];
                byteBuffer.get(bArr2);
                str = C0622ot.m741(bArr2, opVar2);
            }
            this.f6283 = str;
            C0618op opVar3 = C0618op.LOCAL;
            byte[] bArr3 = new byte[40];
            byteBuffer.get(bArr3);
            this.f6282 = C0622ot.m741(bArr3, opVar3);
        }
    }

    C1174() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 355;
        C1175[] r7 = new C1175[i];
        for (int i3 = 0; i3 < r7.length; i3++) {
            r7[i3] = new C1175(byteBuffer);
        }
        if (!z) {
            if (C1014.f6137.f1636.f6541 == null) {
                C1014.f6137.f1636.f6541 = new C1503();
            }
            C1503 r9 = C1014.f6137.f1636.f6541;
            r9.f7212.clear();
            C1175[] r4 = r7;
            int length = r7.length;
            for (int i4 = 0; i4 < length; i4++) {
                C1175 r6 = r4[i4];
                r9.f7212.add(new C1504if(r6.f6284, r6.f6282));
            }
            if (C1014.f6147.f51.f1383.f1626.getParent() != null) {
                C1014.f6147.f51.f1383.f7302.f8530.setAdapter(new C1613());
            }
        }
    }
}
