package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.䙍 */
final class C1495 extends C0762sz {
    C1495() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2435;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        int i4 = byteBuffer.getInt();
        byteBuffer.getInt();
        int[] iArr = new int[3];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            iArr[i5] = byteBuffer.getInt();
        }
        if (!z) {
            m2194(s, i3, b, i4, iArr);
        }
    }

    /* renamed from: 鷭 */
    static void m2194(short s, int i, byte b, int i2, int[] iArr) {
        C0540lv r6 = C1014.f6142.mo3978(i);
        if (r6 != null) {
            C0586nm r7 = C0586nm.m664(s);
            if (r7 != null) {
                new StringBuilder("sc: start=").append(b).append(", type=").append(r7);
                if (b > 0) {
                    r6.mo4002(r7, (long) i2, iArr, i);
                } else {
                    r6.mo4001(r7, i);
                }
            }
        }
    }
}
