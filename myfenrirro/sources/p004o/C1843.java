package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.魡 */
final class C1843 extends C0762sz {

    /* renamed from: 鷭 */
    private static /* synthetic */ int[] f8435;

    C1843() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:3|4|5|6|7|8|9|(2:10|11)|12|14) */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:3|4|5|6|7|8|9|10|11|12|14) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: ˮ͈ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m2517() {
        /*
            int[] r0 = f8435
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.ۊ[] r0 = p004o.C1320.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.ۊ r0 = p004o.C1320.CART     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.ۊ r0 = p004o.C1320.GUILDSTORAGE     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.ۊ r0 = p004o.C1320.INVENTORY     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.ۊ r0 = p004o.C1320.STORAGE     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            f8435 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1843.m2517():int[]");
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2825;
        byte b = C1014.f6140.f4501 ? byteBuffer.get() : 0;
        C1510[] r3 = new C1510[i];
        for (int i3 = 0; i3 < i; i3++) {
            r3[i3] = C1510.m2208(byteBuffer, C1014.f6140.f4470, C1014.f6140.f4470 >= 20120712);
        }
        if (!z && b >= 0 && b < C1320.values().length) {
            switch (m2517()[C1320.values()[b].ordinal()]) {
                case 1:
                    C1197.m1952(r3);
                    return;
                case 2:
                    C1115.m1875(r3);
                    return;
                case 3:
                case 4:
                    C1544.m2231(r3);
                    break;
            }
        }
    }
}
