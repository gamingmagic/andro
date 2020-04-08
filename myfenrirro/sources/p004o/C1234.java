package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ̲ */
final class C1234 extends C0762sz {
    C1234() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2788;
        int i3 = byteBuffer.getInt();
        byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        byteBuffer.getShort();
        byteBuffer.getShort();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r13 = C0622ot.m741(bArr, opVar);
        C0618op opVar2 = C0618op.LOCAL;
        byte[] bArr2 = new byte[24];
        byteBuffer.get(bArr2);
        String r14 = C0622ot.m741(bArr2, opVar2);
        C0618op opVar3 = C0618op.LOCAL;
        byte[] bArr3 = new byte[16];
        byteBuffer.get(bArr3);
        String r15 = C0622ot.m741(bArr3, opVar3);
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        if (!z) {
            C1233.m1986(i3, i4, s, s2, b, r13, r14, r15, b3, b2);
        }
    }
}
