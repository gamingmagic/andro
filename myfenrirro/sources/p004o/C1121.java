package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ȡ */
final class C1121 extends C0762sz {
    C1121() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 145;
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        if (!z) {
            String r4 = C0622ot.m741(bArr, C0618op.KOREAN);
            if (r4.endsWith(".gat")) {
                r4 = r4.substring(0, r4.length() - 4);
            }
            C1014.f6137.f1636.f8642 = null;
            C1014.f6137.f1636.f8655 = null;
            C1014.f6137.f1636.f8643 = null;
            C1014.f6144.mo4336(true);
            C1014.f6148.mo3387(new C1122(this, r4, s, s2));
        }
    }
}
