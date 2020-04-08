package org.apache.http.conn.ssl;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.util.PublicSuffixMatcherLoader;
import org.apache.http.protocol.HttpContext;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

@Contract(threading = ThreadingBehavior.SAFE)
public class SSLConnectionSocketFactory implements LayeredConnectionSocketFactory {
    @Deprecated
    public static final X509HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER = AllowAllHostnameVerifier.INSTANCE;
    @Deprecated
    public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = BrowserCompatHostnameVerifier.INSTANCE;
    public static final String SSL = "SSL";
    public static final String SSLV2 = "SSLv2";
    @Deprecated
    public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER = StrictHostnameVerifier.INSTANCE;
    public static final String TLS = "TLS";
    private final HostnameVerifier hostnameVerifier;
    private final Log log;
    private final SSLSocketFactory socketfactory;
    private final String[] supportedCipherSuites;
    private final String[] supportedProtocols;

    static {
    }

    public static HostnameVerifier getDefaultHostnameVerifier() {
        return new DefaultHostnameVerifier(PublicSuffixMatcherLoader.getDefault());
    }

    public static SSLConnectionSocketFactory getSocketFactory() {
        return new SSLConnectionSocketFactory(SSLContexts.createDefault(), getDefaultHostnameVerifier());
    }

    private static String[] split(String str) {
        if (TextUtils.isBlank(str)) {
            return null;
        }
        return str.split(" *, *");
    }

    public static SSLConnectionSocketFactory getSystemSocketFactory() {
        return new SSLConnectionSocketFactory((SSLSocketFactory) SSLSocketFactory.getDefault(), split(System.getProperty("https.protocols")), split(System.getProperty("https.cipherSuites")), getDefaultHostnameVerifier());
    }

    public SSLConnectionSocketFactory(SSLContext sSLContext) {
        this(sSLContext, getDefaultHostnameVerifier());
    }

    @Deprecated
    public SSLConnectionSocketFactory(SSLContext sSLContext, X509HostnameVerifier x509HostnameVerifier) {
        this(((SSLContext) Args.notNull(sSLContext, "SSL context")).getSocketFactory(), (String[]) null, (String[]) null, x509HostnameVerifier);
    }

    @Deprecated
    public SSLConnectionSocketFactory(SSLContext sSLContext, String[] strArr, String[] strArr2, X509HostnameVerifier x509HostnameVerifier) {
        this(((SSLContext) Args.notNull(sSLContext, "SSL context")).getSocketFactory(), strArr, strArr2, x509HostnameVerifier);
    }

    @Deprecated
    public SSLConnectionSocketFactory(SSLSocketFactory sSLSocketFactory, X509HostnameVerifier x509HostnameVerifier) {
        this(sSLSocketFactory, (String[]) null, (String[]) null, x509HostnameVerifier);
    }

    @Deprecated
    public SSLConnectionSocketFactory(SSLSocketFactory sSLSocketFactory, String[] strArr, String[] strArr2, X509HostnameVerifier x509HostnameVerifier) {
        this(sSLSocketFactory, strArr, strArr2, (HostnameVerifier) x509HostnameVerifier);
    }

    public SSLConnectionSocketFactory(SSLContext sSLContext, HostnameVerifier hostnameVerifier2) {
        this(((SSLContext) Args.notNull(sSLContext, "SSL context")).getSocketFactory(), (String[]) null, (String[]) null, hostnameVerifier2);
    }

    public SSLConnectionSocketFactory(SSLContext sSLContext, String[] strArr, String[] strArr2, HostnameVerifier hostnameVerifier2) {
        this(((SSLContext) Args.notNull(sSLContext, "SSL context")).getSocketFactory(), strArr, strArr2, hostnameVerifier2);
    }

    public SSLConnectionSocketFactory(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier2) {
        this(sSLSocketFactory, (String[]) null, (String[]) null, hostnameVerifier2);
    }

    public SSLConnectionSocketFactory(SSLSocketFactory sSLSocketFactory, String[] strArr, String[] strArr2, HostnameVerifier hostnameVerifier2) {
        this.log = LogFactory.getLog(getClass());
        this.socketfactory = (SSLSocketFactory) Args.notNull(sSLSocketFactory, "SSL socket factory");
        this.supportedProtocols = strArr;
        this.supportedCipherSuites = strArr2;
        this.hostnameVerifier = hostnameVerifier2 != null ? hostnameVerifier2 : getDefaultHostnameVerifier();
    }

    /* access modifiers changed from: protected */
    public void prepareSocket(SSLSocket sSLSocket) {
    }

    public Socket createSocket(HttpContext httpContext) {
        return SocketFactory.getDefault().createSocket();
    }

    public Socket connectSocket(int i, Socket socket, HttpHost httpHost, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpContext httpContext) {
        Args.notNull(httpHost, "HTTP host");
        Args.notNull(inetSocketAddress, "Remote address");
        if (socket == null) {
            socket = createSocket(httpContext);
        }
        if (inetSocketAddress2 != null) {
            socket.bind(inetSocketAddress2);
        }
        if (i > 0) {
            try {
                if (socket.getSoTimeout() == 0) {
                    socket.setSoTimeout(i);
                }
            } catch (IOException e) {
                try {
                    socket.close();
                } catch (IOException unused) {
                }
                throw e;
            }
        }
        if (this.log.isDebugEnabled()) {
            this.log.debug("Connecting socket to " + inetSocketAddress + " with timeout " + i);
        }
        socket.connect(inetSocketAddress, i);
        if (!(socket instanceof SSLSocket)) {
            return createLayeredSocket(socket, httpHost.getHostName(), inetSocketAddress.getPort(), httpContext);
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        this.log.debug("Starting handshake");
        sSLSocket.startHandshake();
        verifyHostname(sSLSocket, httpHost.getHostName());
        return socket;
    }

    public Socket createLayeredSocket(Socket socket, String str, int i, HttpContext httpContext) {
        SSLSocket sSLSocket = (SSLSocket) this.socketfactory.createSocket(socket, str, i, true);
        if (this.supportedProtocols != null) {
            sSLSocket.setEnabledProtocols(this.supportedProtocols);
        } else {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            ArrayList arrayList = new ArrayList(enabledProtocols.length);
            for (String str2 : enabledProtocols) {
                if (!str2.startsWith("SSL")) {
                    arrayList.add(str2);
                }
            }
            if (!arrayList.isEmpty()) {
                sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[arrayList.size()]));
            }
        }
        if (this.supportedCipherSuites != null) {
            sSLSocket.setEnabledCipherSuites(this.supportedCipherSuites);
        }
        if (this.log.isDebugEnabled()) {
            this.log.debug("Enabled protocols: " + Arrays.asList(sSLSocket.getEnabledProtocols()));
            this.log.debug("Enabled cipher suites:" + Arrays.asList(sSLSocket.getEnabledCipherSuites()));
        }
        prepareSocket(sSLSocket);
        this.log.debug("Starting handshake");
        sSLSocket.startHandshake();
        verifyHostname(sSLSocket, str);
        return sSLSocket;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0128 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0130 A[Catch:{ IOException -> 0x015d }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x015c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void verifyHostname(javax.net.ssl.SSLSocket r9, java.lang.String r10) {
        /*
            r8 = this;
            javax.net.ssl.SSLSession r3 = r9.getSession()     // Catch:{ IOException -> 0x015d }
            if (r3 != 0) goto L_0x001a
            java.io.InputStream r0 = r9.getInputStream()     // Catch:{ IOException -> 0x015d }
            r0.available()     // Catch:{ IOException -> 0x015d }
            javax.net.ssl.SSLSession r3 = r9.getSession()     // Catch:{ IOException -> 0x015d }
            if (r3 != 0) goto L_0x001a
            r9.startHandshake()     // Catch:{ IOException -> 0x015d }
            javax.net.ssl.SSLSession r3 = r9.getSession()     // Catch:{ IOException -> 0x015d }
        L_0x001a:
            if (r3 != 0) goto L_0x0024
            javax.net.ssl.SSLHandshakeException r0 = new javax.net.ssl.SSLHandshakeException     // Catch:{ IOException -> 0x015d }
            java.lang.String r1 = "SSL session not available"
            r0.<init>(r1)     // Catch:{ IOException -> 0x015d }
            throw r0     // Catch:{ IOException -> 0x015d }
        L_0x0024:
            org.apache.commons.logging.Log r0 = r8.log     // Catch:{ IOException -> 0x015d }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ IOException -> 0x015d }
            if (r0 == 0) goto L_0x0128
            org.apache.commons.logging.Log r0 = r8.log     // Catch:{ IOException -> 0x015d }
            java.lang.String r1 = "Secure session established"
            r0.debug(r1)     // Catch:{ IOException -> 0x015d }
            org.apache.commons.logging.Log r0 = r8.log     // Catch:{ IOException -> 0x015d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x015d }
            java.lang.String r2 = " negotiated protocol: "
            r1.<init>(r2)     // Catch:{ IOException -> 0x015d }
            java.lang.String r2 = r3.getProtocol()     // Catch:{ IOException -> 0x015d }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x015d }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x015d }
            r0.debug(r1)     // Catch:{ IOException -> 0x015d }
            org.apache.commons.logging.Log r0 = r8.log     // Catch:{ IOException -> 0x015d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x015d }
            java.lang.String r2 = " negotiated cipher suite: "
            r1.<init>(r2)     // Catch:{ IOException -> 0x015d }
            java.lang.String r2 = r3.getCipherSuite()     // Catch:{ IOException -> 0x015d }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x015d }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x015d }
            r0.debug(r1)     // Catch:{ IOException -> 0x015d }
            java.security.cert.Certificate[] r0 = r3.getPeerCertificates()     // Catch:{ Exception -> 0x0128 }
            r1 = 0
            r0 = r0[r1]     // Catch:{ Exception -> 0x0128 }
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch:{ Exception -> 0x0128 }
            r4 = r0
            javax.security.auth.x500.X500Principal r5 = r4.getSubjectX500Principal()     // Catch:{ Exception -> 0x0128 }
            org.apache.commons.logging.Log r0 = r8.log     // Catch:{ Exception -> 0x0128 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0128 }
            java.lang.String r2 = " peer principal: "
            r1.<init>(r2)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x0128 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0128 }
            r0.debug(r1)     // Catch:{ Exception -> 0x0128 }
            java.util.Collection r5 = r4.getSubjectAlternativeNames()     // Catch:{ Exception -> 0x0128 }
            if (r5 == 0) goto L_0x00ca
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0128 }
            r6.<init>()     // Catch:{ Exception -> 0x0128 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0128 }
        L_0x0098:
            boolean r0 = r5.hasNext()     // Catch:{ Exception -> 0x0128 }
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r0 = r5.next()     // Catch:{ Exception -> 0x0128 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0128 }
            r7 = r0
            boolean r0 = r7.isEmpty()     // Catch:{ Exception -> 0x0128 }
            if (r0 != 0) goto L_0x00b5
            r0 = 1
            java.lang.Object r0 = r7.get(r0)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0128 }
            r6.add(r0)     // Catch:{ Exception -> 0x0128 }
        L_0x00b5:
            goto L_0x0098
        L_0x00b6:
            org.apache.commons.logging.Log r0 = r8.log     // Catch:{ Exception -> 0x0128 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0128 }
            java.lang.String r2 = " peer alternative names: "
            r1.<init>(r2)     // Catch:{ Exception -> 0x0128 }
            java.lang.StringBuilder r1 = r1.append(r6)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0128 }
            r0.debug(r1)     // Catch:{ Exception -> 0x0128 }
        L_0x00ca:
            javax.security.auth.x500.X500Principal r6 = r4.getIssuerX500Principal()     // Catch:{ Exception -> 0x0128 }
            org.apache.commons.logging.Log r0 = r8.log     // Catch:{ Exception -> 0x0128 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0128 }
            java.lang.String r2 = " issuer principal: "
            r1.<init>(r2)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r2 = r6.toString()     // Catch:{ Exception -> 0x0128 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0128 }
            r0.debug(r1)     // Catch:{ Exception -> 0x0128 }
            java.util.Collection r5 = r4.getIssuerAlternativeNames()     // Catch:{ Exception -> 0x0128 }
            if (r5 == 0) goto L_0x0127
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x0128 }
            r7.<init>()     // Catch:{ Exception -> 0x0128 }
            java.util.Iterator r4 = r5.iterator()     // Catch:{ Exception -> 0x0128 }
        L_0x00f5:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x0128 }
            if (r0 == 0) goto L_0x0113
            java.lang.Object r0 = r4.next()     // Catch:{ Exception -> 0x0128 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0128 }
            r5 = r0
            boolean r0 = r5.isEmpty()     // Catch:{ Exception -> 0x0128 }
            if (r0 != 0) goto L_0x0112
            r0 = 1
            java.lang.Object r0 = r5.get(r0)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0128 }
            r7.add(r0)     // Catch:{ Exception -> 0x0128 }
        L_0x0112:
            goto L_0x00f5
        L_0x0113:
            org.apache.commons.logging.Log r0 = r8.log     // Catch:{ Exception -> 0x0128 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0128 }
            java.lang.String r2 = " issuer alternative names: "
            r1.<init>(r2)     // Catch:{ Exception -> 0x0128 }
            java.lang.StringBuilder r1 = r1.append(r7)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0128 }
            r0.debug(r1)     // Catch:{ Exception -> 0x0128 }
        L_0x0127:
        L_0x0128:
            javax.net.ssl.HostnameVerifier r0 = r8.hostnameVerifier     // Catch:{ IOException -> 0x015d }
            boolean r0 = r0.verify(r10, r3)     // Catch:{ IOException -> 0x015d }
            if (r0 != 0) goto L_0x015c
            java.security.cert.Certificate[] r0 = r3.getPeerCertificates()     // Catch:{ IOException -> 0x015d }
            r1 = 0
            r0 = r0[r1]     // Catch:{ IOException -> 0x015d }
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch:{ IOException -> 0x015d }
            java.util.List r5 = org.apache.http.conn.ssl.DefaultHostnameVerifier.getSubjectAltNames(r0)     // Catch:{ IOException -> 0x015d }
            javax.net.ssl.SSLPeerUnverifiedException r0 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ IOException -> 0x015d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x015d }
            java.lang.String r2 = "Certificate for <"
            r1.<init>(r2)     // Catch:{ IOException -> 0x015d }
            java.lang.StringBuilder r1 = r1.append(r10)     // Catch:{ IOException -> 0x015d }
            java.lang.String r2 = "> doesn't match any of the subject alternative names: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ IOException -> 0x015d }
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch:{ IOException -> 0x015d }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x015d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x015d }
            throw r0     // Catch:{ IOException -> 0x015d }
        L_0x015c:
            return
        L_0x015d:
            r3 = move-exception
            r9.close()     // Catch:{ Exception -> 0x0162 }
        L_0x0162:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.conn.ssl.SSLConnectionSocketFactory.verifyHostname(javax.net.ssl.SSLSocket, java.lang.String):void");
    }
}
