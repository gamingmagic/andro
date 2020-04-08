package org.apache.commons.net.pop3;

import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import org.apache.commons.net.p005io.CRLFLineReader;
import org.apache.commons.net.util.SSLContextUtils;

public class POP3SClient extends POP3Client {
    private static final int DEFAULT_POP3S_PORT = 995;
    private static final String DEFAULT_PROTOCOL = "TLS";
    private SSLContext context;
    private final boolean isImplicit;
    private KeyManager keyManager;
    private final String protocol;
    private String[] protocols;
    private String[] suites;
    private TrustManager trustManager;

    public POP3SClient() {
        this("TLS", false);
    }

    public POP3SClient(boolean z) {
        this("TLS", z);
    }

    public POP3SClient(String str) {
        this(str, false);
    }

    public POP3SClient(String str, boolean z) {
        this(str, z, null);
    }

    public POP3SClient(String str, boolean z, SSLContext sSLContext) {
        this.context = null;
        this.suites = null;
        this.protocols = null;
        this.trustManager = null;
        this.keyManager = null;
        this.protocol = str;
        this.isImplicit = z;
        this.context = sSLContext;
        if (this.isImplicit) {
            setDefaultPort(DEFAULT_POP3S_PORT);
        }
    }

    public POP3SClient(boolean z, SSLContext sSLContext) {
        this("TLS", z, sSLContext);
    }

    public POP3SClient(SSLContext sSLContext) {
        this(false, sSLContext);
    }

    /* access modifiers changed from: protected */
    public void _connectAction_() {
        if (this.isImplicit) {
            performSSLNegotiation();
        }
        super._connectAction_();
    }

    private void initSSLContext() {
        if (this.context == null) {
            this.context = SSLContextUtils.createSSLContext(this.protocol, getKeyManager(), getTrustManager());
        }
    }

    private void performSSLNegotiation() {
        initSSLContext();
        SSLSocket sSLSocket = (SSLSocket) this.context.getSocketFactory().createSocket(this._socket_, getRemoteAddress().getHostAddress(), getRemotePort(), true);
        sSLSocket.setEnableSessionCreation(true);
        sSLSocket.setUseClientMode(true);
        if (this.protocols != null) {
            sSLSocket.setEnabledProtocols(this.protocols);
        }
        if (this.suites != null) {
            sSLSocket.setEnabledCipherSuites(this.suites);
        }
        sSLSocket.startHandshake();
        this._socket_ = sSLSocket;
        this._input_ = sSLSocket.getInputStream();
        this._output_ = sSLSocket.getOutputStream();
        this._reader = new CRLFLineReader(new InputStreamReader(this._input_, "ISO-8859-1"));
        this._writer = new BufferedWriter(new OutputStreamWriter(this._output_, "ISO-8859-1"));
    }

    private KeyManager getKeyManager() {
        return this.keyManager;
    }

    public void setKeyManager(KeyManager keyManager2) {
        this.keyManager = keyManager2;
    }

    public void setEnabledCipherSuites(String[] strArr) {
        this.suites = new String[strArr.length];
        System.arraycopy(strArr, 0, this.suites, 0, strArr.length);
    }

    public String[] getEnabledCipherSuites() {
        if (this._socket_ instanceof SSLSocket) {
            return ((SSLSocket) this._socket_).getEnabledCipherSuites();
        }
        return null;
    }

    public void setEnabledProtocols(String[] strArr) {
        this.protocols = new String[strArr.length];
        System.arraycopy(strArr, 0, this.protocols, 0, strArr.length);
    }

    public String[] getEnabledProtocols() {
        if (this._socket_ instanceof SSLSocket) {
            return ((SSLSocket) this._socket_).getEnabledProtocols();
        }
        return null;
    }

    public boolean execTLS() {
        if (sendCommand("STLS") != 0) {
            return false;
        }
        performSSLNegotiation();
        return true;
    }

    public TrustManager getTrustManager() {
        return this.trustManager;
    }

    public void setTrustManager(TrustManager trustManager2) {
        this.trustManager = trustManager2;
    }
}
