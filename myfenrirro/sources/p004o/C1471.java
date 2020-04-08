package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;

/* renamed from: o.䒢 */
final class C1471 extends C0762sz {
    C1471() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 214;
        byte b = byteBuffer.get();
        if (!z) {
            if (b == 1) {
                C1746 r0 = C1014.f6147.f51.f1427;
                C0252cp cpVar = C1014.f6158;
                String r7 = C1014.f6160.mo3796(66);
                r0.mo4490(r7 == null ? "MSG66" : r7, 16711680);
            } else if (b == 2) {
                C1746 r02 = C1014.f6147.f51.f1427;
                C0252cp cpVar2 = C1014.f6158;
                String r72 = C1014.f6160.mo3796(67);
                r02.mo4490(r72 == null ? "MSG67" : r72, 16711680);
            } else {
                if (C1014.f6137.f1636.f6522 == null) {
                    C1014.f6137.f1636.f6522 = new C2012();
                }
                C1014.f6137.f1636.f6522.f8900.clear();
                C1014.f6137.f1636.f6522.f8900.add(new C2013(C1014.f6137.f1636.f8657, false));
                C1014.f6147.f51.f1390.f6477.setText(null);
                C1014.f6147.f51.f1390.mo3537h_();
                C1746 r03 = C1014.f6147.f51.f1427;
                C0252cp cpVar3 = C1014.f6158;
                String r73 = C1014.f6160.mo3796(65);
                r03.mo4490(r73 == null ? "MSG65" : r73, (int) SupportMenu.USER_MASK);
            }
        }
    }
}
