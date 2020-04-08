package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.懍 */
final class C1599 extends C0762sz {
    C1599() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 146;
        C0618op opVar = C0618op.KOREAN;
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        String r4 = C0622ot.m741(bArr, opVar);
        byteBuffer.getShort();
        byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        if (!z) {
            m2282(r4, i3, s);
        }
    }

    /* renamed from: 鷭 */
    static void m2282(String str, int i, short s) {
        if (str.endsWith(".gat")) {
            str = str.substring(0, str.length() - 4);
        }
        C1014.f6137.f1636.f8642 = null;
        C1014.f6137.f1636.f8655 = null;
        C1014.f6137.f1636.f8643 = null;
        C1014.f6161.f6166.f6180 = (i & 255) + "." + ((i >> 8) & 255) + "." + ((i >> 16) & 255) + "." + ((i >> 24) & 255);
        C1014.f6161.f6166.f6181 = str;
        C1014.f6161.f6166.f6179 = s;
        C1014.m1825();
    }
}
