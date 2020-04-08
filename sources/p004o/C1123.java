package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.Ȧ */
final class C1123 extends C0762sz {
    C1123() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2759;
        C0618op opVar = C0618op.KOREAN;
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        String r5 = C0622ot.m741(bArr, opVar);
        byteBuffer.getShort();
        byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        byteBuffer.get(new byte[128]);
        if (!z) {
            C1599.m2282(r5, i3, s);
        }
    }
}
