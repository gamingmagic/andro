package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.碧 */
final class C1704 extends C0762sz {
    C1704() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 379;
        short[] sArr = new short[i];
        for (int i3 = 0; i3 < sArr.length; i3++) {
            sArr[i3] = byteBuffer.getShort();
        }
        short[] sArr2 = sArr;
        if (!z) {
            int[] iArr = new int[sArr2.length];
            C1992[] r6 = new C1992[sArr2.length];
            for (int i4 = 0; i4 < sArr2.length; i4++) {
                iArr[i4] = sArr2[i4] - 2;
                r6[i4] = (C1992) C1014.f6137.f1636.f6528.get(Integer.valueOf(iArr[i4]));
                if (r6[i4] == null) {
                    C0592ns.m674("Couldn't find inventory item for given index. Possible inventory desync");
                    return;
                }
            }
            C1528 r4 = C1014.f6147.f51.f1388;
            int[] iArr2 = iArr;
            C1992[] r5 = r6;
            r4.f7283 = new C1964(this);
            r4.f7284.setAdapter(new C1323(iArr2, r5));
            r4.mo3537h_();
        }
    }
}
