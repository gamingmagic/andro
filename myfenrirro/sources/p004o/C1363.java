package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ᙆ */
final class C1363 extends C0762sz {
    C1363() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2807;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r4 = C0622ot.m741(bArr, opVar);
        if (!z) {
            C1755.m2424(s, i3, r4);
        }
    }
}
