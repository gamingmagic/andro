package p004o;

import java.nio.ByteBuffer;
import p004o.C0643pc.aux;

/* renamed from: o.Ǚ */
final class C1103 extends C0762sz {
    C1103() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 105;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.get(new byte[24]);
        byteBuffer.getShort();
        byte b = byteBuffer.get();
        C1726[] r4 = new C1726[i];
        for (int i6 = 0; i6 < i; i6++) {
            C1726 r6 = new C1726();
            r6.f7964 = byteBuffer.getInt();
            r6.f7963 = byteBuffer.getShort();
            C0618op opVar = C0618op.LOCAL;
            byte[] bArr = new byte[20];
            byteBuffer.get(bArr);
            r6.f7962 = C0622ot.m741(bArr, opVar);
            r6.f7961 = byteBuffer.getShort();
            r6.f7958 = byteBuffer.getShort();
            r6.f7959 = byteBuffer.getShort();
            r4[i6] = r6;
        }
        if (!z) {
            m1863(i3, i4, i5, b, r4);
        }
    }

    /* renamed from: 鷭 */
    static void m1863(int i, int i2, int i3, byte b, C1726[] r10) {
        String str;
        C1014.f6144.f7008 = true;
        C1014.f6161.f6162 = i2;
        C1014.f6161.f6163 = b;
        C1014.f6161.f6164 = new C1016();
        C1014.f6161.f6164.f6177 = i;
        C1014.f6161.f6164.f6176 = i3;
        C1014.f6161.f6164.f6175 = new C1015if[r10.length];
        String[] strArr = new String[r10.length];
        int i4 = 0;
        for (int i5 = 0; i5 < r10.length; i5++) {
            C1015if ifVar = new C1015if(r10[i5].f7962, C0622ot.m722(r10[i5].f7964), C0622ot.m731(r10[i5].f7963));
            if ((C1014.f6140.f4443 != aux.iRO_Renewal || !ifVar.f6173.contains("Classic")) && ((!C1014.f6140.f4522.equals("RagnarokDeep") || !ifVar.f6173.contains("Asia")) && (!C1014.f6140.f4522.equals("RagnarokDeep-Asia") || ifVar.f6173.contains("Asia")))) {
                C1014.f6161.f6164.f6175[i4] = ifVar;
                if (C1014.f6140.f4507) {
                    if (r10[i5].f7961 < 0 || r10[i5].f7961 >= 4) {
                        str = "";
                    } else {
                        C0252cp cpVar = C1014.f6158;
                        int i6 = r10[i5].f7961 + 3262;
                        String r5 = C1014.f6160.mo3796(i6);
                        str = r5 == null ? "MSG" + i6 : r5;
                    }
                    strArr[i4] = (i5 + 1) + ". " + ifVar.f6173 + "(" + str + ")";
                } else {
                    strArr[i4] = (i5 + 1) + ". " + ifVar.f6173 + "(" + r10[i5].f7961 + ")";
                }
                i4++;
            }
        }
        if (C1014.f6147.f51.f1436 != null) {
            C1014.f6147.f51.f1436.mo4572();
            C1014.f6147.f51.f1436 = null;
        }
        if (i4 == 1) {
            C1014.m1844(C1014.f6161.f6164.f6175[0]);
        } else {
            C1014.f6147.f51.mo3878(strArr);
        }
    }
}
