package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ̴ */
final class C1236 extends C0762sz {
    C1236() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 260;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
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
        C0618op opVar3 = C0618op.KOREAN;
        byte[] bArr3 = new byte[16];
        byteBuffer.get(bArr3);
        String r19 = C0622ot.m741(bArr3, opVar3);
        if (!z) {
            C1233.m1986(i3, i4, s, s2, b, r13, r14, r19, -1, -1);
        }
    }
}
