package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ユ */
final class C1393 extends C0762sz {
    C1393() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2756;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        byteBuffer.getInt();
        C0618op opVar = C0618op.LATIN;
        byte[] bArr = new byte[26];
        byteBuffer.get(bArr);
        C0622ot.m741(bArr, opVar);
        byte b = byteBuffer.get();
        C0618op opVar2 = C0618op.LATIN;
        byte[] bArr2 = new byte[16];
        byteBuffer.get(bArr2);
        C0622ot.m741(bArr2, opVar2);
        byteBuffer.get();
        C1726[] r4 = new C1726[i];
        for (int i6 = 0; i6 < i; i6++) {
            C1726 r6 = new C1726();
            r6.f7964 = byteBuffer.getInt();
            r6.f7963 = byteBuffer.getShort();
            C0618op opVar3 = C0618op.LOCAL;
            byte[] bArr3 = new byte[20];
            byteBuffer.get(bArr3);
            r6.f7962 = C0622ot.m741(bArr3, opVar3);
            r6.f7961 = byteBuffer.getShort();
            r6.f7958 = byteBuffer.getShort();
            r6.f7959 = byteBuffer.getShort();
            byte[] bArr4 = new byte[128];
            byteBuffer.get(bArr4);
            r6.f7960 = bArr4;
            r4[i6] = r6;
        }
        if (!z) {
            C1103.m1863(i3, i4, i5, b, r4);
        }
    }
}
