package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.繺 */
final class C1730 extends C0762sz {

    /* renamed from: o.繺$鷭 */
    class C1731 {

        /* renamed from: 櫯 */
        byte f7973;

        /* renamed from: 鷭 */
        int f7974;

        C1731(ByteBuffer byteBuffer) {
            this.f7974 = byteBuffer.getInt();
            this.f7973 = byteBuffer.get();
        }
    }

    C1730() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 689;
        byteBuffer.getInt();
        C1731[] r4 = new C1731[i];
        for (int i3 = 0; i3 < r4.length; i3++) {
            r4[i3] = new C1731(byteBuffer);
        }
        if (!z) {
            for (int i4 = 0; i4 < r4.length; i4++) {
                C0238ce ceVar = new C0238ce();
                ceVar.f565 = C0239if.values()[r4[i4].f7973];
                C1014.f6152.f7979.put(Integer.valueOf(r4[i4].f7974), ceVar);
            }
            C1014.f6147.f51.f1392.mo3594();
        }
    }
}
