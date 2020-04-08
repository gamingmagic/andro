package p004o;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: o.딃 */
final class C1931 extends C0762sz {
    C1931() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 284;
        short s = byteBuffer.getShort();
        String[] strArr = new String[4];
        for (int i3 = 0; i3 < strArr.length; i3++) {
            C0618op opVar = C0618op.LOCAL;
            byte[] bArr = new byte[16];
            byteBuffer.get(bArr);
            strArr[i3] = C0622ot.m741(bArr, opVar);
        }
        if (!z) {
            m2604(s, strArr);
        }
    }

    /* renamed from: 鷭 */
    static void m2604(short s, String[] strArr) {
        int i = 0;
        int i2 = 0;
        while (i2 < strArr.length && strArr[i2].length() > 0) {
            i++;
            i2++;
        }
        C1014.f6147.f51.mo3877(s, (String[]) Arrays.copyOf(strArr, i));
    }
}
