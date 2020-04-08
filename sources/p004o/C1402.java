package p004o;

import java.nio.ByteBuffer;
import java.util.LinkedList;

/* renamed from: o.ㆲ */
final class C1402 extends C0762sz {
    C1402() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 234;
        short s = byteBuffer.getShort();
        byte b = byteBuffer.get();
        if (!z) {
            int i3 = s - 2;
            if (b > 0) {
                C1014.f6147.f51.f1427.mo4490("Failed to add item to trade", 16711680);
            } else if (i3 == -2) {
                C1014.f6137.f1636.f6542 -= C1014.f6141.f6186;
                C1014.f6147.f51.f1416.mo3585(C1014.f6137.f1636);
            } else {
                C0448is isVar = C1014.f6147.f51.f1384;
                int i4 = C1014.f6141.f6186;
                LinkedList r3 = isVar.mo3845(false);
                if (r3 == null) {
                    r3 = new LinkedList();
                }
                C1992 r7 = ((C1992) C1014.f6137.f1636.f6528.get(Integer.valueOf(i3))).mo4612();
                r7.f8846 = i4;
                r3.add(new C0512ky(r7, i3));
                isVar.mo3849(false, r3);
                C1992 r5 = (C1992) C1014.f6137.f1636.f6528.get(Integer.valueOf(i3));
                r5.f8846 -= C1014.f6141.f6186;
                if (r5.f8846 <= 0) {
                    C1014.f6137.f1636.f6528.remove(Integer.valueOf(i3));
                }
                C1014.f6147.f51.mo3869(r5.f8848, r5.f8846);
                C1014.f6147.f51.f1445.mo4533(C0572mz.m662(r5.f8839));
            }
        }
    }
}
