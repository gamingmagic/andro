package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.䔂 */
final class C1480 extends C0762sz {
    C1480() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 375;
        short[] sArr = new short[i];
        for (int i3 = 0; i3 < sArr.length; i3++) {
            sArr[i3] = byteBuffer.getShort();
        }
        short[] sArr2 = sArr;
        if (!z) {
            int[] iArr = new int[i];
            C1992[] r8 = new C1992[i];
            int i4 = 0;
            while (i4 < i) {
                iArr[i4] = sArr2[i4] - 2;
                r8[i4] = (C1992) C1014.f6137.f1636.f6528.get(Integer.valueOf(iArr[i4]));
                if (r8[i4] != null) {
                    i4++;
                } else {
                    return;
                }
            }
            C1528 r5 = C1014.f6147.f51.f1388;
            int[] iArr2 = iArr;
            r5.f7283 = new C1188(this);
            r5.f7284.setAdapter(new C1323(iArr2, r8));
            r5.mo3537h_();
        }
    }
}
