package p004o;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: o.oy */
public final class C0627oy {

    /* renamed from: ċ */
    static final int[] f4097 = {36, 97, 32, 36, 32, 97, 52, 65, 0, 24, 32, 52, 56, 56, 56, 56, 56, 36, 36, 52, 2, 152, 152, 152, 164, 0, 0, 0, 2, 128, 2, 1, 1, 0, 33};

    /* renamed from: Ą */
    public int f4098;

    /* renamed from: ą */
    public int f4099;

    /* renamed from: Ć */
    public int f4100;

    /* renamed from: ć */
    public int f4101;

    /* renamed from: ȃ */
    public int f4102;

    /* renamed from: Ȋ */
    public int f4103;

    /* renamed from: ˮ͈ */
    public int f4104;

    /* renamed from: ˮ͍ */
    public int f4105;

    /* renamed from: 岱 */
    public int f4106;

    /* renamed from: 櫯 */
    public int f4107;

    /* renamed from: 鷭 */
    public int f4108;

    /* renamed from: o.oy$if */
    public class C0628if {

        /* renamed from: 䒧 */
        private static /* synthetic */ int[] f4109;

        /* renamed from: Ą */
        byte f4110;

        /* renamed from: ą */
        byte f4111;

        /* renamed from: Ć */
        Integer[] f4112;

        /* renamed from: ć */
        String[] f4113;

        /* renamed from: ċ */
        C0629if[] f4114;

        /* renamed from: ȃ */
        byte f4115;

        /* renamed from: Ȋ */
        C0628if[] f4116;

        /* renamed from: ˮ͈ */
        byte f4117;

        /* renamed from: ˮ͍ */
        C0630[] f4118;

        /* renamed from: 岱 */
        C0635[] f4119;

        /* renamed from: 櫯 */
        int f4120;

        /* renamed from: 鷭 */
        byte[] f4122;

        /* renamed from: o.oy$if$if */
        class C0629if {

            /* renamed from: Ą */
            int f4123;

            /* renamed from: ą */
            int f4124;

            /* renamed from: Ć */
            int f4125;

            /* renamed from: ć */
            int f4126;

            /* renamed from: ȃ */
            C0631 f4127;

            /* renamed from: ˮ͈ */
            Integer f4129;

            /* renamed from: ˮ͍ */
            int f4130;

            /* renamed from: 岱 */
            int f4131;

            /* renamed from: 櫯 */
            int f4132;

            /* renamed from: 鷭 */
            int f4133;

            C0629if(ByteBuffer byteBuffer, int i) {
                this.f4133 = byteBuffer.getInt();
                int i2 = this.f4133 & (((-1 << C0627oy.this.f4098) ^ -1) << 0);
                this.f4132 = i2;
                if (i < C0628if.this.f4112.length) {
                    this.f4129 = C0628if.this.f4112[i];
                }
                this.f4127 = C0631.values()[i2];
                this.f4123 = C0627oy.f4097[i2] & 3;
                switch (this.f4123) {
                    case 0:
                        this.f4124 = this.f4133 >> C0627oy.this.f4105;
                        C0627oy oyVar = C0627oy.this;
                        this.f4125 = (this.f4133 >> oyVar.f4100) & (((-1 << oyVar.f4107) ^ -1) << 0);
                        C0627oy oyVar2 = C0627oy.this;
                        this.f4126 = (this.f4133 >> oyVar2.f4099) & (((-1 << oyVar2.f4108) ^ -1) << 0);
                        return;
                    case 1:
                        this.f4124 = this.f4133 >> C0627oy.this.f4105;
                        C0627oy oyVar3 = C0627oy.this;
                        this.f4130 = (this.f4133 >> oyVar3.f4101) & (((-1 << oyVar3.f4104) ^ -1) << 0);
                        return;
                    case 2:
                        this.f4124 = this.f4133 >> C0627oy.this.f4105;
                        C0627oy oyVar4 = C0627oy.this;
                        C0627oy oyVar5 = oyVar4;
                        C0627oy oyVar6 = oyVar4;
                        this.f4131 = ((this.f4133 >> oyVar6.f4101) & (((-1 << oyVar6.f4104) ^ -1) << 0)) - oyVar5.f4103;
                        break;
                }
            }
        }

        /* renamed from: o.oy$if$鷭 */
        class C0630 {

            /* renamed from: ˮ͈ */
            int f4135;

            /* renamed from: 櫯 */
            int f4136;

            /* renamed from: 鷭 */
            String f4137;

            C0630(String str, int i, int i2) {
                this.f4137 = str;
                this.f4136 = i;
                this.f4135 = i2;
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(73:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|76) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0098 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00a2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00ac */
        /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00b6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00c1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00cb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00d6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00e1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00ec */
        /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00f7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0102 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x010d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x0118 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0123 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x012e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x0139 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x0144 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x014f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x015a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x0165 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x0170 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x017b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0022 */
        /* renamed from: 櫯 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static /* synthetic */ int[] m769() {
            /*
                int[] r0 = f4109
                if (r0 == 0) goto L_0x0005
                return r0
            L_0x0005:
                o.oy$Ą[] r0 = p004o.C0627oy.C0631.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                o.oy$Ą r0 = p004o.C0627oy.C0631.ADD     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r1 = 13
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                o.oy$Ą r0 = p004o.C0627oy.C0631.CALL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r1 = 26
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                o.oy$Ą r0 = p004o.C0627oy.C0631.CLOSE     // Catch:{ NoSuchFieldError -> 0x002d }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r1 = 34
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                o.oy$Ą r0 = p004o.C0627oy.C0631.CLOSURE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1 = 35
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                o.oy$Ą r0 = p004o.C0627oy.C0631.CONCAT     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1 = 20
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                o.oy$Ą r0 = p004o.C0627oy.C0631.DIV     // Catch:{ NoSuchFieldError -> 0x004e }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1 = 16
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                o.oy$Ą r0 = p004o.C0627oy.C0631.EQ     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1 = 22
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                o.oy$Ą r0 = p004o.C0627oy.C0631.FORLOOP     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1 = 29
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                o.oy$Ą r0 = p004o.C0627oy.C0631.GETGLOBAL     // Catch:{ NoSuchFieldError -> 0x006e }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r1 = 6
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                o.oy$Ą r0 = p004o.C0627oy.C0631.GETTABLE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r1 = 7
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                o.oy$Ą r0 = p004o.C0627oy.C0631.GETUPVAL     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r1 = 5
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                o.oy$Ą r0 = p004o.C0627oy.C0631.JMP     // Catch:{ NoSuchFieldError -> 0x008d }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r1 = 21
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                o.oy$Ą r0 = p004o.C0627oy.C0631.LE     // Catch:{ NoSuchFieldError -> 0x0098 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0098 }
                r1 = 24
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0098 }
            L_0x0098:
                o.oy$Ą r0 = p004o.C0627oy.C0631.LOADBOOL     // Catch:{ NoSuchFieldError -> 0x00a2 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a2 }
                r1 = 3
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00a2 }
            L_0x00a2:
                o.oy$Ą r0 = p004o.C0627oy.C0631.LOADK     // Catch:{ NoSuchFieldError -> 0x00ac }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ac }
                r1 = 2
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00ac }
            L_0x00ac:
                o.oy$Ą r0 = p004o.C0627oy.C0631.LOADNIL     // Catch:{ NoSuchFieldError -> 0x00b6 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b6 }
                r1 = 4
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00b6 }
            L_0x00b6:
                o.oy$Ą r0 = p004o.C0627oy.C0631.LT     // Catch:{ NoSuchFieldError -> 0x00c1 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c1 }
                r1 = 23
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00c1 }
            L_0x00c1:
                o.oy$Ą r0 = p004o.C0627oy.C0631.MOVE     // Catch:{ NoSuchFieldError -> 0x00cb }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cb }
                r1 = 1
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00cb }
            L_0x00cb:
                o.oy$Ą r0 = p004o.C0627oy.C0631.MUL     // Catch:{ NoSuchFieldError -> 0x00d6 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d6 }
                r1 = 15
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00d6 }
            L_0x00d6:
                o.oy$Ą r0 = p004o.C0627oy.C0631.NEWTABLE     // Catch:{ NoSuchFieldError -> 0x00e1 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e1 }
                r1 = 11
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00e1 }
            L_0x00e1:
                o.oy$Ą r0 = p004o.C0627oy.C0631.NOT     // Catch:{ NoSuchFieldError -> 0x00ec }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ec }
                r1 = 19
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00ec }
            L_0x00ec:
                o.oy$Ą r0 = p004o.C0627oy.C0631.POW     // Catch:{ NoSuchFieldError -> 0x00f7 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f7 }
                r1 = 17
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00f7 }
            L_0x00f7:
                o.oy$Ą r0 = p004o.C0627oy.C0631.RETURN     // Catch:{ NoSuchFieldError -> 0x0102 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0102 }
                r1 = 28
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0102 }
            L_0x0102:
                o.oy$Ą r0 = p004o.C0627oy.C0631.SELF     // Catch:{ NoSuchFieldError -> 0x010d }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x010d }
                r1 = 12
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x010d }
            L_0x010d:
                o.oy$Ą r0 = p004o.C0627oy.C0631.SETGLOBAL     // Catch:{ NoSuchFieldError -> 0x0118 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0118 }
                r1 = 8
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0118 }
            L_0x0118:
                o.oy$Ą r0 = p004o.C0627oy.C0631.SETLIST     // Catch:{ NoSuchFieldError -> 0x0123 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0123 }
                r1 = 32
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0123 }
            L_0x0123:
                o.oy$Ą r0 = p004o.C0627oy.C0631.SETLISTO     // Catch:{ NoSuchFieldError -> 0x012e }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x012e }
                r1 = 33
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x012e }
            L_0x012e:
                o.oy$Ą r0 = p004o.C0627oy.C0631.SETTABLE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r1 = 10
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                o.oy$Ą r0 = p004o.C0627oy.C0631.SETUPVAL     // Catch:{ NoSuchFieldError -> 0x0144 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0144 }
                r1 = 9
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0144 }
            L_0x0144:
                o.oy$Ą r0 = p004o.C0627oy.C0631.SUB     // Catch:{ NoSuchFieldError -> 0x014f }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x014f }
                r1 = 14
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x014f }
            L_0x014f:
                o.oy$Ą r0 = p004o.C0627oy.C0631.TAILCALL     // Catch:{ NoSuchFieldError -> 0x015a }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x015a }
                r1 = 27
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x015a }
            L_0x015a:
                o.oy$Ą r0 = p004o.C0627oy.C0631.TEST     // Catch:{ NoSuchFieldError -> 0x0165 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0165 }
                r1 = 25
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0165 }
            L_0x0165:
                o.oy$Ą r0 = p004o.C0627oy.C0631.TFORLOOP     // Catch:{ NoSuchFieldError -> 0x0170 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0170 }
                r1 = 30
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0170 }
            L_0x0170:
                o.oy$Ą r0 = p004o.C0627oy.C0631.TFORPREP     // Catch:{ NoSuchFieldError -> 0x017b }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x017b }
                r1 = 31
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x017b }
            L_0x017b:
                o.oy$Ą r0 = p004o.C0627oy.C0631.UNM     // Catch:{ NoSuchFieldError -> 0x0186 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0186 }
                r1 = 18
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0186 }
            L_0x0186:
                f4109 = r2
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p004o.C0627oy.C0628if.m769():int[]");
        }

        public C0628if(ByteBuffer byteBuffer, byte[] bArr) {
            this.f4122 = C0627oy.m763(byteBuffer);
            if (this.f4122 == null) {
                this.f4122 = bArr;
            }
            this.f4120 = byteBuffer.getInt();
            this.f4117 = byteBuffer.get();
            this.f4115 = byteBuffer.get();
            this.f4110 = byteBuffer.get();
            this.f4111 = byteBuffer.get();
            this.f4112 = m771(byteBuffer);
            this.f4118 = m770(byteBuffer);
            this.f4113 = m768(byteBuffer);
            this.f4119 = m767(byteBuffer);
            this.f4114 = m766(byteBuffer);
        }

        /* renamed from: 鷭 */
        private static Integer[] m771(ByteBuffer byteBuffer) {
            int i = byteBuffer.getInt();
            Integer[] numArr = new Integer[i];
            for (int i2 = 0; i2 < i; i2++) {
                numArr[i2] = new Integer(byteBuffer.getInt());
            }
            return numArr;
        }

        /* renamed from: 櫯 */
        private final C0630[] m770(ByteBuffer byteBuffer) {
            int i = byteBuffer.getInt();
            C0630[] r5 = new C0630[i];
            for (int i2 = 0; i2 < i; i2++) {
                r5[i2] = new C0630(C0627oy.m764(byteBuffer), byteBuffer.getInt(), byteBuffer.getInt());
            }
            return r5;
        }

        /* renamed from: ˮ͈ */
        private final String[] m768(ByteBuffer byteBuffer) {
            int i = byteBuffer.getInt();
            if (i == 0 || i == (this.f4117 & 255)) {
                String[] strArr = new String[i];
                for (int i2 = 0; i2 < i; i2++) {
                    strArr[i2] = C0627oy.m764(byteBuffer);
                }
                return strArr;
            }
            throw new RuntimeException("Lua says this is not good :( Bad nupvalues!\n");
        }

        /* renamed from: ȃ */
        private final C0635[] m767(ByteBuffer byteBuffer) {
            int i = byteBuffer.getInt();
            C0635[] r5 = new C0635[i];
            for (int i2 = 0; i2 < i; i2++) {
                C0635 r7 = new C0635(C0627oy.this, null);
                byte b = byteBuffer.get();
                r7.f4199 = C0633.values()[b];
                switch (b) {
                    case 0:
                        r7.f4195 = null;
                        break;
                    case 3:
                        r7.f4195 = Double.valueOf(byteBuffer.getDouble());
                        break;
                    case 4:
                        r7.f4195 = C0627oy.m763(byteBuffer);
                        break;
                    default:
                        r7.f4195 = null;
                        break;
                }
                r5[i2] = r7;
            }
            int i3 = byteBuffer.getInt();
            if (i3 > 0) {
                this.f4116 = new C0628if[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    this.f4116[i4] = new C0628if(byteBuffer, this.f4122);
                }
            }
            return r5;
        }

        /* renamed from: Ą */
        private final C0629if[] m766(ByteBuffer byteBuffer) {
            int i = byteBuffer.getInt();
            C0629if[] ifVarArr = new C0629if[i];
            for (int i2 = 0; i2 < i; i2++) {
                ifVarArr[i2] = new C0629if(byteBuffer, i2);
            }
            return ifVarArr;
        }

        /* renamed from: 鷭 */
        public final byte[] mo4044() {
            C0635 r10;
            C0635 r11;
            C0606of ofVar = new C0606of();
            C0632 r5 = new C0632(C0627oy.this, null);
            boolean z = false;
            for (C0629if ifVar : this.f4114) {
                if (!z) {
                    switch (m769()[ifVar.f4127.ordinal()]) {
                        case 2:
                            int i = ifVar.f4124;
                            C0635 r12 = this.f4119[ifVar.f4130];
                            C0632 r13 = r5;
                            if (i >= 250) {
                                break;
                            } else {
                                r13.f4176[i] = r12;
                                break;
                            }
                        case 3:
                            C0635 r9 = new C0635(C0627oy.this, null);
                            r9.f4199 = C0633.BOOL;
                            r9.f4195 = Integer.valueOf(ifVar.f4125);
                            int i2 = ifVar.f4124;
                            C0635 r122 = r9;
                            C0632 r132 = r5;
                            if (i2 < 250) {
                                r132.f4176[i2] = r122;
                            }
                            if (ifVar.f4126 == 0) {
                                break;
                            } else {
                                z = true;
                                break;
                            }
                        case 6:
                            C0635 r92 = new C0635(C0627oy.this, null);
                            r92.f4196 = C0634.GLOBAL;
                            r92.f4200 = (byte[]) this.f4119[ifVar.f4130].f4195;
                            int i3 = ifVar.f4124;
                            C0635 r123 = r92;
                            C0632 r133 = r5;
                            if (i3 >= 250) {
                                break;
                            } else {
                                r133.f4176[i3] = r123;
                                break;
                            }
                        case 7:
                            C0635 r93 = new C0635(C0627oy.this, null);
                            r93.f4199 = C0633.TABLEVALUE;
                            r93.f4192 = r5.mo4045(ifVar.f4125);
                            if (ifVar.f4126 < 250) {
                                int i4 = ifVar.f4126;
                                r93.f4193 = (byte[]) (i4 < 250 ? r5.f4176[i4] : null).f4195;
                            } else {
                                r93.f4193 = (byte[]) this.f4119[ifVar.f4126 - 250].f4195;
                            }
                            int i5 = ifVar.f4124;
                            C0635 r124 = r93;
                            C0632 r134 = r5;
                            if (i5 >= 250) {
                                break;
                            } else {
                                r134.f4176[i5] = r124;
                                break;
                            }
                        case 8:
                            C0606of r0 = ofVar.mo4026((byte[]) this.f4119[ifVar.f4130].f4195).mo4026(" = ".getBytes());
                            int i6 = ifVar.f4124;
                            C0632 r94 = r5;
                            r0.mo4026((i6 >= 250 || r94.f4176[i6] == null) ? null : r94.mo4046(r94.f4176[i6]));
                            int i7 = ifVar.f4124;
                            if ((i7 < 250 ? r5.f4176[i7] : null).f4199 == C0633.TABLE) {
                                ofVar.mo4026(";".getBytes());
                            }
                            ofVar.mo4026("\n".getBytes());
                            break;
                        case 10:
                            int i8 = ifVar.f4124;
                            C0635 r95 = i8 < 250 ? r5.f4176[i8] : null;
                            if (ifVar.f4125 < 250) {
                                int i9 = ifVar.f4125;
                                r10 = i9 < 250 ? r5.f4176[i9] : null;
                            } else {
                                r10 = this.f4119[ifVar.f4125 - 250];
                            }
                            if (ifVar.f4126 < 250) {
                                int i10 = ifVar.f4126;
                                r11 = i10 < 250 ? r5.f4176[i10] : null;
                            } else {
                                r11 = this.f4119[ifVar.f4126 - 250];
                            }
                            ((TreeMap) r95.f4195).put(r10, r11);
                            int i11 = ifVar.f4124;
                            C0635 r125 = r95;
                            C0632 r135 = r5;
                            if (i11 < 250) {
                                r135.f4176[i11] = r125;
                            }
                            if (r95.f4196 == null) {
                                break;
                            } else {
                                ofVar.mo4026(r5.mo4045(ifVar.f4124));
                                ofVar.mo4026(r5.mo4046(r10));
                                ofVar.mo4026(" = ".getBytes());
                                ofVar.mo4026(r5.mo4046(r11));
                                ofVar.mo4026("\n".getBytes());
                                break;
                            }
                        case 11:
                            C0635 r96 = new C0635(C0627oy.this, null);
                            r96.f4199 = C0633.TABLE;
                            r96.f4195 = new TreeMap();
                            r96.f4194 = ifVar.f4125;
                            r96.f4197 = ifVar.f4126;
                            int i12 = ifVar.f4124;
                            C0635 r126 = r96;
                            C0632 r136 = r5;
                            if (i12 >= 250) {
                                break;
                            } else {
                                r136.f4176[i12] = r126;
                                break;
                            }
                        case 28:
                            break;
                        case 32:
                            int i13 = ifVar.f4124;
                            C0635 r97 = i13 < 250 ? r5.f4176[i13] : null;
                            r97.f4191 = true;
                            for (int i14 = 1; i14 <= (ifVar.f4130 % 32) + 1; i14++) {
                                C0635 r102 = new C0635(C0627oy.this, null);
                                r102.f4199 = C0633.NUMBER;
                                r102.f4195 = new Double((double) ((-ifVar.f4130) + (ifVar.f4130 % 32) + i14));
                                int i15 = ifVar.f4124 + i14;
                                ((TreeMap) r97.f4195).put(r102, i15 < 250 ? r5.f4176[i15] : null);
                            }
                            int i16 = ifVar.f4124;
                            C0635 r127 = r97;
                            C0632 r137 = r5;
                            if (i16 >= 250) {
                                break;
                            } else {
                                r137.f4176[i16] = r127;
                                break;
                            }
                        default:
                            new StringBuilder("WARNING: Unparsed opcode ").append(ifVar.f4127).append("!\n");
                            break;
                    }
                } else {
                    z = false;
                }
            }
            return Arrays.copyOf(ofVar.f2975.array(), ofVar.f2975.position());
        }
    }

    /* renamed from: o.oy$Ą */
    enum C0631 {
        MOVE,
        LOADK,
        LOADBOOL,
        LOADNIL,
        GETUPVAL,
        GETGLOBAL,
        GETTABLE,
        SETGLOBAL,
        SETUPVAL,
        SETTABLE,
        NEWTABLE,
        SELF,
        ADD,
        SUB,
        MUL,
        DIV,
        POW,
        UNM,
        NOT,
        CONCAT,
        JMP,
        EQ,
        LT,
        LE,
        TEST,
        CALL,
        TAILCALL,
        RETURN,
        FORLOOP,
        TFORLOOP,
        TFORPREP,
        SETLIST,
        SETLISTO,
        CLOSE,
        CLOSURE
    }

    /* renamed from: o.oy$ȃ */
    class C0632 {

        /* renamed from: ˮ͈ */
        private static /* synthetic */ int[] f4174;

        /* renamed from: 鷭 */
        C0635[] f4176;

        private C0632() {
            this.f4176 = new C0635[250];
        }

        /* synthetic */ C0632(C0627oy oyVar, C0632 r2) {
            this();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(25:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
        /* renamed from: 鷭 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static /* synthetic */ int[] m774() {
            /*
                int[] r0 = f4174
                if (r0 == 0) goto L_0x0005
                return r0
            L_0x0005:
                o.oy$ˮ͈[] r0 = p004o.C0627oy.C0633.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                o.oy$ˮ͈ r0 = p004o.C0627oy.C0633.BOOL     // Catch:{ NoSuchFieldError -> 0x0016 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
                r1 = 2
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                o.oy$ˮ͈ r0 = p004o.C0627oy.C0633.FUNCTION     // Catch:{ NoSuchFieldError -> 0x0020 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
                r1 = 7
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
            L_0x0020:
                o.oy$ˮ͈ r0 = p004o.C0627oy.C0633.GLOBAL     // Catch:{ NoSuchFieldError -> 0x002b }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r1 = 10
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                o.oy$ˮ͈ r0 = p004o.C0627oy.C0633.LIGHTUSERDATA     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r1 = 3
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                o.oy$ˮ͈ r0 = p004o.C0627oy.C0633.NIL     // Catch:{ NoSuchFieldError -> 0x003f }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
                r1 = 1
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003f }
            L_0x003f:
                o.oy$ˮ͈ r0 = p004o.C0627oy.C0633.NUMBER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r1 = 4
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                o.oy$ˮ͈ r0 = p004o.C0627oy.C0633.STRING     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1 = 5
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                o.oy$ˮ͈ r0 = p004o.C0627oy.C0633.TABLE     // Catch:{ NoSuchFieldError -> 0x005d }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r1 = 6
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                o.oy$ˮ͈ r0 = p004o.C0627oy.C0633.TABLEVALUE     // Catch:{ NoSuchFieldError -> 0x0068 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0068 }
                r1 = 11
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0068 }
            L_0x0068:
                o.oy$ˮ͈ r0 = p004o.C0627oy.C0633.THREAD     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r1 = 9
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                o.oy$ˮ͈ r0 = p004o.C0627oy.C0633.USERDATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r1 = 8
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                f4174 = r2
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p004o.C0627oy.C0632.m774():int[]");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 鷭 */
        public final byte[] mo4045(int i) {
            if (i >= 250) {
                return null;
            }
            if (this.f4176[i] != null && this.f4176[i].f4200 != null && this.f4176[i].f4200.length > 0) {
                return this.f4176[i].f4200;
            }
            C0606of ofVar = new C0606of();
            byte[] bytes = "a".getBytes();
            ofVar.mo4029(bytes.length);
            ofVar.f2975.put(bytes);
            C0606of ofVar2 = ofVar;
            byte[] bytes2 = Integer.valueOf(i).toString().getBytes();
            C0606of ofVar3 = ofVar2;
            ofVar2.mo4029(bytes2.length);
            ofVar3.f2975.put(bytes2);
            return Arrays.copyOf(ofVar3.f2975.array(), ofVar3.f2975.position());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 鷭 */
        public final byte[] mo4046(C0635 r7) {
            return m773(r7, 0, true, true, false);
        }

        /* renamed from: 鷭 */
        private byte[] m773(C0635 r14, int i, boolean z, boolean z2, boolean z3) {
            C0633 r6;
            if (r14.f4199 == null || r14.f4196 != C0634.GLOBAL) {
                r6 = r14.f4199;
            } else {
                r6 = C0633.GLOBAL;
            }
            byte[] bArr = new byte[i];
            Arrays.fill(bArr, 9);
            C0606of ofVar = new C0606of();
            if (!z3) {
                byte[] bArr2 = bArr;
                C0606of ofVar2 = ofVar;
                ofVar.mo4029(bArr2.length);
                ofVar2.f2975.put(bArr2);
            }
            switch (m774()[r6.ordinal()]) {
                case 2:
                    if (((Integer) r14.f4195).intValue() <= 0) {
                        byte[] bytes = "false".getBytes();
                        C0606of ofVar3 = ofVar;
                        ofVar.mo4029(bytes.length);
                        ofVar3.f2975.put(bytes);
                        break;
                    } else {
                        byte[] bytes2 = "true".getBytes();
                        C0606of ofVar4 = ofVar;
                        ofVar.mo4029(bytes2.length);
                        ofVar4.f2975.put(bytes2);
                        break;
                    }
                case 4:
                    double doubleValue = ((Double) r14.f4195).doubleValue();
                    if (z2) {
                        C0606of ofVar5 = ofVar;
                        ofVar.mo4029(1);
                        ofVar5.f2975.put(91);
                    }
                    if (doubleValue == Math.floor(doubleValue)) {
                        byte[] bytes3 = Long.valueOf((long) ((int) doubleValue)).toString().getBytes();
                        C0606of ofVar6 = ofVar;
                        ofVar.mo4029(bytes3.length);
                        ofVar6.f2975.put(bytes3);
                    } else {
                        byte[] bytes4 = Double.valueOf(doubleValue).toString().getBytes();
                        C0606of ofVar7 = ofVar;
                        ofVar.mo4029(bytes4.length);
                        ofVar7.f2975.put(bytes4);
                    }
                    if (z2) {
                        C0606of ofVar8 = ofVar;
                        ofVar.mo4029(1);
                        ofVar8.f2975.put(93);
                        break;
                    }
                    break;
                case 5:
                    if (r14.f4195 != null) {
                        C0606of ofVar9 = new C0606of();
                        C0606of ofVar10 = ofVar9;
                        byte[] bArr3 = (byte[]) r14.f4195;
                        ofVar9.mo4029(bArr3.length);
                        ofVar9.f2975.put(bArr3);
                        ofVar9.mo4028("\\".getBytes(), "\\\\".getBytes()).mo4028("\"".getBytes(), "\\\"".getBytes());
                        if (!z) {
                            byte[] copyOf = Arrays.copyOf(ofVar10.f2975.array(), ofVar10.f2975.position());
                            C0606of ofVar11 = ofVar;
                            ofVar.mo4029(copyOf.length);
                            ofVar11.f2975.put(copyOf);
                            break;
                        } else {
                            byte[] bytes5 = "\"".getBytes();
                            C0606of ofVar12 = ofVar;
                            ofVar.mo4029(bytes5.length);
                            ofVar12.f2975.put(bytes5);
                            byte[] copyOf2 = Arrays.copyOf(ofVar10.f2975.array(), ofVar10.f2975.position());
                            C0606of ofVar13 = ofVar;
                            ofVar.mo4029(copyOf2.length);
                            ofVar13.f2975.put(copyOf2);
                            byte[] bytes6 = "\"".getBytes();
                            C0606of ofVar14 = ofVar;
                            ofVar.mo4029(bytes6.length);
                            ofVar14.f2975.put(bytes6);
                            break;
                        }
                    }
                    break;
                case 6:
                    boolean z4 = false;
                    if (r14.f4191) {
                        int i2 = 1;
                        z4 = true;
                        Iterator it = ((TreeMap) r14.f4195).entrySet().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C0635 r62 = (C0635) ((Entry) it.next()).getKey();
                                if (r62.f4199 == C0633.NUMBER && ((double) i2) == ((Double) r62.f4195).doubleValue()) {
                                    i2++;
                                } else {
                                    z4 = false;
                                }
                            }
                        }
                        z4 = false;
                    }
                    byte[] bytes7 = "{\n".getBytes();
                    C0606of ofVar15 = ofVar;
                    ofVar.mo4029(bytes7.length);
                    ofVar15.f2975.put(bytes7);
                    for (Entry entry : ((TreeMap) r14.f4195).entrySet()) {
                        if (!z4) {
                            byte[] r10 = m773((C0635) entry.getKey(), i + 1, false, true, false);
                            C0606of ofVar16 = ofVar;
                            ofVar.mo4029(r10.length);
                            ofVar16.f2975.put(r10);
                            byte[] bytes8 = " = ".getBytes();
                            C0606of ofVar17 = ofVar;
                            ofVar.mo4029(bytes8.length);
                            ofVar17.f2975.put(bytes8);
                        }
                        byte[] r102 = m773((C0635) entry.getValue(), i + 1, ((C0635) entry.getValue()).f4199 == C0633.STRING, false, !z4);
                        C0606of ofVar18 = ofVar;
                        ofVar.mo4029(r102.length);
                        ofVar18.f2975.put(r102);
                        byte[] bytes9 = ",\n".getBytes();
                        C0606of ofVar19 = ofVar;
                        ofVar.mo4029(bytes9.length);
                        ofVar19.f2975.put(bytes9);
                    }
                    byte[] bArr4 = bArr;
                    C0606of ofVar20 = ofVar;
                    ofVar.mo4029(bArr4.length);
                    ofVar20.f2975.put(bArr4);
                    byte[] bytes10 = "}".getBytes();
                    C0606of ofVar21 = ofVar;
                    ofVar.mo4029(bytes10.length);
                    ofVar21.f2975.put(bytes10);
                    break;
                case 10:
                    byte[] bArr5 = r14.f4200;
                    C0606of ofVar22 = ofVar;
                    ofVar.mo4029(bArr5.length);
                    ofVar22.f2975.put(bArr5);
                    break;
                case 11:
                    if (!z2) {
                        byte[] bArr6 = r14.f4192;
                        C0606of ofVar23 = ofVar;
                        ofVar.mo4029(bArr6.length);
                        ofVar23.f2975.put(bArr6);
                        ofVar23.mo4029(1);
                        ofVar23.f2975.put(46);
                        C0606of ofVar24 = ofVar23;
                        byte[] bArr7 = r14.f4193;
                        C0606of ofVar25 = ofVar24;
                        ofVar24.mo4029(bArr7.length);
                        ofVar25.f2975.put(bArr7);
                        break;
                    } else {
                        C0606of ofVar26 = ofVar;
                        ofVar.mo4029(1);
                        ofVar26.f2975.put(91);
                        C0606of ofVar27 = ofVar26;
                        byte[] bArr8 = r14.f4192;
                        C0606of ofVar28 = ofVar27;
                        ofVar27.mo4029(bArr8.length);
                        ofVar28.f2975.put(bArr8);
                        ofVar28.mo4029(1);
                        ofVar28.f2975.put(46);
                        C0606of ofVar29 = ofVar28;
                        byte[] bArr9 = r14.f4193;
                        C0606of ofVar30 = ofVar29;
                        ofVar29.mo4029(bArr9.length);
                        ofVar30.f2975.put(bArr9);
                        ofVar30.mo4029(1);
                        ofVar30.f2975.put(93);
                        break;
                    }
                default:
                    new StringBuilder("ERROR: value2string! Unknown type ").append(r6).append("!\n");
                    break;
            }
            return Arrays.copyOf(ofVar.f2975.array(), ofVar.f2975.position());
        }
    }

    /* renamed from: o.oy$ˮ͈ */
    enum C0633 {
        NIL,
        BOOL,
        LIGHTUSERDATA,
        NUMBER,
        STRING,
        TABLE,
        FUNCTION,
        USERDATA,
        THREAD,
        GLOBAL,
        TABLEVALUE
    }

    /* renamed from: o.oy$櫯 */
    enum C0634 {
        GLOBAL
    }

    /* renamed from: o.oy$鷭 */
    class C0635 implements Comparable<C0635> {

        /* renamed from: Ą */
        boolean f4191;

        /* renamed from: ą */
        byte[] f4192;

        /* renamed from: Ć */
        byte[] f4193;

        /* renamed from: ć */
        int f4194;

        /* renamed from: ȃ */
        Object f4195;

        /* renamed from: ˮ͈ */
        C0634 f4196;

        /* renamed from: ˮ͍ */
        int f4197;

        /* renamed from: 櫯 */
        C0633 f4199;

        /* renamed from: 鷭 */
        byte[] f4200;

        public final /* synthetic */ int compareTo(Object obj) {
            C0635 r4 = (C0635) obj;
            if (this.f4199 != r4.f4199) {
                return this.f4199.ordinal() - r4.f4199.ordinal();
            }
            if (this.f4199 == C0633.BOOL) {
                return ((Integer) this.f4195).intValue() - ((Integer) r4.f4195).intValue();
            }
            if (this.f4199 == C0633.NUMBER) {
                double doubleValue = ((Double) this.f4195).doubleValue() - ((Double) r4.f4195).doubleValue();
                double d = doubleValue;
                if (doubleValue < 0.0d) {
                    return -1;
                }
                if (d == 0.0d || d > 0.0d) {
                }
            } else if (this.f4199 == C0633.STRING) {
                byte[] bArr = (byte[]) this.f4195;
                byte[] bArr2 = (byte[]) r4.f4195;
                int length = bArr.length;
                int length2 = bArr2.length;
                int max = Math.max(length, length2);
                for (int i = 0; i < max; i++) {
                    if (length != length2) {
                        if (i != length) {
                            if (i == length2) {
                                break;
                            }
                        } else {
                            return -1;
                        }
                    }
                    int i2 = (bArr[i] & 255) - (bArr2[i] & 255);
                    if (i2 != 0) {
                        return i2;
                    }
                }
            }
            return 1;
        }

        private C0635() {
        }

        /* synthetic */ C0635(C0627oy oyVar, C0635 r2) {
            this();
        }
    }

    static {
    }

    /* renamed from: 鷭 */
    public static boolean m765(byte[] bArr) {
        if (bArr[0] == 27 && bArr[1] == 76 && bArr[2] == 117 && bArr[3] == 97) {
            return true;
        }
        return false;
    }

    /* renamed from: 鷭 */
    static String m764(ByteBuffer byteBuffer) {
        byte[] r2 = m763(byteBuffer);
        if (r2 == null) {
            return "";
        }
        try {
            return Charset.forName("EUC-KR").newDecoder().decode(ByteBuffer.wrap(r2)).toString();
        } catch (CharacterCodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public static byte[] m763(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i <= 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (bArr[i2] == 0) {
                return Arrays.copyOf(bArr, i2);
            }
        }
        return bArr;
    }
}
