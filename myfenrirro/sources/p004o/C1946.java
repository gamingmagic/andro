package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.랡 */
final class C1946 extends C0762sz {
    C1946() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2641;
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r5 = C0622ot.m741(bArr, opVar);
        if (!z) {
            C1014.f6147.f51.f1428.mo3664(i3, s, s2, r5);
        }
    }
}
