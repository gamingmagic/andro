package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ϋ */
final class C1268 extends C0762sz {
    C1268() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2303;
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        int i4 = byteBuffer.getInt();
        int[] iArr = new int[3];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            iArr[i5] = byteBuffer.getInt();
        }
        int[] iArr2 = iArr;
        if (!z) {
            C1495.m2194(s, i3, 1, i4, iArr2);
        }
    }
}
