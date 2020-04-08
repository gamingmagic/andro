package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.쿗 */
final class C2030 extends C0762sz {
    C2030() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 456;
        short s = byteBuffer.getShort();
        if (C1014.f6140.f4506) {
            byteBuffer.getInt();
        } else {
            C0622ot.m731(byteBuffer.getShort());
        }
        int i3 = byteBuffer.getInt();
        short s2 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        if (!z) {
            m2699(this, s, i3, s2, b);
        }
    }

    /* renamed from: 鷭 */
    static void m2699(C0762sz szVar, int i, int i2, short s, byte b) {
        if (b == 0) {
            C1014.f6147.f51.f1427.mo4490("Failed to use item.", 16711680);
        } else if (i2 == C1014.f6137.f1636.f1630 || i2 == 0) {
            int i3 = i - 2;
            C1992 r3 = (C1992) C1014.f6137.f1636.f6528.get(Integer.valueOf(i3));
            if (r3 != null) {
                r3.f8846 = s;
                if (r3.f8846 == 0) {
                    C1014.f6137.f1636.f6528.remove(Integer.valueOf(i3));
                }
                C1014.f6147.f51.mo3869(r3.f8848, r3.f8846);
                C1842 r0 = C1014.f6147.f51.f1445;
                C1472 r4 = r3.f8839;
                C1842 r32 = r0;
                if (r0.f1626.getParent() != null) {
                    r32.mo4533(C0572mz.m662(r4));
                }
                return;
            }
            C1014.f6147.f51.f1445.mo4531();
        } else {
            throw new C0828tx(szVar);
        }
    }
}
