package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.䔾 */
final class C1486 extends C0762sz {
    C1486() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2628;
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r8 = C0622ot.m741(bArr, opVar);
        C1227[] r6 = new C1227[i];
        for (int i3 = 0; i3 < r6.length; i3++) {
            ByteBuffer byteBuffer2 = byteBuffer;
            C1227 r3 = new C1227();
            r3.f6364 = byteBuffer2.getInt();
            byteBuffer2.get(r3.f6362);
            byteBuffer2.get(r3.f6361);
            r3.f6357 = byteBuffer2.get();
            r3.f6358 = byteBuffer2.get();
            r3.f6359 = byteBuffer2.getShort();
            r3.f6360 = byteBuffer2.getShort();
            r6[i3] = r3;
        }
        if (!z) {
            C1225.m1977(r8, r6);
        }
    }
}
