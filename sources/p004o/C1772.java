package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import p004o.C0643pc.aux;

/* renamed from: o.酣 */
final class C1772 extends C0762sz {
    C1772() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2121;
        byteBuffer.getInt();
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        int i4 = C1014.f6140.f4443 != aux.iRO_Renewal ? byteBuffer.getInt() : 0;
        if (!z) {
            if (s == 13) {
                C1746 r0 = C1014.f6147.f51.f1427;
                C0252cp cpVar = C1014.f6158;
                String r6 = C1014.f6160.mo3796(58);
                r0.mo4490(r6 == null ? "MSG58" : r6, 16711680);
            } else if (s == 8) {
                C1746 r02 = C1014.f6147.f51.f1427;
                C0252cp cpVar2 = C1014.f6158;
                String r62 = C1014.f6160.mo3796(1578);
                r02.mo4490(r62 == null ? "MSG1578" : r62, 16711680);
            } else {
                C1746 r03 = C1014.f6147.f51.f1427;
                C0252cp cpVar3 = C1014.f6158;
                String r63 = C1014.f6160.mo3796(55);
                r03.mo4490(r63 == null ? "MSG55" : r63, (int) SupportMenu.USER_MASK);
            }
            C1014.f6152.f7978.f6456 = i3;
            C1014.f6152.f7978.f6455 = i4;
            C1014.f6147.f51.f1391.mo4416e_();
        }
    }
}
