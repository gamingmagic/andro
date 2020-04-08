package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.鲮 */
final class C1854 extends C0762sz {

    /* renamed from: o.鲮$鷭 */
    class C1855 {

        /* renamed from: ȃ */
        int f8445;

        /* renamed from: ˮ͈ */
        int f8446;

        /* renamed from: 櫯 */
        int f8447;

        /* renamed from: 鷭 */
        int f8448;

        C1855(ByteBuffer byteBuffer) {
            this.f8448 = byteBuffer.getInt();
            this.f8447 = byteBuffer.getInt();
            this.f8446 = byteBuffer.getInt();
            this.f8445 = byteBuffer.getInt();
        }
    }

    C1854() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 352;
        C1855[] r5 = new C1855[i];
        for (int i3 = 0; i3 < r5.length; i3++) {
            r5[i3] = new C1855(byteBuffer);
        }
        if (!z) {
            if (C1014.f6137.f1636.f6541 == null) {
                C1014.f6137.f1636.f6541 = new C1503();
            }
            C1855[] r6 = r5;
            int length = r5.length;
            for (int i4 = 0; i4 < length; i4++) {
                C1855 r7 = r6[i4];
                C1505 r2 = C1014.f6137.f1636.f6541.mo4362(r7.f8448);
                r2.f7225 = (r7.f8447 & 1) > 0;
                r2.f7224 = (r7.f8447 & 16) > 0;
                r2.f7223 = r7.f8445;
            }
            if (C1014.f6147.f51.f1383.f1626.getParent() != null) {
                C1014.f6147.f51.f1383.f7300.mo4444();
                C1014.f6147.f51.f1383.f7301.f7633.setAdapter(new C2055());
            }
        }
    }
}
