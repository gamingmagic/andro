package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ʄ */
final class C1154 extends C0762sz {

    /* renamed from: o.ʄ$鷭 */
    class C1155 {

        /* renamed from: ˮ͈ */
        byte[] f6249 = new byte[24];

        /* renamed from: 櫯 */
        int f6250;

        /* renamed from: 鷭 */
        int f6251;

        C1155(ByteBuffer byteBuffer) {
            this.f6251 = byteBuffer.getInt();
            this.f6250 = byteBuffer.getInt();
            byteBuffer.get(this.f6249);
        }
    }

    C1154() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 513;
        C1155[] r7 = new C1155[i];
        for (int i3 = 0; i3 < r7.length; i3++) {
            r7[i3] = new C1155(byteBuffer);
        }
        if (!z) {
            C1014.f6137.f1636.f6519 = new C1671[r7.length];
            for (int i4 = 0; i4 < r7.length; i4++) {
                C1014.f6152.f7977.put(Integer.valueOf(r7[i4].f6250), C0622ot.m741(r7[i4].f6249, C0618op.LOCAL));
                C1014.f6137.f1636.f6519[i4] = new C1671(r7[i4].f6251, r7[i4].f6250, false);
            }
            if (C1014.f6147.f51.f1410.f1626.getParent() != null) {
                C1014.f6147.f51.f1410.mo4624(false);
            }
        }
    }
}
