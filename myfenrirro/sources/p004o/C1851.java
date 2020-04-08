package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.鮻 */
final class C1851 extends C0762sz {

    /* renamed from: 櫯 */
    short f8441;

    /* renamed from: 鷭 */
    int f8442;

    C1851() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        C1919 r0;
        this.f4671 = 328;
        this.f8442 = byteBuffer.getInt();
        this.f8441 = byteBuffer.getShort();
        if (!z) {
            C0520le leVar = (C0520le) C1014.f6137.f1637.get(this.f8442);
            if (leVar == null) {
                r0 = null;
            } else {
                r0 = C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null;
            }
            C1919 r5 = r0;
            if (r0 != null) {
                r5.mo4580(false);
                C0540lv r52 = C1014.f6142.mo3978(this.f8442);
                if (r52 != null) {
                    C0540lv lvVar = r52;
                    C0561mo moVar = C0561mo.STAND;
                    C0540lv lvVar2 = lvVar;
                    lvVar.mo4634(((C1720) lvVar.f8954).mo4468(moVar, lvVar2.f1776), System.currentTimeMillis());
                    lvVar2.f1772 = moVar;
                    lvVar2.mo3991();
                }
            }
        }
    }
}
