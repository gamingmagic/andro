package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ʴ */
final class C1185 extends C0762sz {
    C1185() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 565;
        C0210be[] beVarArr = new C0210be[i];
        for (int i3 = 0; i3 < i; i3++) {
            beVarArr[i3] = new C0210be(byteBuffer);
        }
        if (!z) {
            for (C0210be gmVar : beVarArr) {
                C0377gm gmVar2 = new C0377gm(gmVar);
                if (C1014.f6137.f1636.f6524 == null) {
                    C1014.f6137.f1636.f6524 = new C1302if();
                }
                C1014.f6137.f1636.f6524.f6572.f6579.put(Integer.valueOf(gmVar2.f1053), gmVar2);
                C1014.f6147.f51.f1435.mo3766();
                C1014.f6147.f51.mo3874(gmVar2);
            }
        }
    }
}
