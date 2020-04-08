package p004o;

import android.graphics.Point;
import android.util.FloatMath;
import com.roworkshop.andro.c_point;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: o.둆 */
public abstract class C1919 extends C0520le {

    /* renamed from: 廅 */
    private static /* synthetic */ int[] f8631;

    /* renamed from: Ą */
    int f8632;

    /* renamed from: ą */
    int f8633;

    /* renamed from: Ć */
    int f8634;

    /* renamed from: ć */
    int f8635;

    /* renamed from: ċ */
    int f8636;

    /* renamed from: đ */
    int f8637;

    /* renamed from: Ē */
    int f8638;

    /* renamed from: ē */
    byte f8639;

    /* renamed from: Ė */
    HashMap<C0586nm, C0306> f8640 = new HashMap<>();

    /* renamed from: ė */
    int f8641;

    /* renamed from: Ę */
    C1922 f8642;

    /* renamed from: ę */
    C1923 f8643;

    /* renamed from: ȃ */
    int f8644;

    /* renamed from: Ȋ */
    int f8645;

    /* renamed from: ˮ͈ */
    int f8646;

    /* renamed from: ˮ͍ */
    int f8647;

    /* renamed from: ܕ */
    String f8648;

    /* renamed from: ঽ্ */
    C1924 f8649;

    /* renamed from: 㥳 */
    C1920if f8650 = C1920if.UNRESOLVED;

    /* renamed from: 䒧 */
    String f8651;

    /* renamed from: 囃 */
    aux f8652;

    /* renamed from: 岱 */
    int f8653;

    /* renamed from: 庸 */
    int f8654;

    /* renamed from: 廂 */
    C1921 f8655;

    /* renamed from: 櫯 */
    int f8656;

    /* renamed from: 纫 */
    String f8657;

    /* renamed from: 躆 */
    String f8658;

    /* renamed from: 鷭 */
    int f8659;

    /* renamed from: 띥 */
    boolean f8660 = false;

    /* renamed from: o.둆$aux */
    class aux {

        /* renamed from: Ą */
        int f8661;

        /* renamed from: ą */
        int f8662;

        /* renamed from: Ć */
        int f8663;

        /* renamed from: ć */
        int f8664;

        /* renamed from: ȃ */
        int f8665;

        /* renamed from: ˮ͈ */
        Point f8666;

        /* renamed from: ˮ͍ */
        long f8667;

        /* renamed from: 櫯 */
        int f8669;

        /* renamed from: 鷭 */
        int f8670;

        aux() {
        }
    }

    /* renamed from: o.둆$if */
    enum C1920if {
        UNRESOLVED,
        RESOLVING,
        RESOLVED
    }

    /* renamed from: o.둆$Ą */
    class C1921 {

        /* renamed from: ȃ */
        int f8676;

        /* renamed from: ˮ͈ */
        long f8677;

        /* renamed from: 櫯 */
        long f8678;

        /* renamed from: 鷭 */
        int f8679;

        C1921() {
        }
    }

    /* renamed from: o.둆$Ć */
    class C1922 {

        /* renamed from: Ą */
        long f8680;

        /* renamed from: ą */
        long f8681;

        /* renamed from: Ć */
        c_point f8682 = new c_point();

        /* renamed from: ć */
        c_point f8683 = new c_point();

        /* renamed from: ȃ */
        int f8684;

        /* renamed from: ˮ͈ */
        int f8686;

        /* renamed from: ˮ͍ */
        c_point f8687 = new c_point();

        /* renamed from: 岱 */
        c_point f8688 = new c_point();

        /* renamed from: 櫯 */
        byte f8689;

        /* renamed from: 鷭 */
        C0529lm f8690;

        C1922() {
        }
    }

    /* renamed from: o.둆$ȃ */
    class C1923 {

        /* renamed from: Ą */
        short f8691;

        /* renamed from: ą */
        int f8692;

        /* renamed from: Ć */
        long f8693;

        /* renamed from: ȃ */
        int f8695;

        /* renamed from: ˮ͈ */
        int f8696;

        /* renamed from: 櫯 */
        int f8697;

        /* renamed from: 鷭 */
        int f8698;

        C1923() {
        }
    }

    /* renamed from: o.둆$ˮ͈ */
    class C1924 {

        /* renamed from: Ą */
        int f8699;

        /* renamed from: ą */
        int f8700;

        /* renamed from: ȃ */
        int f8702;

        /* renamed from: ˮ͈ */
        int f8703;

        /* renamed from: 櫯 */
        int f8704;

        /* renamed from: 鷭 */
        int f8705;

        C1924() {
        }
    }

    /* renamed from: o.둆$櫯 */
    enum C1925 {
        POSITION_CHANGED,
        POSITION_UNCHANGED,
        FINISHED_WALKING
    }

    /* renamed from: o.둆$鷭 */
    enum C1926 {
        NONE,
        DEAD,
        SIT
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
    /* renamed from: 櫯 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] mo4291() {
        /*
            int[] r0 = f8631
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
            f8631 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1919.mo4291():int[]");
    }

    C1919(C0599nz nzVar, int i, int i2, int i3) {
        super(C0587nn.PC, i, nzVar.f2916, i2, i3, 0, 0);
        this.f8656 = nzVar.f2924;
        this.f8646 = nzVar.f2885;
        this.f8633 = nzVar.f2906;
        this.f8634 = nzVar.f2915;
        this.f8635 = nzVar.f2886;
        this.f8647 = nzVar.f2921;
        this.f8653 = nzVar.f2913;
        this.f8645 = nzVar.f2922;
        this.f8636 = nzVar.f2907;
        this.f8657 = C0622ot.m741(nzVar.f2909, C0618op.LOCAL);
    }

    C1919() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public void mo3558(C0603oc ocVar) {
        super.mo3558(ocVar);
        this.f1633 = ocVar.f2934;
        this.f8656 = ocVar.f2961;
        this.f8644 = ocVar.f2931;
        this.f8632 = ocVar.f2932;
        this.f8646 = ocVar.f2933;
        this.f8633 = ocVar.f2939;
        this.f8634 = ocVar.f2966;
        this.f8636 = ocVar.f2945;
        this.f8639 = (byte) ocVar.f2942;
        this.f8637 = ocVar.f2937;
        this.f8638 = ocVar.f2938;
        this.f8635 = ocVar.f2943;
        this.f8647 = ocVar.f2947;
        this.f1630 = ocVar.f2962;
        byte b = ocVar.f2952;
        if ((C1926.DEAD.ordinal() & b) != 0) {
            mo4580(true);
        } else {
            mo4580(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4580(boolean z) {
        this.f8660 = z;
        if (z) {
            this.f1635 = C0578ne.MOTION_DEAD;
            this.f8642 = null;
            this.f8643 = null;
            if (C1014.f6137.f1636.f6524 != null) {
                C2045 r0 = C1014.f6158.f674.f620;
                C0587nn nnVar = C0587nn.HOM;
                C0521lf lfVar = C1014.f6137;
                r0.mo4635(nnVar);
            }
            if (C1014.f6137.f1636.f6538 != null) {
                C2045 r02 = C1014.f6158.f674.f620;
                C0587nn nnVar2 = C0587nn.MER;
                C0521lf lfVar2 = C1014.f6137;
                r02.mo4635(nnVar2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo4574(boolean z) {
        this.f8643 = null;
        this.f8642 = null;
        if (!z) {
            this.f8655 = null;
        }
        this.f8652 = null;
        this.f1632.x = 0;
        this.f1632.y = 0;
    }

    /* renamed from: 鷭 */
    public final boolean mo4582(C0772tc tcVar, int i, int i2, int i3, int i4, long j) {
        C0529lm lmVar = new C0529lm();
        C0529lm lmVar2 = new C0529lm();
        mo4574(true);
        if (this.f1629 == C0587nn.PC) {
            (C0206bb.class.isAssignableFrom(getClass()) ? this : null).f459 = 0;
        }
        if (!C0593nt.m678(lmVar, i, i2, i3, i4, false, tcVar)) {
            return false;
        }
        if (!C0593nt.m678(lmVar2, this.f1634, this.f1631, i3, i4, false, tcVar)) {
            this.f1634 = i;
            this.f1631 = i2;
            this.f1632.x = 0;
            this.f1632.y = 0;
            lmVar2 = lmVar;
        }
        this.f8642 = new C1922();
        this.f8642.f8680 = System.currentTimeMillis();
        double r15 = 1.0d / (lmVar2.mo3971() / ((lmVar.mo3971() / (1.0d / ((double) this.f8636))) - ((double) (System.currentTimeMillis() - j))));
        this.f8642.f8690 = lmVar2;
        this.f8642.f8684 = r15 > 0.0d ? (int) r15 : this.f8636;
        this.f8642.f8682.set(this.f1634, this.f1631);
        this.f8642.f8683.set(this.f1632.x, this.f1632.y);
        this.f8642.f8687.set(i, i2);
        this.f8642.f8688.set(i3, i4);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4575(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f8649 = new C1924();
        this.f8649.f8705 = i;
        this.f8649.f8702 = i4;
        this.f8649.f8704 = i2;
        this.f8649.f8703 = i3;
        this.f8649.f8699 = i5;
        this.f8649.f8700 = i6;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4579(C0520le leVar, int i, int i2, int i3, short s, int i4) {
        mo4574(false);
        this.f8643 = new C1923();
        this.f8643.f8693 = System.currentTimeMillis();
        this.f8643.f8698 = leVar.f1630;
        this.f8643.f8695 = i3;
        this.f8643.f8697 = i;
        this.f8643.f8696 = i2;
        this.f8643.f8691 = s;
        this.f8643.f8692 = i4;
        mo4578(leVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4577(int i, int i2, long j) {
        mo4574(false);
        this.f8655 = new C1921();
        this.f8655.f8676 = i;
        this.f8655.f8679 = i2;
        this.f8655.f8678 = j;
        this.f8655.f8677 = System.currentTimeMillis();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4576(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        mo4574(false);
        this.f8652 = new aux();
        this.f8652.f8670 = i;
        this.f8652.f8669 = i2;
        this.f8652.f8665 = i3;
        this.f8652.f8666 = null;
        this.f8652.f8661 = i4;
        this.f8652.f8662 = i5;
        this.f8652.f8663 = i6;
        this.f8652.f8664 = i7;
        this.f8652.f8667 = System.currentTimeMillis();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4578(C0520le leVar) {
        this.f8639 = m2591(new Point(leVar.f1634 - this.f1634, leVar.f1631 - this.f1631));
    }

    /* renamed from: 鷭 */
    private static byte m2590(int i, int i2) {
        for (int i3 = 0; i3 < C0593nt.f2859.length; i3++) {
            if (i == C0593nt.f2859[i3] && i2 == C0593nt.f2858[i3]) {
                return (byte) i3;
            }
        }
        return -1;
    }

    /* renamed from: 鷭 */
    static byte m2591(Point point) {
        if (point.x == 0 && point.y == 0) {
            return -1;
        }
        if (point.x == 0) {
            return m2590(0, point.y > 0 ? 1 : -1);
        } else if (point.y == 0) {
            return m2590(point.x > 0 ? 1 : -1, 0);
        } else {
            float f = (float) point.x;
            float f2 = (float) point.y;
            float sqrt = FloatMath.sqrt((f * f) + (f2 * f2));
            float acos = (float) ((Math.acos((double) (f / sqrt)) / 3.141592653589793d) * 180.0d);
            if (f2 / sqrt < 0.0f) {
                acos = -acos;
            }
            float f3 = (acos - 90.0f) + 23.0f;
            while (f3 < 0.0f) {
                f3 += 360.0f;
            }
            return (byte) ((int) (f3 / 45.0f));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final boolean mo4581() {
        boolean z;
        boolean z2;
        if (this == C1014.f6137.f1636) {
            return false;
        }
        switch (mo4291()[this.f1629.ordinal()]) {
            case 3:
                return true;
            case 4:
            case 7:
            case 9:
            case 10:
                return false;
            default:
                if (C1014.f6142 == null || C1014.f6142.f1695 == null) {
                    return false;
                }
                if (C1014.f6137.f1636.f6502 != null && C1014.f6137.f1636.f6502.mo3533(this.f1630) != -1) {
                    return false;
                }
                C1558 r2 = C1014.f6142.f1695;
                switch (C1558.m2248()[r2.f7350.ordinal()]) {
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                        z = true;
                        break;
                    default:
                        switch (C1558.m2243()[r2.f7345.ordinal()]) {
                            case 5:
                            case 6:
                            case 7:
                            case 12:
                            case 13:
                            case 21:
                                z = true;
                                break;
                            default:
                                z = false;
                                break;
                        }
                }
                if (z) {
                    return true;
                }
                C1558 r22 = C1014.f6142.f1695;
                switch (C1558.m2248()[r22.f7350.ordinal()]) {
                    case 4:
                        z2 = true;
                        break;
                    default:
                        switch (C1558.m2243()[r22.f7345.ordinal()]) {
                            case 8:
                            case 9:
                            case 19:
                                z2 = true;
                                break;
                            default:
                                z2 = false;
                                break;
                        }
                }
                if (!z2) {
                    return false;
                }
                if (C1014.f6137.f1636.f8637 == 0) {
                    return true;
                }
                if (C1014.f6137.f1636.f8637 == this.f8637) {
                    return false;
                }
                if (!(C1014.f6137.f1636.f6541 == null || C1014.f6137.f1636.f6541.f7205 == null)) {
                    Iterator it = C1014.f6137.f1636.f6541.f7205.iterator();
                    while (it.hasNext()) {
                        if (((C1507) it.next()).f7243 == this.f8637) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }
}
