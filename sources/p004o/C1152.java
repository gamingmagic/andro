package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: o.ʂ */
final class C1152 extends C0762sz {

    /* renamed from: 鷭 */
    private static /* synthetic */ int[] f6242;

    /* renamed from: o.ʂ$鷭 */
    enum C1153 {
        ACCEPT,
        DENY,
        YOURLISTFULL,
        HISLISTFULL
    }

    C1152() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:3|4|5|6|7|8|9|(2:10|11)|12|14) */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:3|4|5|6|7|8|9|10|11|12|14) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: ˮ͈ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m1912() {
        /*
            int[] r0 = f6242
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.ʂ$鷭[] r0 = p004o.C1152.C1153.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.ʂ$鷭 r0 = p004o.C1152.C1153.ACCEPT     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.ʂ$鷭 r0 = p004o.C1152.C1153.DENY     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.ʂ$鷭 r0 = p004o.C1152.C1153.HISLISTFULL     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.ʂ$鷭 r0 = p004o.C1152.C1153.YOURLISTFULL     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            f6242 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1152.m1912():int[]");
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 521;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r8 = C0622ot.m741(bArr, opVar);
        if (!z) {
            switch (m1912()[C1153.values()[s].ordinal()]) {
                case 1:
                    C0252cp cpVar = C1014.f6158;
                    String r6 = C1014.f6160.mo3796(822);
                    C1014.f6147.f51.f1427.mo4490(String.format(r6 == null ? "MSG822" : r6, new Object[]{r8}), (int) SupportMenu.USER_MASK);
                    C1014.f6137.f1636.f6519 = (C1671[]) Arrays.copyOf(C1014.f6137.f1636.f6519, C1014.f6137.f1636.f6519.length + 1);
                    C1014.f6152.f7977.put(Integer.valueOf(i4), r8);
                    C1014.f6137.f1636.f6519[C1014.f6137.f1636.f6519.length - 1] = new C1671(i3, i4, true);
                    if (C1014.f6147.f51.f1410.f1626.getParent() != null) {
                        C1014.f6147.f51.f1410.mo4624(false);
                    }
                    if (C1014.f6147.f51.f1422.f1626.getParent() != null) {
                        C1014.f6147.f51.f1422.mo4455b_();
                        return;
                    }
                    break;
                case 2:
                    C0252cp cpVar2 = C1014.f6158;
                    String r62 = C1014.f6160.mo3796(823);
                    C1014.f6147.f51.f1427.mo4490(String.format(r62 == null ? "MSG823" : r62, new Object[]{r8}), 16711680);
                    return;
                case 3:
                    C0252cp cpVar3 = C1014.f6158;
                    String r63 = C1014.f6160.mo3796(820);
                    C1014.f6147.f51.f1427.mo4490(r63 == null ? "MSG820" : r63, 16711680);
                    return;
                case 4:
                    C0252cp cpVar4 = C1014.f6158;
                    String r64 = C1014.f6160.mo3796(821);
                    C1014.f6147.f51.f1427.mo4490(String.format(r64 == null ? "MSG821" : r64, new Object[]{r8}), 16711680);
                    break;
            }
        }
    }
}
