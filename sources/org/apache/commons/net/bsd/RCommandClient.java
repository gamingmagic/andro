package org.apache.commons.net.bsd;

import java.io.IOException;
import java.io.InputStream;
import java.net.BindException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import org.apache.commons.net.p005io.SocketInputStream;
import org.apache.http.protocol.HTTP;

public class RCommandClient extends RExecClient {
    public static final int DEFAULT_PORT = 514;
    public static final int MAX_CLIENT_PORT = 1023;
    public static final int MIN_CLIENT_PORT = 512;

    /* access modifiers changed from: 0000 */
    public InputStream _createErrorStream() {
        ServerSocket serverSocket = null;
        int i = MAX_CLIENT_PORT;
        while (i >= 512) {
            try {
                serverSocket = this._serverSocketFactory_.createServerSocket(i, 1, getLocalAddress());
                break;
            } catch (SocketException unused) {
                i--;
            }
        }
        if (serverSocket == null) {
            throw new BindException("All ports in use.");
        }
        this._output_.write(Integer.toString(serverSocket.getLocalPort()).getBytes(HTTP.UTF_8));
        this._output_.write(0);
        this._output_.flush();
        Socket accept = serverSocket.accept();
        serverSocket.close();
        if (!isRemoteVerificationEnabled() || verifyRemote(accept)) {
            return new SocketInputStream(accept, accept.getInputStream());
        }
        accept.close();
        throw new IOException("Security violation: unexpected connection attempt by " + accept.getInetAddress().getHostAddress());
    }

    public RCommandClient() {
        setDefaultPort(DEFAULT_PORT);
    }

    public void connect(InetAddress inetAddress, int i, InetAddress inetAddress2) {
        int i2 = MAX_CLIENT_PORT;
        while (i2 >= 512) {
            try {
                this._socket_ = this._socketFactory_.createSocket(inetAddress, i, inetAddress2, i2);
                break;
            } catch (BindException unused) {
            } catch (SocketException unused2) {
            }
        }
        if (i2 < 512) {
            throw new BindException("All ports in use or insufficient permssion.");
        }
        _connectAction_();
        return;
        i2--;
    }

    public void connect(InetAddress inetAddress, int i) {
        connect(inetAddress, i, InetAddress.getLocalHost());
    }

    public void connect(String str, int i) {
        connect(InetAddress.getByName(str), i, InetAddress.getLocalHost());
    }

    public void connect(String str, int i, InetAddress inetAddress) {
        connect(InetAddress.getByName(str), i, inetAddress);
    }

    public void connect(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        if (i2 < 512 || i2 > 1023) {
            throw new IllegalArgumentException("Invalid port number " + i2);
        }
        super.connect(inetAddress, i, inetAddress2, i2);
    }

    public void connect(String str, int i, InetAddress inetAddress, int i2) {
        if (i2 < 512 || i2 > 1023) {
            throw new IllegalArgumentException("Invalid port number " + i2);
        }
        super.connect(str, i, inetAddress, i2);
    }

    public void rcommand(String str, String str2, String str3, boolean z) {
        rexec(str, str2, str3, z);
    }

    public void rcommand(String str, String str2, String str3) {
        rcommand(str, str2, str3, false);
    }
}
