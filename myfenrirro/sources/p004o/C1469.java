package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.䒊 */
final class C1469 extends C0762sz {
    C1469() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        C1919 r7;
        this.f4671 = 149;
        int i3 = byteBuffer.getInt();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r5 = C0622ot.m741(bArr, opVar);
        if (!z) {
            C0520le leVar = (C0520le) C1014.f6137.f1637.get(i3);
            if (leVar == null) {
                r7 = null;
            } else {
                C0520le leVar2 = leVar;
                r7 = C1919.class.isAssignableFrom(leVar2.getClass()) ? leVar2 : null;
            }
            if (r7 != null) {
                r7.f8650 = C1920if.RESOLVED;
                r7.f8657 = r5;
                C0548mb mbVar = (C0548mb) C1014.f6142.f1680.f1189.get(Integer.valueOf(i3));
                if (mbVar != null && C1014.f6142.f1693 == mbVar) {
                    C0548mb mbVar2 = mbVar;
                    if (mbVar.f1775 != null) {
                        mbVar2.f1775.mo4495(mbVar2);
                        return;
                    }
                    mbVar2.f1775 = new C1752(mbVar2);
                }
            }
        }
    }
}
