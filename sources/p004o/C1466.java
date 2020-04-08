package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.䑾 */
final class C1466 extends C0762sz {

    /* renamed from: 鷭 */
    private static /* synthetic */ int[] f7120;

    /* renamed from: o.䑾$鷭 */
    enum C1467 {
        LOOK_BASE,
        LOOK_HAIR,
        LOOK_WEAPON,
        LOOK_HEAD_BOTTOM,
        LOOK_HEAD_TOP,
        LOOK_HEAD_MID,
        LOOK_HAIR_COLOR,
        LOOK_CLOTHES_COLOR,
        LOOK_SHIELD,
        LOOK_SHOES,
        LOOK_BODY,
        LOOK_FLOOR,
        LOOK_ROBE,
        LOOK_BODY2
    }

    C1466() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(30:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|(2:30|31)|32|34) */
    /* JADX WARNING: Can't wrap try/catch for region: R(31:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0042 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0056 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0060 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0074 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x007f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x008a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0095 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* renamed from: ˮ͈ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m2169() {
        /*
            int[] r0 = f7120
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.䑾$鷭[] r0 = p004o.C1466.C1467.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.䑾$鷭 r0 = p004o.C1466.C1467.LOOK_BASE     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.䑾$鷭 r0 = p004o.C1466.C1467.LOOK_BODY     // Catch:{ NoSuchFieldError -> 0x0021 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
            r1 = 11
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            o.䑾$鷭 r0 = p004o.C1466.C1467.LOOK_BODY2     // Catch:{ NoSuchFieldError -> 0x002c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002c }
            r1 = 14
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002c }
        L_0x002c:
            o.䑾$鷭 r0 = p004o.C1466.C1467.LOOK_CLOTHES_COLOR     // Catch:{ NoSuchFieldError -> 0x0037 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0037 }
            r1 = 8
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0037 }
        L_0x0037:
            o.䑾$鷭 r0 = p004o.C1466.C1467.LOOK_FLOOR     // Catch:{ NoSuchFieldError -> 0x0042 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0042 }
            r1 = 12
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0042 }
        L_0x0042:
            o.䑾$鷭 r0 = p004o.C1466.C1467.LOOK_HAIR     // Catch:{ NoSuchFieldError -> 0x004c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x004c }
        L_0x004c:
            o.䑾$鷭 r0 = p004o.C1466.C1467.LOOK_HAIR_COLOR     // Catch:{ NoSuchFieldError -> 0x0056 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            o.䑾$鷭 r0 = p004o.C1466.C1467.LOOK_HEAD_BOTTOM     // Catch:{ NoSuchFieldError -> 0x0060 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0060 }
        L_0x0060:
            o.䑾$鷭 r0 = p004o.C1466.C1467.LOOK_HEAD_MID     // Catch:{ NoSuchFieldError -> 0x006a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
        L_0x006a:
            o.䑾$鷭 r0 = p004o.C1466.C1467.LOOK_HEAD_TOP     // Catch:{ NoSuchFieldError -> 0x0074 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0074 }
        L_0x0074:
            o.䑾$鷭 r0 = p004o.C1466.C1467.LOOK_ROBE     // Catch:{ NoSuchFieldError -> 0x007f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
            r1 = 13
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x007f }
        L_0x007f:
            o.䑾$鷭 r0 = p004o.C1466.C1467.LOOK_SHIELD     // Catch:{ NoSuchFieldError -> 0x008a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x008a }
            r1 = 9
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x008a }
        L_0x008a:
            o.䑾$鷭 r0 = p004o.C1466.C1467.LOOK_SHOES     // Catch:{ NoSuchFieldError -> 0x0095 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0095 }
            r1 = 10
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0095 }
        L_0x0095:
            o.䑾$鷭 r0 = p004o.C1466.C1467.LOOK_WEAPON     // Catch:{ NoSuchFieldError -> 0x009f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x009f }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x009f }
        L_0x009f:
            f7120 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1466.m2169():int[]");
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        C1919 r3;
        this.f4671 = 471;
        int i3 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        int i4 = C1014.f6140.f4506 ? byteBuffer.getInt() : byteBuffer.getShort();
        int i5 = C1014.f6140.f4506 ? byteBuffer.getInt() : byteBuffer.getShort();
        if (!z && C1014.f6137 != null) {
            C0520le leVar = (C0520le) C1014.f6137.f1637.get(i3);
            if (leVar == null) {
                r3 = null;
            } else {
                C0520le leVar2 = leVar;
                r3 = C1919.class.isAssignableFrom(leVar2.getClass()) ? leVar2 : null;
            }
            if (r3 != null) {
                C1919 r8 = r3;
                C0206bb bbVar = C0206bb.class.isAssignableFrom(r8.getClass()) ? r8 : null;
                C0206bb bbVar2 = bbVar;
                if (bbVar != null && b >= 0 && b < C1467.values().length) {
                    C1467 r4 = C1467.values()[b];
                    if (r4 == null) {
                        C0592ns.m674("invalid changelook type " + b);
                    }
                    switch (m2169()[r4.ordinal()]) {
                        case 1:
                            if (r3.f1633 != i4) {
                                r3.f1633 = i4;
                                if (r3 == C1014.f6137.f1636) {
                                    C0523 r82 = (C0523) C1014.f6158.f674.f626.f1638.get(Integer.valueOf(C1014.f6137.f1636.f1633));
                                    C1014.f6147.f51.f1416.f534.setText(r82 != null ? r82.f1645 : "Poring");
                                    break;
                                }
                            } else {
                                return;
                            }
                            break;
                        case 2:
                            if (bbVar2 != null) {
                                if (bbVar2.f448 != i4) {
                                    bbVar2.f448 = i4;
                                    break;
                                } else {
                                    return;
                                }
                            }
                            break;
                        case 3:
                        case 9:
                            if (bbVar2 != null) {
                                if (bbVar2.f461 != i4 || bbVar2.f457 != i5) {
                                    bbVar2.f461 = i4;
                                    bbVar2.f457 = i5;
                                    break;
                                } else {
                                    return;
                                }
                            }
                            break;
                        case 4:
                            if (bbVar2 != null) {
                                if (bbVar2.f450 != i4) {
                                    bbVar2.f450 = i4;
                                    break;
                                } else {
                                    return;
                                }
                            }
                            break;
                        case 5:
                            if (bbVar2 != null) {
                                if (bbVar2.f456 != i4) {
                                    bbVar2.f456 = i4;
                                    break;
                                } else {
                                    return;
                                }
                            }
                            break;
                        case 6:
                            if (bbVar2 != null) {
                                if (bbVar2.f449 != i4) {
                                    bbVar2.f449 = i4;
                                    break;
                                } else {
                                    return;
                                }
                            }
                            break;
                        case 7:
                            if (bbVar2 != null) {
                                if (bbVar2.f447 != i4) {
                                    bbVar2.f447 = i4;
                                    break;
                                } else {
                                    return;
                                }
                            }
                            break;
                        case 8:
                            if (bbVar2 != null) {
                                if (bbVar2.f460 != i4) {
                                    bbVar2.f460 = i4;
                                    break;
                                } else {
                                    return;
                                }
                            }
                            break;
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                            return;
                        case 13:
                            if (bbVar2 != null) {
                                if (bbVar2.f451 != i4) {
                                    bbVar2.f451 = i4;
                                    break;
                                } else {
                                    return;
                                }
                            }
                            break;
                    }
                    C0548mb mbVar = (C0548mb) C1014.f6142.f1680.f1189.get(Integer.valueOf(i3));
                    if (mbVar != null) {
                        mbVar.mo4018();
                    }
                }
            }
        }
    }
}
