package org.apache.http.conn;

import java.net.InetSocketAddress;
import org.apache.http.HttpHost;
import org.apache.http.config.SocketConfig;
import org.apache.http.protocol.HttpContext;

public interface HttpClientConnectionOperator {
    void connect(ManagedHttpClientConnection managedHttpClientConnection, HttpHost httpHost, InetSocketAddress inetSocketAddress, int i, SocketConfig socketConfig, HttpContext httpContext);

    void upgrade(ManagedHttpClientConnection managedHttpClientConnection, HttpHost httpHost, HttpContext httpContext);
}
