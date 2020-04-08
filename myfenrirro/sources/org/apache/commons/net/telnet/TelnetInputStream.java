package org.apache.commons.net.telnet;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

final class TelnetInputStream extends BufferedInputStream implements Runnable {
    private static final int EOF = -1;
    private static final int WOULD_BLOCK = -2;
    static final int _STATE_CR = 8;
    static final int _STATE_DATA = 0;
    static final int _STATE_DO = 4;
    static final int _STATE_DONT = 5;
    static final int _STATE_IAC = 1;
    static final int _STATE_IAC_SB = 9;
    static final int _STATE_SB = 6;
    static final int _STATE_SE = 7;
    static final int _STATE_WILL = 2;
    static final int _STATE_WONT = 3;
    private int __bytesAvailable;
    private final TelnetClient __client;
    private boolean __hasReachedEOF;
    private IOException __ioException;
    private volatile boolean __isClosed;
    private final int[] __queue;
    private int __queueHead;
    private int __queueTail;
    private boolean __readIsWaiting;
    private int __receiveState;
    private final int[] __suboption;
    private int __suboption_count;
    private final Thread __thread;
    private volatile boolean __threaded;

    TelnetInputStream(InputStream inputStream, TelnetClient telnetClient, boolean z) {
        super(inputStream);
        this.__suboption = new int[512];
        this.__suboption_count = 0;
        this.__client = telnetClient;
        this.__receiveState = 0;
        this.__isClosed = true;
        this.__hasReachedEOF = false;
        this.__queue = new int[2049];
        this.__queueHead = 0;
        this.__queueTail = 0;
        this.__bytesAvailable = 0;
        this.__ioException = null;
        this.__readIsWaiting = false;
        this.__threaded = false;
        if (z) {
            this.__thread = new Thread(this);
        } else {
            this.__thread = null;
        }
    }

    TelnetInputStream(InputStream inputStream, TelnetClient telnetClient) {
        this(inputStream, telnetClient, true);
    }

    /* access modifiers changed from: 0000 */
    public final void _start() {
        if (this.__thread != null) {
            this.__isClosed = false;
            int priority = Thread.currentThread().getPriority() + 1;
            if (priority > 10) {
                priority = 10;
            }
            this.__thread.setPriority(priority);
            this.__thread.setDaemon(true);
            this.__thread.start();
            this.__threaded = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0191, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int __read(boolean r6) {
        /*
            r5 = this;
        L_0x0000:
            if (r6 != 0) goto L_0x000a
            int r0 = super.available()
            if (r0 != 0) goto L_0x000a
            r0 = -2
            return r0
        L_0x000a:
            int r3 = super.read()
            if (r3 >= 0) goto L_0x0012
            r0 = -1
            return r0
        L_0x0012:
            r3 = r3 & 255(0xff, float:3.57E-43)
            org.apache.commons.net.telnet.TelnetClient r4 = r5.__client
            monitor-enter(r4)
            org.apache.commons.net.telnet.TelnetClient r0 = r5.__client     // Catch:{ all -> 0x001e }
            r0._processAYTResponse()     // Catch:{ all -> 0x001e }
            monitor-exit(r4)     // Catch:{ all -> 0x001e }
            goto L_0x0021
        L_0x001e:
            r6 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x001e }
            throw r6
        L_0x0021:
            org.apache.commons.net.telnet.TelnetClient r0 = r5.__client
            r0._spyRead(r3)
            int r0 = r5.__receiveState
            switch(r0) {
                case 0: goto L_0x0048;
                case 1: goto L_0x0074;
                case 2: goto L_0x00ce;
                case 3: goto L_0x00e5;
                case 4: goto L_0x00fc;
                case 5: goto L_0x0113;
                case 6: goto L_0x012a;
                case 7: goto L_0x0191;
                case 8: goto L_0x0046;
                case 9: goto L_0x0150;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x0191
        L_0x0046:
            if (r3 == 0) goto L_0x0000
        L_0x0048:
            r0 = 255(0xff, float:3.57E-43)
            if (r3 != r0) goto L_0x0051
            r0 = 1
            r5.__receiveState = r0
            goto L_0x0000
        L_0x0051:
            r0 = 13
            if (r3 != r0) goto L_0x006f
            org.apache.commons.net.telnet.TelnetClient r4 = r5.__client
            monitor-enter(r4)
            org.apache.commons.net.telnet.TelnetClient r0 = r5.__client     // Catch:{ all -> 0x006c }
            r1 = 0
            boolean r0 = r0._requestedDont(r1)     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0066
            r0 = 8
            r5.__receiveState = r0     // Catch:{ all -> 0x006c }
            goto L_0x0069
        L_0x0066:
            r0 = 0
            r5.__receiveState = r0     // Catch:{ all -> 0x006c }
        L_0x0069:
            monitor-exit(r4)     // Catch:{ all -> 0x006c }
            goto L_0x0191
        L_0x006c:
            r6 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006c }
            throw r6
        L_0x006f:
            r0 = 0
            r5.__receiveState = r0
            goto L_0x0191
        L_0x0074:
            switch(r3) {
                case 240: goto L_0x00bf;
                case 241: goto L_0x00c4;
                case 242: goto L_0x00c4;
                case 243: goto L_0x00c4;
                case 244: goto L_0x00c4;
                case 245: goto L_0x00c4;
                case 246: goto L_0x00c4;
                case 247: goto L_0x00c4;
                case 248: goto L_0x00c4;
                case 249: goto L_0x00c4;
                case 250: goto L_0x00b2;
                case 251: goto L_0x009e;
                case 252: goto L_0x00a3;
                case 253: goto L_0x00a8;
                case 254: goto L_0x00ad;
                case 255: goto L_0x00ba;
                default: goto L_0x0077;
            }
        L_0x0077:
            goto L_0x00c4
        L_0x009e:
            r0 = 2
            r5.__receiveState = r0
            goto L_0x0000
        L_0x00a3:
            r0 = 3
            r5.__receiveState = r0
            goto L_0x0000
        L_0x00a8:
            r0 = 4
            r5.__receiveState = r0
            goto L_0x0000
        L_0x00ad:
            r0 = 5
            r5.__receiveState = r0
            goto L_0x0000
        L_0x00b2:
            r0 = 0
            r5.__suboption_count = r0
            r0 = 6
            r5.__receiveState = r0
            goto L_0x0000
        L_0x00ba:
            r0 = 0
            r5.__receiveState = r0
            goto L_0x0191
        L_0x00bf:
            r0 = 0
            r5.__receiveState = r0
            goto L_0x0000
        L_0x00c4:
            r0 = 0
            r5.__receiveState = r0
            org.apache.commons.net.telnet.TelnetClient r0 = r5.__client
            r0._processCommand(r3)
            goto L_0x0000
        L_0x00ce:
            org.apache.commons.net.telnet.TelnetClient r4 = r5.__client
            monitor-enter(r4)
            org.apache.commons.net.telnet.TelnetClient r0 = r5.__client     // Catch:{ all -> 0x00dd }
            r0._processWill(r3)     // Catch:{ all -> 0x00dd }
            org.apache.commons.net.telnet.TelnetClient r0 = r5.__client     // Catch:{ all -> 0x00dd }
            r0._flushOutputStream()     // Catch:{ all -> 0x00dd }
            monitor-exit(r4)     // Catch:{ all -> 0x00dd }
            goto L_0x00e0
        L_0x00dd:
            r6 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00dd }
            throw r6
        L_0x00e0:
            r0 = 0
            r5.__receiveState = r0
            goto L_0x0000
        L_0x00e5:
            org.apache.commons.net.telnet.TelnetClient r4 = r5.__client
            monitor-enter(r4)
            org.apache.commons.net.telnet.TelnetClient r0 = r5.__client     // Catch:{ all -> 0x00f4 }
            r0._processWont(r3)     // Catch:{ all -> 0x00f4 }
            org.apache.commons.net.telnet.TelnetClient r0 = r5.__client     // Catch:{ all -> 0x00f4 }
            r0._flushOutputStream()     // Catch:{ all -> 0x00f4 }
            monitor-exit(r4)     // Catch:{ all -> 0x00f4 }
            goto L_0x00f7
        L_0x00f4:
            r6 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00f4 }
            throw r6
        L_0x00f7:
            r0 = 0
            r5.__receiveState = r0
            goto L_0x0000
        L_0x00fc:
            org.apache.commons.net.telnet.TelnetClient r4 = r5.__client
            monitor-enter(r4)
            org.apache.commons.net.telnet.TelnetClient r0 = r5.__client     // Catch:{ all -> 0x010b }
            r0._processDo(r3)     // Catch:{ all -> 0x010b }
            org.apache.commons.net.telnet.TelnetClient r0 = r5.__client     // Catch:{ all -> 0x010b }
            r0._flushOutputStream()     // Catch:{ all -> 0x010b }
            monitor-exit(r4)     // Catch:{ all -> 0x010b }
            goto L_0x010e
        L_0x010b:
            r6 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x010b }
            throw r6
        L_0x010e:
            r0 = 0
            r5.__receiveState = r0
            goto L_0x0000
        L_0x0113:
            org.apache.commons.net.telnet.TelnetClient r4 = r5.__client
            monitor-enter(r4)
            org.apache.commons.net.telnet.TelnetClient r0 = r5.__client     // Catch:{ all -> 0x0122 }
            r0._processDont(r3)     // Catch:{ all -> 0x0122 }
            org.apache.commons.net.telnet.TelnetClient r0 = r5.__client     // Catch:{ all -> 0x0122 }
            r0._flushOutputStream()     // Catch:{ all -> 0x0122 }
            monitor-exit(r4)     // Catch:{ all -> 0x0122 }
            goto L_0x0125
        L_0x0122:
            r6 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0122 }
            throw r6
        L_0x0125:
            r0 = 0
            r5.__receiveState = r0
            goto L_0x0000
        L_0x012a:
            switch(r3) {
                case 255: goto L_0x0134;
                default: goto L_0x012d;
            }
        L_0x012d:
            goto L_0x013a
        L_0x0134:
            r0 = 9
            r5.__receiveState = r0
            goto L_0x0000
        L_0x013a:
            int r0 = r5.__suboption_count
            int[] r1 = r5.__suboption
            int r1 = r1.length
            if (r0 >= r1) goto L_0x014b
            int[] r0 = r5.__suboption
            int r1 = r5.__suboption_count
            int r2 = r1 + 1
            r5.__suboption_count = r2
            r0[r1] = r3
        L_0x014b:
            r0 = 6
            r5.__receiveState = r0
            goto L_0x0000
        L_0x0150:
            switch(r3) {
                case 240: goto L_0x0160;
                case 255: goto L_0x017b;
                default: goto L_0x0153;
            }
        L_0x0153:
            goto L_0x018c
        L_0x0160:
            org.apache.commons.net.telnet.TelnetClient r4 = r5.__client
            monitor-enter(r4)
            org.apache.commons.net.telnet.TelnetClient r0 = r5.__client     // Catch:{ all -> 0x0173 }
            int[] r1 = r5.__suboption     // Catch:{ all -> 0x0173 }
            int r2 = r5.__suboption_count     // Catch:{ all -> 0x0173 }
            r0._processSuboption(r1, r2)     // Catch:{ all -> 0x0173 }
            org.apache.commons.net.telnet.TelnetClient r0 = r5.__client     // Catch:{ all -> 0x0173 }
            r0._flushOutputStream()     // Catch:{ all -> 0x0173 }
            monitor-exit(r4)     // Catch:{ all -> 0x0173 }
            goto L_0x0176
        L_0x0173:
            r6 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0173 }
            throw r6
        L_0x0176:
            r0 = 0
            r5.__receiveState = r0
            goto L_0x0000
        L_0x017b:
            int r0 = r5.__suboption_count
            int[] r1 = r5.__suboption
            int r1 = r1.length
            if (r0 >= r1) goto L_0x018c
            int[] r0 = r5.__suboption
            int r1 = r5.__suboption_count
            int r2 = r1 + 1
            r5.__suboption_count = r2
            r0[r1] = r3
        L_0x018c:
            r0 = 6
            r5.__receiveState = r0
            goto L_0x0000
        L_0x0191:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.telnet.TelnetInputStream.__read(boolean):int");
    }

    private boolean __processChar(int i) {
        boolean z;
        synchronized (this.__queue) {
            z = this.__bytesAvailable == 0;
            while (this.__bytesAvailable >= this.__queue.length - 1) {
                if (this.__threaded) {
                    this.__queue.notify();
                    try {
                        this.__queue.wait();
                    } catch (InterruptedException e) {
                        throw e;
                    }
                } else {
                    throw new IllegalStateException("Queue is full! Cannot process another character.");
                }
            }
            if (this.__readIsWaiting && this.__threaded) {
                this.__queue.notify();
            }
            this.__queue[this.__queueTail] = i;
            this.__bytesAvailable++;
            int i2 = this.__queueTail + 1;
            this.__queueTail = i2;
            if (i2 >= this.__queue.length) {
                this.__queueTail = 0;
            }
        }
        return z;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:53|54|55|56|(4:86|58|59|60)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:17|18|19|20|21|22|23) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:37|38|39|40|41|42|48|49|50) */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00ab, code lost:
        return r4;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x002d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0058 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0067 */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x006b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read() {
        /*
            r6 = this;
            int[] r3 = r6.__queue
            monitor-enter(r3)
        L_0x0003:
            java.io.IOException r0 = r6.__ioException     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x000d
            java.io.IOException r4 = r6.__ioException     // Catch:{ all -> 0x00ac }
            r0 = 0
            r6.__ioException = r0     // Catch:{ all -> 0x00ac }
            throw r4     // Catch:{ all -> 0x00ac }
        L_0x000d:
            int r0 = r6.__bytesAvailable     // Catch:{ all -> 0x00ac }
            if (r0 != 0) goto L_0x0083
            boolean r0 = r6.__hasReachedEOF     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x0018
            monitor-exit(r3)     // Catch:{ all -> 0x00ac }
            r0 = -1
            return r0
        L_0x0018:
            boolean r0 = r6.__threaded     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x0035
            int[] r0 = r6.__queue     // Catch:{ all -> 0x00ac }
            r0.notify()     // Catch:{ all -> 0x00ac }
            r0 = 1
            r6.__readIsWaiting = r0     // Catch:{ InterruptedException -> 0x002d }
            int[] r0 = r6.__queue     // Catch:{ InterruptedException -> 0x002d }
            r0.wait()     // Catch:{ InterruptedException -> 0x002d }
            r0 = 0
            r6.__readIsWaiting = r0     // Catch:{ InterruptedException -> 0x002d }
            goto L_0x0003
        L_0x002d:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "Fatal thread interruption during read."
            r0.<init>(r1)     // Catch:{ all -> 0x00ac }
            throw r0     // Catch:{ all -> 0x00ac }
        L_0x0035:
            r0 = 1
            r6.__readIsWaiting = r0     // Catch:{ all -> 0x00ac }
            r4 = 1
        L_0x0039:
            int r4 = r6.__read(r4)     // Catch:{ InterruptedIOException -> 0x0045 }
            if (r4 >= 0) goto L_0x0044
            r0 = -2
            if (r4 == r0) goto L_0x0044
            monitor-exit(r3)     // Catch:{ all -> 0x00ac }
            return r4
        L_0x0044:
            goto L_0x0060
        L_0x0045:
            r4 = move-exception
            int[] r5 = r6.__queue     // Catch:{ all -> 0x00ac }
            monitor-enter(r5)     // Catch:{ all -> 0x00ac }
            r6.__ioException = r4     // Catch:{ all -> 0x005a }
            int[] r0 = r6.__queue     // Catch:{ all -> 0x005a }
            r0.notifyAll()     // Catch:{ all -> 0x005a }
            int[] r0 = r6.__queue     // Catch:{ InterruptedException -> 0x0058 }
            r1 = 100
            r0.wait(r1)     // Catch:{ InterruptedException -> 0x0058 }
        L_0x0058:
            monitor-exit(r5)     // Catch:{ all -> 0x005a }
            goto L_0x005d
        L_0x005a:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005a }
            throw r4     // Catch:{ all -> 0x00ac }
        L_0x005d:
            monitor-exit(r3)     // Catch:{ all -> 0x00ac }
            r0 = -1
            return r0
        L_0x0060:
            r0 = -2
            if (r4 == r0) goto L_0x0066
            r6.__processChar(r4)     // Catch:{ InterruptedException -> 0x0067 }
        L_0x0066:
            goto L_0x006e
        L_0x0067:
            boolean r0 = r6.__isClosed     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x006e
            monitor-exit(r3)     // Catch:{ all -> 0x00ac }
            r0 = -1
            return r0
        L_0x006e:
            r4 = 0
            int r0 = super.available()     // Catch:{ all -> 0x00ac }
            if (r0 <= 0) goto L_0x007e
            int r0 = r6.__bytesAvailable     // Catch:{ all -> 0x00ac }
            int[] r1 = r6.__queue     // Catch:{ all -> 0x00ac }
            int r1 = r1.length     // Catch:{ all -> 0x00ac }
            int r1 = r1 + -1
            if (r0 < r1) goto L_0x0039
        L_0x007e:
            r0 = 0
            r6.__readIsWaiting = r0     // Catch:{ all -> 0x00ac }
            goto L_0x0003
        L_0x0083:
            int[] r0 = r6.__queue     // Catch:{ all -> 0x00ac }
            int r1 = r6.__queueHead     // Catch:{ all -> 0x00ac }
            r4 = r0[r1]     // Catch:{ all -> 0x00ac }
            int r0 = r6.__queueHead     // Catch:{ all -> 0x00ac }
            int r0 = r0 + 1
            r6.__queueHead = r0     // Catch:{ all -> 0x00ac }
            int[] r1 = r6.__queue     // Catch:{ all -> 0x00ac }
            int r1 = r1.length     // Catch:{ all -> 0x00ac }
            if (r0 < r1) goto L_0x0097
            r0 = 0
            r6.__queueHead = r0     // Catch:{ all -> 0x00ac }
        L_0x0097:
            int r0 = r6.__bytesAvailable     // Catch:{ all -> 0x00ac }
            int r0 = r0 + -1
            r6.__bytesAvailable = r0     // Catch:{ all -> 0x00ac }
            int r0 = r6.__bytesAvailable     // Catch:{ all -> 0x00ac }
            if (r0 != 0) goto L_0x00aa
            boolean r0 = r6.__threaded     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x00aa
            int[] r0 = r6.__queue     // Catch:{ all -> 0x00ac }
            r0.notify()     // Catch:{ all -> 0x00ac }
        L_0x00aa:
            monitor-exit(r3)     // Catch:{ all -> 0x00ac }
            return r4
        L_0x00ac:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ac }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.telnet.TelnetInputStream.read():int");
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return 0;
        }
        synchronized (this.__queue) {
            if (i2 > this.__bytesAvailable) {
                i2 = this.__bytesAvailable;
            }
        }
        int read = read();
        if (read == -1) {
            return -1;
        }
        int i3 = i;
        do {
            int i4 = i;
            i++;
            bArr[i4] = (byte) read;
            i2--;
            if (i2 <= 0) {
                break;
            }
            read = read();
        } while (read != -1);
        return i - i3;
    }

    public final boolean markSupported() {
        return false;
    }

    public final int available() {
        synchronized (this.__queue) {
            if (this.__threaded) {
                int i = this.__bytesAvailable;
                return i;
            }
            int available = this.__bytesAvailable + super.available();
            return available;
        }
    }

    public final void close() {
        super.close();
        synchronized (this.__queue) {
            this.__hasReachedEOF = true;
            this.__isClosed = true;
            if (this.__thread != null && this.__thread.isAlive()) {
                this.__thread.interrupt();
            }
            this.__queue.notifyAll();
        }
        this.__threaded = false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:11|12|13|14|15|16|(0)|19|20|65) */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:28|29|30|31|32|(1:64)|(1:35)|36|66|60) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0021 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0038 */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0025 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0056 A[EDGE_INSN: B:64:0x0056->B:48:0x0056 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
        L_0x0000:
            boolean r0 = r5.__isClosed     // Catch:{ IOException -> 0x0046 }
            if (r0 != 0) goto L_0x0045
            r0 = 1
            int r3 = r5.__read(r0)     // Catch:{ InterruptedIOException -> 0x000e, RuntimeException -> 0x002d }
            if (r3 >= 0) goto L_0x000d
            goto L_0x0056
        L_0x000d:
            goto L_0x0031
        L_0x000e:
            r4 = move-exception
            int[] r3 = r5.__queue     // Catch:{ IOException -> 0x0046 }
            monitor-enter(r3)     // Catch:{ IOException -> 0x0046 }
            r5.__ioException = r4     // Catch:{ all -> 0x002a }
            int[] r0 = r5.__queue     // Catch:{ all -> 0x002a }
            r0.notifyAll()     // Catch:{ all -> 0x002a }
            int[] r0 = r5.__queue     // Catch:{ InterruptedException -> 0x0021 }
            r1 = 100
            r0.wait(r1)     // Catch:{ InterruptedException -> 0x0021 }
            goto L_0x0028
        L_0x0021:
            boolean r0 = r5.__isClosed     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0028
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            goto L_0x0056
        L_0x0028:
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            goto L_0x0000
        L_0x002a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r4     // Catch:{ IOException -> 0x0046 }
        L_0x002d:
            super.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x0056
        L_0x0031:
            r4 = 0
            boolean r0 = r5.__processChar(r3)     // Catch:{ InterruptedException -> 0x0038 }
            r4 = r0
            goto L_0x003c
        L_0x0038:
            boolean r0 = r5.__isClosed     // Catch:{ IOException -> 0x0046 }
            if (r0 != 0) goto L_0x0045
        L_0x003c:
            if (r4 == 0) goto L_0x0043
            org.apache.commons.net.telnet.TelnetClient r0 = r5.__client     // Catch:{ IOException -> 0x0046 }
            r0.notifyInputListener()     // Catch:{ IOException -> 0x0046 }
        L_0x0043:
            goto L_0x0000
        L_0x0045:
            goto L_0x0056
        L_0x0046:
            r4 = move-exception
            int[] r3 = r5.__queue
            monitor-enter(r3)
            r5.__ioException = r4     // Catch:{ all -> 0x004e }
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            goto L_0x0051
        L_0x004e:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            throw r4
        L_0x0051:
            org.apache.commons.net.telnet.TelnetClient r0 = r5.__client
            r0.notifyInputListener()
        L_0x0056:
            int[] r4 = r5.__queue
            monitor-enter(r4)
            r0 = 1
            r5.__isClosed = r0     // Catch:{ all -> 0x0066 }
            r0 = 1
            r5.__hasReachedEOF = r0     // Catch:{ all -> 0x0066 }
            int[] r0 = r5.__queue     // Catch:{ all -> 0x0066 }
            r0.notify()     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            goto L_0x0069
        L_0x0066:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r3
        L_0x0069:
            r0 = 0
            r5.__threaded = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.telnet.TelnetInputStream.run():void");
    }
}
