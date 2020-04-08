package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ɪ */
final class C1142 extends C0762sz {

    /* renamed from: 鷭 */
    private static /* synthetic */ int[] f6240;

    C1142() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(19:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0053 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0017 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* renamed from: ˮ͈ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m1900() {
        /*
            int[] r0 = f6240
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.nd[] r0 = p004o.C0577nd.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.nd r0 = p004o.C0577nd.DROPPED     // Catch:{ NoSuchFieldError -> 0x0017 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
            r1 = 8
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0017 }
        L_0x0017:
            o.nd r0 = p004o.C0577nd.MATERIAL_CHANGED     // Catch:{ NoSuchFieldError -> 0x0021 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            o.nd r0 = p004o.C0577nd.MOVED_TO_CART     // Catch:{ NoSuchFieldError -> 0x002b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002b }
        L_0x002b:
            o.nd r0 = p004o.C0577nd.MOVED_TO_STORAGE     // Catch:{ NoSuchFieldError -> 0x0035 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            o.nd r0 = p004o.C0577nd.NORMAL     // Catch:{ NoSuchFieldError -> 0x003f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003f }
        L_0x003f:
            o.nd r0 = p004o.C0577nd.REFINE_FAILED     // Catch:{ NoSuchFieldError -> 0x0049 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
        L_0x0049:
            o.nd r0 = p004o.C0577nd.SKILL     // Catch:{ NoSuchFieldError -> 0x0053 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0053 }
        L_0x0053:
            o.nd r0 = p004o.C0577nd.SOLD     // Catch:{ NoSuchFieldError -> 0x005d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x005d }
        L_0x005d:
            f6240 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1142.m1900():int[]");
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2042;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        if (!z) {
            m1901(s, s2, s3);
        }
    }

    /* renamed from: 鷭 */
    static void m1901(short s, int i, short s2) {
        String str;
        C0577nd ndVar = C0577nd.values()[s];
        int i2 = i - 2;
        C1992 r3 = (C1992) C1014.f6137.f1636.f6528.get(Integer.valueOf(i2));
        if (r3 != null) {
            C1708 r0 = C1014.f6158.f674.f608;
            int i3 = r3.f8848;
            boolean z = r3.f8837;
            C1701 r4 = r0.mo4465(i3);
            String r42 = r4 == null ? null : r4.mo4462(z);
            switch (m1900()[ndVar.ordinal()]) {
                case 3:
                    str = "You've lost " + r42 + " (" + s2 + ")";
                    break;
                case 5:
                    str = new StringBuilder(String.valueOf(r42)).append(" (").append(s2).append(") has been moved to storage").toString();
                    break;
                case 6:
                    str = new StringBuilder(String.valueOf(r42)).append(" (").append(s2).append(") has been moved to cart").toString();
                    break;
                case 7:
                    str = "You've sold " + r42 + " (" + s2 + ")";
                    break;
                case 8:
                    str = "You've dropped " + r42 + " (" + s2 + ")";
                    break;
                default:
                    str = null;
                    break;
            }
            if (str != null) {
                C1014.f6147.f51.f1427.mo4490(str, 16711680);
            }
            r3.f8846 -= s2;
            if (r3.f8846 <= 0) {
                r3.f8846 = 0;
                C1014.f6137.f1636.f6528.remove(Integer.valueOf(i2));
            }
            C1014.f6147.f51.f1445.mo4536(r3.f8839);
            C1014.f6147.f51.mo3869(r3.f8848, r3.f8846);
            C1246[] r6 = C1246.m2000(r3.f8836);
            if (r6 != null) {
                C1246[] r5 = r6;
                int length = r6.length;
                for (int i4 = 0; i4 < length; i4++) {
                    C1014.f6147.f51.f1420.mo4589(r5[i4], r3, i2);
                }
            }
        }
    }
}
