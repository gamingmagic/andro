package p004o;

import com.roworkshop.andro.c_point;

/* renamed from: o.bd */
final class C0208bd extends C0538lu {

    /* renamed from: ē */
    private static /* synthetic */ int[] f464;

    /* renamed from: ċ */
    int f465;

    /* renamed from: Ȋ */
    C0209 f466 = C0209.UNKNOWN;

    /* renamed from: 纫 */
    long f467;

    /* renamed from: o.bd$鷭 */
    enum C0209 {
        UNKNOWN,
        SUCCESS_ROLLING,
        FAIL_ROLLING,
        SUCCESS,
        FAIL
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:3|4|5|6|7|8|9|10|11|12|13|14|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0034 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: ą */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m196() {
        /*
            int[] r0 = f464
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.bd$鷭[] r0 = p004o.C0208bd.C0209.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.bd$鷭 r0 = p004o.C0208bd.C0209.FAIL     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.bd$鷭 r0 = p004o.C0208bd.C0209.FAIL_ROLLING     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.bd$鷭 r0 = p004o.C0208bd.C0209.SUCCESS     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.bd$鷭 r0 = p004o.C0208bd.C0209.SUCCESS_ROLLING     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            o.bd$鷭 r0 = p004o.C0208bd.C0209.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x003e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            f464 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0208bd.m196():int[]");
    }

    C0208bd(int i) {
        super(new C0408hl(new C0405hk("slotmachine", false, false, false)), new c_point(0, 0));
        mo4634(0, System.currentTimeMillis());
        this.f8951 = C2043.LOOP_INFINITE;
        this.f465 = i;
        this.f8946 = 800;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final int mo3559(long j) {
        int i;
        if (this.f466 == null) {
            return super.mo3559(j);
        }
        switch (m196()[this.f466.ordinal()]) {
            case 1:
                i = super.mo3559(j);
                break;
            case 2:
            case 3:
                int r2 = super.mo3559(j);
                int i2 = this.f8949;
                while (true) {
                    if (i2 != r2) {
                        if (i2 == mo4633()) {
                            i2 = -1;
                        }
                        if (this.f466 == C0209.SUCCESS_ROLLING && i2 == 7) {
                            this.f466 = C0209.SUCCESS;
                            this.f467 = j;
                        } else if (this.f466 == C0209.FAIL_ROLLING && i2 == 3) {
                            this.f466 = C0209.FAIL;
                            this.f467 = j;
                        } else {
                            i2++;
                        }
                    }
                }
                i = i2;
                break;
            case 4:
                i = 7;
                break;
            case 5:
                i = 3;
                break;
            default:
                throw new RuntimeException();
        }
        return i;
    }
}
