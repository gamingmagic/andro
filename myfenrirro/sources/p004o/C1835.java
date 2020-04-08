package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.鬥 */
final class C1835 extends C0762sz {
    C1835() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2692;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        int i6 = byteBuffer.getInt();
        int i7 = byteBuffer.getInt();
        int i8 = byteBuffer.getInt();
        int i9 = byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        int i10 = byteBuffer.getInt();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r19 = C0622ot.m741(bArr, opVar);
        C0618op opVar2 = C0618op.LOCAL;
        byte[] bArr2 = new byte[16];
        byteBuffer.get(bArr2);
        String r20 = C0622ot.m741(bArr2, opVar2);
        int i11 = byteBuffer.getInt();
        int i12 = byteBuffer.getInt();
        if (!z) {
            C1673.m2337(i3, i4, i5, i6, i7, i8, i9, i10, r19, null, r20, i11, i12);
        }
    }
}
