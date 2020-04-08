package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import org.apache.http.HttpStatus;

/* renamed from: o.ʘ */
final class C1168 extends C0762sz {
    C1168() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 350;
        int i3 = byteBuffer.getInt();
        if (!z) {
            if (i3 > 0) {
                C1746 r0 = C1014.f6147.f51.f1427;
                C0252cp cpVar = C1014.f6158;
                String r5 = C1014.f6160.mo3796(367);
                r0.mo4490(r5 == null ? "MSG367" : r5, 16711680);
                return;
            }
            C1014.f6137.f1636.f6541 = null;
            C1014.f6137.f1636.f8637 = 0;
            C1746 r02 = C1014.f6147.f51.f1427;
            C0252cp cpVar2 = C1014.f6158;
            String r52 = C1014.f6160.mo3796((int) HttpStatus.SC_UNAUTHORIZED);
            r02.mo4490(r52 == null ? "MSG401" : r52, (int) SupportMenu.USER_MASK);
            if (C1014.f6147.f51.f1383.f1626.getParent() != null) {
                C1014.f6147.f51.f1383.mo3538();
            }
        }
    }
}
