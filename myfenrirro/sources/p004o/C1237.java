package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ̷ */
final class C1237 extends C0762sz {
    C1237() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2057;
        byteBuffer.getInt();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        C0622ot.m741(bArr, opVar);
        byteBuffer.getInt();
        byteBuffer.getShort();
        byteBuffer.getShort();
        ByteBuffer byteBuffer2 = byteBuffer;
        short[] sArr = new short[6];
        for (int i3 = 0; i3 < sArr.length; i3++) {
            sArr[i3] = byteBuffer2.getShort();
        }
        if (!z) {
            throw new C0828tx(this);
        }
    }
}
