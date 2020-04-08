package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ȭ */
final class C1126 extends C0762sz {
    C1126() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 405;
        int i3 = byteBuffer.getInt();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r15 = C0622ot.m741(bArr, opVar);
        C0618op opVar2 = C0618op.LOCAL;
        byte[] bArr2 = new byte[24];
        byteBuffer.get(bArr2);
        String r6 = C0622ot.m741(bArr2, opVar2);
        C0618op opVar3 = C0618op.LOCAL;
        byte[] bArr3 = new byte[24];
        byteBuffer.get(bArr3);
        String r7 = C0622ot.m741(bArr3, opVar3);
        C0618op opVar4 = C0618op.LOCAL;
        byte[] bArr4 = new byte[24];
        byteBuffer.get(bArr4);
        String r12 = C0622ot.m741(bArr4, opVar4);
        if (!z) {
            C1127.m1887(i3, r15, r6, r7, r12, 0);
        }
    }
}
