package org.apache.commons.net.ftp;

import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocket;

public class FTPSServerSocketFactory extends ServerSocketFactory {
    private final SSLContext context;

    public FTPSServerSocketFactory(SSLContext sSLContext) {
        this.context = sSLContext;
    }

    public ServerSocket createServerSocket() {
        return init(this.context.getServerSocketFactory().createServerSocket());
    }

    public ServerSocket createServerSocket(int i) {
        return init(this.context.getServerSocketFactory().createServerSocket(i));
    }

    public ServerSocket createServerSocket(int i, int i2) {
        return init(this.context.getServerSocketFactory().createServerSocket(i, i2));
    }

    public ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress) {
        return init(this.context.getServerSocketFactory().createServerSocket(i, i2, inetAddress));
    }

    public ServerSocket init(ServerSocket serverSocket) {
        ((SSLServerSocket) serverSocket).setUseClientMode(true);
        return serverSocket;
    }
}
