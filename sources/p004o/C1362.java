package p004o;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: o.ᘑ */
final class C1362 extends C0762sz {

    /* renamed from: 鷭 */
    static int f6904;

    C1362() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 1090;
        int i3 = byteBuffer.getInt();
        ByteBuffer byteBuffer2 = byteBuffer;
        short[] sArr = new short[i];
        for (int i4 = 0; i4 < sArr.length; i4++) {
            sArr[i4] = byteBuffer2.getShort();
        }
        if (!z) {
            f6904 = i3;
            C1014.f6147.f51.f1435.f1122 = C0397.SKILLSELECTREQUEST;
            C0396hc hcVar = C1014.f6147.f51.f1435;
            short[] sArr2 = sArr;
            C0396hc hcVar2 = hcVar;
            if (hcVar.f1122 == C0397.SKILLSELECTREQUEST) {
                hcVar2.f1123.setVisibility(4);
                int i5 = 0;
                C0605oe[] oeVarArr = new C0605oe[sArr2.length];
                for (int i6 = 0; i6 < sArr2.length; i6++) {
                    if (sArr2[i6] != 0) {
                        C0377gm gmVar = (C0377gm) C1014.f6137.f1636.f6548.f6579.get(Integer.valueOf(sArr2[i6]));
                        C0605oe oeVar = new C0605oe();
                        oeVar.f2974 = gmVar;
                        oeVar.f2973 = C1014.f6158.f674.f609.mo3752(gmVar.f1053);
                        oeVar.f2972 = false;
                        int i7 = i5;
                        i5++;
                        oeVarArr[i7] = oeVar;
                    }
                }
                hcVar2.f1124.setAdapter(new C0400hf((C0605oe[]) Arrays.copyOf(oeVarArr, i5), hcVar2.f1120));
                hcVar2.mo3537h_();
            }
        }
    }
}
