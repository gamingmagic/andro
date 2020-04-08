package org.apache.http.conn;

import java.net.Socket;
import javax.net.ssl.SSLSession;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpInetConnection;

public interface ManagedHttpClientConnection extends HttpClientConnection, HttpInetConnection {
    void bind(Socket socket);

    String getId();

    SSLSession getSSLSession();

    Socket getSocket();
}
