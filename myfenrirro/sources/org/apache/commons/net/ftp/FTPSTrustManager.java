package org.apache.commons.net.ftp;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

@Deprecated
public class FTPSTrustManager implements X509TrustManager {
    private static final X509Certificate[] EMPTY_X509CERTIFICATE_ARRAY = new X509Certificate[0];

    static {
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        for (X509Certificate checkValidity : x509CertificateArr) {
            checkValidity.checkValidity();
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return EMPTY_X509CERTIFICATE_ARRAY;
    }
}
