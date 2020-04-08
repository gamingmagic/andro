package org.apache.commons.net.util;

import java.security.KeyStore;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public final class TrustManagerUtils {
    private static final X509TrustManager ACCEPT_ALL = new TrustManager(false);
    private static final X509TrustManager CHECK_SERVER_VALIDITY = new TrustManager(true);
    /* access modifiers changed from: private */
    public static final X509Certificate[] EMPTY_X509CERTIFICATE_ARRAY = new X509Certificate[0];

    static class TrustManager implements X509TrustManager {
        private final boolean checkServerValidity;

        TrustManager(boolean z) {
            this.checkServerValidity = z;
        }

        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            if (this.checkServerValidity) {
                for (X509Certificate checkValidity : x509CertificateArr) {
                    checkValidity.checkValidity();
                }
            }
        }

        public X509Certificate[] getAcceptedIssuers() {
            return TrustManagerUtils.EMPTY_X509CERTIFICATE_ARRAY;
        }
    }

    static {
    }

    public static X509TrustManager getAcceptAllTrustManager() {
        return ACCEPT_ALL;
    }

    public static X509TrustManager getValidateServerCertificateTrustManager() {
        return CHECK_SERVER_VALIDITY;
    }

    public static X509TrustManager getDefaultTrustManager(KeyStore keyStore) {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore);
        return (X509TrustManager) instance.getTrustManagers()[0];
    }
}
