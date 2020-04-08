package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;

/* renamed from: o.ˮ̨ */
final class C1228 extends C0762sz {

    /* renamed from: 鷭 */
    private static /* synthetic */ int[] f6365;

    /* renamed from: o.ˮ̨$鷭 */
    enum C1229 {
        ALREADY_IN_A_PARTY,
        REJECTED,
        ACCEPTED,
        PARTY_IS_FULL,
        SAME_ACCOUNT_IN_YOUR_PARTY
    }

    C1228() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:3|4|5|6|7|8|9|10|11|12|13|14|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0034 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: ˮ͈ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m1980() {
        /*
            int[] r0 = f6365
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.ˮ̨$鷭[] r0 = p004o.C1228.C1229.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.ˮ̨$鷭 r0 = p004o.C1228.C1229.ACCEPTED     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.ˮ̨$鷭 r0 = p004o.C1228.C1229.ALREADY_IN_A_PARTY     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.ˮ̨$鷭 r0 = p004o.C1228.C1229.PARTY_IS_FULL     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.ˮ̨$鷭 r0 = p004o.C1228.C1229.REJECTED     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            o.ˮ̨$鷭 r0 = p004o.C1228.C1229.SAME_ACCOUNT_IN_YOUR_PARTY     // Catch:{ NoSuchFieldError -> 0x003e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            f6365 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1228.m1980():int[]");
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 709;
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        C0622ot.m741(bArr, opVar);
        int i3 = byteBuffer.getInt();
        if (!z) {
            m1981(i3);
        }
    }

    /* renamed from: 鷭 */
    static void m1981(int i) {
        switch (m1980()[C1229.values()[i].ordinal()]) {
            case 1:
                C1746 r0 = C1014.f6147.f51.f1427;
                C0252cp cpVar = C1014.f6158;
                String r3 = C1014.f6160.mo3796(80);
                r0.mo4490(r3 == null ? "MSG80" : r3, 16711680);
                return;
            case 2:
                C1746 r02 = C1014.f6147.f51.f1427;
                C0252cp cpVar2 = C1014.f6158;
                String r32 = C1014.f6160.mo3796(82);
                r02.mo4490(r32 == null ? "MSG82" : r32, 16711680);
                return;
            case 3:
                C1746 r03 = C1014.f6147.f51.f1427;
                C0252cp cpVar3 = C1014.f6158;
                String r33 = C1014.f6160.mo3796(83);
                r03.mo4490(r33 == null ? "MSG83" : r33, (int) SupportMenu.USER_MASK);
                return;
            case 4:
                C1746 r04 = C1014.f6147.f51.f1427;
                C0252cp cpVar4 = C1014.f6158;
                String r34 = C1014.f6160.mo3796(84);
                r04.mo4490(r34 == null ? "MSG84" : r34, 16711680);
                return;
            case 5:
                C1746 r05 = C1014.f6147.f51.f1427;
                C0252cp cpVar5 = C1014.f6158;
                String r35 = C1014.f6160.mo3796(609);
                r05.mo4490(r35 == null ? "MSG609" : r35, 16711680);
                break;
        }
    }
}
