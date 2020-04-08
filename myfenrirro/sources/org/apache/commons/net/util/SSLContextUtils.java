package org.apache.commons.net.util;

import java.io.IOException;
import java.security.GeneralSecurityException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

public class SSLContextUtils {
    private SSLContextUtils() {
    }

    public static SSLContext createSSLContext(String str, KeyManager keyManager, TrustManager trustManager) {
        return createSSLContext(str, keyManager == null ? null : new KeyManager[]{keyManager}, trustManager == null ? null : new TrustManager[]{trustManager});
    }

    public static SSLContext createSSLContext(String str, KeyManager[] keyManagerArr, TrustManager[] trustManagerArr) {
        try {
            SSLContext instance = SSLContext.getInstance(str);
            instance.init(keyManagerArr, trustManagerArr, null);
            return instance;
        } catch (GeneralSecurityException e) {
            IOException iOException = new IOException("Could not initialize SSL context");
            iOException.initCause(e);
            throw iOException;
        }
    }
}
