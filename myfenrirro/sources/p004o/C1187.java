package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ʼ */
final class C1187 extends C0762sz {

    /* renamed from: ˮ͈ */
    int f6301;

    /* renamed from: 櫯 */
    int f6302;

    /* renamed from: 鷭 */
    int f6303;

    C1187() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2062;
        this.f6303 = byteBuffer.getInt();
        this.f6302 = byteBuffer.getInt();
        this.f6301 = byteBuffer.getInt();
        if (!z) {
            m1940(this.f6303, this.f6302, this.f6301, false);
        }
    }

    /* renamed from: 鷭 */
    static void m1940(int i, int i2, int i3, boolean z) {
        C1919 r0;
        C0520le leVar = (C0520le) C1014.f6137.f1637.get(i);
        if (leVar == null) {
            r0 = null;
        } else {
            r0 = C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null;
        }
        C1919 r1 = r0;
        if (r0 != null) {
            r1.f8635 = i2;
            r1.f8647 = i3;
            C0540lv r3 = C1014.f6142.mo3978(i);
            if (i3 > 0) {
                r3.mo4005(z);
            } else {
                r3.f1731 = null;
            }
        }
    }
}
