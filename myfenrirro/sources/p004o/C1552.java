package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.头 */
final class C1552 extends C0762sz {
    C1552() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 160;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        short[] sArr = new short[4];
        for (int i3 = 0; i3 < sArr.length; i3++) {
            sArr[i3] = byteBuffer.getShort();
        }
        short s4 = byteBuffer.getShort();
        byte b4 = byteBuffer.get();
        byte b5 = byteBuffer.get();
        if (!z) {
            C2005.m2676(s, s2, C0622ot.m731(s3), b, b2, b3, new C1111(sArr), s4, b4, b5, 0, 0, null, 0, 0);
        }
    }
}
