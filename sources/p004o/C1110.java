package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.Ǿ */
final class C1110 extends C0762sz {
    C1110() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2470;
        long j = byteBuffer.getLong();
        short s = byteBuffer.getShort();
        if (!z) {
            if (s != 0) {
                if (s == 1) {
                    C1746 r0 = C1014.f6147.f51.f1427;
                    C0252cp cpVar = C1014.f6158;
                    String r7 = C1014.f6160.mo3796(2455);
                    r0.mo4490(r7 == null ? "MSG2455" : r7, 16711680);
                } else if (s == 2) {
                    C1746 r02 = C1014.f6147.f51.f1427;
                    C0252cp cpVar2 = C1014.f6158;
                    String r72 = C1014.f6160.mo3796(3032);
                    r02.mo4490(r72 == null ? "MSG3032" : r72, 16711680);
                }
                C1014.f6147.f51.f1443.mo3538();
                return;
            }
            C1014.f6147.f51.f1443.f7952.setText(String.valueOf(j) + " z");
        }
    }
}
