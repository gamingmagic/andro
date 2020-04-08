package org.apache.commons.net.p005io;

import java.io.BufferedReader;
import java.io.Reader;

/* renamed from: org.apache.commons.net.io.CRLFLineReader */
public final class CRLFLineReader extends BufferedReader {

    /* renamed from: CR */
    private static final char f8986CR = '\r';

    /* renamed from: LF */
    private static final char f8987LF = '\n';

    public CRLFLineReader(Reader reader) {
        super(reader);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
        r5 = r2.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        if (r5.length() != 0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0040, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String readLine() {
        /*
            r6 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r4 = 0
            java.lang.Object r5 = r6.lock
            monitor-enter(r5)
        L_0x0009:
            int r3 = r6.read()     // Catch:{ all -> 0x0031 }
            r0 = -1
            if (r3 == r0) goto L_0x002f
            if (r4 == 0) goto L_0x0023
            r0 = 10
            if (r3 != r0) goto L_0x0023
            int r0 = r2.length()     // Catch:{ all -> 0x0031 }
            int r0 = r0 + -1
            r1 = 0
            java.lang.String r0 = r2.substring(r1, r0)     // Catch:{ all -> 0x0031 }
            monitor-exit(r5)     // Catch:{ all -> 0x0031 }
            return r0
        L_0x0023:
            r0 = 13
            if (r3 != r0) goto L_0x0029
            r4 = 1
            goto L_0x002a
        L_0x0029:
            r4 = 0
        L_0x002a:
            char r0 = (char) r3     // Catch:{ all -> 0x0031 }
            r2.append(r0)     // Catch:{ all -> 0x0031 }
            goto L_0x0009
        L_0x002f:
            monitor-exit(r5)     // Catch:{ all -> 0x0031 }
            goto L_0x0034
        L_0x0031:
            r2 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0031 }
            throw r2
        L_0x0034:
            java.lang.String r5 = r2.toString()
            int r0 = r5.length()
            if (r0 != 0) goto L_0x0040
            r0 = 0
            return r0
        L_0x0040:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.p005io.CRLFLineReader.readLine():java.lang.String");
    }
}
