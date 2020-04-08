package p004o;

import android.graphics.Point;
import android.opengl.Matrix;
import android.support.p000v4.view.MotionEventCompat;
import android.support.p000v4.view.ViewCompat;
import android.util.FloatMath;
import android.util.Log;
import com.roworkshop.andro.c_activity;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.text.ParseException;
import java.util.Arrays;
import p004o.C0772tc.C0774;
import p004o.C0772tc.C0775;
import p004o.C0776td.C0777if;
import p004o.C0776td.C0778;
import p004o.C0776td.C0778.C0779;
import p004o.C0776td.C0780;
import p004o.C0776td.C0780.C0781;
import p004o.C0776td.C0782;
import p004o.C0776td.C0782.C0783;
import p004o.C0776td.C0784;
import p004o.C0794tg.C0795if;
import p004o.C0794tg.C0796;
import p004o.C0794tg.C0797;
import p004o.C0794tg.C0798;
import p004o.C0794tg.C0799;
import p004o.C0794tg.C0800;
import p004o.C0794tg.C0801;
import p004o.C0794tg.C0802;
import p004o.C0794tg.C0803;
import p004o.C0794tg.aux;

/* renamed from: o.嫶 */
public final class C1558 {

    /* renamed from: đ */
    private static /* synthetic */ int[] f7336;

    /* renamed from: 庸 */
    private static /* synthetic */ int[] f7337;

    /* renamed from: Ą */
    C0438ik f7338;

    /* renamed from: ą */
    C0530ln f7339;

    /* renamed from: Ć */
    C1508[] f7340;

    /* renamed from: ć */
    C2014[] f7341;

    /* renamed from: ċ */
    public C0772tc f7342;

    /* renamed from: ȃ */
    boolean f7343;

    /* renamed from: Ȋ */
    C2038[] f7344;

    /* renamed from: ˮ͈ */
    C0576nc f7345 = C0576nc.VILLAGE;

    /* renamed from: ˮ͍ */
    C0441in f7346;

    /* renamed from: ܕ */
    C1739 f7347;

    /* renamed from: 䒧 */
    int f7348;

    /* renamed from: 岱 */
    C1559if f7349;

    /* renamed from: 櫯 */
    C0575nb f7350 = C0575nb.NOTHING;

    /* renamed from: 纫 */
    short[] f7351;

    /* renamed from: 躆 */
    int f7352;

    /* renamed from: 鷭 */
    String f7353;

    /* renamed from: o.嫶$if */
    class C1559if {

        /* renamed from: Ą */
        FloatBuffer f7354;

        /* renamed from: ą */
        C1341 f7355;

        /* renamed from: Ć */
        final String f7356 = "selection_cell";

        /* renamed from: ȃ */
        FloatBuffer f7358;

        /* renamed from: ˮ͈ */
        boolean f7359 = false;

        /* renamed from: 櫯 */
        int f7360;

        /* renamed from: 鷭 */
        Point f7361;

        /* access modifiers changed from: 0000 */
        /* renamed from: 鷭 */
        public final boolean mo4390(C1558 r11, Point point) {
            C0775 r112;
            synchronized (this) {
                C0438ik ikVar = r11.f7338;
                float f = (-((((float) point.x) / 2.0f) - ((float) (ikVar.f1296 / 2)))) * ikVar.f1303;
                C0438ik ikVar2 = r11.f7338;
                float f2 = ((((float) point.y) / 2.0f) - ((float) (ikVar2.f1297 / 2))) * ikVar2.f1303;
                C0438ik ikVar3 = r11.f7338;
                float f3 = (-((((float) (point.x + 1)) / 2.0f) - ((float) (ikVar3.f1296 / 2)))) * ikVar3.f1303;
                C0438ik ikVar4 = r11.f7338;
                float f4 = ((((float) (point.y + 1)) / 2.0f) - ((float) (ikVar4.f1297 / 2))) * ikVar4.f1303;
                C0772tc tcVar = r11.f7342;
                int i = point.x;
                int i2 = point.y;
                if (tcVar.f4721 <= 0 || tcVar.f4719 <= 0) {
                    throw new RuntimeException("GAT file not loaded (bad width/height)");
                }
                if (i < 0 || i >= tcVar.f4721 || i2 < 0 || i2 >= tcVar.f4719) {
                    r112 = null;
                } else {
                    C0772tc tcVar2 = tcVar;
                    int i3 = i + (tcVar.f4721 * i2);
                    r112 = tcVar2.mo4103(i3) == null ? null : tcVar2.f4720[i3].mo4106();
                }
                if (r112 == null) {
                    return false;
                } else if (!r112.mo4105()) {
                    return false;
                } else {
                    float[] fArr = {f, (-r112.f4737) + 0.2f, f2, (float) this.f7360, f, (-r112.f4735) + 0.2f, f4, (float) this.f7360, f3, (-r112.f4736) + 0.2f, f2, (float) this.f7360, f3, (-r112.f4734) + 0.2f, f4, (float) this.f7360};
                    this.f7358 = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                    this.f7358.put(fArr);
                    this.f7358.position(0);
                    this.f7361 = new Point(point);
                    this.f7359 = true;
                    return true;
                }
            }
        }

        C1559if(C0441in inVar) {
            int[] iArr = new int[144];
            iArr[0] = 1;
            iArr[1] = 1;
            iArr[2] = 1;
            iArr[3] = 1;
            iArr[8] = 1;
            iArr[9] = 1;
            iArr[10] = 1;
            iArr[11] = 1;
            iArr[12] = 1;
            iArr[13] = 1;
            iArr[14] = 1;
            iArr[15] = 1;
            iArr[20] = 1;
            iArr[21] = 1;
            iArr[22] = 1;
            iArr[23] = 1;
            iArr[24] = 1;
            iArr[25] = 1;
            iArr[34] = 1;
            iArr[35] = 1;
            iArr[36] = 1;
            iArr[37] = 1;
            iArr[46] = 1;
            iArr[47] = 1;
            iArr[96] = 1;
            iArr[97] = 1;
            iArr[106] = 1;
            iArr[107] = 1;
            iArr[108] = 1;
            iArr[109] = 1;
            iArr[118] = 1;
            iArr[119] = 1;
            iArr[120] = 1;
            iArr[121] = 1;
            iArr[122] = 1;
            iArr[123] = 1;
            iArr[128] = 1;
            iArr[129] = 1;
            iArr[130] = 1;
            iArr[131] = 1;
            iArr[132] = 1;
            iArr[133] = 1;
            iArr[134] = 1;
            iArr[135] = 1;
            iArr[140] = 1;
            iArr[141] = 1;
            iArr[142] = 1;
            iArr[143] = 1;
            int[] iArr2 = new int[256];
            iArr2[0] = 0;
            iArr2[1] = -2147418368;
            C0441in inVar2 = inVar;
            C0442if r15 = inVar2.mo3837(iArr, iArr2, (int) Math.sqrt((double) iArr.length), (int) Math.sqrt((double) iArr.length), "selection_cell", null, inVar.f1308);
            float[] r8 = r15.mo3839();
            this.f7360 = r15.f1327;
            this.f7354 = ByteBuffer.allocateDirect(r8.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f7354.put(r8);
            this.f7354.position(0);
            C1341 r152 = new C1341();
            Matrix.setIdentityM(r152.f6874, 0);
            this.f7355 = r152;
        }
    }

    /* renamed from: o.嫶$鷭 */
    class C1560 {

        /* renamed from: ˮ͈ */
        int f7363;

        /* renamed from: 櫯 */
        int f7364;

        /* renamed from: 鷭 */
        short[] f7365;

        private C1560() {
        }

        /* synthetic */ C1560(C1558 r1, C1560 r2) {
            this();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(46:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|(2:46|47)|48|50) */
    /* JADX WARNING: Can't wrap try/catch for region: R(47:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0042 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0057 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0062 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0077 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0082 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x008d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0097 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00a1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00ac */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00b7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00c2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00cd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00d8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00e3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00ed */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0017 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0022 */
    /* renamed from: 櫯 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ int[] m2243() {
        /*
            int[] r0 = f7336
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.nc[] r0 = p004o.C0576nc.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.nc r0 = p004o.C0576nc.AGIT     // Catch:{ NoSuchFieldError -> 0x0017 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
            r1 = 9
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0017 }
        L_0x0017:
            o.nc r0 = p004o.C0576nc.AGIT_SIEGEV15     // Catch:{ NoSuchFieldError -> 0x0022 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
            r1 = 19
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0022 }
        L_0x0022:
            o.nc r0 = p004o.C0576nc.ARENA     // Catch:{ NoSuchFieldError -> 0x002c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002c }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002c }
        L_0x002c:
            o.nc r0 = p004o.C0576nc.BATTLEFIELD     // Catch:{ NoSuchFieldError -> 0x0037 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0037 }
            r1 = 20
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0037 }
        L_0x0037:
            o.nc r0 = p004o.C0576nc.DENYSKILL     // Catch:{ NoSuchFieldError -> 0x0042 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0042 }
            r1 = 14
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0042 }
        L_0x0042:
            o.nc r0 = p004o.C0576nc.DUNGEON     // Catch:{ NoSuchFieldError -> 0x004c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x004c }
        L_0x004c:
            o.nc r0 = p004o.C0576nc.DUNGEON2     // Catch:{ NoSuchFieldError -> 0x0057 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0057 }
            r1 = 10
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0057 }
        L_0x0057:
            o.nc r0 = p004o.C0576nc.DUNGEON3     // Catch:{ NoSuchFieldError -> 0x0062 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
            r1 = 11
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0062 }
        L_0x0062:
            o.nc r0 = p004o.C0576nc.EVENT_GUILDWAR     // Catch:{ NoSuchFieldError -> 0x006d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
            r1 = 8
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x006d }
        L_0x006d:
            o.nc r0 = p004o.C0576nc.FIELD     // Catch:{ NoSuchFieldError -> 0x0077 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0077 }
        L_0x0077:
            o.nc r0 = p004o.C0576nc.JAIL     // Catch:{ NoSuchFieldError -> 0x0082 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
            r1 = 16
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0082 }
        L_0x0082:
            o.nc r0 = p004o.C0576nc.MONSTERTRACK     // Catch:{ NoSuchFieldError -> 0x008d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
            r1 = 17
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x008d }
        L_0x008d:
            o.nc r0 = p004o.C0576nc.NOPENALTY_FREEPKZONE     // Catch:{ NoSuchFieldError -> 0x0097 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0097 }
        L_0x0097:
            o.nc r0 = p004o.C0576nc.PENALTY_FREEPKZONE     // Catch:{ NoSuchFieldError -> 0x00a1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a1 }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00a1 }
        L_0x00a1:
            o.nc r0 = p004o.C0576nc.PKSERVER     // Catch:{ NoSuchFieldError -> 0x00ac }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ac }
            r1 = 12
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00ac }
        L_0x00ac:
            o.nc r0 = p004o.C0576nc.PORINGBATTLE     // Catch:{ NoSuchFieldError -> 0x00b7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b7 }
            r1 = 18
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00b7 }
        L_0x00b7:
            o.nc r0 = p004o.C0576nc.PVPSERVER     // Catch:{ NoSuchFieldError -> 0x00c2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c2 }
            r1 = 13
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00c2 }
        L_0x00c2:
            o.nc r0 = p004o.C0576nc.PVP_TOURNAMENT     // Catch:{ NoSuchFieldError -> 0x00cd }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cd }
            r1 = 21
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00cd }
        L_0x00cd:
            o.nc r0 = p004o.C0576nc.TURBOTRACK     // Catch:{ NoSuchFieldError -> 0x00d8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
            r1 = 15
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00d8 }
        L_0x00d8:
            o.nc r0 = p004o.C0576nc.UNUSED     // Catch:{ NoSuchFieldError -> 0x00e3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e3 }
            r1 = 22
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00e3 }
        L_0x00e3:
            o.nc r0 = p004o.C0576nc.VILLAGE     // Catch:{ NoSuchFieldError -> 0x00ed }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ed }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00ed }
        L_0x00ed:
            o.nc r0 = p004o.C0576nc.VILLAGE_IN     // Catch:{ NoSuchFieldError -> 0x00f7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f7 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00f7 }
        L_0x00f7:
            f7336 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1558.m2243():int[]");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:3|4|5|6|7|8|9|10|11|12|13|14|15|(2:16|17)|18|20) */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0034 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0048 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ int[] m2248() {
        /*
            int[] r0 = f7337
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.nb[] r0 = p004o.C0575nb.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.nb r0 = p004o.C0575nb.AGITZONE     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.nb r0 = p004o.C0575nb.DENYSKILLZONE     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.nb r0 = p004o.C0575nb.EVENTPVPZONE     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.nb r0 = p004o.C0575nb.FREEPVPZONE     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            o.nb r0 = p004o.C0575nb.NOTHING     // Catch:{ NoSuchFieldError -> 0x003e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            o.nb r0 = p004o.C0575nb.PKSERVERZONE     // Catch:{ NoSuchFieldError -> 0x0048 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0048 }
        L_0x0048:
            o.nb r0 = p004o.C0575nb.PVPSERVERZONE     // Catch:{ NoSuchFieldError -> 0x0052 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0052 }
        L_0x0052:
            f7337 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1558.m2248():int[]");
    }

    /* renamed from: 櫯 */
    private float m2242(float f, float f2) {
        float f3;
        int i = ((int) f) + (this.f7342.f4721 * ((int) f2));
        if (i < 0 || i >= this.f7342.f4720.length) {
            return 0.0f;
        }
        C0775 r3 = this.f7342.f4720[i].mo4106();
        float floor = f - FloatMath.floor(f);
        float floor2 = f2 - FloatMath.floor(f2);
        if (floor + floor2 < 1.0f) {
            f3 = r3.f4737;
        } else {
            f3 = r3.f4735 - (r3.f4734 - r3.f4736);
        }
        return -((floor * (r3.f4736 - f3)) + f3 + (floor2 * (r3.f4735 - f3)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final float mo4389(float f, float f2) {
        if (this.f7342 == null || this.f7338 == null) {
            return 30.0f;
        }
        C0438ik ikVar = this.f7338;
        float f3 = (((float) (ikVar.f1296 / 2)) - (f / ikVar.f1303)) * 2.0f;
        C0438ik ikVar2 = this.f7338;
        return m2242(f3, (((float) (ikVar2.f1297 / 2)) + (f2 / ikVar2.f1303)) * 2.0f);
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 186 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2247(p004o.C0794tg r23, boolean r24) {
        /*
            r22 = this;
            com.roworkshop.andro.c_activity r17 = p004o.C1014.f6147
            o.嫺 r0 = new o.嫺
            r1 = r17
            r2 = 9
            r0.<init>(r1, r2)
            r1 = r17
            r1.mo3387(r0)
            r0 = 0
            r1 = r22
            r1.f7340 = r0
            r0 = 0
            r1 = r22
            r1.f7341 = r0
            r0 = r23
            o.tg$Ą[] r0 = r0.f4854
            int r0 = r0.length
            o.tg$ȃ[] r4 = new p004o.C0794tg.C0798[r0]
            r5 = 0
            r0 = r23
            o.tg$Ą[] r0 = r0.f4854
            int r0 = r0.length
            o.tg$aux[] r6 = new p004o.C0794tg.aux[r0]
            r7 = 0
            r8 = 0
            goto L_0x0061
        L_0x002c:
            r0 = r23
            o.tg$Ą[] r0 = r0.f4854
            r0 = r0[r8]
            o.tg$岱 r0 = r0.f4875
            o.tg$岱 r1 = p004o.C0794tg.C0801.MODEL
            if (r0 != r1) goto L_0x0046
            r0 = r5
            int r5 = r5 + 1
            r1 = r23
            o.tg$Ą[] r1 = r1.f4854
            r1 = r1[r8]
            o.tg$ȃ r1 = (p004o.C0794tg.C0798) r1
            r4[r0] = r1
            goto L_0x005f
        L_0x0046:
            r0 = r23
            o.tg$Ą[] r0 = r0.f4854
            r0 = r0[r8]
            o.tg$岱 r0 = r0.f4875
            o.tg$岱 r1 = p004o.C0794tg.C0801.SOUND
            if (r0 != r1) goto L_0x005f
            r0 = r7
            int r7 = r7 + 1
            r1 = r23
            o.tg$Ą[] r1 = r1.f4854
            r1 = r1[r8]
            o.tg$aux r1 = (p004o.C0794tg.aux) r1
            r6[r0] = r1
        L_0x005f:
            int r8 = r8 + 1
        L_0x0061:
            r0 = r23
            o.tg$Ą[] r0 = r0.f4854
            int r0 = r0.length
            if (r8 < r0) goto L_0x002c
            if (r7 <= 0) goto L_0x00a1
            o.툀[] r0 = new p004o.C2038[r7]
            r1 = r22
            r1.f7344 = r0
            r8 = 0
            r23 = 0
            goto L_0x008f
        L_0x0074:
            r0 = r6[r23]
            byte[] r0 = r0.f4867
            r1 = 0
            byte r0 = r0[r1]
            if (r0 == 0) goto L_0x008d
            r0 = r22
            o.툀[] r0 = r0.f7344
            r1 = r8
            int r8 = r8 + 1
            o.툀 r2 = new o.툀
            r3 = r6[r23]
            r2.<init>(r3)
            r0[r1] = r2
        L_0x008d:
            int r23 = r23 + 1
        L_0x008f:
            r0 = r23
            if (r0 < r7) goto L_0x0074
            r0 = r22
            o.툀[] r0 = r0.f7344
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r8)
            o.툀[] r0 = (p004o.C2038[]) r0
            r1 = r22
            r1.f7344 = r0
        L_0x00a1:
            if (r5 <= 0) goto L_0x025f
            o.쭅[] r8 = new p004o.C2014[r5]
            r23 = 0
            com.roworkshop.andro.c_activity r17 = p004o.C1014.f6147
            o.嫺 r0 = new o.嫺
            r1 = r17
            r2 = 12
            r0.<init>(r1, r2)
            r1 = r17
            r1.mo3387(r0)
            r6 = 0
            java.lang.String[] r7 = new java.lang.String[r5]
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            r10 = 0
            goto L_0x00d5
        L_0x00c1:
            r0 = r4[r10]
            byte[] r0 = r0.f4882
            o.op r1 = p004o.C0618op.KOREAN
            java.lang.String r15 = p004o.C0622ot.m741(r0, r1)
            r0 = r6
            int r6 = r6 + 1
            r7[r0] = r15
            r9.add(r15)
            int r10 = r10 + 1
        L_0x00d5:
            if (r10 < r5) goto L_0x00c1
            r10 = 0
            r15 = 0
            int r5 = r9.size()
            o.䬦[] r6 = new p004o.C1508[r5]
            double r0 = (double) r5
            r2 = 4621256167635550208(0x4022000000000000, double:9.0)
            double r18 = r2 / r0
            java.util.Iterator r9 = r9.iterator()
            goto L_0x01ce
        L_0x00eb:
            java.lang.Object r0 = r9.next()
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
            r0 = r22
            o.in r12 = r0.f7346     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            r11 = r5
            o.䬦 r13 = new o.䬦     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            r13.<init>()     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            r13.f7250 = r11     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            o.cp r0 = p004o.C1014.f6158     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            o.cl r0 = r0.f677     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            java.lang.String r2 = "data\\model\\"
            r1.<init>(r2)     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            java.lang.String r2 = r13.f7250     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            java.lang.String r1 = r1.toString()     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            r2 = 0
            java.lang.Object r0 = r0.mo3613(r1, r2)     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            byte[] r0 = (byte[]) r0     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            r11 = r0
            if (r11 != 0) goto L_0x013d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            java.lang.String r1 = "Failed to load GRF resource for map object prototype "
            r0.<init>(r1)     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            java.lang.String r1 = r13.f7250     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            java.lang.String r17 = r0.toString()     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            java.lang.String r0 = "AndRO"
            r1 = r17
            android.util.Log.e(r0, r1)     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            o.no r0 = new o.no     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            r1 = r17
            r0.<init>(r1)     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            throw r0     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
        L_0x013d:
            o.tf r0 = new o.tf     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            r0.<init>()     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            r14 = r0
            r17 = r11
            r11 = r0
            r0 = r17
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            java.nio.ByteBuffer r17 = r0.order(r1)     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            r0 = r17
            r11.mo4109(r0)     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            if (r24 != 0) goto L_0x0184
            r17 = r14
            r11 = r13
            r0 = r17
            o.tf$鷭[] r0 = r0.f4804     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            int r0 = r0.length     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            o.ತ[] r0 = new p004o.C1341[r0]     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            r13.f7244 = r0     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            r0 = r17
            o.tf$鷭[] r0 = r0.f4804     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            int r0 = r0.length     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            o.橙[] r0 = new p004o.C1647[r0]     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            r11.f7245 = r0     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            r0 = r17
            o.ತ r1 = new o.ತ     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            r1.<init>()     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            r17 = r1
            float[] r1 = r1.f6874     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            r2 = 0
            android.opengl.Matrix.setIdentityM(r1, r2)     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            r1 = 0
            r2 = r17
            r3 = 0
            r11.mo4366(r0, r1, r2, r3)     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
        L_0x0184:
            r13.mo4367(r14, r12)     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            if (r24 != 0) goto L_0x018c
            r13.mo4365(r14)     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
        L_0x018c:
            r6[r10] = r13     // Catch:{ tr -> 0x018f, Exception -> 0x0191 }
            goto L_0x01a8
        L_0x018f:
            r0 = move-exception
            throw r0
        L_0x0191:
            r11 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to init object prototype:"
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r12 = r0.toString()
            p004o.C0592ns.m674(r12)
            r11.printStackTrace()
            goto L_0x01ce
        L_0x01a8:
            int r10 = r10 + 1
            double r0 = (double) r10
            double r0 = r18 * r0
            int r0 = (int) r0
            int r0 = r0 + 12
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            r20 = r0
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x01ce
            com.roworkshop.andro.c_activity r17 = p004o.C1014.f6147
            r0 = r20
            int r11 = (int) r0
            o.嫺 r0 = new o.嫺
            r1 = r17
            r0.<init>(r1, r11)
            r1 = r17
            r1.mo3387(r0)
            r15 = r20
        L_0x01ce:
            boolean r0 = r9.hasNext()
            if (r0 != 0) goto L_0x00eb
            int r0 = r6.length
            if (r10 >= r0) goto L_0x01de
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r6, r10)
            o.䬦[] r0 = (p004o.C1508[]) r0
            r6 = r0
        L_0x01de:
            if (r24 != 0) goto L_0x020b
            r5 = 0
            goto L_0x0208
        L_0x01e2:
            r20 = r7[r5]
            r10 = 0
            goto L_0x01f4
        L_0x01e6:
            r0 = r6[r10]
            java.lang.String r0 = r0.f7250
            r1 = r20
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01f7
            int r10 = r10 + 1
        L_0x01f4:
            int r0 = r6.length
            if (r10 < r0) goto L_0x01e6
        L_0x01f7:
            int r0 = r6.length
            if (r10 == r0) goto L_0x0206
            r0 = r6[r10]
            r1 = r4[r5]
            o.쭅 r21 = p004o.C2014.m2685(r0, r1)
            r8[r23] = r21
            int r23 = r23 + 1
        L_0x0206:
            int r5 = r5 + 1
        L_0x0208:
            int r0 = r7.length
            if (r5 < r0) goto L_0x01e2
        L_0x020b:
            com.roworkshop.andro.c_activity r17 = p004o.C1014.f6147
            o.嫺 r0 = new o.嫺
            r1 = r17
            r2 = 21
            r0.<init>(r1, r2)
            r1 = r17
            r1.mo3387(r0)
            r0 = r22
            r0.f7340 = r6
            if (r24 != 0) goto L_0x0266
            r0 = 0
            r1 = r23
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r8, r0, r1)
            o.쭅[] r0 = (p004o.C2014[]) r0
            r1 = r22
            r1.f7341 = r0
            r5 = 0
            r9 = 0
            goto L_0x0257
        L_0x0231:
            r20 = 0
            goto L_0x0250
        L_0x0234:
            r0 = r8[r20]
            if (r0 == 0) goto L_0x024e
            r0 = r8[r20]
            o.䬦 r0 = r0.f8910
            r1 = r22
            o.䬦[] r1 = r1.f7340
            r1 = r1[r9]
            if (r0 != r1) goto L_0x024e
            r0 = r22
            o.쭅[] r0 = r0.f7341
            r1 = r8[r20]
            r0[r5] = r1
            int r5 = r5 + 1
        L_0x024e:
            int r20 = r20 + 1
        L_0x0250:
            int r0 = r8.length
            r1 = r20
            if (r1 < r0) goto L_0x0234
            int r9 = r9 + 1
        L_0x0257:
            r0 = r22
            o.䬦[] r0 = r0.f7340
            int r0 = r0.length
            if (r9 < r0) goto L_0x0231
            return
        L_0x025f:
            r0 = 0
            o.䬦[] r0 = new p004o.C1508[r0]
            r1 = r22
            r1.f7340 = r0
        L_0x0266:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1558.m2247(o.tg, boolean):void");
    }

    /* renamed from: 鷭 */
    private C0794tg m2244(String str, boolean z) {
        C0796 r1;
        C0796 r12;
        c_activity c_activity = C1014.f6147;
        c_activity.mo3387((Runnable) new C1561(c_activity, 0));
        byte[] bArr = (byte[]) C1014.f6158.f677.mo3613(str, false);
        if (bArr == null) {
            String str2 = "Failed to load RSW from GRF";
            Log.e("AndRO", str2);
            throw new C0588no(str2);
        }
        C0794tg tgVar = new C0794tg();
        c_activity c_activity2 = C1014.f6147;
        c_activity2.mo3387((Runnable) new C1561(c_activity2, 1));
        byte[] bArr2 = bArr;
        C0794tg tgVar2 = tgVar;
        try {
            ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
            tgVar2.f4859 = new C0802();
            C0802 r122 = tgVar2.f4859;
            ByteBuffer byteBuffer = order;
            byteBuffer.get(r122.f4916);
            if (C0622ot.m741(r122.f4916, C0618op.LATIN).compareTo("GRSW") != 0) {
                throw new ParseException("Invalid RSW magic: " + C0622ot.m741(r122.f4916, C0618op.LATIN), byteBuffer.position());
            }
            byteBuffer.get(r122.f4915);
            C0794tg.this.f4855 = ((double) r122.f4915[0]) + (((double) r122.f4915[1]) / 10.0d);
            byteBuffer.get(r122.f4914);
            byteBuffer.get(r122.f4913);
            if (!C0622ot.m741(r122.f4913, C0618op.KOREAN).toLowerCase().endsWith(".gnd")) {
                throw new ParseException("Invalid RSM GND file reference: " + C0622ot.m741(r122.f4913, C0618op.KOREAN), byteBuffer.position());
            }
            byteBuffer.get(r122.f4910);
            if (!C0622ot.m741(r122.f4910, C0618op.KOREAN).toLowerCase().endsWith(".gat")) {
                throw new ParseException("Invalid RSM GAT file reference: " + C0622ot.m741(r122.f4910, C0618op.KOREAN), byteBuffer.position());
            }
            if (C0794tg.this.f4855 >= 1.4d) {
                byteBuffer.get(r122.f4911);
            }
            tgVar2.f4858 = new C0800();
            C0800 r123 = tgVar2.f4858;
            ByteBuffer byteBuffer2 = order;
            if (C0794tg.this.f4855 >= 1.3d) {
                r123.f4903 = byteBuffer2.getFloat();
            }
            if (C0794tg.this.f4855 >= 1.8d) {
                r123.f4902 = byteBuffer2.getInt();
            }
            if (C0794tg.this.f4855 >= 1.8d) {
                r123.f4901 = byteBuffer2.getFloat();
            } else {
                r123.f4901 = 1.0f;
            }
            if (C0794tg.this.f4855 >= 1.8d) {
                r123.f4900 = byteBuffer2.getFloat();
            } else {
                r123.f4900 = 2.0f;
            }
            if (C0794tg.this.f4855 >= 1.8d) {
                r123.f4897 = byteBuffer2.getFloat();
            } else {
                r123.f4897 = 50.0f;
            }
            if (C0794tg.this.f4855 >= 1.9d) {
                r123.f4898 = byteBuffer2.getInt();
            } else {
                r123.f4898 = 3;
            }
            tgVar2.f4857 = new C0797();
            C0797 r124 = tgVar2.f4857;
            ByteBuffer byteBuffer3 = order;
            if (C0794tg.this.f4855 >= 1.5d) {
                r124.f4881 = byteBuffer3.getInt();
            } else {
                r124.f4881 = 45;
            }
            if (C0794tg.this.f4855 >= 1.5d) {
                r124.f4880 = byteBuffer3.getInt();
            } else {
                r124.f4880 = 45;
            }
            if (C0794tg.this.f4855 >= 1.5d) {
                C0620or.m714(byteBuffer3, r124.f4879);
            } else {
                r124.f4879 = new float[]{1.0f, 1.0f, 1.0f};
            }
            if (C0794tg.this.f4855 >= 1.5d) {
                C0620or.m714(byteBuffer3, r124.f4878);
            } else {
                r124.f4878 = new float[]{0.3f, 0.3f, 0.3f};
            }
            if (C0794tg.this.f4855 >= 1.7d) {
                r124.f4876 = byteBuffer3.getFloat();
            } else {
                r124.f4876 = 1.0f;
            }
            tgVar2.f4856 = new C0795if();
            C0795if ifVar = tgVar2.f4856;
            ByteBuffer byteBuffer4 = order;
            if (C0794tg.this.f4855 >= 1.6d) {
                ifVar.f4873 = byteBuffer4.getInt();
                ifVar.f4872 = byteBuffer4.getInt();
                ifVar.f4871 = byteBuffer4.getInt();
                ifVar.f4870 = byteBuffer4.getInt();
            } else {
                ifVar.f4870 = -500;
                ifVar.f4871 = -500;
                ifVar.f4872 = -500;
                ifVar.f4873 = -500;
            }
            int i = order.getInt();
            if (i < 0) {
                throw new ParseException("Invalid RSW objects cnt: " + i, order.position());
            }
            tgVar2.f4854 = new C0796[i];
            int i2 = 0;
            while (i2 < i) {
                try {
                    C0796[] r0 = tgVar2.f4854;
                    ByteBuffer byteBuffer5 = order;
                    C0794tg tgVar3 = tgVar2;
                    int i3 = byteBuffer5.getInt();
                    if (i3 < 0 || i3 >= C0801.values().length) {
                        throw new ParseException("Invalid object type " + i3, byteBuffer5.position());
                    }
                    C0801 r15 = C0801.values()[i3];
                    switch (C0794tg.m1498()[r15.ordinal()]) {
                        case 2:
                            r12 = new C0798();
                            break;
                        case 3:
                            r12 = new C0799();
                            break;
                        case 4:
                            r12 = new aux();
                            break;
                        case 5:
                            r12 = new C0803();
                            break;
                        default:
                            C0624ov.m759("Unexpected RSW object type " + i3);
                            r1 = null;
                            break;
                    }
                    r12.f4875 = r15;
                    r12.mo4112(byteBuffer5);
                    r1 = r12;
                    r0[i2] = r1;
                    i2++;
                } catch (ParseException e) {
                    C0624ov.m759(e.getMessage());
                    i--;
                    i2--;
                }
            }
            tgVar2.f4854 = (C0796[]) Arrays.copyOf(tgVar2.f4854, i);
            m2247(tgVar, z);
            c_activity c_activity3 = C1014.f6147;
            c_activity3.mo3387((Runnable) new C1561(c_activity3, 25));
            return tgVar;
        } catch (ParseException e2) {
            throw new C0588no(e2, "Failed to load RSW file: " + str);
        }
    }

    /* renamed from: 鷭 */
    private C1560 m2245(String str, C0794tg tgVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C0783 r30;
        C1560 r8 = new C1560(this, null);
        C0614ol olVar = (C0614ol) C1014.f6158.f677.mo3613(str, true);
        C0776td tdVar = new C0776td();
        try {
            boolean z6 = C0595nv.f2870;
            C0794tg tgVar2 = tgVar;
            C0614ol olVar2 = olVar;
            C0776td tdVar2 = tdVar;
            tdVar.f4745 = new C0777if();
            C0777if ifVar = tdVar2.f4745;
            C0614ol olVar3 = olVar2;
            byte[] bArr = ifVar.f4751;
            olVar3.mo4038(bArr, bArr.length);
            if (C0622ot.m741(ifVar.f4751, C0618op.LATIN).compareTo("GRGN") != 0) {
                C0622ot.m741(ifVar.f4751, C0618op.LATIN);
                z2 = false;
            } else {
                byte[] bArr2 = ifVar.f4750;
                olVar3.mo4038(bArr2, bArr2.length);
                ifVar.f4749 = olVar3.mo4034();
                ifVar.f4748 = olVar3.mo4034();
                if (ifVar.f4749 < 0 || ifVar.f4749 > 10000 || ifVar.f4748 < 0 || ifVar.f4748 > 10000) {
                    z2 = false;
                } else {
                    ifVar.f4746 = Float.intBitsToFloat(olVar3.mo4034());
                    z2 = true;
                }
            }
            if (z2) {
                tdVar2.f4744 = new C0780();
                C0780 r14 = tdVar2.f4744;
                C0614ol olVar4 = olVar2;
                r14.f4770 = olVar4.mo4034();
                r14.f4769 = olVar4.mo4034();
                if (r14.f4770 < 0) {
                    z3 = false;
                } else {
                    r14.f4768 = new C0781[r14.f4770];
                    for (int i = 0; i < r14.f4768.length; i++) {
                        r14.f4768[i] = new C0781();
                        C0781 r17 = r14.f4768[i];
                        C0614ol olVar5 = olVar4;
                        r17.f4772 = new byte[r14.f4769];
                        byte[] bArr3 = r17.f4772;
                        olVar5.mo4038(bArr3, bArr3.length);
                    }
                    z3 = true;
                }
                if (z3) {
                    tdVar2.f4743 = new C0782();
                    C0782 r142 = tdVar2.f4743;
                    C0614ol olVar6 = olVar2;
                    r142.f4778 = olVar6.mo4034();
                    if (!z6) {
                        olVar6.mo4035((r142.f4778 * 256) + 12);
                        z4 = true;
                    } else {
                        r142.f4777 = olVar6.mo4034();
                        r142.f4776 = olVar6.mo4034();
                        r142.f4775 = olVar6.mo4034();
                        if (r142.f4778 < 0) {
                            z4 = false;
                        } else {
                            r142.f4773 = new C0783[r142.f4778];
                            C0782 r16 = r142;
                            ByteBuffer wrap = ByteBuffer.wrap(new byte[500]);
                            new C0783(wrap);
                            byte[] bArr4 = new byte[(wrap.position() * r142.f4778)];
                            olVar6.mo4038(bArr4, bArr4.length);
                            ByteBuffer order = ByteBuffer.wrap(bArr4).order(ByteOrder.LITTLE_ENDIAN);
                            for (int i2 = 0; i2 < r142.f4778; i2++) {
                                r142.f4773[i2] = new C0783(order);
                            }
                            z4 = true;
                        }
                    }
                    if (z4) {
                        tdVar2.f4742 = new C0778();
                        C0778 r143 = tdVar2.f4742;
                        C0614ol olVar7 = olVar2;
                        r143.f4754 = olVar7.mo4034();
                        if (r143.f4754 < 0 || r143.f4754 > 10000000) {
                            z5 = false;
                        } else {
                            C0778 r19 = r143;
                            ByteBuffer wrap2 = ByteBuffer.wrap(new byte[100]);
                            new C0779(wrap2);
                            byte[] bArr5 = new byte[(wrap2.position() * r143.f4754)];
                            olVar7.mo4038(bArr5, bArr5.length);
                            ByteBuffer order2 = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
                            r143.f4753 = new C0779[r143.f4754];
                            for (int i3 = 0; i3 < r143.f4754; i3++) {
                                r143.f4753[i3] = new C0779(order2);
                            }
                            z5 = true;
                        }
                        if (z5) {
                            tdVar2.f4738 = new C0784[(tdVar2.f4745.f4749 * tdVar2.f4745.f4748)];
                            C0776td tdVar3 = tdVar2;
                            ByteBuffer wrap3 = ByteBuffer.wrap(new byte[100]);
                            new C0784(wrap3);
                            byte[] bArr6 = new byte[(wrap3.position() * tdVar2.f4738.length)];
                            olVar2.mo4038(bArr6, bArr6.length);
                            ByteBuffer order3 = ByteBuffer.wrap(bArr6).order(ByteOrder.LITTLE_ENDIAN);
                            for (int i4 = 0; i4 < tdVar2.f4738.length; i4++) {
                                tdVar2.f4738[i4] = new C0784(order3);
                            }
                            if (z6) {
                                C0794tg tgVar3 = tgVar2;
                                C0776td tdVar4 = tdVar2;
                                if (tdVar2.f4743.f4773 != null) {
                                    tdVar4.f4740 = tdVar4.f4745.f4749 * 6;
                                    tdVar4.f4741 = tdVar4.f4745.f4748 * 6;
                                    tdVar4.f4739 = new short[(tdVar4.f4740 * tdVar4.f4741)];
                                    C0776td tdVar5 = tdVar4;
                                    C0617oo ooVar = new C0617oo();
                                    C0617oo ooVar2 = new C0617oo();
                                    int[] iArr = new int[(tdVar5.f4745.f4749 * tdVar5.f4745.f4748)];
                                    for (int i5 = 0; i5 < tdVar5.f4745.f4748; i5++) {
                                        for (int i6 = 0; i6 < tdVar5.f4745.f4749; i6++) {
                                            int i7 = i6 + (i5 * tdVar5.f4745.f4749);
                                            if (tdVar5.f4738[i7].f4782 >= 0) {
                                                int[] iArr2 = new int[9];
                                                int i8 = 0;
                                                if (i6 == 0 || i5 == 0 || i6 == tdVar5.f4745.f4749 - 1 || i5 == tdVar5.f4745.f4748 - 1) {
                                                    iArr[i7] = tdVar5.mo4107(i6, i5);
                                                } else {
                                                    ooVar.f3013 = 0;
                                                    ooVar.f3012 = 0;
                                                    ooVar.f3011 = 0;
                                                    ooVar.f3010 = 0;
                                                    for (int i9 = 0; i9 < 3; i9++) {
                                                        for (int i10 = 0; i10 < 3; i10++) {
                                                            iArr2[i8] = tdVar5.mo4107((i6 - 1) + i10, (i5 - 1) + i9);
                                                            if (iArr2[i8] != 0) {
                                                                ooVar2.mo4042(iArr2[i8]);
                                                                ooVar.f3013 += ooVar2.f3013;
                                                                ooVar.f3012 += ooVar2.f3012;
                                                                ooVar.f3011 += ooVar2.f3011;
                                                                ooVar.f3010 += ooVar2.f3010;
                                                                i8++;
                                                            }
                                                        }
                                                    }
                                                    if (i8 > 0) {
                                                        ooVar.f3013 /= i8;
                                                        ooVar.f3012 /= i8;
                                                        ooVar.f3011 /= i8;
                                                        ooVar.f3010 /= i8;
                                                    } else {
                                                        ooVar.f3010 = 255;
                                                        ooVar.f3011 = 255;
                                                        ooVar.f3012 = 255;
                                                        ooVar.f3013 = 255;
                                                    }
                                                    iArr[i7] = C0621os.m718(ooVar.f3013, ooVar.f3012, ooVar.f3011, 255);
                                                }
                                            }
                                        }
                                    }
                                    int[] iArr3 = iArr;
                                    C0617oo ooVar3 = new C0617oo();
                                    C0617oo ooVar4 = new C0617oo();
                                    C0617oo ooVar5 = new C0617oo();
                                    C0617oo ooVar6 = new C0617oo();
                                    ooVar5.f3013 = (int) (tgVar3.f4857.f4879[0] * 256.0f);
                                    ooVar5.f3012 = (int) (tgVar3.f4857.f4879[1] * 256.0f);
                                    ooVar5.f3011 = (int) (tgVar3.f4857.f4879[2] * 256.0f);
                                    C0617oo ooVar7 = ooVar5;
                                    int i11 = (int) (tgVar3.f4857.f4876 * 255.0f);
                                    ooVar7.f3013 = (ooVar7.f3013 * i11) / 255;
                                    ooVar7.f3012 = (ooVar7.f3012 * i11) / 255;
                                    ooVar7.f3011 = (ooVar7.f3011 * i11) / 255;
                                    ooVar7.f3010 = (ooVar7.f3010 * i11) / 255;
                                    ooVar6.f3013 = (int) (tgVar3.f4857.f4878[0] * 256.0f * 1.5f);
                                    ooVar6.f3012 = (int) (tgVar3.f4857.f4878[1] * 256.0f * 1.5f);
                                    ooVar6.f3011 = (int) (tgVar3.f4857.f4878[2] * 256.0f * 1.5f);
                                    C0617oo r20 = new C0617oo().mo4041(ooVar6).mo4043(ooVar5);
                                    C0617oo ooVar8 = new C0617oo();
                                    C0783 r11 = new C0783(-1);
                                    for (int i12 = 0; i12 < tdVar4.f4738.length; i12++) {
                                        int i13 = tdVar4.f4738[i12].f4782;
                                        boolean z7 = false;
                                        if (i13 == -1) {
                                            r30 = r11;
                                            z7 = true;
                                        } else {
                                            short s = tdVar4.f4742.f4753[i13].f4764;
                                            if (s < 0) {
                                                r30 = r11;
                                                z7 = true;
                                            } else {
                                                r30 = tdVar4.f4743.f4773[s];
                                            }
                                        }
                                        int i14 = (i12 % tdVar4.f4745.f4749) * 6;
                                        int i15 = (i12 / tdVar4.f4745.f4749) * 6;
                                        for (int i16 = 1; i16 < 7; i16++) {
                                            for (int i17 = 1; i17 < 7; i17++) {
                                                int i18 = i17 + (i16 * 8);
                                                int i19 = i14 + (i17 - 1) + ((i15 + (i16 - 1)) * tdVar4.f4740);
                                                if (z7) {
                                                    tdVar4.f4739[i19] = -1;
                                                }
                                                int r15 = C0622ot.m730(r30.f4781[i18]);
                                                ooVar4.f3013 = C0622ot.m730(r30.f4780[(i18 * 3) + 0]);
                                                ooVar4.f3012 = C0622ot.m730(r30.f4780[(i18 * 3) + 1]);
                                                ooVar4.f3011 = C0622ot.m730(r30.f4780[(i18 * 3) + 2]);
                                                ooVar3.mo4042(iArr3[i12]);
                                                C0617oo r24 = ooVar8.mo4041(ooVar3).mo4043(ooVar4);
                                                int i20 = r15;
                                                r24.f3013 = (r24.f3013 * i20) / 255;
                                                r24.f3012 = (r24.f3012 * i20) / 255;
                                                r24.f3011 = (r24.f3011 * i20) / 255;
                                                r24.f3010 = (r24.f3010 * i20) / 255;
                                                C0617oo ooVar9 = r24;
                                                C0617oo ooVar10 = r20;
                                                C0617oo ooVar11 = ooVar9;
                                                ooVar9.f3013 = (ooVar9.f3013 * ooVar10.f3013) / 255;
                                                ooVar11.f3012 = (ooVar11.f3012 * ooVar10.f3012) / 255;
                                                ooVar11.f3011 = (ooVar11.f3011 * ooVar10.f3011) / 255;
                                                ooVar11.f3010 = (ooVar11.f3010 * ooVar10.f3010) / 255;
                                                short[] sArr = tdVar4.f4739;
                                                int i21 = i19;
                                                int r242 = C0621os.m718(ooVar8.f3013, ooVar8.f3012, ooVar8.f3011, 255);
                                                int i22 = (r242 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                                                int i23 = (((r242 & 255) >> 3) << 11) | ((i22 >> 3) << 6) | ((((r242 & 16711680) >> 16) >> 3) << 1);
                                                sArr[i21] = (short) (i23 | (((r242 & ViewCompat.MEASURED_STATE_MASK) >>> 24) >> 7));
                                            }
                                        }
                                    }
                                    int r12 = C0622ot.m727(tdVar4.f4740);
                                    int r13 = C0622ot.m727(tdVar4.f4741);
                                    double d = ((double) tdVar4.f4740) / ((double) r12);
                                    double d2 = ((double) tdVar4.f4741) / ((double) r13);
                                    short[] sArr2 = new short[(r12 * r13)];
                                    if (!(r12 == tdVar4.f4740 && r13 == tdVar4.f4741)) {
                                        for (int i24 = 0; i24 < r12; i24++) {
                                            for (int i25 = 0; i25 < r13; i25++) {
                                                int i26 = ((int) (((double) i24) * d)) + (((int) (((double) i25) * d2)) * tdVar4.f4740);
                                                if (i26 >= tdVar4.f4740 * tdVar4.f4741) {
                                                    C0624ov.m759("Unexpected old_idx=" + i26 + " >" + (tdVar4.f4740 * tdVar4.f4741));
                                                } else {
                                                    sArr2[i24 + (i25 * r12)] = tdVar4.f4739[i26];
                                                }
                                            }
                                        }
                                        tdVar4.f4739 = sArr2;
                                        tdVar4.f4740 = r12;
                                        tdVar4.f4741 = r13;
                                    }
                                    tdVar4.f4743 = null;
                                }
                            }
                        }
                    }
                }
            }
            C0614ol olVar8 = olVar;
            olVar.f3001.close();
            olVar8.f3001 = null;
            this.f7338 = new C0438ik();
            C0438ik ikVar = this.f7338;
            boolean z8 = z;
            C0776td tdVar6 = tdVar;
            c_activity c_activity = C1014.f6147;
            c_activity.mo3387((Runnable) new C1561(c_activity, 45));
            ikVar.mo3831(tdVar6, ikVar.f1300);
            if (!z8) {
                c_activity c_activity2 = C1014.f6147;
                c_activity2.mo3387((Runnable) new C1561(c_activity2, 51));
                ikVar.mo3830(tdVar6);
                c_activity c_activity3 = C1014.f6147;
                c_activity3.mo3387((Runnable) new C1561(c_activity3, 65));
            }
            if (tgVar.f4858 != null) {
                this.f7339 = new C0530ln(this.f7338, tdVar, tgVar.f4858, this.f7338.f1300, 65, 10, z8);
                if (this.f7339.f1665 == null) {
                    this.f7339 = null;
                }
            }
            r8.f7365 = tdVar.f4739;
            r8.f7364 = tdVar.f4740;
            r8.f7363 = tdVar.f4741;
            return r8;
        } catch (IOException e) {
            String iOException = e.toString();
            Log.e("AndRO", iOException);
            throw new C0588no(iOException);
        }
    }

    /* renamed from: 鷭 */
    private void m2246(String str) {
        boolean z;
        byte[] bArr = (byte[]) C1014.f6158.f677.mo3613(str, false);
        C0772tc tcVar = new C0772tc();
        C0772tc tcVar2 = tcVar;
        byte[] bArr2 = bArr;
        C0772tc tcVar3 = tcVar;
        ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
        order.get(tcVar3.f4724);
        if (C0622ot.m741(tcVar3.f4724, C0618op.LATIN).compareTo("GRAT") != 0) {
            C0622ot.m741(tcVar3.f4724, C0618op.LATIN);
            z = false;
        } else {
            tcVar3.f4723 = order.get();
            tcVar3.f4722 = order.get();
            tcVar3.f4721 = order.getInt();
            tcVar3.f4719 = order.getInt();
            if (tcVar3.f4721 <= 0 || tcVar3.f4721 > 10000 || tcVar3.f4719 <= 0 || tcVar3.f4719 > 10000) {
                z = false;
            } else {
                tcVar3.f4720 = new C0774[(tcVar3.f4721 * tcVar3.f4719)];
                C0775 r6 = new C0775();
                for (int i = 0; i < tcVar3.f4720.length; i++) {
                    r6.f4737 = order.getFloat();
                    r6.f4736 = order.getFloat();
                    r6.f4735 = order.getFloat();
                    r6.f4734 = order.getFloat();
                    r6.f4725 = order.get();
                    order.get(r6.f4732);
                    C0774[] r0 = tcVar3.f4720;
                    C0775 r8 = r6;
                    C0774 r9 = new C0774();
                    r9.f4731 = (short) ((int) (r8.f4737 * 100.0f));
                    r9.f4730 = (short) ((int) (r8.f4736 * 100.0f));
                    r9.f4729 = (short) ((int) (r8.f4735 * 100.0f));
                    r9.f4728 = (short) ((int) (r8.f4734 * 100.0f));
                    r9.f4725 = r8.f4725;
                    r0[i] = r9;
                }
                z = true;
            }
        }
        if (!z) {
            String str2 = "Failed to init GAT: " + str;
            Log.e("AndRO", str2);
            throw new C0588no(str2);
        }
        this.f7342 = tcVar2;
    }

    C1558(String str, boolean z) {
        if (str.toLowerCase().endsWith(".gat")) {
            str = str.substring(0, str.length() - 4);
        }
        if (str.contains("@")) {
            str = str.substring(str.lastIndexOf("@") - 1);
        }
        int i = C0595nv.f2868 ? 1 : 2;
        if ((str.equals("lighthalzen") || (C1014.f6140.f4443 == C0643pc.aux.MOTR && str.equals("prontera"))) && 8192 / i > C0441in.f1306) {
            i *= 2;
        }
        this.f7346 = new C0441in(i, 0, 0, false);
        this.f7349 = new C1559if(this.f7346);
        String sb = new StringBuilder(String.valueOf(str)).append(".rsw").toString();
        if (C1014.f6158.f674.f610.f719.get(sb) != null) {
            sb = (String) C1014.f6158.f674.f610.f719.get(sb);
        }
        String str2 = "data\\" + sb;
        c_activity c_activity = C1014.f6147;
        c_activity.mo3387((Runnable) new C1561(c_activity, 0));
        C0794tg r7 = m2244(str2, z);
        String r6 = C0622ot.m741(r7.f4859.f4910, C0618op.KOREAN);
        if (C1014.f6158.f674.f610.f719.get(r6) != null) {
            r6 = (String) C1014.f6158.f674.f610.f719.get(r6);
        }
        String str3 = "data\\" + r6;
        String r62 = C0622ot.m741(r7.f4859.f4913, C0618op.KOREAN);
        if (C1014.f6158.f674.f610.f719.get(r62) != null) {
            r62 = (String) C1014.f6158.f674.f610.f719.get(r62);
        }
        C1560 r63 = m2245("data\\" + r62, r7, z);
        this.f7351 = r63.f7365;
        this.f7348 = r63.f7364;
        this.f7352 = r63.f7363;
        this.f7353 = str;
        this.f7343 = C1014.f6158.f674.f621.f8976.contains(new StringBuilder(String.valueOf(str)).append(".rsw").toString());
        if (!this.f7343) {
            try {
                this.f7347 = new C1739(str, this.f7346, new Point(this.f7338.f1296 * 2, this.f7338.f1297 * 2));
            } catch (Throwable unused) {
                this.f7347 = null;
            }
        }
        if (!z) {
            m2246(str3);
            for (C1508 r0 : this.f7340) {
                r0.mo4364(this.f7346);
            }
            this.f7338.mo3829();
            c_activity c_activity2 = C1014.f6147;
            c_activity2.mo3387((Runnable) new C1561(c_activity2, 90));
            if (this.f7339 != null) {
                this.f7339.mo3972(this.f7338.f1300);
                this.f7339.f1666 = new float[(this.f7339.f1667.length * 3)];
                for (int i2 = 0; i2 < this.f7339.f1667.length; i2++) {
                    C0442if ifVar = (C0442if) this.f7338.f1300.f1316.get(this.f7339.f1667[i2]);
                    this.f7339.f1666[(i2 * 3) + 0] = (float) ifVar.f1330;
                    this.f7339.f1666[(i2 * 3) + 1] = (float) ifVar.f1329;
                    this.f7339.f1666[(i2 * 3) + 2] = (float) ifVar.f1327;
                }
            }
            c_activity c_activity3 = C1014.f6147;
            c_activity3.mo3387((Runnable) new C1561(c_activity3, 100));
        }
    }
}
