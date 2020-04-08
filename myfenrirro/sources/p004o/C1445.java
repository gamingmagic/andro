package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;

/* renamed from: o.䁜 */
final class C1445 extends C0762sz {

    /* renamed from: 鷭 */
    byte f7067;

    C1445() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 203;
        this.f7067 = byteBuffer.get();
        if (!z) {
            if (this.f7067 > 0) {
                C1746 r0 = C1014.f6147.f51.f1427;
                C0252cp cpVar = C1014.f6158;
                String r5 = C1014.f6160.mo3796(58);
                r0.mo4490(r5 == null ? "MSG58" : r5, 16711680);
                return;
            }
            C1746 r02 = C1014.f6147.f51.f1427;
            C0252cp cpVar2 = C1014.f6158;
            String r52 = C1014.f6160.mo3796(55);
            r02.mo4490(r52 == null ? "MSG55" : r52, (int) SupportMenu.USER_MASK);
        }
    }
}
