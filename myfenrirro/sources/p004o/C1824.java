package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.髅 */
final class C1824 extends C0762sz {
    C1824() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 223;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        byteBuffer.getShort();
        byte b = byteBuffer.get();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[37];
        byteBuffer.get(bArr);
        String r7 = C0622ot.m741(bArr, opVar);
        if (!z) {
            if (C1014.f6137.f1636.f6522 == null) {
                C1014.f6137.f1636.f6522 = new C2012();
            }
            C2012 r9 = C1014.f6137.f1636.f6522;
            r9.f8904 = i3;
            r9.f8903 = i4;
            r9.f8902 = s;
            r9.f8901 = b != 0;
            r9.f8899 = r7;
            C1014.f6147.f51.f1390.mo3537h_();
        }
    }
}
