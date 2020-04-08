package p004o;

import p004o.C0766tb.C0768;

/* renamed from: o.확 */
abstract class C2042 {

    /* renamed from: Ȋ */
    private static /* synthetic */ int[] f8944;

    /* renamed from: Ą */
    long f8945;

    /* renamed from: ą */
    long f8946;

    /* renamed from: Ć */
    int f8947;

    /* renamed from: ć */
    C0616on f8948 = new C0616on(1.0f, 1.0f, 1.0f, 1.0f);

    /* renamed from: ȃ */
    int f8949;

    /* renamed from: ˮ͈ */
    int f8950;

    /* renamed from: ˮ͍ */
    C2043 f8951 = C2043.LOOP_ONCE;

    /* renamed from: 岱 */
    float f8952;

    /* renamed from: 櫯 */
    C1341 f8953;

    /* renamed from: 鷭 */
    C0408hl f8954;

    /* renamed from: o.확$鷭 */
    enum C2043 {
        SINGLE_FRAME,
        LOOP_ONCE,
        LOOP_INFINITE
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:3|4|5|6|7|(2:8|9)|10|12) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: ȃ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] mo3986() {
        /*
            int[] r0 = f8944
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.확$鷭[] r0 = p004o.C2042.C2043.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.확$鷭 r0 = p004o.C2042.C2043.LOOP_INFINITE     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.확$鷭 r0 = p004o.C2042.C2043.LOOP_ONCE     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.확$鷭 r0 = p004o.C2042.C2043.SINGLE_FRAME     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            f8944 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C2042.mo3986():int[]");
    }

    C2042(C0408hl hlVar, float f) {
        this.f8954 = hlVar;
        this.f8952 = f;
        if (this.f8954 != null) {
            mo4634(0, System.currentTimeMillis());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4634(int i, long j) {
        int i2 = i;
        this.f8950 = i2 >= this.f8954.f1168.length ? 0 : i2;
        this.f8945 = j;
        this.f8946 = 0;
        int r4 = mo3559(j);
        this.f8949 = r4;
        this.f8947 = r4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public int mo3559(long j) {
        long j2 = j - this.f8945;
        int i = 0;
        if (j2 < 0) {
            j2 = 0;
        }
        switch (mo3986()[this.f8951.ordinal()]) {
            case 1:
                i = this.f8949;
                break;
            case 2:
                i = (int) (j2 / ((long) mo3987()));
                C0408hl hlVar = this.f8954;
                int i2 = this.f8950;
                C0408hl hlVar2 = hlVar;
                if (i2 >= hlVar2.f1168.length) {
                    i2 = 0;
                }
                if (hlVar2.f1168[i2] == null) {
                    hlVar2.mo3785(i2);
                }
                if (i >= hlVar2.f1168[i2].f1171.length) {
                    C0408hl hlVar3 = this.f8954;
                    int i3 = this.f8950;
                    C0408hl hlVar4 = hlVar3;
                    if (i3 >= hlVar4.f1168.length) {
                        i3 = 0;
                    }
                    if (hlVar4.f1168[i3] == null) {
                        hlVar4.mo3785(i3);
                    }
                    i = hlVar4.f1168[i3].f1171.length - 1;
                    break;
                }
                break;
            case 3:
                int r0 = (int) (j2 / ((long) mo3987()));
                C0408hl hlVar5 = this.f8954;
                int i4 = this.f8950;
                C0408hl hlVar6 = hlVar5;
                if (i4 >= hlVar6.f1168.length) {
                    i4 = 0;
                }
                if (hlVar6.f1168[i4] == null) {
                    hlVar6.mo3785(i4);
                }
                i = r0 % hlVar6.f1168[i4].f1171.length;
                break;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public final int mo4633() {
        C0408hl hlVar = this.f8954;
        int i = this.f8950;
        if (i >= hlVar.f1168.length) {
            i = 0;
        }
        if (hlVar.f1168[i] == null) {
            hlVar.mo3785(i);
        }
        return hlVar.f1168[i].f1171.length;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final C0768 mo4631() {
        if (this.f8954.f1166 == null || this.f8954.f1166.f1148 == null) {
            return null;
        }
        return this.f8954.f1166.f1148.f4682[this.f8950];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo4632(long j) {
        this.f8946 = ((long) mo4633()) * j;
    }

    /* renamed from: ˮ͈ */
    private int mo3987() {
        if (this.f8946 == 0) {
            return 100;
        }
        int r4 = mo4633();
        if (r4 == 0 || this.f8946 < ((long) r4)) {
            return 100;
        }
        if (r4 != 0) {
            return ((int) this.f8946) / r4;
        }
        return 100;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final boolean mo4630(long j) {
        int r4 = mo3987();
        int r5 = mo4633();
        if (r5 == 0) {
            return false;
        }
        if (this.f8951 != C2043.LOOP_ONCE) {
            return false;
        }
        return this.f8945 + ((long) (r4 * r5)) < j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public C0410 mo3997(int i) {
        this.f8949 = i;
        C0408hl hlVar = this.f8954;
        int i2 = this.f8950;
        int i3 = i;
        C0408hl hlVar2 = hlVar;
        if (i2 >= hlVar2.f1168.length) {
            i2 = 0;
        }
        if (hlVar2.f1168[i2] == null) {
            hlVar2.mo3785(i2);
        }
        C0409 r5 = hlVar2.f1168[i2];
        return r5.f1171[i3 % r5.f1171.length];
    }
}
