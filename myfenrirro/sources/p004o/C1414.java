package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.㜊 */
final class C1414 extends C0762sz {
    C1414() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 1087;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        int i4 = byteBuffer.getInt();
        int[] iArr = new int[3];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            iArr[i5] = byteBuffer.getInt();
        }
        if (!z) {
            C1495.m2194(s, i3, b, i4, iArr);
        }
    }
}
