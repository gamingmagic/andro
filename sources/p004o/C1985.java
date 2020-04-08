package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.섭 */
final class C1985 extends C0762sz {
    C1985() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 602;
        int i3 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        int[] iArr = new int[i];
        for (int i4 = 0; i4 < i; i4++) {
            iArr[i4] = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        }
        if (!z) {
            C1992[] r4 = new C1992[iArr.length];
            for (int i5 = 0; i5 < iArr.length; i5++) {
                r4[i5] = new C1992(iArr[i5]);
            }
            C1528 r6 = C1014.f6147.f51.f1388;
            C1992[] r7 = r4;
            r6.f7283 = new C1911(this, i3);
            r6.f7284.setAdapter(new C1323((int[]) null, r7));
            r6.mo3537h_();
        }
    }
}
