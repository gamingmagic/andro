package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ㆪ */
final class C1401 extends C0762sz {
    C1401() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 550;
        String[] strArr = new String[10];
        for (int i3 = 0; i3 < strArr.length; i3++) {
            C0618op opVar = C0618op.LOCAL;
            byte[] bArr = new byte[24];
            byteBuffer.get(bArr);
            strArr[i3] = C0622ot.m741(bArr, opVar);
        }
        int[] iArr = new int[10];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            iArr[i4] = byteBuffer.getInt();
        }
        if (!z) {
            C1540.m2228("TAEKWON", strArr, iArr, -1);
        }
    }
}
