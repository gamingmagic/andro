package p004o;

import android.os.Build;
import android.support.p000v4.media.TransportMediator;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Arrays;
import java.util.Random;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.apache.http.HttpStatus;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;
import p004o.C0643pc.C0645;
import p004o.C0643pc.C0649;
import p004o.C0643pc.C0650;

/* renamed from: o.Ą */
public final class C1014 {

    /* renamed from: Ą */
    public static C1641 f6136 = new C1641();

    /* renamed from: ą */
    public static C0521lf f6137;

    /* renamed from: Ć */
    public static C0304ef f6138 = new C0304ef();

    /* renamed from: ć */
    public static int f6139 = 0;

    /* renamed from: ċ */
    public static C0650 f6140;

    /* renamed from: đ */
    static C1018 f6141;

    /* renamed from: Ė */
    public static C0534lq f6142 = null;

    /* renamed from: ġ */
    private static int f6143 = 155;

    /* renamed from: ȃ */
    public static C1428 f6144;

    /* renamed from: Ȋ */
    public static String f6145;

    /* renamed from: Ƞ */
    private static final byte[] f6146 = {118, 10, 40, 111, -6, -1, 6, 3, -6, 5, -1, 6, -6, 5, 0, 0, 6, -7, 4, 0, 6, -6, 4, 7, -5, -2, 8, 5, 0, 4, -4, 5, -1, 9, -9, 5, 6, -8, 4, 5, 4, 3, -12, 8, 4, -6, -54, 69, -2, 2, 3, -2, 8, -12, -4, 2, 14, -67, 67, -7, 3, 7, -10, 12, 1, -10, 7, 4, -8, 8, -2, 0, 4, -4, 11, -1, -7, 8, -4, -1, 9, -1, 14, -9, 15, -2, -64, 67, -3, -10, 25, -6, -16, 7, 8, -12, 18, -2, -3, -60, 67, -7, 3, 7, -10, 12, 1, -10, 9, -3, -3, 12, 4, -7, 3, 6, 6, -13, 14, 5, -16, 14, -67, 71, -10, 12, -18, 14, 5, -2, -64, 65, -8, 16, 3, 7, -10, 12, 1, -10, 5, 0, -2, 4, 3, -2, 4, -7, 3, 6, -63, 54, 16, -12, -3, 20, -10, 14, -16, -55, 63, -1, 6, -6, 13, 0, -2, -64, 54, 13, -1, 3, 7, -10, 12, 1, -10, 5, 0, -2, 4, 3, -1, 0, 4, -4, 5, 4, -1, -4, 5, 4, -6, 5, 1, 0, -13, 14, 5, -67, -3, 55, -2, 18, -2, -64, 57, 13, -6, 19, -9, -6, 7, -6, 19, 1, -17, 14, -63, 54, 13, -1, 6, 10, -12, -1, 18, -69, 71, -10, -59, 71, -13, 14, 5, -16, 14, -67, 54, 13, -1, -3, -3, 5, 2, -4, 4, -2, 8, -2, 14, -9, 15, -2, -64, 54, 16, -16, 26, 0, -8, 0, 4, -8, 6, -6, -56, 54, 13, -1, -11, -57, 59, 7, 2, -1, -1, -5, 10, -6, -56, 54, 13, -1, 0, 9, -9, 9, -4, -2, 4, 8, -6, -2, 12, -4, -14, 4, -6, 14, -2, -1, 2, -63, 55, 1, 11, 6, -68, 60, 6, -7, 10, 0, 4, -4, 6, -1, -2, 5, 4, -4, -1, 9, 2, 0, 5, -5, 4, 5, -1, -4, 4, 0, 10, -10, 12, -8, 14, -9, 15, -2, -64, 64, 3, -12, 8, -59, 70, -2, -64, 65, -8, 16, 14, -9, 15, -2, -64, 70, 3, -17, 1, 3, 15, 1, -69, 70, -2, -64, 65, -8, 16, 0, 4, -4, 11, -1, -7, 8, -4, -1, 4, 1, 0, 1, -7, 4, 5, -3, -2, 4, 3, 6, -9, 4, 3, 0, -3, -10, 25, -74, 71, -11, -6, 9, 10, -2, -64, 60, 6, -63, 71, -11, 14, -9, 15, -2, -64, 56, 15, -2, 0, 4, 3, -70, 70, -2, -64, 54, 13, -1, 14, -9, 15, -2, -64, 57, 13, -12, 1, -55, 70, -16, 7, 8, -12, 18, -2, -3, 5, 0, -1, -2, 6, -8, -54, 54, 13, -1, -1, 3, -3, 12, -10, 12, -8, -1, 11, 2, 1, -7, 4, 5, -4, -1, 4, 8, 1, -9, 4, 3, 0, 0, 4, -4, 5, 4, -1, -4, 10, -3, -4, 4, 2, 7, 6, -3, -3, 5, 3, 5, -9, 12, -5, -4, 11, 2, -3, -10, 25, -74, 69, -2, -65, 58, 13, -12, 1, 0, 12, -1, -62, 54, 13, -1, -10, 0, -8, -54, 52, 13, -11, 20, 0, 3, -2, -2, -64, 54, 13, -1, -14, 4, -6, 14, -2, -64, 55, 11, 6, -13, 16, -69, 54, 13, -1, 14, -9, 15, -2, -64, 53, 17, -8, -1, 2, 13, -1, -2, -64, 65, -8, 16, 2, 6, -8, 3, -1, 3, -1, 4, -13, 14, 5, -16, 14, -67, 67, 0, 4, -8, 6, -6, -57, 71, -13, 14, 5, -12, -5, 3, -54, 54, 13, -1, 0, 4, -4, 11, -1, -7, 8, -4, -1, 7, 2, 3, 7, -10, 12, 1, -10, 11, -9, 5, 2, 6, 6, -3, -3, 5, 3, 5, -9, 12, -5, -4, 4, 1, 0, 2, 7, -9, 5, 3, -2, -2, 12, -6, -3, 4, 3, 1, 3, 7, -10, 12, 1, -10, 4, 2, 3, -5, 4, 2, 4, -7, 3, 6, -63, 64, 3, 6, -1, -67, 66, 0, -1, -2, 6, -8, 6, -3, -3, 5, 3, 5, -9, 12, -5, -4, 5, 4, -3, 0, 5, -5, 4, 5, -1, -4, 4, 0, 10, -10, 5, 2, -1, 6, -3, -3, 5, 3, 5, -9, 12, -5, -4, 4, 1, 7, 0, 4, -4, 5, 7, -9, 4, 4, 5, -9, 5, 2, -2, 14, -9, 15, -2, -64, 52, 20, -7, -10, 19, -69, 70, -2, -64, 54, 13, -1, 1, -7, 4, 5, -3, -2, 4, 3, 6, -9, 4, 8, -1, 2, -6, 10, 0, -7, 4, 8, 2, -10, 5, 4, -1, 14, -9, 15, -2, -64, 56, 0, 2, 10, -64, 70, -67, 54, 13, -1, 0, 4, -4, 11, -1, -7, 8, -4, -1, 10, -1, 4, -7, 3, 6, -63, 54, 10, -10, 19, 1, -64, -4, 70, -2, -64, 54, 13, -1, 14, -9, 15, -2, -64, 70, -17, 18, -16, 8, 12, -13, 14, 5, -16, 14, -67, 65, -8, 16, 5, 4, -9, 9, 4, -10, 5, 4, 0, -5, 9, -4, 1, 9, -10, 11, -6, -2, 10, 3, -10, 5, 0, 0, 4, -4, 11, -1, -7, 8, -4, -1, 10, -6, 0, 5, -5, 4, 5, -1, -4, 4, 0, 10, -10, 10, -6, 14, -9, 15, -2, -64, 69, -16, 7, 8, -12, 18, -2, -3, 8, -12, 16, 2, -2, -3, -63, 67, -7, 2, 7, -9, 5, 3, -2, -2, 12, -6, -3, 4, 6, -3, -62, 53, 12, -16, 22, -12, 12, 6, -74, 54, 13, -1, 14, -9, 15, -2, -64, 66, -2, -7, 16, -15, 6, 8, 1, -2, -62, 70, -2, -64, 65, -8, 16, 4, -7, 3, 6, -63, 60, 6, -7, -4, 13, 13, -6, -2, -64, 54, 13, -1, -3, -10, 25, -71, -2, 59, 2, -5, 10, -10, 19, 1, -69, 70, -2, -64, 54, 13, -1, 13, 0, 1, -8, -1, 18, -69, 70, -13, 14, 5, -16, 14, -64, 8, -9, 67, -3, -10, 25, -21, 16, -2, 9, -8, -63, 54, 13, -1, 14, -9, 15, -2, -64, 69, -16, 7, 8, -12, 18, -12, 18, -6, -64, 54, 13, -1, -5, 13, -7, -54, 69, -12, -2, 8, 10, 3, -11, -57, 69, -2, -5, 13, -7, 8, 4, -7, 3, 6, -63, 69, -16, 7, 8, -12, 18, -12, 18, -12, 14, -20, 12, -61, 54, 13, -1, 0, -1, 3, -1, 5, -3, 5, 8, -8, -5, 13, -7, -54, 69, -12, 8, -10, 24, -74, 70, -2, -64, 54, 13, -1, -12, 14, -3, -10, 25, -74, 74, -17, 8, 4, 8, -16, -55, 70, -2, -64, 54, 13, -1, 14, -9, 15, -2, -64, 52, 5, 18, -20, -51, 70, -2, -64, 54, 13, -1, -10, 0, -8, -54, 54, 10, -10, 19, 1, -9, -5, 16, -2, -64, 65, -8, 16, 4, -5, 4, -2, 5, 7, -9, 4, 9, -4, 0, 4, -4, 11, -1, -7, 8, -4, -1, 4, 3, 5};

    /* renamed from: ˮ͈ */
    public static c_activity f6147;

    /* renamed from: ˮ͍ */
    public static C0214bi f6148 = new C0214bi();

    /* renamed from: ܕ */
    public static C0271df f6149;

    /* renamed from: 㱽 */
    private static /* synthetic */ int[] f6150;

    /* renamed from: 㵼 */
    private static /* synthetic */ int[] f6151;

    /* renamed from: 䒧 */
    public static C1734 f6152;

    /* renamed from: 囃 */
    static Runnable f6153 = new aux();

    /* renamed from: 岱 */
    public static String f6154;

    /* renamed from: 庸 */
    public static boolean f6155 = false;

    /* renamed from: 廂 */
    static String f6156;

    /* renamed from: 廅 */
    static final C1019[] f6157 = {new C1019(0, null), new C1019(128, "shift_jis"), new C1019(129, "windows-949"), new C1019(134, "gb2312"), new C1019(136, "big5"), new C1019(161, "windows-1253"), new C1019(162, "windows-1254"), new C1019(163, "windows-1258"), new C1019(177, "windows-1255"), new C1019(178, "windows-1256"), new C1019(186, "windows-1257"), new C1019(HttpStatus.SC_NO_CONTENT, "windows-1251"), new C1019(NNTPReply.ARTICLE_RETRIEVED_BODY_FOLLOWS, "windows-874"), new C1019(TelnetCommand.ABORT, "windows-1250")};

    /* renamed from: 櫯 */
    public static C0252cp f6158;

    /* renamed from: 纫 */
    public static C1015if f6159;

    /* renamed from: 躆 */
    public static C0415hp f6160;

    /* renamed from: 鷭 */
    public static C1014 f6161;

    /* renamed from: Ē */
    int f6162;

    /* renamed from: ē */
    byte f6163;

    /* renamed from: ė */
    C1016 f6164;

    /* renamed from: Ę */
    C0599nz f6165;

    /* renamed from: ę */
    public C1017 f6166;

    /* renamed from: ঽ্ */
    public byte[] f6167;

    /* renamed from: 㥳 */
    boolean f6168 = false;

    /* renamed from: 띥 */
    public int f6169;

    /* renamed from: o.Ą$if */
    class C1015if {

        /* renamed from: ˮ͈ */
        int f6171;

        /* renamed from: 櫯 */
        String f6172;

        /* renamed from: 鷭 */
        String f6173;

        C1015if(String str, String str2, int i) {
            this.f6173 = str;
            this.f6172 = str2;
            this.f6171 = i;
        }
    }

    /* renamed from: o.Ą$ȃ */
    class C1016 {

        /* renamed from: ˮ͈ */
        C1015if[] f6175;

        /* renamed from: 櫯 */
        int f6176;

        /* renamed from: 鷭 */
        int f6177;

        C1016() {
        }
    }

    /* renamed from: o.Ą$ˮ͈ */
    class C1017 {

        /* renamed from: ˮ͈ */
        public short f6179;

        /* renamed from: 櫯 */
        public String f6180;

        /* renamed from: 鷭 */
        public String f6181;

        public C1017() {
        }
    }

    /* renamed from: o.Ą$櫯 */
    class C1018 {

        /* renamed from: Ą */
        String f6182;

        /* renamed from: ȃ */
        String f6184;

        /* renamed from: ˮ͈ */
        String f6185;

        /* renamed from: 櫯 */
        int f6186;

        /* renamed from: 鷭 */
        String f6187;

        C1018() {
        }
    }

    /* renamed from: o.Ą$鷭 */
    static class C1019 {

        /* renamed from: 櫯 */
        final String f6188;

        /* renamed from: 鷭 */
        final int f6189;

        C1019(int i, String str) {
            this.f6189 = i;
            this.f6188 = str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m1836(int r6, int r7, int r8) {
        /*
            int r7 = r7 + 8
            byte[] r4 = f6146
            int r6 = r6 + 49
            java.lang.String r0 = new java.lang.String
            int r8 = 1165 - r8
            r5 = -1
            byte[] r1 = new byte[r7]
            int r7 = r7 + -1
            if (r4 != 0) goto L_0x0018
            r2 = r6
            r3 = r8
        L_0x0013:
            int r2 = r2 + r3
            int r6 = r2 + -1
            int r8 = r8 + 1
        L_0x0018:
            int r5 = r5 + 1
            byte r2 = (byte) r6
            r1[r5] = r2
            if (r5 != r7) goto L_0x0024
            r2 = 0
            r0.<init>(r1, r2)
            return r0
        L_0x0024:
            r2 = r6
            byte r3 = r4[r8]
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1014.m1836(int, int, int):java.lang.String");
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
    /* renamed from: 䒧 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m1832() {
        /*
            int[] r0 = f6150
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
            f6150 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1014.m1832():int[]");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(42:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|(2:42|43)|44|46) */
    /* JADX WARNING: Can't wrap try/catch for region: R(43:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0041 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0057 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0062 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0076 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0080 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x008b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0096 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00a1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00ac */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00b6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00c0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00cb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00d6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* renamed from: 纫 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m1835() {
        /*
            int[] r0 = f6151
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            o.pc$if[] r0 = p004o.C0643pc.C0644if.values()
            int r0 = r0.length
            int[] r2 = new int[r0]
            o.pc$if r0 = p004o.C0643pc.C0644if.America     // Catch:{ NoSuchFieldError -> 0x0016 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0016 }
            r1 = 2
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
        L_0x0016:
            o.pc$if r0 = p004o.C0643pc.C0644if.Australia     // Catch:{ NoSuchFieldError -> 0x0021 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
            r1 = 14
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            o.pc$if r0 = p004o.C0643pc.C0644if.Brazil     // Catch:{ NoSuchFieldError -> 0x002c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002c }
            r1 = 13
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002c }
        L_0x002c:
            o.pc$if r0 = p004o.C0643pc.C0644if.Chile     // Catch:{ NoSuchFieldError -> 0x0037 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0037 }
            r1 = 18
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0037 }
        L_0x0037:
            o.pc$if r0 = p004o.C0643pc.C0644if.China     // Catch:{ NoSuchFieldError -> 0x0041 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0041 }
            r1 = 4
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0041 }
        L_0x0041:
            o.pc$if r0 = p004o.C0643pc.C0644if.France     // Catch:{ NoSuchFieldError -> 0x004c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
            r1 = 19
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x004c }
        L_0x004c:
            o.pc$if r0 = p004o.C0643pc.C0644if.Germany     // Catch:{ NoSuchFieldError -> 0x0057 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0057 }
            r1 = 11
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0057 }
        L_0x0057:
            o.pc$if r0 = p004o.C0643pc.C0644if.India     // Catch:{ NoSuchFieldError -> 0x0062 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
            r1 = 12
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0062 }
        L_0x0062:
            o.pc$if r0 = p004o.C0643pc.C0644if.Indonesia     // Catch:{ NoSuchFieldError -> 0x006c }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
            r1 = 7
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x006c }
        L_0x006c:
            o.pc$if r0 = p004o.C0643pc.C0644if.Japan     // Catch:{ NoSuchFieldError -> 0x0076 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0076 }
            r1 = 3
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0076 }
        L_0x0076:
            o.pc$if r0 = p004o.C0643pc.C0644if.Korea     // Catch:{ NoSuchFieldError -> 0x0080 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0080 }
            r1 = 1
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0080 }
        L_0x0080:
            o.pc$if r0 = p004o.C0643pc.C0644if.Malaysia     // Catch:{ NoSuchFieldError -> 0x008b }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x008b }
            r1 = 9
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x008b }
        L_0x008b:
            o.pc$if r0 = p004o.C0643pc.C0644if.Philippine     // Catch:{ NoSuchFieldError -> 0x0096 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
            r1 = 8
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0096 }
        L_0x0096:
            o.pc$if r0 = p004o.C0643pc.C0644if.Russia     // Catch:{ NoSuchFieldError -> 0x00a1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a1 }
            r1 = 15
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00a1 }
        L_0x00a1:
            o.pc$if r0 = p004o.C0643pc.C0644if.Singapore     // Catch:{ NoSuchFieldError -> 0x00ac }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ac }
            r1 = 10
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00ac }
        L_0x00ac:
            o.pc$if r0 = p004o.C0643pc.C0644if.Taiwan     // Catch:{ NoSuchFieldError -> 0x00b6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b6 }
            r1 = 5
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00b6 }
        L_0x00b6:
            o.pc$if r0 = p004o.C0643pc.C0644if.Thai     // Catch:{ NoSuchFieldError -> 0x00c0 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
            r1 = 6
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00c0 }
        L_0x00c0:
            o.pc$if r0 = p004o.C0643pc.C0644if.UAE     // Catch:{ NoSuchFieldError -> 0x00cb }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cb }
            r1 = 20
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00cb }
        L_0x00cb:
            o.pc$if r0 = p004o.C0643pc.C0644if.Unknown     // Catch:{ NoSuchFieldError -> 0x00d6 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d6 }
            r1 = 17
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00d6 }
        L_0x00d6:
            o.pc$if r0 = p004o.C0643pc.C0644if.Vietnam     // Catch:{ NoSuchFieldError -> 0x00e1 }
            int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e1 }
            r1 = 16
            r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x00e1 }
        L_0x00e1:
            f6151 = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1014.m1835():int[]");
    }

    static {
    }

    /* renamed from: 鷭 */
    static void m1838() {
        f6158 = new C0252cp();
    }

    /* renamed from: 鷭 */
    static void m1842(C0650 r5) {
        C0757sv svVar;
        int i;
        f6140 = r5;
        C1428 r3 = f6144;
        if (f6140.f4447 == C0645.HERCULES) {
            svVar = new C0181ag(f6140.f4470, f6140.f4471);
        } else {
            svVar = new C0179af(f6140.f4504, f6140.f4443);
        }
        r3.f7015 = svVar;
        r3.f7018.f4658 = svVar;
        f6160.mo3805("server_name", 0, r5.f4522);
        C0649 r32 = f6140.f4444.length > 0 ? f6140.f4444[0] : null;
        if (r32 != C0649.ru) {
            if (r32 != C0649.th) {
                switch (m1835()[f6140.f4485.ordinal()]) {
                    case 1:
                        i = 949;
                        break;
                    case 3:
                        i = 932;
                        break;
                    case 4:
                        i = 936;
                        break;
                    case 5:
                        i = 950;
                        break;
                    case 6:
                        i = 874;
                        break;
                    case 15:
                        i = 1251;
                        break;
                    case 16:
                        i = 1258;
                        break;
                    case 18:
                        i = 1145;
                        break;
                    default:
                        i = 0;
                        break;
                }
            } else {
                i = 874;
            }
        } else {
            i = 1251;
        }
        if (i != 0) {
            C0622ot.m743("windows-" + i);
        }
        C0592ns.f2856 = f6147;
        if (C0595nv.f2879 != C0564mr.localclient) {
            C0595nv.f2869 = C0595nv.f2874 + "/" + r5.f4522.toLowerCase();
        }
        C0622ot.m719(C0595nv.f2869 + "/");
        f6141 = new C1018();
        LuaState.loadlibrary(false);
        LuaStateFactory.chdir(C0595nv.f2869);
        f6149 = new C0271df();
    }

    /* renamed from: 櫯 */
    static String m1833() {
        return " server=" + (f6140 != null ? new StringBuilder(String.valueOf(f6140.f4522)).append(" (").append(f6140.f4480).append(":").append(f6140.f4441).append(")").toString() : "none") + " character=" + ((f6142 == null || f6142.f1680 == null || f6142.f1680.f1195 == null) ? "none" : new StringBuilder(String.valueOf(f6142.f1680.f1195.f1741.f8657)).append("(").append(f6142.f1680.f1195.f1741.f1630).append(":").append(f6161.f6169).append("), ").append(C1761.m2430(f6142.f1680.f1195.f1741.f1633).toString()).toString()) + " map=" + ((f6142 == null || f6142.f1695 == null) ? "none" : f6142.f1695.f7353) + " position=" + ((f6142 == null || f6142.f1680 == null || f6142.f1680.f1195 == null) ? "none" : f6142.f1680.f1195.f1741.f1634 + "," + f6142.f1680.f1195.f1741.f1631);
    }

    /* renamed from: ˮ͈ */
    static void m1830() {
        C0453ix ixVar = f6147.f51;
        String str = "Initializing UI";
        if (ixVar.f1370 != null) {
            f6147.mo3387((Runnable) new C0473jm(ixVar));
        }
        f6147.mo3387((Runnable) new C0471jk(ixVar, str));
        C0453ix ixVar2 = f6147.f51;
        LayoutInflater layoutInflater = (LayoutInflater) f6147.getSystemService("layout_inflater");
        ixVar2.f1432 = new C0360g();
        ixVar2.f1409 = new C0456(f6147);
        ixVar2.f1444 = new C0454if(f6147);
        ixVar2.f1445 = new C1842();
        ixVar2.f1416 = new C0234cb(f6147);
        ixVar2.f1435 = new C0396hc(layoutInflater);
        ixVar2.f1375 = new C0429ib(layoutInflater);
        ixVar2.f1376 = new C2009(layoutInflater);
        ixVar2.f1455 = new C1496(layoutInflater);
        ixVar2.f1420 = new C1941(layoutInflater);
        ixVar2.f1377 = new C0357fy(layoutInflater);
        ixVar2.f1378 = new C1877(layoutInflater);
        ixVar2.f1379 = new C0265d(layoutInflater);
        ixVar2.f1380 = new C1978(layoutInflater);
        ixVar2.f1418 = new C0735s();
        ixVar2.f1437 = new C0365ge();
        ixVar2.f1422 = new C1681();
        ixVar2.f1421 = new C0436ii();
        ixVar2.f1410 = new C2027();
        ixVar2.f1381 = new C0197at();
        ixVar2.f1417 = new C0192ao();
        ixVar2.f1382 = new C1331();
        ixVar2.f1383 = new C1535();
        ixVar2.f1374 = new C0383gr();
        ixVar2.f1384 = new C0448is();
        ixVar2.f1385 = new C0527lk();
        ixVar2.f1387 = new C1733();
        ixVar2.f1438 = new C0330ey();
        ixVar2.f1388 = new C1528();
        ixVar2.f1389 = new C1315();
        ixVar2.f1390 = new C1294();
        ixVar2.f1439 = new C1585();
        ixVar2.f1391 = new C1629();
        ixVar2.f1452 = new C1904();
        ixVar2.f1392 = new C0241cf();
        ixVar2.f1442 = new C1536();
        ixVar2.f1451 = new C0297eb();
        ixVar2.f1433 = new C0286dr();
        ixVar2.f1428 = new C0290dv();
        ixVar2.f1443 = new C1724();
        m1828();
    }

    /* renamed from: 鷭 */
    static void m1840(String str) {
        if (f6144.f6999 == null || f6144.f6999.f7027 != C0585nl.LOGIN || str != null || f6140.f4447 != C0645.AEGIS) {
            f6144.f7000 = null;
            f6144.f7001 = null;
            if (f6147.f51.f1452 != null) {
                C1904 r3 = f6147.f51.f1452;
                C1904 r2 = r3;
                View findViewById = ((ViewGroup) f6147.findViewById(16908290)).findViewById(R.id.relativeLayout1);
                if (findViewById != null && findViewById == r3.f8557) {
                    C1904 r4 = r2;
                    View findViewById2 = ((ViewGroup) f6147.findViewById(16908290)).findViewById(R.id.relativeLayout1);
                    if (findViewById2 != null && findViewById2 == r4.f8557) {
                        f6147.setContentView(R.layout.login);
                    }
                    m1828();
                }
            }
            f6161.f6166 = null;
            f6152 = null;
            f6147.mo3387((Runnable) new C1020(str));
        }
    }

    /* renamed from: ȃ */
    public static void m1828() {
        if (f6144.f7007 != null) {
            f6144.f7007.f7022 = null;
        }
        C1428 r2 = f6144;
        if (r2.f7007 != null) {
            r2.f7007.f7024 = true;
        }
        f6147.mo3387((Runnable) new C0473jm(f6147.f51));
        if (f6147.f51.f1408 != null) {
            f6147.f51.f1408.dismiss();
            f6147.f51.f1408 = null;
        }
        f6148.mo3387(new C1564());
    }

    /* renamed from: Ą */
    static long m1823() {
        try {
            long parseLong = Long.parseLong("android_id");
            long j = parseLong;
            if (parseLong > 0) {
                return j;
            }
        } catch (NumberFormatException unused) {
        }
        try {
            long parseLong2 = Long.parseLong(Build.SERIAL);
            long j2 = parseLong2;
            if (parseLong2 > 0) {
                return j2;
            }
        } catch (NumberFormatException unused2) {
        }
        long r0 = (long) f6160.mo3795("ii", 0);
        long j3 = r0;
        if (r0 == 0) {
            j3 = (long) new Random(System.currentTimeMillis()).nextInt();
            f6160.mo3805("ii", 0, String.valueOf((int) j3));
        }
        return j3;
    }

    /* renamed from: ą */
    public static final void m1824() {
        if (1588291200000L < System.currentTimeMillis()) {
            if (C0595nv.f2879 == C0564mr.all) {
                C0592ns.m674("!!! Evaluation expired !!!");
                return;
            }
            c_activity c_activity = f6147;
            C1021 r5 = new C1021();
            if (c_activity.f56 != null) {
                c_activity.f56.postDelayed(new C1348(c_activity, r5), 25000);
            }
        }
    }

    /* renamed from: 鷭 */
    static void m1843(C0650 r15, String str, String str2) {
        f6154 = str;
        f6145 = str2;
        String str3 = r15.f4480;
        byte b = f6146[14];
        byte b2 = f6146[6];
        byte b3 = f6146[33];
        byte b4 = f6146[1];
        int i = -f6146[1012];
        int i2 = f6146[1109] - 1;
        byte b5 = f6146[1];
        byte b6 = f6146[14];
        byte b7 = f6146[18];
        byte b8 = f6146[64];
        byte b9 = f6146[6];
        byte b10 = f6146[33];
        byte b11 = f6146[123];
        byte b12 = f6146[26];
        byte b13 = f6146[9];
        byte b14 = f6146[6];
        byte b15 = f6146[272];
        byte b16 = f6146[96];
        byte b17 = f6146[14];
        byte b18 = f6146[6];
        byte b19 = f6146[74];
        byte b20 = f6146[14];
        byte b21 = f6146[18];
        byte b22 = f6146[160];
        byte b23 = f6146[33];
        byte b24 = f6146[14];
        byte b25 = f6146[18];
        int i3 = f6146[1109] - 1;
        byte b26 = f6146[33];
        byte b27 = f6146[14];
        byte b28 = f6146[18];
        byte b29 = f6146[14];
        byte b30 = f6146[18];
        byte b31 = f6146[14];
        byte b32 = f6146[18];
        byte b33 = f6146[58];
        byte b34 = f6146[23];
        byte b35 = f6146[14];
        byte b36 = f6146[18];
        int i4 = -f6146[1131];
        byte b37 = f6146[63];
        byte b38 = f6146[14];
        byte b39 = f6146[18];
        byte b40 = f6146[14];
        byte b41 = f6146[18];
        byte b42 = f6146[14];
        byte b43 = f6146[9];
        byte b44 = f6146[14];
        byte b45 = f6146[18];
        byte b46 = f6146[14];
        byte b47 = f6146[9];
        byte b48 = f6146[123];
        byte b49 = f6146[26];
        byte b50 = f6146[14];
        byte b51 = f6146[18];
        byte b52 = f6146[14];
        byte b53 = f6146[18];
        byte b54 = f6146[14];
        byte b55 = f6146[9];
        byte b56 = f6146[14];
        byte b57 = f6146[7];
        String[] strArr = {m1836((int) f6146[272], (int) f6146[33], 499), m1836((int) b, (int) b2, (int) b2 | 249), m1836((int) f6146[14], (int) f6146[6], 524), m1836((int) f6146[9], (int) f6146[49], 924), m1836(48, (int) b3, (int) b3 | 34), m1836(48, (int) b4, (int) b4 | 420), m1836(48, i, i | 712), m1836((int) f6146[14], (int) f6146[6], 290), m1836((int) f6146[14], (int) f6146[9], 852), m1836((int) f6146[14], (int) f6146[6], 840), m1836((int) f6146[309], (int) f6146[63], 1124), m1836((int) f6146[64], (int) f6146[7], 705), m1836(i2, (int) b5, (int) b5 | 17), m1836(48, (int) f6146[56], 230), m1836((int) f6146[272], (int) f6146[1], 209), m1836(48, (int) f6146[164], 1083), m1836(48, (int) f6146[164], 344), m1836(48, (int) f6146[63], 811), m1836((int) b6, (int) b7, (int) b7 | 555), m1836(50, (int) f6146[927], 173), m1836(48, (int) f6146[26], 388), m1836((int) f6146[272], (int) f6146[74], 362), m1836((int) f6146[131], (int) f6146[9], 242), m1836((int) b8, (int) b9, (int) b9 | 1144), m1836((int) f6146[9], (int) f6146[6], (int) HttpStatus.SC_REQUEST_TOO_LONG), m1836(48, (int) b10, (int) b10 | 818), m1836((int) b11, (int) b12, (int) b12 | 615), m1836((int) f6146[123], (int) f6146[1], 869), m1836((int) b13, (int) b14, (int) b14 | 689), m1836((int) f6146[14], (int) f6146[6], f6143 | 288), m1836((int) f6146[9], (int) f6146[6], 780), m1836((int) b15, (int) b16, (int) b16 | 1001), m1836((int) b17, (int) b18, (int) b18 | 976), m1836(48, (int) b19, (int) b19 | 740), m1836((int) f6146[151], (int) f6146[96], f6146[3] + 1), m1836((int) f6146[151], (int) f6146[23], (int) TransportMediator.KEYCODE_MEDIA_PLAY), m1836((int) b20, (int) b21, (int) b21 | 1090), m1836((int) f6146[14], (int) f6146[9], 324), m1836((int) b22, (int) b23, (int) b23 | 758), m1836((int) f6146[14], (int) f6146[9], 792), m1836((int) b24, (int) b25, (int) b25 | 1090), m1836((int) f6146[14], (int) f6146[6], 456), m1836(i3, (int) b26, (int) b26 | 630), m1836((int) b27, (int) b28, (int) b28 | 369), m1836((int) f6146[14], (int) f6146[18], 312), m1836((int) f6146[14], (int) f6146[6], 483), m1836((int) f6146[7], (int) f6146[9], 400), m1836((int) f6146[676], (int) f6146[9], 969), m1836((int) f6146[14], (int) f6146[6], 682), m1836((int) f6146[14], (int) f6146[6], 537), m1836((int) b29, (int) b30, (int) b30 | 369), m1836((int) b31, (int) b32, (int) b32 | 1090), m1836(48, (int) f6146[1], 608), m1836((int) f6146[272], (int) f6146[84], 1053), m1836((int) b33, (int) b34, (int) b34 | 888), m1836((int) f6146[160], (int) f6146[63], -f6146[522]), m1836((int) b35, (int) b36, (int) b36 | 369), m1836((int) f6146[14], (int) f6146[18], 1105), m1836(48, (int) f6146[84], 277), m1836((int) f6146[14], (int) f6146[9], (int) f6146[14]), m1836((int) f6146[14], (int) f6146[6], 1137), m1836((int) f6146[6], (int) f6146[18], 1161), m1836((int) f6146[201], (int) f6146[23], 957), m1836((int) f6146[14], (int) f6146[6], 682), m1836(i4, (int) b37, (int) b37 | 931), m1836((int) f6146[14], (int) f6146[9], 792), m1836((int) f6146[160], (int) f6146[63], 192), m1836((int) f6146[14], (int) f6146[9], 881), m1836(48, (int) f6146[74], f6143 & 1012), m1836(48, (int) f6146[164], 915), m1836((int) b38, (int) b39, (int) b39 | 1090), m1836((int) f6146[14], (int) f6146[9], (int) f6146[14]), m1836((int) b40, (int) b41, (int) b41 | 544), m1836((int) b42, (int) b43, (int) b43 | 506), m1836((int) f6146[14], (int) f6146[9], 994), m1836((int) b44, (int) b45, (int) b45 | 297), m1836((int) f6146[64], (int) f6146[7], 705), m1836((int) f6146[676], (int) f6146[563], 583), m1836((int) f6146[14], (int) f6146[9], (int) f6146[14]), m1836((int) f6146[14], (int) f6146[7], (int) f6146[1]), m1836((int) b46, (int) b47, (int) b47 | 664), m1836((int) b48, (int) b49, (int) b49 | 615), m1836((int) b50, (int) b51, (int) b51 | 369), m1836((int) f6146[14], (int) f6146[9], 792), m1836((int) f6146[14], (int) f6146[23], 470), m1836((int) f6146[160], (int) f6146[74], 657), m1836((int) b52, (int) b53, (int) b53 | 297), m1836((int) f6146[419], (int) f6146[74], 80), m1836((int) b54, (int) b55, (int) b55 | 1026), m1836((int) b56, (int) b57, (int) b57 | 1060)};
        if (C0595nv.f2879 == C0564mr.all) {
            String[] strArr2 = strArr;
            byte b58 = f6146[14];
            byte b59 = f6146[64];
            byte b60 = f6146[14];
            String[] strArr3 = {m1836((int) b58, (int) b59, (int) b59 | 590), m1836((int) b60, (int) b60, (int) b60 | 87), "192.168.1.7"};
            String[] strArr4 = strArr2;
            int length = strArr2.length;
            Object[] copyOf = Arrays.copyOf(strArr4, strArr4.length + strArr3.length);
            for (int i5 = 0; i5 < strArr3.length; i5++) {
                copyOf[i5 + length] = strArr3[i5];
            }
            strArr = (String[]) copyOf;
        }
        int i6 = 0;
        while (i6 < strArr.length && !str3.equals(strArr[i6])) {
            i6++;
        }
        if (i6 == strArr.length && C0595nv.f2879 != C0564mr.localclient) {
            if (C0595nv.f2879 == C0564mr.all) {
                C0592ns.m674("!!! Used IP is not trusted !!!");
            } else {
                c_activity c_activity = f6147;
                C1732 r12 = new C1732();
                if (c_activity.f56 != null) {
                    c_activity.f56.postDelayed(new C1348(c_activity, r12), 3000);
                }
            }
        }
        f6156 = "Failed to connect to login-server";
        switch (m1832()[r15.f4443.ordinal()]) {
            case 2:
                C1428 r11 = f6144;
                String str4 = r15.f4480;
                int i7 = r15.f4441;
                C0585nl nlVar = C0585nl.LOGIN;
                String str5 = str2;
                Runnable runnable = f6153;
                C0652pd[] pdVarArr = {new C1697(str, str5, r15.f4442, r15.f4518)};
                C1428 r0 = r11;
                int i8 = i7;
                Runnable runnable2 = runnable;
                int i9 = i8;
                r0.mo3387(new C1976(r0, str4, i9, nlVar, null, new C1655(r0, pdVarArr), runnable2, f6153));
                return;
            case 4:
            case 5:
                C1357 r10 = f6144.f7003;
                r10.f2994 = f6160.mo3795("v1", 0);
                String r17 = f6160.mo3802("v2", 0);
                r10.f2992 = C0622ot.m724(r17 == null ? null : r17);
                if (r10.f2992 != null) {
                    r10.f2993 = Arrays.copyOf(r10.f2992, 16);
                }
                String r172 = f6160.mo3802("v3", 0);
                r10.f2990 = C0622ot.m724(r172 == null ? null : r172);
                C1428 r112 = f6144;
                String str6 = r15.f4480;
                int i10 = r15.f4441;
                C0585nl nlVar2 = C0585nl.LOCKER;
                C0652pd[] pdVarArr2 = {new C1325()};
                C1428 r02 = r112;
                int i11 = i10;
                Runnable runnable3 = f6153;
                int i12 = i11;
                r02.mo3387(new C1976(r02, str6, i12, nlVar2, null, new C1655(r02, pdVarArr2), runnable3, f6153));
                return;
            case 12:
                C0652pd[] pdVarArr3 = {new C1573(C0622ot.m724("2b0a2404e5ac21137cd5798df0618967")), new C1860(str, str2, r15.f4442, r15.f4518)};
                C1428 r03 = f6144;
                String str7 = r15.f4480;
                int i13 = r15.f4441;
                C0585nl nlVar3 = C0585nl.LOGIN;
                int i14 = i13;
                Runnable runnable4 = f6153;
                int i15 = i14;
                r03.mo3387(new C1976(r03, str7, i15, nlVar3, null, new C1655(r03, pdVarArr3), runnable4, f6153));
                return;
            case 62:
                C0652pd[] pdVarArr4 = {new C1573(C0622ot.m724("9d22d1bc39ee6c7c1a5cc80dd0f476a9")), new C1860(str, str2, r15.f4442, r15.f4518)};
                C1428 r04 = f6144;
                String str8 = r15.f4480;
                int i16 = r15.f4441;
                C0585nl nlVar4 = C0585nl.LOGIN;
                int i17 = i16;
                Runnable runnable5 = f6153;
                int i18 = i17;
                r04.mo3387(new C1976(r04, str8, i18, nlVar4, null, new C1655(r04, pdVarArr4), runnable5, f6153));
                return;
            default:
                if (f6140.f4479) {
                    C1428 r113 = f6144;
                    String str9 = r15.f4480;
                    int i19 = r15.f4441;
                    C0585nl nlVar5 = C0585nl.LOGIN;
                    Runnable runnable6 = f6153;
                    Runnable runnable7 = f6153;
                    C1565 r2 = new C1565(str, str2, r15.f4442, r15.f4518, false);
                    Runnable runnable8 = runnable6;
                    C1428 r05 = r113;
                    int i20 = i19;
                    Runnable runnable9 = runnable8;
                    C0585nl nlVar6 = nlVar5;
                    int i21 = i20;
                    r05.mo3387(new C1976(r05, str9, i21, nlVar6, null, new C1655(r05, new C0652pd[]{r2}), runnable9, runnable7));
                    return;
                }
                C1428 r114 = f6144;
                String str10 = r15.f4480;
                int i22 = r15.f4441;
                C0585nl nlVar7 = C0585nl.LOGIN;
                String str11 = str2;
                Runnable runnable10 = f6153;
                C0652pd[] pdVarArr5 = {new C1860(str, str11, r15.f4442, r15.f4518)};
                C1428 r06 = r114;
                int i23 = i22;
                Runnable runnable11 = runnable10;
                int i24 = i23;
                r06.mo3387(new C1976(r06, str10, i24, nlVar7, null, new C1655(r06, pdVarArr5), runnable11, f6153));
                return;
        }
    }

    /* renamed from: 鷭 */
    static void m1844(C1015if ifVar) {
        f6159 = ifVar;
        f6156 = "Failed to connect to char-server";
        if (f6144.f7007 != null) {
            f6144.f7007.f7022 = null;
        }
        C1428 r0 = f6144;
        String str = f6140.f4460 ? f6140.f4480 : ifVar.f6172;
        int i = ifVar.f6171;
        C0585nl nlVar = C0585nl.CHAR;
        C1428 r02 = r0;
        Runnable runnable = f6153;
        C0652pd[] pdVarArr = {new C1626(f6161.f6162, f6161.f6164.f6177, f6161.f6164.f6176, f6161.f6163)};
        Runnable runnable2 = f6153;
        Runnable runnable3 = runnable;
        r02.mo3387(new C1976(r02, str, i, nlVar, null, new C1655(r02, pdVarArr), runnable3, runnable2));
    }

    /* JADX WARNING: type inference failed for: r16v0 */
    /* JADX WARNING: type inference failed for: r0v7, types: [o.pd[]] */
    /* JADX WARNING: type inference failed for: r16v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: Ć */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m1825() {
        /*
            o.mr r10 = p004o.C0595nv.f2879
            o.mr r0 = p004o.C0564mr.MOTR
            if (r10 == r0) goto L_0x000c
            o.mr r0 = p004o.C0564mr.all
            if (r10 == r0) goto L_0x000c
            r0 = 0
            goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            if (r0 == 0) goto L_0x0021
            o.pc$鷭 r0 = f6140
            o.pc$aux r0 = r0.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.MOTR
            if (r0 == r1) goto L_0x001f
            o.pc$鷭 r0 = f6140
            o.pc$aux r0 = r0.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.MOTR_home
            if (r0 != r1) goto L_0x0021
        L_0x001f:
            r10 = 1
            goto L_0x0022
        L_0x0021:
            r10 = 0
        L_0x0022:
            java.lang.String r0 = "Failed to connect to map-server"
            f6156 = r0
            o.㯲 r0 = f6144
            o.㯲$鷭 r0 = r0.f7007
            if (r0 == 0) goto L_0x0033
            o.㯲 r0 = f6144
            o.㯲$鷭 r0 = r0.f7007
            r1 = 0
            r0.f7022 = r1
        L_0x0033:
            o.㯲 r0 = f6144
            o.pc$鷭 r1 = f6140
            boolean r1 = r1.f4460
            if (r1 == 0) goto L_0x0040
            o.pc$鷭 r1 = f6140
            java.lang.String r11 = r1.f4480
            goto L_0x0046
        L_0x0040:
            o.Ą r1 = f6161
            o.Ą$ˮ͈ r1 = r1.f6166
            java.lang.String r11 = r1.f6180
        L_0x0046:
            o.Ą r1 = f6161
            o.Ą$ˮ͈ r1 = r1.f6166
            short r1 = r1.f6179
            int r12 = p004o.C0622ot.m731(r1)
            o.nl r13 = p004o.C0585nl.MAP
            java.lang.Runnable r14 = f6153
            java.lang.Runnable r15 = f6153
            if (r10 == 0) goto L_0x0061
            o.ঽ্ r16 = new o.ঽ্
            r1 = r16
            r1.<init>()
            goto L_0x00c0
        L_0x0061:
            o.Ą r1 = f6161
            int r1 = r1.f6162
            o.Ą r2 = f6161
            int r3 = r2.f6169
            o.Ą r2 = f6161
            o.Ą$ȃ r2 = r2.f6164
            int r4 = r2.f6177
            o.Ą r2 = f6161
            o.nz r2 = r2.f6165
            byte r5 = r2.f2901
            goto L_0x007c
        L_0x0076:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            throw r0
        L_0x007c:
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0076 }
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)     // Catch:{ all -> 0x0076 }
            r6 = 3
            r2[r6] = r5     // Catch:{ all -> 0x0076 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0076 }
            r5 = 2
            r2[r5] = r4     // Catch:{ all -> 0x0076 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0076 }
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x0076 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0076 }
            r3 = 0
            r2[r3] = r1     // Catch:{ all -> 0x0076 }
            java.lang.String r1 = "o.Ŀ"
            java.lang.Class r1 = p004o.$cON.m1858(r1)     // Catch:{ all -> 0x0076 }
            r3 = 4
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ all -> 0x0076 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0076 }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x0076 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0076 }
            r5 = 1
            r3[r5] = r4     // Catch:{ all -> 0x0076 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0076 }
            r5 = 2
            r3[r5] = r4     // Catch:{ all -> 0x0076 }
            java.lang.Class r4 = java.lang.Byte.TYPE     // Catch:{ all -> 0x0076 }
            r5 = 3
            r3[r5] = r4     // Catch:{ all -> 0x0076 }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r3)     // Catch:{ all -> 0x0076 }
            java.lang.Object r16 = r1.newInstance(r2)     // Catch:{ all -> 0x0076 }
        L_0x00c0:
            r10 = r0
            r0 = 1
            o.pd[] r0 = new p004o.C0652pd[r0]
            r1 = 0
            r0[r1] = r16
            r16 = r0
            r0 = r10
            r1 = r14
            r14 = r16
            r16 = r15
            r15 = r1
            r10 = r0
            o.欘 r1 = new o.欘
            r1.<init>(r10, r14)
            r14 = r16
            r16 = r15
            r15 = r1
            r10 = r0
            o.뼠 r1 = new o.뼠
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r15
            r8 = r16
            r9 = r14
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.mo3387(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1014.m1825():void");
    }

    /* renamed from: ć */
    static void m1826() {
        f6142 = new C0534lq();
        f6137 = new C0521lf();
    }

    /* renamed from: ˮ͍ */
    static boolean m1831() {
        return f6137.f1636 != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 岱 */
    public final synchronized void mo4255() {
        for (int i = 0; i < f6137.f1637.size(); i++) {
            C0520le leVar = (C0520le) f6137.f1637.valueAt(i);
            if (leVar != null) {
                f6142.f1680.mo3790(leVar.f1630);
            }
        }
        f6147.f51.f1432.mo3538();
        if (f6147.f51.f1373.f1466 != null) {
            f6147.f51.f1373.f1466.dismiss();
        }
        if (f6147.f51.f1409.f1471 != null) {
            f6147.f51.f1409.f1471.dismiss();
        }
        if (f6137.f1636 != null) {
            f6137.f1636.mo4574(false);
        }
        if (f6142.f1680.f1195 != null) {
            C0543ly lyVar = f6142.f1680.f1195;
            C0561mo moVar = C0561mo.STAND;
            lyVar.mo4634(((C1720) lyVar.f8954).mo4468(moVar, lyVar.f1776), System.currentTimeMillis());
            lyVar.f1772 = moVar;
            lyVar.mo3991();
        }
        f6142.f1680.f1189.clear();
        f6142.f1680.f1195 = null;
        f6137.f1637.clear();
        f6137.f1636 = null;
    }

    /* renamed from: 鷭 */
    static void m1841(C0520le leVar) {
        int i = leVar.f1630;
        C0521lf lfVar = f6137;
        if (lfVar.f1636 == null || i != lfVar.f1636.f1630) {
            lfVar.f1637.remove(i);
            f6142.f1680.mo3790(i);
            C0520le leVar2 = leVar;
            f6137.f1637.put(leVar2.f1630, leVar2);
            C0520le leVar3 = leVar;
            C0412hn hnVar = f6142.f1680;
            C0548mb r3 = C0548mb.m645(leVar3);
            hnVar.f1189.put(Integer.valueOf(leVar3.f1630), r3);
            if (f6142.f1693 == null) {
                f6142.mo3981(r3, false);
                return;
            }
            return;
        }
        String str = "Cannot process request to delete self";
        Log.e("AndRO", str);
        throw new C0588no(str);
    }

    /* renamed from: 鷭 */
    static void m1839(int i) {
        C0521lf lfVar = f6137;
        if (lfVar.f1636 == null || i != lfVar.f1636.f1630) {
            lfVar.f1637.remove(i);
            f6142.f1680.mo3790(i);
            return;
        }
        String str = "Cannot process request to delete self";
        Log.e("AndRO", str);
        throw new C0588no(str);
    }

    /* renamed from: 櫯 */
    static boolean m1834(String str) {
        C0569mw[] values;
        int i;
        String[] split = str.split(" ", 2);
        if (split == null) {
            return false;
        }
        String str2 = split[0];
        if (!str2.startsWith("/")) {
            return false;
        }
        String substring = str2.substring(1);
        if (substring.equals("where")) {
            f6147.f51.f1427.mo4490(new StringBuilder(String.valueOf(f6142.f1695.f7353)).append(" ,").append(f6137.f1636.f1634).append(", ").append(f6137.f1636.f1631).toString(), 16776960);
            return true;
        }
        if (substring.equals("noshift") || substring.equals("ns")) {
            C0595nv.f2872 = !C0595nv.f2872;
            f6160.mo3805("noshift_enemy", 0, String.valueOf(C0595nv.f2872));
            C1746 r0 = f6147.f51.f1427;
            int i2 = C0595nv.f2872 ? 702 : 703;
            String r6 = f6160.mo3796(i2);
            r0.mo4490(r6 == null ? "MSG" + i2 : r6, 16776960);
        } else if (substring.equals("monsterhp")) {
            if (!C0595nv.f2861) {
                C1746 r02 = f6147.f51.f1427;
                String r62 = f6160.mo3796(2181);
                r02.mo4490(r62 == null ? "MSG2181" : r62, 16776960);
            } else {
                C1746 r03 = f6147.f51.f1427;
                String r63 = f6160.mo3796(2182);
                r03.mo4490(r63 == null ? "MSG2182" : r63, 16776960);
            }
            C0595nv.f2861 = !C0595nv.f2861;
            f6160.mo3792();
            return true;
        } else if (substring.equals("memo")) {
            f6144.mo3652((C0839ue) new C1636());
            return true;
        } else if (substring.equals("fastskup")) {
            C0595nv.f2880 = !C0595nv.f2880;
            f6147.f51.f1427.mo4490("Fast skill leveling is now " + C0595nv.f2880, 16776960);
            return true;
        } else if (substring.equals("taekwon")) {
            if (f6140.f4463) {
                f6144.mo3652((C0839ue) new C1776(C0584nk.TAEKWON));
            } else {
                f6144.mo3652((C0839ue) new C1532());
            }
            return true;
        } else if (substring.equals("alchemist")) {
            if (f6140.f4463) {
                f6144.mo3652((C0839ue) new C1776(C0584nk.ALCHEMIST));
            } else {
                f6144.mo3652((C0839ue) new C1725());
            }
            return true;
        } else if (substring.equals("blacksmith")) {
            if (f6140.f4463) {
                f6144.mo3652((C0839ue) new C1776(C0584nk.BLACKSMITH));
            } else {
                f6144.mo3652((C0839ue) new C1568());
            }
            return true;
        } else if (substring.startsWith("e")) {
            try {
                i = Integer.parseInt(substring.substring(1));
            } catch (NumberFormatException unused) {
                i = -1;
            }
            if (i < 0 || i >= C0569mw.values().length) {
                Toast.makeText(f6147, "No such emotion", 1).show();
                return true;
            }
            f6144.mo3652((C0839ue) new C1775(C0569mw.values()[i]));
            return true;
        } else if (substring.equals("hoai")) {
            C0595nv.f2877 = !C0595nv.f2877;
            f6147.f51.f1427.mo4490("User AI " + (C0595nv.f2877 ? "ON" : "OFF"), 16776960);
            return true;
        }
        for (C0569mw mwVar : C0569mw.values()) {
            if (substring.equals(mwVar.name())) {
                f6144.mo3652((C0839ue) new C1775(mwVar));
                return true;
            }
        }
        Toast.makeText(f6147, "Invalid command", 0).show();
        return true;
    }

    /* renamed from: Ȋ */
    static void m1829() {
        f6142.mo3979();
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 480 */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0153, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.MobiRO) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x015f, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.PlayLokiServerCom) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x016b, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.FreeRoWeb) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0177, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.OldchaosROCom) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0183, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.ROProviderValkyrie) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x018f, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.LidiaRO) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x019b, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.Gugusjungs57572) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01a7, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.RagnarevivalCom) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01b3, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.RebirthRO_Ancyker) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01bf, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.BarnabyRO) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01cb, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.Ragnaclan) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x01d7, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.ThaiRoInTh) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.iRO_Renewal) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x01e3, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.NoviceRO) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x01ef, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.LeonardRO) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x01fb, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.IfritRagnarokCom) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0207, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.AmatsuRO) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0213, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.FreePlayRoCom) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x021f, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.RoHeimdallCom) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x022b, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.Thai_id9169) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0237, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.PlayvalhallaPh) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0243, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.Classic2RoInTh) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x024f, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.Daro) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x025b, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.iPlayRo201804) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0267, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.AustinRO) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0273, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.BrightRO) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x027f, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.TitanRO) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x028b, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.RoFaction) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.XileROOS) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0297, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.WeloveRo) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x02a3, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.KafraRO) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x02af, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.ChaosReborn) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x02bb, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.RagnarokReturnPh) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x02c7, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.GachoRO) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x02d3, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.RoRetro) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x02df, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.LibRO) goto L_0x02e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x02eb, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.SecretRO) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x02f7, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.NorseRO) goto L_0x02f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0303, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.Trinity_Reborn_Full) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.AevaRO) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x030f, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.AlbertaServer) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x031b, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.hiclassro) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0327, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.OldschoolragnarokCom) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0333, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.Ragnarevo) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x033f, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.CrazyPoring) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x034b, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.LucianoRO) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0357, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.GarciaRO) goto L_0x0359;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0363, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.Blytanias) goto L_0x0365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x036f, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.PinoyRO) goto L_0x0371;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x037b, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.OMGRO) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.AtlasRO) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0387, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.RagnarokPuzzle) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0393, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.Modify_Full) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x039f, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.Newyear) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x03ab, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.GRANDRO) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x03b7, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.SakrayPh) goto L_0x03b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x03c3, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.MyRebornRO) goto L_0x03c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x03cf, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.XileRO2019) goto L_0x03d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x03db, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.eSport2019) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x03e7, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.PhoenixRO2) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x03f3, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.OcrClassicCom) goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0081, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.FreeRO) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x03ff, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.RoFreedom) goto L_0x0401;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x040b, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.C2RO) goto L_0x040d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0417, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.RelaxRO) goto L_0x0419;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0423, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.BgRO) goto L_0x0425;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x042f, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.ROClashed) goto L_0x0431;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0441, code lost:
        if (r7.f4443 == p004o.C0595nv.f2876.f440) goto L_0x0443;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008d, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.MyRO) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0099, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.ChenRO) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a5, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.WeDevGames) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b1, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.TheClassicROCom) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bd, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.ClassicRONet) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c9, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.OldSchoolRO) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00db, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.CreativeKingsRO) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e7, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.PlayragnarokPh) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00f3, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.SarahServer) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00ff, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.SuccessRoNet) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x010b, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.CrownRO) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0117, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.Eden3) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0123, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.Class2RO) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x012f, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.ShinServer) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x013b, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.EosRagnarokOnline) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0147, code lost:
        if (r7.f4443 == p004o.C0643pc.aux.TyrServer) goto L_0x0149;
     */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4256(boolean r10) {
        /*
            r9 = this;
            o.hp r0 = f6160
            java.lang.String r1 = "server_name"
            r2 = 0
            java.lang.String r3 = r0.mo3802(r1, r2)
            if (r3 != 0) goto L_0x000d
            r0 = 0
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            r3 = r0
            o.pc r5 = new o.pc
            byte[] r0 = r9.f6167
            r5.<init>(r0)
            r4 = r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList<o.pc$鷭> r0 = r5.f4299
            java.util.Iterator r8 = r0.iterator()
            goto L_0x0446
        L_0x0024:
            java.lang.Object r0 = r8.next()
            o.pc$鷭 r0 = (p004o.C0643pc.C0650) r0
            r7 = r0
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.MOTR
            if (r0 != r1) goto L_0x003b
            java.lang.String r0 = r7.f4522
            java.lang.String r1 = "MOTR"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0446
        L_0x003b:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.iRO_hockeyapp
            if (r0 == r1) goto L_0x0047
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.iRO_googleplay
            if (r0 != r1) goto L_0x004d
        L_0x0047:
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.iRO_Renewal
            if (r0 != r1) goto L_0x0446
        L_0x004d:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.XileRO
            if (r0 != r1) goto L_0x005f
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.XileRO
            if (r0 == r1) goto L_0x005f
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.XileROOS
            if (r0 != r1) goto L_0x0446
        L_0x005f:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.AevaRO
            if (r0 != r1) goto L_0x006b
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.AevaRO
            if (r0 != r1) goto L_0x0446
        L_0x006b:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.AtlasRO
            if (r0 != r1) goto L_0x0077
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.AtlasRO
            if (r0 != r1) goto L_0x0446
        L_0x0077:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.FreeRO
            if (r0 != r1) goto L_0x0083
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.FreeRO
            if (r0 != r1) goto L_0x0446
        L_0x0083:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.MyRO
            if (r0 != r1) goto L_0x008f
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.MyRO
            if (r0 != r1) goto L_0x0446
        L_0x008f:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.ChenRO
            if (r0 != r1) goto L_0x009b
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.ChenRO
            if (r0 != r1) goto L_0x0446
        L_0x009b:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.WeDevGames
            if (r0 != r1) goto L_0x00a7
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.WeDevGames
            if (r0 != r1) goto L_0x0446
        L_0x00a7:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.TheClassicROCom
            if (r0 != r1) goto L_0x00b3
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.TheClassicROCom
            if (r0 != r1) goto L_0x0446
        L_0x00b3:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.ClassicRONet
            if (r0 != r1) goto L_0x00bf
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.ClassicRONet
            if (r0 != r1) goto L_0x0446
        L_0x00bf:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.OldSchoolRO
            if (r0 != r1) goto L_0x00cb
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.OldSchoolRO
            if (r0 != r1) goto L_0x0446
        L_0x00cb:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.InfamyRO
            if (r0 != r1) goto L_0x00dd
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.InfamyRO
            if (r0 == r1) goto L_0x00dd
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.CreativeKingsRO
            if (r0 != r1) goto L_0x0446
        L_0x00dd:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.PlayragnarokPh
            if (r0 != r1) goto L_0x00e9
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.PlayragnarokPh
            if (r0 != r1) goto L_0x0446
        L_0x00e9:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.SarahServer
            if (r0 != r1) goto L_0x00f5
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.SarahServer
            if (r0 != r1) goto L_0x0446
        L_0x00f5:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.SuccessRoNet
            if (r0 != r1) goto L_0x0101
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.SuccessRoNet
            if (r0 != r1) goto L_0x0446
        L_0x0101:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.CrownRO
            if (r0 != r1) goto L_0x010d
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.CrownRO
            if (r0 != r1) goto L_0x0446
        L_0x010d:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.Eden3
            if (r0 != r1) goto L_0x0119
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.Eden3
            if (r0 != r1) goto L_0x0446
        L_0x0119:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.Class2RO
            if (r0 != r1) goto L_0x0125
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.Class2RO
            if (r0 != r1) goto L_0x0446
        L_0x0125:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.ShinServer
            if (r0 != r1) goto L_0x0131
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.ShinServer
            if (r0 != r1) goto L_0x0446
        L_0x0131:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.EosRagnarokOnline
            if (r0 != r1) goto L_0x013d
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.EosRagnarokOnline
            if (r0 != r1) goto L_0x0446
        L_0x013d:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.TyrServer
            if (r0 != r1) goto L_0x0149
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.TyrServer
            if (r0 != r1) goto L_0x0446
        L_0x0149:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.MobiRO
            if (r0 != r1) goto L_0x0155
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.MobiRO
            if (r0 != r1) goto L_0x0446
        L_0x0155:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.PlayLokiServerCom
            if (r0 != r1) goto L_0x0161
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.PlayLokiServerCom
            if (r0 != r1) goto L_0x0446
        L_0x0161:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.FreeRoWeb
            if (r0 != r1) goto L_0x016d
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.FreeRoWeb
            if (r0 != r1) goto L_0x0446
        L_0x016d:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.OldchaosROCom
            if (r0 != r1) goto L_0x0179
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.OldchaosROCom
            if (r0 != r1) goto L_0x0446
        L_0x0179:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.ROProviderValkyrie
            if (r0 != r1) goto L_0x0185
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.ROProviderValkyrie
            if (r0 != r1) goto L_0x0446
        L_0x0185:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.LidiaRO
            if (r0 != r1) goto L_0x0191
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.LidiaRO
            if (r0 != r1) goto L_0x0446
        L_0x0191:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.Gugusjungs57572
            if (r0 != r1) goto L_0x019d
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.Gugusjungs57572
            if (r0 != r1) goto L_0x0446
        L_0x019d:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.RagnarevivalCom
            if (r0 != r1) goto L_0x01a9
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.RagnarevivalCom
            if (r0 != r1) goto L_0x0446
        L_0x01a9:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.RebirthRO_Ancyker
            if (r0 != r1) goto L_0x01b5
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.RebirthRO_Ancyker
            if (r0 != r1) goto L_0x0446
        L_0x01b5:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.BarnabyRO
            if (r0 != r1) goto L_0x01c1
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.BarnabyRO
            if (r0 != r1) goto L_0x0446
        L_0x01c1:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.Ragnaclan
            if (r0 != r1) goto L_0x01cd
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.Ragnaclan
            if (r0 != r1) goto L_0x0446
        L_0x01cd:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.ThaiRoInTh
            if (r0 != r1) goto L_0x01d9
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.ThaiRoInTh
            if (r0 != r1) goto L_0x0446
        L_0x01d9:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.NoviceRO
            if (r0 != r1) goto L_0x01e5
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.NoviceRO
            if (r0 != r1) goto L_0x0446
        L_0x01e5:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.LeonardRO
            if (r0 != r1) goto L_0x01f1
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.LeonardRO
            if (r0 != r1) goto L_0x0446
        L_0x01f1:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.IfritRagnarokCom
            if (r0 != r1) goto L_0x01fd
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.IfritRagnarokCom
            if (r0 != r1) goto L_0x0446
        L_0x01fd:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.AmatsuRO
            if (r0 != r1) goto L_0x0209
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.AmatsuRO
            if (r0 != r1) goto L_0x0446
        L_0x0209:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.FreePlayRoCom
            if (r0 != r1) goto L_0x0215
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.FreePlayRoCom
            if (r0 != r1) goto L_0x0446
        L_0x0215:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.RoHeimdallCom
            if (r0 != r1) goto L_0x0221
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.RoHeimdallCom
            if (r0 != r1) goto L_0x0446
        L_0x0221:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.Thai_id9169
            if (r0 != r1) goto L_0x022d
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.Thai_id9169
            if (r0 != r1) goto L_0x0446
        L_0x022d:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.PlayvalhallaPh
            if (r0 != r1) goto L_0x0239
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.PlayvalhallaPh
            if (r0 != r1) goto L_0x0446
        L_0x0239:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.Classic2RoInTh
            if (r0 != r1) goto L_0x0245
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.Classic2RoInTh
            if (r0 != r1) goto L_0x0446
        L_0x0245:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.Daro
            if (r0 != r1) goto L_0x0251
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.Daro
            if (r0 != r1) goto L_0x0446
        L_0x0251:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.iPlayRo201804
            if (r0 != r1) goto L_0x025d
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.iPlayRo201804
            if (r0 != r1) goto L_0x0446
        L_0x025d:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.AustinRO
            if (r0 != r1) goto L_0x0269
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.AustinRO
            if (r0 != r1) goto L_0x0446
        L_0x0269:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.BrightRO
            if (r0 != r1) goto L_0x0275
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.BrightRO
            if (r0 != r1) goto L_0x0446
        L_0x0275:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.TitanRO
            if (r0 != r1) goto L_0x0281
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.TitanRO
            if (r0 != r1) goto L_0x0446
        L_0x0281:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.RoFaction
            if (r0 != r1) goto L_0x028d
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.RoFaction
            if (r0 != r1) goto L_0x0446
        L_0x028d:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.WeloveRo
            if (r0 != r1) goto L_0x0299
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.WeloveRo
            if (r0 != r1) goto L_0x0446
        L_0x0299:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.KafraRO
            if (r0 != r1) goto L_0x02a5
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.KafraRO
            if (r0 != r1) goto L_0x0446
        L_0x02a5:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.ChaosReborn
            if (r0 != r1) goto L_0x02b1
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.ChaosReborn
            if (r0 != r1) goto L_0x0446
        L_0x02b1:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.RagnarokReturnPh
            if (r0 != r1) goto L_0x02bd
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.RagnarokReturnPh
            if (r0 != r1) goto L_0x0446
        L_0x02bd:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.GachoRO
            if (r0 != r1) goto L_0x02c9
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.GachoRO
            if (r0 != r1) goto L_0x0446
        L_0x02c9:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.RoRetro
            if (r0 != r1) goto L_0x02d5
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.RoRetro
            if (r0 != r1) goto L_0x0446
        L_0x02d5:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.LibRO
            if (r0 != r1) goto L_0x02e1
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.LibRO
            if (r0 != r1) goto L_0x0446
        L_0x02e1:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.SecretRO
            if (r0 != r1) goto L_0x02ed
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.SecretRO
            if (r0 != r1) goto L_0x0446
        L_0x02ed:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.NorseRO
            if (r0 != r1) goto L_0x02f9
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.NorseRO
            if (r0 != r1) goto L_0x0446
        L_0x02f9:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.Trinity_Reborn_Full
            if (r0 != r1) goto L_0x0305
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.Trinity_Reborn_Full
            if (r0 != r1) goto L_0x0446
        L_0x0305:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.AlbertaServer
            if (r0 != r1) goto L_0x0311
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.AlbertaServer
            if (r0 != r1) goto L_0x0446
        L_0x0311:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.hiclassro
            if (r0 != r1) goto L_0x031d
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.hiclassro
            if (r0 != r1) goto L_0x0446
        L_0x031d:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.OldschoolragnarokCom
            if (r0 != r1) goto L_0x0329
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.OldschoolragnarokCom
            if (r0 != r1) goto L_0x0446
        L_0x0329:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.Ragnarevo
            if (r0 != r1) goto L_0x0335
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.Ragnarevo
            if (r0 != r1) goto L_0x0446
        L_0x0335:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.CrazyPoring
            if (r0 != r1) goto L_0x0341
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.CrazyPoring
            if (r0 != r1) goto L_0x0446
        L_0x0341:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.LucianoRO
            if (r0 != r1) goto L_0x034d
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.LucianoRO
            if (r0 != r1) goto L_0x0446
        L_0x034d:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.GarciaRO
            if (r0 != r1) goto L_0x0359
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.GarciaRO
            if (r0 != r1) goto L_0x0446
        L_0x0359:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.Blytanias
            if (r0 != r1) goto L_0x0365
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.Blytanias
            if (r0 != r1) goto L_0x0446
        L_0x0365:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.PinoyRO
            if (r0 != r1) goto L_0x0371
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.PinoyRO
            if (r0 != r1) goto L_0x0446
        L_0x0371:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.OMGRO
            if (r0 != r1) goto L_0x037d
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.OMGRO
            if (r0 != r1) goto L_0x0446
        L_0x037d:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.RagnarokPuzzle
            if (r0 != r1) goto L_0x0389
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.RagnarokPuzzle
            if (r0 != r1) goto L_0x0446
        L_0x0389:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.Modify_Full
            if (r0 != r1) goto L_0x0395
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.Modify_Full
            if (r0 != r1) goto L_0x0446
        L_0x0395:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.Newyear
            if (r0 != r1) goto L_0x03a1
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.Newyear
            if (r0 != r1) goto L_0x0446
        L_0x03a1:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.GRANDRO
            if (r0 != r1) goto L_0x03ad
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.GRANDRO
            if (r0 != r1) goto L_0x0446
        L_0x03ad:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.SakrayPh
            if (r0 != r1) goto L_0x03b9
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.SakrayPh
            if (r0 != r1) goto L_0x0446
        L_0x03b9:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.MyRebornRO
            if (r0 != r1) goto L_0x03c5
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.MyRebornRO
            if (r0 != r1) goto L_0x0446
        L_0x03c5:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.XileRO2019
            if (r0 != r1) goto L_0x03d1
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.XileRO2019
            if (r0 != r1) goto L_0x0446
        L_0x03d1:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.eSport2019
            if (r0 != r1) goto L_0x03dd
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.eSport2019
            if (r0 != r1) goto L_0x0446
        L_0x03dd:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.PhoenixRO2
            if (r0 != r1) goto L_0x03e9
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.PhoenixRO2
            if (r0 != r1) goto L_0x0446
        L_0x03e9:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.OcrClassicCom
            if (r0 != r1) goto L_0x03f5
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.OcrClassicCom
            if (r0 != r1) goto L_0x0446
        L_0x03f5:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.RoFreedom
            if (r0 != r1) goto L_0x0401
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.RoFreedom
            if (r0 != r1) goto L_0x0446
        L_0x0401:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.C2RO
            if (r0 != r1) goto L_0x040d
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.C2RO
            if (r0 != r1) goto L_0x0446
        L_0x040d:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.RelaxRO
            if (r0 != r1) goto L_0x0419
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.RelaxRO
            if (r0 != r1) goto L_0x0446
        L_0x0419:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.BgRO
            if (r0 != r1) goto L_0x0425
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.BgRO
            if (r0 != r1) goto L_0x0446
        L_0x0425:
            o.mr r0 = p004o.C0595nv.f2879
            o.mr r1 = p004o.C0564mr.ROClashed
            if (r0 != r1) goto L_0x0431
            o.pc$aux r0 = r7.f4443
            o.pc$aux r1 = p004o.C0643pc.aux.ROClashed
            if (r0 != r1) goto L_0x0446
        L_0x0431:
            o.ba r0 = p004o.C0595nv.f2876
            if (r0 == 0) goto L_0x0443
            o.ba r0 = p004o.C0595nv.f2876
            o.pc$aux r0 = r0.f440
            if (r0 == 0) goto L_0x0443
            o.pc$aux r0 = r7.f4443
            o.ba r1 = p004o.C0595nv.f2876
            o.pc$aux r1 = r1.f440
            if (r0 != r1) goto L_0x0446
        L_0x0443:
            r6.add(r7)
        L_0x0446:
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto L_0x0024
            r5.f4299 = r6
            r5 = -1
            java.util.ArrayList<o.pc$鷭> r0 = r4.f4299
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L_0x045a
            r5 = 0
            goto L_0x0480
        L_0x045a:
            r0 = 1
            r9.f6168 = r0
            java.util.ArrayList<o.pc$鷭> r0 = r4.f4299
            java.util.Iterator r7 = r0.iterator()
            goto L_0x047a
        L_0x0464:
            java.lang.Object r0 = r7.next()
            o.pc$鷭 r0 = (p004o.C0643pc.C0650) r0
            r6 = r0
            java.lang.String r0 = r6.f4522
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x047a
            java.util.ArrayList<o.pc$鷭> r0 = r4.f4299
            int r5 = r0.indexOf(r6)
            goto L_0x0480
        L_0x047a:
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L_0x0464
        L_0x0480:
            if (r10 == 0) goto L_0x0491
            r0 = -1
            if (r5 == r0) goto L_0x0491
            java.util.ArrayList<o.pc$鷭> r0 = r4.f4299
            java.lang.Object r0 = r0.get(r5)
            o.pc$鷭 r0 = (p004o.C0643pc.C0650) r0
            m1842(r0)
            return
        L_0x0491:
            java.util.ArrayList<o.pc$鷭> r0 = r4.f4299
            int r0 = r0.size()
            o.pc$鷭[] r6 = new p004o.C0643pc.C0650[r0]
            r7 = 0
            goto L_0x04a7
        L_0x049b:
            java.util.ArrayList<o.pc$鷭> r0 = r4.f4299
            java.lang.Object r0 = r0.get(r7)
            o.pc$鷭 r0 = (p004o.C0643pc.C0650) r0
            r6[r7] = r0
            int r7 = r7 + 1
        L_0x04a7:
            java.util.ArrayList<o.pc$鷭> r0 = r4.f4299
            int r0 = r0.size()
            if (r7 < r0) goto L_0x049b
            com.roworkshop.andro.c_activity r0 = f6147
            r1 = 2130903125(0x7f030055, float:1.741306E38)
            r0.setContentView(r1)
            com.roworkshop.andro.c_activity r0 = f6147
            o.ix r0 = r0.f51
            o.em r1 = new o.em
            com.roworkshop.andro.c_activity r2 = f6147
            r1.<init>(r2, r6)
            r0.f1430 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C1014.mo4256(boolean):void");
    }

    /* renamed from: ċ */
    static String m1827() {
        String[] split = C0622ot.m741(f6147.mo3388((int) R.raw.tips), C0618op.UTF8).split("\n");
        return split[(int) (Math.random() * ((double) split.length))];
    }

    /* renamed from: 鷭 */
    public static final String m1837(byte[] bArr) {
        byte[] bArr2 = {32, 58, 32};
        int i = 0;
        for (int i2 = 0; i2 < 2 && bArr[i] != 47; i2++) {
            int r5 = C0622ot.m733(bArr, i, bArr2);
            if (r5 == -1) {
                break;
            }
            i = r5 + bArr2.length;
        }
        String str = null;
        if (bArr[i] == 47) {
            int i3 = i;
            byte[] bArr3 = new byte[i];
            for (int i4 = 0; i4 < bArr3.length; i4++) {
                bArr3[i4] = bArr[i4];
            }
            byte[] bArr4 = new byte[((bArr.length - i3) - 1)];
            for (int i5 = i3 + 1; i5 < bArr.length; i5++) {
                bArr4[(i5 - i3) - 1] = bArr[i5];
            }
            return C0622ot.m741(bArr3, C0618op.LOCAL) + C0622ot.m741(bArr4, C0618op.UTF8);
        } else if (bArr[i] != 124 || f6140 == null || !f6140.f4494) {
            return C0622ot.m741(bArr, C0618op.LOCAL);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i + 1, i + 3);
            byte[] copyOfRange3 = Arrays.copyOfRange(bArr, i + 3, bArr.length);
            int parseInt = Integer.parseInt(new String(copyOfRange2), 16);
            String str2 = null;
            C1019[] r9 = f6157;
            int length = r9.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                C1019 r6 = r9[i6];
                if (r6.f6189 == parseInt) {
                    str2 = r6.f6188;
                    break;
                }
                i6++;
            }
            if (str2 != null) {
                try {
                    str = C0622ot.m741(copyOfRange, C0618op.LOCAL) + String.valueOf(Charset.forName(str2).newDecoder().decode(ByteBuffer.wrap(copyOfRange3)));
                } catch (IllegalCharsetNameException unused) {
                } catch (UnsupportedCharsetException unused2) {
                } catch (CharacterCodingException unused3) {
                }
            }
            if (str == null) {
                return C0622ot.m741(copyOfRange, C0618op.LOCAL) + C0622ot.m741(copyOfRange3, C0618op.LATIN);
            }
            return str;
        }
    }
}
