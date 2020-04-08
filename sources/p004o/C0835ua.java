package p004o;

import android.support.p000v4.media.TransportMediator;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.imap.IMAP;
import org.apache.commons.net.nntp.NNTP;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.apache.http.HttpStatus;

/* renamed from: o.ua */
public final class C0835ua {

    /* renamed from: Ą */
    private static int[] f5026 = {40, 8, 48, 16, 56, 24, 64, 32, 39, 7, 47, 15, 55, 23, 63, 31, 38, 6, 46, 14, 54, 22, 62, 30, 37, 5, 45, 13, 53, 21, 61, 29, 36, 4, 44, 12, 52, 20, 60, 28, 35, 3, 43, 11, 51, 19, 59, 27, 34, 2, 42, 10, 50, 18, 58, 26, 33, 1, 41, 9, 49, 17, 57, 25};

    /* renamed from: ą */
    private static int[] f5027 = {16, 7, 20, 21, 29, 12, 28, 17, 1, 15, 23, 26, 5, 18, 31, 10, 2, 8, 24, 14, 32, 27, 3, 9, 19, 13, 30, 6, 22, 11, 4, 25};

    /* renamed from: Ć */
    private static int[][] f5028 = {new int[]{TelnetCommand.EOR, 3, 65, TelnetCommand.f8995DO, 216, 116, 30, 71, 38, TelnetCommand.EOR, 251, 34, 179, 216, 132, 30, 57, 172, 167, 96, 98, 193, 205, 186, 92, FTPReply.FILE_STATUS_OK, 144, 89, 5, 59, 122, 133, 64, TelnetCommand.f8995DO, 30, 200, NNTPReply.NEW_NEWSGROUP_LIST_FOLLOWS, 138, 139, 33, 218, 67, 100, 159, 45, 20, 177, 114, TelnetCommand.f8993AO, 91, 200, 182, 156, 55, 118, TelnetCommand.EOF, 57, 160, 163, 5, 82, 110, 15, 217}, new int[]{167, 221, 13, FTPReply.SERVICE_NOT_READY, 158, 11, FTPReply.ENTERING_PASSIVE_MODE, 149, 96, 54, 54, 79, TelnetCommand.f8998GA, 96, 90, 163, 17, 36, 210, 135, 200, 82, 117, TelnetCommand.EOF, 187, 193, 76, 186, 36, TelnetCommand.DONT, IMAP.DEFAULT_PORT, 25, 218, 19, HttpStatus.SC_PROCESSING, 175, 73, 208, 144, 6, 140, 106, 251, 145, 55, 141, 13, FTPReply.SERVICE_NOT_READY, 191, 73, 17, TelnetCommand.f8999IP, 35, FTPReply.ENTERING_EPSV_MODE, HttpStatus.SC_PARTIAL_CONTENT, 59, 85, 188, 162, 87, 232, 34, 116, HttpStatus.SC_PARTIAL_CONTENT}, new int[]{44, FTPReply.SECURITY_DATA_EXCHANGE_COMPLETE, 193, 191, 74, 36, 31, 194, 121, 71, 162, 124, 182, 217, 104, 21, 128, 86, 93, 1, 51, TelnetCommand.f8995DO, TelnetCommand.f8999IP, 174, NNTPReply.ARTICLE_RETRIEVED_BODY_FOLLOWS, 48, 7, 155, FTPReply.ENTERING_EPSV_MODE, 131, 155, 104, 73, 180, 46, 131, 31, 194, 181, 124, 162, 25, 216, FTPReply.ENTERING_EPSV_MODE, 124, 47, 131, 218, TelnetCommand.f8996EC, 107, 144, TelnetCommand.DONT, 196, 1, 90, 151, 97, 166, 61, 64, 11, 88, 230, 61}, new int[]{77, 209, 178, 15, 40, 189, 228, FTPReply.SERVICE_NOT_READY, TelnetCommand.AYT, 74, 15, 147, 139, 23, 209, 164, 58, TelnetCommand.EOF, 201, 53, 147, 86, TransportMediator.KEYCODE_MEDIA_PLAY, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 85, 32, 160, TelnetCommand.DONT, 108, 137, 23, 98, 23, 98, 75, 177, 180, NNTPReply.ARTICLE_RETRIEVED_BODY_FOLLOWS, 209, 135, 201, 20, 60, 74, TransportMediator.KEYCODE_MEDIA_PLAY, 168, FTPReply.CLOSING_DATA_CONNECTION, FTPReply.DATA_CONNECTION_ALREADY_OPEN, 160, 159, TelnetCommand.AYT, 92, 106, 9, 141, 240, 15, FTPReply.ENTERING_PASSIVE_MODE, 83, 37, 149, 54, 40, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION}};

    /* renamed from: ȃ */
    private static int[] f5029 = {58, 50, 42, 34, 26, 18, 10, 2, 60, 52, 44, 36, 28, 20, 12, 4, 62, 54, 46, 38, 30, 22, 14, 6, 64, 56, 48, 40, 32, 24, 16, 8, 57, 49, 41, 33, 25, 17, 9, 1, 59, 51, 43, 35, 27, 19, 11, 3, 61, 53, 45, 37, 29, 21, 13, 5, 63, 55, 47, 39, 31, 23, 15, 7};

    /* renamed from: ˮ͈ */
    private static int[] f5030 = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: 櫯 */
    public static C0836ub f5031;

    /* renamed from: 鷭 */
    public static boolean f5032 = false;

    static {
    }

    /* renamed from: 鷭 */
    private static void m1534(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[8];
        for (int i2 = 0; i2 != 64; i2++) {
            int i3 = iArr2[i2] - 1;
            if ((iArr[((i3 >> 3) & 7) + i] & f5030[i3 & 7]) != 0) {
                int i4 = (i2 >> 3) & 7;
                iArr3[i4] = iArr3[i4] | f5030[i2 & 7];
            }
        }
        for (int i5 = 0; i5 < 8; i5++) {
            iArr[i + i5] = iArr3[i5];
        }
    }

    /* renamed from: 鷭 */
    private static void m1533(int[] iArr, int i) {
        int[] iArr2 = {((iArr[i + 7] << 5) | (iArr[i + 4] >> 3)) & 63, ((iArr[i + 4] << 1) | (iArr[i + 5] >> 7)) & 63, ((iArr[i + 4] << 5) | (iArr[i + 5] >> 3)) & 63, ((iArr[i + 5] << 1) | (iArr[i + 6] >> 7)) & 63, ((iArr[i + 5] << 5) | (iArr[i + 6] >> 3)) & 63, ((iArr[i + 6] << 1) | (iArr[i + 7] >> 7)) & 63, ((iArr[i + 6] << 5) | (iArr[i + 7] >> 3)) & 63, ((iArr[i + 7] << 1) | (iArr[i + 4] >> 7)) & 63};
        for (int i2 = 0; i2 != 4; i2++) {
            iArr2[i2] = (f5028[i2][iArr2[i2 * 2]] & 240) | (f5028[i2][iArr2[(i2 * 2) + 1]] & 15);
        }
        for (int i3 = 4; i3 < 8; i3++) {
            iArr2[i3] = 0;
        }
        for (int i4 = 0; i4 != 32; i4++) {
            int i5 = f5027[i4] - 1;
            if ((iArr2[i5 >> 3] & f5030[i5 & 7]) != 0) {
                int i6 = (i4 >> 3) + 4;
                iArr2[i6] = iArr2[i6] | f5030[i4 & 7];
            }
        }
        int i7 = i + 0;
        iArr[i7] = iArr[i7] ^ iArr2[4];
        int i8 = i + 1;
        iArr[i8] = iArr[i8] ^ iArr2[5];
        int i9 = i + 2;
        iArr[i9] = iArr[i9] ^ iArr2[6];
        int i10 = i + 3;
        iArr[i10] = iArr[i10] ^ iArr2[7];
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r0v13, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r0v13, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r8v0, types: [byte[]] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m1535(byte[] r8) {
        /*
            int r0 = r8.length
            int[] r4 = new int[r0]
            r3 = 0
            goto L_0x000b
        L_0x0005:
            byte r0 = r8[r3]
            r4[r3] = r0
            int r3 = r3 + 1
        L_0x000b:
            int r0 = r8.length
            if (r3 < r0) goto L_0x0005
            r3 = 0
            goto L_0x0038
        L_0x0010:
            r6 = r3
            r5 = r4
            r7 = r6
            goto L_0x0025
        L_0x0014:
            r0 = r5[r7]
            r0 = r0 & 15
            int r0 = r0 << 4
            r1 = r5[r7]
            r1 = r1 & 240(0xf0, float:3.36E-43)
            int r1 = r1 >>> 4
            r0 = r0 | r1
            r5[r7] = r0
            int r7 = r7 + 1
        L_0x0025:
            int r0 = r6 + 8
            if (r7 < r0) goto L_0x0014
            int[] r0 = f5029
            m1534(r4, r3, r0)
            m1533(r4, r3)
            int[] r0 = f5026
            m1534(r4, r3, r0)
            int r3 = r3 + 8
        L_0x0038:
            int r0 = r4.length
            if (r3 < r0) goto L_0x0010
            r3 = 0
            goto L_0x0044
        L_0x003d:
            r0 = r4[r3]
            byte r0 = (byte) r0
            r8[r3] = r0
            int r3 = r3 + 1
        L_0x0044:
            int r0 = r8.length
            if (r3 < r0) goto L_0x003d
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0835ua.m1535(byte[]):byte[]");
    }

    /* renamed from: 鷭 */
    private static C0785te[] m1538(C0607og ogVar, long j, File file, C0249cm cmVar) {
        int i;
        int i2;
        char c;
        String name = file.getName();
        C0785te[] teVarArr = null;
        int i3 = 0;
        byte[] bArr = new byte[16];
        ogVar.read(bArr, 0, bArr.length);
        long length = 0 + ((long) bArr.length);
        String r11 = C0622ot.m741(bArr, C0618op.LATIN);
        if (r11.equals("Master of Magic") || r11.equals("Master of Magic\u0000")) {
            byte[] bArr2 = new byte[14];
            ogVar.read(bArr2, 0, bArr2.length);
            long length2 = length + ((long) bArr2.length);
            long r13 = C0622ot.m735(ogVar.mo4030());
            long j2 = length2 + 4;
            int r10 = ogVar.mo4030();
            long j3 = j2 + 4;
            int r112 = ogVar.mo4030();
            long j4 = j3 + 4;
            int r12 = ogVar.mo4030();
            long j5 = 4;
            while (true) {
                j4 += j5;
                if (j4 >= 46 + r13) {
                    break;
                }
                j5 = ogVar.skip((46 + r13) - j4);
            }
            if ((r12 >> 8) == 1) {
                byte[] bArr3 = new byte[((int) (j - r13))];
                ogVar.read(bArr3, 0, bArr3.length);
                int i4 = (r112 - r10) - 7;
                int i5 = 0;
                if (cmVar != null) {
                    cmVar.mo4092(0, (long) i4);
                }
                teVarArr = new C0785te[i4];
                for (int i6 = 0; i6 < i4; i6++) {
                    C0785te teVar = new C0785te();
                    int r19 = i5 + C0622ot.m732(bArr3, i5) + 4;
                    byte r113 = C0622ot.m726(bArr3, r19 + 12);
                    if (r113 != 0) {
                        byte r9 = (byte) (C0622ot.m726(bArr3, i5) - 6);
                        byte[] bArr4 = new byte[r9];
                        C0622ot.m746(bArr4, bArr3, (int) r9, i5 + 6);
                        byte[] r15 = m1535(bArr4);
                        int r14 = C0622ot.m728(r15);
                        byte[] bArr5 = new byte[r14];
                        System.arraycopy(r15, 0, bArr5, 0, r14);
                        byte[] bArr6 = bArr5;
                        int i7 = 0;
                        String r92 = C0622ot.m741(bArr6, C0618op.KOREAN);
                        String substring = r92.substring(r92.length() - 4, r92.length());
                        if (r92.contains(".")) {
                            if (substring.compareTo(".gnd") == 0 || substring.compareTo(".gat") == 0 || substring.compareTo(".act") == 0 || substring.compareTo(".str") == 0) {
                                c = 1;
                            } else {
                                c = 4;
                            }
                            i7 = (C0622ot.m732(bArr3, r19) - C0622ot.m732(bArr3, r19 + 8)) - 715;
                            if (c == 4) {
                                int i8 = 10;
                                i2 = 1;
                                while (i7 >= i8) {
                                    i8 *= 10;
                                    i2++;
                                }
                            } else {
                                i2 = 0;
                            }
                        } else {
                            i2 = 0;
                        }
                        teVar.f4797 = i7;
                        teVar.f4796 = C0622ot.m732(bArr3, r19 + 4) - 37579;
                        teVar.f4795 = C0622ot.m732(bArr3, r19 + 8);
                        teVar.f4794 = C0622ot.m732(bArr3, r19 + 13) + 46;
                        teVar.f4790 = i2;
                        teVar.f4791 = r113;
                        teVar.f4792 = C0622ot.m741(bArr6, C0618op.KOREAN);
                        teVar.f4793 = file;
                        if (!teVar.f4792.isEmpty()) {
                            teVarArr[i3] = teVar;
                            i3++;
                        } else {
                            C0624ov.m759("parse_grf_data: failed to decode " + name + " entry " + i6);
                        }
                    }
                    i5 = r19 + 17;
                    if (cmVar != null) {
                        cmVar.mo4092((long) (i6 + 1), (long) i4);
                    }
                }
            } else if ((r12 >> 8) == 2) {
                int r122 = ogVar.mo4030();
                int r102 = ogVar.mo4030();
                if (((long) r122) > j - (j4 + 8)) {
                    throw new RuntimeException("Illegal data format: GRF compress entry size");
                }
                byte[] bArr7 = new byte[r122];
                ogVar.read(bArr7, 0, r122);
                ogVar.close();
                byte[] r17 = m1536(bArr7, r102, true);
                int i9 = r112 - 7;
                if (cmVar != null) {
                    cmVar.mo4092(0, (long) i9);
                }
                teVarArr = new C0785te[i9];
                int i10 = 0;
                int i11 = 0;
                while (i10 < i9) {
                    C0785te teVar2 = new C0785te();
                    try {
                        byte[] r142 = C0622ot.m725(r17, i11);
                        teVar2.f4792 = C0622ot.m741(r142, C0618op.KOREAN);
                        int length3 = r142.length + i11 + 1;
                        byte b = r17[length3 + 12];
                        if ((b & 1) != 0) {
                            int r132 = C0622ot.m732(r17, length3);
                            if (r17[length3 + 12] == 3) {
                                int i12 = 10;
                                i = 1;
                                while (r132 >= i12) {
                                    i12 *= 10;
                                    i++;
                                }
                            } else if (r17[length3 + 12] == 5) {
                                i = 0;
                            } else {
                                i = -1;
                            }
                            teVar2.f4797 = r132;
                            teVar2.f4796 = C0622ot.m732(r17, length3 + 4);
                            teVar2.f4795 = C0622ot.m732(r17, length3 + 8);
                            teVar2.f4794 = C0622ot.m732(r17, length3 + 13) + 46;
                            teVar2.f4790 = i;
                            teVar2.f4791 = (byte) b;
                            teVar2.f4793 = file;
                            if (!teVar2.f4792.isEmpty()) {
                                teVarArr[i3] = teVar2;
                                i3++;
                            } else {
                                C0624ov.m759("parse_grf_data: failed to decode " + name + " entry " + i10);
                            }
                        }
                        i11 = length3 + 17;
                        if (cmVar != null) {
                            cmVar.mo4092((long) (i10 + 1), (long) i9);
                        }
                        i10++;
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw new IOException("Faulty GRF name entry found in " + name + ". Attempt to read past the file list end.");
                    }
                }
            }
            C0785te[] teVarArr2 = (C0785te[]) Arrays.copyOf(teVarArr, i3);
            C0624ov.m756();
            return teVarArr2;
        }
        throw new IOException("Incorrect magic: " + C0622ot.m741(bArr, C0618op.LATIN));
    }

    /* renamed from: 鷭 */
    public static byte[] m1536(byte[] bArr, int i, boolean z) {
        Inflater inflater = new Inflater();
        inflater.setInput(bArr);
        try {
            byte[] bArr2 = new byte[i];
            int inflate = inflater.inflate(bArr2);
            if (!z || inflate == i) {
                return Arrays.copyOf(bArr2, inflate);
            }
            C0624ov.m756();
            return null;
        } catch (DataFormatException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: 鷭 */
    public static final void m1532(byte[] bArr, int i, int i2, int i3) {
        int i4;
        int i5 = 0;
        int i6 = 0;
        if (i3 < 3) {
            i4 = 3;
        } else if (i3 < 5) {
            i4 = i3 + 1;
        } else if (i3 < 7) {
            i4 = i3 + 9;
        } else {
            i4 = i3 + 15;
        }
        int[] iArr = new int[bArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            iArr[i7] = bArr[i7] & 255;
        }
        int i8 = 0;
        while (i8 * 8 < i) {
            if (i8 < 20 || (i2 == 0 && i8 % i4 == 0)) {
                m1534(iArr, i5, f5029);
                m1533(iArr, i5);
                m1534(iArr, i5, f5026);
            } else {
                if (i6 == 7 && i2 == 0) {
                    int[] iArr2 = new int[8];
                    for (int i9 = 0; i9 < 8; i9++) {
                        iArr2[i9] = iArr[i9 + i5];
                    }
                    i6 = 0;
                    iArr[i5 + 0] = iArr2[3];
                    iArr[i5 + 1] = iArr2[4];
                    iArr[i5 + 2] = iArr2[6];
                    iArr[i5 + 3] = iArr2[0];
                    iArr[i5 + 4] = iArr2[1];
                    iArr[i5 + 5] = iArr2[2];
                    iArr[i5 + 6] = iArr2[5];
                    int i10 = iArr2[7];
                    if (i10 == 0) {
                        i10 = 43;
                    } else if (i10 == 43) {
                        i10 = 0;
                    } else if (i10 == 1) {
                        i10 = 104;
                    } else if (i10 == 104) {
                        i10 = 1;
                    } else if (i10 == 72) {
                        i10 = NNTP.DEFAULT_PORT;
                    } else if (i10 == 119) {
                        i10 = 72;
                    } else if (i10 == 96) {
                        i10 = 255;
                    } else if (i10 == 255) {
                        i10 = 96;
                    } else if (i10 == 108) {
                        i10 = 128;
                    } else if (i10 == 128) {
                        i10 = 108;
                    } else if (i10 == 185) {
                        i10 = 192;
                    } else if (i10 == 192) {
                        i10 = 185;
                    } else if (i10 == 235) {
                        i10 = TelnetCommand.DONT;
                    } else if (i10 == 254) {
                        i10 = 235;
                    }
                    iArr[i5 + 7] = i10;
                }
                i6++;
            }
            i8++;
            i5 += 8;
        }
        for (int i11 = 0; i11 < iArr.length; i11++) {
            bArr[i11] = (byte) iArr[i11];
        }
    }

    /* renamed from: 鷭 */
    public static C0614ol m1531(C0785te teVar) {
        return teVar.mo4108();
    }

    /* renamed from: 鷭 */
    public static C0785te[] m1537(File file, C0249cm cmVar) {
        C0607og ogVar = new C0607og(new FileInputStream(file));
        try {
            C0785te[] r4 = m1538(ogVar, file.length(), file, cmVar);
            ogVar.close();
            return r4;
        } catch (Exception e) {
            ogVar.close();
            if (f5031 != null) {
                f5031.mo3632(file);
            }
            throw new C0826tv(e);
        } catch (IOException e2) {
            throw new C0826tv((Exception) e2);
        }
    }
}
