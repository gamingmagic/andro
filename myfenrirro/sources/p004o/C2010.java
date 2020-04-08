package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.쨷 */
final class C2010 extends C0762sz {
    C2010() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 270;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        short s4 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        if (!z) {
            C0377gm gmVar = (C0377gm) C1014.f6137.f1636.f6548.f6579.get(Integer.valueOf(s));
            if (gmVar == null) {
                gmVar = new C0377gm();
                C1014.f6137.f1636.f6548.f6579.put(Integer.valueOf(s), gmVar);
            }
            gmVar.mo3751(s, gmVar.f1052, s2, s3, s4, b != 0);
            if (C1014.f6147.f51.f1435.f1626.getParent() != null) {
                C1014.f6147.f51.f1435.mo3766();
            }
            C1014.f6147.f51.mo3860();
        }
    }
}
