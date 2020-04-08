package p004o;

import p004o.C0850uo.C0851;

/* renamed from: o.Ĥ */
final class C1028 extends C0852up implements C0838ud {

    /* renamed from: ˮ͍ */
    private static /* synthetic */ int[] f6194;

    C1028() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:3|4|5|6|7|8|9|(2:10|11)|12|14) */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:3|4|5|6|7|8|9|10|11|12|14) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: ą */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m1851() {
        /*
            int[] r0 = f6194
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.uo$鷭[] r0 = p004o.C0850uo.C0851.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.uo$鷭 r0 = p004o.C0850uo.C0851.FAIL_FILE_NOT_EXISTS     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.uo$鷭 r0 = p004o.C0850uo.C0851.FAIL_UNKNOWN_ERROR     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.uo$鷭 r0 = p004o.C0850uo.C0851.SUCCESS_STARTING_TRANSFER     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.uo$鷭 r0 = p004o.C0850uo.C0851.SUCCESS_STARTING_UNPACKED_TRANSFER     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            f6194 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1028.m1851():int[]");
    }

    /* renamed from: 鷭 */
    public final void mo4051() {
        m1852(new String(this.f5087), this.f5088, this.f5085, this.f5086);
    }

    /* renamed from: 鷭 */
    static void m1852(String str, C0851 r10, long j, long j2) {
        C0280do doVar;
        boolean z = true;
        if (C1014.f6149 != null) {
            doVar = C1014.f6149.f729;
        } else if (C1014.f6147.f54 != null) {
            doVar = C1014.f6147.f54;
        } else {
            throw new C0588no();
        }
        switch (m1851()[r10.ordinal()]) {
            case 1:
                break;
            case 2:
                doVar.mo3647();
                return;
            case 3:
                throw new C0588no("Failed to retrieve resource: " + String.valueOf(str));
            case 4:
                z = false;
                break;
            default:
                throw new C0588no();
        }
        doVar.mo3650(str, j, j2, z);
    }
}
