package org.apache.http.conn.ssl;

import java.security.cert.X509Certificate;

public class TrustAllStrategy implements TrustStrategy {
    public static final TrustAllStrategy INSTANCE = new TrustAllStrategy();

    static {
    }

    public boolean isTrusted(X509Certificate[] x509CertificateArr, String str) {
        return true;
    }
}
