package p004o;

import p004o.C0908wk.C0909;

/* renamed from: o.ˮ̀ */
final class C1243 extends C0908wk implements C0838ud {

    /* renamed from: ą */
    private static /* synthetic */ int[] f6373;

    C1243() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:3|4|5|6|7|8|9|10|11|12|13|(2:14|15)|16|18) */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0034 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: ą */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m1997() {
        /*
            int[] r0 = f6373
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.wk$鷭[] r0 = p004o.C0908wk.C0909.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.wk$鷭 r0 = p004o.C0908wk.C0909.ACCESSORYID     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.wk$鷭 r0 = p004o.C0908wk.C0909.HAIRSTYLEID     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.wk$鷭 r0 = p004o.C0908wk.C0909.HUNGER     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.wk$鷭 r0 = p004o.C0908wk.C0909.INTIMACY     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            o.wk$鷭 r0 = p004o.C0908wk.C0909.PERFORMANCE     // Catch:{ NoSuchFieldError -> 0x003e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            o.wk$鷭 r0 = p004o.C0908wk.C0909.PET_EXISTS     // Catch:{ NoSuchFieldError -> 0x0048 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0048 }
        L_0x0048:
            f6373 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1243.m1997():int[]");
    }

    /* renamed from: 鷭 */
    public final void mo4051() {
        C0540lv r4 = C1014.f6142.mo3978(this.f5297);
        if (r4 != null) {
            if (C1014.f6137.f1636.f6547 == null) {
                C1014.f6137.f1636.f6547 = new C1304();
            }
            if (C1014.f6137.f1636.f6547.f6581 == null) {
                C1014.f6137.f1636.f6547.f6581 = new C1305();
            }
            C1305 r5 = C1014.f6137.f1636.f6547.f6581;
            r5.f6590 = r4.f1732.f1629;
            C0207bc bcVar = null;
            if (r4 != null && r4.f1732.f1629 == C0587nn.PET) {
                Cloneable cloneable = r4.f1732;
                bcVar = (C0207bc) (C0207bc.class.isAssignableFrom(cloneable.getClass()) ? cloneable : null);
            }
            if (this.f5298 < 0 || this.f5298 >= C0909.values().length) {
                C0592ns.m674("Unexpected PKT_MC_PETPARAM type=" + this.f5298 + " param=" + this.f5296);
                return;
            }
            switch (m1997()[C0909.values()[this.f5298].ordinal()]) {
                case 1:
                    if (C1014.f6137.f1636.f6547 == null) {
                        C1014.f6137.f1636.f6547 = new C1304();
                    }
                    r5.f6595 = this.f5297;
                    r4.f1732.f1630 = this.f5297;
                    return;
                case 2:
                    if (C1014.f6137.f1636.f6547 != null && r5.f6595 == this.f5297) {
                        r5.f6589 = (short) this.f5296;
                        return;
                    }
                case 3:
                    if (C1014.f6137.f1636.f6547 != null && r5.f6595 == this.f5297) {
                        r5.f6587 = (short) this.f5296;
                        r4.mo4004(r5);
                        return;
                    }
                case 4:
                    if (bcVar != null) {
                        bcVar.f463 = this.f5296;
                    }
                    if (C1014.f6137.f1636.f6547 != null && r5.f6595 == this.f5297) {
                        C1014.f6137.f1636.f6547.f6583 = this.f5296;
                    }
                    if (bcVar != null) {
                        r4.mo4018();
                        return;
                    }
                    break;
                case 5:
                    if (bcVar != null) {
                        switch (this.f5296) {
                            case 1:
                                if (bcVar != null) {
                                    C0540lv lvVar = r4;
                                    C0561mo moVar = C0561mo.PERFORMANCE1;
                                    C0540lv lvVar2 = lvVar;
                                    lvVar.mo4634(((C1720) lvVar.f8954).mo4468(moVar, lvVar2.f1776), System.currentTimeMillis());
                                    lvVar2.f1772 = moVar;
                                    lvVar2.mo3991();
                                    return;
                                }
                                break;
                            case 2:
                                if (bcVar != null) {
                                    C0540lv lvVar3 = r4;
                                    C0561mo moVar2 = C0561mo.PERFORMANCE2;
                                    C0540lv lvVar4 = lvVar3;
                                    lvVar3.mo4634(((C1720) lvVar3.f8954).mo4468(moVar2, lvVar4.f1776), System.currentTimeMillis());
                                    lvVar4.f1772 = moVar2;
                                    lvVar4.mo3991();
                                    return;
                                }
                                break;
                            case 3:
                                if (bcVar != null) {
                                    C0540lv lvVar5 = r4;
                                    C0561mo moVar3 = C0561mo.PERFORMANCE3;
                                    C0540lv lvVar6 = lvVar5;
                                    lvVar5.mo4634(((C1720) lvVar5.f8954).mo4468(moVar3, lvVar6.f1776), System.currentTimeMillis());
                                    lvVar6.f1772 = moVar3;
                                    lvVar6.mo3991();
                                    return;
                                }
                                break;
                            case 4:
                                if (bcVar != null) {
                                    C0540lv lvVar7 = r4;
                                    C0561mo moVar4 = C0561mo.PERFORMANCE4;
                                    C0540lv lvVar8 = lvVar7;
                                    lvVar7.mo4634(((C1720) lvVar7.f8954).mo4468(moVar4, lvVar8.f1776), System.currentTimeMillis());
                                    lvVar8.f1772 = moVar4;
                                    lvVar8.mo3991();
                                    break;
                                }
                                break;
                        }
                    }
                    break;
                case 6:
                    if (bcVar != null) {
                        bcVar.f462 = this.f5296;
                    }
                    if (C1014.f6137.f1636.f6547 != null && r5.f6595 == this.f5297) {
                        C1014.f6137.f1636.f6547.f6580 = this.f5296;
                    }
                    if (bcVar != null) {
                        r4.mo4018();
                        return;
                    }
                    break;
            }
        }
    }
}
