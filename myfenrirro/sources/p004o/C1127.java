package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.Ȯ */
final class C1127 extends C0762sz {
    C1127() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2608;
        int i3 = byteBuffer.getInt();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r15 = C0622ot.m741(bArr, opVar);
        C0618op opVar2 = C0618op.LOCAL;
        byte[] bArr2 = new byte[24];
        byteBuffer.get(bArr2);
        String r6 = C0622ot.m741(bArr2, opVar2);
        C0618op opVar3 = C0618op.LOCAL;
        byte[] bArr3 = new byte[24];
        byteBuffer.get(bArr3);
        String r7 = C0622ot.m741(bArr3, opVar3);
        C0618op opVar4 = C0618op.LOCAL;
        byte[] bArr4 = new byte[24];
        byteBuffer.get(bArr4);
        String r8 = C0622ot.m741(bArr4, opVar4);
        int i4 = byteBuffer.getInt();
        if (!z) {
            m1887(i3, r15, r6, r7, r8, i4);
        }
    }

    /* renamed from: 鷭 */
    static void m1887(int i, String str, String str2, String str3, String str4, int i2) {
        C1919 r0;
        C0520le leVar = (C0520le) C1014.f6137.f1637.get(i);
        if (leVar == null) {
            r0 = null;
        } else {
            r0 = C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null;
        }
        C1919 r2 = r0;
        if (r0 != null) {
            r2.f8650 = C1920if.RESOLVED;
            r2.f8657 = str;
            r2.f8651 = str2;
            r2.f8658 = str3;
            r2.f8648 = str4;
            r2.f8654 = i2;
            if (r2.f1630 == C1014.f6137.f1636.f1630) {
                C1014.f6147.f51.f1375.f1262.setText(r2.f8658);
            }
            C0548mb mbVar = (C0548mb) C1014.f6142.f1680.f1189.get(Integer.valueOf(i));
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
