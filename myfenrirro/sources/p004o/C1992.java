package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import android.util.Log;

/* renamed from: o.쎥 */
public final class C1992 implements Cloneable {

    /* renamed from: đ */
    private static /* synthetic */ int[] f8830;

    /* renamed from: Ē */
    private static /* synthetic */ int[] f8831;

    /* renamed from: ܕ */
    private static boolean f8832;

    /* renamed from: 庸 */
    private static /* synthetic */ int[] f8833;

    /* renamed from: 躆 */
    private static int[] f8834 = new int[128];

    /* renamed from: Ą */
    int f8835;

    /* renamed from: ą */
    int f8836;

    /* renamed from: Ć */
    boolean f8837;

    /* renamed from: ć */
    boolean f8838;

    /* renamed from: ċ */
    C1472 f8839;

    /* renamed from: ȃ */
    int f8840;

    /* renamed from: Ȋ */
    long f8841;

    /* renamed from: ˮ͈ */
    int f8842;

    /* renamed from: ˮ͍ */
    boolean f8843;

    /* renamed from: 䒧 */
    C1665 f8844;

    /* renamed from: 岱 */
    int[] f8845;

    /* renamed from: 櫯 */
    int f8846;

    /* renamed from: 纫 */
    int f8847;

    /* renamed from: 鷭 */
    int f8848;

    /* renamed from: o.쎥$鷭 */
    enum C1993 {
        UNKNOWN,
        NAMEID,
        REFINE('%', '%'),
        LOOK(0, '&'),
        CARD('\'', '('),
        OPTIDX(')', '*'),
        OPTUNK('*', '+'),
        OPTVAL('+', ',');
        

        /* renamed from: ˮ͍ */
        char f8858;

        /* renamed from: 岱 */
        char f8859;

        private C1993(char c, char c2) {
            this.f8858 = c;
            this.f8859 = c2;
        }

        /* renamed from: 鷭 */
        static C1993 m2668(char c, boolean z) {
            C1993[] values = values();
            for (int i = 0; i < values.length; i++) {
                if (c == (z ? values[i].f8859 : values[i].f8858)) {
                    return values[i];
                }
            }
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(19:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0034 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0053 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: Ć */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m2655() {
        /*
            int[] r0 = f8833
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.쎥$鷭[] r0 = p004o.C1992.C1993.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.쎥$鷭 r0 = p004o.C1992.C1993.CARD     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.쎥$鷭 r0 = p004o.C1992.C1993.LOOK     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.쎥$鷭 r0 = p004o.C1992.C1993.NAMEID     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.쎥$鷭 r0 = p004o.C1992.C1993.OPTIDX     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            o.쎥$鷭 r0 = p004o.C1992.C1993.OPTUNK     // Catch:{ NoSuchFieldError -> 0x003e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            o.쎥$鷭 r0 = p004o.C1992.C1993.OPTVAL     // Catch:{ NoSuchFieldError -> 0x0049 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
            r1 = 8
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
        L_0x0049:
            o.쎥$鷭 r0 = p004o.C1992.C1993.REFINE     // Catch:{ NoSuchFieldError -> 0x0053 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0053 }
        L_0x0053:
            o.쎥$鷭 r0 = p004o.C1992.C1993.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x005d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x005d }
        L_0x005d:
            f8833 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1992.m2655():int[]");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(42:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|(2:42|43)|44|46) */
    /* JADX WARNING: Can't wrap try/catch for region: R(43:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0042 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0057 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0062 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0077 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0081 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x008c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0097 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00a1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00ac */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00b7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00c2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00cc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00d6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* renamed from: ć */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m2656() {
        /*
            int[] r0 = f8830
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.䒧[] r0 = p004o.C1472.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.䒧 r0 = p004o.C1472.ARMOR     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.䒧 r0 = p004o.C1472.ARROWS     // Catch:{ NoSuchFieldError -> 0x0021 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
            r1 = 11
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            o.䒧 r0 = p004o.C1472.BOW     // Catch:{ NoSuchFieldError -> 0x002c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002c }
            r1 = 9
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002c }
        L_0x002c:
            o.䒧 r0 = p004o.C1472.BULLETS     // Catch:{ NoSuchFieldError -> 0x0037 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0037 }
            r1 = 17
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0037 }
        L_0x0037:
            o.䒧 r0 = p004o.C1472.CANNONBALL     // Catch:{ NoSuchFieldError -> 0x0042 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0042 }
            r1 = 20
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0042 }
        L_0x0042:
            o.䒧 r0 = p004o.C1472.CARD     // Catch:{ NoSuchFieldError -> 0x004c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x004c }
        L_0x004c:
            o.䒧 r0 = p004o.C1472.CASH     // Catch:{ NoSuchFieldError -> 0x0057 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0057 }
            r1 = 19
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0057 }
        L_0x0057:
            o.䒧 r0 = p004o.C1472.DELAYCONSUME     // Catch:{ NoSuchFieldError -> 0x0062 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
            r1 = 12
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0062 }
        L_0x0062:
            o.䒧 r0 = p004o.C1472.ETC     // Catch:{ NoSuchFieldError -> 0x006c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x006c }
        L_0x006c:
            o.䒧 r0 = p004o.C1472.GUN     // Catch:{ NoSuchFieldError -> 0x0077 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
            r1 = 16
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0077 }
        L_0x0077:
            o.䒧 r0 = p004o.C1472.HEALING     // Catch:{ NoSuchFieldError -> 0x0081 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0081 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0081 }
        L_0x0081:
            o.䒧 r0 = p004o.C1472.PETEGG     // Catch:{ NoSuchFieldError -> 0x008c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
            r1 = 8
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x008c }
        L_0x008c:
            o.䒧 r0 = p004o.C1472.THROWWEAPON     // Catch:{ NoSuchFieldError -> 0x0097 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
            r1 = 18
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0097 }
        L_0x0097:
            o.䒧 r0 = p004o.C1472.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x00a1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a1 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00a1 }
        L_0x00a1:
            o.䒧 r0 = p004o.C1472.UNUSED1     // Catch:{ NoSuchFieldError -> 0x00ac }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ac }
            r1 = 13
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00ac }
        L_0x00ac:
            o.䒧 r0 = p004o.C1472.UNUSED2     // Catch:{ NoSuchFieldError -> 0x00b7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b7 }
            r1 = 14
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00b7 }
        L_0x00b7:
            o.䒧 r0 = p004o.C1472.UNUSED3     // Catch:{ NoSuchFieldError -> 0x00c2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c2 }
            r1 = 15
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00c2 }
        L_0x00c2:
            o.䒧 r0 = p004o.C1472.USABLE     // Catch:{ NoSuchFieldError -> 0x00cc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00cc }
        L_0x00cc:
            o.䒧 r0 = p004o.C1472.WEAPON     // Catch:{ NoSuchFieldError -> 0x00d6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d6 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00d6 }
        L_0x00d6:
            o.䒧 r0 = p004o.C1472.WEAPON_TWOHAND     // Catch:{ NoSuchFieldError -> 0x00e1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e1 }
            r1 = 10
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00e1 }
        L_0x00e1:
            f8830 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1992.m2656():int[]");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(22:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|(2:22|23)|24|26) */
    /* JADX WARNING: Can't wrap try/catch for region: R(23:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0036 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0040 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0054 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x005f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0069 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0017 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* renamed from: ˮ͍ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m2657() {
        /*
            int[] r0 = f8831
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.櫯[] r0 = p004o.C1653.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.櫯 r0 = p004o.C1653.DARK     // Catch:{ NoSuchFieldError -> 0x0017 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
            r1 = 8
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0017 }
        L_0x0017:
            o.櫯 r0 = p004o.C1653.EARTH     // Catch:{ NoSuchFieldError -> 0x0021 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            o.櫯 r0 = p004o.C1653.FIRE     // Catch:{ NoSuchFieldError -> 0x002b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002b }
        L_0x002b:
            o.櫯 r0 = p004o.C1653.GHOST     // Catch:{ NoSuchFieldError -> 0x0036 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0036 }
            r1 = 9
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0036 }
        L_0x0036:
            o.櫯 r0 = p004o.C1653.HOLY     // Catch:{ NoSuchFieldError -> 0x0040 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            o.櫯 r0 = p004o.C1653.NEUTRAL     // Catch:{ NoSuchFieldError -> 0x004a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004a }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x004a }
        L_0x004a:
            o.櫯 r0 = p004o.C1653.POISON     // Catch:{ NoSuchFieldError -> 0x0054 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
        L_0x0054:
            o.櫯 r0 = p004o.C1653.UNDEAD     // Catch:{ NoSuchFieldError -> 0x005f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
            r1 = 10
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x005f }
        L_0x005f:
            o.櫯 r0 = p004o.C1653.WATER     // Catch:{ NoSuchFieldError -> 0x0069 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0069 }
        L_0x0069:
            o.櫯 r0 = p004o.C1653.WIND     // Catch:{ NoSuchFieldError -> 0x0073 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0073 }
        L_0x0073:
            f8831 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1992.m2657():int[]");
    }

    public C1992(int i) {
        this(i, 1, true);
    }

    public C1992(int i, int i2, boolean z) {
        int i3 = i;
        C1701 r1 = C1014.f6158.f674.f608.mo4465(C0622ot.m731((short) i));
        this(i3, i2, true, r1 == null ? null : r1.f7765);
    }

    public C1992(int i, int i2, boolean z, C1472 r19) {
        this(i, i2, 0, r19, false, true, false, 0, 0, 0, null, 0, 0, null);
    }

    static {
    }

    /* renamed from: 鷭 */
    static C1992 m2658(String str) {
        int i;
        boolean z = false;
        if (str.contains("&")) {
            z = true;
        }
        int i2 = 6;
        int i3 = 6;
        C1993 r18 = C1993.NAMEID;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short[] sArr = new short[4];
        C0842uh[] uhVarArr = new C0842uh[5];
        for (int i9 = 0; i9 < uhVarArr.length; i9++) {
            uhVarArr[i9] = new C0842uh();
        }
        while (true) {
            C1993 r26 = C1993.NAMEID;
            i3++;
            if (i3 < str.length()) {
                r26 = C1993.m2668(str.charAt(i3), z);
                if (r26 == null) {
                    continue;
                }
            }
            int i10 = i3 - i2;
            int i11 = i2;
            String str2 = str;
            int i12 = 0;
            if (!f8832) {
                for (int i13 = 0; i13 < 62; i13++) {
                    f8834["0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(i13)] = i13;
                }
                f8832 = true;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= i10) {
                    i = i12;
                } else {
                    char charAt = str2.charAt(((i11 + i10) - 1) - i14);
                    if (charAt != '0') {
                        if (charAt < 0 || f8834[charAt] <= 0) {
                            C0592ns.m674(String.format("link_chars2num: item link %s contains invalid character at position %d.\n", new Object[]{str2, Integer.valueOf(i11 + i14)}));
                            i = -1;
                        } else {
                            i12 += f8834[charAt] * ((int) Math.pow(62.0d, (double) i14));
                        }
                    }
                    i14++;
                }
            }
            i2 = i3 + 1;
            switch (m2655()[r18.ordinal()]) {
                case 2:
                    i6 = i;
                    break;
                case 3:
                    i7 = i;
                    break;
                case 4:
                    i8 = i;
                    break;
                case 5:
                    int i15 = i4;
                    i4++;
                    sArr[i15] = (short) i;
                    break;
                case 6:
                    uhVarArr[i5].f5061 = (short) i;
                    break;
                case 7:
                    uhVarArr[i5].f5059 = (byte) i;
                    break;
                case 8:
                    int i16 = i5;
                    i5++;
                    uhVarArr[i16].f5060 = (short) i;
                    break;
                default:
                    C0592ns.m674(String.format("c_item.from_itemlink: unknown token type for item %s at position %d\n", new Object[]{str, Integer.valueOf(i2)}));
                    break;
            }
            if (i3 != str.length()) {
                r18 = r26;
            } else {
                C1701 r262 = C1014.f6158.f674.f608.mo4465(i6);
                if (r262 == null) {
                    return null;
                }
                for (int i17 = 0; i17 < sArr.length; i17++) {
                    if (sArr[i17] != 0 && C1014.f6158.f674.f608.mo4465(C0622ot.m731(sArr[i17])) == null) {
                        return null;
                    }
                }
                int i18 = i6;
                int i19 = i7;
                C1701 r33 = C1014.f6158.f674.f608.mo4465(i6);
                return new C1992(i18, 1, i19, r33 == null ? null : r33.f7765, false, true, false, 0, 0, z ? i8 : r262.f7762, new C1111(sArr), 0, 0, new C1665(uhVarArr));
            }
        }
    }

    public C1992(int i, int i2, int i3, C1472 r6, boolean z, boolean z2, boolean z3, int i4, int i5, int i6, C1111 r13, int i7, int i8, C1665 r16) {
        this.f8845 = new int[4];
        this.f8848 = C1014.f6140.f4506 ? i : C0622ot.m731((short) i);
        this.f8846 = i2;
        this.f8842 = i3;
        this.f8839 = r6;
        this.f8838 = z;
        this.f8837 = z2;
        this.f8843 = z3;
        this.f8835 = i4;
        this.f8836 = i5;
        this.f8840 = i6;
        if (r13 != null) {
            for (int i9 = 0; i9 < this.f8845.length; i9++) {
                this.f8845[i9] = r13.f6219[i9];
            }
        }
        this.f8841 = (long) i7;
        this.f8847 = i8;
        this.f8844 = r16;
    }

    C1992(C1510 r16) {
        this(r16.f7262, r16.f7260, 0, C1472.values()[r16.f7261], (r16.f7259 & 2) != 0, (r16.f7259 & 1) != 0, (r16.f7259 & 4) != 0, r16.f7256, 0, 0, r16.f7257, r16.f7258, 0, null);
    }

    C1992(C1888 r16) {
        this(r16.f8524, 1, r16.f8515, C1472.values()[r16.f8521], (r16.f8525 & 2) != 0, (r16.f8525 & 1) != 0, (r16.f8525 & 4) != 0, r16.f8519, r16.f8514, r16.f8523, r16.f8516, r16.f8517, r16.f8522, r16.f8518);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final int mo4613() {
        if (this.f8835 != 0) {
            return this.f8835;
        }
        switch (m2656()[this.f8839.ordinal()]) {
            case 11:
            case 17:
            case 18:
            case 20:
                return 32768;
            default:
                return 0;
        }
    }

    /* renamed from: 櫯 */
    public final C1992 mo4612() {
        try {
            return (C1992) clone();
        } catch (CloneNotSupportedException e) {
            Log.e("AndRO", e.toString());
            RuntimeException runtimeException = new RuntimeException(e.toString());
            runtimeException.setStackTrace(e.getStackTrace());
            throw runtimeException;
        }
    }

    /* renamed from: ˮ͈ */
    public final String mo4611() {
        return mo4615(C1014.f6158.f674.f608);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0286  */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo4615(p004o.C1708 r12) {
        /*
            r11 = this;
            int r0 = r11.f8848
            o.硝 r3 = r12.mo4465(r0)
            if (r3 != 0) goto L_0x0023
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.all
            if (r0 != r1) goto L_0x0020
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unk"
            r0.<init>(r1)
            int r1 = r11.f8848
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0020:
            java.lang.String r0 = "Unknown Item"
            return r0
        L_0x0023:
            boolean r0 = r11.f8837
            java.lang.String r4 = r3.mo4462(r0)
            boolean r0 = r11.f8837
            if (r0 != 0) goto L_0x002e
            return r4
        L_0x002e:
            r5 = 0
            o.缟 r0 = p004o.C1014.f6152
            if (r0 == 0) goto L_0x0092
            int[] r0 = r11.f8845
            r1 = 0
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            if (r0 == r1) goto L_0x0045
            int[] r0 = r11.f8845
            r1 = 0
            r0 = r0[r1]
            r1 = 254(0xfe, float:3.56E-43)
            if (r0 != r1) goto L_0x0092
        L_0x0045:
            r9 = r11
            int[] r0 = r11.f8845
            r1 = 2
            r0 = r0[r1]
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            int[] r1 = r9.f8845
            r2 = 3
            r1 = r1[r2]
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            int r1 = r1 << 16
            r6 = r0 | r1
            o.缟 r0 = p004o.C1014.f6152
            java.util.HashMap<java.lang.Integer, java.lang.String> r0 = r0.f7977
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
            if (r5 != 0) goto L_0x0092
            o.㯲 r0 = p004o.C1014.f6144
            o.ƫ r1 = new o.ƫ
            r1.<init>(r6)
            r0.mo3652(r1)
            o.cp r0 = p004o.C1014.f6158
            o.hp r0 = p004o.C1014.f6160
            r1 = 677(0x2a5, float:9.49E-43)
            java.lang.String r10 = r0.mo3796(r1)
            if (r10 != 0) goto L_0x0086
            java.lang.String r5 = "MSG677"
            goto L_0x0087
        L_0x0086:
            r5 = r10
        L_0x0087:
            o.缟 r0 = p004o.C1014.f6152
            java.util.HashMap<java.lang.Integer, java.lang.String> r0 = r0.f7977
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r0.put(r1, r5)
        L_0x0092:
            r6 = 0
            r7 = 0
            int[] r0 = r11.f8845
            r1 = 0
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L_0x0166
            o.櫯 r0 = p004o.C1653.NEUTRAL
            int[] r0 = r11.f8845
            r1 = 1
            r0 = r0[r1]
            r9 = r0 & 255(0xff, float:3.57E-43)
            if (r9 < 0) goto L_0x00af
            o.櫯[] r0 = p004o.C1653.values()
            int r0 = r0.length
            if (r9 < r0) goto L_0x00c2
        L_0x00af:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected weapon element "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.String r0 = r0.toString()
            p004o.C0592ns.m674(r0)
            return r4
        L_0x00c2:
            o.櫯[] r0 = p004o.C1653.values()
            r8 = r0[r9]
            int[] r0 = m2657()
            int r1 = r8.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x00e4;
                case 2: goto L_0x00ea;
                case 3: goto L_0x00f0;
                case 4: goto L_0x00e7;
                case 5: goto L_0x00ed;
                default: goto L_0x00d5;
            }
        L_0x00d5:
            goto L_0x00f3
        L_0x00e4:
            r10 = 451(0x1c3, float:6.32E-43)
            goto L_0x0106
        L_0x00e7:
            r10 = 452(0x1c4, float:6.33E-43)
            goto L_0x0106
        L_0x00ea:
            r10 = 453(0x1c5, float:6.35E-43)
            goto L_0x0106
        L_0x00ed:
            r10 = 454(0x1c6, float:6.36E-43)
            goto L_0x0106
        L_0x00f0:
            r10 = 455(0x1c7, float:6.38E-43)
            goto L_0x0106
        L_0x00f3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected weapon element "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.String r0 = r0.toString()
            p004o.C0592ns.m674(r0)
            return r4
        L_0x0106:
            o.cp r0 = p004o.C1014.f6158
            r9 = r10
            o.hp r0 = p004o.C1014.f6160
            java.lang.String r10 = r0.mo3796(r9)
            if (r10 != 0) goto L_0x0121
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MSG"
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.String r6 = r0.toString()
            goto L_0x0122
        L_0x0121:
            r6 = r10
        L_0x0122:
            int[] r0 = r11.f8845
            r1 = 1
            r0 = r0[r1]
            r1 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r1
            int r0 = r0 >>> 8
            int r8 = r0 / 5
            if (r8 < 0) goto L_0x0134
            r0 = 3
            if (r8 <= r0) goto L_0x0147
        L_0x0134:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected star crumb count "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.String r0 = r0.toString()
            p004o.C0592ns.m674(r0)
            return r4
        L_0x0147:
            if (r8 == 0) goto L_0x0166
            o.cp r0 = p004o.C1014.f6158
            int r9 = r8 + 459
            o.hp r0 = p004o.C1014.f6160
            java.lang.String r10 = r0.mo3796(r9)
            if (r10 != 0) goto L_0x0165
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MSG"
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.String r7 = r0.toString()
            goto L_0x0166
        L_0x0165:
            r7 = r10
        L_0x0166:
            java.lang.String r8 = ""
            int[] r0 = r11.f8845
            r1 = 0
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            if (r0 == r1) goto L_0x01d4
            int[] r0 = r11.f8845
            r1 = 0
            r0 = r0[r1]
            r1 = 254(0xfe, float:3.56E-43)
            if (r0 == r1) goto L_0x01d4
            int[] r0 = r11.f8845
            r1 = 0
            r0 = r0[r1]
            r1 = 65280(0xff00, float:9.1477E-41)
            if (r0 == r1) goto L_0x01d4
            r9 = 0
            goto L_0x01cf
        L_0x0187:
            int[] r0 = r11.f8845
            r0 = r0[r9]
            if (r0 <= 0) goto L_0x01cd
            int[] r0 = r11.f8845
            r0 = r0[r9]
            o.硝 r10 = r12.mo4465(r0)
            if (r10 != 0) goto L_0x01ab
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r8)
            r0.<init>(r1)
            java.lang.String r1 = "[???]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r8 = r0.toString()
            goto L_0x01cd
        L_0x01ab:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r8)
            r0.<init>(r1)
            java.lang.String r1 = "["
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 1
            java.lang.String r1 = r10.mo4462(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r8 = r0.toString()
        L_0x01cd:
            int r9 = r9 + 1
        L_0x01cf:
            int[] r0 = r11.f8845
            int r0 = r0.length
            if (r9 < r0) goto L_0x0187
        L_0x01d4:
            java.lang.String r9 = ""
            int r0 = r11.f8842
            if (r0 <= 0) goto L_0x01f9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r9)
            r0.<init>(r1)
            java.lang.String r1 = "+"
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r11.f8842
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r9 = r0.toString()
        L_0x01f9:
            if (r7 == 0) goto L_0x0212
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r9)
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r9 = r0.toString()
        L_0x0212:
            if (r6 == 0) goto L_0x0223
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r9)
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            r1 = r6
            goto L_0x0242
        L_0x0223:
            if (r5 == 0) goto L_0x0250
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r9)
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            o.cp r1 = p004o.C1014.f6158
            o.hp r1 = p004o.C1014.f6160
            r2 = 451(0x1c3, float:6.32E-43)
            java.lang.String r10 = r1.mo3796(r2)
            if (r10 != 0) goto L_0x0241
            java.lang.String r1 = "MSG451"
            goto L_0x0242
        L_0x0241:
            r1 = r10
        L_0x0242:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r9 = r0.toString()
        L_0x0250:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r9)
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r9 = r0.toString()
            int r0 = r3.f7761
            if (r0 <= 0) goto L_0x0284
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r9)
            r0.<init>(r1)
            java.lang.String r1 = " ["
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r3.f7761
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r9 = r0.toString()
        L_0x0284:
            if (r8 == 0) goto L_0x0297
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r9)
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.String r9 = r0.toString()
        L_0x0297:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1992.mo4615(o.祛):java.lang.String");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ȃ */
    public final int mo4610() {
        if (this.f8839 == null) {
            return -4473925;
        }
        switch (m2656()[this.f8839.ordinal()]) {
            case 1:
            case 3:
            case 12:
            case 19:
                return -4473925;
            case 5:
            case 6:
            case 10:
                if (!this.f8837) {
                    return -7829368;
                }
                if (this.f8838) {
                    return SupportMenu.CATEGORY_MASK;
                }
                return -4473925;
            default:
                return -4473925;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final boolean mo4616(C1992 r8) {
        boolean z;
        if (this.f8848 == r8.f8848 && this.f8842 == r8.f8842 && this.f8840 == r8.f8840 && this.f8837 == r8.f8837 && this.f8838 == r8.f8838 && this.f8843 == r8.f8843) {
            C1992 r5 = r8;
            if (this.f8845 == null || r5.f8845 == null) {
                z = this.f8845 == r5.f8845;
            } else {
                int i = 0;
                while (true) {
                    if (i >= this.f8845.length) {
                        z = true;
                        break;
                    } else if (this.f8845[i] != r5.f8845[i]) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (z && this.f8841 == r8.f8841 && this.f8839 == r8.f8839) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ą */
    public final boolean mo4608() {
        switch (m2656()[this.f8839.ordinal()]) {
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 16:
                return false;
            default:
                return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ą */
    public final boolean mo4609() {
        return this.f8845[0] == 255 || this.f8845[0] == 254 || this.f8845[0] == 65280;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final String mo4614(int i) {
        short s = this.f8844.f7643[i].f7647;
        short s2 = this.f8844.f7643[i].f7646;
        if (s <= 0 || s >= C1014.f6158.f674.f618.f766) {
            return null;
        }
        if (s2 > 0) {
            C0283 r4 = (C0283) C1014.f6158.f674.f618.f767.get(Integer.valueOf(s));
            return String.format(r4 == null ? "No Description" : r4.f769, new Object[]{Short.valueOf(s2)});
        }
        C0283 r42 = (C0283) C1014.f6158.f674.f618.f767.get(Integer.valueOf(s));
        return r42 == null ? "No Description" : r42.f769;
    }
}
