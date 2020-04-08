package p004o;

import android.graphics.Point;
import java.util.ArrayList;

/* renamed from: o.mb */
class C0548mb extends C0538lu {

    /* renamed from: Ȋ */
    private static /* synthetic */ int[] f1768;

    /* renamed from: ĥ */
    C0520le f1769;

    /* renamed from: Ħ */
    Point f1770 = new Point();

    /* renamed from: ħ */
    Point f1771 = new Point();

    /* renamed from: Ĩ */
    C0561mo f1772 = C0561mo.STAND;

    /* renamed from: Ī */
    ArrayList<C1885> f1773 = new ArrayList<>();

    /* renamed from: ī */
    boolean f1774;

    /* renamed from: Ĭ */
    C1752 f1775;

    /* renamed from: 廑 */
    C0562mp f1776 = C0562mp.NUM8;

    /* renamed from: 廕 */
    C0437ij f1777;

    /* JADX WARNING: Can't wrap try/catch for region: R(27:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0041 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0055 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0060 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0074 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x007e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0017 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0022 */
    /* renamed from: ą */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] mo3989() {
        /*
            int[] r0 = f1768
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.nn[] r0 = p004o.C0587nn.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.nn r0 = p004o.C0587nn.ALL     // Catch:{ NoSuchFieldError -> 0x0017 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
            r1 = 12
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0017 }
        L_0x0017:
            o.nn r0 = p004o.C0587nn.CHAT     // Catch:{ NoSuchFieldError -> 0x0022 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
            r1 = 10
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0022 }
        L_0x0022:
            o.nn r0 = p004o.C0587nn.ELEM     // Catch:{ NoSuchFieldError -> 0x002d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
            r1 = 11
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002d }
        L_0x002d:
            o.nn r0 = p004o.C0587nn.HOM     // Catch:{ NoSuchFieldError -> 0x0037 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0037 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0037 }
        L_0x0037:
            o.nn r0 = p004o.C0587nn.ITEM     // Catch:{ NoSuchFieldError -> 0x0041 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0041 }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0041 }
        L_0x0041:
            o.nn r0 = p004o.C0587nn.MER     // Catch:{ NoSuchFieldError -> 0x004b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            o.nn r0 = p004o.C0587nn.MOB     // Catch:{ NoSuchFieldError -> 0x0055 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0055 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0055 }
        L_0x0055:
            o.nn r0 = p004o.C0587nn.NPC     // Catch:{ NoSuchFieldError -> 0x0060 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
            r1 = 9
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0060 }
        L_0x0060:
            o.nn r0 = p004o.C0587nn.NUL     // Catch:{ NoSuchFieldError -> 0x006a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
        L_0x006a:
            o.nn r0 = p004o.C0587nn.PC     // Catch:{ NoSuchFieldError -> 0x0074 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0074 }
        L_0x0074:
            o.nn r0 = p004o.C0587nn.PET     // Catch:{ NoSuchFieldError -> 0x007e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x007e }
        L_0x007e:
            o.nn r0 = p004o.C0587nn.SKILL     // Catch:{ NoSuchFieldError -> 0x0089 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0089 }
            r1 = 8
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0089 }
        L_0x0089:
            f1768 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0548mb.mo3989():int[]");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 118 */
    /* renamed from: ˮ͍ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4017() {
        /*
            r3 = this;
            java.util.ArrayList<o.귊> r1 = r3.f1773
            monitor-enter(r1)
            java.util.ArrayList<o.귊> r0 = r3.f1773     // Catch:{ all -> 0x001f }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x001f }
            goto L_0x0017
        L_0x000a:
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x001f }
            o.귊 r0 = (p004o.C1885) r0     // Catch:{ all -> 0x001f }
            boolean r0 = r0.f8503     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0017
            r2.remove()     // Catch:{ all -> 0x001f }
        L_0x0017:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x000a
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0548mb.mo4017():void");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 119 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4003(p004o.C0626ox r5) {
        /*
            r4 = this;
            java.util.ArrayList<o.귊> r1 = r4.f1773
            monitor-enter(r1)
            java.util.ArrayList<o.귊> r0 = r4.f1773     // Catch:{ all -> 0x0020 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0020 }
            goto L_0x0018
        L_0x000a:
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0020 }
            o.귊 r0 = (p004o.C1885) r0     // Catch:{ all -> 0x0020 }
            r2 = r0
            o.ox r0 = r2.f8506     // Catch:{ all -> 0x0020 }
            if (r0 != r5) goto L_0x0018
            r0 = 1
            r2.f8503 = r0     // Catch:{ all -> 0x0020 }
        L_0x0018:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0020 }
            if (r0 != 0) goto L_0x000a
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            goto L_0x0023
        L_0x0020:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            throw r0
        L_0x0023:
            r4.mo4017()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0548mb.mo4003(o.ox):void");
    }

    @Deprecated
    C0548mb() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public void mo4000(C0520le leVar) {
        this.f1769 = leVar;
        if ((leVar.f1629 == C0587nn.MOB || leVar.f1629 == C0587nn.NPC) && leVar.f1633 != C1430.FLAG_CLASS.f7044) {
            this.f8954 = (C0408hl) C1014.f6142.f1680.f1182.get(Integer.valueOf(((C1919) leVar).f1633));
        } else if (leVar.f1629 == C0587nn.ITEM) {
            this.f8954 = (C0408hl) C1014.f6142.f1680.f1183.get(Integer.valueOf(leVar.f1633));
        } else if (leVar.f1629 != C0587nn.SKILL) {
            this.f8954 = null;
        }
        if (this.f8954 == null) {
            switch (mo3989()[leVar.f1629.ordinal()]) {
                case 2:
                case 6:
                    this.f8954 = C1014.f6142.f1680.f1192;
                    break;
                case 7:
                    this.f8954 = C1014.f6142.f1680.f1197;
                    break;
                case 9:
                    this.f8954 = C1014.f6142.f1680.f1191;
                    break;
                default:
                    this.f8954 = C1014.f6142.f1680.f1196;
                    break;
            }
            this.f1774 = true;
            mo4018();
        }
        mo4634(0, System.currentTimeMillis());
        mo3985();
    }

    /* renamed from: 櫯 */
    static C0548mb m645(C0520le leVar) {
        C0548mb mbVar;
        C0520le leVar2 = leVar;
        if ((C1301.class.isAssignableFrom(leVar2.getClass()) ? leVar2 : null) != null) {
            mbVar = new C0543ly();
        } else {
            C0520le leVar3 = leVar;
            if ((C1919.class.isAssignableFrom(leVar3.getClass()) ? leVar3 : null) != null) {
                mbVar = new C0540lv();
            } else {
                C0520le leVar4 = leVar;
                if ((C0404hj.class.isAssignableFrom(leVar4.getClass()) ? leVar4 : null) != null) {
                    mbVar = new C0545lz((C0404hj) leVar);
                } else {
                    mbVar = new C0548mb();
                }
            }
        }
        mbVar.mo4000(leVar);
        return mbVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 岱 */
    public final void mo4018() {
        if ((this.f1769.f1629 == C0587nn.MOB || this.f1769.f1629 == C0587nn.NPC) && this.f1769.f1633 != C1430.FLAG_CLASS.f7044) {
            C1720 r3 = (C1720) C1014.f6142.f1680.f1182.get(Integer.valueOf(this.f1769.f1633));
            if (r3 != null) {
                C1720 r4 = r3;
                this.f8954 = r4;
                mo4634(this.f8950, this.f8945);
                this.f1774 = false;
            }
        } else if (this.f1769.f1629 == C0587nn.ITEM) {
            C1720 r32 = (C1720) C1014.f6142.f1680.f1183.get(Integer.valueOf(this.f1769.f1633));
            if (r32 != null) {
                C1720 r42 = r32;
                this.f8954 = r42;
                mo4634(this.f8950, this.f8945);
                this.f1774 = false;
            }
        }
        C1014.f6158.mo3387((Runnable) new C0549mc(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final void mo3987() {
        this.f1708.set(this.f1769.f1634, this.f1769.f1631);
        this.f1705.set(this.f1769.f1632.x, this.f1769.f1632.y);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 127 */
    /* renamed from: Ą */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3985() {
        /*
            r8 = this;
            super.mo3985()
            o.訍 r0 = r8.f1775
            if (r0 == 0) goto L_0x000c
            o.訍 r0 = r8.f1775
            r0.mo4494()
        L_0x000c:
            o.ij r0 = r8.f1777
            if (r0 == 0) goto L_0x0015
            o.ij r0 = r8.f1777
            r0.mo3985()
        L_0x0015:
            java.util.ArrayList<o.귊> r2 = r8.f1773
            monitor-enter(r2)
            java.util.ArrayList<o.귊> r0 = r8.f1773     // Catch:{ all -> 0x0052 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0052 }
            goto L_0x004a
        L_0x001f:
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x0052 }
            o.귊 r0 = (p004o.C1885) r0     // Catch:{ all -> 0x0052 }
            r3 = r0
            boolean r0 = r3.f8502     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x0043
            r5 = r8
            o.lq r0 = p004o.C1014.f6142     // Catch:{ all -> 0x0052 }
            o.lj r0 = r5.f1707     // Catch:{ all -> 0x0052 }
            o.li r6 = p004o.C0534lq.m593(r0)     // Catch:{ all -> 0x0052 }
            r5 = r3
            o.li r0 = r3.f587     // Catch:{ all -> 0x0052 }
            r7 = r6
            r6 = r0
            float r1 = r7.f1649     // Catch:{ all -> 0x0052 }
            r0.f1649 = r1     // Catch:{ all -> 0x0052 }
            float r0 = r7.f1648     // Catch:{ all -> 0x0052 }
            r6.f1648 = r0     // Catch:{ all -> 0x0052 }
            r5.mo3591()     // Catch:{ all -> 0x0052 }
        L_0x0043:
            o.lj r0 = r3.f8507     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x004a
            r3.mo3591()     // Catch:{ all -> 0x0052 }
        L_0x004a:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x001f
            monitor-exit(r2)     // Catch:{ all -> 0x0052 }
            return
        L_0x0052:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0052 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0548mb.mo3985():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public C0410 mo3997(int i) {
        return this.f8954.mo3784(0, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ȋ */
    public final void mo4016() {
        if (this.f1775 != null) {
            if (C1014.f6147.f51.f1412 != null) {
                C1014.f6147.f51.f1412.removeView(this.f1775.f8047);
            }
            this.f1775 = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ȃ */
    public void mo3992(long j) {
        if (!this.f1774) {
            int r9 = mo3559(j);
            int i = this.f8947;
            C0408hl hlVar = this.f8954;
            int i2 = this.f8950;
            if (i2 >= hlVar.f1168.length) {
                i2 = 0;
            }
            if (hlVar.f1168[i2] == null) {
                hlVar.mo3785(i2);
            }
            C0409 r4 = hlVar.f1168[i2];
            int length = r9 % r4.f1171.length;
            for (int length2 = i % r4.f1171.length; length2 != length; length2 = (length2 + 1) % r4.f1171.length) {
                String[] strArr = r4.f1171[length2].f1173;
                for (String r1 : strArr) {
                    C1014.f6136.mo4428(r1, 1.0f);
                }
            }
            this.f8947 = length;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ć */
    public void mo3990() {
        mo4016();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ċ */
    public final boolean mo4015() {
        switch (mo3989()[this.f1769.f1629.ordinal()]) {
            case 7:
                return true;
            case 8:
            case 10:
                return false;
            default:
                if (this.f1769.f1633 == C1430.WARP_CLASS.f7044 || this.f1769.f1633 == C1430.HIDDEN_WARP_CLASS.f7044 || this.f1769.f1633 == C1430.WARP_DEBUG_CLASS.f7044 || this.f1769.f1633 == C1430.INVISIBLE_CLASS.f7044) {
                    return false;
                }
                C0520le leVar = this.f1769;
                C1919 r0 = C1919.class.isAssignableFrom(leVar.getClass()) ? leVar : null;
                C1919 r2 = r0;
                if (r0 == null || (r2.f8646 & 16454) <= 0) {
                    return true;
                }
                return false;
        }
    }
}
