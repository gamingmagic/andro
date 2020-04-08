package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.Љ */
final class C1277 extends C0762sz {

    /* renamed from: ˮ͈ */
    C1738[] f6438;

    /* renamed from: 櫯 */
    int f6439;

    /* renamed from: 鷭 */
    int f6440;

    C1277() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2048;
        this.f6440 = byteBuffer.getInt();
        this.f6439 = byteBuffer.getInt();
        this.f6438 = new C1738[i];
        for (int i3 = 0; i3 < this.f6438.length; i3++) {
            this.f6438[i3] = new C1738(byteBuffer);
        }
        if (!z) {
            C1014.f6147.f51.f1377.mo3729(this.f6440, this.f6439, this.f6438);
            C1014.f6147.f51.f1377.mo3537h_();
        }
    }
}
