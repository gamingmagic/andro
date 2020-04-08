package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;

/* renamed from: o.坵 */
final class C1546 extends C0762sz {
    C1546() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 547;
        int i3 = byteBuffer.getInt();
        int i4 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        if (!z) {
            String str = C1014.f6158.f674.f608.mo4465(i4).f7767;
            switch (i3) {
                case 0:
                    C1746 r0 = C1014.f6147.f51.f1427;
                    C0252cp cpVar = C1014.f6158;
                    String r7 = C1014.f6160.mo3796(912);
                    r0.mo4490(String.format(r7 == null ? "MSG912" : r7, new Object[]{str}), (int) SupportMenu.USER_MASK);
                    return;
                case 1:
                    C1746 r02 = C1014.f6147.f51.f1427;
                    C0252cp cpVar2 = C1014.f6158;
                    String r72 = C1014.f6160.mo3796(913);
                    r02.mo4490(String.format(r72 == null ? "MSG913" : r72, new Object[]{str}), 52685);
                    return;
                case 2:
                    C1746 r03 = C1014.f6147.f51.f1427;
                    C0252cp cpVar3 = C1014.f6158;
                    String r73 = C1014.f6160.mo3796(914);
                    r03.mo4490(String.format(r73 == null ? "MSG914" : r73, new Object[]{str}), 16763080);
                    return;
                case 3:
                    C1746 r04 = C1014.f6147.f51.f1427;
                    C0252cp cpVar4 = C1014.f6158;
                    String r74 = C1014.f6160.mo3796(915);
                    r04.mo4490(String.format(r74 == null ? "MSG915" : r74, new Object[]{str}), 16763080);
                    break;
            }
        }
    }
}
