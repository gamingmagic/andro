package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ˀ */
final class C1190 extends C0762sz {
    C1190() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 381;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        if (!z) {
            if (b != 0) {
                C1014.f6147.f51.f1427.mo4490("Failed to insert card", 16711680);
                return;
            }
            int i3 = s2 - 2;
            C1992 r6 = (C1992) C1014.f6137.f1636.f6528.get(Integer.valueOf(i3));
            C1992 r5 = (C1992) C1014.f6137.f1636.f6528.get(Integer.valueOf(s - 2));
            if (r6 == null || r5 == null) {
                C0592ns.m674("Failed to find item/card for insert");
                return;
            }
            r6.f8846--;
            if (r6.f8846 <= 0) {
                C1014.f6137.f1636.f6528.remove(Integer.valueOf(i3));
            }
            int i4 = 0;
            while (true) {
                if (i4 >= r5.f8845.length) {
                    break;
                } else if (r5.f8845[i4] == 0) {
                    r5.f8845[i4] = r6.f8848;
                    break;
                } else if (i4 == r5.f8845.length - 1) {
                    C0592ns.m674("Couldn't find card slot for insert");
                    return;
                } else {
                    i4++;
                }
            }
            C1014.f6147.f51.f1445.mo4533(C0572mz.USABLE);
            C1014.f6147.f51.f1445.mo4533(C0572mz.EQUIP);
        }
    }
}
