package p004o;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: o.ǽ */
final class C1109 extends C0762sz {
    C1109() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 461;
        ByteBuffer byteBuffer2 = byteBuffer;
        int[] iArr = new int[7];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            iArr[i3] = byteBuffer2.getInt();
        }
        if (!z) {
            C1014.f6147.f51.f1435.f1122 = C0397.AUTOSPELL;
            C0396hc hcVar = C1014.f6147.f51.f1435;
            int[] iArr2 = iArr;
            C0396hc hcVar2 = hcVar;
            if (hcVar.f1122 == C0397.AUTOSPELL) {
                hcVar2.f1123.setVisibility(4);
                int i4 = 0;
                C0605oe[] oeVarArr = new C0605oe[iArr2.length];
                for (int i5 = 0; i5 < iArr2.length; i5++) {
                    if (iArr2[i5] != 0) {
                        C0377gm gmVar = (C0377gm) C1014.f6137.f1636.f6548.f6579.get(Integer.valueOf(iArr2[i5]));
                        C0605oe oeVar = new C0605oe();
                        oeVar.f2974 = gmVar;
                        oeVar.f2973 = C1014.f6158.f674.f609.mo3752(gmVar.f1053);
                        oeVar.f2972 = false;
                        int i6 = i4;
                        i4++;
                        oeVarArr[i6] = oeVar;
                    }
                }
                hcVar2.f1124.setAdapter(new C0400hf((C0605oe[]) Arrays.copyOf(oeVarArr, i4), hcVar2.f1120));
                hcVar2.mo3537h_();
            }
        }
    }
}
