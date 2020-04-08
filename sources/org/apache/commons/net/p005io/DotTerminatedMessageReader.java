package org.apache.commons.net.p005io;

import java.io.BufferedReader;
import java.io.Reader;

/* renamed from: org.apache.commons.net.io.DotTerminatedMessageReader */
public final class DotTerminatedMessageReader extends BufferedReader {

    /* renamed from: CR */
    private static final char f8988CR = '\r';
    private static final int DOT = 46;

    /* renamed from: LF */
    private static final char f8989LF = '\n';
    private boolean atBeginning = true;
    private boolean eof = false;
    private boolean seenCR;

    public DotTerminatedMessageReader(Reader reader) {
        super(reader);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0076, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read() {
        /*
            r3 = this;
            java.lang.Object r1 = r3.lock
            monitor-enter(r1)
            boolean r0 = r3.eof     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x000a
            monitor-exit(r1)     // Catch:{ all -> 0x0077 }
            r0 = -1
            return r0
        L_0x000a:
            int r2 = super.read()     // Catch:{ all -> 0x0077 }
            r0 = -1
            if (r2 != r0) goto L_0x0017
            r0 = 1
            r3.eof = r0     // Catch:{ all -> 0x0077 }
            monitor-exit(r1)     // Catch:{ all -> 0x0077 }
            r0 = -1
            return r0
        L_0x0017:
            boolean r0 = r3.atBeginning     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0060
            r0 = 0
            r3.atBeginning = r0     // Catch:{ all -> 0x0077 }
            r0 = 46
            if (r2 != r0) goto L_0x0060
            r0 = 2
            r3.mark(r0)     // Catch:{ all -> 0x0077 }
            int r2 = super.read()     // Catch:{ all -> 0x0077 }
            r0 = -1
            if (r2 != r0) goto L_0x0034
            r0 = 1
            r3.eof = r0     // Catch:{ all -> 0x0077 }
            monitor-exit(r1)     // Catch:{ all -> 0x0077 }
            r0 = 46
            return r0
        L_0x0034:
            r0 = 46
            if (r2 != r0) goto L_0x003a
            monitor-exit(r1)     // Catch:{ all -> 0x0077 }
            return r2
        L_0x003a:
            r0 = 13
            if (r2 != r0) goto L_0x0059
            int r2 = super.read()     // Catch:{ all -> 0x0077 }
            r0 = -1
            if (r2 != r0) goto L_0x004c
            r3.reset()     // Catch:{ all -> 0x0077 }
            monitor-exit(r1)     // Catch:{ all -> 0x0077 }
            r0 = 46
            return r0
        L_0x004c:
            r0 = 10
            if (r2 != r0) goto L_0x0059
            r0 = 1
            r3.atBeginning = r0     // Catch:{ all -> 0x0077 }
            r0 = 1
            r3.eof = r0     // Catch:{ all -> 0x0077 }
            monitor-exit(r1)     // Catch:{ all -> 0x0077 }
            r0 = -1
            return r0
        L_0x0059:
            r3.reset()     // Catch:{ all -> 0x0077 }
            monitor-exit(r1)     // Catch:{ all -> 0x0077 }
            r0 = 46
            return r0
        L_0x0060:
            boolean r0 = r3.seenCR     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x006e
            r0 = 0
            r3.seenCR = r0     // Catch:{ all -> 0x0077 }
            r0 = 10
            if (r2 != r0) goto L_0x006e
            r0 = 1
            r3.atBeginning = r0     // Catch:{ all -> 0x0077 }
        L_0x006e:
            r0 = 13
            if (r2 != r0) goto L_0x0075
            r0 = 1
            r3.seenCR = r0     // Catch:{ all -> 0x0077 }
        L_0x0075:
            monitor-exit(r1)     // Catch:{ all -> 0x0077 }
            return r2
        L_0x0077:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0077 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.p005io.DotTerminatedMessageReader.read():int");
    }

    public final int read(char[] cArr) {
        return read(cArr, 0, cArr.length);
    }

    public final int read(char[] cArr, int i, int i2) {
        if (i2 <= 0) {
            return 0;
        }
        synchronized (this.lock) {
            int read = read();
            if (read == -1) {
                return -1;
            }
            int i3 = i;
            do {
                int i4 = i;
                i++;
                cArr[i4] = (char) read;
                i2--;
                if (i2 <= 0) {
                    break;
                }
                read = read();
            } while (read != -1);
            int i5 = i - i3;
            return i5;
        }
    }

    public final void close() {
        synchronized (this.lock) {
            if (!this.eof) {
                do {
                } while (read() != -1);
            }
            this.eof = true;
            this.atBeginning = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        r4 = r2.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        if (r4.length() != 0) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String readLine() {
        /*
            r5 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Object r4 = r5.lock
            monitor-enter(r4)
        L_0x0008:
            int r3 = r5.read()     // Catch:{ all -> 0x002b }
            r0 = -1
            if (r3 == r0) goto L_0x0029
            r0 = 10
            if (r3 != r0) goto L_0x0024
            boolean r0 = r5.atBeginning     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0024
            int r0 = r2.length()     // Catch:{ all -> 0x002b }
            int r0 = r0 + -1
            r1 = 0
            java.lang.String r0 = r2.substring(r1, r0)     // Catch:{ all -> 0x002b }
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            return r0
        L_0x0024:
            char r0 = (char) r3     // Catch:{ all -> 0x002b }
            r2.append(r0)     // Catch:{ all -> 0x002b }
            goto L_0x0008
        L_0x0029:
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            goto L_0x002e
        L_0x002b:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            throw r2
        L_0x002e:
            java.lang.String r4 = r2.toString()
            int r0 = r4.length()
            if (r0 != 0) goto L_0x003a
            r0 = 0
            return r0
        L_0x003a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.p005io.DotTerminatedMessageReader.readLine():java.lang.String");
    }
}
