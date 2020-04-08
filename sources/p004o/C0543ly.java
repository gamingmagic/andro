package p004o;

import android.graphics.Point;
import android.support.p000v4.view.ViewCompat;
import com.roworkshop.andro.c_point;
import p004o.C0412hn.C0413;

/* renamed from: o.ly */
class C0543ly extends C0540lv {

    /* renamed from: ģ */
    C1301 f1741;

    /* renamed from: Ĥ */
    C0544 f1742;

    /* renamed from: o.ly$鷭 */
    class C0544 extends C0236cc {

        /* renamed from: ˮ͍ */
        long f1744 = System.currentTimeMillis();

        /* renamed from: 岱 */
        long f1745;

        C0544(int i) {
            super(C0543ly.this, 0, 100, C0540lv.f1719, C0540lv.f1724, ViewCompat.MEASURED_STATE_MASK, -16711936, ViewCompat.MEASURED_STATE_MASK);
            this.f1745 = System.currentTimeMillis() + (((long) i) * 1000);
        }
    }

    @Deprecated
    C0543ly() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4000(C0520le leVar) {
        super.mo4000(leVar);
        this.f1741 = (C1301) leVar;
        mo4005(false);
        this.f1726 = new C0236cc(this, this.f1741.f8653, this.f1741.f8645, C0540lv.f1721, new c_point(C0540lv.f1720.x, (C0540lv.f1720.y - C0540lv.f1721.y) + ((int) C0236cc.f553)), f1712, f1713, f1722);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4008(c_point c_point) {
        byte r12 = C1919.m2591(new Point(c_point.x - this.f1741.f1634, c_point.y - this.f1741.f1631));
        if (r12 != -1) {
            if (this.f1741.f8639 < 0) {
                C1301 r0 = this.f1741;
                r0.f8639 = (byte) (r0.f8639 + 8);
            }
            C0413 r4 = C0413.values()[r12];
            C0413 r5 = C0413.values()[this.f1741.f8639];
            C0413 r6 = r4;
            C0413 r7 = r5;
            short s = this.f1741.f459;
            int i = 0;
            while (r7 != r4 && r5 != r4) {
                r7 = r7 == C0413.NUM9 ? C0413.NUM8 : C0413.values()[r7.ordinal() + 1];
                r5 = r5 == C0413.NUM8 ? C0413.NUM9 : C0413.values()[r5.ordinal() - 1];
                i++;
            }
            if (r7 == r4 && r5 == r4) {
                s = 0;
            } else if (r7 == r4) {
                if (s == 2 && i == 1) {
                    s = 0;
                } else {
                    s = 2;
                    r6 = r4 == C0413.NUM8 ? C0413.NUM9 : C0413.values()[r4.ordinal() - 1];
                }
            } else if (r5 == r4) {
                if (s == 1) {
                    s = 0;
                } else {
                    s = 1;
                    r6 = r4 == C0413.NUM9 ? C0413.NUM8 : C0413.values()[r4.ordinal() + 1];
                }
            }
            if (!(this.f1741.f8639 == r6.ordinal() && this.f1741.f459 == ((short) s))) {
                this.f1741.f8639 = (byte) r6.ordinal();
                this.f1741.f459 = (short) s;
                C1014.f6144.mo3652((C0839ue) new C1036(s, r12));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final boolean mo4010(int i, int i2, int i3, int i4, int i5, int i6) {
        if (C0593nt.m677(this.f1741.f1634 - i2, this.f1741.f1631 - i3, (this.f1732.f8642 != null ? 1 : 0) + i4)) {
            return false;
        }
        C1014.f6144.mo3652((C0839ue) new C1093((short) i2, (short) i3));
        this.f1741.mo4575(i, i2, i3, i4, i5, i6);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4009(C0548mb mbVar, C1924 r15) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        if (mbVar != null) {
            if (r15 == null) {
                C1014.f6142.mo3981(mbVar, true);
                C1014.f6137.f1636.f8649 = null;
            }
            if (r15 != null) {
                i = r15.f8699;
                i2 = r15.f8702;
                i3 = r15.f8700;
            } else if (C1014.f6147.f51.f1457 != null) {
                i = C1014.f6147.f51.f1457.f1053;
                i2 = C1014.f6147.f51.f1457.f1048;
                i3 = C1014.f6147.f51.f1457.f1051;
            }
            C0252cp cpVar = C1014.f6158;
            C0587nn r10 = C0522lg.m563(mbVar.f1769.f1633);
            if (mbVar.f1769.f1629 == C0587nn.ITEM) {
                C0548mb mbVar2 = mbVar;
                if (!mo4010(mbVar.f1769.f1630, mbVar2.f1769.f1634, mbVar2.f1769.f1631, 1, 0, 0)) {
                    mo4008(new c_point(mbVar.f1769.f1634, mbVar.f1769.f1631));
                    C1014.f6144.mo3652((C0839ue) new C1791(mbVar.f1769.f1630));
                } else {
                    return;
                }
            } else if (C1014.f6137.f1636.f6547 != null && C1014.f6137.f1636.f6547.f6581.f6595 == mbVar.f1769.f1630) {
                C1014.f6147.f51.mo3862();
                return;
            } else if (C1014.f6137.f1636.f6524 != null && C1014.f6137.f1636.f6524.f6567.f6595 == mbVar.f1769.f1630 && i == 0) {
                C1014.f6147.f51.mo3866();
                return;
            } else if (C1014.f6137.f1636.f6538 != null && C1014.f6137.f1636.f6538.f6567.f6595 == mbVar.f1769.f1630 && i == 0) {
                C1014.f6147.f51.mo3868();
                return;
            } else {
                if (r10 != C0587nn.MOB) {
                    C0520le leVar = mbVar.f1769;
                    if (!(C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null).mo4581()) {
                        if (r10.mo4024()) {
                            if (i == 0) {
                                mo4008(new c_point(mbVar.f1769.f1634, mbVar.f1769.f1631));
                            } else if ((r15 != null || C1014.f6147.f51.f1457 == null || C1014.f6147.f51.f1457.f1053 != i || m632(C1014.f6147.f51.f1457, mbVar)) && !mo4010(mbVar.f1769.f1630, mbVar.f1769.f1634, mbVar.f1769.f1631, i2, i, i3)) {
                                C1014.f6144.mo3652((C0839ue) new C1085(C1014.f6147.f51.f1457.f1053, C1014.f6147.f51.f1457.f1051, mbVar.f1769.f1630));
                            } else {
                                return;
                            }
                        } else if (r10 == C0587nn.NPC) {
                            if (this.f1741.f8642 == null) {
                                mo4008(new c_point(mbVar.f1769.f1634, mbVar.f1769.f1631));
                                C0520le leVar2 = mbVar.f1769;
                                if ((C1919.class.isAssignableFrom(leVar2.getClass()) ? leVar2 : null) != null) {
                                    C1018 r0 = C1014.f6141;
                                    C0520le leVar3 = mbVar.f1769;
                                    r0.f6184 = (C1919.class.isAssignableFrom(leVar3.getClass()) ? leVar3 : null).f8657;
                                }
                                C1014.f6144.mo3652((C0839ue) new C1049(mbVar.f1769.f1630));
                            } else {
                                return;
                            }
                        }
                    }
                }
                if (i != 0) {
                    if ((r15 == null && C1014.f6147.f51.f1457 != null && C1014.f6147.f51.f1457.f1053 == i && !m632(C1014.f6147.f51.f1457, mbVar)) || mo4010(mbVar.f1769.f1630, mbVar.f1769.f1634, mbVar.f1769.f1631, i2, i, i3)) {
                        return;
                    }
                    if (i == 297 && i3 == 0) {
                        C1014.f6158.mo3387((Runnable) new C0414ho(C1014.f6142.f1680, mbVar.f1769.f1630));
                    } else {
                        C1014.f6144.mo3652((C0839ue) new C1085(i, i3, mbVar.f1769.f1630));
                    }
                } else if (C1014.f6137.f1636.f6524 != null && C1014.f6147.f51.f1449) {
                    C1014.f6137.f1636.f6524.f6560 = C0568mv.ATTACK_OBJECT_CMD;
                    C1014.f6137.f1636.f6524.f6571 = mbVar.f1769.f1630;
                    C2045 r02 = C1014.f6158.f674.f620;
                    C0587nn nnVar = C0587nn.HOM;
                    C0521lf lfVar = C1014.f6137;
                    r02.mo4635(nnVar);
                } else if (C1014.f6137.f1636.f6538 == null || !C1014.f6147.f51.f1440) {
                    C1014.f6144.mo3652((C0839ue) new C1511(mbVar.f1769.f1630, C0563mq.ATTACK_CONTINUOUS));
                } else {
                    C1014.f6137.f1636.f6538.f6560 = C0568mv.ATTACK_OBJECT_CMD;
                    C1014.f6137.f1636.f6538.f6571 = mbVar.f1769.f1630;
                    C2045 r03 = C1014.f6158.f674.f620;
                    C0587nn nnVar2 = C0587nn.MER;
                    C0521lf lfVar2 = C1014.f6137;
                    r03.mo4635(nnVar2);
                }
            }
            if (!(i == 0 || C1014.f6147.f51.f1457 == null || C1014.f6147.f51.f1457.f1053 != i)) {
                if (((C0377gm) C1014.f6137.f1636.f6548.f6579.get(Integer.valueOf(i))) == null) {
                    C0453ix ixVar = C1014.f6147.f51;
                    ixVar.f1457 = null;
                    ixVar.f1426.setVisibility(8);
                    ixVar.f1447.setVisibility(8);
                    ixVar.mo3864();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        if (p004o.C0595nv.f2872 != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0055, code lost:
        if (p004o.C0595nv.f2875 != false) goto L_0x0057;
     */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final boolean m632(p004o.C0377gm r3, p004o.C0548mb r4) {
        /*
            r2 = 0
            if (r4 == 0) goto L_0x0015
            java.lang.Class<o.lv> r2 = p004o.C0540lv.class
            java.lang.Class r0 = r4.getClass()
            boolean r0 = r2.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x0011
            r0 = r4
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            o.lv r0 = (p004o.C0540lv) r0
            r2 = r0
        L_0x0015:
            if (r2 != 0) goto L_0x0019
            r0 = 0
            return r0
        L_0x0019:
            o.둆 r0 = r2.f1732
            boolean r0 = r0.mo4581()
            if (r0 == 0) goto L_0x003d
            int r0 = r3.f1052
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r0 != 0) goto L_0x003b
            int r0 = r3.f1052
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            if (r0 == 0) goto L_0x0059
            boolean r0 = p004o.C0595nv.f2872
            if (r0 == 0) goto L_0x0059
        L_0x003b:
            r0 = 1
            return r0
        L_0x003d:
            int r0 = r3.f1052
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0045
            r0 = 1
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 != 0) goto L_0x0057
            int r0 = r3.f1052
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0050
            r0 = 1
            goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            if (r0 == 0) goto L_0x0059
            boolean r0 = p004o.C0595nv.f2875
            if (r0 == 0) goto L_0x0059
        L_0x0057:
            r0 = 1
            return r0
        L_0x0059:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0543ly.m632(o.gm, o.mb):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ȃ */
    public final void mo3992(long j) {
        if (this.f1742 != null) {
            if (j > this.f1742.f1745) {
                this.f1742 = null;
                C1014.f6144.mo3652((C0839ue) new C1622());
            } else {
                this.f1742.mo3592((int) (j - this.f1742.f1744), (int) (this.f1742.f1745 - this.f1742.f1744));
            }
        }
        super.mo3992(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ą */
    public final void mo3985() {
        super.mo3985();
        if (this.f1742 != null) {
            this.f1742.mo3591();
        }
    }
}
