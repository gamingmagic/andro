package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import org.apache.commons.net.ftp.FTPReply;

/* renamed from: o.ˮ̌ */
final class C1211 extends C0762sz {
    C1211() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 286;
        byte b = byteBuffer.get();
        if (!z) {
            switch (b) {
                case 0:
                    C1746 r0 = C1014.f6147.f51.f1427;
                    C0252cp cpVar = C1014.f6158;
                    String r5 = C1014.f6160.mo3796(218);
                    r0.mo4490(r5 == null ? "MSG218" : r5, (int) SupportMenu.USER_MASK);
                    return;
                case 1:
                    C1746 r02 = C1014.f6147.f51.f1427;
                    C0252cp cpVar2 = C1014.f6158;
                    String r52 = C1014.f6160.mo3796((int) FTPReply.NAME_SYSTEM_TYPE);
                    r02.mo4490(r52 == null ? "MSG215" : r52, 16711680);
                    return;
                case 2:
                    C1746 r03 = C1014.f6147.f51.f1427;
                    C0252cp cpVar3 = C1014.f6158;
                    String r53 = C1014.f6160.mo3796(217);
                    r03.mo4490(r53 == null ? "MSG217" : r53, 16711680);
                    break;
            }
        }
    }
}
