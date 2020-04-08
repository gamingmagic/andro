package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ʋ */
final class C1158 extends C0762sz {
    C1158() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 518;
        byteBuffer.getInt();
        int i3 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r5 = C0622ot.m741(bArr, opVar);
        if (!z) {
            C1014.f6152.f7977.put(Integer.valueOf(i3), r5);
            C1833.m2500(i3, b != 0);
        }
    }
}
