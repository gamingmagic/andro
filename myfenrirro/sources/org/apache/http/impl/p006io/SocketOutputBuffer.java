package org.apache.http.impl.p006io;

import java.net.Socket;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@Deprecated
/* renamed from: org.apache.http.impl.io.SocketOutputBuffer */
public class SocketOutputBuffer extends AbstractSessionOutputBuffer {
    public SocketOutputBuffer(Socket socket, int i, HttpParams httpParams) {
        Args.notNull(socket, "Socket");
        int i2 = i;
        if (i < 0) {
            i2 = socket.getSendBufferSize();
        }
        if (i2 < 1024) {
            i2 = 1024;
        }
        init(socket.getOutputStream(), i2, httpParams);
    }
}
