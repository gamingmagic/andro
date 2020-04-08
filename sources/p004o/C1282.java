package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.Н */
final class C1282 extends C0762sz {
    C1282() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2058;
        byteBuffer.getInt();
        short[] sArr = new short[6];
        for (int i3 = 0; i3 < sArr.length; i3++) {
            sArr[i3] = byteBuffer.getShort();
        }
        if (!z) {
            throw new C0828tx(this);
        }
    }
}
