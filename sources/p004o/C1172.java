package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import org.apache.commons.net.nntp.NNTPReply;

/* renamed from: o.ʟ */
final class C1172 extends C0762sz {

    /* renamed from: 鷭 */
    private static /* synthetic */ int[] f6275;

    /* renamed from: o.ʟ$鷭 */
    enum C1173 {
        ALREADY_IN_GUILD,
        REJECTED,
        ACCEPTED,
        GUILD_FULL
    }

    C1172() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:3|4|5|6|7|8|9|(2:10|11)|12|14) */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:3|4|5|6|7|8|9|10|11|12|14) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: ˮ͈ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m1925() {
        /*
            int[] r0 = f6275
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.ʟ$鷭[] r0 = p004o.C1172.C1173.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.ʟ$鷭 r0 = p004o.C1172.C1173.ACCEPTED     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.ʟ$鷭 r0 = p004o.C1172.C1173.ALREADY_IN_GUILD     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.ʟ$鷭 r0 = p004o.C1172.C1173.GUILD_FULL     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.ʟ$鷭 r0 = p004o.C1172.C1173.REJECTED     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            f6275 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1172.m1925():int[]");
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 361;
        byte b = byteBuffer.get();
        if (!z) {
            switch (m1925()[C1173.values()[b].ordinal()]) {
                case 1:
                    C1746 r0 = C1014.f6147.f51.f1427;
                    C0252cp cpVar = C1014.f6158;
                    String r5 = C1014.f6160.mo3796(379);
                    r0.mo4490(r5 == null ? "MSG379" : r5, 16711680);
                    return;
                case 2:
                    C1746 r02 = C1014.f6147.f51.f1427;
                    C0252cp cpVar2 = C1014.f6158;
                    String r52 = C1014.f6160.mo3796(380);
                    r02.mo4490(r52 == null ? "MSG380" : r52, 16711680);
                    return;
                case 3:
                    C1746 r03 = C1014.f6147.f51.f1427;
                    C0252cp cpVar3 = C1014.f6158;
                    String r53 = C1014.f6160.mo3796((int) NNTPReply.MORE_AUTH_INFO_REQUIRED);
                    r03.mo4490(r53 == null ? "MSG381" : r53, (int) SupportMenu.USER_MASK);
                    return;
                case 4:
                    C1746 r04 = C1014.f6147.f51.f1427;
                    C0252cp cpVar4 = C1014.f6158;
                    String r54 = C1014.f6160.mo3796(382);
                    r04.mo4490(r54 == null ? "MSG382" : r54, 16711680);
                    break;
            }
        }
    }
}
