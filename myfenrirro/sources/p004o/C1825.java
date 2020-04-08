package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.髑 */
final class C1825 extends C0762sz {
    C1825() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 553;
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        int i4 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        if (!z) {
            m2492(i3, s, s2, i4, b);
        }
    }

    /* renamed from: 鷭 */
    static void m2492(int i, short s, short s2, int i2, byte b) {
        C1919 r0;
        C0520le leVar = (C0520le) C1014.f6137.f1637.get(i);
        if (leVar == null) {
            r0 = null;
        } else {
            r0 = C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null;
        }
        C1919 r2 = r0;
        if (r0 != null) {
            int i3 = r2.f8646;
            r2.f8646 = i2;
            r2.f8644 = s;
            r2.f8632 = s2;
            r2.f8633 = b;
            if (i3 != r2.f8646) {
                C0540lv r4 = C1014.f6142.mo3978(i);
                if (r4 != null) {
                    if ((i3 & 1928) > 0 && (r2.f8646 & 1928) == 0) {
                        r4.f1729 = null;
                    } else if ((i3 & 1928) == 0 && (r2.f8646 & 1928) > 0) {
                        if ((r2.f8646 & 8) > 0) {
                            r4.mo3994(1, false);
                        }
                        if ((r2.f8646 & 128) > 0) {
                            r4.mo3994(2, false);
                        }
                        if ((r2.f8646 & 256) > 0) {
                            r4.mo3994(3, false);
                        }
                        if ((r2.f8646 & 512) > 0) {
                            r4.mo3994(4, false);
                        }
                        if ((r2.f8646 & 1024) > 0) {
                            r4.mo3994(5, false);
                        }
                    }
                    r4.mo4018();
                    C1014.f6147.f51.f1422.mo4456c_();
                }
            }
        }
    }
}
