package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.㣮 */
final class C1418 extends C0762sz {
    C1418() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 313;
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        short s4 = byteBuffer.getShort();
        short s5 = byteBuffer.getShort();
        if (z || C1014.f6137.f1636 == null) {
            return;
        }
        if (C1014.f6137.f1636.f1634 == s3 && C1014.f6137.f1636.f1631 == s4) {
            C1014.f6144.mo3652((C0839ue) new C1093(s, s2));
            C1014.f6137.f1636.mo4575(i3, (int) s, (int) s2, (int) s5, 0, 0);
            return;
        }
        C1301 r11 = C1014.f6137.f1636;
        short s6 = s4;
        r11.f1634 = s3;
        r11.f1631 = s6;
        r11.f1632.x = 0;
        r11.f1632.y = 0;
    }
}
