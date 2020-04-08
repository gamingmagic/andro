package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.壌 */
final class C1550 extends C0762sz {

    /* renamed from: 櫯 */
    C1738[] f7331;

    /* renamed from: 鷭 */
    int f7332;

    C1550() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 307;
        this.f7332 = byteBuffer.getInt();
        this.f7331 = new C1738[i];
        for (int i3 = 0; i3 < this.f7331.length; i3++) {
            this.f7331[i3] = new C1738(byteBuffer);
        }
        if (!z) {
            C1014.f6147.f51.f1377.mo3729(this.f7332, 0, this.f7331);
            C1014.f6147.f51.f1377.mo3537h_();
        }
    }
}
