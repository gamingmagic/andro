package org.apache.commons.net.telnet;

import java.io.OutputStream;

final class TelnetOutputStream extends OutputStream {
    private final TelnetClient __client;
    private boolean __convertCRtoCRLF = true;
    private boolean __lastWasCR = false;

    TelnetOutputStream(TelnetClient telnetClient) {
        this.__client = telnetClient;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(int r4) {
        /*
            r3 = this;
            org.apache.commons.net.telnet.TelnetClient r2 = r3.__client
            monitor-enter(r2)
            r4 = r4 & 255(0xff, float:3.57E-43)
            org.apache.commons.net.telnet.TelnetClient r0 = r3.__client     // Catch:{ all -> 0x007a }
            r1 = 0
            boolean r0 = r0._requestedWont(r1)     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0062
            boolean r0 = r3.__lastWasCR     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0030
            boolean r0 = r3.__convertCRtoCRLF     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0026
            org.apache.commons.net.telnet.TelnetClient r0 = r3.__client     // Catch:{ all -> 0x007a }
            r1 = 10
            r0._sendByte(r1)     // Catch:{ all -> 0x007a }
            r0 = 10
            if (r4 != r0) goto L_0x0030
            r0 = 0
            r3.__lastWasCR = r0     // Catch:{ all -> 0x007a }
            monitor-exit(r2)     // Catch:{ all -> 0x007a }
            return
        L_0x0026:
            r0 = 10
            if (r4 == r0) goto L_0x0030
            org.apache.commons.net.telnet.TelnetClient r0 = r3.__client     // Catch:{ all -> 0x007a }
            r1 = 0
            r0._sendByte(r1)     // Catch:{ all -> 0x007a }
        L_0x0030:
            r0 = 0
            r3.__lastWasCR = r0     // Catch:{ all -> 0x007a }
            switch(r4) {
                case 13: goto L_0x0042;
                case 255: goto L_0x004d;
                default: goto L_0x0036;
            }     // Catch:{ all -> 0x007a }
        L_0x0036:
            goto L_0x005c
        L_0x0042:
            org.apache.commons.net.telnet.TelnetClient r0 = r3.__client     // Catch:{ all -> 0x007a }
            r1 = 13
            r0._sendByte(r1)     // Catch:{ all -> 0x007a }
            r0 = 1
            r3.__lastWasCR = r0     // Catch:{ all -> 0x007a }
            goto L_0x0078
        L_0x004d:
            org.apache.commons.net.telnet.TelnetClient r0 = r3.__client     // Catch:{ all -> 0x007a }
            r1 = 255(0xff, float:3.57E-43)
            r0._sendByte(r1)     // Catch:{ all -> 0x007a }
            org.apache.commons.net.telnet.TelnetClient r0 = r3.__client     // Catch:{ all -> 0x007a }
            r1 = 255(0xff, float:3.57E-43)
            r0._sendByte(r1)     // Catch:{ all -> 0x007a }
            goto L_0x0078
        L_0x005c:
            org.apache.commons.net.telnet.TelnetClient r0 = r3.__client     // Catch:{ all -> 0x007a }
            r0._sendByte(r4)     // Catch:{ all -> 0x007a }
            goto L_0x0078
        L_0x0062:
            r0 = 255(0xff, float:3.57E-43)
            if (r4 != r0) goto L_0x0073
            org.apache.commons.net.telnet.TelnetClient r0 = r3.__client     // Catch:{ all -> 0x007a }
            r0._sendByte(r4)     // Catch:{ all -> 0x007a }
            org.apache.commons.net.telnet.TelnetClient r0 = r3.__client     // Catch:{ all -> 0x007a }
            r1 = 255(0xff, float:3.57E-43)
            r0._sendByte(r1)     // Catch:{ all -> 0x007a }
            goto L_0x0078
        L_0x0073:
            org.apache.commons.net.telnet.TelnetClient r0 = r3.__client     // Catch:{ all -> 0x007a }
            r0._sendByte(r4)     // Catch:{ all -> 0x007a }
        L_0x0078:
            monitor-exit(r2)     // Catch:{ all -> 0x007a }
            return
        L_0x007a:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.telnet.TelnetOutputStream.write(int):void");
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        synchronized (this.__client) {
            while (true) {
                int i3 = i2;
                i2 = i3 - 1;
                if (i3 > 0) {
                    int i4 = i;
                    i++;
                    write((int) bArr[i4]);
                }
            }
            while (true) {
            }
        }
    }

    public final void flush() {
        this.__client._flushOutputStream();
    }

    public final void close() {
        this.__client._closeOutputStream();
    }
}
