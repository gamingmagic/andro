package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.骭 */
final class C1822 extends C0762sz {
    C1822() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 1036;
        int i3 = byteBuffer.getInt();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (!z) {
            C1014.f6147.f51.mo3873(C0622ot.m741(bArr, C0618op.LOCAL), -16777216 | i3);
        }
    }
}
