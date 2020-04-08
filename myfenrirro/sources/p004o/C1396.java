package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ㅱ */
final class C1396 extends C0762sz {
    C1396() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2017;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        short s4 = byteBuffer.getShort();
        short s5 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        if (!z) {
            short s6 = s;
            short s7 = s2;
            short s8 = s3;
            short s9 = s4;
            byte b2 = b;
            short s10 = s5;
            short s11 = s9;
            short s12 = s7;
            short s13 = s6;
            C0377gm gmVar = (C0377gm) C1014.f6137.f1636.f6548.f6579.get(Integer.valueOf(s13));
            if (gmVar == null) {
                gmVar = new C0377gm();
                C1014.f6137.f1636.f6548.f6579.put(Integer.valueOf(s13), gmVar);
            }
            gmVar.mo3751(s13, s12, s8, s11, s10, b2 != 0);
            C1014.f6147.f51.mo3874(gmVar);
        }
    }
}
