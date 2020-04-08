package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.烤 */
final class C1673 extends C0762sz {
    C1673() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 438;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        int i6 = byteBuffer.getInt();
        int i7 = byteBuffer.getInt();
        int i8 = byteBuffer.getInt();
        int i9 = byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        int i10 = byteBuffer.getInt();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r19 = C0622ot.m741(bArr, opVar);
        C0618op opVar2 = C0618op.LOCAL;
        byte[] bArr2 = new byte[24];
        byteBuffer.get(bArr2);
        String r20 = C0622ot.m741(bArr2, opVar2);
        C0618op opVar3 = C0618op.LOCAL;
        byte[] bArr3 = new byte[20];
        byteBuffer.get(bArr3);
        String r25 = C0622ot.m741(bArr3, opVar3);
        if (!z) {
            m2337(i3, i4, i5, i6, i7, i8, i9, i10, r19, r20, r25, 0, 0);
        }
    }

    /* renamed from: 鷭 */
    static void m2337(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, int i9, int i10) {
        if (C1014.f6137.f1636.f6541 == null) {
            C1014.f6137.f1636.f6541 = new C1503();
        }
        C1301 r3 = C1014.f6137.f1636;
        C1503 r4 = r3.f6541;
        r3.f8637 = i;
        r4.f7210 = i2;
        r4.f7208 = i3;
        r4.f7201 = i4;
        r4.f7202 = i5;
        r4.f7203 = i6;
        r4.f7204 = i7;
        r3.f8638 = i8;
        r3.f8658 = str;
        if (str2 != null) {
            r4.f7219 = str2;
        }
        r4.f7216 = str3;
        r4.f7211 = i9;
        r4.f7214 = i10;
        if (r4.f7214 > 0 && r4.f7219 == null) {
            r4.f7219 = (String) C1014.f6152.f7977.get(Integer.valueOf(r4.f7214));
            if (r4.f7219 == null) {
                C1014.f6144.mo3652((C0839ue) new C1086(r4.f7214));
            }
        }
        if (C1014.f6147.f51.f1383.f1626.getParent() != null) {
            C1014.f6147.f51.f1383.mo4383();
        }
    }
}
