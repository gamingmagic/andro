package p004o;

import java.nio.ByteBuffer;
import p004o.C0638pa.C0640;

/* renamed from: o.ᥲ */
final class C1371 extends C0762sz {
    C1371() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 282;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        if (!z) {
            m2076(s, s2, i3, i4, b);
        }
    }

    /* renamed from: 鷭 */
    static void m2076(short s, short s2, int i, int i2, byte b) {
        C1919 r0;
        C0520le leVar = (C0520le) C1014.f6137.f1637.get(i2);
        if (leVar == null) {
            r0 = null;
        } else {
            r0 = C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null;
        }
        C1919 r8 = r0;
        if (((C0520le) C1014.f6137.f1637.get(i)) != null) {
        }
        if (b != 0) {
            C0540lv r13 = C1014.f6142.mo3978(i2);
            if (r8 != null) {
                r8.mo4576(s, 1, i, 0, 0, s2, 0);
                if (!(r13 == null || r13.f1769.f1629 == C0587nn.MOB)) {
                    if (!(s == 51 || s == 135 || s == 389)) {
                        C0381gq gqVar = (C0381gq) C1014.f6158.f674.f609.f1055.get(Integer.valueOf(s));
                        r13.mo3999(new StringBuilder(String.valueOf(gqVar != null ? gqVar.f1071 : "Unknown Skill")).append(" !!").toString(), -1);
                    }
                    r13.f1734 = null;
                    C0561mo moVar = C0561mo.CAST;
                    C0540lv lvVar = r13;
                    r13.mo4634(((C1720) r13.f8954).mo4468(moVar, lvVar.f1776), System.currentTimeMillis());
                    lvVar.f1772 = moVar;
                    lvVar.mo3991();
                    r13.f8951 = C2043.LOOP_ONCE;
                }
            }
            C0540lv r12 = C1014.f6142.mo3978(i);
            C0640 r14 = C0638pa.f4231[s];
            if (!(r14 == null || r14.f4238 == null)) {
                C1014.f6158.mo3387((Runnable) new C1748(r14, r13, r12));
            }
            if (s2 > 0) {
                switch (s) {
                    case 9:
                        if (r12 != null) {
                            C1014.f6142.f1680.f1187.add(new C1632(s2, r12, System.currentTimeMillis(), C0570mx.SP_HEAL));
                            break;
                        }
                        break;
                    case 28:
                    case 70:
                    case 322:
                    case 2051:
                        if (r12 != null) {
                            C1014.f6142.f1680.f1187.add(new C1632(s2, r12, System.currentTimeMillis(), C0570mx.HEAL));
                            return;
                        }
                        break;
                }
            }
        }
    }
}
