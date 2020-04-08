package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ʗ */
final class C1167 extends C0762sz {
    C1167() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 364;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        byteBuffer.getInt();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r7 = C0622ot.m741(bArr, opVar);
        if (!z) {
            C1014.f6137.f1636.f8637 = i3;
            C1014.f6137.f1636.f8638 = (short) i4;
            C1014.f6137.f1636.f453 = (i5 & 1) > 0;
            C1014.f6137.f1636.f454 = (i5 & 16) > 0;
            C1014.f6137.f1636.f455 = b > 0;
            C1014.f6137.f1636.f8658 = r7;
            C1014.f6147.f51.f1375.mo3820();
            C1014.f6147.f51.f1422.mo4455b_();
        }
    }
}
