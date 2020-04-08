package org.apache.http.impl.p006io;

import java.net.Socket;
import org.apache.http.p007io.EofSensor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@Deprecated
/* renamed from: org.apache.http.impl.io.SocketInputBuffer */
public class SocketInputBuffer extends AbstractSessionInputBuffer implements EofSensor {
    private boolean eof = false;
    private final Socket socket;

    public SocketInputBuffer(Socket socket2, int i, HttpParams httpParams) {
        Args.notNull(socket2, "Socket");
        this.socket = socket2;
        int i2 = i;
        if (i < 0) {
            i2 = socket2.getReceiveBufferSize();
        }
        if (i2 < 1024) {
            i2 = 1024;
        }
        init(socket2.getInputStream(), i2, httpParams);
    }

    /* access modifiers changed from: protected */
    public int fillBuffer() {
        int fillBuffer = super.fillBuffer();
        this.eof = fillBuffer == -1;
        return fillBuffer;
    }

    public boolean isDataAvailable(int i) {
        boolean hasBufferedData = hasBufferedData();
        if (!hasBufferedData) {
            int soTimeout = this.socket.getSoTimeout();
            try {
                this.socket.setSoTimeout(i);
                fillBuffer();
                hasBufferedData = hasBufferedData();
            } finally {
                this.socket.setSoTimeout(soTimeout);
            }
        }
        return hasBufferedData;
    }

    public boolean isEof() {
        return this.eof;
    }
}
