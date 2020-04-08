package org.apache.commons.net.p005io;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/* renamed from: org.apache.commons.net.io.SocketOutputStream */
public class SocketOutputStream extends FilterOutputStream {
    private final Socket __socket;

    public SocketOutputStream(Socket socket, OutputStream outputStream) {
        super(outputStream);
        this.__socket = socket;
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
    }

    public void close() {
        super.close();
        this.__socket.close();
    }
}
