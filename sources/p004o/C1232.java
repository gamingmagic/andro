package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ̯ */
final class C1232 extends C0762sz {
    C1232() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 254;
        int i3 = byteBuffer.getInt();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r3 = C0622ot.m741(bArr, opVar);
        if (!z) {
            C1230.m1983(i3, r3);
        }
    }
}
