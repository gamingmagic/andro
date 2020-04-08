package p004o;

import p004o.C0643pc.C0650;

/* renamed from: o.bb */
class C0206bb extends C1919 {

    /* renamed from: ŭ */
    static C0602ob[] f445 = {new C0602ob(32, C1761.CRUSADER, C1761.CRUSADER2), new C0602ob(32, C1761.BABY_CRUSADER, C1761.BABY_CRUSADER2), new C0602ob(32, C1761.PALADIN, C1761.PALADIN2), new C0602ob(126353440, C1761.KNIGHT, C1761.KNIGHT2), new C0602ob(126353440, C1761.BABY_KNIGHT, C1761.BABY_KNIGHT2), new C0602ob(126353440, C1761.LORD_KNIGHT, C1761.LORD_KNIGHT2), new C0602ob(32, C1761.ROYAL_GUARD, C1761.ROYAL_GUARD2), new C0602ob(32, C1761.ROYAL_GUARD_T, C1761.ROYAL_GUARD_T2), new C0602ob(32, C1761.BABY_GUARD, C1761.BABY_GUARD2), new C0602ob(126353440, C1761.RUNE_KNIGHT, C1761.RUNE_KNIGHT2), new C0602ob(126353440, C1761.RUNE_KNIGHT_T, C1761.RUNE_KNIGHT_T2), new C0602ob(126353440, C1761.BABY_RUNE, C1761.BABY_RUNE2), new C0602ob(4194304, C1761.MECHANIC, C1761.MECHANIC2), new C0602ob(4194304, C1761.MECHANIC_T, C1761.MECHANIC_T2), new C0602ob(4194304, C1761.BABY_MECHANIC, C1761.BABY_MECHANIC2), new C0602ob(2097152, C1761.RANGER, C1761.RANGER2), new C0602ob(2097152, C1761.RANGER_T, C1761.RANGER_T2), new C0602ob(2097152, C1761.BABY_RANGER, C1761.BABY_RANGER2)};

    /* renamed from: ŝ */
    byte f446;

    /* renamed from: Ş */
    int f447;

    /* renamed from: ş */
    int f448;

    /* renamed from: Ţ */
    int f449;

    /* renamed from: ţ */
    int f450;

    /* renamed from: Ŧ */
    int f451;

    /* renamed from: ŧ */
    int f452;

    /* renamed from: ũ */
    boolean f453;

    /* renamed from: Ū */
    boolean f454;

    /* renamed from: ū */
    boolean f455;

    /* renamed from: 弉 */
    int f456;

    /* renamed from: 弍 */
    int f457;

    /* renamed from: 挐 */
    boolean f458;

    /* renamed from: 挔 */
    short f459;

    /* renamed from: 뛖 */
    int f460;

    /* renamed from: 뛚 */
    int f461;

    C0206bb(C0599nz nzVar, int i, int i2, int i3) {
        super(nzVar, i, i2, i3);
        this.f1633 = nzVar.f2916;
        this.f446 = nzVar.f2901;
        this.f460 = nzVar.f2914;
        this.f447 = nzVar.f2917;
        this.f448 = nzVar.f2887;
        this.f456 = nzVar.f2892;
        this.f449 = nzVar.f2893;
        this.f450 = nzVar.f2890;
        this.f461 = nzVar.f2889;
        this.f457 = nzVar.f2891;
        this.f451 = nzVar.f2899;
    }

    C0206bb(C0603oc ocVar) {
        mo3558(ocVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3558(C0603oc ocVar) {
        super.mo3558(ocVar);
        this.f446 = ocVar.f2940;
        this.f447 = ocVar.f2964;
        this.f448 = ocVar.f2949;
        this.f460 = ocVar.f2950;
        this.f456 = ocVar.f2963;
        this.f449 = ocVar.f2956;
        this.f450 = ocVar.f2935;
        this.f461 = ocVar.f2958;
        this.f457 = ocVar.f2946;
        this.f451 = ocVar.f2936;
        this.f452 = ocVar.f2944;
        byte b = ocVar.f2952;
        if ((C1926.SIT.ordinal() & b) != 0) {
            this.f458 = true;
        } else {
            this.f458 = false;
        }
    }

    static {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final int mo3557(boolean z) {
        boolean z2;
        int i = this.f1633;
        if (z) {
            i = C1570.m2254(C1761.m2430(this.f1633).mo4502().f7485 & 4095).mo4398(C1977.values()[this.f446]).f8294;
        }
        C0650 r9 = C1014.f6140;
        int i2 = this.f1630;
        if (r9.f4499 == null) {
            z2 = false;
        } else {
            int[] iArr = r9.f4499;
            int length = iArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z2 = false;
                    break;
                } else if (i2 == iArr[i3]) {
                    z2 = true;
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (z2) {
            return C1761.GAMEMASTER.f8294;
        }
        if ((this.f8646 & 4096) != 0) {
            i = C1761.WEDDING.f8294;
        } else if ((this.f8646 & 65536) != 0) {
            i = C1761.XMAS.f8294;
        } else if ((this.f8646 & 262144) != 0) {
            i = C1761.SUMMER.f8294;
        }
        C0602ob[] obVarArr = f445;
        int length2 = obVarArr.length;
        int i4 = 0;
        while (true) {
            if (i4 < length2) {
                C0602ob obVar = obVarArr[i4];
                if (i != obVar.f2929.f8294 || (this.f8646 & obVar.f2930) <= 0) {
                    if (i == obVar.f2928.f8294 && (this.f8646 & obVar.f2930) == 0) {
                        i = obVar.f2929.f8294;
                        break;
                    }
                    i4++;
                } else {
                    i = obVar.f2928.f8294;
                    break;
                }
            } else {
                break;
            }
        }
        if (this.f8640.get(C0586nm.ALL_RIDING) != null) {
            C1761 r92 = C1761.m2430(i);
            if (r92 != null) {
                C1761 r4 = r92.mo4503(true);
                if (r4 != null) {
                    i = r4.f8294;
                }
            }
        }
        return i;
    }
}
