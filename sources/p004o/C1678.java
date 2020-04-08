package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.燍 */
final class C1678 extends C0762sz {
    C1678() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 665;
        byteBuffer.getShort();
        int i3 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        if (!z) {
            C1746 r0 = C1014.f6147.f51.f1427;
            C1701 r4 = C1014.f6158.f674.f608.mo4465(i3);
            r0.mo4490((r4 == null ? null : r4.mo4462(true)) + " rental time has expired.", 16711680);
        }
    }
}
