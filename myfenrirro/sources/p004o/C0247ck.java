package p004o;

import android.util.Log;
import java.util.HashMap;
import org.keplerproject.luajava.LuaState;
import p004o.C0643pc.C0644if;
import p004o.C0643pc.aux;

/* renamed from: o.ck */
public final class C0247ck {

    /* renamed from: ē */
    static int f603 = 8;

    /* renamed from: ė */
    private static /* synthetic */ int[] f604;

    /* renamed from: 띥 */
    static int f605 = 27;

    /* renamed from: Ą */
    public C0352ft f606;

    /* renamed from: ą */
    public C1286 f607;

    /* renamed from: Ć */
    public C1708 f608;

    /* renamed from: ć */
    public C0378gn f609;

    /* renamed from: ċ */
    public C0270de f610;

    /* renamed from: đ */
    public C0373gl f611;

    /* renamed from: Ē */
    HashMap<Integer, C0641pb> f612 = new HashMap<>();

    /* renamed from: Ė */
    private int[] f613 = new int[28];

    /* renamed from: ȃ */
    public C0532lp f614;

    /* renamed from: Ȋ */
    public C0310eg f615;

    /* renamed from: ˮ͈ */
    public C1619 f616;

    /* renamed from: ˮ͍ */
    public C1501 f617;

    /* renamed from: ܕ */
    public C0282dp f618;

    /* renamed from: 㥳 */
    private int[] f619 = new int[28];

    /* renamed from: 䒧 */
    public C2045 f620;

    /* renamed from: 岱 */
    public C2052 f621;

    /* renamed from: 庸 */
    public C0284dq f622;

    /* renamed from: 櫯 */
    public C1714 f623;

    /* renamed from: 纫 */
    public C1863 f624;

    /* renamed from: 躆 */
    public C1517 f625;

    /* renamed from: 鷭 */
    public C0522lg f626;

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
    private static /* synthetic */ int[] m241() {
        /*
            int[] r0 = f604
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
            f604 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0247ck.m241():int[]");
    }

    static {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|(1:4)|5|(1:7)|8|(1:10)(1:11)|12|(1:14)|15|(1:17)|18|19|20|21|22|23|(1:25)|26|27) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x01b8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0247ck(com.roworkshop.andro.c_activity r10, p004o.C0248cl r11, p004o.C0643pc.C0644if r12) {
        /*
            r9 = this;
            r9.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r9.f612 = r0
            r0 = 28
            int[] r0 = new int[r0]
            r9.f619 = r0
            r0 = 28
            int[] r0 = new int[r0]
            r9.f613 = r0
            o.pc$鷭 r0 = p004o.C1014.f6140
            boolean r0 = r0.f4527
            org.keplerproject.luajava.LuaState.loadlibrary(r0)
            r7 = r9
            int[] r0 = r9.f619     // Catch:{ nq -> 0x01df }
            r1 = 1
            r2 = 0
            r0[r2] = r1     // Catch:{ nq -> 0x01df }
            int[] r0 = r7.f619     // Catch:{ nq -> 0x01df }
            r1 = 2
            r2 = 1
            r0[r2] = r1     // Catch:{ nq -> 0x01df }
            int[] r0 = r7.f619     // Catch:{ nq -> 0x01df }
            r1 = 1
            r2 = 2
            r0[r2] = r1     // Catch:{ nq -> 0x01df }
            int[] r0 = r7.f619     // Catch:{ nq -> 0x01df }
            r1 = 7
            r2 = 3
            r0[r2] = r1     // Catch:{ nq -> 0x01df }
            int[] r0 = r7.f619     // Catch:{ nq -> 0x01df }
            r1 = 5
            r2 = 4
            r0[r2] = r1     // Catch:{ nq -> 0x01df }
            int[] r0 = r7.f619     // Catch:{ nq -> 0x01df }
            r1 = 4
            r2 = 5
            r0[r2] = r1     // Catch:{ nq -> 0x01df }
            int[] r0 = r7.f619     // Catch:{ nq -> 0x01df }
            r1 = 3
            r2 = 6
            r0[r2] = r1     // Catch:{ nq -> 0x01df }
            int[] r0 = r7.f619     // Catch:{ nq -> 0x01df }
            r1 = 6
            r2 = 7
            r0[r2] = r1     // Catch:{ nq -> 0x01df }
            int[] r0 = r7.f619     // Catch:{ nq -> 0x01df }
            r1 = 12
            r2 = 11
            r0[r2] = r1     // Catch:{ nq -> 0x01df }
            int[] r0 = r7.f619     // Catch:{ nq -> 0x01df }
            r1 = 11
            r2 = 12
            r0[r2] = r1     // Catch:{ nq -> 0x01df }
            int[] r0 = r7.f613     // Catch:{ nq -> 0x01df }
            r1 = 1
            r2 = 0
            r0[r2] = r1     // Catch:{ nq -> 0x01df }
            int[] r0 = r7.f613     // Catch:{ nq -> 0x01df }
            r1 = 2
            r2 = 1
            r0[r2] = r1     // Catch:{ nq -> 0x01df }
            int[] r0 = r7.f613     // Catch:{ nq -> 0x01df }
            r1 = 4
            r2 = 2
            r0[r2] = r1     // Catch:{ nq -> 0x01df }
            int[] r0 = r7.f613     // Catch:{ nq -> 0x01df }
            r1 = 7
            r2 = 3
            r0[r2] = r1     // Catch:{ nq -> 0x01df }
            int[] r0 = r7.f613     // Catch:{ nq -> 0x01df }
            r1 = 1
            r2 = 4
            r0[r2] = r1     // Catch:{ nq -> 0x01df }
            int[] r0 = r7.f613     // Catch:{ nq -> 0x01df }
            r1 = 3
            r2 = 6
            r0[r2] = r1     // Catch:{ nq -> 0x01df }
            int[] r0 = r7.f613     // Catch:{ nq -> 0x01df }
            r1 = 6
            r2 = 7
            r0[r2] = r1     // Catch:{ nq -> 0x01df }
            int[] r0 = r7.f613     // Catch:{ nq -> 0x01df }
            r1 = 12
            r2 = 8
            r0[r2] = r1     // Catch:{ nq -> 0x01df }
            int[] r0 = r7.f613     // Catch:{ nq -> 0x01df }
            r1 = 10
            r2 = 9
            r0[r2] = r1     // Catch:{ nq -> 0x01df }
            int[] r0 = r7.f613     // Catch:{ nq -> 0x01df }
            r1 = 9
            r2 = 10
            r0[r2] = r1     // Catch:{ nq -> 0x01df }
            int[] r0 = r7.f613     // Catch:{ nq -> 0x01df }
            r1 = 8
            r2 = 12
            r0[r2] = r1     // Catch:{ nq -> 0x01df }
            o.pc$鷭 r0 = p004o.C1014.f6140     // Catch:{ nq -> 0x01df }
            int r0 = r0.f4495     // Catch:{ nq -> 0x01df }
            if (r0 <= 0) goto L_0x00b4
            o.pc$鷭 r0 = p004o.C1014.f6140     // Catch:{ nq -> 0x01df }
            int r0 = r0.f4495     // Catch:{ nq -> 0x01df }
            f605 = r0     // Catch:{ nq -> 0x01df }
        L_0x00b4:
            o.pc$鷭 r0 = p004o.C1014.f6140     // Catch:{ nq -> 0x01df }
            int r0 = r0.f4466     // Catch:{ nq -> 0x01df }
            if (r0 <= 0) goto L_0x00c0
            o.pc$鷭 r0 = p004o.C1014.f6140     // Catch:{ nq -> 0x01df }
            int r0 = r0.f4466     // Catch:{ nq -> 0x01df }
            f603 = r0     // Catch:{ nq -> 0x01df }
        L_0x00c0:
            o.gn r0 = new o.gn     // Catch:{ nq -> 0x01df }
            r0.<init>(r11)     // Catch:{ nq -> 0x01df }
            r9.f609 = r0     // Catch:{ nq -> 0x01df }
            o.祛 r0 = new o.祛     // Catch:{ nq -> 0x01df }
            r0.<init>(r10, r11)     // Catch:{ nq -> 0x01df }
            r9.f608 = r0     // Catch:{ nq -> 0x01df }
            r0 = 2130968577(0x7f040001, float:1.7545812E38)
            byte[] r0 = r10.mo3388(r0)     // Catch:{ nq -> 0x01df }
            o.op r1 = p004o.C0618op.UTF8     // Catch:{ nq -> 0x01df }
            java.lang.String r7 = p004o.C0622ot.m741(r0, r1)     // Catch:{ nq -> 0x01df }
            o.稕 r0 = new o.稕     // Catch:{ nq -> 0x01df }
            r0.<init>(r7)     // Catch:{ nq -> 0x01df }
            r9.f623 = r0     // Catch:{ nq -> 0x01df }
            o.pc$鷭 r0 = p004o.C1014.f6140     // Catch:{ nq -> 0x01df }
            boolean r0 = r0.f4500     // Catch:{ nq -> 0x01df }
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "npcidentity.lub"
            byte[] r7 = r10.mo3389(r0)     // Catch:{ nq -> 0x01df }
            java.lang.String r0 = "jobname.lub"
            byte[] r8 = r10.mo3389(r0)     // Catch:{ nq -> 0x01df }
            goto L_0x0109
        L_0x00f5:
            java.lang.String r0 = "data\\lua files\\datainfo\\npcidentity.lub"
            r1 = 0
            java.lang.Object r0 = r11.mo3613(r0, r1)     // Catch:{ nq -> 0x01df }
            byte[] r0 = (byte[]) r0     // Catch:{ nq -> 0x01df }
            r7 = r0
            java.lang.String r0 = "data\\lua files\\datainfo\\jobname.lub"
            r1 = 0
            java.lang.Object r0 = r11.mo3613(r0, r1)     // Catch:{ nq -> 0x01df }
            byte[] r0 = (byte[]) r0     // Catch:{ nq -> 0x01df }
            r8 = r0
        L_0x0109:
            o.䧲 r0 = new o.䧲     // Catch:{ nq -> 0x01df }
            r0.<init>(r11)     // Catch:{ nq -> 0x01df }
            r9.f617 = r0     // Catch:{ nq -> 0x01df }
            o.lg r0 = new o.lg     // Catch:{ nq -> 0x01df }
            r1 = r12
            r2 = 2130968579(0x7f040003, float:1.7545816E38)
            byte[] r2 = r10.mo3388(r2)     // Catch:{ nq -> 0x01df }
            o.op r3 = p004o.C0618op.UTF8     // Catch:{ nq -> 0x01df }
            java.lang.String r2 = p004o.C0622ot.m741(r2, r3)     // Catch:{ nq -> 0x01df }
            r3 = r7
            r4 = r8
            r5 = 2130968581(0x7f040005, float:1.754582E38)
            byte[] r5 = r10.mo3388(r5)     // Catch:{ nq -> 0x01df }
            o.op r6 = p004o.C0618op.UTF8     // Catch:{ nq -> 0x01df }
            java.lang.String r5 = p004o.C0622ot.m741(r5, r6)     // Catch:{ nq -> 0x01df }
            o.䧲 r6 = r9.f617     // Catch:{ nq -> 0x01df }
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch:{ nq -> 0x01df }
            r9.f626 = r0     // Catch:{ nq -> 0x01df }
            o.摁 r0 = new o.摁     // Catch:{ nq -> 0x01df }
            r0.<init>(r11)     // Catch:{ nq -> 0x01df }
            r9.f616 = r0     // Catch:{ nq -> 0x01df }
            o.lp r0 = new o.lp     // Catch:{ nq -> 0x01df }
            r0.<init>(r11)     // Catch:{ nq -> 0x01df }
            r9.f614 = r0     // Catch:{ nq -> 0x01df }
            o.ѥ r0 = new o.ѥ     // Catch:{ nq -> 0x01df }
            r0.<init>(r11)     // Catch:{ nq -> 0x01df }
            r9.f607 = r0     // Catch:{ nq -> 0x01df }
            r0 = 2130968588(0x7f04000c, float:1.7545834E38)
            byte[] r0 = r10.mo3388(r0)     // Catch:{ nq -> 0x01df }
            o.op r1 = p004o.C0618op.UTF8     // Catch:{ nq -> 0x01df }
            java.lang.String r10 = p004o.C0622ot.m741(r0, r1)     // Catch:{ nq -> 0x01df }
            o.ft r0 = new o.ft     // Catch:{ nq -> 0x01df }
            r0.<init>(r10)     // Catch:{ nq -> 0x01df }
            r9.f606 = r0     // Catch:{ nq -> 0x01df }
            o.휺 r0 = new o.휺     // Catch:{ nq -> 0x01df }
            r0.<init>()     // Catch:{ nq -> 0x01df }
            r9.f620 = r0     // Catch:{ nq -> 0x01df }
            o.ﮍ r0 = new o.ﮍ     // Catch:{ nq -> 0x01df }
            r0.<init>(r11)     // Catch:{ nq -> 0x01df }
            r9.f621 = r0     // Catch:{ nq -> 0x01df }
            o.eg r0 = new o.eg     // Catch:{ nq -> 0x01df }
            r0.<init>(r11)     // Catch:{ nq -> 0x01df }
            r9.f615 = r0     // Catch:{ nq -> 0x01df }
            o.de r0 = new o.de     // Catch:{ nq -> 0x01df }
            r0.<init>(r11)     // Catch:{ nq -> 0x01df }
            r9.f610 = r0     // Catch:{ nq -> 0x01df }
            o.亶 r0 = new o.亶     // Catch:{ nq -> 0x01df }
            r0.<init>(r11)     // Catch:{ nq -> 0x01df }
            r9.f625 = r0     // Catch:{ nq -> 0x01df }
            o.齯 r0 = new o.齯     // Catch:{ nq -> 0x01df }
            r1 = 0
            r0.<init>(r11, r1)     // Catch:{ nq -> 0x01df }
            r9.f624 = r0     // Catch:{ nq -> 0x01df }
            o.pc$鷭 r0 = p004o.C1014.f6140     // Catch:{ nq -> 0x01df }
            boolean r0 = r0.f4456     // Catch:{ nq -> 0x01df }
            if (r0 == 0) goto L_0x0197
            o.dp r0 = new o.dp     // Catch:{ nq -> 0x01df }
            r0.<init>(r11)     // Catch:{ nq -> 0x01df }
            r9.f618 = r0     // Catch:{ nq -> 0x01df }
        L_0x0197:
            o.pc$鷭 r0 = p004o.C1014.f6140     // Catch:{ nq -> 0x01df }
            boolean r0 = r0.f4492     // Catch:{ nq -> 0x01df }
            if (r0 == 0) goto L_0x01a4
            o.dq r0 = new o.dq     // Catch:{ nq -> 0x01df }
            r0.<init>(r11)     // Catch:{ nq -> 0x01df }
            r9.f622 = r0     // Catch:{ nq -> 0x01df }
        L_0x01a4:
            r9.m240(r11)     // Catch:{ nq -> 0x01df }
            o.gl r0 = new o.gl     // Catch:{ tu -> 0x01b8 }
            java.lang.String r1 = "data\\lua files\\signboardlist.lub"
            r2 = 0
            java.lang.Object r1 = r11.mo3613(r1, r2)     // Catch:{ tu -> 0x01b8 }
            byte[] r1 = (byte[]) r1     // Catch:{ tu -> 0x01b8 }
            r0.<init>(r1)     // Catch:{ tu -> 0x01b8 }
            r9.f611 = r0     // Catch:{ tu -> 0x01b8 }
            goto L_0x01bf
        L_0x01b8:
            o.gl r0 = new o.gl     // Catch:{ nq -> 0x01df }
            r0.<init>()     // Catch:{ nq -> 0x01df }
            r9.f611 = r0     // Catch:{ nq -> 0x01df }
        L_0x01bf:
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147     // Catch:{ nq -> 0x01df }
            o.ix r11 = r0.f51     // Catch:{ nq -> 0x01df }
            java.lang.String r8 = "Finished db initialization"
            android.app.AlertDialog r0 = r11.f1370     // Catch:{ nq -> 0x01df }
            if (r0 == 0) goto L_0x01d4
            r10 = r11
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147     // Catch:{ nq -> 0x01df }
            o.jm r1 = new o.jm     // Catch:{ nq -> 0x01df }
            r1.<init>(r10)     // Catch:{ nq -> 0x01df }
            r0.mo3387(r1)     // Catch:{ nq -> 0x01df }
        L_0x01d4:
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147     // Catch:{ nq -> 0x01df }
            o.jk r1 = new o.jk     // Catch:{ nq -> 0x01df }
            r1.<init>(r11, r8)     // Catch:{ nq -> 0x01df }
            r0.mo3387(r1)     // Catch:{ nq -> 0x01df }
            return
        L_0x01df:
            r7 = move-exception
            o.tr r0 = new o.tr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "File format error. Try to delete your client folder "
            r1.<init>(r2)
            java.lang.String r2 = p004o.C0595nv.f2869
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\nLocation:"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r7.f2852
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ": "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r7.f2851
            if (r2 == 0) goto L_0x0208
            java.lang.String r2 = r7.f2851
            goto L_0x020a
        L_0x0208:
            java.lang.String r2 = "unknown error"
        L_0x020a:
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\n."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1
            r0.<init>(r7, r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0247ck.<init>(com.roworkshop.andro.c_activity, o.cl, o.pc$if):void");
    }

    /* renamed from: 鷭 */
    private static C0626ox[] m242(LuaState luaState, String str) {
        int[] iArr = null;
        luaState.pushString(str);
        luaState.getTable(-2);
        if (!luaState.isNil(-1)) {
            iArr = C0591nr.m668(luaState);
        }
        luaState.pop(1);
        int[] iArr2 = iArr;
        if (iArr == null) {
            return null;
        }
        C0626ox[] oxVarArr = new C0626ox[iArr2.length];
        for (int i = 0; i < oxVarArr.length; i++) {
            oxVarArr[i] = C0626ox.m761(iArr2[i]);
        }
        return oxVarArr;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 138 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m240(p004o.C0248cl r7) {
        /*
            r6 = this;
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.ix r4 = r0.f51
            java.lang.String r3 = "Reading skill effect info list"
            android.app.AlertDialog r0 = r4.f1370
            if (r0 == 0) goto L_0x0015
            r2 = r4
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.jm r1 = new o.jm
            r1.<init>(r2)
            r0.mo3387(r1)
        L_0x0015:
            com.roworkshop.andro.c_activity r0 = p004o.C1014.f6147
            o.jk r1 = new o.jk
            r1.<init>(r4, r3)
            r0.mo3387(r1)
            java.util.HashMap<java.lang.Integer, o.pb> r2 = r6.f612
            org.keplerproject.luajava.LuaState r3 = org.keplerproject.luajava.LuaStateFactory.newLuaState()
            r0 = 4
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String r0 = "data\\lua files\\skillinfoz\\skillid.lub"
            r1 = 0
            r4[r1] = r0
            java.lang.String r0 = "data\\lua files\\skilleffectinfo\\actorstate.lub"
            r1 = 1
            r4[r1] = r0
            java.lang.String r0 = "data\\lua files\\skilleffectinfo\\effectid.lub"
            r1 = 2
            r4[r1] = r0
            java.lang.String r0 = "data\\lua files\\skilleffectinfo\\skilleffectinfolist.lub"
            r1 = 3
            r4[r1] = r0
            r5 = 0
            goto L_0x005f
        L_0x003e:
            r0 = r4[r5]     // Catch:{ np -> 0x004b, tu -> 0x0054 }
            r1 = 0
            java.lang.Object r0 = r7.mo3613(r0, r1)     // Catch:{ np -> 0x004b, tu -> 0x0054 }
            byte[] r0 = (byte[]) r0     // Catch:{ np -> 0x004b, tu -> 0x0054 }
            p004o.C0591nr.m673(r3, r0)     // Catch:{ np -> 0x004b, tu -> 0x0054 }
            goto L_0x005d
        L_0x004b:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            p004o.C0592ns.m674(r0)
            return
        L_0x0054:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            p004o.C0592ns.m674(r0)
            return
        L_0x005d:
            int r5 = r5 + 1
        L_0x005f:
            int r0 = r4.length
            if (r5 < r0) goto L_0x003e
            java.lang.String r0 = "SKILL_EFFECT_INFO_LIST"
            r3.getGlobal(r0)
            r3.pushNil()
            goto L_0x00f4
        L_0x006c:
            r0 = -2
            int r5 = r3.toInteger(r0)
            o.pb r7 = new o.pb
            r7.<init>()
            java.lang.String r0 = "waveFileName"
            o.op r1 = p004o.C0618op.KOREAN
            java.lang.String r0 = p004o.C0591nr.m670(r3, r0, r1)
            r7.f4251 = r0
            java.lang.String r0 = "targetWaveFileName"
            o.op r1 = p004o.C0618op.KOREAN
            java.lang.String r0 = p004o.C0591nr.m670(r3, r0, r1)
            r7.f4250 = r0
            java.lang.String r0 = "effectID"
            o.ox[] r0 = m242(r3, r0)
            r7.f4248 = r0
            java.lang.String r0 = "targetEffectID"
            o.ox[] r0 = m242(r3, r0)
            r7.f4247 = r0
            java.lang.String r0 = "groundEffectID"
            o.ox[] r0 = m242(r3, r0)
            r7.f4243 = r0
            java.lang.String r0 = "beginEffectID"
            int r0 = p004o.C0591nr.m669(r3, r0)
            o.ox r0 = p004o.C0626ox.m761(r0)
            r7.f4244 = r0
            java.lang.String r0 = "onTarget"
            int r0 = p004o.C0591nr.m669(r3, r0)
            if (r0 == 0) goto L_0x00b8
            r0 = 1
            goto L_0x00b9
        L_0x00b8:
            r0 = 0
        L_0x00b9:
            r7.f4245 = r0
            java.lang.String r0 = "LaunchZC_USE_SKILL"
            int r0 = p004o.C0591nr.m669(r3, r0)
            if (r0 == 0) goto L_0x00c5
            r0 = 1
            goto L_0x00c6
        L_0x00c5:
            r0 = 0
        L_0x00c6:
            r7.f4246 = r0
            java.lang.String r0 = "beginMotionType"
            int r4 = p004o.C0591nr.m669(r3, r0)
            if (r4 < 0) goto L_0x00d7
            o.pb$鷭[] r0 = p004o.C0641pb.C0642.values()
            int r0 = r0.length
            if (r4 < r0) goto L_0x00e1
        L_0x00d7:
            java.lang.String r0 = "iBeginMotionType < 0 || iBeginMotionType >= SKILL_EFFECT_INFO.ST.values().length"
            p004o.C0592ns.m674(r0)
            r0 = 1
            r3.pop(r0)
            goto L_0x00f4
        L_0x00e1:
            o.pb$鷭[] r0 = p004o.C0641pb.C0642.values()
            r0 = r0[r4]
            r7.f4249 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.put(r0, r7)
            r0 = 1
            r3.pop(r0)
        L_0x00f4:
            r0 = -2
            int r0 = r3.next(r0)
            if (r0 != 0) goto L_0x006c
            r0 = 1
            r3.pop(r0)
            r3.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0247ck.m240(o.cl):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C1688 mo3612(int i, int i2) {
        C1688[] values = C1688.values();
        if (i >= 0 && i < values.length) {
            return values[i];
        }
        C1701 r2 = this.f608.mo4465(i);
        C0533 r22 = (C0533) C1014.f6158.f674.f614.f1675.get(Integer.valueOf(r2 == null ? -1 : r2.f7762));
        C1688 r4 = r22 == null ? C1688.NONE : r22.f1677;
        if (r4 == null || r4 == C1688.NONE) {
            return C1688.NONE;
        }
        if (i2 == 0) {
            return r4;
        }
        C1701 r23 = this.f608.mo4465(i2);
        C1472 r24 = r23 == null ? null : r23.f7765;
        if (r24 != C1472.WEAPON && r24 != C1472.WEAPON_TWOHAND) {
            return r4;
        }
        C1701 r25 = this.f608.mo4465(i2);
        C0533 r26 = (C0533) C1014.f6158.f674.f614.f1675.get(Integer.valueOf(r25 == null ? -1 : r25.f7762));
        C1688 r5 = r26 == null ? C1688.NONE : r26.f1677;
        if (r5 == null || r5 == C1688.NONE) {
            return r4;
        }
        if (r4 == C1688.SHORTSWORD && r5 == C1688.SHORTSWORD) {
            return C1688.SHORTSWORD_SHORTSWORD;
        }
        if (r4 == C1688.SWORD && r5 == C1688.SWORD) {
            return C1688.SHORTSWORD_SHORTSWORD;
        }
        if (r4 == C1688.AXE && r5 == C1688.AXE) {
            return C1688.AXE_AXE;
        }
        if ((r4 == C1688.SHORTSWORD && r5 == C1688.SWORD) || (r4 == C1688.SWORD && r5 == C1688.SHORTSWORD)) {
            return C1688.SHORTSWORD_SWORD;
        }
        if ((r4 == C1688.SHORTSWORD && r5 == C1688.AXE) || (r4 == C1688.AXE && r5 == C1688.SHORTSWORD)) {
            return C1688.SHORTSWORD_AXE;
        }
        if ((r4 == C1688.AXE && r5 == C1688.SWORD) || (r4 == C1688.SWORD && r5 == C1688.AXE)) {
            return C1688.SWORD_AXE;
        }
        return r4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final String mo3605(int i, byte b) {
        C1714 r2 = this.f623;
        C0522lg lgVar = this.f626;
        C0587nn r4 = C0522lg.m563(i);
        if (r4 == null) {
            String str = "Unknown class requested: " + i;
            Log.e("AndRO", str);
            throw new C0588no(str);
        }
        switch (m241()[r4.ordinal()]) {
            case 2:
                C1761 r5 = C1761.m2430(i);
                C1716if ifVar = r2.f7903.f7907;
                StringBuilder append = new StringBuilder(String.valueOf(r5 == C1761.SUMMONER ? ifVar.f7918 : ifVar.f7919)).append("\\").append(r2.f7903.f7907.f7917).append("\\");
                C1714 r42 = r2;
                StringBuilder append2 = append.append(b == C1977.MALE.ordinal() ? r42.f7901 : r42.f7900).append("\\").append(lgVar.mo3954(i, b)).append("_");
                C1714 r43 = r2;
                return append2.append(b == C1977.MALE.ordinal() ? r43.f7901 : r43.f7900).toString();
            case 3:
            case 4:
            case 11:
                return new StringBuilder(String.valueOf(r2.f7903.f7913)).append("\\").append(lgVar.mo3954(i, b)).toString();
            case 5:
                return "homun\\" + lgVar.mo3954(i, b);
            case 6:
                C1716if ifVar2 = r2.f7903.f7907;
                return new StringBuilder(String.valueOf(C1761.m2430(i) == C1761.SUMMONER ? ifVar2.f7918 : ifVar2.f7919)).append("\\").append(r2.f7903.f7907.f7917).append("\\").append(lgVar.mo3954(i, b)).toString();
            case 9:
                return "npc\\" + lgVar.mo3954(i, b);
            default:
                String str2 = "Requested non implemented unit class sprite: " + r4;
                Log.e("AndRO", str2);
                throw new C0588no(str2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final String mo3611(C1761 r6, int i, int i2, byte b) {
        C1714 r2 = this.f623;
        if (i2 > f603) {
            i2 = 0;
        }
        if (r6 != C1761.SUMMONER) {
            C1714 r3 = r2;
            return new StringBuilder(String.valueOf(r2.f7902.f7931)).append("\\").append(r2.f7902.f7931).append(m238(r6, i, b)).append("_").append(b == C1977.MALE.ordinal() ? r3.f7901 : r3.f7900).append("_").append(i2).toString();
        }
        C1716if ifVar = r2.f7903.f7907;
        StringBuilder append = new StringBuilder(String.valueOf(r6 == C1761.SUMMONER ? ifVar.f7918 : ifVar.f7919)).append("\\").append(r2.f7902.f7931).append("\\").append(r2.f7902.f7931).append(m238(r6, i, b)).append("_");
        C1714 r32 = r2;
        return append.append(b == C1977.MALE.ordinal() ? r32.f7901 : r32.f7900).append("_").append(i2).toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final String mo3606(int i, int i2, byte b) {
        String str;
        C1714 r3 = this.f623;
        C0522lg lgVar = this.f626;
        if (C1014.f6140.f4478) {
            return new StringBuilder(String.valueOf(r3.f7902.f7930)).append("\\body_").append(i2).toString();
        }
        if (C1014.f6140.f4502) {
            return new StringBuilder(String.valueOf(r3.f7902.f7930)).append("\\allinone_").append(i2).toString();
        }
        C1570 r5 = C1761.m2430(i).mo4502();
        if (C1014.f6140.f4511 && i != C1761.GAMEMASTER.f8294) {
            if ((r5.f7485 & 4096) > 0) {
                if (!((r5.f7485 & 16384) > 0)) {
                    i = r5.mo4397().mo4398(C1977.values()[b]).f8294;
                }
            }
        }
        if (C1014.f6140.f4459 && i != C1761.GAMEMASTER.f8294) {
            i = C1761.m2430(i).mo4502().mo4395().mo4398(C1977.values()[b]).f8294;
        }
        StringBuilder append = new StringBuilder(String.valueOf(r3.f7902.f7930)).append("\\");
        C0522lg lgVar2 = lgVar;
        int i3 = i;
        C0522lg lgVar3 = lgVar2;
        int r4 = C0522lg.m562(i3);
        C0523 r52 = (C0523) lgVar3.f1638.get(Integer.valueOf(r4));
        if (r52 == null) {
            String str2 = "Failed to convert job " + r4 + " to spritename for palette";
            Log.e("AndRO", str2);
            throw new C0588no(str2);
        }
        if (lgVar3.f1639 == C0644if.Korea && r52.f1641 != null && !r52.f1641.isEmpty()) {
            str = r52.f1641;
        } else if (r52.f1643 != null) {
            str = r52.f1643;
        } else if (r52.f1644 == null) {
            String str3 = "Job " + r4 + ": null spritename";
            Log.e("AndRO", str3);
            throw new C0588no(str3);
        } else {
            str = r52.f1644;
        }
        byte b2 = b;
        C1714 r9 = r3;
        return append.append(str).append("_").append(b2 == C1977.MALE.ordinal() ? r9.f7901 : r9.f7900).append("_").append(i2).toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final String mo3604(int i, int i2, byte b) {
        String str;
        C1714 r3 = this.f623;
        String str2 = b == C1977.MALE.ordinal() ? r3.f7901 : r3.f7900;
        C1708 r2 = this.f608;
        C1709 r32 = (C1709) r2.f7776.get(i);
        if (r32 != null) {
            str = r32.f7778;
        } else if (r2.f7775 != null) {
            C0592ns.m674("Couldn't get headgear " + i + " spritename, defaulting to " + r2.f7775);
            str = r2.f7775;
        } else {
            C0592ns.m674("Couldn't get headgear " + i + " spritename, defaulting to GOGGLES");
            str = ((C1709) r2.f7776.get(1)).f7778;
        }
        if (i == 185) {
            str = new StringBuilder(String.valueOf(str)).append(i2).toString();
        }
        return new StringBuilder(String.valueOf(this.f623.f7903.f7909)).append("\\").append(str2).append("\\").append(str2).append(str).toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final String mo3607(int i, C0206bb bbVar) {
        C1761 r2 = C1761.m2430(bbVar.f1633);
        int r3 = bbVar.mo3557(true);
        if (r3 == C1761.TAEKWON.f8294 || r3 == C1761.STAR_GLADIATOR.f8294 || r3 == C1761.STAR_GLADIATOR2.f8294 || r3 == C1761.GAMEMASTER.f8294 || r3 == C1761.WEDDING.f8294 || r3 == C1761.XMAS.f8294 || r3 == C1761.SUMMER.f8294 || (bbVar.f8646 & 4096) > 0 || (bbVar.f8646 & 65536) > 0 || (bbVar.f8646 & 262144) > 0 || (bbVar.f8646 & 134217728) > 0 || (bbVar.f8646 & 268435456) > 0) {
            return null;
        }
        if (i == C1688.KNUKLE.ordinal() && r3 != C1761.MONK.f8294) {
            return null;
        }
        if (r3 == C1761.SOUL_LINKER.f8294) {
            r3 = C1761.MAGE.f8294;
        }
        C1714 r5 = this.f623;
        String str = bbVar.f446 == C1977.MALE.ordinal() ? r5.f7901 : r5.f7900;
        C1716if ifVar = this.f623.f7903.f7907;
        String str2 = r2 == C1761.SUMMONER ? ifVar.f7918 : ifVar.f7919;
        String r9 = this.f626.mo3954(r3, bbVar.f446);
        C0533 r52 = (C0533) this.f614.f1675.get(Integer.valueOf(i));
        String str3 = r52 == null ? null : r52.f1679;
        if (r9 == null) {
            C0592ns.m674("jclass == null for class=" + r3);
            return null;
        } else if (str3 != null) {
            return new StringBuilder(String.valueOf(str2)).append("\\").append(r9).append("\\").append(r9).append("_").append(str).append(str3).toString();
        } else {
            C0592ns.m674("jspritename == null for view=" + i);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final String mo3608(int i, boolean z, boolean z2) {
        String r4 = this.f608.mo4464(i, z);
        if (r4 == null) {
            r4 = this.f608.mo4464(512, true);
        }
        if (z2) {
            return "data\\texture\\" + this.f623.f7904.f7928 + "\\collection\\" + r4 + ".bmp";
        }
        return "data\\texture\\" + this.f623.f7904.f7928 + "\\item\\" + r4 + ".bmp";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final String mo3609(String str) {
        return "data\\texture\\" + this.f623.f7904.f7928 + "\\item\\" + str.toLowerCase() + ".bmp";
    }

    /* renamed from: 櫯 */
    private static int m237(int i, byte b) {
        if (b == C1977.FEMALE.ordinal()) {
            switch (i) {
                case 2:
                    return 4;
                case 3:
                    return 7;
                case 4:
                    return 1;
                case 5:
                    return 5;
                case 6:
                    return 3;
                case 7:
                    return 6;
                case 8:
                    return 12;
                case 9:
                    return 10;
                case 10:
                    return 9;
                case 11:
                    return 11;
                case 12:
                    return 8;
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    return i;
                default:
                    return 2;
            }
        } else {
            switch (i) {
                case 2:
                    return 1;
                case 3:
                    return 7;
                case 4:
                    return 5;
                case 5:
                    return 4;
                case 6:
                    return 3;
                case 7:
                    return 6;
                case 8:
                    return 8;
                case 9:
                    return 9;
                case 10:
                    return 10;
                case 11:
                    return 12;
                case 12:
                    return 11;
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    return i;
                default:
                    return 2;
            }
        }
    }

    /* renamed from: 櫯 */
    private int m238(C1761 r3, int i, byte b) {
        if (r3 == C1761.SUMMONER) {
            return i;
        }
        if (C1014.f6140.f4443 == aux.MyRO) {
            return m237(i, b);
        }
        int[] iArr = b == C1977.MALE.ordinal() ? this.f619 : this.f613;
        if (i < iArr.length && iArr[i] != 0) {
            return iArr[i];
        }
        return i;
    }

    /* renamed from: 鷭 */
    static int m239(C1761 r3, int i) {
        int i2;
        if (r3 == C1761.SUMMONER) {
            i2 = 6;
        } else if (C1014.f6140.f4443 == aux.Eden3 || C1014.f6140.f4443 == aux.LeonardRO || C1014.f6140.f4443 == aux.FreePlayRoCom) {
            i2 = 23;
        } else {
            i2 = 27;
        }
        int i3 = i2;
        while (i <= 0) {
            i += i3;
        }
        while (i > i2) {
            i -= i3;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final String mo3610(C1761 r6, int i, byte b) {
        C1714 r4 = this.f623;
        C1714 r2 = r4;
        String str = b == C1977.MALE.ordinal() ? r4.f7901 : r4.f7900;
        if (!C1014.f6140.f4461) {
            i = m238(r6, i, b);
        }
        C1716if ifVar = r2.f7903.f7907;
        return new StringBuilder(String.valueOf(r6 == C1761.SUMMONER ? ifVar.f7918 : ifVar.f7919)).append("\\").append(r2.f7903.f7907.f7916).append("\\").append(str).append("\\").append(i).append("_").append(str).toString();
    }
}
