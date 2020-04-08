package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ꀴ */
final class C1866 extends C0762sz {

    /* renamed from: o.ꀴ$鷭 */
    static class C1867 {

        /* renamed from: ȃ */
        int f8453;

        /* renamed from: ˮ͈ */
        byte f8454;

        /* renamed from: 櫯 */
        int f8455;

        /* renamed from: 鷭 */
        int f8456;

        C1867(ByteBuffer byteBuffer) {
            this.f8456 = byteBuffer.getInt();
            this.f8455 = byteBuffer.getInt();
            this.f8454 = byteBuffer.get();
            this.f8453 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        }
    }

    C1866() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 647;
        int i3 = byteBuffer.getInt();
        C1867[] r1 = new C1867[i];
        for (int i4 = 0; i4 < i; i4++) {
            r1[i4] = new C1867(byteBuffer);
        }
        if (!z) {
            C1597.m2279(i3, 0, r1);
        }
    }
}
