package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.䓶 */
final class C1479 extends C0762sz {
    C1479() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2619;
        byteBuffer.getInt();
        byteBuffer.get();
        short[] sArr = new short[i];
        for (int i3 = 0; i3 < sArr.length; i3++) {
            sArr[i3] = byteBuffer.getShort();
        }
        if (!z) {
            throw new C0828tx(this);
        }
    }
}
