package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.Ȫ */
final class C1125 extends C0762sz {
    C1125() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 427;
        int i3 = byteBuffer.getInt();
        byteBuffer.getShort();
        int i4 = byteBuffer.getInt();
        if (!z) {
            C0540lv r3 = C1014.f6142.mo3978(i3);
            if (r3 != null) {
                r3.f1732.f8634 = i4;
                r3.mo3989();
            }
        }
    }
}
