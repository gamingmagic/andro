package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;

/* renamed from: o.ˮ̣ */
final class C1223 extends C0762sz {

    /* renamed from: 鷭 */
    private static /* synthetic */ int[] f6352;

    /* renamed from: o.ˮ̣$鷭 */
    enum C1224 {
        SUCCESS,
        PARTY_NAME_ALREADY_EXISTS,
        ALREADY_IN_PARTY
    }

    C1223() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:3|4|5|6|7|(2:8|9)|10|12) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: ˮ͈ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m1975() {
        /*
            int[] r0 = f6352
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.ˮ̣$鷭[] r0 = p004o.C1223.C1224.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.ˮ̣$鷭 r0 = p004o.C1223.C1224.ALREADY_IN_PARTY     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.ˮ̣$鷭 r0 = p004o.C1223.C1224.PARTY_NAME_ALREADY_EXISTS     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.ˮ̣$鷭 r0 = p004o.C1223.C1224.SUCCESS     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            f6352 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1223.m1975():int[]");
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 250;
        byte b = byteBuffer.get();
        if (!z) {
            switch (m1975()[C1224.values()[b].ordinal()]) {
                case 1:
                    C1746 r0 = C1014.f6147.f51.f1427;
                    C0252cp cpVar = C1014.f6158;
                    String r7 = C1014.f6160.mo3796(78);
                    r0.mo4490(r7 == null ? "MSG78" : r7, (int) SupportMenu.USER_MASK);
                    if (C1014.f6137.f1636.f6502 == null) {
                        C1014.f6137.f1636.f6502 = new C0187ak();
                    }
                    C1014.f6137.f1636.f6502.f388 = C1014.f6147.f51.f1417.f412;
                    C1014.f6137.f1636.f6502.f387 = C1014.f6147.f51.f1417.f417;
                    C1014.f6137.f1636.f6502.f386 = new C0188[1];
                    C1014.f6137.f1636.f6502.f386[0] = new C0188();
                    C1014.f6137.f1636.f6502.f386[0].f398 = C1014.f6137.f1636.f1630;
                    C1014.f6137.f1636.f6502.f386[0].f397 = C1014.f6137.f1636.f8657;
                    C1014.f6137.f1636.f6502.f386[0].f396 = C1014.f6142.f1695.f7353;
                    C1014.f6137.f1636.f6502.f386[0].f391 = true;
                    C1014.f6137.f1636.f6502.f386[0].f395 = C0582ni.LEADER;
                    if (C1014.f6147.f51.f1417.f416 == C0579nf.EVEN_SHARE) {
                        C1014.f6144.mo3652((C0839ue) new C1313(C1014.f6147.f51.f1417.f416, C1014.f6147.f51.f1417.f412, C1014.f6147.f51.f1417.f417));
                    }
                    C1014.f6147.f51.f1417.mo3538();
                    C1014.f6147.f51.f1381.mo3537h_();
                    return;
                case 2:
                    C1746 r02 = C1014.f6147.f51.f1427;
                    C0252cp cpVar2 = C1014.f6158;
                    String r72 = C1014.f6160.mo3796(79);
                    r02.mo4490(r72 == null ? "MSG79" : r72, 16711680);
                    return;
                case 3:
                    C1746 r03 = C1014.f6147.f51.f1427;
                    C0252cp cpVar3 = C1014.f6158;
                    String r73 = C1014.f6160.mo3796(80);
                    r03.mo4490(r73 == null ? "MSG80" : r73, 16711680);
                    break;
            }
        }
    }
}
