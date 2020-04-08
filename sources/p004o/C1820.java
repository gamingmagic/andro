package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.骕 */
final class C1820 extends C0762sz {
    C1820() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 429;
        int[] iArr = new int[i];
        for (int i3 = 0; i3 < i; i3++) {
            iArr[i3] = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        }
        if (!z) {
            C1992[] r3 = new C1992[iArr.length];
            for (int i4 = 0; i4 < r3.length; i4++) {
                r3[i4] = new C1992(iArr[i4]);
            }
            C1528 r5 = C1014.f6147.f51.f1388;
            C1992[] r6 = r3;
            r5.f7283 = new C1106(this);
            r5.f7284.setAdapter(new C1323((int[]) null, r6));
            r5.mo3537h_();
        }
    }
}
