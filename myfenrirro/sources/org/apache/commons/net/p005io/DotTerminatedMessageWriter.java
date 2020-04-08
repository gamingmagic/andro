package org.apache.commons.net.p005io;

import java.io.Writer;
import org.apache.commons.net.SocketClient;

/* renamed from: org.apache.commons.net.io.DotTerminatedMessageWriter */
public final class DotTerminatedMessageWriter extends Writer {
    private static final int __LAST_WAS_CR_STATE = 1;
    private static final int __LAST_WAS_NL_STATE = 2;
    private static final int __NOTHING_SPECIAL_STATE = 0;
    private Writer __output;
    private int __state = 0;

    public DotTerminatedMessageWriter(Writer writer) {
        super(writer);
        this.__output = writer;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0022 in list []
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    public final void write(int r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.lock
            monitor-enter(r2)
            switch(r4) {
                case 10: goto L_0x0022;
                case 13: goto L_0x0016;
                case 46: goto L_0x003a;
                default: goto L_0x0006;
            }     // Catch:{ all -> 0x0050 }
        L_0x0006:
            goto L_0x0046     // Catch:{ all -> 0x0050 }
        L_0x0016:
            r0 = 1     // Catch:{ all -> 0x0050 }
            r3.__state = r0     // Catch:{ all -> 0x0050 }
            java.io.Writer r0 = r3.__output     // Catch:{ all -> 0x0050 }
            r1 = 13     // Catch:{ all -> 0x0050 }
            r0.write(r1)     // Catch:{ all -> 0x0050 }
            monitor-exit(r2)     // Catch:{ all -> 0x0050 }
            return
        L_0x0022:
            int r0 = r3.__state     // Catch:{ all -> 0x0050 }
            r1 = 1     // Catch:{ all -> 0x0050 }
            if (r0 == r1) goto L_0x002e     // Catch:{ all -> 0x0050 }
            java.io.Writer r0 = r3.__output     // Catch:{ all -> 0x0050 }
            r1 = 13     // Catch:{ all -> 0x0050 }
            r0.write(r1)     // Catch:{ all -> 0x0050 }
        L_0x002e:
            java.io.Writer r0 = r3.__output     // Catch:{ all -> 0x0050 }
            r1 = 10     // Catch:{ all -> 0x0050 }
            r0.write(r1)     // Catch:{ all -> 0x0050 }
            r0 = 2     // Catch:{ all -> 0x0050 }
            r3.__state = r0     // Catch:{ all -> 0x0050 }
            monitor-exit(r2)     // Catch:{ all -> 0x0050 }
            return
        L_0x003a:
            int r0 = r3.__state     // Catch:{ all -> 0x0050 }
            r1 = 2     // Catch:{ all -> 0x0050 }
            if (r0 != r1) goto L_0x0046     // Catch:{ all -> 0x0050 }
            java.io.Writer r0 = r3.__output     // Catch:{ all -> 0x0050 }
            r1 = 46     // Catch:{ all -> 0x0050 }
            r0.write(r1)     // Catch:{ all -> 0x0050 }
        L_0x0046:
            r0 = 0     // Catch:{ all -> 0x0050 }
            r3.__state = r0     // Catch:{ all -> 0x0050 }
            java.io.Writer r0 = r3.__output     // Catch:{ all -> 0x0050 }
            r0.write(r4)     // Catch:{ all -> 0x0050 }
            monitor-exit(r2)     // Catch:{ all -> 0x0050 }
            return
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0050 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.p005io.DotTerminatedMessageWriter.write(int):void");
    }

    public final void write(char[] cArr, int i, int i2) {
        synchronized (this.lock) {
            while (true) {
                int i3 = i2;
                i2 = i3 - 1;
                if (i3 > 0) {
                    int i4 = i;
                    i++;
                    write((int) cArr[i4]);
                }
            }
            while (true) {
            }
        }
    }

    public final void write(char[] cArr) {
        write(cArr, 0, cArr.length);
    }

    public final void write(String str) {
        write(str.toCharArray());
    }

    public final void write(String str, int i, int i2) {
        write(str.toCharArray(), i, i2);
    }

    public final void flush() {
        synchronized (this.lock) {
            this.__output.flush();
        }
    }

    public final void close() {
        synchronized (this.lock) {
            if (this.__output != null) {
                if (this.__state == 1) {
                    this.__output.write(10);
                } else if (this.__state != 2) {
                    this.__output.write(SocketClient.NETASCII_EOL);
                }
                this.__output.write(".\r\n");
                this.__output.flush();
                this.__output = null;
            }
        }
    }
}
