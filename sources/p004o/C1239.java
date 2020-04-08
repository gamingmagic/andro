package p004o;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: o.ˮ̻ */
final class C1239 extends C0762sz {
    C1239() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 263;
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        if (!z && C1014.f6137.f1636.f6502 != null) {
            C0187ak akVar = C1014.f6137.f1636.f6502;
            int i4 = 0;
            while (true) {
                if (i4 < akVar.f386.length) {
                    if (akVar.f386[i4] != null && akVar.f386[i4].f398 == i3) {
                        akVar.f386[i4].f392 = s;
                        akVar.f386[i4].f393 = s2;
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
            if (C1014.f6142.f1695.f7347 != null) {
                if (s <= 0 || s2 <= 0) {
                    C1739 r4 = C1014.f6142.f1695.f7347;
                    r4.f8014 = (HashMap) r4.f8014.clone();
                    r4.f8014.remove(Integer.valueOf(i3));
                } else {
                    C1014.f6142.f1695.f7347.mo4482(i3, s, s2, C1014.f6137.f1636.f6502.mo3533(i3));
                }
            }
        }
    }
}
