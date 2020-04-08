package p004o;

import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;

/* renamed from: o.ɟ */
final class C1139 extends C0762sz {
    C1139() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 737;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        int i6 = byteBuffer.getInt();
        int i7 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        byte b = byteBuffer.get();
        int i8 = byteBuffer.getInt();
        if (!z) {
            m1897(i3, i4, i5, i6, i7, s, b, i8);
        }
    }

    /* renamed from: 鷭 */
    static void m1897(int i, int i2, int i3, int i4, int i5, short s, byte b, int i6) {
        C0520le leVar = (C0520le) C1014.f6137.f1637.get(i);
        C0520le leVar2 = (C0520le) C1014.f6137.f1637.get(i2);
        if (b < 0 || b >= C0583nj.values().length) {
            b = 0;
        }
        C0583nj njVar = C0583nj.values()[b];
        if (njVar != C0583nj.ITEMPICKUP) {
            if (njVar == C0583nj.SIT || njVar == C0583nj.STAND) {
                if (njVar == C0583nj.SIT) {
                    if (leVar != null && leVar.f1629 == C0587nn.PC) {
                        ((C0206bb) leVar).f458 = true;
                    }
                } else if (njVar != C0583nj.STAND) {
                    C0592ns.m674("Unsupported damage type: " + C0583nj.values()[b]);
                } else if (leVar != null && leVar.f1629 == C0587nn.PC) {
                    ((C0206bb) leVar).f458 = false;
                }
            } else if (leVar != null && leVar2 != null) {
                C0520le leVar3 = leVar;
                if ((C1919.class.isAssignableFrom(leVar3.getClass()) ? leVar3 : null) != null) {
                    C0520le leVar4 = leVar2;
                    if ((C1919.class.isAssignableFrom(leVar4.getClass()) ? leVar4 : null) != null) {
                        C1919 r25 = (C1919) leVar;
                        r25.mo4579(leVar2, i3, i4, i5, s, i6);
                        long currentTimeMillis = System.currentTimeMillis();
                        C0540lv lvVar = (C0540lv) C1014.f6142.f1680.f1189.get(Integer.valueOf(leVar2.f1630));
                        C0540lv lvVar2 = (C0540lv) C1014.f6142.f1680.f1189.get(Integer.valueOf(leVar.f1630));
                        C0540lv lvVar3 = lvVar2;
                        C0561mo r14 = lvVar2.mo3998(C1014.f6158.f674);
                        lvVar2.mo4634(((C1720) lvVar2.f8954).mo4468(r14, lvVar2.f1776), System.currentTimeMillis());
                        lvVar2.f1772 = r14;
                        lvVar2.mo3991();
                        int i7 = 0;
                        if (i3 > 0) {
                            i7 = lvVar3.mo3996(i3, false);
                        }
                        if (i5 > 0) {
                            c_activity c_activity = C1014.f6147;
                            C1372 r1 = new C1372(i5, lvVar, currentTimeMillis, i6, njVar, i4, leVar, lvVar3, r25);
                            long j = (long) i7;
                            c_activity c_activity2 = c_activity;
                            if (c_activity.f56 != null) {
                                c_activity2.f56.postDelayed(new C1348(c_activity2, r1), j);
                            }
                        }
                    }
                }
            }
        } else if (leVar == null || leVar2 == null) {
            C0592ns.m674("Src/Dst == null");
        } else {
            C0520le leVar5 = leVar;
            C1919 r252 = C1919.class.isAssignableFrom(leVar5.getClass()) ? leVar5 : null;
            if (r252 == null) {
                C0592ns.m674("src is not creature");
                return;
            }
            C0520le leVar6 = leVar2;
            C1645 r15 = C1645.class.isAssignableFrom(leVar6.getClass()) ? leVar6 : null;
            if (r15 == null) {
                C0592ns.m674("dst is not floor item");
                return;
            }
            r252.mo4578(leVar2);
            C1014 r0 = C1014.f6161;
            C1014.m1839(leVar2.f1630);
            C0540lv r16 = C1014.f6142.mo3978(i);
            r252.f8642 = null;
            C0561mo moVar = C0561mo.PICK;
            C0540lv lvVar4 = r16;
            r16.mo4634(((C1720) r16.f8954).mo4468(moVar, lvVar4.f1776), System.currentTimeMillis());
            lvVar4.f1772 = moVar;
            lvVar4.mo3991();
            C1014.f6158.f674.f608.mo4465(r15.f1633);
        }
    }
}
