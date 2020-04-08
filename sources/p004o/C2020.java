package p004o;

import android.support.p000v4.view.ViewCompat;
import java.nio.ByteBuffer;

/* renamed from: o.쳘 */
final class C2020 extends C0762sz {
    C2020() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2074;
        short s = byteBuffer.getShort();
        if (!z) {
            short s2 = s;
            C0527lk lkVar = C1014.f6147.f51.f1385;
            switch (s2) {
                case 3:
                    C1746 r0 = C1014.f6147.f51.f1427;
                    C0252cp cpVar = C1014.f6158;
                    String r6 = C1014.f6160.mo3796(1744);
                    r0.mo4490(r6 == null ? "MSG1744" : r6, (int) ViewCompat.MEASURED_SIZE_MASK);
                    break;
                case 4:
                    C1746 r02 = C1014.f6147.f51.f1427;
                    C0252cp cpVar2 = C1014.f6158;
                    String r62 = C1014.f6160.mo3796(1745);
                    r02.mo4490(r62 == null ? "MSG1745" : r62, (int) ViewCompat.MEASURED_SIZE_MASK);
                    break;
            }
            C1014.f6144.mo3652((C0839ue) new C1062());
            lkVar.mo3965(lkVar.f1657.getCount());
            lkVar.f1654 = false;
        }
    }
}
