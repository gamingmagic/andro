package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ɬ */
final class C1144 extends C0762sz {
    C1144() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 463;
        byteBuffer.getInt();
        ByteBuffer byteBuffer2 = byteBuffer;
        int[] iArr = new int[5];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            iArr[i3] = byteBuffer2.getInt();
        }
        byteBuffer.getShort();
        if (!z) {
            throw new C0828tx(this);
        }
    }
}
