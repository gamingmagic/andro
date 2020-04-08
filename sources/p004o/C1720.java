package p004o;

import android.util.Log;

/* renamed from: o.窆 */
final class C1720 extends C0408hl {

    /* renamed from: Ą */
    C0405hk f7932;

    /* renamed from: ą */
    C0405hk f7933;

    /* renamed from: Ć */
    C0405hk f7934;

    /* renamed from: ć */
    C0405hk f7935;

    /* renamed from: đ */
    private int f7936 = -1;

    /* renamed from: Ē */
    private int f7937 = -1;

    /* renamed from: ē */
    private int f7938 = -1;

    /* renamed from: ȃ */
    C0405hk f7939;

    /* renamed from: ˮ͈ */
    C0405hk f7940;

    /* renamed from: ˮ͍ */
    C0405hk f7941;

    /* renamed from: ܕ */
    private int f7942 = -1;

    /* renamed from: 㥳 */
    private int f7943 = -1;

    /* renamed from: 岱 */
    C0405hk[] f7944;

    /* renamed from: 庸 */
    private byte f7945 = -1;

    /* renamed from: 櫯 */
    C0405hk f7946;

    /* renamed from: 鷭 */
    C0587nn f7947;

    /* renamed from: 띥 */
    private int f7948 = -1;

    C1720(C0520le leVar) {
        C0405hk[] hkVarArr;
        C0520le leVar2 = leVar;
        if (leVar2.f1629 == C0587nn.ITEM) {
            this.f7947 = C0587nn.ITEM;
        } else {
            C0252cp cpVar = C1014.f6158;
            this.f7947 = C0522lg.m563(leVar2.f1633);
        }
        C0520le leVar3 = leVar2;
        if (leVar3.f1633 != C1430.HIDDEN_WARP_CLASS.f7044) {
            if (leVar3.f1629 == C0587nn.PC) {
                if (this.f7947 != C0587nn.PC) {
                    throw new UnsupportedOperationException("Cannot PC unit type with NPC sprite " + leVar3.f1633);
                }
                C0206bb bbVar = (C0206bb) leVar3;
                if (bbVar.f447 > C0247ck.f603) {
                    bbVar.f447 = 0;
                }
                if (bbVar.f448 > C0247ck.f605) {
                    bbVar.f448 = 1;
                }
                int r12 = bbVar.mo3557(false);
                if (!(r12 == this.f7942 && bbVar.f446 == this.f7945)) {
                    this.f1166 = C1014.f6158.mo3621(r12, bbVar.f446, false);
                }
                if (this.f7936 != bbVar.f448) {
                    this.f7946 = C1014.f6158.mo3623(C1761.m2430(bbVar.f1633), bbVar.f448, bbVar.f446, false);
                }
                if (!(bbVar.f456 == this.f7937 && bbVar.f448 == this.f7936 && bbVar.f446 == this.f7945)) {
                    this.f7940 = null;
                    if (bbVar.f456 > 0) {
                        this.f7940 = C1014.f6158.mo3622(bbVar.f456, bbVar.f448, bbVar.f446, false);
                    }
                }
                if (!(bbVar.f449 == this.f7938 && bbVar.f448 == this.f7936 && bbVar.f446 == this.f7945)) {
                    this.f7939 = null;
                    if (bbVar.f449 > 0) {
                        this.f7939 = C1014.f6158.mo3622(bbVar.f449, bbVar.f448, bbVar.f446, false);
                    }
                }
                if (!(bbVar.f450 == this.f7948 && bbVar.f448 == this.f7936 && bbVar.f446 == this.f7945)) {
                    this.f7932 = null;
                    if (bbVar.f450 > 0) {
                        this.f7932 = C1014.f6158.mo3622(bbVar.f450, bbVar.f448, bbVar.f446, false);
                    }
                }
                if (bbVar.f451 != this.f7943) {
                    this.f7941 = null;
                    if (bbVar.f451 > 0) {
                        C0252cp cpVar2 = C1014.f6158;
                        int i = bbVar.f451;
                        int i2 = bbVar.f1633;
                        byte b = bbVar.f446;
                        C0247ck ckVar = cpVar2.f674;
                        int i3 = C1570.m2254(C1761.m2430(i2).mo4502().f7485 & 4095).mo4398(C1977.values()[b]).f8294;
                        C1714 r16 = ckVar.f623;
                        String str = b == C1977.MALE.ordinal() ? r16.f7901 : r16.f7900;
                        C0285 r13 = (C0285) ckVar.f622.f770.get(Integer.valueOf(i));
                        String sb = new StringBuilder(String.valueOf(ckVar.f623.f7903.f7906)).append("\\").append(r13 == null ? null : r13.f773).append("\\").append(str).append("\\").append(ckVar.f626.mo3954(i3, b)).append("_").append(str).toString();
                        C0405hk hkVar = (C0405hk) C0246cj.m230(sb, C0405hk.class, C1014.f6140.f4465, null);
                        if (hkVar != null || C1014.f6140.f4465) {
                            this.f7941 = hkVar;
                        } else {
                            throw new C0588no("Failed to init SPR: " + sb);
                        }
                    }
                }
                this.f7936 = bbVar.f448;
                this.f7937 = bbVar.f456;
                this.f7938 = bbVar.f449;
                this.f7948 = bbVar.f449;
                this.f7943 = bbVar.f451;
                this.f7945 = bbVar.f446;
                this.f7942 = bbVar.f1633;
                try {
                    hkVarArr = C1014.f6158.mo3624(bbVar);
                } catch (C0825tu unused) {
                    C0592ns.m674("failed to load weapon and shield; class=" + bbVar.f1633 + " weapon=" + bbVar.f461 + " shield=" + bbVar.f457);
                    hkVarArr = new C0405hk[3];
                }
                this.f7933 = hkVarArr[0];
                this.f7935 = hkVarArr[1];
                this.f7934 = hkVarArr[2];
                this.f1167 = new C0405hk[2];
                this.f1169 = new String[2];
                if (bbVar.f460 > 0) {
                    this.f1167[0] = this.f1166;
                    this.f1169[0] = C1014.f6158.mo3619(C1761.m2430(r12), true, r12, bbVar.f460, C1977.values()[bbVar.f446], false, true).f682;
                }
                if (bbVar.f447 > 0) {
                    this.f1167[1] = this.f7946;
                    this.f1169[1] = C1014.f6158.mo3619(C1761.m2430(r12), false, bbVar.f448, bbVar.f447, C1977.values()[bbVar.f446], false, true).f682;
                }
                C0405hk hkVar2 = (C0405hk) C0246cj.m229("shadow", C0405hk.class);
                this.f1165 = new C0405hk[]{hkVar2, this.f7941, this.f1166, this.f7946, this.f7940, this.f7939, this.f7932, this.f7933, this.f7934, this.f7935};
                this.f7944 = new C0405hk[]{hkVar2, this.f7935, this.f1166, this.f7946, this.f7940, this.f7939, this.f7932, this.f7941, this.f7933, this.f7934};
            } else if (leVar3.f1629 == C0587nn.MER) {
                C1598 r11 = (C1598) leVar3;
                C0405hk hkVar3 = (C0405hk) C0246cj.m229("shadow", C0405hk.class);
                if (this.f7947 == C0587nn.MER) {
                    this.f1166 = new C0405hk(C1014.f6158.f674.mo3605(r11.f1633, r11.f7507));
                    this.f7946 = C1014.f6158.mo3623(C1761.NOVICE, (int) r11.f7511, r11.f7507, false);
                    this.f7940 = null;
                    if (r11.f7508 > 0) {
                        this.f7940 = C1014.f6158.mo3622((int) r11.f7508, (int) r11.f7511, r11.f7507, false);
                    }
                    this.f7939 = null;
                    if (r11.f7504 > 0) {
                        this.f7939 = C1014.f6158.mo3622((int) r11.f7504, (int) r11.f7511, r11.f7507, false);
                    }
                    this.f7932 = null;
                    if (r11.f7509 > 0) {
                        this.f7932 = C1014.f6158.mo3622((int) r11.f7509, (int) r11.f7511, r11.f7507, false);
                    }
                    this.f1167 = new C0405hk[2];
                    this.f1169 = new String[2];
                    if (r11.f7510 > 0) {
                        this.f1167[0] = this.f1166;
                        this.f1169[0] = C1014.f6158.mo3619(C1761.m2430(r11.f1633), true, r11.f1633, r11.f7510, C1977.values()[r11.f7507], false, true).f682;
                    }
                    if (r11.f7512 > 0) {
                        this.f1167[1] = this.f7946;
                        this.f1169[1] = C1014.f6158.mo3619(C1761.m2430(r11.f1633), false, r11.f7511, r11.f7512, C1977.values()[r11.f7507], false, true).f682;
                    }
                    C0405hk[] hkVarArr2 = {hkVar3, this.f1166, this.f7946, this.f7940, this.f7939, this.f7932};
                    this.f7944 = hkVarArr2;
                    this.f1165 = hkVarArr2;
                } else {
                    this.f1166 = C1014.f6158.mo3620(r11.f1633);
                    C0405hk[] hkVarArr3 = {hkVar3, this.f1166};
                    this.f7944 = hkVarArr3;
                    this.f1165 = hkVarArr3;
                }
            } else if (this.f7947 == C0587nn.MOB || this.f7947 == C0587nn.HOM || this.f7947 == C0587nn.PET || this.f7947 == C0587nn.NPC || this.f7947 == C0587nn.ELEM) {
                C1919 r112 = (C1919) leVar3;
                C0405hk r122 = C1014.f6158.mo3620(r112.f1633);
                C0405hk hkVar4 = (C0405hk) C0246cj.m229("shadow", C0405hk.class);
                if (leVar3.f1633 == C1430.FLAG_CLASS.f7044) {
                    C0405hk[] hkVarArr4 = {hkVar4, r122, new C2000(r112.f8637, r112.f8638, false, false)};
                    this.f7944 = hkVarArr4;
                    this.f1165 = hkVarArr4;
                } else if (leVar3.f1633 == C1430.WARP_CLASS.f7044 || leVar3.f1633 == C1430.WARP_DEBUG_CLASS.f7044 || leVar3.f1633 == C1430.INVISIBLE_CLASS.f7044) {
                    C0405hk[] hkVarArr5 = {r122};
                    this.f7944 = hkVarArr5;
                    this.f1165 = hkVarArr5;
                } else {
                    C0405hk[] hkVarArr6 = {hkVar4, r122};
                    this.f7944 = hkVarArr6;
                    this.f1165 = hkVarArr6;
                }
                this.f1166 = r122;
            } else if (this.f7947 == C0587nn.ITEM) {
                C0520le leVar4 = leVar3;
                C1645 r113 = C1645.class.isAssignableFrom(leVar4.getClass()) ? leVar4 : null;
                C0252cp cpVar3 = C1014.f6158;
                int i4 = r113.f1633;
                boolean z = r113.f7604;
                int i5 = i4;
                C0247ck ckVar2 = cpVar3.f674;
                String r132 = ckVar2.f608.mo4464(i5, z);
                String sb2 = r132 == null ? null : new StringBuilder(String.valueOf(ckVar2.f623.f7903.f7910)).append("\\").append(r132).toString();
                C0405hk hkVar5 = sb2 == null ? null : (C0405hk) C0246cj.m229(sb2, C0405hk.class);
                this.f1165 = new C0405hk[]{hkVar5};
                this.f1166 = hkVar5;
            } else {
                String str2 = "Unsupported unit type " + leVar3.f1629;
                Log.e("AndRO", str2);
                throw new C0588no(str2);
            }
        }
        mo3786(this.f1166, this.f1165);
        C0520le leVar5 = leVar2;
        if (this.f7933 != null && leVar5.f1629 == C0587nn.PC) {
            C0206bb bbVar2 = (C0206bb) leVar5;
            String r10 = C1014.f6158.f674.f614.mo3973(C1014.f6158.f674.mo3612(bbVar2.f461, bbVar2.f457).mo4458());
            if (r10 != null) {
                if (!C1014.f6136.f7599.containsKey(r10)) {
                    C1014.f6136.mo4429(r10, (byte[]) C1014.f6158.f677.mo3613("data\\wav\\" + r10, false));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final int mo4468(C0561mo moVar, C0562mp mpVar) {
        int i;
        if (this.f7947 == C0587nn.PC) {
            i = moVar.f1849;
        } else {
            i = moVar.f1850;
        }
        if (i == -1) {
            i = 0;
        }
        int ordinal = (i * 8) + mpVar.ordinal();
        if (ordinal < this.f1168.length) {
            return ordinal;
        }
        if (ordinal % 8 < this.f1168.length) {
            return ordinal % 8;
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3785(int i) {
        C0405hk[] hkVarArr;
        if (this.f1168[i] == null) {
            C0562mp mpVar = C0562mp.values()[i % 8];
            if (mpVar == C0562mp.NUM6 || mpVar == C0562mp.NUM7 || mpVar == C0562mp.NUM8 || mpVar == C0562mp.NUM9) {
                hkVarArr = this.f7944;
            } else {
                hkVarArr = this.f1165;
            }
            this.f1168[i] = new C0409(hkVarArr, i, this.f1167, this.f1169);
        }
    }
}
