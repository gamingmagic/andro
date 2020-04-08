package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.牥 */
final class C1680 extends C0762sz {
    C1680() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2578;
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r6 = C0622ot.m741(bArr, opVar);
        boolean z2 = byteBuffer.get() != 0;
        if (!z) {
            if (!z2) {
                C1746 r0 = C1014.f6147.f51.f1427;
                C0252cp cpVar = C1014.f6158;
                String r3 = C1014.f6160.mo3796(2605);
                r0.mo4490(r3 == null ? "MSG2605" : r3, 16711680);
                return;
            }
            C1014.f6147.f51.f1428.f805.setText(r6);
            C1014.f6147.f51.f1428.mo3537h_();
        }
    }
}
