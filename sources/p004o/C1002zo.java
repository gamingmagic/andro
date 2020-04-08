package p004o;

import android.support.p000v4.media.session.PlaybackStateCompat;
import android.support.p000v4.view.InputDeviceCompat;
import java.util.List;
import java.util.Vector;

/* renamed from: o.zo */
public final class C1002zo extends C1001zn {

    /* renamed from: Ć */
    private static /* synthetic */ int[] f6016;

    /* renamed from: ć */
    private static /* synthetic */ int[] f6017;

    /* renamed from: Ą */
    private int f6018;

    /* renamed from: ą */
    private int f6019;

    /* renamed from: ȃ */
    private int f6020 = 25000000;

    /* renamed from: ˮ͈ */
    private int f6021;

    /* renamed from: 櫯 */
    private int[] f6022 = new int[8];

    /* renamed from: 鷭 */
    public byte[] f6023 = null;

    /* JADX WARNING: Can't wrap try/catch for region: R(19:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0034 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0048 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0052 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0020 */
    /* renamed from: 櫯 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m1790() {
        /*
            int[] r0 = f6017
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.zx[] r0 = p004o.C1011zx.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.zx r0 = p004o.C1011zx.VMSF_AUDIO     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.zx r0 = p004o.C1011zx.VMSF_DELTA     // Catch:{ NoSuchFieldError -> 0x0020 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0020 }
        L_0x0020:
            o.zx r0 = p004o.C1011zx.VMSF_E8     // Catch:{ NoSuchFieldError -> 0x002a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            o.zx r0 = p004o.C1011zx.VMSF_E8E9     // Catch:{ NoSuchFieldError -> 0x0034 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0034 }
        L_0x0034:
            o.zx r0 = p004o.C1011zx.VMSF_ITANIUM     // Catch:{ NoSuchFieldError -> 0x003e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            o.zx r0 = p004o.C1011zx.VMSF_NONE     // Catch:{ NoSuchFieldError -> 0x0048 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0048 }
        L_0x0048:
            o.zx r0 = p004o.C1011zx.VMSF_RGB     // Catch:{ NoSuchFieldError -> 0x0052 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0052 }
        L_0x0052:
            o.zx r0 = p004o.C1011zx.VMSF_UPCASE     // Catch:{ NoSuchFieldError -> 0x005d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
            r1 = 8
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x005d }
        L_0x005d:
            f6017 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1002zo.m1790():int[]");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(112:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|(2:112|113)|114|116) */
    /* JADX WARNING: Can't wrap try/catch for region: R(113:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|116) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x0216 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:102:0x0221 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:104:0x022b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:106:0x0236 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x0241 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:110:0x024c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:112:0x0257 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0042 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0057 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0062 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0078 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0083 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x008e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0099 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00a3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00ae */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00b9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00c4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00cf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00da */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00e5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00f0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00fb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0105 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0110 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x011a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0124 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x012f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x013a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x0145 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0150 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x015b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x0166 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0017 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x0171 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x017c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x0187 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x0192 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x019d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x01a8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:82:0x01b3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x01be */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x01c9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x01d4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x01df */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x01ea */
    /* JADX WARNING: Missing exception handler attribute for start block: B:94:0x01f5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x0200 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:98:0x020b */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m1800() {
        /*
            int[] r0 = f6016
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.zq[] r0 = p004o.C1004zq.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.zq r0 = p004o.C1004zq.VM_ADC     // Catch:{ NoSuchFieldError -> 0x0017 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
            r1 = 38
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0017 }
        L_0x0017:
            o.zq r0 = p004o.C1004zq.VM_ADD     // Catch:{ NoSuchFieldError -> 0x0021 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            o.zq r0 = p004o.C1004zq.VM_ADDB     // Catch:{ NoSuchFieldError -> 0x002c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002c }
            r1 = 45
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002c }
        L_0x002c:
            o.zq r0 = p004o.C1004zq.VM_ADDD     // Catch:{ NoSuchFieldError -> 0x0037 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0037 }
            r1 = 46
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0037 }
        L_0x0037:
            o.zq r0 = p004o.C1004zq.VM_AND     // Catch:{ NoSuchFieldError -> 0x0042 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0042 }
            r1 = 11
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0042 }
        L_0x0042:
            o.zq r0 = p004o.C1004zq.VM_CALL     // Catch:{ NoSuchFieldError -> 0x004d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
            r1 = 22
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x004d }
        L_0x004d:
            o.zq r0 = p004o.C1004zq.VM_CMP     // Catch:{ NoSuchFieldError -> 0x0057 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0057 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0057 }
        L_0x0057:
            o.zq r0 = p004o.C1004zq.VM_CMPB     // Catch:{ NoSuchFieldError -> 0x0062 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
            r1 = 43
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0062 }
        L_0x0062:
            o.zq r0 = p004o.C1004zq.VM_CMPD     // Catch:{ NoSuchFieldError -> 0x006d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
            r1 = 44
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x006d }
        L_0x006d:
            o.zq r0 = p004o.C1004zq.VM_DEC     // Catch:{ NoSuchFieldError -> 0x0078 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
            r1 = 8
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0078 }
        L_0x0078:
            o.zq r0 = p004o.C1004zq.VM_DECB     // Catch:{ NoSuchFieldError -> 0x0083 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
            r1 = 51
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0083 }
        L_0x0083:
            o.zq r0 = p004o.C1004zq.VM_DECD     // Catch:{ NoSuchFieldError -> 0x008e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x008e }
            r1 = 52
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x008e }
        L_0x008e:
            o.zq r0 = p004o.C1004zq.VM_DIV     // Catch:{ NoSuchFieldError -> 0x0099 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
            r1 = 37
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0099 }
        L_0x0099:
            o.zq r0 = p004o.C1004zq.VM_INC     // Catch:{ NoSuchFieldError -> 0x00a3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a3 }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00a3 }
        L_0x00a3:
            o.zq r0 = p004o.C1004zq.VM_INCB     // Catch:{ NoSuchFieldError -> 0x00ae }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ae }
            r1 = 49
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00ae }
        L_0x00ae:
            o.zq r0 = p004o.C1004zq.VM_INCD     // Catch:{ NoSuchFieldError -> 0x00b9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b9 }
            r1 = 50
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00b9 }
        L_0x00b9:
            o.zq r0 = p004o.C1004zq.VM_JA     // Catch:{ NoSuchFieldError -> 0x00c4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c4 }
            r1 = 18
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00c4 }
        L_0x00c4:
            o.zq r0 = p004o.C1004zq.VM_JAE     // Catch:{ NoSuchFieldError -> 0x00cf }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cf }
            r1 = 19
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00cf }
        L_0x00cf:
            o.zq r0 = p004o.C1004zq.VM_JB     // Catch:{ NoSuchFieldError -> 0x00da }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00da }
            r1 = 16
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00da }
        L_0x00da:
            o.zq r0 = p004o.C1004zq.VM_JBE     // Catch:{ NoSuchFieldError -> 0x00e5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e5 }
            r1 = 17
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00e5 }
        L_0x00e5:
            o.zq r0 = p004o.C1004zq.VM_JMP     // Catch:{ NoSuchFieldError -> 0x00f0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
            r1 = 9
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00f0 }
        L_0x00f0:
            o.zq r0 = p004o.C1004zq.VM_JNS     // Catch:{ NoSuchFieldError -> 0x00fb }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fb }
            r1 = 15
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00fb }
        L_0x00fb:
            o.zq r0 = p004o.C1004zq.VM_JNZ     // Catch:{ NoSuchFieldError -> 0x0105 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0105 }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0105 }
        L_0x0105:
            o.zq r0 = p004o.C1004zq.VM_JS     // Catch:{ NoSuchFieldError -> 0x0110 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0110 }
            r1 = 14
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0110 }
        L_0x0110:
            o.zq r0 = p004o.C1004zq.VM_JZ     // Catch:{ NoSuchFieldError -> 0x011a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x011a }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x011a }
        L_0x011a:
            o.zq r0 = p004o.C1004zq.VM_MOV     // Catch:{ NoSuchFieldError -> 0x0124 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0124 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0124 }
        L_0x0124:
            o.zq r0 = p004o.C1004zq.VM_MOVB     // Catch:{ NoSuchFieldError -> 0x012f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
            r1 = 41
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x012f }
        L_0x012f:
            o.zq r0 = p004o.C1004zq.VM_MOVD     // Catch:{ NoSuchFieldError -> 0x013a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x013a }
            r1 = 42
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x013a }
        L_0x013a:
            o.zq r0 = p004o.C1004zq.VM_MOVSX     // Catch:{ NoSuchFieldError -> 0x0145 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0145 }
            r1 = 34
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0145 }
        L_0x0145:
            o.zq r0 = p004o.C1004zq.VM_MOVZX     // Catch:{ NoSuchFieldError -> 0x0150 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0150 }
            r1 = 33
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0150 }
        L_0x0150:
            o.zq r0 = p004o.C1004zq.VM_MUL     // Catch:{ NoSuchFieldError -> 0x015b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x015b }
            r1 = 36
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x015b }
        L_0x015b:
            o.zq r0 = p004o.C1004zq.VM_NEG     // Catch:{ NoSuchFieldError -> 0x0166 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0166 }
            r1 = 28
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0166 }
        L_0x0166:
            o.zq r0 = p004o.C1004zq.VM_NEGB     // Catch:{ NoSuchFieldError -> 0x0171 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0171 }
            r1 = 53
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0171 }
        L_0x0171:
            o.zq r0 = p004o.C1004zq.VM_NEGD     // Catch:{ NoSuchFieldError -> 0x017c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x017c }
            r1 = 54
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x017c }
        L_0x017c:
            o.zq r0 = p004o.C1004zq.VM_NOT     // Catch:{ NoSuchFieldError -> 0x0187 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0187 }
            r1 = 24
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0187 }
        L_0x0187:
            o.zq r0 = p004o.C1004zq.VM_OR     // Catch:{ NoSuchFieldError -> 0x0192 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0192 }
            r1 = 12
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0192 }
        L_0x0192:
            o.zq r0 = p004o.C1004zq.VM_POP     // Catch:{ NoSuchFieldError -> 0x019d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x019d }
            r1 = 21
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x019d }
        L_0x019d:
            o.zq r0 = p004o.C1004zq.VM_POPA     // Catch:{ NoSuchFieldError -> 0x01a8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a8 }
            r1 = 30
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01a8 }
        L_0x01a8:
            o.zq r0 = p004o.C1004zq.VM_POPF     // Catch:{ NoSuchFieldError -> 0x01b3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b3 }
            r1 = 32
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01b3 }
        L_0x01b3:
            o.zq r0 = p004o.C1004zq.VM_PRINT     // Catch:{ NoSuchFieldError -> 0x01be }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01be }
            r1 = 40
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01be }
        L_0x01be:
            o.zq r0 = p004o.C1004zq.VM_PUSH     // Catch:{ NoSuchFieldError -> 0x01c9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c9 }
            r1 = 20
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01c9 }
        L_0x01c9:
            o.zq r0 = p004o.C1004zq.VM_PUSHA     // Catch:{ NoSuchFieldError -> 0x01d4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d4 }
            r1 = 29
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01d4 }
        L_0x01d4:
            o.zq r0 = p004o.C1004zq.VM_PUSHF     // Catch:{ NoSuchFieldError -> 0x01df }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01df }
            r1 = 31
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01df }
        L_0x01df:
            o.zq r0 = p004o.C1004zq.VM_RET     // Catch:{ NoSuchFieldError -> 0x01ea }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ea }
            r1 = 23
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01ea }
        L_0x01ea:
            o.zq r0 = p004o.C1004zq.VM_SAR     // Catch:{ NoSuchFieldError -> 0x01f5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01f5 }
            r1 = 27
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01f5 }
        L_0x01f5:
            o.zq r0 = p004o.C1004zq.VM_SBB     // Catch:{ NoSuchFieldError -> 0x0200 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0200 }
            r1 = 39
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0200 }
        L_0x0200:
            o.zq r0 = p004o.C1004zq.VM_SHL     // Catch:{ NoSuchFieldError -> 0x020b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x020b }
            r1 = 25
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x020b }
        L_0x020b:
            o.zq r0 = p004o.C1004zq.VM_SHR     // Catch:{ NoSuchFieldError -> 0x0216 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0216 }
            r1 = 26
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0216 }
        L_0x0216:
            o.zq r0 = p004o.C1004zq.VM_STANDARD     // Catch:{ NoSuchFieldError -> 0x0221 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0221 }
            r1 = 55
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0221 }
        L_0x0221:
            o.zq r0 = p004o.C1004zq.VM_SUB     // Catch:{ NoSuchFieldError -> 0x022b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x022b }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x022b }
        L_0x022b:
            o.zq r0 = p004o.C1004zq.VM_SUBB     // Catch:{ NoSuchFieldError -> 0x0236 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0236 }
            r1 = 47
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0236 }
        L_0x0236:
            o.zq r0 = p004o.C1004zq.VM_SUBD     // Catch:{ NoSuchFieldError -> 0x0241 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0241 }
            r1 = 48
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0241 }
        L_0x0241:
            o.zq r0 = p004o.C1004zq.VM_TEST     // Catch:{ NoSuchFieldError -> 0x024c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x024c }
            r1 = 13
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x024c }
        L_0x024c:
            o.zq r0 = p004o.C1004zq.VM_XCHG     // Catch:{ NoSuchFieldError -> 0x0257 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0257 }
            r1 = 35
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0257 }
        L_0x0257:
            o.zq r0 = p004o.C1004zq.VM_XOR     // Catch:{ NoSuchFieldError -> 0x0262 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0262 }
            r1 = 10
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0262 }
        L_0x0262:
            f6016 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1002zo.m1800():int[]");
    }

    /* renamed from: 鷭 */
    private int m1793(boolean z, byte[] bArr, int i) {
        if (z) {
            if (this.f6023 == bArr) {
                return bArr[i];
            }
            return bArr[i] & 255;
        }
        if (this.f6023 == bArr) {
            return C0947xs.m1640(bArr, i);
        }
        byte[] bArr2 = bArr;
        int i2 = i;
        return (((((((bArr2[i2] & 255) | 0) << 8) | (bArr2[i2 + 1] & 255)) << 8) | (bArr2[i2 + 2] & 255)) << 8) | (bArr2[i2 + 3] & 255);
    }

    /* renamed from: 鷭 */
    private void m1798(boolean z, byte[] bArr, int i, int i2) {
        if (z) {
            if (this.f6023 == bArr) {
                bArr[i] = (byte) i2;
            } else {
                bArr[i] = (byte) (((byte) (i2 & 255)) | 0);
            }
        } else {
            if (this.f6023 == bArr) {
                C0947xs.m1642(bArr, i, i2);
                return;
            }
            byte[] bArr2 = bArr;
            int i3 = i;
            int i4 = i2;
            int i5 = i3;
            bArr2[i5] = (byte) ((i4 >>> 24) & 255);
            bArr2[i5 + 1] = (byte) ((i4 >>> 16) & 255);
            bArr2[i5 + 2] = (byte) ((i4 >>> 8) & 255);
            bArr2[i5 + 3] = (byte) (i4 & 255);
        }
    }

    /* renamed from: 鷭 */
    public static void m1795(Vector<Byte> vector, int i, int i2) {
        vector.set(i + 0, Byte.valueOf((byte) (i2 & 255)));
        vector.set(i + 1, Byte.valueOf((byte) ((i2 >>> 8) & 255)));
        vector.set(i + 2, Byte.valueOf((byte) ((i2 >>> 16) & 255)));
        vector.set(i + 3, Byte.valueOf((byte) ((i2 >>> 24) & 255)));
    }

    /* renamed from: 鷭 */
    private int m1792(C1008zu zuVar) {
        if (zuVar.f6100 == C1006zs.VM_OPREGMEM) {
            return C0947xs.m1640(this.f6023, (zuVar.f6097 + zuVar.f6098) & 262143);
        }
        return C0947xs.m1640(this.f6023, zuVar.f6097);
    }

    /* renamed from: 鷭 */
    public final void mo4253(C1009zv zvVar) {
        List<C1007zt> list;
        for (int i = 0; i < zvVar.f6102.length; i++) {
            this.f6022[i] = zvVar.f6102[i];
        }
        long min = (long) (Math.min(zvVar.f6105.size(), 8192) & -1);
        long j = min;
        if (min != 0) {
            for (int i2 = 0; ((long) i2) < j; i2++) {
                this.f6023[245760 + i2] = ((Byte) zvVar.f6105.get(i2)).byteValue();
            }
        }
        long min2 = Math.min((long) zvVar.f6101.size(), PlaybackStateCompat.ACTION_PLAY_FROM_URI - j) & -1;
        long j2 = min2;
        if (min2 != 0) {
            for (int i3 = 0; ((long) i3) < j2; i3++) {
                this.f6023[((int) j) + 245760 + i3] = ((Byte) zvVar.f6101.get(i3)).byteValue();
            }
        }
        this.f6022[7] = 262144;
        this.f6021 = 0;
        if (zvVar.f6107.size() != 0) {
            list = zvVar.f6107;
        } else {
            list = zvVar.f6108;
        }
        m1799(list, zvVar.f6106);
        int r4 = m1793(false, this.f6023, 245792) & 262143;
        int r5 = m1793(false, this.f6023, 245788) & 262143;
        if (r4 + r5 >= 262144) {
            r4 = 0;
            r5 = 0;
        }
        zvVar.f6103 = r4;
        zvVar.f6104 = r5;
        zvVar.f6105.clear();
        int min3 = Math.min(m1793(false, this.f6023, 245808), 8128);
        if (min3 != 0) {
            zvVar.f6105.setSize(min3 + 64);
            for (int i4 = 0; i4 < min3 + 64; i4++) {
                zvVar.f6105.set(i4, Byte.valueOf(this.f6023[245760 + i4]));
            }
        }
    }

    /* renamed from: ˮ͈ */
    private boolean m1788(int i) {
        if (i >= this.f6018) {
            return true;
        }
        int i2 = this.f6020 - 1;
        this.f6020 = i2;
        if (i2 <= 0) {
            return false;
        }
        this.f6019 = i;
        return true;
    }

    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1799(java.util.List<p004o.C1007zt> r12, int r13) {
        /*
            r11 = this;
            r0 = 25000000(0x17d7840, float:4.6555036E-38)
            r11.f6020 = r0
            r11.f6018 = r13
            r0 = 0
            r11.f6019 = r0
        L_0x000a:
            int r0 = r11.f6019
            java.lang.Object r0 = r12.get(r0)
            o.zt r0 = (p004o.C1007zt) r0
            r13 = r0
            o.zu r0 = r13.f6094
            int r7 = r11.m1792(r0)
            o.zu r0 = r13.f6093
            int r8 = r11.m1792(r0)
            int[] r0 = m1800()
            o.zq r1 = r13.f6096
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x00a2;
                case 2: goto L_0x00d1;
                case 3: goto L_0x0148;
                case 4: goto L_0x01d8;
                case 5: goto L_0x0250;
                case 6: goto L_0x0265;
                case 7: goto L_0x027a;
                case 8: goto L_0x02cc;
                case 9: goto L_0x0318;
                case 10: goto L_0x0324;
                case 11: goto L_0x034d;
                case 12: goto L_0x0376;
                case 13: goto L_0x039f;
                case 14: goto L_0x03c1;
                case 15: goto L_0x03d6;
                case 16: goto L_0x03eb;
                case 17: goto L_0x0400;
                case 18: goto L_0x041a;
                case 19: goto L_0x0434;
                case 20: goto L_0x0449;
                case 21: goto L_0x046b;
                case 22: goto L_0x048d;
                case 23: goto L_0x0750;
                case 24: goto L_0x04b6;
                case 25: goto L_0x04c9;
                case 26: goto L_0x0502;
                case 27: goto L_0x0535;
                case 28: goto L_0x0568;
                case 29: goto L_0x05ad;
                case 30: goto L_0x05d8;
                case 31: goto L_0x05fa;
                case 32: goto L_0x0617;
                case 33: goto L_0x0635;
                case 34: goto L_0x0644;
                case 35: goto L_0x0654;
                case 36: goto L_0x0674;
                case 37: goto L_0x069a;
                case 38: goto L_0x06b7;
                case 39: goto L_0x0703;
                case 40: goto L_0x0785;
                case 41: goto L_0x00b3;
                case 42: goto L_0x00c2;
                case 43: goto L_0x00fa;
                case 44: goto L_0x0121;
                case 45: goto L_0x0198;
                case 46: goto L_0x01b8;
                case 47: goto L_0x020e;
                case 48: goto L_0x022f;
                case 49: goto L_0x02a4;
                case 50: goto L_0x02b8;
                case 51: goto L_0x02f0;
                case 52: goto L_0x0304;
                case 53: goto L_0x058d;
                case 54: goto L_0x059d;
                case 55: goto L_0x077a;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x0785
        L_0x00a2:
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            boolean r2 = r13.f6095
            byte[] r3 = r11.f6023
            int r2 = r11.m1793(r2, r3, r8)
            r11.m1798(r0, r1, r7, r2)
            goto L_0x0785
        L_0x00b3:
            byte[] r0 = r11.f6023
            byte[] r1 = r11.f6023
            r2 = 1
            int r1 = r11.m1793(r2, r1, r8)
            r2 = 1
            r11.m1798(r2, r0, r7, r1)
            goto L_0x0785
        L_0x00c2:
            byte[] r0 = r11.f6023
            byte[] r1 = r11.f6023
            r2 = 0
            int r1 = r11.m1793(r2, r1, r8)
            r2 = 0
            r11.m1798(r2, r0, r7, r1)
            goto L_0x0785
        L_0x00d1:
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r9 = r11.m1793(r0, r1, r7)
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r0 = r11.m1793(r0, r1, r8)
            int r10 = r9 - r0
            if (r10 != 0) goto L_0x00ed
            o.zr r0 = p004o.C1005zr.VM_FZ
            int r0 = r0.f6086
            r11.f6021 = r0
            goto L_0x0785
        L_0x00ed:
            if (r10 <= r9) goto L_0x00f1
            r0 = 1
            goto L_0x00f6
        L_0x00f1:
            o.zr r0 = p004o.C1005zr.VM_FS
            int r0 = r0.f6086
            r0 = r0 & r10
        L_0x00f6:
            r11.f6021 = r0
            goto L_0x0785
        L_0x00fa:
            byte[] r0 = r11.f6023
            r1 = 1
            int r9 = r11.m1793(r1, r0, r7)
            byte[] r0 = r11.f6023
            r1 = 1
            int r0 = r11.m1793(r1, r0, r8)
            int r10 = r9 - r0
            if (r10 != 0) goto L_0x0114
            o.zr r0 = p004o.C1005zr.VM_FZ
            int r0 = r0.f6086
            r11.f6021 = r0
            goto L_0x0785
        L_0x0114:
            if (r10 <= r9) goto L_0x0118
            r0 = 1
            goto L_0x011d
        L_0x0118:
            o.zr r0 = p004o.C1005zr.VM_FS
            int r0 = r0.f6086
            r0 = r0 & r10
        L_0x011d:
            r11.f6021 = r0
            goto L_0x0785
        L_0x0121:
            byte[] r0 = r11.f6023
            r1 = 0
            int r9 = r11.m1793(r1, r0, r7)
            byte[] r0 = r11.f6023
            r1 = 0
            int r0 = r11.m1793(r1, r0, r8)
            int r10 = r9 - r0
            if (r10 != 0) goto L_0x013b
            o.zr r0 = p004o.C1005zr.VM_FZ
            int r0 = r0.f6086
            r11.f6021 = r0
            goto L_0x0785
        L_0x013b:
            if (r10 <= r9) goto L_0x013f
            r0 = 1
            goto L_0x0144
        L_0x013f:
            o.zr r0 = p004o.C1005zr.VM_FS
            int r0 = r0.f6086
            r0 = r0 & r10
        L_0x0144:
            r11.f6021 = r0
            goto L_0x0785
        L_0x0148:
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r9 = r11.m1793(r0, r1, r7)
            long r0 = (long) r9
            boolean r2 = r13.f6095
            byte[] r3 = r11.f6023
            int r2 = r11.m1793(r2, r3, r8)
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = -1
            long r0 = r0 & r2
            int r10 = (int) r0
            boolean r0 = r13.f6095
            if (r0 == 0) goto L_0x017d
            r10 = r10 & 255(0xff, float:3.57E-43)
            if (r10 >= r9) goto L_0x0169
            r0 = 1
            goto L_0x017a
        L_0x0169:
            if (r10 != 0) goto L_0x0170
            o.zr r0 = p004o.C1005zr.VM_FZ
            int r0 = r0.f6086
            goto L_0x017a
        L_0x0170:
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0179
            o.zr r0 = p004o.C1005zr.VM_FS
            int r0 = r0.f6086
            goto L_0x017a
        L_0x0179:
            r0 = 0
        L_0x017a:
            r11.f6021 = r0
            goto L_0x018f
        L_0x017d:
            if (r10 >= r9) goto L_0x0181
            r0 = 1
            goto L_0x018d
        L_0x0181:
            if (r10 != 0) goto L_0x0188
            o.zr r0 = p004o.C1005zr.VM_FZ
            int r0 = r0.f6086
            goto L_0x018d
        L_0x0188:
            o.zr r0 = p004o.C1005zr.VM_FS
            int r0 = r0.f6086
            r0 = r0 & r10
        L_0x018d:
            r11.f6021 = r0
        L_0x018f:
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            r11.m1798(r0, r1, r7, r10)
            goto L_0x0785
        L_0x0198:
            byte[] r0 = r11.f6023
            byte[] r1 = r11.f6023
            r2 = 1
            int r1 = r11.m1793(r2, r1, r7)
            long r1 = (long) r1
            byte[] r3 = r11.f6023
            r4 = 1
            int r3 = r11.m1793(r4, r3, r8)
            long r3 = (long) r3
            r5 = -1
            long r3 = r3 + r5
            long r1 = r1 & r3
            r3 = -1
            long r1 = r1 & r3
            int r1 = (int) r1
            r2 = 1
            r11.m1798(r2, r0, r7, r1)
            goto L_0x0785
        L_0x01b8:
            byte[] r0 = r11.f6023
            byte[] r1 = r11.f6023
            r2 = 0
            int r1 = r11.m1793(r2, r1, r7)
            long r1 = (long) r1
            byte[] r3 = r11.f6023
            r4 = 0
            int r3 = r11.m1793(r4, r3, r8)
            long r3 = (long) r3
            r5 = -1
            long r3 = r3 + r5
            long r1 = r1 & r3
            r3 = -1
            long r1 = r1 & r3
            int r1 = (int) r1
            r2 = 0
            r11.m1798(r2, r0, r7, r1)
            goto L_0x0785
        L_0x01d8:
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r9 = r11.m1793(r0, r1, r7)
            long r0 = (long) r9
            boolean r2 = r13.f6095
            byte[] r3 = r11.f6023
            int r2 = r11.m1793(r2, r3, r8)
            long r2 = (long) r2
            r4 = -1
            long r2 = r4 - r2
            long r0 = r0 & r2
            r2 = -1
            long r0 = r0 & r2
            int r10 = (int) r0
            if (r10 != 0) goto L_0x01fa
            o.zr r0 = p004o.C1005zr.VM_FZ
            int r0 = r0.f6086
            goto L_0x0203
        L_0x01fa:
            if (r10 <= r9) goto L_0x01fe
            r0 = 1
            goto L_0x0203
        L_0x01fe:
            o.zr r0 = p004o.C1005zr.VM_FS
            int r0 = r0.f6086
            r0 = r0 & r10
        L_0x0203:
            r11.f6021 = r0
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            r11.m1798(r0, r1, r7, r10)
            goto L_0x0785
        L_0x020e:
            byte[] r0 = r11.f6023
            byte[] r1 = r11.f6023
            r2 = 1
            int r1 = r11.m1793(r2, r1, r7)
            long r1 = (long) r1
            byte[] r3 = r11.f6023
            r4 = 1
            int r3 = r11.m1793(r4, r3, r8)
            long r3 = (long) r3
            r5 = -1
            long r3 = r5 - r3
            long r1 = r1 & r3
            r3 = -1
            long r1 = r1 & r3
            int r1 = (int) r1
            r2 = 1
            r11.m1798(r2, r0, r7, r1)
            goto L_0x0785
        L_0x022f:
            byte[] r0 = r11.f6023
            byte[] r1 = r11.f6023
            r2 = 0
            int r1 = r11.m1793(r2, r1, r7)
            long r1 = (long) r1
            byte[] r3 = r11.f6023
            r4 = 0
            int r3 = r11.m1793(r4, r3, r8)
            long r3 = (long) r3
            r5 = -1
            long r3 = r5 - r3
            long r1 = r1 & r3
            r3 = -1
            long r1 = r1 & r3
            int r1 = (int) r1
            r2 = 0
            r11.m1798(r2, r0, r7, r1)
            goto L_0x0785
        L_0x0250:
            int r0 = r11.f6021
            o.zr r1 = p004o.C1005zr.VM_FZ
            int r1 = r1.f6086
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0785
            byte[] r0 = r11.f6023
            r1 = 0
            int r0 = r11.m1793(r1, r0, r7)
            r11.m1788(r0)
            goto L_0x000a
        L_0x0265:
            int r0 = r11.f6021
            o.zr r1 = p004o.C1005zr.VM_FZ
            int r1 = r1.f6086
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0785
            byte[] r0 = r11.f6023
            r1 = 0
            int r0 = r11.m1793(r1, r0, r7)
            r11.m1788(r0)
            goto L_0x000a
        L_0x027a:
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r0 = r11.m1793(r0, r1, r7)
            long r0 = (long) r0
            r2 = 0
            long r0 = r0 & r2
            int r9 = (int) r0
            boolean r0 = r13.f6095
            if (r0 == 0) goto L_0x028d
            r9 = r9 & 255(0xff, float:3.57E-43)
        L_0x028d:
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            r11.m1798(r0, r1, r7, r9)
            if (r9 != 0) goto L_0x029b
            o.zr r0 = p004o.C1005zr.VM_FZ
            int r0 = r0.f6086
            goto L_0x02a0
        L_0x029b:
            o.zr r0 = p004o.C1005zr.VM_FS
            int r0 = r0.f6086
            r0 = r0 & r9
        L_0x02a0:
            r11.f6021 = r0
            goto L_0x0785
        L_0x02a4:
            byte[] r0 = r11.f6023
            byte[] r1 = r11.f6023
            r2 = 1
            int r1 = r11.m1793(r2, r1, r7)
            long r1 = (long) r1
            r3 = 0
            long r1 = r1 & r3
            int r1 = (int) r1
            r2 = 1
            r11.m1798(r2, r0, r7, r1)
            goto L_0x0785
        L_0x02b8:
            byte[] r0 = r11.f6023
            byte[] r1 = r11.f6023
            r2 = 0
            int r1 = r11.m1793(r2, r1, r7)
            long r1 = (long) r1
            r3 = 0
            long r1 = r1 & r3
            int r1 = (int) r1
            r2 = 0
            r11.m1798(r2, r0, r7, r1)
            goto L_0x0785
        L_0x02cc:
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r0 = r11.m1793(r0, r1, r7)
            long r0 = (long) r0
            r2 = -2
            long r0 = r0 & r2
            int r9 = (int) r0
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            r11.m1798(r0, r1, r7, r9)
            if (r9 != 0) goto L_0x02e7
            o.zr r0 = p004o.C1005zr.VM_FZ
            int r0 = r0.f6086
            goto L_0x02ec
        L_0x02e7:
            o.zr r0 = p004o.C1005zr.VM_FS
            int r0 = r0.f6086
            r0 = r0 & r9
        L_0x02ec:
            r11.f6021 = r0
            goto L_0x0785
        L_0x02f0:
            byte[] r0 = r11.f6023
            byte[] r1 = r11.f6023
            r2 = 1
            int r1 = r11.m1793(r2, r1, r7)
            long r1 = (long) r1
            r3 = -2
            long r1 = r1 & r3
            int r1 = (int) r1
            r2 = 1
            r11.m1798(r2, r0, r7, r1)
            goto L_0x0785
        L_0x0304:
            byte[] r0 = r11.f6023
            byte[] r1 = r11.f6023
            r2 = 0
            int r1 = r11.m1793(r2, r1, r7)
            long r1 = (long) r1
            r3 = -2
            long r1 = r1 & r3
            int r1 = (int) r1
            r2 = 0
            r11.m1798(r2, r0, r7, r1)
            goto L_0x0785
        L_0x0318:
            byte[] r0 = r11.f6023
            r1 = 0
            int r0 = r11.m1793(r1, r0, r7)
            r11.m1788(r0)
            goto L_0x000a
        L_0x0324:
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r0 = r11.m1793(r0, r1, r7)
            boolean r1 = r13.f6095
            byte[] r2 = r11.f6023
            int r1 = r11.m1793(r1, r2, r8)
            r9 = r0 ^ r1
            if (r9 != 0) goto L_0x033d
            o.zr r0 = p004o.C1005zr.VM_FZ
            int r0 = r0.f6086
            goto L_0x0342
        L_0x033d:
            o.zr r0 = p004o.C1005zr.VM_FS
            int r0 = r0.f6086
            r0 = r0 & r9
        L_0x0342:
            r11.f6021 = r0
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            r11.m1798(r0, r1, r7, r9)
            goto L_0x0785
        L_0x034d:
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r0 = r11.m1793(r0, r1, r7)
            boolean r1 = r13.f6095
            byte[] r2 = r11.f6023
            int r1 = r11.m1793(r1, r2, r8)
            r9 = r0 & r1
            if (r9 != 0) goto L_0x0366
            o.zr r0 = p004o.C1005zr.VM_FZ
            int r0 = r0.f6086
            goto L_0x036b
        L_0x0366:
            o.zr r0 = p004o.C1005zr.VM_FS
            int r0 = r0.f6086
            r0 = r0 & r9
        L_0x036b:
            r11.f6021 = r0
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            r11.m1798(r0, r1, r7, r9)
            goto L_0x0785
        L_0x0376:
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r0 = r11.m1793(r0, r1, r7)
            boolean r1 = r13.f6095
            byte[] r2 = r11.f6023
            int r1 = r11.m1793(r1, r2, r8)
            r9 = r0 | r1
            if (r9 != 0) goto L_0x038f
            o.zr r0 = p004o.C1005zr.VM_FZ
            int r0 = r0.f6086
            goto L_0x0394
        L_0x038f:
            o.zr r0 = p004o.C1005zr.VM_FS
            int r0 = r0.f6086
            r0 = r0 & r9
        L_0x0394:
            r11.f6021 = r0
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            r11.m1798(r0, r1, r7, r9)
            goto L_0x0785
        L_0x039f:
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r0 = r11.m1793(r0, r1, r7)
            boolean r1 = r13.f6095
            byte[] r2 = r11.f6023
            int r1 = r11.m1793(r1, r2, r8)
            r9 = r0 & r1
            if (r9 != 0) goto L_0x03b8
            o.zr r0 = p004o.C1005zr.VM_FZ
            int r0 = r0.f6086
            goto L_0x03bd
        L_0x03b8:
            o.zr r0 = p004o.C1005zr.VM_FS
            int r0 = r0.f6086
            r0 = r0 & r9
        L_0x03bd:
            r11.f6021 = r0
            goto L_0x0785
        L_0x03c1:
            int r0 = r11.f6021
            o.zr r1 = p004o.C1005zr.VM_FS
            int r1 = r1.f6086
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0785
            byte[] r0 = r11.f6023
            r1 = 0
            int r0 = r11.m1793(r1, r0, r7)
            r11.m1788(r0)
            goto L_0x000a
        L_0x03d6:
            int r0 = r11.f6021
            o.zr r1 = p004o.C1005zr.VM_FS
            int r1 = r1.f6086
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0785
            byte[] r0 = r11.f6023
            r1 = 0
            int r0 = r11.m1793(r1, r0, r7)
            r11.m1788(r0)
            goto L_0x000a
        L_0x03eb:
            int r0 = r11.f6021
            o.zr r1 = p004o.C1005zr.VM_FC
            int r1 = r1.f6086
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0785
            byte[] r0 = r11.f6023
            r1 = 0
            int r0 = r11.m1793(r1, r0, r7)
            r11.m1788(r0)
            goto L_0x000a
        L_0x0400:
            int r0 = r11.f6021
            o.zr r1 = p004o.C1005zr.VM_FC
            int r1 = r1.f6086
            o.zr r2 = p004o.C1005zr.VM_FZ
            int r2 = r2.f6086
            r1 = r1 | r2
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0785
            byte[] r0 = r11.f6023
            r1 = 0
            int r0 = r11.m1793(r1, r0, r7)
            r11.m1788(r0)
            goto L_0x000a
        L_0x041a:
            int r0 = r11.f6021
            o.zr r1 = p004o.C1005zr.VM_FC
            int r1 = r1.f6086
            o.zr r2 = p004o.C1005zr.VM_FZ
            int r2 = r2.f6086
            r1 = r1 | r2
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0785
            byte[] r0 = r11.f6023
            r1 = 0
            int r0 = r11.m1793(r1, r0, r7)
            r11.m1788(r0)
            goto L_0x000a
        L_0x0434:
            int r0 = r11.f6021
            o.zr r1 = p004o.C1005zr.VM_FC
            int r1 = r1.f6086
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0785
            byte[] r0 = r11.f6023
            r1 = 0
            int r0 = r11.m1793(r1, r0, r7)
            r11.m1788(r0)
            goto L_0x000a
        L_0x0449:
            int[] r0 = r11.f6022
            r1 = 7
            r1 = r0[r1]
            int r1 = r1 + -4
            r2 = 7
            r0[r2] = r1
            byte[] r0 = r11.f6023
            int[] r1 = r11.f6022
            r2 = 7
            r1 = r1[r2]
            r2 = 262143(0x3ffff, float:3.6734E-40)
            r1 = r1 & r2
            byte[] r2 = r11.f6023
            r3 = 0
            int r2 = r11.m1793(r3, r2, r7)
            r3 = 0
            r11.m1798(r3, r0, r1, r2)
            goto L_0x0785
        L_0x046b:
            byte[] r0 = r11.f6023
            byte[] r1 = r11.f6023
            int[] r2 = r11.f6022
            r3 = 7
            r2 = r2[r3]
            r3 = 262143(0x3ffff, float:3.6734E-40)
            r2 = r2 & r3
            r3 = 0
            int r1 = r11.m1793(r3, r1, r2)
            r2 = 0
            r11.m1798(r2, r0, r7, r1)
            int[] r0 = r11.f6022
            r1 = 7
            r1 = r0[r1]
            int r1 = r1 + 4
            r2 = 7
            r0[r2] = r1
            goto L_0x0785
        L_0x048d:
            int[] r0 = r11.f6022
            r1 = 7
            r1 = r0[r1]
            int r1 = r1 + -4
            r2 = 7
            r0[r2] = r1
            byte[] r0 = r11.f6023
            int[] r1 = r11.f6022
            r2 = 7
            r1 = r1[r2]
            r2 = 262143(0x3ffff, float:3.6734E-40)
            r1 = r1 & r2
            int r2 = r11.f6019
            int r2 = r2 + 1
            r3 = 0
            r11.m1798(r3, r0, r1, r2)
            byte[] r0 = r11.f6023
            r1 = 0
            int r0 = r11.m1793(r1, r0, r7)
            r11.m1788(r0)
            goto L_0x000a
        L_0x04b6:
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            boolean r2 = r13.f6095
            byte[] r3 = r11.f6023
            int r2 = r11.m1793(r2, r3, r7)
            r2 = r2 ^ -1
            r11.m1798(r0, r1, r7, r2)
            goto L_0x0785
        L_0x04c9:
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r9 = r11.m1793(r0, r1, r7)
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r10 = r11.m1793(r0, r1, r8)
            int r8 = r9 << r10
            if (r8 != 0) goto L_0x04e2
            o.zr r0 = p004o.C1005zr.VM_FZ
            int r0 = r0.f6086
            goto L_0x04e7
        L_0x04e2:
            o.zr r0 = p004o.C1005zr.VM_FS
            int r0 = r0.f6086
            r0 = r0 & r8
        L_0x04e7:
            int r1 = r10 + -1
            int r1 = r9 << r1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x04f5
            o.zr r1 = p004o.C1005zr.VM_FC
            int r1 = r1.f6086
            goto L_0x04f6
        L_0x04f5:
            r1 = 0
        L_0x04f6:
            r0 = r0 | r1
            r11.f6021 = r0
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            r11.m1798(r0, r1, r7, r8)
            goto L_0x0785
        L_0x0502:
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r9 = r11.m1793(r0, r1, r7)
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r10 = r11.m1793(r0, r1, r8)
            int r8 = r9 >>> r10
            if (r8 != 0) goto L_0x051b
            o.zr r0 = p004o.C1005zr.VM_FZ
            int r0 = r0.f6086
            goto L_0x0520
        L_0x051b:
            o.zr r0 = p004o.C1005zr.VM_FS
            int r0 = r0.f6086
            r0 = r0 & r8
        L_0x0520:
            int r1 = r10 + -1
            int r1 = r9 >>> r1
            o.zr r2 = p004o.C1005zr.VM_FC
            int r2 = r2.f6086
            r1 = r1 & r2
            r0 = r0 | r1
            r11.f6021 = r0
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            r11.m1798(r0, r1, r7, r8)
            goto L_0x0785
        L_0x0535:
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r9 = r11.m1793(r0, r1, r7)
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r10 = r11.m1793(r0, r1, r8)
            int r8 = r9 >> r10
            if (r8 != 0) goto L_0x054e
            o.zr r0 = p004o.C1005zr.VM_FZ
            int r0 = r0.f6086
            goto L_0x0553
        L_0x054e:
            o.zr r0 = p004o.C1005zr.VM_FS
            int r0 = r0.f6086
            r0 = r0 & r8
        L_0x0553:
            int r1 = r10 + -1
            int r1 = r9 >> r1
            o.zr r2 = p004o.C1005zr.VM_FC
            int r2 = r2.f6086
            r1 = r1 & r2
            r0 = r0 | r1
            r11.f6021 = r0
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            r11.m1798(r0, r1, r7, r8)
            goto L_0x0785
        L_0x0568:
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r0 = r11.m1793(r0, r1, r7)
            int r9 = -r0
            if (r9 != 0) goto L_0x0578
            o.zr r0 = p004o.C1005zr.VM_FZ
            int r0 = r0.f6086
            goto L_0x0582
        L_0x0578:
            o.zr r0 = p004o.C1005zr.VM_FC
            int r0 = r0.f6086
            o.zr r1 = p004o.C1005zr.VM_FS
            int r1 = r1.f6086
            r1 = r1 & r9
            r0 = r0 | r1
        L_0x0582:
            r11.f6021 = r0
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            r11.m1798(r0, r1, r7, r9)
            goto L_0x0785
        L_0x058d:
            byte[] r0 = r11.f6023
            byte[] r1 = r11.f6023
            r2 = 1
            int r1 = r11.m1793(r2, r1, r7)
            int r1 = -r1
            r2 = 1
            r11.m1798(r2, r0, r7, r1)
            goto L_0x0785
        L_0x059d:
            byte[] r0 = r11.f6023
            byte[] r1 = r11.f6023
            r2 = 0
            int r1 = r11.m1793(r2, r1, r7)
            int r1 = -r1
            r2 = 0
            r11.m1798(r2, r0, r7, r1)
            goto L_0x0785
        L_0x05ad:
            r9 = 0
            int[] r0 = r11.f6022
            r1 = 7
            r0 = r0[r1]
            int r10 = r0 + -4
            goto L_0x05c8
        L_0x05b6:
            byte[] r0 = r11.f6023
            r1 = 262143(0x3ffff, float:3.6734E-40)
            r1 = r1 & r10
            int[] r2 = r11.f6022
            r2 = r2[r9]
            r3 = 0
            r11.m1798(r3, r0, r1, r2)
            int r9 = r9 + 1
            int r10 = r10 + -4
        L_0x05c8:
            r0 = 8
            if (r9 < r0) goto L_0x05b6
            int[] r0 = r11.f6022
            r1 = 7
            r1 = r0[r1]
            int r1 = r1 + -32
            r2 = 7
            r0[r2] = r1
            goto L_0x0785
        L_0x05d8:
            r9 = 0
            int[] r0 = r11.f6022
            r1 = 7
            r10 = r0[r1]
            goto L_0x05f4
        L_0x05df:
            int[] r0 = r11.f6022
            int r1 = 7 - r9
            byte[] r2 = r11.f6023
            r3 = 262143(0x3ffff, float:3.6734E-40)
            r3 = r3 & r10
            r4 = 0
            int r2 = r11.m1793(r4, r2, r3)
            r0[r1] = r2
            int r9 = r9 + 1
            int r10 = r10 + 4
        L_0x05f4:
            r0 = 8
            if (r9 < r0) goto L_0x05df
            goto L_0x0785
        L_0x05fa:
            int[] r0 = r11.f6022
            r1 = 7
            r1 = r0[r1]
            int r1 = r1 + -4
            r2 = 7
            r0[r2] = r1
            byte[] r0 = r11.f6023
            int[] r1 = r11.f6022
            r2 = 7
            r1 = r1[r2]
            r2 = 262143(0x3ffff, float:3.6734E-40)
            r1 = r1 & r2
            int r2 = r11.f6021
            r3 = 0
            r11.m1798(r3, r0, r1, r2)
            goto L_0x0785
        L_0x0617:
            byte[] r0 = r11.f6023
            int[] r1 = r11.f6022
            r2 = 7
            r1 = r1[r2]
            r2 = 262143(0x3ffff, float:3.6734E-40)
            r1 = r1 & r2
            r2 = 0
            int r0 = r11.m1793(r2, r0, r1)
            r11.f6021 = r0
            int[] r0 = r11.f6022
            r1 = 7
            r1 = r0[r1]
            int r1 = r1 + 4
            r2 = 7
            r0[r2] = r1
            goto L_0x0785
        L_0x0635:
            byte[] r0 = r11.f6023
            byte[] r1 = r11.f6023
            r2 = 1
            int r1 = r11.m1793(r2, r1, r8)
            r2 = 0
            r11.m1798(r2, r0, r7, r1)
            goto L_0x0785
        L_0x0644:
            byte[] r0 = r11.f6023
            byte[] r1 = r11.f6023
            r2 = 1
            int r1 = r11.m1793(r2, r1, r8)
            byte r1 = (byte) r1
            r2 = 0
            r11.m1798(r2, r0, r7, r1)
            goto L_0x0785
        L_0x0654:
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r9 = r11.m1793(r0, r1, r7)
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            boolean r2 = r13.f6095
            byte[] r3 = r11.f6023
            int r2 = r11.m1793(r2, r3, r8)
            r11.m1798(r0, r1, r7, r2)
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            r11.m1798(r0, r1, r8, r9)
            goto L_0x0785
        L_0x0674:
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r0 = r11.m1793(r0, r1, r7)
            long r0 = (long) r0
            boolean r2 = r13.f6095
            byte[] r3 = r11.f6023
            int r2 = r11.m1793(r2, r3, r8)
            long r2 = (long) r2
            r4 = -1
            long r2 = r2 * r4
            long r0 = r0 & r2
            r2 = -1
            long r0 = r0 & r2
            r2 = -1
            long r0 = r0 & r2
            int r9 = (int) r0
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            r11.m1798(r0, r1, r7, r9)
            goto L_0x0785
        L_0x069a:
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r9 = r11.m1793(r0, r1, r8)
            if (r9 == 0) goto L_0x0785
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r0 = r11.m1793(r0, r1, r7)
            int r10 = r0 / r9
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            r11.m1798(r0, r1, r7, r10)
            goto L_0x0785
        L_0x06b7:
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r9 = r11.m1793(r0, r1, r7)
            int r0 = r11.f6021
            o.zr r1 = p004o.C1005zr.VM_FC
            int r1 = r1.f6086
            r10 = r0 & r1
            long r0 = (long) r9
            boolean r2 = r13.f6095
            byte[] r3 = r11.f6023
            int r2 = r11.m1793(r2, r3, r8)
            long r2 = (long) r2
            r4 = -1
            long r2 = r2 + r4
            long r0 = r0 & r2
            long r2 = (long) r10
            r4 = -1
            long r2 = r2 + r4
            long r0 = r0 & r2
            r2 = -1
            long r0 = r0 & r2
            int r8 = (int) r0
            boolean r0 = r13.f6095
            if (r0 == 0) goto L_0x06e4
            r8 = r8 & 255(0xff, float:3.57E-43)
        L_0x06e4:
            if (r8 < r9) goto L_0x06ea
            if (r8 != r9) goto L_0x06ec
            if (r10 == 0) goto L_0x06ec
        L_0x06ea:
            r0 = 1
            goto L_0x06f8
        L_0x06ec:
            if (r8 != 0) goto L_0x06f3
            o.zr r0 = p004o.C1005zr.VM_FZ
            int r0 = r0.f6086
            goto L_0x06f8
        L_0x06f3:
            o.zr r0 = p004o.C1005zr.VM_FS
            int r0 = r0.f6086
            r0 = r0 & r8
        L_0x06f8:
            r11.f6021 = r0
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            r11.m1798(r0, r1, r7, r8)
            goto L_0x0785
        L_0x0703:
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            int r9 = r11.m1793(r0, r1, r7)
            int r0 = r11.f6021
            o.zr r1 = p004o.C1005zr.VM_FC
            int r1 = r1.f6086
            r10 = r0 & r1
            long r0 = (long) r9
            boolean r2 = r13.f6095
            byte[] r3 = r11.f6023
            int r2 = r11.m1793(r2, r3, r8)
            long r2 = (long) r2
            r4 = -1
            long r2 = r4 - r2
            long r0 = r0 & r2
            long r2 = (long) r10
            r4 = -1
            long r2 = r4 - r2
            long r0 = r0 & r2
            r2 = -1
            long r0 = r0 & r2
            int r8 = (int) r0
            boolean r0 = r13.f6095
            if (r0 == 0) goto L_0x0732
            r8 = r8 & 255(0xff, float:3.57E-43)
        L_0x0732:
            if (r8 > r9) goto L_0x0738
            if (r8 != r9) goto L_0x073a
            if (r10 == 0) goto L_0x073a
        L_0x0738:
            r0 = 1
            goto L_0x0746
        L_0x073a:
            if (r8 != 0) goto L_0x0741
            o.zr r0 = p004o.C1005zr.VM_FZ
            int r0 = r0.f6086
            goto L_0x0746
        L_0x0741:
            o.zr r0 = p004o.C1005zr.VM_FS
            int r0 = r0.f6086
            r0 = r0 & r8
        L_0x0746:
            r11.f6021 = r0
            boolean r0 = r13.f6095
            byte[] r1 = r11.f6023
            r11.m1798(r0, r1, r7, r8)
            goto L_0x0785
        L_0x0750:
            int[] r0 = r11.f6022
            r1 = 7
            r0 = r0[r1]
            r1 = 262144(0x40000, float:3.67342E-40)
            if (r0 < r1) goto L_0x075b
            r0 = 1
            return r0
        L_0x075b:
            byte[] r0 = r11.f6023
            int[] r1 = r11.f6022
            r2 = 7
            r1 = r1[r2]
            r2 = 262143(0x3ffff, float:3.6734E-40)
            r1 = r1 & r2
            r2 = 0
            int r0 = r11.m1793(r2, r0, r1)
            r11.m1788(r0)
            int[] r0 = r11.f6022
            r1 = 7
            r1 = r0[r1]
            int r1 = r1 + 4
            r2 = 7
            r0[r2] = r1
            goto L_0x000a
        L_0x077a:
            o.zu r0 = r13.f6094
            int r0 = r0.f6099
            o.zx r0 = p004o.C1011zx.m1805(r0)
            r11.m1797(r0)
        L_0x0785:
            int r0 = r11.f6019
            int r0 = r0 + 1
            r11.f6019 = r0
            int r0 = r11.f6020
            int r0 = r0 + -1
            r11.f6020 = r0
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1002zo.m1799(java.util.List, int):boolean");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 236 */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0213  */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4254(byte[] r11, int r12, p004o.C1009zv r13) {
        /*
            r10 = this;
            r10.mo4246()
            r0 = 32768(0x8000, float:4.5918E-41)
            int r4 = java.lang.Math.min(r0, r12)
            r5 = 0
            goto L_0x0018
        L_0x000c:
            byte[] r0 = r10.f6013
            byte r1 = r0[r5]
            byte r2 = r11[r5]
            r1 = r1 | r2
            byte r1 = (byte) r1
            r0[r5] = r1
            int r5 = r5 + 1
        L_0x0018:
            if (r5 < r4) goto L_0x000c
            r5 = 0
            r4 = 1
            goto L_0x0023
        L_0x001d:
            byte r0 = r11[r4]
            r0 = r0 ^ r5
            byte r5 = (byte) r0
            int r4 = r4 + 1
        L_0x0023:
            if (r4 < r12) goto L_0x001d
            r0 = 8
            r10.mo4250(r0)
            r0 = 0
            r13.f6106 = r0
            r0 = 0
            byte r0 = r11[r0]
            if (r5 != r0) goto L_0x01e9
            r4 = r11
            r0 = 7
            o.zw[] r5 = new p004o.C1010zw[r0]
            o.zw r0 = new o.zw
            o.zx r1 = p004o.C1011zx.VMSF_E8
            r2 = 53
            r3 = -1386780537(0xffffffffad576887, float:-1.2244545E-11)
            r0.<init>(r2, r3, r1)
            r1 = 0
            r5[r1] = r0
            o.zw r0 = new o.zw
            o.zx r1 = p004o.C1011zx.VMSF_E8E9
            r2 = 57
            r3 = 1020781950(0x3cd7e57e, float:0.026354548)
            r0.<init>(r2, r3, r1)
            r1 = 1
            r5[r1] = r0
            o.zw r0 = new o.zw
            o.zx r1 = p004o.C1011zx.VMSF_ITANIUM
            r2 = 120(0x78, float:1.68E-43)
            r3 = 929663295(0x3769893f, float:1.3919837E-5)
            r0.<init>(r2, r3, r1)
            r1 = 2
            r5[r1] = r0
            o.zw r0 = new o.zw
            o.zx r1 = p004o.C1011zx.VMSF_DELTA
            r2 = 29
            r3 = 235276157(0xe06077d, float:1.652038E-30)
            r0.<init>(r2, r3, r1)
            r1 = 3
            r5[r1] = r0
            o.zw r0 = new o.zw
            o.zx r1 = p004o.C1011zx.VMSF_RGB
            r2 = 149(0x95, float:2.09E-43)
            r3 = 472669640(0x1c2c5dc8, float:5.7031236E-22)
            r0.<init>(r2, r3, r1)
            r1 = 4
            r5[r1] = r0
            o.zw r0 = new o.zw
            o.zx r1 = p004o.C1011zx.VMSF_AUDIO
            r2 = 216(0xd8, float:3.03E-43)
            r3 = -1132075263(0xffffffffbc85e701, float:-0.016345503)
            r0.<init>(r2, r3, r1)
            r1 = 5
            r5[r1] = r0
            o.zw r0 = new o.zw
            o.zx r1 = p004o.C1011zx.VMSF_UPCASE
            r2 = 40
            r3 = 1186579808(0x46b9c560, float:23778.688)
            r0.<init>(r2, r3, r1)
            r1 = 6
            r5[r1] = r0
            int r0 = r4.length
            r1 = -1
            r2 = 0
            int r0 = p004o.C0941xn.m1633(r1, r4, r2, r0)
            r6 = r0 ^ -1
            r7 = 0
            goto L_0x00be
        L_0x00aa:
            r0 = r5[r7]
            int r0 = r0.f6110
            if (r0 != r6) goto L_0x00bc
            r0 = r5[r7]
            int r0 = r0.f6111
            int r1 = r4.length
            if (r0 != r1) goto L_0x00bc
            r0 = r5[r7]
            o.zx r4 = r0.f6109
            goto L_0x00c3
        L_0x00bc:
            int r7 = r7 + 1
        L_0x00be:
            int r0 = r5.length
            if (r7 < r0) goto L_0x00aa
            o.zx r4 = p004o.C1011zx.VMSF_NONE
        L_0x00c3:
            o.zx r0 = p004o.C1011zx.VMSF_NONE
            if (r4 == r0) goto L_0x00ee
            o.zt r11 = new o.zt
            r11.<init>()
            o.zq r0 = p004o.C1004zq.VM_STANDARD
            r11.f6096 = r0
            o.zu r0 = r11.f6094
            int r1 = r4.f6121
            r0.f6099 = r1
            o.zu r0 = r11.f6094
            o.zs r1 = p004o.C1006zs.VM_OPNONE
            r0.f6100 = r1
            o.zu r0 = r11.f6093
            o.zs r1 = p004o.C1006zs.VM_OPNONE
            r0.f6100 = r1
            r12 = 0
            java.util.List<o.zt> r0 = r13.f6108
            r0.add(r11)
            int r0 = r13.f6106
            int r0 = r0 + 1
            r13.f6106 = r0
        L_0x00ee:
            int r11 = r10.mo4247()
            r0 = 1
            r10.mo4250(r0)
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r11
            if (r0 == 0) goto L_0x01e5
            int r0 = m1791(r10)
            long r0 = (long) r0
            r2 = 0
            long r8 = r0 & r2
            r11 = 0
            goto L_0x011e
        L_0x0107:
            java.util.Vector<java.lang.Byte> r0 = r13.f6101
            int r1 = r10.mo4247()
            int r1 = r1 >> 8
            byte r1 = (byte) r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r0.add(r1)
            r0 = 8
            r10.mo4250(r0)
            int r11 = r11 + 1
        L_0x011e:
            int r0 = r10.f6014
            if (r0 >= r12) goto L_0x01e5
            long r0 = (long) r11
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0107
            goto L_0x01e5
        L_0x0129:
            o.zt r8 = new o.zt
            r8.<init>()
            int r9 = r10.mo4247()
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r9
            if (r0 != 0) goto L_0x0145
            int r0 = r9 >> 12
            o.zq r0 = p004o.C1004zq.m1804(r0)
            r8.f6096 = r0
            r0 = 4
            r10.mo4250(r0)
            goto L_0x0153
        L_0x0145:
            int r0 = r9 >> 10
            int r0 = r0 + -24
            o.zq r0 = p004o.C1004zq.m1804(r0)
            r8.f6096 = r0
            r0 = 6
            r10.mo4250(r0)
        L_0x0153:
            byte[] r0 = p004o.C1003zp.f6024
            o.zq r1 = r8.f6096
            int r1 = r1.f6081
            byte r0 = r0[r1]
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0172
            int r0 = r10.mo4247()
            int r0 = r0 >> 15
            r1 = 1
            if (r0 != r1) goto L_0x016a
            r0 = 1
            goto L_0x016b
        L_0x016a:
            r0 = 0
        L_0x016b:
            r8.f6095 = r0
            r0 = 1
            r10.mo4250(r0)
            goto L_0x0175
        L_0x0172:
            r0 = 0
            r8.f6095 = r0
        L_0x0175:
            o.zu r0 = r8.f6094
            o.zs r1 = p004o.C1006zs.VM_OPNONE
            r0.f6100 = r1
            o.zu r0 = r8.f6093
            o.zs r1 = p004o.C1006zs.VM_OPNONE
            r0.f6100 = r1
            byte[] r0 = p004o.C1003zp.f6024
            o.zq r1 = r8.f6096
            int r1 = r1.f6081
            byte r0 = r0[r1]
            r11 = r0 & 3
            if (r11 <= 0) goto L_0x01da
            o.zu r0 = r8.f6094
            boolean r1 = r8.f6095
            r10.m1796(r0, r1)
            r0 = 2
            if (r11 != r0) goto L_0x01a0
            o.zu r0 = r8.f6093
            boolean r1 = r8.f6095
            r10.m1796(r0, r1)
            goto L_0x01da
        L_0x01a0:
            o.zu r0 = r8.f6094
            o.zs r0 = r0.f6100
            o.zs r1 = p004o.C1006zs.VM_OPINT
            if (r0 != r1) goto L_0x01da
            byte[] r0 = p004o.C1003zp.f6024
            o.zq r1 = r8.f6096
            int r1 = r1.f6081
            byte r0 = r0[r1]
            r0 = r0 & 24
            if (r0 == 0) goto L_0x01da
            o.zu r0 = r8.f6094
            int r11 = r0.f6099
            r0 = 256(0x100, float:3.59E-43)
            if (r11 < r0) goto L_0x01bf
            int r11 = r11 + -256
            goto L_0x01d6
        L_0x01bf:
            r0 = 136(0x88, float:1.9E-43)
            if (r11 < r0) goto L_0x01c6
            int r11 = r11 + -264
            goto L_0x01d3
        L_0x01c6:
            r0 = 16
            if (r11 < r0) goto L_0x01cd
            int r11 = r11 + -8
            goto L_0x01d3
        L_0x01cd:
            r0 = 8
            if (r11 < r0) goto L_0x01d3
            int r11 = r11 + -16
        L_0x01d3:
            int r0 = r13.f6106
            int r11 = r11 + r0
        L_0x01d6:
            o.zu r0 = r8.f6094
            r0.f6099 = r11
        L_0x01da:
            int r0 = r13.f6106
            int r0 = r0 + 1
            r13.f6106 = r0
            java.util.List<o.zt> r0 = r13.f6108
            r0.add(r8)
        L_0x01e5:
            int r0 = r10.f6014
            if (r0 < r12) goto L_0x0129
        L_0x01e9:
            o.zt r4 = new o.zt
            r4.<init>()
            o.zq r0 = p004o.C1004zq.VM_RET
            r4.f6096 = r0
            o.zu r0 = r4.f6094
            o.zs r1 = p004o.C1006zs.VM_OPNONE
            r0.f6100 = r1
            o.zu r0 = r4.f6093
            o.zs r1 = p004o.C1006zs.VM_OPNONE
            r0.f6100 = r1
            java.util.List<o.zt> r0 = r13.f6108
            r0.add(r4)
            int r0 = r13.f6106
            int r0 = r0 + 1
            r13.f6106 = r0
            if (r12 == 0) goto L_0x02ec
            java.util.List<o.zt> r11 = r13.f6108
            java.util.Iterator r6 = r11.iterator()
            goto L_0x02e6
        L_0x0213:
            java.lang.Object r0 = r6.next()
            o.zt r0 = (p004o.C1007zt) r0
            r5 = r0
            int[] r0 = m1800()
            o.zq r1 = r5.f6096
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x0232;
                case 2: goto L_0x023f;
                default: goto L_0x0229;
            }
        L_0x0229:
            goto L_0x024c
        L_0x0232:
            boolean r0 = r5.f6095
            if (r0 == 0) goto L_0x0239
            o.zq r0 = p004o.C1004zq.VM_MOVB
            goto L_0x023b
        L_0x0239:
            o.zq r0 = p004o.C1004zq.VM_MOVD
        L_0x023b:
            r5.f6096 = r0
            goto L_0x02e6
        L_0x023f:
            boolean r0 = r5.f6095
            if (r0 == 0) goto L_0x0246
            o.zq r0 = p004o.C1004zq.VM_CMPB
            goto L_0x0248
        L_0x0246:
            o.zq r0 = p004o.C1004zq.VM_CMPD
        L_0x0248:
            r5.f6096 = r0
            goto L_0x02e6
        L_0x024c:
            byte[] r0 = p004o.C1003zp.f6024
            o.zq r1 = r5.f6096
            int r1 = r1.f6081
            byte r0 = r0[r1]
            r0 = r0 & 64
            if (r0 == 0) goto L_0x02e6
            r7 = 0
            int r0 = r11.indexOf(r5)
            int r8 = r0 + 1
            goto L_0x027a
        L_0x0260:
            byte[] r0 = p004o.C1003zp.f6024
            java.lang.Object r1 = r11.get(r8)
            o.zt r1 = (p004o.C1007zt) r1
            o.zq r1 = r1.f6096
            int r1 = r1.f6081
            byte r12 = r0[r1]
            r0 = r12 & 56
            if (r0 == 0) goto L_0x0274
            r7 = 1
            goto L_0x0280
        L_0x0274:
            r0 = r12 & 64
            if (r0 != 0) goto L_0x0280
            int r8 = r8 + 1
        L_0x027a:
            int r0 = r11.size()
            if (r8 < r0) goto L_0x0260
        L_0x0280:
            if (r7 != 0) goto L_0x02e6
            int[] r0 = m1800()
            o.zq r1 = r5.f6096
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 3: goto L_0x02aa;
                case 4: goto L_0x02b7;
                case 7: goto L_0x02c3;
                case 8: goto L_0x02cf;
                case 28: goto L_0x02db;
                default: goto L_0x0291;
            }
        L_0x0291:
            goto L_0x02e6
        L_0x02aa:
            boolean r0 = r5.f6095
            if (r0 == 0) goto L_0x02b1
            o.zq r0 = p004o.C1004zq.VM_ADDB
            goto L_0x02b3
        L_0x02b1:
            o.zq r0 = p004o.C1004zq.VM_ADDD
        L_0x02b3:
            r5.f6096 = r0
            goto L_0x02e6
        L_0x02b7:
            boolean r0 = r5.f6095
            if (r0 == 0) goto L_0x02be
            o.zq r0 = p004o.C1004zq.VM_SUBB
            goto L_0x02c0
        L_0x02be:
            o.zq r0 = p004o.C1004zq.VM_SUBD
        L_0x02c0:
            r5.f6096 = r0
            goto L_0x02e6
        L_0x02c3:
            boolean r0 = r5.f6095
            if (r0 == 0) goto L_0x02ca
            o.zq r0 = p004o.C1004zq.VM_INCB
            goto L_0x02cc
        L_0x02ca:
            o.zq r0 = p004o.C1004zq.VM_INCD
        L_0x02cc:
            r5.f6096 = r0
            goto L_0x02e6
        L_0x02cf:
            boolean r0 = r5.f6095
            if (r0 == 0) goto L_0x02d6
            o.zq r0 = p004o.C1004zq.VM_DECB
            goto L_0x02d8
        L_0x02d6:
            o.zq r0 = p004o.C1004zq.VM_DECD
        L_0x02d8:
            r5.f6096 = r0
            goto L_0x02e6
        L_0x02db:
            boolean r0 = r5.f6095
            if (r0 == 0) goto L_0x02e2
            o.zq r0 = p004o.C1004zq.VM_NEGB
            goto L_0x02e4
        L_0x02e2:
            o.zq r0 = p004o.C1004zq.VM_NEGD
        L_0x02e4:
            r5.f6096 = r0
        L_0x02e6:
            boolean r0 = r6.hasNext()
            if (r0 != 0) goto L_0x0213
        L_0x02ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1002zo.mo4254(byte[], int, o.zv):void");
    }

    /* renamed from: 鷭 */
    private void m1796(C1008zu zuVar, boolean z) {
        int r2 = mo4247();
        if ((32768 & r2) != 0) {
            zuVar.f6100 = C1006zs.VM_OPREG;
            zuVar.f6099 = (r2 >> 12) & 7;
            zuVar.f6097 = zuVar.f6099;
            mo4250(4);
        } else if ((49152 & r2) == 0) {
            zuVar.f6100 = C1006zs.VM_OPINT;
            if (z) {
                zuVar.f6099 = (r2 >> 6) & 255;
                mo4250(10);
                return;
            }
            mo4250(2);
            zuVar.f6099 = m1791((C1001zn) this);
        } else {
            zuVar.f6100 = C1006zs.VM_OPREGMEM;
            if ((r2 & 8192) == 0) {
                zuVar.f6099 = (r2 >> 10) & 7;
                zuVar.f6097 = zuVar.f6099;
                zuVar.f6098 = 0;
                mo4250(6);
                return;
            }
            if ((r2 & 4096) == 0) {
                zuVar.f6099 = (r2 >> 9) & 7;
                zuVar.f6097 = zuVar.f6099;
                mo4250(7);
            } else {
                zuVar.f6099 = 0;
                mo4250(4);
            }
            zuVar.f6098 = m1791((C1001zn) this);
        }
    }

    /* renamed from: 鷭 */
    public static int m1791(C1001zn znVar) {
        int i;
        int r2 = znVar.mo4247();
        switch (49152 & r2) {
            case 0:
                znVar.mo4250(6);
                return (r2 >> 10) & 15;
            case 16384:
                if ((r2 & 15360) == 0) {
                    i = ((r2 >> 2) & 255) | InputDeviceCompat.SOURCE_ANY;
                    znVar.mo4250(14);
                } else {
                    i = (r2 >> 6) & 255;
                    znVar.mo4250(10);
                }
                return i;
            case 32768:
                znVar.mo4250(2);
                int r22 = znVar.mo4247();
                znVar.mo4250(16);
                return r22;
            default:
                znVar.mo4250(2);
                int r23 = znVar.mo4247() << 16;
                znVar.mo4250(16);
                int r24 = r23 | znVar.mo4247();
                znVar.mo4250(16);
                return r24;
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 234 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1797(p004o.C1011zx r31) {
        /*
            r30 = this;
            int[] r0 = m1790()
            r1 = r31
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 2: goto L_0x0024;
                case 3: goto L_0x0024;
                case 4: goto L_0x00b0;
                case 5: goto L_0x019d;
                case 6: goto L_0x0284;
                case 7: goto L_0x0152;
                case 8: goto L_0x03e6;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x043d
        L_0x0024:
            r0 = r30
            int[] r0 = r0.f6022
            r1 = 4
            r5 = r0[r1]
            r0 = r30
            int[] r0 = r0.f6022
            r1 = 6
            r0 = r0[r1]
            r0 = r0 & -1
            long r6 = (long) r0
            r0 = 245760(0x3c000, float:3.44383E-40)
            if (r5 >= r0) goto L_0x043d
            o.zx r0 = p004o.C1011zx.VMSF_E8E9
            r1 = r31
            if (r1 != r0) goto L_0x0043
            r0 = 233(0xe9, float:3.27E-43)
            goto L_0x0045
        L_0x0043:
            r0 = 232(0xe8, float:3.25E-43)
        L_0x0045:
            byte r8 = (byte) r0
            r10 = 0
            goto L_0x00ab
        L_0x0049:
            r0 = r30
            byte[] r0 = r0.f6023
            r1 = r10
            int r10 = r10 + 1
            byte r11 = r0[r1]
            r0 = -24
            if (r11 == r0) goto L_0x0058
            if (r11 != r8) goto L_0x00ab
        L_0x0058:
            long r0 = (long) r10
            long r12 = r0 + r6
            r0 = r30
            byte[] r0 = r0.f6023
            r1 = r30
            r2 = 0
            int r0 = r1.m1793(r2, r0, r10)
            long r0 = (long) r0
            r14 = r0
            r2 = -2147483648(0xffffffff80000000, double:NaN)
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x008d
            long r0 = r14 + r12
            r2 = -2147483648(0xffffffff80000000, double:NaN)
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00a9
            r0 = r30
            byte[] r0 = r0.f6023
            int r1 = (int) r14
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            int r1 = r1 + r2
            r2 = r30
            r3 = 0
            r2.m1798(r3, r0, r10, r1)
            goto L_0x00a9
        L_0x008d:
            r0 = 16777216(0x1000000, double:8.289046E-317)
            long r0 = r14 - r0
            r2 = -2147483648(0xffffffff80000000, double:NaN)
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00a9
            r0 = r30
            byte[] r0 = r0.f6023
            long r1 = r14 - r12
            int r1 = (int) r1
            r2 = r30
            r3 = 0
            r2.m1798(r3, r0, r10, r1)
        L_0x00a9:
            int r10 = r10 + 4
        L_0x00ab:
            int r0 = r5 + -4
            if (r10 < r0) goto L_0x0049
            return
        L_0x00b0:
            r0 = r30
            int[] r0 = r0.f6022
            r1 = 4
            r5 = r0[r1]
            r0 = r30
            int[] r0 = r0.f6022
            r1 = 6
            r0 = r0[r1]
            r0 = r0 & -1
            long r6 = (long) r0
            r0 = 245760(0x3c000, float:3.44383E-40)
            if (r5 >= r0) goto L_0x043d
            r31 = 0
            r0 = 16
            byte[] r8 = new byte[r0]
            r0 = 4
            r1 = 0
            r8[r1] = r0
            r0 = 4
            r1 = 1
            r8[r1] = r0
            r0 = 6
            r1 = 2
            r8[r1] = r0
            r0 = 6
            r1 = 3
            r8[r1] = r0
            r0 = 7
            r1 = 6
            r8[r1] = r0
            r0 = 7
            r1 = 7
            r8[r1] = r0
            r0 = 4
            r1 = 8
            r8[r1] = r0
            r0 = 4
            r1 = 9
            r8[r1] = r0
            r0 = 4
            r1 = 12
            r8[r1] = r0
            r0 = 4
            r1 = 13
            r8[r1] = r0
            r0 = 4
            long r6 = r6 >>> r0
            goto L_0x014b
        L_0x00fc:
            r0 = r30
            byte[] r0 = r0.f6023
            byte r0 = r0[r31]
            r0 = r0 & 31
            int r10 = r0 + -16
            if (r10 < 0) goto L_0x0146
            byte r11 = r8[r10]
            if (r11 == 0) goto L_0x0146
            r12 = 0
            goto L_0x0143
        L_0x010e:
            r0 = 1
            int r0 = r0 << r12
            r0 = r0 & r11
            if (r0 == 0) goto L_0x0141
            int r0 = r12 * 41
            int r13 = r0 + 5
            int r0 = r13 + 37
            r1 = r30
            r2 = r31
            r3 = 4
            int r0 = r1.m1789(r2, r0, r3)
            r1 = 5
            if (r0 != r1) goto L_0x0141
            int r0 = r13 + 13
            r1 = r30
            r2 = r31
            r3 = 20
            int r15 = r1.m1789(r2, r0, r3)
            long r0 = (long) r15
            long r0 = r0 - r6
            int r0 = (int) r0
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            int r1 = r13 + 13
            r2 = r30
            r3 = r31
            r2.m1794(r3, r0, r1)
        L_0x0141:
            int r12 = r12 + 1
        L_0x0143:
            r0 = 2
            if (r12 <= r0) goto L_0x010e
        L_0x0146:
            int r31 = r31 + 16
            r0 = 1
            long r6 = r6 + r0
        L_0x014b:
            int r0 = r5 + -21
            r1 = r31
            if (r1 < r0) goto L_0x00fc
            return
        L_0x0152:
            r0 = r30
            int[] r0 = r0.f6022
            r1 = 4
            r0 = r0[r1]
            r5 = r0 & -1
            r0 = r30
            int[] r0 = r0.f6022
            r1 = 0
            r0 = r0[r1]
            r6 = r0 & -1
            r7 = 0
            int r0 = r5 * 2
            r31 = r0 & -1
            r0 = r30
            byte[] r0 = r0.f6023
            r1 = r30
            r2 = 0
            r3 = 245792(0x3c020, float:3.44428E-40)
            r1.m1798(r2, r0, r3, r5)
            r0 = 122880(0x1e000, float:1.72192E-40)
            if (r5 >= r0) goto L_0x043d
            r8 = 0
            goto L_0x019a
        L_0x017d:
            r10 = 0
            int r11 = r5 + r8
            goto L_0x0194
        L_0x0181:
            r0 = r30
            byte[] r0 = r0.f6023
            r1 = r30
            byte[] r1 = r1.f6023
            r2 = r7
            int r7 = r7 + 1
            byte r1 = r1[r2]
            int r1 = r10 - r1
            byte r10 = (byte) r1
            r0[r11] = r10
            int r11 = r11 + r6
        L_0x0194:
            r0 = r31
            if (r11 < r0) goto L_0x0181
            int r8 = r8 + 1
        L_0x019a:
            if (r8 < r6) goto L_0x017d
            return
        L_0x019d:
            r0 = r30
            int[] r0 = r0.f6022
            r1 = 4
            r5 = r0[r1]
            r0 = r30
            int[] r0 = r0.f6022
            r1 = 0
            r0 = r0[r1]
            int r6 = r0 + -3
            r0 = r30
            int[] r0 = r0.f6022
            r1 = 1
            r7 = r0[r1]
            r8 = 0
            r0 = r30
            byte[] r0 = r0.f6023
            r1 = r30
            r2 = 0
            r3 = 245792(0x3c020, float:3.44428E-40)
            r1.m1798(r2, r0, r3, r5)
            r0 = 122880(0x1e000, float:1.72192E-40)
            if (r5 >= r0) goto L_0x043d
            if (r7 < 0) goto L_0x043d
            r11 = 0
            goto L_0x0254
        L_0x01cc:
            r12 = 0
            r14 = r11
            goto L_0x0250
        L_0x01d1:
            int r31 = r14 - r6
            r0 = r31
            r1 = 3
            if (r0 < r1) goto L_0x022d
            int r9 = r5 + r31
            r0 = r30
            byte[] r0 = r0.f6023
            byte r0 = r0[r9]
            r1 = r0 & 255(0xff, float:3.57E-43)
            r17 = r1
            r0 = r30
            byte[] r0 = r0.f6023
            int r1 = r9 + -3
            byte r0 = r0[r1]
            r1 = r0 & 255(0xff, float:3.57E-43)
            r18 = r1
            r0 = r17
            long r0 = (long) r0
            long r0 = r0 + r12
            r2 = r18
            long r2 = (long) r2
            long r0 = r0 - r2
            r15 = r0
            long r0 = r0 - r12
            int r0 = (int) r0
            int r19 = java.lang.Math.abs(r0)
            r0 = r17
            long r0 = (long) r0
            long r0 = r15 - r0
            int r0 = (int) r0
            int r20 = java.lang.Math.abs(r0)
            r0 = r18
            long r0 = (long) r0
            long r0 = r15 - r0
            int r0 = (int) r0
            int r22 = java.lang.Math.abs(r0)
            r0 = r19
            r1 = r20
            if (r0 > r1) goto L_0x021f
            r0 = r19
            r1 = r22
            if (r0 <= r1) goto L_0x022d
        L_0x021f:
            r0 = r20
            r1 = r22
            if (r0 > r1) goto L_0x0229
            r0 = r17
            long r15 = (long) r0
            goto L_0x022e
        L_0x0229:
            r0 = r18
            long r15 = (long) r0
            goto L_0x022e
        L_0x022d:
            r15 = r12
        L_0x022e:
            r0 = r30
            byte[] r0 = r0.f6023
            r1 = r8
            int r8 = r8 + 1
            byte r0 = r0[r1]
            long r0 = (long) r0
            long r0 = r15 - r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            r2 = 255(0xff, double:1.26E-321)
            long r12 = r0 & r2
            r0 = r30
            byte[] r0 = r0.f6023
            int r1 = r5 + r14
            r2 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r12
            int r2 = (int) r2
            byte r2 = (byte) r2
            r0[r1] = r2
            int r14 = r14 + 3
        L_0x0250:
            if (r14 < r5) goto L_0x01d1
            int r11 = r11 + 1
        L_0x0254:
            r0 = 3
            if (r11 < r0) goto L_0x01cc
            r11 = r7
            int r12 = r5 + -2
            goto L_0x0281
        L_0x025b:
            r0 = r30
            byte[] r0 = r0.f6023
            int r1 = r5 + r11
            int r1 = r1 + 1
            byte r13 = r0[r1]
            r0 = r30
            byte[] r0 = r0.f6023
            int r1 = r5 + r11
            byte r2 = r0[r1]
            int r2 = r2 + r13
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r30
            byte[] r0 = r0.f6023
            int r1 = r5 + r11
            int r1 = r1 + 2
            byte r2 = r0[r1]
            int r2 = r2 + r13
            byte r2 = (byte) r2
            r0[r1] = r2
            int r11 = r11 + 3
        L_0x0281:
            if (r11 < r12) goto L_0x025b
            return
        L_0x0284:
            r0 = r30
            int[] r0 = r0.f6022
            r1 = 4
            r5 = r0[r1]
            r0 = r30
            int[] r0 = r0.f6022
            r1 = 0
            r6 = r0[r1]
            r7 = 0
            r0 = r30
            byte[] r0 = r0.f6023
            r1 = r30
            r2 = 0
            r3 = 245792(0x3c020, float:3.44428E-40)
            r1.m1798(r2, r0, r3, r5)
            r0 = 122880(0x1e000, float:1.72192E-40)
            if (r5 >= r0) goto L_0x043d
            r8 = 0
            goto L_0x03e3
        L_0x02a8:
            r10 = 0
            r12 = 0
            r0 = 7
            long[] r14 = new long[r0]
            r15 = 0
            r16 = 0
            r9 = 0
            r17 = 0
            r18 = 0
            r19 = r8
            r20 = 0
            goto L_0x03dd
        L_0x02bd:
            r31 = r16
            int r0 = (int) r12
            int r16 = r0 - r15
            int r15 = (int) r12
            r0 = 8
            long r0 = r0 * r10
            int r2 = r9 * r15
            long r2 = (long) r2
            long r0 = r0 + r2
            int r2 = r17 * r16
            long r2 = (long) r2
            long r0 = r0 + r2
            int r2 = r18 * r31
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 3
            long r0 = r0 >>> r2
            r2 = 255(0xff, double:1.26E-321)
            long r22 = r0 & r2
            r0 = r30
            byte[] r0 = r0.f6023
            r1 = r7
            int r7 = r7 + 1
            byte r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r1 = (long) r0
            r24 = r1
            long r0 = r22 - r24
            r2 = -1
            long r22 = r0 & r2
            r0 = r30
            byte[] r0 = r0.f6023
            int r1 = r5 + r19
            r2 = r22
            int r2 = (int) r2
            byte r2 = (byte) r2
            r0[r1] = r2
            long r0 = r22 - r10
            int r0 = (int) r0
            byte r0 = (byte) r0
            long r12 = (long) r0
            r10 = r22
            r0 = r24
            int r0 = (int) r0
            byte r0 = (byte) r0
            int r21 = r0 << 3
            r0 = 0
            r0 = r14[r0]
            r2 = r21
            int r2 = java.lang.Math.abs(r2)
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 0
            r14[r2] = r0
            r0 = 1
            r0 = r14[r0]
            int r2 = r21 - r15
            int r2 = java.lang.Math.abs(r2)
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 1
            r14[r2] = r0
            r0 = 2
            r0 = r14[r0]
            int r2 = r21 + r15
            int r2 = java.lang.Math.abs(r2)
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 2
            r14[r2] = r0
            r0 = 3
            r0 = r14[r0]
            int r2 = r21 - r16
            int r2 = java.lang.Math.abs(r2)
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 3
            r14[r2] = r0
            r0 = 4
            r0 = r14[r0]
            int r2 = r21 + r16
            int r2 = java.lang.Math.abs(r2)
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 4
            r14[r2] = r0
            r0 = 5
            r0 = r14[r0]
            int r2 = r21 - r31
            int r2 = java.lang.Math.abs(r2)
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 5
            r14[r2] = r0
            r0 = 6
            r0 = r14[r0]
            int r2 = r21 + r31
            int r2 = java.lang.Math.abs(r2)
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 6
            r14[r2] = r0
            r0 = r20 & 31
            if (r0 != 0) goto L_0x03d9
            r0 = 0
            r26 = r14[r0]
            r28 = 0
            r0 = 0
            r2 = 0
            r14[r2] = r0
            r31 = 1
            goto L_0x038b
        L_0x0378:
            r0 = r14[r31]
            int r0 = (r0 > r26 ? 1 : (r0 == r26 ? 0 : -1))
            if (r0 >= 0) goto L_0x0385
            r26 = r14[r31]
            r0 = r31
            long r0 = (long) r0
            r28 = r0
        L_0x0385:
            r0 = 0
            r14[r31] = r0
            int r31 = r31 + 1
        L_0x038b:
            int r0 = r14.length
            r1 = r31
            if (r1 < r0) goto L_0x0378
            r0 = r28
            int r0 = (int) r0
            switch(r0) {
                case 1: goto L_0x03a8;
                case 2: goto L_0x03af;
                case 3: goto L_0x03b6;
                case 4: goto L_0x03bf;
                case 5: goto L_0x03c8;
                case 6: goto L_0x03d1;
                default: goto L_0x0396;
            }
        L_0x0396:
            goto L_0x03d9
        L_0x03a8:
            r0 = -16
            if (r9 < r0) goto L_0x03d9
            int r9 = r9 + -1
            goto L_0x03d9
        L_0x03af:
            r0 = 16
            if (r9 >= r0) goto L_0x03d9
            int r9 = r9 + 1
            goto L_0x03d9
        L_0x03b6:
            r0 = r17
            r1 = -16
            if (r0 < r1) goto L_0x03d9
            int r17 = r17 + -1
            goto L_0x03d9
        L_0x03bf:
            r0 = r17
            r1 = 16
            if (r0 >= r1) goto L_0x03d9
            int r17 = r17 + 1
            goto L_0x03d9
        L_0x03c8:
            r0 = r18
            r1 = -16
            if (r0 < r1) goto L_0x03d9
            int r18 = r18 + -1
            goto L_0x03d9
        L_0x03d1:
            r0 = r18
            r1 = 16
            if (r0 >= r1) goto L_0x03d9
            int r18 = r18 + 1
        L_0x03d9:
            int r19 = r19 + r6
            int r20 = r20 + 1
        L_0x03dd:
            r0 = r19
            if (r0 < r5) goto L_0x02bd
            int r8 = r8 + 1
        L_0x03e3:
            if (r8 < r6) goto L_0x02a8
            return
        L_0x03e6:
            r0 = r30
            int[] r0 = r0.f6022
            r1 = 4
            r5 = r0[r1]
            r6 = 0
            r7 = r5
            r0 = 122880(0x1e000, float:1.72192E-40)
            if (r5 < r0) goto L_0x041f
            return
        L_0x03f5:
            r0 = r30
            byte[] r0 = r0.f6023
            r1 = r6
            int r6 = r6 + 1
            byte r31 = r0[r1]
            r0 = r31
            r1 = 2
            if (r0 != r1) goto L_0x0416
            r0 = r30
            byte[] r0 = r0.f6023
            r1 = r6
            int r6 = r6 + 1
            byte r31 = r0[r1]
            r0 = r31
            r1 = 2
            if (r0 == r1) goto L_0x0416
            int r0 = r31 + -32
            byte r1 = (byte) r0
            r31 = r1
        L_0x0416:
            r0 = r30
            byte[] r0 = r0.f6023
            r1 = r7
            int r7 = r7 + 1
            r0[r1] = r31
        L_0x041f:
            if (r6 < r5) goto L_0x03f5
            r0 = r30
            byte[] r0 = r0.f6023
            int r1 = r7 - r5
            r2 = r30
            r3 = 0
            r4 = 245788(0x3c01c, float:3.44422E-40)
            r2.m1798(r3, r0, r4, r1)
            r0 = r30
            byte[] r0 = r0.f6023
            r1 = r30
            r2 = 0
            r3 = 245792(0x3c020, float:3.44428E-40)
            r1.m1798(r2, r0, r3, r5)
        L_0x043d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1002zo.m1797(o.zx):void");
    }

    /* renamed from: 鷭 */
    private void m1794(int i, int i2, int i3) {
        int i4 = i3 / 8;
        int i5 = i3 & 7;
        byte b = (1048575 << i5) ^ -1;
        int i6 = i2 << i5;
        for (int i7 = 0; i7 < 4; i7++) {
            byte[] bArr = this.f6023;
            int i8 = i + i4 + i7;
            bArr[i8] = (byte) (bArr[i8] & b);
            byte[] bArr2 = this.f6023;
            int i9 = i + i4 + i7;
            bArr2[i9] = (byte) (bArr2[i9] | i6);
            b = (b >>> 8) | -16777216;
            i6 >>>= 8;
        }
    }

    /* renamed from: 櫯 */
    private int m1789(int i, int i2, int i3) {
        int i4 = i2 / 8;
        int i5 = i4;
        int i6 = i4 + 1;
        int i7 = i6;
        int i8 = i6 + 1;
        return (((((this.f6023[i5 + i] & 255) | ((this.f6023[i7 + i] & 255) << 8)) | ((this.f6023[i8 + i] & 255) << 16)) | ((this.f6023[i + (i8 + 1)] & 255) << 24)) >>> (i2 & 7)) & (-1 >>> (32 - i3));
    }

    /* renamed from: 鷭 */
    public final void mo4252(int i, byte[] bArr, int i2, int i3) {
        if (i < 262144) {
            int i4 = 0;
            while (i4 < Math.min(bArr.length - i2, i3) && 262144 - i >= i4) {
                this.f6023[i + i4] = bArr[i2 + i4];
                i4++;
            }
        }
    }
}
