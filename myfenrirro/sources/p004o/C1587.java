package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.悞 */
final class C1587 extends C0762sz {
    C1587() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 705;
        int i3 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        byte b4 = byteBuffer.get();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (!z) {
            String r7 = C0622ot.m741(bArr, C0618op.LOCAL);
            int r8 = C0621os.m717(b, b2, b3, b4);
            C1014.f6147.f51.f1427.mo4490(r7, 16777215 & r8);
            C0540lv r9 = C1014.f6142.mo3978(i3);
            if (r9 != null) {
                r9.mo3999(r7, -16777216 | r8);
            }
        }
    }
}
