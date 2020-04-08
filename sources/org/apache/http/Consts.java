package org.apache.http;

import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;

public final class Consts {
    public static final Charset ASCII = Charset.forName("US-ASCII");

    /* renamed from: CR */
    public static final int f9003CR = 13;

    /* renamed from: HT */
    public static final int f9004HT = 9;
    public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    /* renamed from: LF */
    public static final int f9005LF = 10;

    /* renamed from: SP */
    public static final int f9006SP = 32;
    public static final Charset UTF_8 = Charset.forName(HTTP.UTF_8);

    static {
    }

    private Consts() {
    }
}
