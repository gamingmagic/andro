package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ռ */
final class C1307 extends C0762sz {
    C1307() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2474;
        short s = byteBuffer.getShort();
        long j = byteBuffer.getLong();
        int i3 = byteBuffer.getInt();
        if (!z) {
            switch (s) {
                case 0:
                    C1014.f6147.f51.f1443.f7952.setText(String.valueOf(j) + " z");
                    C1014.f6147.f51.f1443.f7953.setText(String.valueOf(i3) + " z");
                    C1014.f6137.f1636.f6542 = i3;
                    C1014.f6147.f51.f1416.mo3585(C1014.f6137.f1636);
                    return;
                case 1:
                    C1746 r0 = C1014.f6147.f51.f1427;
                    C0252cp cpVar = C1014.f6158;
                    String r7 = C1014.f6160.mo3796(2456);
                    r0.mo4490(r7 == null ? "MSG2456" : r7, 16711680);
                    return;
                case 3:
                    C1746 r02 = C1014.f6147.f51.f1427;
                    C0252cp cpVar2 = C1014.f6158;
                    String r72 = C1014.f6160.mo3796(2490);
                    r02.mo4490(r72 == null ? "MSG2490" : r72, 16711680);
                    return;
                default:
                    C1746 r03 = C1014.f6147.f51.f1427;
                    C0252cp cpVar3 = C1014.f6158;
                    String r73 = C1014.f6160.mo3796(2455);
                    r03.mo4490(r73 == null ? "MSG2455" : r73, 16711680);
                    return;
            }
        }
    }
}
