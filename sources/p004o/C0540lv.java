package p004o;

import android.widget.RelativeLayout;
import com.roworkshop.andro.c_activity;
import com.roworkshop.andro.c_point;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import p004o.C0766tb.C0768;

/* renamed from: o.lv */
public class C0540lv extends C0548mb {

    /* renamed from: Ę */
    protected static final int f1712 = C0621os.m717(16, 24, 156, 255);

    /* renamed from: ę */
    protected static final int f1713 = C0621os.m717(24, 99, NNTPReply.ARTICLE_RETRIEVED_BODY_FOLLOWS, 255);

    /* renamed from: ġ */
    static final c_point f1714 = new c_point(f1718.x, (f1718.y - f1721.y) + ((int) C0236cc.f553));

    /* renamed from: Ĥ */
    private static final int f1715 = C0621os.m717(16, TelnetCommand.EOR, 33, 255);

    /* renamed from: Į */
    private static C2040[] f1716 = {new C2040(null, C1570.WIZARD, C1977.MALE, new C1688[]{C1688.ROD, C1688.NONE}, null), new C2040(null, C1570.WIZARD, C1977.FEMALE, null, new C1688[]{C1688.ROD}), new C2040(null, C1570.SAGE, new C1688[]{C1688.NONE, C1688.SHORTSWORD}, null), new C2040(null, C1570.HUNTER, null, new C1688[]{C1688.BOW}), new C2040(null, C1570.BARDDANCER, null, new C1688[]{C1688.BOW}), new C2040(null, C1570.PRIEST, null, new C1688[]{C1688.BOOK}), new C2040(null, C1570.MONK, null, new C1688[]{C1688.KNUKLE, C1688.NONE}), new C2040(null, C1570.BLACKSMITH, null, new C1688[]{C1688.MACE, C1688.SWORD, C1688.AXE}), new C2040(null, C1570.ALCHEMIST, null, new C1688[]{C1688.MACE, C1688.SWORD, C1688.AXE}), new C2040(null, C1570.ASSASSIN, null, new C1688[]{C1688.CATARRH, C1688.SHORTSWORD_SHORTSWORD, C1688.SHORTSWORD_AXE, C1688.SHORTSWORD_SWORD, C1688.SWORD_AXE, C1688.SWORD_SWORD, C1688.AXE_AXE}), new C2040(null, C1570.SOUL_LINKER, C1977.MALE, null, new C1688[]{C1688.SHORTSWORD}), new C2040(null, C1570.SOUL_LINKER, C1977.FEMALE, null, new C1688[]{C1688.ROD}), new C2040(C1570.NOVICE, null, C1977.MALE, new C1688[]{C1688.NONE, C1688.SHORTSWORD}, null), new C2040(C1570.NOVICE, null, C1977.FEMALE, null, new C1688[]{C1688.SHORTSWORD}), new C2040(C1570.SWORDMAN, null, null, new C1688[]{C1688.SPEAR, C1688.TWOHANDSPEAR}), new C2040(C1570.THIEF, null, new C1688[]{C1688.BOW}), new C2040(C1570.MAGE, new C1688[]{C1688.ROD, C1688.BOOK, C1688.NONE}, null), new C2040(C1570.ARCHER, null, new C1688[]{C1688.SHORTSWORD, C1688.NONE}), new C2040(C1570.MERCHANT, null, new C1688[]{C1688.SHORTSWORD}), new C2040(C1570.NINJA, null, new C1688[]{C1688.WPCLASS_SYURIKEN}), new C2040(C1570.GUNSLINGER, new C1688[]{C1688.NONE, C1688.WPCLASS_GUN_HANDGUN}, null)};

    /* renamed from: į */
    private static /* synthetic */ int[] f1717;

    /* renamed from: Ƞ */
    static final c_point f1718 = new c_point(f1720.x, (f1720.y - f1721.y) + ((int) C0236cc.f553));

    /* renamed from: ঽ্ */
    static final c_point f1719 = new c_point((int) ((((float) C1014.f6147.getResources().getDisplayMetrics().densityDpi) / 160.0f) * 40.0f), (int) ((((float) C1014.f6147.getResources().getDisplayMetrics().densityDpi) / 160.0f) * 5.0f));

    /* renamed from: 㱽 */
    static final c_point f1720 = new c_point(0, -20);

    /* renamed from: 㵼 */
    static final c_point f1721 = new c_point((int) ((((float) C1014.f6147.getResources().getDisplayMetrics().densityDpi) / 160.0f) * 40.0f), (int) ((((float) C1014.f6147.getResources().getDisplayMetrics().densityDpi) / 160.0f) * 4.0f));

    /* renamed from: 囃 */
    protected static final int f1722 = C0621os.m717(66, 66, 66, 255);

    /* renamed from: 廂 */
    protected static final int f1723 = C0621os.m717(255, 255, 255, 255);

    /* renamed from: 廅 */
    static final c_point f1724 = new c_point(0, (int) ((((float) C1014.f6147.getResources().getDisplayMetrics().densityDpi) / 160.0f) * 45.0f));

    /* renamed from: 瞣 */
    private static /* synthetic */ int[] f1725;

    /* renamed from: ċ */
    C0236cc f1726;

    /* renamed from: ē */
    C0236cc f1727;

    /* renamed from: Ė */
    C0955y f1728;

    /* renamed from: ė */
    C0552mf f1729;

    /* renamed from: ģ */
    private C0177ad f1730;

    /* renamed from: Ȋ */
    C0236cc f1731;

    /* renamed from: ܨ */
    C1919 f1732;

    /* renamed from: 㥳 */
    C1563 f1733;

    /* renamed from: 纫 */
    C0236cc f1734;

    /* renamed from: 띥 */
    C1578 f1735;

    /* renamed from: 鷭 */
    public final /* bridge */ /* synthetic */ void mo4003(C0626ox oxVar) {
        super.mo4003(oxVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(36:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|(2:36|37)|38|40) */
    /* JADX WARNING: Can't wrap try/catch for region: R(37:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0042 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0058 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0063 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0079 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0083 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x008d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0097 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00a1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00ac */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00b6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0017 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0022 */
    /* renamed from: 䒧 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m610() {
        /*
            int[] r0 = f1717
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.mo[] r0 = p004o.C0561mo.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.mo r0 = p004o.C0561mo.ATK1     // Catch:{ NoSuchFieldError -> 0x0017 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
            r1 = 11
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0017 }
        L_0x0017:
            o.mo r0 = p004o.C0561mo.ATK2     // Catch:{ NoSuchFieldError -> 0x0022 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
            r1 = 12
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0022 }
        L_0x0022:
            o.mo r0 = p004o.C0561mo.BATTLESTANCE     // Catch:{ NoSuchFieldError -> 0x002c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002c }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002c }
        L_0x002c:
            o.mo r0 = p004o.C0561mo.CAST     // Catch:{ NoSuchFieldError -> 0x0037 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0037 }
            r1 = 13
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0037 }
        L_0x0037:
            o.mo r0 = p004o.C0561mo.COOLSTANCE     // Catch:{ NoSuchFieldError -> 0x0042 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0042 }
            r1 = 10
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0042 }
        L_0x0042:
            o.mo r0 = p004o.C0561mo.DEAD     // Catch:{ NoSuchFieldError -> 0x004d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
            r1 = 9
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x004d }
        L_0x004d:
            o.mo r0 = p004o.C0561mo.PERFORMANCE1     // Catch:{ NoSuchFieldError -> 0x0058 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
            r1 = 14
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0058 }
        L_0x0058:
            o.mo r0 = p004o.C0561mo.PERFORMANCE2     // Catch:{ NoSuchFieldError -> 0x0063 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
            r1 = 15
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0063 }
        L_0x0063:
            o.mo r0 = p004o.C0561mo.PERFORMANCE3     // Catch:{ NoSuchFieldError -> 0x006e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
            r1 = 16
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x006e }
        L_0x006e:
            o.mo r0 = p004o.C0561mo.PERFORMANCE4     // Catch:{ NoSuchFieldError -> 0x0079 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
            r1 = 17
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0079 }
        L_0x0079:
            o.mo r0 = p004o.C0561mo.PICK     // Catch:{ NoSuchFieldError -> 0x0083 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0083 }
        L_0x0083:
            o.mo r0 = p004o.C0561mo.SHOOT     // Catch:{ NoSuchFieldError -> 0x008d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x008d }
        L_0x008d:
            o.mo r0 = p004o.C0561mo.SIT     // Catch:{ NoSuchFieldError -> 0x0097 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0097 }
        L_0x0097:
            o.mo r0 = p004o.C0561mo.STAND     // Catch:{ NoSuchFieldError -> 0x00a1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a1 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00a1 }
        L_0x00a1:
            o.mo r0 = p004o.C0561mo.STATICDAMAGE     // Catch:{ NoSuchFieldError -> 0x00ac }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ac }
            r1 = 8
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00ac }
        L_0x00ac:
            o.mo r0 = p004o.C0561mo.TAKEDAMAGE     // Catch:{ NoSuchFieldError -> 0x00b6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b6 }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00b6 }
        L_0x00b6:
            o.mo r0 = p004o.C0561mo.WALK     // Catch:{ NoSuchFieldError -> 0x00c0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00c0 }
        L_0x00c0:
            f1717 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0540lv.m610():int[]");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:3|4|5|6|7|(2:8|9)|10|12) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: 躆 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m612() {
        /*
            int[] r0 = f1725
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.둆$櫯[] r0 = p004o.C1919.C1925.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.둆$櫯 r0 = p004o.C1919.C1925.FINISHED_WALKING     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.둆$櫯 r0 = p004o.C1919.C1925.POSITION_CHANGED     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.둆$櫯 r0 = p004o.C1919.C1925.POSITION_UNCHANGED     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            f1725 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0540lv.m612():int[]");
    }

    static {
    }

    @Deprecated
    C0540lv() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public void mo4000(C0520le leVar) {
        super.mo4000(leVar);
        mo3991();
        this.f1732 = C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null;
        if (this.f1732.f8647 > 0) {
            if (C1014.f6137.f1636 == null || C1014.f6137.f1636.f6502 == null || C1014.f6137.f1636.f6502.mo3533(this.f1732.f1630) < 0) {
                mo4005(true);
            } else {
                mo4005(false);
            }
        }
        C1919 r4 = this.f1732;
        if (r4.f8640.containsKey(C0586nm.ON_PUSH_CART) || (r4.f8646 & 1928) > 0) {
            mo3994(this.f1732.f8641, true);
        }
        mo3989();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C0561mo mo3998(C0247ck ckVar) {
        C0252cp cpVar = C1014.f6158;
        if (C0522lg.m563(this.f1769.f1633) != C0587nn.PC) {
            return C0561mo.ATK1;
        }
        C0520le leVar = this.f1769;
        C0206bb bbVar = C0206bb.class.isAssignableFrom(leVar.getClass()) ? leVar : null;
        C1570 r5 = C1570.m2254(C1761.m2430(this.f1769.f1633).mo4502().f7485 & 4095);
        C1570 r6 = C1570.m2254(C1761.m2430(this.f1769.f1633).mo4502().f7485 & 255);
        C1688 r12 = ckVar.mo3612(bbVar.f461, bbVar.f457);
        if (r12 == null) {
            return C0561mo.ATK1;
        }
        if (bbVar.f1633 == C1761.TAEKWON.f8294 || bbVar.f1633 == C1761.STAR_GLADIATOR.f8294) {
            return Math.random() > 0.5d ? C0561mo.ATK1 : C0561mo.ATK2;
        }
        C2040[] r10 = f1716;
        int length = r10.length;
        for (int i = 0; i < length; i++) {
            C2040 r7 = r10[i];
            if ((r7.f8940 == null || r5 == r7.f8940) && ((r7.f8941 == null || r6 == r7.f8941) && (r7.f8939 == null || r7.f8939.ordinal() == bbVar.f446))) {
                boolean z = r7.f8938 != null;
                for (C1688 r0 : z ? r7.f8938 : r7.f8937) {
                    if (r0 == r12) {
                        return z ? C0561mo.ATK1 : C0561mo.ATK2;
                    }
                }
                return z ? C0561mo.ATK2 : C0561mo.ATK1;
            }
        }
        return C0561mo.ATK1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final int mo3996(int i, boolean z) {
        C0768 r3 = mo4631();
        float f = (r3 == null || r3.f4691 == 0.0f) ? 96.0f : r3.f4691 * 24.0f;
        C0252cp cpVar = C1014.f6158;
        C0587nn r5 = C0522lg.m563(this.f1769.f1633);
        char c = 0;
        float f2 = 6.0f;
        if (r5 == C0587nn.PC) {
            C0520le leVar = this.f1769;
            C0206bb bbVar = C0206bb.class.isAssignableFrom(leVar.getClass()) ? leVar : null;
            C1688 r32 = C1014.f6158.f674.mo3612(bbVar.f461, bbVar.f457);
            if (r32 == C1688.BOW) {
                c = 2;
            } else if (r32 == C1688.INSTRUMENT || r32 == C1688.WHIP) {
                c = 1;
            }
        } else if (r5 == C0587nn.MOB) {
            f2 = (float) (r3.f4693 > 0 ? r3.f4693 : 6);
        }
        if (i <= 0) {
            i = 1;
        }
        if (c < 2 && i > 432) {
            i = 432;
        }
        float f3 = f2 * ((float) i) * 0.0023148148f * f;
        this.f8946 = (long) ((int) f3);
        if (!z && c > 0) {
            f3 += 192.0f;
        }
        return (int) f3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4005(boolean z) {
        C0520le leVar = this.f1769;
        C1919 r0 = C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null;
        C1919 r9 = r0;
        if (r0 != null) {
            if (r9.f8647 <= 0) {
                this.f1731 = null;
            } else if (z && !C0595nv.f2861) {
            } else {
                if (this.f1731 == null || ((z && this.f1731.f555 != -65400) || (!z && this.f1731.f555 == -65400))) {
                    this.f1731 = new C0236cc(this, r9.f8635, r9.f8647, f1721, f1720, f1712, z ? -65400 : f1715, f1722);
                } else {
                    this.f1731.mo3592(r9.f8635, r9.f8647);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4004(C1305 r10) {
        if (r10.f6590 == null) {
            this.f1727 = null;
            this.f1731 = null;
            this.f1726 = null;
        } else if (this.f1727 == null) {
            this.f1727 = new C0236cc(this, r10.f6587, r10.f6588, f1721, f1714, f1712, f1723, f1722);
        } else {
            this.f1727.mo3592(r10.f6587, r10.f6588);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo3995(C1305 r10) {
        if (r10.f6590 == C0587nn.HOM || r10.f6590 == C0587nn.MER) {
            if (this.f1731 == null) {
                this.f1731 = new C0236cc(this, r10.f6599, r10.f6597, f1721, f1720, f1712, f1715, f1722);
                return;
            }
            this.f1731.mo3592(r10.f6599, r10.f6597);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final void mo3993(C1305 r10) {
        if (r10.f6590 == C0587nn.HOM || r10.f6590 == C0587nn.MER) {
            if (this.f1726 == null) {
                this.f1726 = new C0236cc(this, r10.f6594, r10.f6592, f1721, f1718, f1712, f1713, f1722);
                return;
            }
            this.f1726.mo3592(r10.f6594, r10.f6592);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ą */
    public void mo3985() {
        super.mo3985();
        if (this.f1731 != null) {
            this.f1731.mo3591();
        }
        if (this.f1726 != null) {
            this.f1726.mo3591();
        }
        if (this.f1734 != null) {
            this.f1734.mo3591();
        }
        if (this.f1727 != null) {
            this.f1727.mo3591();
        }
        if (this.f1730 != null) {
            this.f1730.mo3512();
        }
        if (this.f1728 != null) {
            this.f1728.mo4154();
        }
        if (this.f1735 != null) {
            this.f1735.mo3985();
        }
        if (this.f1733 != null) {
            this.f1733.mo3985();
        }
        if (this.f1729 != null) {
            this.f1729.mo3985();
        }
        if (this.f1777 != null) {
            this.f1777.mo3985();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3999(String str, int i) {
        if (this.f1730 == null) {
            this.f1730 = new C0177ad(this, str, i, 5000);
        } else {
            this.f1730.mo3513(str, i);
        }
    }

    /* renamed from: 纫 */
    private void m611() {
        if (this.f1730 != null) {
            C0177ad adVar = this.f1730;
            if (adVar.f337 != null) {
                c_activity c_activity = C1014.f6147;
                RelativeLayout relativeLayout = adVar.f337;
                if (!(relativeLayout == null || C1014.f6147.f51 == null || C1014.f6147.f51.f1412 == null)) {
                    C1014.f6147.f51.f1412.removeView(relativeLayout);
                }
                adVar.f337 = null;
            }
            this.f1730 = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ą */
    public final void mo3989() {
        if (this.f1732.f8634 >= 0) {
            this.f1733 = null;
        } else if (this.f1733 == null) {
            this.f1733 = new C1563(this);
        }
    }

    /* renamed from: 櫯 */
    public final void mo3994(int i, boolean z) {
        if (this.f1729 == null || this.f1729.f1787 != i || z) {
            this.f1729 = new C0552mf(this, i);
        }
        this.f1732.f8641 = i;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 290 */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x05ed  */
    /* renamed from: ȃ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3992(long r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            boolean r0 = r0.mo4630(r1)
            if (r0 == 0) goto L_0x0073
            int[] r0 = m610()
            r1 = r26
            o.mo r1 = r1.f1772
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 4: goto L_0x0055;
                case 5: goto L_0x0073;
                case 6: goto L_0x0073;
                case 7: goto L_0x0036;
                case 8: goto L_0x0073;
                case 9: goto L_0x0073;
                case 10: goto L_0x0073;
                case 11: goto L_0x0036;
                case 12: goto L_0x0036;
                case 13: goto L_0x0055;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x0073
        L_0x0036:
            o.mo r12 = p004o.C0561mo.BATTLESTANCE
            r9 = r26
            r0 = r26
            o.hl r0 = r0.f8954
            o.窆 r0 = (p004o.C1720) r0
            o.mp r1 = r9.f1776
            int r0 = r0.mo4468(r12, r1)
            long r1 = java.lang.System.currentTimeMillis()
            r3 = r26
            r3.mo4634(r0, r1)
            r9.f1772 = r12
            r9.mo3991()
            goto L_0x0073
        L_0x0055:
            o.mo r12 = p004o.C0561mo.STAND
            r9 = r26
            r0 = r26
            o.hl r0 = r0.f8954
            o.窆 r0 = (p004o.C1720) r0
            o.mp r1 = r9.f1776
            int r0 = r0.mo4468(r12, r1)
            long r1 = java.lang.System.currentTimeMillis()
            r3 = r26
            r3.mo4634(r0, r1)
            r9.f1772 = r12
            r9.mo3991()
        L_0x0073:
            o.cp r0 = p004o.C1014.f6158
            r0 = r26
            o.둆 r0 = r0.f1732
            int r0 = r0.f1633
            o.nn r9 = p004o.C0522lg.m563(r0)
            r0 = r26
            o.둆 r0 = r0.f1732
            boolean r0 = r0.f8660
            if (r0 == 0) goto L_0x00b6
            r0 = r26
            o.mo r0 = r0.f1772
            o.mo r1 = p004o.C0561mo.DEAD
            if (r0 == r1) goto L_0x00b6
            o.mo r12 = p004o.C0561mo.DEAD
            r9 = r26
            r0 = r26
            o.hl r0 = r0.f8954
            o.窆 r0 = (p004o.C1720) r0
            o.mp r1 = r9.f1776
            int r0 = r0.mo4468(r12, r1)
            long r1 = java.lang.System.currentTimeMillis()
            r3 = r26
            r3.mo4634(r0, r1)
            r9.f1772 = r12
            r9.mo3991()
            r0 = r26
            r1 = 30
            r0.mo4632(r1)
            goto L_0x0230
        L_0x00b6:
            r0 = r26
            o.둆 r0 = r0.f1732
            boolean r0 = r0.f8660
            if (r0 != 0) goto L_0x00e6
            r0 = r26
            o.mo r0 = r0.f1772
            o.mo r1 = p004o.C0561mo.DEAD
            if (r0 != r1) goto L_0x00e6
            o.mo r12 = p004o.C0561mo.STAND
            r9 = r26
            r0 = r26
            o.hl r0 = r0.f8954
            o.窆 r0 = (p004o.C1720) r0
            o.mp r1 = r9.f1776
            int r0 = r0.mo4468(r12, r1)
            long r1 = java.lang.System.currentTimeMillis()
            r3 = r26
            r3.mo4634(r0, r1)
            r9.f1772 = r12
            r9.mo3991()
            goto L_0x0230
        L_0x00e6:
            o.nn r0 = p004o.C0587nn.PC
            if (r9 != r0) goto L_0x0126
            r0 = r26
            o.mo r0 = r0.f1772
            o.mo r1 = p004o.C0561mo.SIT
            if (r0 == r1) goto L_0x0126
            r0 = r26
            o.둆 r0 = r0.f1732
            o.nn r0 = r0.f1629
            o.nn r1 = p004o.C0587nn.PC
            if (r0 != r1) goto L_0x0126
            r0 = r26
            o.둆 r0 = r0.f1732
            o.bb r0 = (p004o.C0206bb) r0
            boolean r0 = r0.f458
            if (r0 == 0) goto L_0x0126
            o.mo r12 = p004o.C0561mo.SIT
            r9 = r26
            r0 = r26
            o.hl r0 = r0.f8954
            o.窆 r0 = (p004o.C1720) r0
            o.mp r1 = r9.f1776
            int r0 = r0.mo4468(r12, r1)
            long r1 = java.lang.System.currentTimeMillis()
            r3 = r26
            r3.mo4634(r0, r1)
            r9.f1772 = r12
            r9.mo3991()
            goto L_0x0230
        L_0x0126:
            o.nn r0 = p004o.C0587nn.PC
            if (r9 != r0) goto L_0x0166
            r0 = r26
            o.mo r0 = r0.f1772
            o.mo r1 = p004o.C0561mo.SIT
            if (r0 != r1) goto L_0x0166
            r0 = r26
            o.둆 r0 = r0.f1732
            o.nn r0 = r0.f1629
            o.nn r1 = p004o.C0587nn.PC
            if (r0 != r1) goto L_0x0166
            r0 = r26
            o.둆 r0 = r0.f1732
            o.bb r0 = (p004o.C0206bb) r0
            boolean r0 = r0.f458
            if (r0 != 0) goto L_0x0166
            o.mo r12 = p004o.C0561mo.STAND
            r9 = r26
            r0 = r26
            o.hl r0 = r0.f8954
            o.窆 r0 = (p004o.C1720) r0
            o.mp r1 = r9.f1776
            int r0 = r0.mo4468(r12, r1)
            long r1 = java.lang.System.currentTimeMillis()
            r3 = r26
            r3.mo4634(r0, r1)
            r9.f1772 = r12
            r9.mo3991()
            goto L_0x0230
        L_0x0166:
            r0 = r26
            o.둆 r0 = r0.f1732
            o.둆$Ć r0 = r0.f8642
            if (r0 == 0) goto L_0x0196
            r0 = r26
            o.mo r0 = r0.f1772
            o.mo r1 = p004o.C0561mo.WALK
            if (r0 == r1) goto L_0x0196
            o.mo r12 = p004o.C0561mo.WALK
            r9 = r26
            r0 = r26
            o.hl r0 = r0.f8954
            o.窆 r0 = (p004o.C1720) r0
            o.mp r1 = r9.f1776
            int r0 = r0.mo4468(r12, r1)
            long r1 = java.lang.System.currentTimeMillis()
            r3 = r26
            r3.mo4634(r0, r1)
            r9.f1772 = r12
            r9.mo3991()
            goto L_0x0230
        L_0x0196:
            r0 = r26
            o.둆 r0 = r0.f1732
            o.둆$Ą r0 = r0.f8655
            if (r0 == 0) goto L_0x0230
            r0 = r26
            o.cc r0 = r0.f1734
            if (r0 != 0) goto L_0x0230
            r0 = r26
            o.둆 r0 = r0.f1732
            o.둆$Ą r0 = r0.f8655
            long r0 = r0.f8677
            r2 = r26
            o.둆 r2 = r2.f1732
            o.둆$Ą r2 = r2.f8655
            long r2 = r2.f8678
            long r0 = r0 + r2
            int r0 = (r0 > r27 ? 1 : (r0 == r27 ? 0 : -1))
            if (r0 <= 0) goto L_0x0230
            o.cc r0 = new o.cc
            r1 = r26
            r2 = r26
            o.둆 r2 = r2.f1732
            o.둆$Ą r2 = r2.f8655
            long r2 = r2.f8678
            int r3 = (int) r2
            com.roworkshop.andro.c_point r4 = f1719
            com.roworkshop.andro.c_point r5 = f1724
            r2 = 0
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r7 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = r26
            r1.f1734 = r0
            o.mo r12 = p004o.C0561mo.CAST
            r9 = r26
            r0 = r26
            o.hl r0 = r0.f8954
            o.窆 r0 = (p004o.C1720) r0
            o.mp r1 = r9.f1776
            int r0 = r0.mo4468(r12, r1)
            long r1 = java.lang.System.currentTimeMillis()
            r3 = r26
            r3.mo4634(r0, r1)
            r9.f1772 = r12
            r9.mo3991()
            o.확$鷭 r0 = p004o.C2042.C2043.SINGLE_FRAME
            r1 = r26
            r1.f8951 = r0
            r10 = r26
            r0 = r26
            o.cc r11 = r0.f1734
            com.roworkshop.andro.c_activity r9 = p004o.C1014.f6147
            o.lx r12 = new o.lx
            r0 = r26
            r12.<init>(r0, r10, r11)
            r0 = r26
            o.둆 r0 = r0.f1732
            o.둆$Ą r0 = r0.f8655
            long r0 = r0.f8678
            r2 = r26
            o.둆 r2 = r2.f1732
            o.둆$Ą r2 = r2.f8655
            long r2 = r2.f8677
            long r2 = r27 - r2
            long r24 = r0 - r2
            android.os.Handler r0 = r9.f56
            if (r0 == 0) goto L_0x0230
            android.os.Handler r0 = r9.f56
            o.ც r1 = new o.ც
            r1.<init>(r9, r12)
            r2 = r24
            r0.postDelayed(r1, r2)
        L_0x0230:
            r0 = r26
            o.mo r0 = r0.f1772
            o.mo r1 = p004o.C0561mo.WALK
            if (r0 != r1) goto L_0x04af
            r0 = r26
            o.둆 r9 = r0.f1732
            o.둆$Ć r10 = r9.f8642
            if (r10 != 0) goto L_0x0244
            o.둆$櫯 r10 = p004o.C1919.C1925.POSITION_UNCHANGED
            goto L_0x0374
        L_0x0244:
            int r0 = r10.f8684
            if (r0 != 0) goto L_0x024c
            o.둆$櫯 r10 = p004o.C1919.C1925.FINISHED_WALKING
            goto L_0x0374
        L_0x024c:
            o.둆$Ć r0 = r9.f8642
            long r0 = r0.f8681
            r16 = r0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x025c
            long r0 = r10.f8680
            r16 = r0
        L_0x025c:
            long r0 = r27 - r16
            r18 = r0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x034f
            o.둆$櫯 r10 = p004o.C1919.C1925.POSITION_UNCHANGED
            goto L_0x0374
        L_0x026a:
            o.lm r0 = r10.f8690
            int[] r0 = r0.f1662
            o.lm r1 = r10.f8690
            int r1 = r1.f1663
            r11 = r0[r1]
            r0 = -1
            if (r11 != r0) goto L_0x027b
            o.둆$櫯 r10 = p004o.C1919.C1925.FINISHED_WALKING
            goto L_0x0374
        L_0x027b:
            r0 = r11 & 1
            if (r0 == 0) goto L_0x0289
            int r0 = r10.f8684
            int r0 = r0 * 14
            int r0 = r0 / 10
            long r1 = (long) r0
            r20 = r1
            goto L_0x0292
        L_0x0289:
            int r0 = r10.f8684
            int r0 = r0 * 10
            int r0 = r0 / 10
            long r1 = (long) r0
            r20 = r1
        L_0x0292:
            r0 = 2
            long r22 = r20 / r0
            short[] r0 = p004o.C0593nt.f2859
            short r12 = r0[r11]
            short[] r0 = p004o.C0593nt.f2858
            short r13 = r0[r11]
            byte r0 = r10.f8689
            if (r0 != 0) goto L_0x02b9
            o.lq r0 = p004o.C1014.f6142
            o.嫶 r0 = r0.f1695
            o.tc r0 = r0.f7342
            int r1 = r9.f1634
            int r1 = r1 + r12
            int r2 = r9.f1631
            int r2 = r2 + r13
            r3 = 1
            boolean r0 = r0.mo4104(r1, r2, r3)
            if (r0 != 0) goto L_0x02b9
            o.둆$櫯 r10 = p004o.C1919.C1925.FINISHED_WALKING
            goto L_0x0374
        L_0x02b9:
            byte r0 = (byte) r11
            r9.f8639 = r0
            int r0 = r10.f8686
            long r0 = (long) r0
            long r0 = r0 + r18
            int r0 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x0306
            long r18 = r18 - r22
            r0 = 0
            r10.f8686 = r0
            byte r0 = r10.f8689
            if (r0 != 0) goto L_0x02ef
            int r0 = r9.f1634
            int r0 = r0 + r12
            r9.f1634 = r0
            int r0 = r9.f1631
            int r0 = r0 + r13
            r9.f1631 = r0
            com.roworkshop.andro.c_point r0 = r9.f1632
            int r1 = -r12
            int r1 = r1 * 50
            r0.x = r1
            com.roworkshop.andro.c_point r0 = r9.f1632
            int r1 = -r13
            int r1 = r1 * 50
            r0.y = r1
            byte r0 = r10.f8689
            int r0 = r0 + 1
            byte r0 = (byte) r0
            r10.f8689 = r0
            goto L_0x034f
        L_0x02ef:
            r0 = 0
            r10.f8689 = r0
            com.roworkshop.andro.c_point r0 = r9.f1632
            r1 = 0
            r0.x = r1
            com.roworkshop.andro.c_point r0 = r9.f1632
            r1 = 0
            r0.y = r1
            o.lm r0 = r10.f8690
            int r1 = r0.f1663
            int r1 = r1 + 1
            r0.f1663 = r1
            goto L_0x034f
        L_0x0306:
            int r0 = r10.f8686
            long r0 = (long) r0
            long r0 = r0 + r18
            int r0 = (int) r0
            r10.f8686 = r0
            r18 = 0
            byte r0 = r10.f8689
            if (r0 != 0) goto L_0x032f
            com.roworkshop.andro.c_point r0 = r9.f1632
            int r1 = r10.f8686
            int r1 = r1 * r12
            int r1 = r1 * 50
            long r1 = (long) r1
            long r1 = r1 / r22
            int r1 = (int) r1
            r0.x = r1
            com.roworkshop.andro.c_point r0 = r9.f1632
            int r1 = r10.f8686
            int r1 = r1 * r13
            int r1 = r1 * 50
            long r1 = (long) r1
            long r1 = r1 / r22
            int r1 = (int) r1
            r0.y = r1
            goto L_0x034f
        L_0x032f:
            com.roworkshop.andro.c_point r0 = r9.f1632
            int r1 = r12 * -50
            int r2 = r10.f8686
            int r2 = r2 * r12
            int r2 = r2 * 50
            long r2 = (long) r2
            long r2 = r2 / r22
            int r2 = (int) r2
            int r1 = r1 + r2
            r0.x = r1
            com.roworkshop.andro.c_point r0 = r9.f1632
            int r1 = r13 * -50
            int r2 = r10.f8686
            int r2 = r2 * r13
            int r2 = r2 * 50
            long r2 = (long) r2
            long r2 = r2 / r22
            int r2 = (int) r2
            int r1 = r1 + r2
            r0.y = r1
        L_0x034f:
            r0 = 0
            int r0 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x035f
            o.lm r0 = r10.f8690
            int r0 = r0.f1663
            o.lm r1 = r10.f8690
            int r1 = r1.f1664
            if (r0 < r1) goto L_0x026a
        L_0x035f:
            o.둆$Ć r0 = r9.f8642
            r1 = r27
            r0.f8681 = r1
            o.lm r0 = r10.f8690
            int r0 = r0.f1663
            o.lm r1 = r10.f8690
            int r1 = r1.f1664
            if (r0 != r1) goto L_0x0372
            o.둆$櫯 r10 = p004o.C1919.C1925.FINISHED_WALKING
            goto L_0x0374
        L_0x0372:
            o.둆$櫯 r10 = p004o.C1919.C1925.POSITION_CHANGED
        L_0x0374:
            int[] r0 = m612()
            int r1 = r10.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x03bc;
                case 2: goto L_0x04af;
                case 3: goto L_0x038e;
                default: goto L_0x0381;
            }
        L_0x0381:
            goto L_0x04af
        L_0x038e:
            o.lq r0 = p004o.C1014.f6142
            o.嫶 r0 = r0.f1695
            o.嫶$if r0 = r0.f7349
            r1 = 0
            r0.f7359 = r1
            r0 = r26
            o.둆 r0 = r0.f1732
            r1 = 0
            r0.f8642 = r1
            o.mo r12 = p004o.C0561mo.STAND
            r9 = r26
            r0 = r26
            o.hl r0 = r0.f8954
            o.窆 r0 = (p004o.C1720) r0
            o.mp r1 = r9.f1776
            int r0 = r0.mo4468(r12, r1)
            long r1 = java.lang.System.currentTimeMillis()
            r3 = r26
            r3.mo4634(r0, r1)
            r9.f1772 = r12
            r9.mo3991()
        L_0x03bc:
            o.lq r0 = p004o.C1014.f6142
            o.hn r0 = r0.f1680
            o.ly r0 = r0.f1195
            r1 = r26
            if (r1 != r0) goto L_0x0406
            o.lq r0 = p004o.C1014.f6142
            o.嫶 r0 = r0.f1695
            o.脢 r0 = r0.f7347
            if (r0 == 0) goto L_0x0406
            r0 = r26
            android.graphics.Point r0 = r0.f1770
            r1 = r26
            o.둆 r1 = r1.f1732
            int r1 = r1.f1634
            r2 = r26
            o.둆 r2 = r2.f1732
            int r2 = r2.f1631
            boolean r0 = r0.equals(r1, r2)
            if (r0 != 0) goto L_0x0406
            o.lq r0 = p004o.C1014.f6142
            o.嫶 r0 = r0.f1695
            o.脢 r0 = r0.f7347
            o.䀠 r0 = r0.f8016
            android.graphics.Point r1 = new android.graphics.Point
            r2 = r26
            o.둆 r2 = r2.f1732
            int r2 = r2.f1634
            r3 = r26
            o.둆 r3 = r3.f1732
            int r3 = r3.f1631
            r1.<init>(r2, r3)
            r2 = r26
            o.둆 r2 = r2.f1732
            byte r2 = r2.f8639
            r0.mo4340(r1, r2)
        L_0x0406:
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            o.둆$ˮ͈ r11 = r0.f8649
            if (r11 == 0) goto L_0x04af
            r0 = r26
            o.둆 r0 = r0.f1732
            o.lf r1 = p004o.C1014.f6137
            o.ձ r1 = r1.f1636
            if (r0 != r1) goto L_0x04af
            int r9 = r11.f8704
            int r12 = r11.f8703
            r13 = 0
            int r0 = r11.f8705
            if (r0 == 0) goto L_0x043e
            o.lq r0 = p004o.C1014.f6142
            o.hn r0 = r0.f1680
            java.util.HashMap<java.lang.Integer, o.mb> r0 = r0.f1189
            int r1 = r11.f8705
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            o.mb r0 = (p004o.C0548mb) r0
            r13 = r0
            if (r13 == 0) goto L_0x043e
            o.le r0 = r13.f1769
            int r9 = r0.f1634
            o.le r0 = r13.f1769
            int r12 = r0.f1631
        L_0x043e:
            if (r9 == 0) goto L_0x04af
            if (r12 == 0) goto L_0x04af
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            int r0 = r0.f1634
            int r1 = r11.f8704
            if (r0 == r1) goto L_0x0456
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            int r0 = r0.f1631
            int r1 = r11.f8703
            if (r0 != r1) goto L_0x0462
        L_0x0456:
            o.lf r0 = p004o.C1014.f6137
            o.ձ r0 = r0.f1636
            byte r0 = r0.f8639
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0462
            r14 = 1
            goto L_0x0463
        L_0x0462:
            r14 = 0
        L_0x0463:
            int r15 = r11.f8702
            if (r14 == 0) goto L_0x0469
            int r15 = r15 + 1
        L_0x0469:
            r0 = r26
            o.둆 r0 = r0.f1732
            boolean r0 = p004o.C0593nt.m679(r0, r9, r12, r15)
            if (r0 == 0) goto L_0x0499
            r0 = r26
            o.둆 r0 = r0.f1732
            r1 = 0
            r0.f8649 = r1
            if (r13 == 0) goto L_0x0486
            o.lq r0 = p004o.C1014.f6142
            o.hn r0 = r0.f1680
            o.ly r0 = r0.f1195
            r0.mo4009(r13, r11)
            goto L_0x04af
        L_0x0486:
            int r0 = r11.f8699
            if (r0 == 0) goto L_0x04af
            o.㯲 r0 = p004o.C1014.f6144
            o.Ʃ r1 = new o.Ʃ
            int r2 = r11.f8699
            int r3 = r11.f8700
            r1.<init>(r2, r3, r9, r12)
            r0.mo3652(r1)
            goto L_0x04af
        L_0x0499:
            if (r13 == 0) goto L_0x04af
            o.둆$櫯 r0 = p004o.C1919.C1925.FINISHED_WALKING
            if (r10 != r0) goto L_0x04af
            r0 = r26
            o.둆 r0 = r0.f1732
            r1 = 0
            r0.f8649 = r1
            o.lq r0 = p004o.C1014.f6142
            o.hn r0 = r0.f1680
            o.ly r0 = r0.f1195
            r0.mo4009(r13, r11)
        L_0x04af:
            r0 = r26
            o.둆 r0 = r0.f1732
            o.둆$Ą r0 = r0.f8655
            if (r0 == 0) goto L_0x0576
            r0 = r26
            o.cc r0 = r0.f1734
            if (r0 == 0) goto L_0x0576
            r0 = r26
            o.둆 r0 = r0.f1732
            o.둆$Ą r0 = r0.f8655
            long r0 = r0.f8677
            long r0 = r27 - r0
            r10 = r0
            r2 = r26
            o.둆 r2 = r2.f1732
            o.둆$Ą r2 = r2.f8655
            long r2 = r2.f8678
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x04e2
            r0 = r26
            o.둆 r0 = r0.f1732
            r1 = 0
            r0.f8655 = r1
            r0 = 0
            r1 = r26
            r1.f1734 = r0
            goto L_0x0576
        L_0x04e2:
            r0 = r26
            o.둆 r0 = r0.f1732
            o.둆$Ą r0 = r0.f8655
            int r0 = r0.f8676
            if (r0 == 0) goto L_0x0518
            r0 = r26
            o.둆 r0 = r0.f1732
            o.둆$Ą r0 = r0.f8655
            int r0 = r0.f8676
            r1 = r26
            o.le r1 = r1.f1769
            int r1 = r1.f1630
            if (r0 == r1) goto L_0x0518
            o.lf r0 = p004o.C1014.f6137
            r1 = r26
            o.둆 r1 = r1.f1732
            o.둆$Ą r1 = r1.f8655
            int r12 = r1.f8676
            android.util.SparseArray<o.le> r0 = r0.f1637
            java.lang.Object r0 = r0.get(r12)
            o.le r0 = (p004o.C0520le) r0
            r9 = r0
            if (r9 == 0) goto L_0x0518
            r0 = r26
            o.둆 r0 = r0.f1732
            r0.mo4578(r9)
        L_0x0518:
            r0 = r26
            o.cc r0 = r0.f1734
            int r1 = (int) r10
            r2 = r26
            o.둆 r2 = r2.f1732
            o.둆$Ą r2 = r2.f8655
            long r2 = r2.f8678
            int r2 = (int) r2
            r0.mo3592(r1, r2)
            r0 = r26
            o.ad r0 = r0.f1730
            if (r0 == 0) goto L_0x0565
            r0 = r26
            o.cc r0 = r0.f1734
            android.graphics.Point r0 = r0.f559
            com.roworkshop.andro.c_point r1 = f1724
            int r1 = r1.x
            com.roworkshop.andro.c_activity r2 = p004o.C1014.f6147
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r25 = r2.getDisplayMetrics()
            r2 = r25
            int r2 = r2.densityDpi
            float r2 = (float) r2
            r3 = 1126170624(0x43200000, float:160.0)
            float r2 = r2 / r3
            r3 = 1110704128(0x42340000, float:45.0)
            float r2 = r2 * r3
            int r2 = (int) r2
            r3 = r26
            o.ad r3 = r3.f1730
            android.graphics.Point r3 = r3.f335
            int r3 = r3.y
            int r3 = r3 / 2
            int r2 = r2 - r3
            com.roworkshop.andro.c_point r3 = f1719
            int r3 = r3.y
            int r3 = r3 / 2
            int r2 = r2 - r3
            r0.set(r1, r2)
            goto L_0x0576
        L_0x0565:
            r0 = r26
            o.cc r0 = r0.f1734
            android.graphics.Point r0 = r0.f559
            com.roworkshop.andro.c_point r1 = f1724
            int r1 = r1.x
            com.roworkshop.andro.c_point r2 = f1724
            int r2 = r2.y
            r0.set(r1, r2)
        L_0x0576:
            r0 = r26
            o.mo r0 = r0.f1772
            o.mo r1 = p004o.C0561mo.DEAD
            if (r0 != r1) goto L_0x05ae
            r0 = r26
            r1 = r27
            boolean r0 = r0.mo4630(r1)
            if (r0 == 0) goto L_0x05ae
            r9 = r26
            long r0 = r9.f8945
            long r0 = r27 - r0
            float r0 = (float) r0
            r1 = 1167867904(0x459c4000, float:5000.0)
            float r17 = r0 / r1
            r0 = 1065353216(0x3f800000, float:1.0)
            float r18 = r0 - r17
            r0 = 0
            int r0 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x05a0
            r18 = 0
            goto L_0x05a8
        L_0x05a0:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x05a8
            r18 = 1065353216(0x3f800000, float:1.0)
        L_0x05a8:
            o.on r0 = r9.f8948
            r1 = r18
            r0.f3009 = r1
        L_0x05ae:
            r0 = r26
            o.둆 r0 = r0.f1732
            o.둆$ȃ r0 = r0.f8643
            if (r0 == 0) goto L_0x05d3
            r0 = r26
            o.둆 r0 = r0.f1732
            o.둆$ȃ r0 = r0.f8643
            long r0 = r0.f8693
            r2 = r26
            o.둆 r2 = r2.f1732
            o.둆$ȃ r2 = r2.f8643
            int r2 = r2.f8697
            long r2 = (long) r2
            long r0 = r0 + r2
            int r0 = (r27 > r0 ? 1 : (r27 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x05d3
            r0 = r26
            o.둆 r0 = r0.f1732
            r1 = 0
            r0.f8643 = r1
        L_0x05d3:
            r9 = r26
            r0 = r26
            o.ad r0 = r0.f1730
            if (r0 == 0) goto L_0x05ea
            o.ad r0 = r9.f1730
            long r0 = r0.f336
            int r0 = (r0 > r27 ? 1 : (r0 == r27 ? 0 : -1))
            if (r0 >= 0) goto L_0x05e5
            r0 = 1
            goto L_0x05e6
        L_0x05e5:
            r0 = 0
        L_0x05e6:
            if (r0 == 0) goto L_0x05ea
            r0 = 1
            goto L_0x05eb
        L_0x05ea:
            r0 = 0
        L_0x05eb:
            if (r0 == 0) goto L_0x05f2
            r0 = r26
            r0.m611()
        L_0x05f2:
            r0 = r26
            r1 = r27
            super.mo3992(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0540lv.mo3992(long):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ć */
    public final void mo3990() {
        super.mo3990();
        m611();
        if (this.f1728 != null) {
            C1014.f6147.f51.f1412.removeView(this.f1728.f5679);
            this.f1728 = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4002(C0586nm nmVar, long j, int[] iArr, int i) {
        C0306 r8 = C1014.f6138.mo3676(this, nmVar, j, iArr);
        this.f1732.f8640.put(nmVar, r8);
        if (this.f1732 == C1014.f6137.f1636) {
            C1014.f6147.f51.mo3867(r8.f838.f2836);
        }
        r8.mo3678(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4001(C0586nm nmVar, int i) {
        C0306 r2 = (C0306) this.f1732.f8640.remove(nmVar);
        if (this.f1732 == C1014.f6137.f1636) {
            C1014.f6147.f51.mo3863(nmVar.f2836);
        }
        if (r2 != null) {
            r2.mo3677(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final int mo3559(long j) {
        if (this.f8951 != C2043.LOOP_INFINITE || this.f1732.f1629 != C0587nn.PC || (this.f1772 != C0561mo.STAND && this.f1772 != C0561mo.SIT)) {
            return super.mo3559(j);
        }
        long j2 = j - this.f8945;
        long j3 = j2;
        if (j2 < 0) {
            j3 = 0;
        }
        C0206bb bbVar = (C0206bb) this.f1732;
        int max = Math.max(1, mo4633() / 3);
        int i = (((int) (j3 / 100)) % max) + (bbVar.f459 * max);
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ć */
    public final void mo3991() {
        C0252cp cpVar = C1014.f6158;
        C0587nn r2 = C0522lg.m563(this.f1769.f1633);
        switch (m610()[this.f1772.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 10:
                this.f8951 = C2043.LOOP_INFINITE;
                return;
            case 4:
            case 6:
            case 7:
            case 8:
            case 11:
            case 12:
            case 13:
                this.f8951 = C2043.LOOP_ONCE;
                return;
            case 9:
                if (r2 == C0587nn.PC) {
                    this.f8951 = C2043.SINGLE_FRAME;
                    return;
                } else {
                    this.f8951 = C2043.LOOP_ONCE;
                    return;
                }
            default:
                this.f8951 = C2043.LOOP_INFINITE;
                return;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C0410 mo3997(int i) {
        return this.f8954.mo3784(((C1720) this.f8954).mo4468(this.f1772, this.f1776), i);
    }
}
