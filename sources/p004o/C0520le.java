package p004o;

import android.util.Log;
import com.roworkshop.andro.c_point;

/* renamed from: o.le */
public abstract class C0520le implements Cloneable {

    /* renamed from: 鷭 */
    private static /* synthetic */ int[] f1628;

    /* renamed from: Ů */
    C0587nn f1629;

    /* renamed from: ů */
    int f1630;

    /* renamed from: ű */
    public int f1631;

    /* renamed from: Ų */
    public c_point f1632 = new c_point();

    /* renamed from: ų */
    int f1633;

    /* renamed from: يٗ */
    public int f1634;

    /* renamed from: చ */
    C0578ne f1635 = C0578ne.MOTION_STAND;

    public /* bridge */ /* synthetic */ Object clone() {
        return (C0520le) super.clone();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(27:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0041 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0055 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0060 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0074 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x007e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0017 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0022 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] mo4581() {
        /*
            int[] r0 = f1628
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.nn[] r0 = p004o.C0587nn.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.nn r0 = p004o.C0587nn.ALL     // Catch:{ NoSuchFieldError -> 0x0017 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
            r1 = 12
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0017 }
        L_0x0017:
            o.nn r0 = p004o.C0587nn.CHAT     // Catch:{ NoSuchFieldError -> 0x0022 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
            r1 = 10
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0022 }
        L_0x0022:
            o.nn r0 = p004o.C0587nn.ELEM     // Catch:{ NoSuchFieldError -> 0x002d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
            r1 = 11
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002d }
        L_0x002d:
            o.nn r0 = p004o.C0587nn.HOM     // Catch:{ NoSuchFieldError -> 0x0037 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0037 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0037 }
        L_0x0037:
            o.nn r0 = p004o.C0587nn.ITEM     // Catch:{ NoSuchFieldError -> 0x0041 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0041 }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0041 }
        L_0x0041:
            o.nn r0 = p004o.C0587nn.MER     // Catch:{ NoSuchFieldError -> 0x004b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            o.nn r0 = p004o.C0587nn.MOB     // Catch:{ NoSuchFieldError -> 0x0055 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0055 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0055 }
        L_0x0055:
            o.nn r0 = p004o.C0587nn.NPC     // Catch:{ NoSuchFieldError -> 0x0060 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
            r1 = 9
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0060 }
        L_0x0060:
            o.nn r0 = p004o.C0587nn.NUL     // Catch:{ NoSuchFieldError -> 0x006a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
        L_0x006a:
            o.nn r0 = p004o.C0587nn.PC     // Catch:{ NoSuchFieldError -> 0x0074 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0074 }
        L_0x0074:
            o.nn r0 = p004o.C0587nn.PET     // Catch:{ NoSuchFieldError -> 0x007e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x007e }
        L_0x007e:
            o.nn r0 = p004o.C0587nn.SKILL     // Catch:{ NoSuchFieldError -> 0x0089 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0089 }
            r1 = 8
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0089 }
        L_0x0089:
            f1628 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0520le.mo4581():int[]");
    }

    @Deprecated
    C0520le() {
    }

    @Deprecated
    C0520le(C0587nn nnVar, int i, int i2, int i3, int i4, int i5, int i6) {
        m557(nnVar, i, i2, i3, i4, i5, i6);
    }

    /* renamed from: 鷭 */
    private void m557(C0587nn nnVar, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f1629 = nnVar;
        this.f1630 = i;
        this.f1633 = i2;
        this.f1634 = i3;
        this.f1631 = i4;
        this.f1632.x = i5;
        this.f1632.y = i6;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public void mo3558(C0603oc ocVar) {
        m557(C0587nn.m665(ocVar), ocVar.f2962, ocVar.f2934, ocVar.f2941.x, ocVar.f2941.y, 0, 0);
    }

    /* renamed from: ˮ͈ */
    public final C0520le mo3952() {
        return (C0520le) super.clone();
    }

    /* renamed from: 櫯 */
    static C1919 m556(C0603oc ocVar) {
        C0587nn r2 = C0587nn.m665(ocVar);
        switch (mo4581()[r2.ordinal()]) {
            case 2:
                return new C0206bb(ocVar);
            case 3:
                return new C1756(ocVar);
            case 4:
                return new C0207bc(ocVar);
            case 5:
                return new C1339(ocVar);
            case 6:
                return new C1598(ocVar);
            case 9:
                return new C0232c(ocVar);
            case 11:
                return new C1373(ocVar);
            default:
                String str = "Unsupported unit type: " + r2;
                Log.e("AndRO", str);
                throw new C0588no(str);
        }
    }
}
