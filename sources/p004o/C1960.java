package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.먟 */
final class C1960 extends C0762sz {

    /* renamed from: 鷭 */
    private static /* synthetic */ int[] f8751;

    /* renamed from: o.먟$鷭 */
    enum C1961 {
        CHAR_TOO_FAR,
        CHAR_NOT_EXISTS,
        DEAL_HAS_FAILED,
        ACCEPTED,
        REJECTED
    }

    C1960() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:3|4|5|6|7|8|9|10|11|12|13|14|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0034 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: ˮ͈ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m2626() {
        /*
            int[] r0 = f8751
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.먟$鷭[] r0 = p004o.C1960.C1961.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.먟$鷭 r0 = p004o.C1960.C1961.ACCEPTED     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.먟$鷭 r0 = p004o.C1960.C1961.CHAR_NOT_EXISTS     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.먟$鷭 r0 = p004o.C1960.C1961.CHAR_TOO_FAR     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.먟$鷭 r0 = p004o.C1960.C1961.DEAL_HAS_FAILED     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            o.먟$鷭 r0 = p004o.C1960.C1961.REJECTED     // Catch:{ NoSuchFieldError -> 0x003e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            f8751 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1960.m2626():int[]");
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 501;
        byte b = byteBuffer.get();
        byteBuffer.getInt();
        short s = byteBuffer.getShort();
        if (!z) {
            m2627(b, s);
        }
    }

    /* renamed from: 鷭 */
    static void m2627(byte b, short s) {
        switch (m2626()[C1961.values()[b].ordinal()]) {
            case 1:
                C1746 r0 = C1014.f6147.f51.f1427;
                C0252cp cpVar = C1014.f6158;
                String r4 = C1014.f6160.mo3796(71);
                r0.mo4490(r4 == null ? "MSG71" : r4, 16711680);
                return;
            case 2:
                C1746 r02 = C1014.f6147.f51.f1427;
                C0252cp cpVar2 = C1014.f6158;
                String r42 = C1014.f6160.mo3796(72);
                r02.mo4490(r42 == null ? "MSG72" : r42, 16711680);
                return;
            case 3:
                C1746 r03 = C1014.f6147.f51.f1427;
                C0252cp cpVar3 = C1014.f6158;
                String r43 = C1014.f6160.mo3796(73);
                r03.mo4490(r43 == null ? "MSG73" : r43, 16711680);
                return;
            case 4:
                C1014.f6147.f51.f1384.mo3844();
                C1014.f6147.f51.f1384.mo3847(C1014.f6141.f6187, (int) s);
                C1014.f6147.f51.f1384.mo3537h_();
                break;
            case 5:
                C1746 r04 = C1014.f6147.f51.f1427;
                C0252cp cpVar4 = C1014.f6158;
                String r44 = C1014.f6160.mo3796(70);
                r04.mo4490(r44 == null ? "MSG70" : r44, 16711680);
                return;
        }
    }
}
