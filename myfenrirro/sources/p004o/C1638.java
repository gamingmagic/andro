package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.棰 */
final class C1638 extends C0762sz {
    C1638() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 348;
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r6 = C0622ot.m741(bArr, opVar);
        C0618op opVar2 = C0618op.LOCAL;
        byte[] bArr2 = new byte[40];
        byteBuffer.get(bArr2);
        String r8 = C0622ot.m741(bArr2, opVar2);
        if (!C1014.f6140.f4452) {
            C0618op opVar3 = C0618op.LOCAL;
            byte[] bArr3 = new byte[40];
            byteBuffer.get(bArr3);
            C0622ot.m741(bArr3, opVar3);
        }
        if (!z) {
            C1836.m2503(this, r6, r8);
        }
    }
}
