package org.apache.http.impl.conn;

import org.apache.commons.net.SocketClient;
import org.apache.http.Consts;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.p007io.EofSensor;
import org.apache.http.p007io.HttpTransportMetrics;
import org.apache.http.p007io.SessionInputBuffer;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
public class LoggingSessionInputBuffer implements EofSensor, SessionInputBuffer {
    private final String charset;
    private final EofSensor eofSensor;

    /* renamed from: in */
    private final SessionInputBuffer f9021in;
    private final Wire wire;

    public LoggingSessionInputBuffer(SessionInputBuffer sessionInputBuffer, Wire wire2, String str) {
        this.f9021in = sessionInputBuffer;
        this.eofSensor = sessionInputBuffer instanceof EofSensor ? (EofSensor) sessionInputBuffer : null;
        this.wire = wire2;
        this.charset = str != null ? str : Consts.ASCII.name();
    }

    public LoggingSessionInputBuffer(SessionInputBuffer sessionInputBuffer, Wire wire2) {
        this(sessionInputBuffer, wire2, null);
    }

    public boolean isDataAvailable(int i) {
        return this.f9021in.isDataAvailable(i);
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.f9021in.read(bArr, i, i2);
        if (this.wire.enabled() && read > 0) {
            this.wire.input(bArr, i, read);
        }
        return read;
    }

    public int read() {
        int read = this.f9021in.read();
        if (this.wire.enabled() && read != -1) {
            this.wire.input(read);
        }
        return read;
    }

    public int read(byte[] bArr) {
        int read = this.f9021in.read(bArr);
        if (this.wire.enabled() && read > 0) {
            this.wire.input(bArr, 0, read);
        }
        return read;
    }

    public String readLine() {
        String readLine = this.f9021in.readLine();
        if (this.wire.enabled() && readLine != null) {
            this.wire.input((readLine + SocketClient.NETASCII_EOL).getBytes(this.charset));
        }
        return readLine;
    }

    public int readLine(CharArrayBuffer charArrayBuffer) {
        int readLine = this.f9021in.readLine(charArrayBuffer);
        if (this.wire.enabled() && readLine >= 0) {
            this.wire.input((new String(charArrayBuffer.buffer(), charArrayBuffer.length() - readLine, readLine) + SocketClient.NETASCII_EOL).getBytes(this.charset));
        }
        return readLine;
    }

    public HttpTransportMetrics getMetrics() {
        return this.f9021in.getMetrics();
    }

    public boolean isEof() {
        if (this.eofSensor != null) {
            return this.eofSensor.isEof();
        }
        return false;
    }
}
