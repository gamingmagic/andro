package p004o;

import android.support.p000v4.view.ViewCompat;
import java.nio.ByteBuffer;

/* renamed from: o.擾 */
final class C1620 extends C0762sz {
    C1620() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2066;
        short s = byteBuffer.getShort();
        byteBuffer.getInt();
        if (!z) {
            C0527lk lkVar = C1014.f6147.f51.f1385;
            switch (s) {
                case 1:
                    C1746 r0 = C1014.f6147.f51.f1427;
                    C0252cp cpVar = C1014.f6158;
                    String r6 = C1014.f6160.mo3796(1742);
                    r0.mo4490(r6 == null ? "MSG1742" : r6, (int) ViewCompat.MEASURED_SIZE_MASK);
                    break;
                case 2:
                    C1746 r02 = C1014.f6147.f51.f1427;
                    C0252cp cpVar2 = C1014.f6158;
                    String r62 = C1014.f6160.mo3796(1743);
                    r02.mo4490(r62 == null ? "MSG1743" : r62, (int) ViewCompat.MEASURED_SIZE_MASK);
                    break;
                case 8:
                    C1746 r03 = C1014.f6147.f51.f1427;
                    C0252cp cpVar3 = C1014.f6158;
                    String r63 = C1014.f6160.mo3796(1744);
                    r03.mo4490(r63 == null ? "MSG1744" : r63, (int) ViewCompat.MEASURED_SIZE_MASK);
                    break;
            }
            lkVar.mo3544();
        }
    }
}
