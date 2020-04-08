package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;

/* renamed from: o.矆 */
final class C1698 extends C0762sz {

    /* renamed from: 鷭 */
    private static /* synthetic */ int[] f7754;

    /* renamed from: o.矆$鷭 */
    enum C1699 {
        SUCCESS,
        TOO_MANY_ANTAGONISTS,
        ALREADY_ANTAGONIST
    }

    C1698() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:3|4|5|6|7|(2:8|9)|10|12) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: ˮ͈ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m2366() {
        /*
            int[] r0 = f7754
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.矆$鷭[] r0 = p004o.C1698.C1699.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.矆$鷭 r0 = p004o.C1698.C1699.ALREADY_ANTAGONIST     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.矆$鷭 r0 = p004o.C1698.C1699.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.矆$鷭 r0 = p004o.C1698.C1699.TOO_MANY_ANTAGONISTS     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            f7754 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1698.m2366():int[]");
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 385;
        byte b = byteBuffer.get();
        if (!z) {
            switch (m2366()[C1699.values()[b].ordinal()]) {
                case 1:
                    C1746 r0 = C1014.f6147.f51.f1427;
                    C0252cp cpVar = C1014.f6158;
                    String r5 = C1014.f6160.mo3796(496);
                    r0.mo4490(r5 == null ? "MSG496" : r5, (int) SupportMenu.USER_MASK);
                    return;
                case 2:
                    C1746 r02 = C1014.f6147.f51.f1427;
                    C0252cp cpVar2 = C1014.f6158;
                    String r52 = C1014.f6160.mo3796(497);
                    r02.mo4490(r52 == null ? "MSG497" : r52, 16711680);
                    return;
                case 3:
                    C1746 r03 = C1014.f6147.f51.f1427;
                    C0252cp cpVar3 = C1014.f6158;
                    String r53 = C1014.f6160.mo3796(498);
                    r03.mo4490(r53 == null ? "MSG498" : r53, 16711680);
                    break;
            }
        }
    }
}
