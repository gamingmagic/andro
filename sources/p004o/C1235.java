package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ̳ */
final class C1235 extends C0762sz {
    C1235() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 265;
        int i3 = byteBuffer.getInt();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (!z) {
            String r3 = C1014.m1837(bArr);
            C1014.f6147.f51.f1427.mo4490(r3, 16764416);
            C0540lv r4 = C1014.f6142.mo3978(i3);
            if (r4 != null) {
                r4.mo3999(r3, -1);
            }
        }
    }
}
