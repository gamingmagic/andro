package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.즗 */
final class C2006 extends C0762sz {
    C2006() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 271;
        C0936xi[] xiVarArr = new C0936xi[i];
        for (int i3 = 0; i3 < i; i3++) {
            xiVarArr[i3] = new C0936xi(byteBuffer);
        }
        if (!z) {
            for (int i4 = 0; i4 < i; i4++) {
                C0377gm gmVar = new C0377gm(xiVarArr[i4]);
                C1014.f6137.f1636.f6548.f6579.put(Integer.valueOf(gmVar.f1053), gmVar);
            }
            if (!(C1014.f6147.f51.f1435 == null || C1014.f6147.f51.f1435.f1626.getParent() == null)) {
                C1014.f6147.f51.f1435.mo3766();
            }
            C1014.f6147.f51.mo3860();
        }
    }
}
