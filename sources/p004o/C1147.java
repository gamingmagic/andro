package p004o;

import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;

/* renamed from: o.ɴ */
final class C1147 extends C0762sz {
    C1147() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 192;
        int i3 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        if (!z) {
            C0540lv r10 = C1014.f6142.mo3978(i3);
            if (r10 != null) {
                if (b >= 34) {
                    b = (byte) (b - 1);
                }
                if (b >= 0 && b < C0569mw.values().length) {
                    C0540lv lvVar = r10;
                    C0540lv lvVar2 = lvVar;
                    lvVar.f1735 = new C1578(lvVar2, C0569mw.values()[b]);
                    C1578 r102 = lvVar2.f1735;
                    c_activity c_activity = C1014.f6147;
                    C0541lw lwVar = new C0541lw(lvVar2, r102);
                    long min = Math.min(lvVar2.f1735.f8946, 5000);
                    C0541lw lwVar2 = lwVar;
                    c_activity c_activity2 = c_activity;
                    if (c_activity.f56 != null) {
                        c_activity2.f56.postDelayed(new C1348(c_activity2, lwVar2), min);
                    }
                }
            }
        }
    }
}
