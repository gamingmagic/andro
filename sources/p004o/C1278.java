package p004o;

import java.nio.ByteBuffer;
import org.apache.commons.net.ftp.FTPReply;

/* renamed from: o.Б */
final class C1278 extends C0762sz {

    /* renamed from: 鷭 */
    private static /* synthetic */ int[] f6441;

    /* renamed from: o.Б$鷭 */
    enum C1279 {
        SUCCESS,
        TARGET_OFFLINE,
        IGNORED,
        IGNORED_ALL
    }

    C1278() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:3|4|5|6|7|8|9|(2:10|11)|12|14) */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:3|4|5|6|7|8|9|10|11|12|14) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: ˮ͈ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m2027() {
        /*
            int[] r0 = f6441
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.Б$鷭[] r0 = p004o.C1278.C1279.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.Б$鷭 r0 = p004o.C1278.C1279.IGNORED     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.Б$鷭 r0 = p004o.C1278.C1279.IGNORED_ALL     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.Б$鷭 r0 = p004o.C1278.C1279.SUCCESS     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.Б$鷭 r0 = p004o.C1278.C1279.TARGET_OFFLINE     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            f6441 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1278.m2027():int[]");
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 152;
        byte b = byteBuffer.get();
        if (!z) {
            m2028(b);
        }
    }

    /* renamed from: 鷭 */
    static void m2028(byte b) {
        String str;
        StringBuilder sb;
        C1746 r0;
        switch (m2027()[C1279.values()[b].ordinal()]) {
            case 1:
                C1014.f6147.f51.f1427.mo4489(C1208.f6325);
                r0 = C1014.f6147.f51.f1427;
                sb = new StringBuilder("(To ").append(C1208.f6325).append(") : ");
                str = C1208.f6324;
                break;
            case 2:
                C1746 r02 = C1014.f6147.f51.f1427;
                C0252cp cpVar = C1014.f6158;
                String r4 = C1014.f6160.mo3796(149);
                r02.mo4490(r4 == null ? "MSG149" : r4, 16776960);
                return;
            case 3:
                C1746 r03 = C1014.f6147.f51.f1427;
                StringBuilder sb2 = new StringBuilder(String.valueOf(C1208.f6325));
                C0252cp cpVar2 = C1014.f6158;
                String r42 = C1014.f6160.mo3796((int) FTPReply.FILE_STATUS_OK);
                r03.mo4490(sb2.append(r42 == null ? "MSG150" : r42).toString(), 16776960);
                return;
            case 4:
                r0 = C1014.f6147.f51.f1427;
                sb = new StringBuilder(String.valueOf(C1208.f6325));
                C0252cp cpVar3 = C1014.f6158;
                String r43 = C1014.f6160.mo3796(151);
                if (r43 != null) {
                    str = r43;
                    break;
                } else {
                    str = "MSG151";
                    break;
                }
            default:
        }
        r0.mo4490(sb.append(str).toString(), 16776960);
    }
}
