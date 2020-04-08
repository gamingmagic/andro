package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.嶔 */
final class C1566 extends C0762sz {
    C1566() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2750;
        short s = byteBuffer.getShort();
        String[] strArr = new String[i];
        for (int i3 = 0; i3 < i; i3++) {
            C0618op opVar = C0618op.LOCAL;
            byte[] bArr = new byte[16];
            byteBuffer.get(bArr);
            strArr[i3] = C0622ot.m741(bArr, opVar);
        }
        if (!z) {
            C1931.m2604(s, strArr);
        }
    }
}
