package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.踒 */
final class C1760 extends C0762sz {
    C1760() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2571;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        int i4 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        byte b4 = byteBuffer.get();
        ByteBuffer byteBuffer2 = byteBuffer;
        short[] sArr = new short[4];
        for (int i5 = 0; i5 < sArr.length; i5++) {
            sArr[i5] = byteBuffer2.getShort();
        }
        short[] sArr2 = sArr;
        C1665 r18 = new C1665(byteBuffer);
        if (!z) {
            C1332.m2056(s, i3, i4, b, b2, b3, b4, new C1111(sArr2), r18);
        }
    }
}
