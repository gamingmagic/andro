package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ̐ */
final class C1214 extends C0762sz {
    C1214() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 669;
        C0211bf[] bfVarArr = new C0211bf[i];
        for (int i3 = 0; i3 < i; i3++) {
            bfVarArr[i3] = new C0211bf(byteBuffer);
        }
        if (!z) {
            for (C0211bf gmVar : bfVarArr) {
                C0377gm gmVar2 = new C0377gm(gmVar);
                if (C1014.f6137.f1636.f6538 != null) {
                    C1014.f6137.f1636.f6538.f6572.f6579.put(Integer.valueOf(gmVar2.f1053), gmVar2);
                    C1014.f6147.f51.f1435.mo3766();
                    C1014.f6147.f51.mo3874(gmVar2);
                }
            }
        }
    }
}
