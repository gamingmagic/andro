package org.apache.commons.net.tftp;

import android.support.p000v4.internal.view.SupportMenu;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketException;
import org.apache.commons.net.p005io.FromNetASCIIOutputStream;

public class TFTPClient extends TFTP {
    public static final int DEFAULT_MAX_TIMEOUTS = 5;
    private int __maxTimeouts = 5;

    public void setMaxTimeouts(int i) {
        if (i <= 0) {
            this.__maxTimeouts = 1;
        } else {
            this.__maxTimeouts = i;
        }
    }

    public int getMaxTimeouts() {
        return this.__maxTimeouts;
    }

    public int receiveFile(String str, int i, OutputStream outputStream, InetAddress inetAddress, int i2) {
        int i3;
        TFTPAckPacket tFTPAckPacket = new TFTPAckPacket(inetAddress, i2, 0);
        beginBufferedOps();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1;
        if (i == 0) {
            outputStream = new FromNetASCIIOutputStream(outputStream);
        }
        TFTPPacket tFTPReadRequestPacket = new TFTPReadRequestPacket(inetAddress, i2, str, i);
        do {
            bufferedSend(tFTPReadRequestPacket);
            while (true) {
                try {
                    TFTPPacket bufferedReceive = bufferedReceive();
                    if (i6 == 0) {
                        i5 = bufferedReceive.getPort();
                        tFTPAckPacket.setPort(i5);
                        if (!inetAddress.equals(bufferedReceive.getAddress())) {
                            inetAddress = bufferedReceive.getAddress();
                            tFTPAckPacket.setAddress(inetAddress);
                            tFTPReadRequestPacket.setAddress(inetAddress);
                        }
                    }
                    if (!inetAddress.equals(bufferedReceive.getAddress()) || bufferedReceive.getPort() != i5) {
                        bufferedSend(new TFTPErrorPacket(bufferedReceive.getAddress(), bufferedReceive.getPort(), 5, "Unexpected host or port."));
                    } else {
                        switch (bufferedReceive.getType()) {
                            case 3:
                                TFTPDataPacket tFTPDataPacket = (TFTPDataPacket) bufferedReceive;
                                TFTPDataPacket tFTPDataPacket2 = tFTPDataPacket;
                                i7 = tFTPDataPacket.getDataLength();
                                i6 = tFTPDataPacket2.getBlockNumber();
                                if (i6 != i8) {
                                    discardPackets();
                                    if (i8 == 0) {
                                        i3 = SupportMenu.USER_MASK;
                                        continue;
                                    } else {
                                        i3 = i8 - 1;
                                        continue;
                                    }
                                    if (i6 == i3) {
                                        break;
                                    }
                                } else {
                                    try {
                                        outputStream.write(tFTPDataPacket2.getData(), tFTPDataPacket2.getDataOffset(), i7);
                                        i8++;
                                        if (i8 > 65535) {
                                            i8 = 0;
                                        }
                                        tFTPAckPacket.setBlockNumber(i6);
                                        tFTPReadRequestPacket = tFTPAckPacket;
                                        i4 += i7;
                                        break;
                                    } catch (IOException e) {
                                        bufferedSend(new TFTPErrorPacket(inetAddress, i5, 3, "File write failed."));
                                        endBufferedOps();
                                        throw e;
                                    }
                                }
                            case 5:
                                TFTPErrorPacket tFTPErrorPacket = (TFTPErrorPacket) bufferedReceive;
                                endBufferedOps();
                                throw new IOException("Error code " + tFTPErrorPacket.getError() + " received: " + tFTPErrorPacket.getMessage());
                            default:
                                endBufferedOps();
                                throw new IOException("Received unexpected packet type.");
                        }
                    }
                } catch (SocketException unused) {
                    if (1 >= this.__maxTimeouts) {
                        endBufferedOps();
                        throw new IOException("Connection timed out.");
                    }
                } catch (InterruptedIOException unused2) {
                    if (1 >= this.__maxTimeouts) {
                        endBufferedOps();
                        throw new IOException("Connection timed out.");
                    }
                } catch (TFTPPacketException e2) {
                    endBufferedOps();
                    throw new IOException("Bad packet: " + e2.getMessage());
                }
            }
        } while (i7 == 512);
        bufferedSend(tFTPReadRequestPacket);
        endBufferedOps();
        return i4;
    }

    public int receiveFile(String str, int i, OutputStream outputStream, String str2, int i2) {
        return receiveFile(str, i, outputStream, InetAddress.getByName(str2), i2);
    }

    public int receiveFile(String str, int i, OutputStream outputStream, InetAddress inetAddress) {
        return receiveFile(str, i, outputStream, inetAddress, 69);
    }

    public int receiveFile(String str, int i, OutputStream outputStream, String str2) {
        return receiveFile(str, i, outputStream, InetAddress.getByName(str2), 69);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [org.apache.commons.net.tftp.TFTPDataPacket] */
    /* JADX WARNING: type inference failed for: r0v1, types: [org.apache.commons.net.tftp.TFTPWriteRequestPacket] */
    /* JADX WARNING: type inference failed for: r15v1 */
    /* JADX WARNING: type inference failed for: r15v2, types: [org.apache.commons.net.tftp.TFTPPacket] */
    /* JADX WARNING: type inference failed for: r15v3 */
    /* JADX WARNING: type inference failed for: r15v6 */
    /* JADX WARNING: type inference failed for: r15v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014f, code lost:
        if (r9 > 0) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0151, code lost:
        if (r12 != false) goto L_0x002c;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r15v3
      assigns: []
      uses: []
      mth insns count: 120
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0144  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void sendFile(java.lang.String r14, int r15, java.io.InputStream r16, java.net.InetAddress r17, int r18) {
        /*
            r13 = this;
            org.apache.commons.net.tftp.TFTPDataPacket r10 = new org.apache.commons.net.tftp.TFTPDataPacket
            r1 = r17
            r2 = r18
            byte[] r4 = r13._sendBuffer
            r0 = r10
            r3 = 0
            r5 = 4
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11 = 1
            r13.beginBufferedOps()
            r9 = 0
            r8 = 0
            r7 = 0
            r12 = 0
            if (r15 != 0) goto L_0x0022
            org.apache.commons.net.io.ToNetASCIIInputStream r0 = new org.apache.commons.net.io.ToNetASCIIInputStream
            r1 = r16
            r0.<init>(r1)
            r16 = r0
        L_0x0022:
            org.apache.commons.net.tftp.TFTPWriteRequestPacket r0 = new org.apache.commons.net.tftp.TFTPWriteRequestPacket
            r1 = r17
            r2 = r18
            r0.<init>(r1, r2, r14, r15)
            r15 = r0
        L_0x002c:
            r13.bufferedSend(r15)
        L_0x002f:
            org.apache.commons.net.tftp.TFTPPacket r14 = r13.bufferedReceive()     // Catch:{ SocketException -> 0x0035, InterruptedIOException -> 0x0047, TFTPPacketException -> 0x0059 }
            goto L_0x0076
        L_0x0035:
            int r0 = r13.__maxTimeouts
            r1 = 1
            if (r1 < r0) goto L_0x0045
            r13.endBufferedOps()
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Connection timed out."
            r0.<init>(r1)
            throw r0
        L_0x0045:
            goto L_0x014f
        L_0x0047:
            int r0 = r13.__maxTimeouts
            r1 = 1
            if (r1 < r0) goto L_0x0057
            r13.endBufferedOps()
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Connection timed out."
            r0.<init>(r1)
            throw r0
        L_0x0057:
            goto L_0x014f
        L_0x0059:
            r14 = move-exception
            r13.endBufferedOps()
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Bad packet: "
            r1.<init>(r2)
            java.lang.String r2 = r14.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0076:
            if (r11 == 0) goto L_0x009a
            r11 = 0
            int r8 = r14.getPort()
            r10.setPort(r8)
            java.net.InetAddress r0 = r14.getAddress()
            r1 = r17
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x009a
            java.net.InetAddress r17 = r14.getAddress()
            r0 = r17
            r10.setAddress(r0)
            r0 = r17
            r15.setAddress(r0)
        L_0x009a:
            java.net.InetAddress r0 = r14.getAddress()
            r1 = r17
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0113
            int r0 = r14.getPort()
            if (r0 != r8) goto L_0x0113
            int r0 = r14.getType()
            switch(r0) {
                case 4: goto L_0x00ee;
                case 5: goto L_0x00c0;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            goto L_0x0108
        L_0x00c0:
            r0 = r14
            org.apache.commons.net.tftp.TFTPErrorPacket r0 = (org.apache.commons.net.tftp.TFTPErrorPacket) r0
            r14 = r0
            r13.endBufferedOps()
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error code "
            r1.<init>(r2)
            int r2 = r14.getError()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " received: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r14.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00ee:
            r0 = r14
            org.apache.commons.net.tftp.TFTPAckPacket r0 = (org.apache.commons.net.tftp.TFTPAckPacket) r0
            int r0 = r0.getBlockNumber()
            if (r0 != r7) goto L_0x0103
            int r7 = r7 + 1
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r7 <= r0) goto L_0x00ff
            r7 = 0
        L_0x00ff:
            if (r12 == 0) goto L_0x0128
            goto L_0x0153
        L_0x0103:
            r13.discardPackets()
            goto L_0x002f
        L_0x0108:
            r13.endBufferedOps()
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Received unexpected packet type."
            r0.<init>(r1)
            throw r0
        L_0x0113:
            org.apache.commons.net.tftp.TFTPErrorPacket r0 = new org.apache.commons.net.tftp.TFTPErrorPacket
            java.net.InetAddress r1 = r14.getAddress()
            int r2 = r14.getPort()
            java.lang.String r3 = "Unexpected host or port."
            r4 = 5
            r0.<init>(r1, r2, r4, r3)
            r14 = r0
            r13.bufferedSend(r14)
            goto L_0x014f
        L_0x0128:
            r15 = 512(0x200, float:7.175E-43)
            r18 = 4
            r9 = 0
        L_0x012d:
            if (r15 <= 0) goto L_0x0140
            byte[] r0 = r13._sendBuffer
            r1 = r16
            r2 = r18
            int r14 = r1.read(r0, r2, r15)
            if (r14 <= 0) goto L_0x0140
            int r18 = r18 + r14
            int r15 = r15 - r14
            int r9 = r9 + r14
            goto L_0x012d
        L_0x0140:
            r0 = 512(0x200, float:7.175E-43)
            if (r9 >= r0) goto L_0x0145
            r12 = 1
        L_0x0145:
            r10.setBlockNumber(r7)
            byte[] r0 = r13._sendBuffer
            r1 = 4
            r10.setData(r0, r1, r9)
            r15 = r10
        L_0x014f:
            if (r9 > 0) goto L_0x002c
            if (r12 != 0) goto L_0x002c
        L_0x0153:
            r13.endBufferedOps()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.tftp.TFTPClient.sendFile(java.lang.String, int, java.io.InputStream, java.net.InetAddress, int):void");
    }

    public void sendFile(String str, int i, InputStream inputStream, String str2, int i2) {
        sendFile(str, i, inputStream, InetAddress.getByName(str2), i2);
    }

    public void sendFile(String str, int i, InputStream inputStream, InetAddress inetAddress) {
        sendFile(str, i, inputStream, inetAddress, 69);
    }

    public void sendFile(String str, int i, InputStream inputStream, String str2) {
        sendFile(str, i, inputStream, InetAddress.getByName(str2), 69);
    }
}
