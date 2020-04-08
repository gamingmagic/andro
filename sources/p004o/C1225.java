package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ̤ */
final class C1225 extends C0762sz {
    C1225() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 251;
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
            r6[i3] = r3;
        }
        if (!z) {
            m1977(r8, r6);
        }
    }

    /* renamed from: 鷭 */
    static void m1977(String str, C1227[] r7) {
        if (C1014.f6137.f1636.f6502 == null) {
            C1014.f6137.f1636.f6502 = new C0187ak();
        }
        C1014.f6137.f1636.f6502.f390 = str;
        C1014.f6137.f1636.f6502.f386 = new C0188[r7.length];
        for (int i = 0; i < r7.length; i++) {
            C1014.f6137.f1636.f6502.f386[i] = new C0188();
            C1014.f6137.f1636.f6502.f386[i].mo3534(r7[i].f6364, C0622ot.m741(r7[i].f6362, C0618op.LOCAL), C0622ot.m741(r7[i].f6361, C0618op.KOREAN), r7[i].f6357, r7[i].f6358);
        }
        if (C1014.f6147.f51.f1381.f1626.getParent() != null) {
            C1014.f6147.f51.f1381.mo3545();
        }
    }
}
