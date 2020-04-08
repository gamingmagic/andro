package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.Ϥ */
final class C1272 extends C0762sz {
    C1272() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 233;
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        short[] sArr = new short[4];
        for (int i4 = 0; i4 < sArr.length; i4++) {
            sArr[i4] = byteBuffer.getShort();
        }
        short[] sArr2 = sArr;
        if (!z) {
            C1853.m2524(C0622ot.m731(s), -1, i3, b, b2, b3, new C1111(sArr2), null);
        }
    }
}
