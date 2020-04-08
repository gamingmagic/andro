package p004o;

import android.support.p000v4.view.MotionEventCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.apache.commons.net.finger.FingerClient;
import org.apache.commons.net.tftp.TFTP;
import p004o.C0183ah.C0184;
import p004o.C0643pc.aux;

/* renamed from: o.퉗 */
final class C2039 extends C0762sz {

    /* renamed from: 鷭 */
    private static /* synthetic */ int[] f8936;

    C2039() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(184:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|(2:184|185)|186|188) */
    /* JADX WARNING: Can't wrap try/catch for region: R(185:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|179|180|181|182|183|184|185|186|188) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x0219 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:102:0x0224 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:104:0x022f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:106:0x023a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x0245 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:110:0x0250 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:112:0x025b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:114:0x0266 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:116:0x0271 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:118:0x027c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:120:0x0287 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:122:0x0292 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:124:0x029d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:126:0x02a8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:128:0x02b3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:130:0x02be */
    /* JADX WARNING: Missing exception handler attribute for start block: B:132:0x02c9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:134:0x02d4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:136:0x02df */
    /* JADX WARNING: Missing exception handler attribute for start block: B:138:0x02ea */
    /* JADX WARNING: Missing exception handler attribute for start block: B:140:0x02f5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:142:0x0300 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:144:0x030b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:146:0x0316 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:148:0x0321 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0042 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:150:0x032c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:152:0x0337 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:154:0x0342 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:156:0x034d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:158:0x0358 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:160:0x0363 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:162:0x036e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:164:0x0379 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:166:0x0384 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:168:0x038e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:170:0x0399 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:172:0x03a4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:174:0x03af */
    /* JADX WARNING: Missing exception handler attribute for start block: B:176:0x03ba */
    /* JADX WARNING: Missing exception handler attribute for start block: B:178:0x03c4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:180:0x03cf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:182:0x03da */
    /* JADX WARNING: Missing exception handler attribute for start block: B:184:0x03e4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0058 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0063 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0079 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0084 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x008f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x009a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00a5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00b0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00bb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00c6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00d1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00dc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00e7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00f2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00fd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0108 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0113 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x011e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0129 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x0134 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x013f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x014a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0155 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x0160 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x016b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x0176 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0181 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x018c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x0196 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x01a0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x01ab */
    /* JADX WARNING: Missing exception handler attribute for start block: B:82:0x01b6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x01c1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x01cc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x01d7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x01e2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x01ed */
    /* JADX WARNING: Missing exception handler attribute for start block: B:94:0x01f8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x0203 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:98:0x020e */
    /* renamed from: ˮ͈ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m2707() {
        /*
            int[] r0 = f8936
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.pc$aux[] r0 = p004o.C0643pc.aux.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.pc$aux r0 = p004o.C0643pc.aux.AevaRO     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.pc$aux r0 = p004o.C0643pc.aux.AlbertaServer     // Catch:{ NoSuchFieldError -> 0x0021 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
            r1 = 66
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            o.pc$aux r0 = p004o.C0643pc.aux.AmatsuRO     // Catch:{ NoSuchFieldError -> 0x002c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002c }
            r1 = 44
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002c }
        L_0x002c:
            o.pc$aux r0 = p004o.C0643pc.aux.AtlasRO     // Catch:{ NoSuchFieldError -> 0x0037 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0037 }
            r1 = 8
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0037 }
        L_0x0037:
            o.pc$aux r0 = p004o.C0643pc.aux.AustinRO     // Catch:{ NoSuchFieldError -> 0x0042 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0042 }
            r1 = 52
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0042 }
        L_0x0042:
            o.pc$aux r0 = p004o.C0643pc.aux.BarnabyRO     // Catch:{ NoSuchFieldError -> 0x004d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
            r1 = 38
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x004d }
        L_0x004d:
            o.pc$aux r0 = p004o.C0643pc.aux.BgRO     // Catch:{ NoSuchFieldError -> 0x0058 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
            r1 = 89
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0058 }
        L_0x0058:
            o.pc$aux r0 = p004o.C0643pc.aux.Blytanias     // Catch:{ NoSuchFieldError -> 0x0063 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
            r1 = 73
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0063 }
        L_0x0063:
            o.pc$aux r0 = p004o.C0643pc.aux.BrightRO     // Catch:{ NoSuchFieldError -> 0x006e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
            r1 = 53
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x006e }
        L_0x006e:
            o.pc$aux r0 = p004o.C0643pc.aux.C2RO     // Catch:{ NoSuchFieldError -> 0x0079 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
            r1 = 87
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0079 }
        L_0x0079:
            o.pc$aux r0 = p004o.C0643pc.aux.ChaosReborn     // Catch:{ NoSuchFieldError -> 0x0084 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
            r1 = 58
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0084 }
        L_0x0084:
            o.pc$aux r0 = p004o.C0643pc.aux.ChenRO     // Catch:{ NoSuchFieldError -> 0x008f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
            r1 = 11
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x008f }
        L_0x008f:
            o.pc$aux r0 = p004o.C0643pc.aux.Class2RO     // Catch:{ NoSuchFieldError -> 0x009a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x009a }
            r1 = 24
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x009a }
        L_0x009a:
            o.pc$aux r0 = p004o.C0643pc.aux.Classic2RoInTh     // Catch:{ NoSuchFieldError -> 0x00a5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a5 }
            r1 = 49
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00a5 }
        L_0x00a5:
            o.pc$aux r0 = p004o.C0643pc.aux.ClassicRONet     // Catch:{ NoSuchFieldError -> 0x00b0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b0 }
            r1 = 15
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00b0 }
        L_0x00b0:
            o.pc$aux r0 = p004o.C0643pc.aux.CrazyPoring     // Catch:{ NoSuchFieldError -> 0x00bb }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bb }
            r1 = 70
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00bb }
        L_0x00bb:
            o.pc$aux r0 = p004o.C0643pc.aux.CreativeKingsRO     // Catch:{ NoSuchFieldError -> 0x00c6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c6 }
            r1 = 33
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00c6 }
        L_0x00c6:
            o.pc$aux r0 = p004o.C0643pc.aux.CrownRO     // Catch:{ NoSuchFieldError -> 0x00d1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d1 }
            r1 = 22
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00d1 }
        L_0x00d1:
            o.pc$aux r0 = p004o.C0643pc.aux.Daro     // Catch:{ NoSuchFieldError -> 0x00dc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dc }
            r1 = 50
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00dc }
        L_0x00dc:
            o.pc$aux r0 = p004o.C0643pc.aux.Eden3     // Catch:{ NoSuchFieldError -> 0x00e7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e7 }
            r1 = 23
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00e7 }
        L_0x00e7:
            o.pc$aux r0 = p004o.C0643pc.aux.EosRagnarokOnline     // Catch:{ NoSuchFieldError -> 0x00f2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f2 }
            r1 = 26
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00f2 }
        L_0x00f2:
            o.pc$aux r0 = p004o.C0643pc.aux.FreePlayRoCom     // Catch:{ NoSuchFieldError -> 0x00fd }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
            r1 = 45
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00fd }
        L_0x00fd:
            o.pc$aux r0 = p004o.C0643pc.aux.FreeRO     // Catch:{ NoSuchFieldError -> 0x0108 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
            r1 = 9
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0108 }
        L_0x0108:
            o.pc$aux r0 = p004o.C0643pc.aux.FreeRoWeb     // Catch:{ NoSuchFieldError -> 0x0113 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0113 }
            r1 = 31
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0113 }
        L_0x0113:
            o.pc$aux r0 = p004o.C0643pc.aux.GRANDRO     // Catch:{ NoSuchFieldError -> 0x011e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x011e }
            r1 = 79
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x011e }
        L_0x011e:
            o.pc$aux r0 = p004o.C0643pc.aux.GachoRO     // Catch:{ NoSuchFieldError -> 0x0129 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0129 }
            r1 = 60
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0129 }
        L_0x0129:
            o.pc$aux r0 = p004o.C0643pc.aux.GarciaRO     // Catch:{ NoSuchFieldError -> 0x0134 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0134 }
            r1 = 72
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0134 }
        L_0x0134:
            o.pc$aux r0 = p004o.C0643pc.aux.Gugusjungs57572     // Catch:{ NoSuchFieldError -> 0x013f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x013f }
            r1 = 35
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x013f }
        L_0x013f:
            o.pc$aux r0 = p004o.C0643pc.aux.IfritRagnarokCom     // Catch:{ NoSuchFieldError -> 0x014a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x014a }
            r1 = 43
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x014a }
        L_0x014a:
            o.pc$aux r0 = p004o.C0643pc.aux.InfamyRO     // Catch:{ NoSuchFieldError -> 0x0155 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0155 }
            r1 = 17
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0155 }
        L_0x0155:
            o.pc$aux r0 = p004o.C0643pc.aux.KafraRO     // Catch:{ NoSuchFieldError -> 0x0160 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0160 }
            r1 = 57
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0160 }
        L_0x0160:
            o.pc$aux r0 = p004o.C0643pc.aux.LeonardRO     // Catch:{ NoSuchFieldError -> 0x016b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x016b }
            r1 = 42
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x016b }
        L_0x016b:
            o.pc$aux r0 = p004o.C0643pc.aux.LibRO     // Catch:{ NoSuchFieldError -> 0x0176 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0176 }
            r1 = 62
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0176 }
        L_0x0176:
            o.pc$aux r0 = p004o.C0643pc.aux.LidiaRO     // Catch:{ NoSuchFieldError -> 0x0181 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0181 }
            r1 = 34
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0181 }
        L_0x0181:
            o.pc$aux r0 = p004o.C0643pc.aux.LucianoRO     // Catch:{ NoSuchFieldError -> 0x018c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x018c }
            r1 = 71
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x018c }
        L_0x018c:
            o.pc$aux r0 = p004o.C0643pc.aux.MOTR     // Catch:{ NoSuchFieldError -> 0x0196 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0196 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0196 }
        L_0x0196:
            o.pc$aux r0 = p004o.C0643pc.aux.MOTR_home     // Catch:{ NoSuchFieldError -> 0x01a0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a0 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01a0 }
        L_0x01a0:
            o.pc$aux r0 = p004o.C0643pc.aux.MobiRO     // Catch:{ NoSuchFieldError -> 0x01ab }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ab }
            r1 = 28
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01ab }
        L_0x01ab:
            o.pc$aux r0 = p004o.C0643pc.aux.Modify_Full     // Catch:{ NoSuchFieldError -> 0x01b6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b6 }
            r1 = 77
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01b6 }
        L_0x01b6:
            o.pc$aux r0 = p004o.C0643pc.aux.MyRO     // Catch:{ NoSuchFieldError -> 0x01c1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c1 }
            r1 = 10
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01c1 }
        L_0x01c1:
            o.pc$aux r0 = p004o.C0643pc.aux.MyRebornRO     // Catch:{ NoSuchFieldError -> 0x01cc }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01cc }
            r1 = 81
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01cc }
        L_0x01cc:
            o.pc$aux r0 = p004o.C0643pc.aux.Newyear     // Catch:{ NoSuchFieldError -> 0x01d7 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d7 }
            r1 = 78
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01d7 }
        L_0x01d7:
            o.pc$aux r0 = p004o.C0643pc.aux.NorseRO     // Catch:{ NoSuchFieldError -> 0x01e2 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e2 }
            r1 = 64
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01e2 }
        L_0x01e2:
            o.pc$aux r0 = p004o.C0643pc.aux.NoviceRO     // Catch:{ NoSuchFieldError -> 0x01ed }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ed }
            r1 = 41
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01ed }
        L_0x01ed:
            o.pc$aux r0 = p004o.C0643pc.aux.OMGRO     // Catch:{ NoSuchFieldError -> 0x01f8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x01f8 }
            r1 = 75
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x01f8 }
        L_0x01f8:
            o.pc$aux r0 = p004o.C0643pc.aux.OcrClassicCom     // Catch:{ NoSuchFieldError -> 0x0203 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0203 }
            r1 = 85
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0203 }
        L_0x0203:
            o.pc$aux r0 = p004o.C0643pc.aux.OldSchoolRO     // Catch:{ NoSuchFieldError -> 0x020e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x020e }
            r1 = 16
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x020e }
        L_0x020e:
            o.pc$aux r0 = p004o.C0643pc.aux.OldchaosROCom     // Catch:{ NoSuchFieldError -> 0x0219 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0219 }
            r1 = 32
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0219 }
        L_0x0219:
            o.pc$aux r0 = p004o.C0643pc.aux.OldschoolragnarokCom     // Catch:{ NoSuchFieldError -> 0x0224 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0224 }
            r1 = 68
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0224 }
        L_0x0224:
            o.pc$aux r0 = p004o.C0643pc.aux.PhoenixRO     // Catch:{ NoSuchFieldError -> 0x022f }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x022f }
            r1 = 21
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x022f }
        L_0x022f:
            o.pc$aux r0 = p004o.C0643pc.aux.PhoenixRO2     // Catch:{ NoSuchFieldError -> 0x023a }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x023a }
            r1 = 84
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x023a }
        L_0x023a:
            o.pc$aux r0 = p004o.C0643pc.aux.PinoyRO     // Catch:{ NoSuchFieldError -> 0x0245 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0245 }
            r1 = 74
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0245 }
        L_0x0245:
            o.pc$aux r0 = p004o.C0643pc.aux.PlayLokiServerCom     // Catch:{ NoSuchFieldError -> 0x0250 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0250 }
            r1 = 30
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0250 }
        L_0x0250:
            o.pc$aux r0 = p004o.C0643pc.aux.PlayragnarokPh     // Catch:{ NoSuchFieldError -> 0x025b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x025b }
            r1 = 18
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x025b }
        L_0x025b:
            o.pc$aux r0 = p004o.C0643pc.aux.PlayvalhallaPh     // Catch:{ NoSuchFieldError -> 0x0266 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0266 }
            r1 = 48
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0266 }
        L_0x0266:
            o.pc$aux r0 = p004o.C0643pc.aux.ROClashed     // Catch:{ NoSuchFieldError -> 0x0271 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0271 }
            r1 = 90
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0271 }
        L_0x0271:
            o.pc$aux r0 = p004o.C0643pc.aux.ROProviderValkyrie     // Catch:{ NoSuchFieldError -> 0x027c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x027c }
            r1 = 13
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x027c }
        L_0x027c:
            o.pc$aux r0 = p004o.C0643pc.aux.Ragnaclan     // Catch:{ NoSuchFieldError -> 0x0287 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0287 }
            r1 = 39
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0287 }
        L_0x0287:
            o.pc$aux r0 = p004o.C0643pc.aux.RagnarevivalCom     // Catch:{ NoSuchFieldError -> 0x0292 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0292 }
            r1 = 36
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0292 }
        L_0x0292:
            o.pc$aux r0 = p004o.C0643pc.aux.Ragnarevo     // Catch:{ NoSuchFieldError -> 0x029d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x029d }
            r1 = 69
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x029d }
        L_0x029d:
            o.pc$aux r0 = p004o.C0643pc.aux.RagnarokPuzzle     // Catch:{ NoSuchFieldError -> 0x02a8 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02a8 }
            r1 = 76
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02a8 }
        L_0x02a8:
            o.pc$aux r0 = p004o.C0643pc.aux.RagnarokReturnPh     // Catch:{ NoSuchFieldError -> 0x02b3 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02b3 }
            r1 = 59
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02b3 }
        L_0x02b3:
            o.pc$aux r0 = p004o.C0643pc.aux.RebirthRO_Ancyker     // Catch:{ NoSuchFieldError -> 0x02be }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02be }
            r1 = 37
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02be }
        L_0x02be:
            o.pc$aux r0 = p004o.C0643pc.aux.RelaxRO     // Catch:{ NoSuchFieldError -> 0x02c9 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02c9 }
            r1 = 88
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02c9 }
        L_0x02c9:
            o.pc$aux r0 = p004o.C0643pc.aux.RoFaction     // Catch:{ NoSuchFieldError -> 0x02d4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02d4 }
            r1 = 55
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02d4 }
        L_0x02d4:
            o.pc$aux r0 = p004o.C0643pc.aux.RoFreedom     // Catch:{ NoSuchFieldError -> 0x02df }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02df }
            r1 = 86
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02df }
        L_0x02df:
            o.pc$aux r0 = p004o.C0643pc.aux.RoHeimdallCom     // Catch:{ NoSuchFieldError -> 0x02ea }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02ea }
            r1 = 46
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02ea }
        L_0x02ea:
            o.pc$aux r0 = p004o.C0643pc.aux.RoRetro     // Catch:{ NoSuchFieldError -> 0x02f5 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x02f5 }
            r1 = 61
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x02f5 }
        L_0x02f5:
            o.pc$aux r0 = p004o.C0643pc.aux.SakrayPh     // Catch:{ NoSuchFieldError -> 0x0300 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0300 }
            r1 = 80
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0300 }
        L_0x0300:
            o.pc$aux r0 = p004o.C0643pc.aux.SarahServer     // Catch:{ NoSuchFieldError -> 0x030b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x030b }
            r1 = 19
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x030b }
        L_0x030b:
            o.pc$aux r0 = p004o.C0643pc.aux.SecretRO     // Catch:{ NoSuchFieldError -> 0x0316 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0316 }
            r1 = 63
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0316 }
        L_0x0316:
            o.pc$aux r0 = p004o.C0643pc.aux.ShinServer     // Catch:{ NoSuchFieldError -> 0x0321 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0321 }
            r1 = 25
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0321 }
        L_0x0321:
            o.pc$aux r0 = p004o.C0643pc.aux.SuccessRoNet     // Catch:{ NoSuchFieldError -> 0x032c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x032c }
            r1 = 20
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x032c }
        L_0x032c:
            o.pc$aux r0 = p004o.C0643pc.aux.ThaiRoInTh     // Catch:{ NoSuchFieldError -> 0x0337 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0337 }
            r1 = 40
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0337 }
        L_0x0337:
            o.pc$aux r0 = p004o.C0643pc.aux.Thai_id9169     // Catch:{ NoSuchFieldError -> 0x0342 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0342 }
            r1 = 47
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0342 }
        L_0x0342:
            o.pc$aux r0 = p004o.C0643pc.aux.TheClassicROCom     // Catch:{ NoSuchFieldError -> 0x034d }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x034d }
            r1 = 14
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x034d }
        L_0x034d:
            o.pc$aux r0 = p004o.C0643pc.aux.TitanRO     // Catch:{ NoSuchFieldError -> 0x0358 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0358 }
            r1 = 54
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0358 }
        L_0x0358:
            o.pc$aux r0 = p004o.C0643pc.aux.Trinity_Reborn_Full     // Catch:{ NoSuchFieldError -> 0x0363 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0363 }
            r1 = 65
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0363 }
        L_0x0363:
            o.pc$aux r0 = p004o.C0643pc.aux.TyrServer     // Catch:{ NoSuchFieldError -> 0x036e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x036e }
            r1 = 27
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x036e }
        L_0x036e:
            o.pc$aux r0 = p004o.C0643pc.aux.WeDevGames     // Catch:{ NoSuchFieldError -> 0x0379 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0379 }
            r1 = 12
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0379 }
        L_0x0379:
            o.pc$aux r0 = p004o.C0643pc.aux.WeloveRo     // Catch:{ NoSuchFieldError -> 0x0384 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0384 }
            r1 = 56
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0384 }
        L_0x0384:
            o.pc$aux r0 = p004o.C0643pc.aux.XileRO     // Catch:{ NoSuchFieldError -> 0x038e }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x038e }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x038e }
        L_0x038e:
            o.pc$aux r0 = p004o.C0643pc.aux.XileRO2019     // Catch:{ NoSuchFieldError -> 0x0399 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0399 }
            r1 = 82
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0399 }
        L_0x0399:
            o.pc$aux r0 = p004o.C0643pc.aux.XileROOS     // Catch:{ NoSuchFieldError -> 0x03a4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03a4 }
            r1 = 29
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03a4 }
        L_0x03a4:
            o.pc$aux r0 = p004o.C0643pc.aux.eA     // Catch:{ NoSuchFieldError -> 0x03af }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03af }
            r1 = 91
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03af }
        L_0x03af:
            o.pc$aux r0 = p004o.C0643pc.aux.eSport2019     // Catch:{ NoSuchFieldError -> 0x03ba }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03ba }
            r1 = 83
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03ba }
        L_0x03ba:
            o.pc$aux r0 = p004o.C0643pc.aux.fRO     // Catch:{ NoSuchFieldError -> 0x03c4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03c4 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03c4 }
        L_0x03c4:
            o.pc$aux r0 = p004o.C0643pc.aux.hiclassro     // Catch:{ NoSuchFieldError -> 0x03cf }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03cf }
            r1 = 67
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03cf }
        L_0x03cf:
            o.pc$aux r0 = p004o.C0643pc.aux.iPlayRo201804     // Catch:{ NoSuchFieldError -> 0x03da }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03da }
            r1 = 51
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03da }
        L_0x03da:
            o.pc$aux r0 = p004o.C0643pc.aux.iRO_Renewal     // Catch:{ NoSuchFieldError -> 0x03e4 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03e4 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03e4 }
        L_0x03e4:
            o.pc$aux r0 = p004o.C0643pc.aux.kRO     // Catch:{ NoSuchFieldError -> 0x03ee }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x03ee }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x03ee }
        L_0x03ee:
            f8936 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C2039.m2707():int[]");
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 18259;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (!z) {
            C0183ah ahVar = (C0183ah) C1014.f6144.f7015;
            C0682qa qaVar = new C0682qa(s, s2, s3, ((C0184) ahVar.f377.get(C1093.class)).f382, ((C0184) ahVar.f377.get(C1511.class)).f382, ((C0184) ahVar.f377.get(C1085.class)).f382, ((C0184) ahVar.f377.get(C1084.class)).f382);
            switch (m2707()[C1014.f6140.f4443.ordinal()]) {
                case 12:
                    C1014.f6144.f7001 = new C0713re(qaVar);
                    break;
                case 14:
                    C1014.f6144.f7001 = new C0710rb(qaVar);
                    break;
                case 18:
                    C1014.f6144.f7001 = new C0696qo(qaVar);
                    break;
                case 23:
                    C1014.f6144.f7001 = new C0674pt(qaVar);
                    break;
                case 39:
                    C1014.f6144.f7001 = new C0697qp(qaVar);
                    break;
                case MotionEventCompat.AXIS_GENERIC_9 /*40*/:
                    C1014.f6144.f7001 = new C0709ra(qaVar);
                    break;
                case MotionEventCompat.AXIS_GENERIC_13 /*44*/:
                    C1014.f6144.f7001 = new C0667pm(qaVar);
                    break;
                case MotionEventCompat.AXIS_GENERIC_14 /*45*/:
                    C1014.f6144.f7001 = new C0676pv(qaVar);
                    break;
                case MotionEventCompat.AXIS_GENERIC_16 /*47*/:
                    C1014.f6144.f7001 = new C0680pz(qaVar);
                    break;
                case 51:
                    C1014.f6144.f7001 = new C0683qb(qaVar);
                    break;
                case 53:
                    C1014.f6144.f7001 = new C0670pp(qaVar);
                    break;
                case 54:
                    C1014.f6144.f7001 = new C0711rc(qaVar);
                    break;
                case 55:
                    C1014.f6144.f7001 = new C0703qv(qaVar);
                    break;
                case 56:
                    C1014.f6144.f7001 = new C0714rf(qaVar);
                    break;
                case 57:
                    C1014.f6144.f7001 = new C0684qc(qaVar);
                    break;
                case 58:
                    C1014.f6144.f7001 = new C0672pr(qaVar);
                    break;
                case 59:
                    C1014.f6144.f7001 = new C0700qs(qaVar);
                    break;
                case 60:
                    C1014.f6144.f7001 = new C0677pw(qaVar);
                    break;
                case 61:
                    C1014.f6144.f7001 = new C0705qx(qaVar);
                    break;
                case 62:
                    C1014.f6144.f7001 = new C0685qd(qaVar);
                    break;
                case 63:
                    C1014.f6144.f7001 = new C0707qz(qaVar);
                    break;
                case 64:
                    C1014.f6144.f7001 = new C0690qi(qaVar);
                    break;
                case 65:
                    C1014.f6144.f7001 = new C0712rd(qaVar);
                    break;
                case 66:
                    C1014.f6144.f7001 = new C0666pl(qaVar);
                    break;
                case 67:
                    C1014.f6144.f7001 = new C0679py(qaVar);
                    break;
                case 68:
                    C1014.f6144.f7001 = new C0692qk(qaVar);
                    break;
                case TFTP.DEFAULT_PORT /*69*/:
                    C1014.f6144.f7001 = new C0698qq(qaVar);
                    break;
                case 70:
                    C1014.f6144.f7001 = new C0673ps(qaVar);
                    break;
                case 71:
                    C1014.f6144.f7001 = new C0686qe(qaVar);
                    break;
                case 73:
                    C1014.f6144.f7001 = new C0669po(qaVar);
                    break;
                case 74:
                    C1014.f6144.f7001 = new C0695qn(qaVar);
                    break;
                case 75:
                    C1014.f6144.f7001 = new C0693ql(qaVar);
                    break;
                case 76:
                    C1014.f6144.f7001 = new C0699qr(qaVar);
                    break;
                case 77:
                    C1014.f6144.f7001 = new C0687qf(qaVar);
                    break;
                case 78:
                    C1014.f6144.f7001 = new C0689qh(qaVar);
                    break;
                case FingerClient.DEFAULT_PORT /*79*/:
                    C1014.f6144.f7001 = new C0678px(qaVar);
                    break;
                case C0840uf.f5034 /*80*/:
                    C1014.f6144.f7001 = new C0706qy(qaVar);
                    break;
                case 81:
                    C1014.f6144.f7001 = new C0688qg(qaVar);
                    break;
                case 83:
                    C1014.f6144.f7001 = new C0675pu(qaVar);
                    break;
                case 84:
                    C1014.f6144.f7001 = new C0694qm(qaVar);
                    break;
                case 85:
                    C1014.f6144.f7001 = new C0691qj(qaVar);
                    break;
                case 86:
                    C1014.f6144.f7001 = new C0704qw(qaVar);
                    break;
                case 87:
                    C1014.f6144.f7001 = new C0671pq(qaVar);
                    break;
                case 88:
                    C1014.f6144.f7001 = new C0701qt(qaVar);
                    break;
                case 89:
                    C1014.f6144.f7001 = new C0668pn(qaVar);
                    break;
                case 90:
                    C1014.f6144.f7001 = new C0702qu(qaVar);
                    break;
                default:
                    throw new UnsupportedOperationException();
            }
            C0663pk pkVar = C1014.f6144.f7001;
            byte[] bArr2 = bArr;
            pkVar.mo4081(bArr2, bArr2.length, pkVar.f4618);
            ByteBuffer byteBuffer2 = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).position(0);
            int i3 = byteBuffer2.getInt();
            byteBuffer2.getLong();
            short s4 = byteBuffer2.getShort();
            int i4 = byteBuffer2.getInt();
            int i5 = byteBuffer2.getInt();
            int i6 = byteBuffer2.getInt();
            if (i6 != C1014.f6140.f4470) {
                C0592ns.m674("Server uses different packet version from your client server: " + i6 + ", client: " + C1014.f6140.f4470 + "!");
            }
            if (s4 == 48059 && C1014.f6144.f7007.f7027 != C0585nl.LOGIN) {
                C0592ns.m674("Gepard server type mismatch (login)");
            } else if (s4 == 43690 && C1014.f6144.f7007.f7027 != C0585nl.MAP) {
                C0592ns.m674("Gepard server type mismatch (map)");
            }
            if (i4 != C1014.f6144.f7001.mo4076()) {
                C0592ns.m674("Gepard license ID mismatch");
            }
            C1428 r0 = C1014.f6144;
            if (i5 != 2016122701) {
                C0592ns.m674("Gepard code version mismatch");
            }
            if (i3 != C1014.f6144.f7001.mo4077(bArr, 4, bArr.length - 4)) {
                C0592ns.m674("Gepard data hash mismatch");
            }
            C1014.f6144.mo3652((C0839ue) new C1100());
            if (C1014.f6144.f7007.f7027 == C0585nl.LOGIN) {
                if (!C1014.f6140.f4479 || C1014.f6140.f4443 == aux.Eden3) {
                    C1014.f6144.mo3652((C0839ue) new C1860(C1014.f6154, C1014.f6145, C1014.f6140.f4442, C1014.f6140.f4518));
                } else {
                    C1014.f6144.mo3652((C0839ue) new C1565(C1014.f6154, C1014.f6145, C1014.f6140.f4442, C1014.f6140.f4518, false));
                }
            }
        }
    }
}
