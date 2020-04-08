package org.apache.http.impl.conn;

import org.apache.commons.net.SocketClient;
import org.apache.http.Consts;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.p007io.HttpTransportMetrics;
import org.apache.http.p007io.SessionOutputBuffer;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
public class LoggingSessionOutputBuffer implements SessionOutputBuffer {
    private final String charset;
    private final SessionOutputBuffer out;
    private final Wire wire;

    public LoggingSessionOutputBuffer(SessionOutputBuffer sessionOutputBuffer, Wire wire2, String str) {
        this.out = sessionOutputBuffer;
        this.wire = wire2;
        this.charset = str != null ? str : Consts.ASCII.name();
    }

    public LoggingSessionOutputBuffer(SessionOutputBuffer sessionOutputBuffer, Wire wire2) {
        this(sessionOutputBuffer, wire2, null);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        if (this.wire.enabled()) {
            this.wire.output(bArr, i, i2);
        }
    }

    public void write(int i) {
        this.out.write(i);
        if (this.wire.enabled()) {
            this.wire.output(i);
        }
    }

    public void write(byte[] bArr) {
        this.out.write(bArr);
        if (this.wire.enabled()) {
            this.wire.output(bArr);
        }
    }

    public void flush() {
        this.out.flush();
    }

    public void writeLine(CharArrayBuffer charArrayBuffer) {
        this.out.writeLine(charArrayBuffer);
        if (this.wire.enabled()) {
            this.wire.output((new String(charArrayBuffer.buffer(), 0, charArrayBuffer.length()) + SocketClient.NETASCII_EOL).getBytes(this.charset));
        }
    }

    public void writeLine(String str) {
        this.out.writeLine(str);
        if (this.wire.enabled()) {
            this.wire.output((str + SocketClient.NETASCII_EOL).getBytes(this.charset));
        }
    }

    public HttpTransportMetrics getMetrics() {
        return this.out.getMetrics();
    }
}
