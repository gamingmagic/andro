package org.apache.commons.net.p005io;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.net.Socket;

/* renamed from: org.apache.commons.net.io.SocketInputStream */
public class SocketInputStream extends FilterInputStream {
    private final Socket __socket;

    public SocketInputStream(Socket socket, InputStream inputStream) {
        super(inputStream);
        this.__socket = socket;
    }

    public void close() {
        super.close();
        this.__socket.close();
    }
}
