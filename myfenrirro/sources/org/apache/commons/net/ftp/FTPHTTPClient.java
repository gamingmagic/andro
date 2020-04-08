package org.apache.commons.net.ftp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Inet6Address;
import java.net.Socket;
import java.util.ArrayList;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.util.Base64;
import org.apache.http.protocol.HTTP;

public class FTPHTTPClient extends FTPClient {
    private static final byte[] CRLF = {13, 10};
    private final Base64 base64;
    private final String proxyHost;
    private final String proxyPassword;
    private final int proxyPort;
    private final String proxyUsername;

    static {
    }

    public FTPHTTPClient(String str, int i, String str2, String str3) {
        this.base64 = new Base64();
        this.proxyHost = str;
        this.proxyPort = i;
        this.proxyUsername = str2;
        this.proxyPassword = str3;
    }

    public FTPHTTPClient(String str, int i) {
        this(str, i, null, null);
    }

    /* access modifiers changed from: protected */
    public Socket _openDataConnection_(int i, String str) {
        return super._openDataConnection_(i, str);
    }

    /* access modifiers changed from: protected */
    public Socket _openDataConnection_(String str, String str2) {
        if (getDataConnectionMode() != 2) {
            throw new IllegalStateException("Only passive connection mode supported");
        }
        boolean z = getRemoteAddress() instanceof Inet6Address;
        if ((isUseEPSVwithIPv4() || z) && epsv() == 229) {
            _parseExtendedPassiveModeReply((String) this._replyLines.get(0));
        } else if (z) {
            return null;
        } else {
            if (pasv() != 227) {
                return null;
            }
            _parsePassiveModeReply((String) this._replyLines.get(0));
        }
        Socket socket = new Socket(this.proxyHost, this.proxyPort);
        tunnelHandshake(getPassiveHost(), getPassivePort(), socket.getInputStream(), socket.getOutputStream());
        if (getRestartOffset() > 0 && !restart(getRestartOffset())) {
            socket.close();
            return null;
        } else if (FTPReply.isPositivePreliminary(sendCommand(str, str2))) {
            return socket;
        } else {
            socket.close();
            return null;
        }
    }

    public void connect(String str, int i) {
        this._socket_ = new Socket(this.proxyHost, this.proxyPort);
        this._input_ = this._socket_.getInputStream();
        this._output_ = this._socket_.getOutputStream();
        try {
            tunnelHandshake(str, i, this._input_, this._output_);
            super._connectAction_();
        } catch (Exception e) {
            IOException iOException = new IOException("Could not connect to " + str + " using port " + i);
            IOException iOException2 = iOException;
            iOException.initCause(e);
            throw iOException2;
        }
    }

    private void tunnelHandshake(String str, int i, InputStream inputStream, OutputStream outputStream) {
        String str2 = "CONNECT " + str + ":" + i + " HTTP/1.1";
        String str3 = "Host: " + str + ":" + i;
        outputStream.write(str2.getBytes(HTTP.UTF_8));
        outputStream.write(CRLF);
        outputStream.write(str3.getBytes(HTTP.UTF_8));
        outputStream.write(CRLF);
        if (!(this.proxyUsername == null || this.proxyPassword == null)) {
            outputStream.write(("Proxy-Authorization: Basic " + this.base64.encodeToString((this.proxyUsername + ":" + this.proxyPassword).getBytes(HTTP.UTF_8))).getBytes(HTTP.UTF_8));
        }
        outputStream.write(CRLF);
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String readLine = bufferedReader.readLine();
        while (readLine != null && readLine.length() > 0) {
            arrayList.add(readLine);
            readLine = bufferedReader.readLine();
        }
        if (arrayList.size() == 0) {
            throw new IOException("No response from proxy");
        }
        String str4 = (String) arrayList.get(0);
        if (!str4.startsWith("HTTP/") || str4.length() < 12) {
            throw new IOException("Invalid response from proxy: " + str4);
        } else if (!"200".equals(str4.substring(9, 12))) {
            StringBuilder sb = new StringBuilder();
            sb.append("HTTPTunnelConnector: connection failed\r\n");
            sb.append("Response received from the proxy:\r\n");
            for (String append : arrayList) {
                sb.append(append);
                sb.append(SocketClient.NETASCII_EOL);
            }
            throw new IOException(sb.toString());
        }
    }
}
