package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.墛 */
final class C1549 extends C0762sz {
    C1549() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 372;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        String r7 = C0622ot.m741(bArr, opVar);
        if (!z) {
            if (C1014.f6137.f1636.f6541 == null) {
                C1014.f6137.f1636.f6541 = new C1503();
            }
            C1503 r0 = C1014.f6137.f1636.f6541;
            C1505 r8 = new C1505(r7, (i4 & 1) > 0, (i4 & 16) > 0, i5);
            int i6 = i3;
            C1503 r72 = r0;
            r0.mo4363(i6 + 1);
            r72.f7215[i6] = r8;
            if (C1014.f6147.f51.f1383.f1626.getParent() != null) {
                C1014.f6147.f51.f1383.f7300.mo4444();
                C1014.f6147.f51.f1383.f7301.f7633.setAdapter(new C2055());
            }
        }
    }
}
