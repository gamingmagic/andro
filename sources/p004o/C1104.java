package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.Ǜ */
final class C1104 extends C0762sz {

    /* renamed from: 鷭 */
    private static /* synthetic */ int[] f6209;

    /* renamed from: o.Ǜ$鷭 */
    enum C1105 {
        SUCCESS(0),
        ERROR(2455),
        NO_MONEY(2457),
        OVERFLOW(2466),
        EXCHANGE_OR_STORE_WINDOW_ACTIVE(2490);
        

        /* renamed from: ą */
        int f6216;

        private C1105(int i) {
            this.f6216 = i;
        }
    }

    C1104() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:3|4|5|6|7|8|9|10|11|12|13|14|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0034 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: ˮ͈ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m1865() {
        /*
            int[] r0 = f6209
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.Ǜ$鷭[] r0 = p004o.C1104.C1105.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.Ǜ$鷭 r0 = p004o.C1104.C1105.ERROR     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.Ǜ$鷭 r0 = p004o.C1104.C1105.EXCHANGE_OR_STORE_WINDOW_ACTIVE     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.Ǜ$鷭 r0 = p004o.C1104.C1105.NO_MONEY     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.Ǜ$鷭 r0 = p004o.C1104.C1105.OVERFLOW     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            o.Ǜ$鷭 r0 = p004o.C1104.C1105.SUCCESS     // Catch:{ NoSuchFieldError -> 0x003e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            f6209 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1104.m1865():int[]");
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2472;
        C1105 r7 = C1105.values()[byteBuffer.getShort()];
        long j = byteBuffer.getLong();
        int i3 = byteBuffer.getInt();
        if (!z) {
            switch (m1865()[r7.ordinal()]) {
                case 1:
                    C1014.f6147.f51.f1443.f7952.setText(String.valueOf(j) + " z");
                    C1014.f6147.f51.f1443.f7953.setText(String.valueOf(i3) + " z");
                    C1014.f6137.f1636.f6542 = i3;
                    C1014.f6147.f51.f1416.mo3585(C1014.f6137.f1636);
                    return;
                default:
                    C1746 r0 = C1014.f6147.f51.f1427;
                    C0252cp cpVar = C1014.f6158;
                    int i4 = r7.f6216;
                    String r72 = C1014.f6160.mo3796(i4);
                    r0.mo4490(r72 == null ? "MSG" + i4 : r72, 16711680);
                    return;
            }
        }
    }
}
