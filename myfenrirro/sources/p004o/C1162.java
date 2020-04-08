package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;

/* renamed from: o.ʏ */
final class C1162 extends C0762sz {

    /* renamed from: 鷭 */
    private static /* synthetic */ int[] f6262;

    /* renamed from: o.ʏ$鷭 */
    enum C1163 {
        ALREADY_ALLIED,
        REJECTED,
        ACCEPTED,
        THEY_HAVE_TOO_MANY_ALLIES,
        YOU_HAVE_TOO_MANY_ALLIES
    }

    C1162() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:3|4|5|6|7|8|9|10|11|12|13|14|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0034 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: ˮ͈ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m1918() {
        /*
            int[] r0 = f6262
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.ʏ$鷭[] r0 = p004o.C1162.C1163.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.ʏ$鷭 r0 = p004o.C1162.C1163.ACCEPTED     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.ʏ$鷭 r0 = p004o.C1162.C1163.ALREADY_ALLIED     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.ʏ$鷭 r0 = p004o.C1162.C1163.REJECTED     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.ʏ$鷭 r0 = p004o.C1162.C1163.THEY_HAVE_TOO_MANY_ALLIES     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            o.ʏ$鷭 r0 = p004o.C1162.C1163.YOU_HAVE_TOO_MANY_ALLIES     // Catch:{ NoSuchFieldError -> 0x003e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            f6262 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1162.m1918():int[]");
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 371;
        byte b = byteBuffer.get();
        if (!z) {
            switch (m1918()[C1163.values()[b].ordinal()]) {
                case 1:
                    C1746 r0 = C1014.f6147.f51.f1427;
                    C0252cp cpVar = C1014.f6158;
                    String r5 = C1014.f6160.mo3796(395);
                    r0.mo4490(r5 == null ? "MSG395" : r5, 16711680);
                    return;
                case 2:
                    C1746 r02 = C1014.f6147.f51.f1427;
                    C0252cp cpVar2 = C1014.f6158;
                    String r52 = C1014.f6160.mo3796(396);
                    r02.mo4490(r52 == null ? "MSG396" : r52, 16711680);
                    return;
                case 3:
                    C1746 r03 = C1014.f6147.f51.f1427;
                    C0252cp cpVar3 = C1014.f6158;
                    String r53 = C1014.f6160.mo3796(397);
                    r03.mo4490(r53 == null ? "MSG397" : r53, (int) SupportMenu.USER_MASK);
                    return;
                case 4:
                    C1746 r04 = C1014.f6147.f51.f1427;
                    C0252cp cpVar4 = C1014.f6158;
                    String r54 = C1014.f6160.mo3796(398);
                    r04.mo4490(r54 == null ? "MSG398" : r54, 16711680);
                    return;
                case 5:
                    C1746 r05 = C1014.f6147.f51.f1427;
                    C0252cp cpVar5 = C1014.f6158;
                    String r55 = C1014.f6160.mo3796(399);
                    r05.mo4490(r55 == null ? "MSG399" : r55, 16711680);
                    break;
            }
        }
    }
}
