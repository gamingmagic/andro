package org.apache.http.impl.auth;

import java.net.InetAddress;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.KerberosCredentials;
import org.apache.http.util.CharArrayBuffer;
import org.ietf.jgss.GSSContext;
import org.ietf.jgss.GSSCredential;
import org.ietf.jgss.GSSManager;
import org.ietf.jgss.GSSName;
import org.ietf.jgss.Oid;

public abstract class GGSSchemeBase extends AuthSchemeBase {
    private final Base64 base64codec;
    private final Log log;
    private State state;
    private final boolean stripPort;
    private byte[] token;
    private final boolean useCanonicalHostname;

    enum State {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        TOKEN_GENERATED,
        FAILED
    }

    GGSSchemeBase(boolean z, boolean z2) {
        this.log = LogFactory.getLog(getClass());
        this.base64codec = new Base64(0);
        this.stripPort = z;
        this.useCanonicalHostname = z2;
        this.state = State.UNINITIATED;
    }

    GGSSchemeBase(boolean z) {
        this(z, true);
    }

    GGSSchemeBase() {
        this(true, true);
    }

    /* access modifiers changed from: protected */
    public GSSManager getManager() {
        return GSSManager.getInstance();
    }

    /* access modifiers changed from: protected */
    public byte[] generateGSSToken(byte[] bArr, Oid oid, String str) {
        return generateGSSToken(bArr, oid, str, null);
    }

    /* access modifiers changed from: protected */
    public byte[] generateGSSToken(byte[] bArr, Oid oid, String str, Credentials credentials) {
        GSSCredential gSSCredential;
        GSSManager manager = getManager();
        GSSName createName = manager.createName("HTTP@" + str, GSSName.NT_HOSTBASED_SERVICE);
        if (credentials instanceof KerberosCredentials) {
            gSSCredential = ((KerberosCredentials) credentials).getGSSCredential();
        } else {
            gSSCredential = null;
        }
        GSSContext createGSSContext = createGSSContext(manager, oid, createName, gSSCredential);
        if (bArr != null) {
            return createGSSContext.initSecContext(bArr, 0, bArr.length);
        }
        return createGSSContext.initSecContext(new byte[0], 0, 0);
    }

    /* access modifiers changed from: 0000 */
    public GSSContext createGSSContext(GSSManager gSSManager, Oid oid, GSSName gSSName, GSSCredential gSSCredential) {
        GSSContext createContext = gSSManager.createContext(gSSName.canonicalize(oid), oid, gSSCredential, 0);
        createContext.requestMutualAuth(true);
        return createContext;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public byte[] generateToken(byte[] bArr, String str) {
        return null;
    }

    /* access modifiers changed from: protected */
    public byte[] generateToken(byte[] bArr, String str, Credentials credentials) {
        return generateToken(bArr, str);
    }

    public boolean isComplete() {
        return this.state == State.TOKEN_GENERATED || this.state == State.FAILED;
    }

    @Deprecated
    public Header authenticate(Credentials credentials, HttpRequest httpRequest) {
        return authenticate(credentials, httpRequest, null);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:12|(1:14)|16|17|(2:19|20)|21|22|(1:24)|25|(1:27)|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0077, code lost:
        if (r6 == null) goto L_0x0079;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x008b */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f A[Catch:{ GSSException -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b2 A[Catch:{ GSSException -> 0x00d4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.http.Header authenticate(org.apache.http.auth.Credentials r4, org.apache.http.HttpRequest r5, org.apache.http.protocol.HttpContext r6) {
        /*
            r3 = this;
            java.lang.String r0 = "HTTP request"
            org.apache.http.util.Args.notNull(r5, r0)
            int[] r0 = org.apache.http.impl.auth.GGSSchemeBase.C20861.$SwitchMap$org$apache$http$impl$auth$GGSSchemeBase$State
            org.apache.http.impl.auth.GGSSchemeBase$State r1 = r3.state
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x0020;
                case 2: goto L_0x003d;
                case 3: goto L_0x005a;
                case 4: goto L_0x0131;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0186
        L_0x0020:
            org.apache.http.auth.AuthenticationException r0 = new org.apache.http.auth.AuthenticationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getSchemeName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " authentication has not been initiated"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x003d:
            org.apache.http.auth.AuthenticationException r0 = new org.apache.http.auth.AuthenticationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getSchemeName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " authentication has failed"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x005a:
            java.lang.String r0 = "http.route"
            java.lang.Object r0 = r6.getAttribute(r0)     // Catch:{ GSSException -> 0x00d4 }
            org.apache.http.conn.routing.HttpRoute r0 = (org.apache.http.conn.routing.HttpRoute) r0     // Catch:{ GSSException -> 0x00d4 }
            r5 = r0
            if (r5 != 0) goto L_0x006d
            org.apache.http.auth.AuthenticationException r0 = new org.apache.http.auth.AuthenticationException     // Catch:{ GSSException -> 0x00d4 }
            java.lang.String r1 = "Connection route is not available"
            r0.<init>(r1)     // Catch:{ GSSException -> 0x00d4 }
            throw r0     // Catch:{ GSSException -> 0x00d4 }
        L_0x006d:
            boolean r0 = r3.isProxy()     // Catch:{ GSSException -> 0x00d4 }
            if (r0 == 0) goto L_0x0079
            org.apache.http.HttpHost r6 = r5.getProxyHost()     // Catch:{ GSSException -> 0x00d4 }
            if (r6 != 0) goto L_0x007d
        L_0x0079:
            org.apache.http.HttpHost r6 = r5.getTargetHost()     // Catch:{ GSSException -> 0x00d4 }
        L_0x007d:
            java.lang.String r5 = r6.getHostName()     // Catch:{ GSSException -> 0x00d4 }
            boolean r0 = r3.useCanonicalHostname     // Catch:{ GSSException -> 0x00d4 }
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = r3.resolveCanonicalHostname(r5)     // Catch:{ UnknownHostException -> 0x008b }
            r5 = r0
        L_0x008b:
            boolean r0 = r3.stripPort     // Catch:{ GSSException -> 0x00d4 }
            if (r0 != 0) goto L_0x00aa
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ GSSException -> 0x00d4 }
            r0.<init>()     // Catch:{ GSSException -> 0x00d4 }
            java.lang.StringBuilder r0 = r0.append(r5)     // Catch:{ GSSException -> 0x00d4 }
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ GSSException -> 0x00d4 }
            int r1 = r6.getPort()     // Catch:{ GSSException -> 0x00d4 }
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ GSSException -> 0x00d4 }
            java.lang.String r5 = r0.toString()     // Catch:{ GSSException -> 0x00d4 }
        L_0x00aa:
            org.apache.commons.logging.Log r0 = r3.log     // Catch:{ GSSException -> 0x00d4 }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ GSSException -> 0x00d4 }
            if (r0 == 0) goto L_0x00c6
            org.apache.commons.logging.Log r0 = r3.log     // Catch:{ GSSException -> 0x00d4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ GSSException -> 0x00d4 }
            java.lang.String r2 = "init "
            r1.<init>(r2)     // Catch:{ GSSException -> 0x00d4 }
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch:{ GSSException -> 0x00d4 }
            java.lang.String r1 = r1.toString()     // Catch:{ GSSException -> 0x00d4 }
            r0.debug(r1)     // Catch:{ GSSException -> 0x00d4 }
        L_0x00c6:
            byte[] r0 = r3.token     // Catch:{ GSSException -> 0x00d4 }
            byte[] r0 = r3.generateToken(r0, r5, r4)     // Catch:{ GSSException -> 0x00d4 }
            r3.token = r0     // Catch:{ GSSException -> 0x00d4 }
            org.apache.http.impl.auth.GGSSchemeBase$State r0 = org.apache.http.impl.auth.GGSSchemeBase.State.TOKEN_GENERATED     // Catch:{ GSSException -> 0x00d4 }
            r3.state = r0     // Catch:{ GSSException -> 0x00d4 }
            goto L_0x0131
        L_0x00d4:
            r5 = move-exception
            org.apache.http.impl.auth.GGSSchemeBase$State r0 = org.apache.http.impl.auth.GGSSchemeBase.State.FAILED
            r3.state = r0
            int r0 = r5.getMajor()
            r1 = 9
            if (r0 == r1) goto L_0x00e9
            int r0 = r5.getMajor()
            r1 = 8
            if (r0 != r1) goto L_0x00f3
        L_0x00e9:
            org.apache.http.auth.InvalidCredentialsException r0 = new org.apache.http.auth.InvalidCredentialsException
            java.lang.String r1 = r5.getMessage()
            r0.<init>(r1, r5)
            throw r0
        L_0x00f3:
            int r0 = r5.getMajor()
            r1 = 13
            if (r0 != r1) goto L_0x0105
            org.apache.http.auth.InvalidCredentialsException r0 = new org.apache.http.auth.InvalidCredentialsException
            java.lang.String r1 = r5.getMessage()
            r0.<init>(r1, r5)
            throw r0
        L_0x0105:
            int r0 = r5.getMajor()
            r1 = 10
            if (r0 == r1) goto L_0x011d
            int r0 = r5.getMajor()
            r1 = 19
            if (r0 == r1) goto L_0x011d
            int r0 = r5.getMajor()
            r1 = 20
            if (r0 != r1) goto L_0x0127
        L_0x011d:
            org.apache.http.auth.AuthenticationException r0 = new org.apache.http.auth.AuthenticationException
            java.lang.String r1 = r5.getMessage()
            r0.<init>(r1, r5)
            throw r0
        L_0x0127:
            org.apache.http.auth.AuthenticationException r0 = new org.apache.http.auth.AuthenticationException
            java.lang.String r1 = r5.getMessage()
            r0.<init>(r1)
            throw r0
        L_0x0131:
            java.lang.String r5 = new java.lang.String
            org.apache.commons.codec.binary.Base64 r0 = r3.base64codec
            byte[] r1 = r3.token
            byte[] r0 = r0.encode(r1)
            r5.<init>(r0)
            org.apache.commons.logging.Log r0 = r3.log
            boolean r0 = r0.isDebugEnabled()
            if (r0 == 0) goto L_0x0160
            org.apache.commons.logging.Log r0 = r3.log
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Sending response '"
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = "' back to the auth server"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.debug(r1)
        L_0x0160:
            org.apache.http.util.CharArrayBuffer r6 = new org.apache.http.util.CharArrayBuffer
            r0 = 32
            r6.<init>(r0)
            boolean r0 = r3.isProxy()
            if (r0 == 0) goto L_0x0173
            java.lang.String r0 = "Proxy-Authorization"
            r6.append(r0)
            goto L_0x0178
        L_0x0173:
            java.lang.String r0 = "Authorization"
            r6.append(r0)
        L_0x0178:
            java.lang.String r0 = ": Negotiate "
            r6.append(r0)
            r6.append(r5)
            org.apache.http.message.BufferedHeader r0 = new org.apache.http.message.BufferedHeader
            r0.<init>(r6)
            return r0
        L_0x0186:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Illegal state: "
            r1.<init>(r2)
            org.apache.http.impl.auth.GGSSchemeBase$State r2 = r3.state
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.auth.GGSSchemeBase.authenticate(org.apache.http.auth.Credentials, org.apache.http.HttpRequest, org.apache.http.protocol.HttpContext):org.apache.http.Header");
    }

    /* access modifiers changed from: protected */
    public void parseChallenge(CharArrayBuffer charArrayBuffer, int i, int i2) {
        String substringTrimmed = charArrayBuffer.substringTrimmed(i, i2);
        if (this.log.isDebugEnabled()) {
            this.log.debug("Received challenge '" + substringTrimmed + "' from the auth server");
        }
        if (this.state == State.UNINITIATED) {
            this.token = Base64.decodeBase64(substringTrimmed.getBytes());
            this.state = State.CHALLENGE_RECEIVED;
            return;
        }
        this.log.debug("Authentication already attempted");
        this.state = State.FAILED;
    }

    private String resolveCanonicalHostname(String str) {
        InetAddress byName = InetAddress.getByName(str);
        String canonicalHostName = byName.getCanonicalHostName();
        if (byName.getHostAddress().contentEquals(canonicalHostName)) {
            return str;
        }
        return canonicalHostName;
    }
}
