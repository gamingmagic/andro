package org.apache.http.conn.ssl;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
public class BrowserCompatHostnameVerifier extends AbstractVerifier {
    public static final BrowserCompatHostnameVerifier INSTANCE = new BrowserCompatHostnameVerifier();

    static {
    }

    public final void verify(String str, String[] strArr, String[] strArr2) {
        verify(str, strArr, strArr2, false);
    }

    public final String toString() {
        return "BROWSER_COMPATIBLE";
    }
}
