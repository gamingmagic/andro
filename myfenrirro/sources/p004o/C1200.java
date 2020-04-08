package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;

/* renamed from: o.ˮ */
final class C1200 extends C0762sz {
    C1200() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2076;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        if (!z) {
            c_activity c_activity = C1014.f6147;
            short s3 = s;
            int i4 = i3;
            short s4 = s2;
            short s5 = s3;
            C1992 r10 = (C1992) C1014.f6137.f1636.f6528.get(Integer.valueOf(s5 - 2));
            if (r10 != null) {
                C1746 r0 = C1014.f6147.f51.f1427;
                C0252cp cpVar = C1014.f6158;
                String r5 = C1014.f6160.mo3796(1747);
                r0.mo4490(String.format(r5 == null ? "MSG1747" : r5, new Object[]{r10.mo4615(C1014.f6158.f674.f608), Integer.valueOf(s4), Integer.valueOf(i4 * s4)}), (int) SupportMenu.USER_MASK);
                r10.f8846 -= s4;
                if (r10.f8846 <= 0) {
                    C1014.f6137.f1636.f6528.remove(Integer.valueOf(s5 - 2));
                }
                C1014.f6147.f51.f1445.mo4531();
            }
        }
    }
}
