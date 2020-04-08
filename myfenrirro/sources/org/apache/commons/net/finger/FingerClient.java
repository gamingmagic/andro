package org.apache.commons.net.finger;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.commons.net.SocketClient;

public class FingerClient extends SocketClient {
    public static final int DEFAULT_PORT = 79;
    private static final String __LONG_FLAG = "/W ";
    private transient char[] __buffer = new char[1024];

    public FingerClient() {
        setDefaultPort(79);
    }

    public String query(boolean z, String str) {
        StringBuilder sb = new StringBuilder(this.__buffer.length);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getInputStream(z, str)));
        while (true) {
            try {
                int read = bufferedReader.read(this.__buffer, 0, this.__buffer.length);
                if (read <= 0) {
                    return sb.toString();
                }
                sb.append(this.__buffer, 0, read);
            } finally {
                bufferedReader.close();
            }
        }
    }

    public String query(boolean z) {
        return query(z, "");
    }

    public InputStream getInputStream(boolean z, String str) {
        return getInputStream(z, str, null);
    }

    public InputStream getInputStream(boolean z, String str, String str2) {
        StringBuilder sb = new StringBuilder(64);
        if (z) {
            sb.append(__LONG_FLAG);
        }
        sb.append(str);
        sb.append(SocketClient.NETASCII_EOL);
        byte[] bytes = str2 == null ? sb.toString().getBytes() : sb.toString().getBytes(str2);
        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(this._output_, 1024));
        dataOutputStream.write(bytes, 0, bytes.length);
        dataOutputStream.flush();
        return this._input_;
    }

    public InputStream getInputStream(boolean z) {
        return getInputStream(z, "");
    }
}
