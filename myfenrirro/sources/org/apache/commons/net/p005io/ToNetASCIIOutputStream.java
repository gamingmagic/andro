package org.apache.commons.net.p005io;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: org.apache.commons.net.io.ToNetASCIIOutputStream */
public final class ToNetASCIIOutputStream extends FilterOutputStream {
    private boolean __lastWasCR = false;

    public ToNetASCIIOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x001c in list []
        	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:43)
        	at jadx.core.dex.instructions.SwitchNode.initBlocks(SwitchNode.java:60)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.lambda$initBlocksInTargetNodes$0(BlockSplitter.java:71)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.initBlocksInTargetNodes(BlockSplitter.java:68)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.visit(BlockSplitter.java:53)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    public final synchronized void write(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            switch(r3) {
                case 10: goto L_0x001c;
                case 13: goto L_0x0010;
                default: goto L_0x0004;
            }     // Catch:{ all -> 0x0031 }
        L_0x0004:
            goto L_0x0027     // Catch:{ all -> 0x0031 }
        L_0x0010:
            r0 = 1     // Catch:{ all -> 0x0031 }
            r2.__lastWasCR = r0     // Catch:{ all -> 0x0031 }
            java.io.OutputStream r0 = r2.out     // Catch:{ all -> 0x0031 }
            r1 = 13     // Catch:{ all -> 0x0031 }
            r0.write(r1)     // Catch:{ all -> 0x0031 }
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            return     // Catch:{ all -> 0x0031 }
        L_0x001c:
            boolean r0 = r2.__lastWasCR     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x0027     // Catch:{ all -> 0x0031 }
            java.io.OutputStream r0 = r2.out     // Catch:{ all -> 0x0031 }
            r1 = 13     // Catch:{ all -> 0x0031 }
            r0.write(r1)     // Catch:{ all -> 0x0031 }
        L_0x0027:
            r0 = 0     // Catch:{ all -> 0x0031 }
            r2.__lastWasCR = r0     // Catch:{ all -> 0x0031 }
            java.io.OutputStream r0 = r2.out     // Catch:{ all -> 0x0031 }
            r0.write(r3)     // Catch:{ all -> 0x0031 }
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            return     // Catch:{ all -> 0x0031 }
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.p005io.ToNetASCIIOutputStream.write(int):void");
    }

    public final synchronized void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        while (true) {
            int i3 = i2;
            i2 = i3 - 1;
            if (i3 > 0) {
                int i4 = i;
                i++;
                write((int) bArr[i4]);
            }
        }
    }
}
