package org.apache.commons.net.bsd;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.p005io.SocketInputStream;
import org.apache.http.protocol.HTTP;

public class RExecClient extends SocketClient {
    public static final int DEFAULT_PORT = 512;
    private boolean __remoteVerificationEnabled;
    protected InputStream _errorStream_ = null;

    /* access modifiers changed from: 0000 */
    public InputStream _createErrorStream() {
        ServerSocket createServerSocket = this._serverSocketFactory_.createServerSocket(0, 1, getLocalAddress());
        this._output_.write(Integer.toString(createServerSocket.getLocalPort()).getBytes(HTTP.UTF_8));
        this._output_.write(0);
        this._output_.flush();
        Socket accept = createServerSocket.accept();
        createServerSocket.close();
        if (!this.__remoteVerificationEnabled || verifyRemote(accept)) {
            return new SocketInputStream(accept, accept.getInputStream());
        }
        accept.close();
        throw new IOException("Security violation: unexpected connection attempt by " + accept.getInetAddress().getHostAddress());
    }

    public RExecClient() {
        setDefaultPort(512);
    }

    public InputStream getInputStream() {
        return this._input_;
    }

    public OutputStream getOutputStream() {
        return this._output_;
    }

    public InputStream getErrorStream() {
        return this._errorStream_;
    }

    public void rexec(String str, String str2, String str3, boolean z) {
        if (z) {
            this._errorStream_ = _createErrorStream();
        } else {
            this._output_.write(0);
        }
        this._output_.write(str.getBytes());
        this._output_.write(0);
        this._output_.write(str2.getBytes());
        this._output_.write(0);
        this._output_.write(str3.getBytes());
        this._output_.write(0);
        this._output_.flush();
        int read = this._input_.read();
        if (read > 0) {
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read2 = this._input_.read();
                if (read2 != -1 && read2 != 10) {
                    sb.append((char) read2);
                }
            }
            throw new IOException(sb.toString());
        } else if (read < 0) {
            throw new IOException("Server closed connection.");
        }
    }

    public void rexec(String str, String str2, String str3) {
        rexec(str, str2, str3, false);
    }

    public void disconnect() {
        if (this._errorStream_ != null) {
            this._errorStream_.close();
        }
        this._errorStream_ = null;
        super.disconnect();
    }

    public final void setRemoteVerificationEnabled(boolean z) {
        this.__remoteVerificationEnabled = z;
    }

    public final boolean isRemoteVerificationEnabled() {
        return this.__remoteVerificationEnabled;
    }
}
