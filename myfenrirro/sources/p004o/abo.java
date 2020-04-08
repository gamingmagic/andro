package p004o;

import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: o.abo */
public final class abo {

    /* renamed from: 鷭 */
    public static final SimpleDateFormat f179 = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);

    /* renamed from: Ą */
    public Date f180;

    /* renamed from: ą */
    public String f181;

    /* renamed from: Ć */
    public String f182;

    /* renamed from: ć */
    public String f183;

    /* renamed from: ċ */
    public String f184;

    /* renamed from: ȃ */
    public Date f185;

    /* renamed from: Ȋ */
    public String f186;

    /* renamed from: ˮ͈ */
    public String f187;

    /* renamed from: ˮ͍ */
    public String f188;

    /* renamed from: 䒧 */
    public String f189;

    /* renamed from: 岱 */
    public String f190;

    /* renamed from: 櫯 */
    public final String f191;

    /* renamed from: 纫 */
    public String f192;

    static {
    }

    private abo(String str) {
        this.f191 = str;
    }

    public abo(String str, Throwable th) {
        this(str);
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        this.f189 = stringWriter.toString();
    }

    /* renamed from: 鷭 */
    public static void m81(BufferedWriter bufferedWriter, String str, String str2) {
        bufferedWriter.write(str + ": " + str2 + "\n");
    }
}
