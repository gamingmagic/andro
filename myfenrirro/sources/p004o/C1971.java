package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.믿 */
final class C1971 extends C0762sz {
    C1971() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 151;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        int i3 = C1014.f6140.f4493 ? byteBuffer.getInt() : 0;
        byte[] bArr2 = new byte[i];
        byteBuffer.get(bArr2);
        if (!z) {
            m2637(bArr, bArr2, (byte) i3);
        }
    }

    /* renamed from: 鷭 */
    static void m2637(byte[] bArr, byte[] bArr2, byte b) {
        String r2 = C0622ot.m741(bArr, C0618op.LOCAL);
        String str = "( From " + r2 + " ) : " + C1014.m1837(bArr2);
        C1014.f6147.f51.f1427.mo4489(r2);
        C1014.f6147.f51.f1427.mo4490(str, 16776960);
        if (b > 0) {
            C0206bb r22 = C1014.f6137.mo3953(r2);
            if (r22 != null) {
                C0540lv r23 = C1014.f6142.mo3978(r22.f1630);
                if (r23 != null) {
                    r23.mo3999(str, -1);
                }
            }
        }
    }
}
