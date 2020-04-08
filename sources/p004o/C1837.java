package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.鬽 */
final class C1837 extends C0762sz {
    C1837() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 354;
        short s = byteBuffer.getShort();
        C0936xi[] xiVarArr = new C0936xi[i];
        for (int i3 = 0; i3 < xiVarArr.length; i3++) {
            xiVarArr[i3] = new C0936xi(byteBuffer);
        }
        if (!z) {
            if (C1014.f6137.f1636.f6541 == null) {
                C1014.f6137.f1636.f6541 = new C1503();
            }
            C1503 r3 = C1014.f6137.f1636.f6541;
            r3.f7209 = s;
            r3.f7218.clear();
            for (C0936xi gmVar : xiVarArr) {
                r3.f7218.add(new C0377gm(gmVar));
            }
            if (C1014.f6147.f51.f1383.f1626.getParent() != null) {
                C1014.f6147.f51.f1383.f7303.mo4444();
            }
        }
    }
}
