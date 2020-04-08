package org.apache.commons.net.util;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.Socket;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import javax.net.ssl.KeyManager;
import javax.net.ssl.X509ExtendedKeyManager;
import org.apache.commons.net.p005io.Util;

public final class KeyManagerUtils {
    private static final String DEFAULT_STORE_TYPE = KeyStore.getDefaultType();

    static class ClientKeyStore {
        private final X509Certificate[] certChain;
        private final PrivateKey key;
        private final String keyAlias;

        ClientKeyStore(KeyStore keyStore, String str, String str2) {
            this.keyAlias = str;
            this.key = (PrivateKey) keyStore.getKey(this.keyAlias, str2.toCharArray());
            Certificate[] certificateChain = keyStore.getCertificateChain(this.keyAlias);
            X509Certificate[] x509CertificateArr = new X509Certificate[certificateChain.length];
            for (int i = 0; i < certificateChain.length; i++) {
                x509CertificateArr[i] = (X509Certificate) certificateChain[i];
            }
            this.certChain = x509CertificateArr;
        }

        /* access modifiers changed from: 0000 */
        public final X509Certificate[] getCertificateChain() {
            return this.certChain;
        }

        /* access modifiers changed from: 0000 */
        public final PrivateKey getPrivateKey() {
            return this.key;
        }

        /* access modifiers changed from: 0000 */
        public final String getAlias() {
            return this.keyAlias;
        }
    }

    static class X509KeyManager extends X509ExtendedKeyManager {
        private final ClientKeyStore keyStore;

        X509KeyManager(ClientKeyStore clientKeyStore) {
            this.keyStore = clientKeyStore;
        }

        public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
            return this.keyStore.getAlias();
        }

        public X509Certificate[] getCertificateChain(String str) {
            return this.keyStore.getCertificateChain();
        }

        public String[] getClientAliases(String str, Principal[] principalArr) {
            return new String[]{this.keyStore.getAlias()};
        }

        public PrivateKey getPrivateKey(String str) {
            return this.keyStore.getPrivateKey();
        }

        public String[] getServerAliases(String str, Principal[] principalArr) {
            return null;
        }

        public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
            return null;
        }
    }

    static {
    }

    private KeyManagerUtils() {
    }

    public static KeyManager createClientKeyManager(KeyStore keyStore, String str, String str2) {
        return new X509KeyManager(new ClientKeyStore(keyStore, str != null ? str : findAlias(keyStore), str2));
    }

    public static KeyManager createClientKeyManager(String str, File file, String str2, String str3, String str4) {
        return createClientKeyManager(loadStore(str, file, str2), str3, str4);
    }

    public static KeyManager createClientKeyManager(File file, String str, String str2) {
        return createClientKeyManager(DEFAULT_STORE_TYPE, file, str, str2, str);
    }

    public static KeyManager createClientKeyManager(File file, String str) {
        return createClientKeyManager(DEFAULT_STORE_TYPE, file, str, null, str);
    }

    private static KeyStore loadStore(String str, File file, String str2) {
        KeyStore instance = KeyStore.getInstance(str);
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            instance.load(inputStream, str2.toCharArray());
            return instance;
        } finally {
            Util.closeQuietly((Closeable) inputStream);
        }
    }

    private static String findAlias(KeyStore keyStore) {
        Enumeration aliases = keyStore.aliases();
        while (aliases.hasMoreElements()) {
            String str = (String) aliases.nextElement();
            if (keyStore.isKeyEntry(str)) {
                return str;
            }
        }
        throw new KeyStoreException("Cannot find a private key entry");
    }
}
