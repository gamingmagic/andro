package p004o;

import java.util.Arrays;

/* renamed from: o.yr */
public abstract class C0977yr extends C0976yq {

    /* renamed from: ĺ */
    public static final int[] f5877;

    /* renamed from: Ļ */
    public static final byte[] f5878;

    /* renamed from: Ľ */
    public static final int[] f5879;

    /* renamed from: Ŀ */
    public static final int[] f5880 = {2, 2, 3, 4, 5, 6, 6, 6};

    /* renamed from: ɕ */
    public static final int[] f5881;

    /* renamed from: ਓ */
    public static final int[] f5882;

    /* renamed from: Į */
    protected C0985yz[] f5883 = new C0985yz[4];

    /* renamed from: į */
    protected byte[] f5884 = new byte[1028];

    /* renamed from: ĸ */
    protected C0987za f5885 = new C0987za();

    /* renamed from: 㺗 */
    protected C0980yu f5886 = new C0980yu();

    /* renamed from: 䲑 */
    protected int f5887;

    /* renamed from: 䲕 */
    protected C0984yy f5888 = new C0984yy();

    /* renamed from: 崲 */
    protected int f5889;

    /* renamed from: 差 */
    protected C0982yw f5890 = new C0982yw();

    /* renamed from: 瞣 */
    protected int f5891;

    /* renamed from: 簇 */
    protected C0979yt[] f5892 = new C0979yt[4];

    /* renamed from: 黬 */
    protected int f5893;

    /* renamed from: 齴 */
    protected C0983yx f5894 = new C0983yx();

    static {
        int[] iArr = new int[28];
        iArr[1] = 1;
        iArr[2] = 2;
        iArr[3] = 3;
        iArr[4] = 4;
        iArr[5] = 5;
        iArr[6] = 6;
        iArr[7] = 7;
        iArr[8] = 8;
        iArr[9] = 10;
        iArr[10] = 12;
        iArr[11] = 14;
        iArr[12] = 16;
        iArr[13] = 20;
        iArr[14] = 24;
        iArr[15] = 28;
        iArr[16] = 32;
        iArr[17] = 40;
        iArr[18] = 48;
        iArr[19] = 56;
        iArr[20] = 64;
        iArr[21] = 80;
        iArr[22] = 96;
        iArr[23] = 112;
        iArr[24] = 128;
        iArr[25] = 160;
        iArr[26] = 192;
        iArr[27] = 224;
        f5877 = iArr;
        byte[] bArr = new byte[28];
        bArr[8] = 1;
        bArr[9] = 1;
        bArr[10] = 1;
        bArr[11] = 1;
        bArr[12] = 2;
        bArr[13] = 2;
        bArr[14] = 2;
        bArr[15] = 2;
        bArr[16] = 3;
        bArr[17] = 3;
        bArr[18] = 3;
        bArr[19] = 3;
        bArr[20] = 4;
        bArr[21] = 4;
        bArr[22] = 4;
        bArr[23] = 4;
        bArr[24] = 5;
        bArr[25] = 5;
        bArr[26] = 5;
        bArr[27] = 5;
        f5878 = bArr;
        int[] iArr2 = new int[48];
        iArr2[1] = 1;
        iArr2[2] = 2;
        iArr2[3] = 3;
        iArr2[4] = 4;
        iArr2[5] = 6;
        iArr2[6] = 8;
        iArr2[7] = 12;
        iArr2[8] = 16;
        iArr2[9] = 24;
        iArr2[10] = 32;
        iArr2[11] = 48;
        iArr2[12] = 64;
        iArr2[13] = 96;
        iArr2[14] = 128;
        iArr2[15] = 192;
        iArr2[16] = 256;
        iArr2[17] = 384;
        iArr2[18] = 512;
        iArr2[19] = 768;
        iArr2[20] = 1024;
        iArr2[21] = 1536;
        iArr2[22] = 2048;
        iArr2[23] = 3072;
        iArr2[24] = 4096;
        iArr2[25] = 6144;
        iArr2[26] = 8192;
        iArr2[27] = 12288;
        iArr2[28] = 16384;
        iArr2[29] = 24576;
        iArr2[30] = 32768;
        iArr2[31] = 49152;
        iArr2[32] = 65536;
        iArr2[33] = 98304;
        iArr2[34] = 131072;
        iArr2[35] = 196608;
        iArr2[36] = 262144;
        iArr2[37] = 327680;
        iArr2[38] = 393216;
        iArr2[39] = 458752;
        iArr2[40] = 524288;
        iArr2[41] = 589824;
        iArr2[42] = 655360;
        iArr2[43] = 720896;
        iArr2[44] = 786432;
        iArr2[45] = 851968;
        iArr2[46] = 917504;
        iArr2[47] = 983040;
        f5881 = iArr2;
        int[] iArr3 = new int[48];
        iArr3[4] = 1;
        iArr3[5] = 1;
        iArr3[6] = 2;
        iArr3[7] = 2;
        iArr3[8] = 3;
        iArr3[9] = 3;
        iArr3[10] = 4;
        iArr3[11] = 4;
        iArr3[12] = 5;
        iArr3[13] = 5;
        iArr3[14] = 6;
        iArr3[15] = 6;
        iArr3[16] = 7;
        iArr3[17] = 7;
        iArr3[18] = 8;
        iArr3[19] = 8;
        iArr3[20] = 9;
        iArr3[21] = 9;
        iArr3[22] = 10;
        iArr3[23] = 10;
        iArr3[24] = 11;
        iArr3[25] = 11;
        iArr3[26] = 12;
        iArr3[27] = 12;
        iArr3[28] = 13;
        iArr3[29] = 13;
        iArr3[30] = 14;
        iArr3[31] = 14;
        iArr3[32] = 15;
        iArr3[33] = 15;
        iArr3[34] = 16;
        iArr3[35] = 16;
        iArr3[36] = 16;
        iArr3[37] = 16;
        iArr3[38] = 16;
        iArr3[39] = 16;
        iArr3[40] = 16;
        iArr3[41] = 16;
        iArr3[42] = 16;
        iArr3[43] = 16;
        iArr3[44] = 16;
        iArr3[45] = 16;
        iArr3[46] = 16;
        iArr3[47] = 16;
        f5879 = iArr3;
        int[] iArr4 = new int[8];
        iArr4[1] = 4;
        iArr4[2] = 8;
        iArr4[3] = 16;
        iArr4[4] = 32;
        iArr4[5] = 64;
        iArr4[6] = 128;
        iArr4[7] = 192;
        f5882 = iArr4;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: CFG modification limit reached, blocks count: 236 */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02e7, code lost:
        if (mo4169() == false) goto L_0x0363;
     */
    /* renamed from: ˮ͈ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4177(boolean r11) {
        /*
            r10 = this;
            boolean r0 = r10.f5838
            if (r0 == 0) goto L_0x000a
            int r0 = r10.f5867
            r10.f5874 = r0
            goto L_0x035b
        L_0x000a:
            r10.mo4172(r11)
            boolean r0 = r10.mo4174()
            if (r0 != 0) goto L_0x0014
            return
        L_0x0014:
            if (r11 != 0) goto L_0x001d
            boolean r0 = r10.mo4169()
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            long r0 = r10.f5869
            r2 = 1
            long r0 = r0 - r2
            r10.f5869 = r0
            goto L_0x035b
        L_0x0026:
            int r0 = r10.f5874
            r1 = 4194303(0x3fffff, float:5.87747E-39)
            r0 = r0 & r1
            r10.f5874 = r0
            int r0 = r10.f6014
            int r1 = r10.f5860
            int r1 = r1 + -30
            if (r0 <= r1) goto L_0x003c
            boolean r0 = r10.mo4174()
            if (r0 == 0) goto L_0x0363
        L_0x003c:
            int r0 = r10.f5867
            int r1 = r10.f5874
            int r0 = r0 - r1
            r1 = 4194303(0x3fffff, float:5.87747E-39)
            r0 = r0 & r1
            r1 = 270(0x10e, float:3.78E-43)
            if (r0 >= r1) goto L_0x0057
            int r0 = r10.f5867
            int r1 = r10.f5874
            if (r0 == r1) goto L_0x0057
            r10.mo4173()
            boolean r0 = r10.f5838
            if (r0 == 0) goto L_0x0057
            return
        L_0x0057:
            int r0 = r10.f5891
            if (r0 == 0) goto L_0x0272
            o.yz[] r0 = r10.f5883
            int r1 = r10.f5889
            r0 = r0[r1]
            int r11 = r10.mo4178(r0)
            r0 = 256(0x100, float:3.59E-43)
            if (r11 != r0) goto L_0x0071
            boolean r0 = r10.mo4169()
            if (r0 != 0) goto L_0x035b
            goto L_0x0363
        L_0x0071:
            byte[] r0 = r10.f5858
            int r1 = r10.f5874
            int r2 = r1 + 1
            r10.f5874 = r2
            r6 = r11
            r11 = r10
            o.yt[] r2 = r10.f5892
            int r3 = r11.f5889
            r7 = r2[r3]
            int r2 = r7.f5905
            int r2 = r2 + 1
            r7.f5905 = r2
            int r2 = r7.f5904
            r7.f5909 = r2
            int r2 = r7.f5903
            r7.f5904 = r2
            int r2 = r7.f5910
            int r3 = r7.f5902
            int r2 = r2 - r3
            r7.f5903 = r2
            int r2 = r7.f5910
            r7.f5902 = r2
            int r2 = r7.f5912
            int r2 = r2 * 8
            int r3 = r7.f5913
            int r4 = r7.f5902
            int r3 = r3 * r4
            int r2 = r2 + r3
            int r3 = r7.f5911
            int r4 = r7.f5903
            int r3 = r3 * r4
            int r4 = r7.f5908
            int r5 = r7.f5904
            int r4 = r4 * r5
            int r3 = r3 + r4
            int r2 = r2 + r3
            int r3 = r7.f5906
            int r4 = r7.f5909
            int r3 = r3 * r4
            int r4 = r7.f5901
            int r5 = r11.f5887
            int r4 = r4 * r5
            int r3 = r3 + r4
            int r2 = r2 + r3
            int r2 = r2 >>> 3
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r8 = r2 - r6
            byte r2 = (byte) r6
            int r6 = r2 << 3
            int[] r2 = r7.f5907
            r3 = 0
            r3 = r2[r3]
            int r4 = java.lang.Math.abs(r6)
            int r3 = r3 + r4
            r4 = 0
            r2[r4] = r3
            int[] r2 = r7.f5907
            r3 = 1
            r3 = r2[r3]
            int r4 = r7.f5902
            int r4 = r6 - r4
            int r4 = java.lang.Math.abs(r4)
            int r3 = r3 + r4
            r4 = 1
            r2[r4] = r3
            int[] r2 = r7.f5907
            r3 = 2
            r3 = r2[r3]
            int r4 = r7.f5902
            int r4 = r4 + r6
            int r4 = java.lang.Math.abs(r4)
            int r3 = r3 + r4
            r4 = 2
            r2[r4] = r3
            int[] r2 = r7.f5907
            r3 = 3
            r3 = r2[r3]
            int r4 = r7.f5903
            int r4 = r6 - r4
            int r4 = java.lang.Math.abs(r4)
            int r3 = r3 + r4
            r4 = 3
            r2[r4] = r3
            int[] r2 = r7.f5907
            r3 = 4
            r3 = r2[r3]
            int r4 = r7.f5903
            int r4 = r4 + r6
            int r4 = java.lang.Math.abs(r4)
            int r3 = r3 + r4
            r4 = 4
            r2[r4] = r3
            int[] r2 = r7.f5907
            r3 = 5
            r3 = r2[r3]
            int r4 = r7.f5904
            int r4 = r6 - r4
            int r4 = java.lang.Math.abs(r4)
            int r3 = r3 + r4
            r4 = 5
            r2[r4] = r3
            int[] r2 = r7.f5907
            r3 = 6
            r3 = r2[r3]
            int r4 = r7.f5904
            int r4 = r4 + r6
            int r4 = java.lang.Math.abs(r4)
            int r3 = r3 + r4
            r4 = 6
            r2[r4] = r3
            int[] r2 = r7.f5907
            r3 = 7
            r3 = r2[r3]
            int r4 = r7.f5909
            int r4 = r6 - r4
            int r4 = java.lang.Math.abs(r4)
            int r3 = r3 + r4
            r4 = 7
            r2[r4] = r3
            int[] r2 = r7.f5907
            r3 = 8
            r3 = r2[r3]
            int r4 = r7.f5909
            int r4 = r4 + r6
            int r4 = java.lang.Math.abs(r4)
            int r3 = r3 + r4
            r4 = 8
            r2[r4] = r3
            int[] r2 = r7.f5907
            r3 = 9
            r3 = r2[r3]
            int r4 = r11.f5887
            int r4 = r6 - r4
            int r4 = java.lang.Math.abs(r4)
            int r3 = r3 + r4
            r4 = 9
            r2[r4] = r3
            int[] r2 = r7.f5907
            r3 = 10
            r3 = r2[r3]
            int r4 = r11.f5887
            int r4 = r4 + r6
            int r4 = java.lang.Math.abs(r4)
            int r3 = r3 + r4
            r4 = 10
            r2[r4] = r3
            int r2 = r7.f5912
            int r2 = r8 - r2
            byte r2 = (byte) r2
            r7.f5910 = r2
            int r2 = r7.f5910
            r11.f5887 = r2
            r7.f5912 = r8
            int r2 = r7.f5905
            r2 = r2 & 31
            if (r2 != 0) goto L_0x0259
            int[] r2 = r7.f5907
            r3 = 0
            r11 = r2[r3]
            r6 = 0
            int[] r2 = r7.f5907
            r3 = 0
            r4 = 0
            r2[r4] = r3
            r9 = 1
            goto L_0x01b0
        L_0x019e:
            int[] r2 = r7.f5907
            r2 = r2[r9]
            if (r2 >= r11) goto L_0x01a9
            int[] r2 = r7.f5907
            r11 = r2[r9]
            r6 = r9
        L_0x01a9:
            int[] r2 = r7.f5907
            r3 = 0
            r2[r9] = r3
            int r9 = r9 + 1
        L_0x01b0:
            int[] r2 = r7.f5907
            int r2 = r2.length
            if (r9 < r2) goto L_0x019e
            switch(r6) {
                case 1: goto L_0x01d2;
                case 2: goto L_0x01e0;
                case 3: goto L_0x01ee;
                case 4: goto L_0x01fc;
                case 5: goto L_0x020a;
                case 6: goto L_0x0218;
                case 7: goto L_0x0226;
                case 8: goto L_0x0233;
                case 9: goto L_0x0240;
                case 10: goto L_0x024d;
                default: goto L_0x01b8;
            }
        L_0x01b8:
            goto L_0x0259
        L_0x01d2:
            int r2 = r7.f5913
            r3 = -16
            if (r2 < r3) goto L_0x0259
            int r2 = r7.f5913
            int r2 = r2 + -1
            r7.f5913 = r2
            goto L_0x0259
        L_0x01e0:
            int r2 = r7.f5913
            r3 = 16
            if (r2 >= r3) goto L_0x0259
            int r2 = r7.f5913
            int r2 = r2 + 1
            r7.f5913 = r2
            goto L_0x0259
        L_0x01ee:
            int r2 = r7.f5911
            r3 = -16
            if (r2 < r3) goto L_0x0259
            int r2 = r7.f5911
            int r2 = r2 + -1
            r7.f5911 = r2
            goto L_0x0259
        L_0x01fc:
            int r2 = r7.f5911
            r3 = 16
            if (r2 >= r3) goto L_0x0259
            int r2 = r7.f5911
            int r2 = r2 + 1
            r7.f5911 = r2
            goto L_0x0259
        L_0x020a:
            int r2 = r7.f5908
            r3 = -16
            if (r2 < r3) goto L_0x0259
            int r2 = r7.f5908
            int r2 = r2 + -1
            r7.f5908 = r2
            goto L_0x0259
        L_0x0218:
            int r2 = r7.f5908
            r3 = 16
            if (r2 >= r3) goto L_0x0259
            int r2 = r7.f5908
            int r2 = r2 + 1
            r7.f5908 = r2
            goto L_0x0259
        L_0x0226:
            int r2 = r7.f5906
            r3 = -16
            if (r2 < r3) goto L_0x0259
            int r2 = r7.f5906
            int r2 = r2 + -1
            r7.f5906 = r2
            goto L_0x0259
        L_0x0233:
            int r2 = r7.f5906
            r3 = 16
            if (r2 >= r3) goto L_0x0259
            int r2 = r7.f5906
            int r2 = r2 + 1
            r7.f5906 = r2
            goto L_0x0259
        L_0x0240:
            int r2 = r7.f5901
            r3 = -16
            if (r2 < r3) goto L_0x0259
            int r2 = r7.f5901
            int r2 = r2 + -1
            r7.f5901 = r2
            goto L_0x0259
        L_0x024d:
            int r2 = r7.f5901
            r3 = 16
            if (r2 >= r3) goto L_0x0259
            int r2 = r7.f5901
            int r2 = r2 + 1
            r7.f5901 = r2
        L_0x0259:
            byte r2 = (byte) r8
            r0[r1] = r2
            int r0 = r10.f5889
            int r0 = r0 + 1
            r10.f5889 = r0
            int r1 = r10.f5893
            if (r0 != r1) goto L_0x0269
            r0 = 0
            r10.f5889 = r0
        L_0x0269:
            long r0 = r10.f5869
            r2 = 1
            long r0 = r0 - r2
            r10.f5869 = r0
            goto L_0x035b
        L_0x0272:
            o.yx r0 = r10.f5894
            int r11 = r10.mo4178(r0)
            r0 = 256(0x100, float:3.59E-43)
            if (r11 >= r0) goto L_0x0290
            byte[] r0 = r10.f5858
            int r1 = r10.f5874
            int r2 = r1 + 1
            r10.f5874 = r2
            byte r2 = (byte) r11
            r0[r1] = r2
            long r0 = r10.f5869
            r2 = 1
            long r0 = r0 - r2
            r10.f5869 = r0
            goto L_0x035b
        L_0x0290:
            r0 = 269(0x10d, float:3.77E-43)
            if (r11 <= r0) goto L_0x02df
            int[] r0 = f5877
            int r11 = r11 + -270
            r0 = r0[r11]
            int r6 = r0 + 3
            byte[] r0 = f5878
            byte r11 = r0[r11]
            if (r11 <= 0) goto L_0x02ad
            int r0 = r10.mo4247()
            int r1 = 16 - r11
            int r0 = r0 >>> r1
            int r6 = r6 + r0
            r10.mo4251(r11)
        L_0x02ad:
            o.yw r0 = r10.f5890
            int r11 = r10.mo4178(r0)
            int[] r0 = f5881
            r0 = r0[r11]
            int r7 = r0 + 1
            int[] r0 = f5879
            r11 = r0[r11]
            if (r11 <= 0) goto L_0x02ca
            int r0 = r10.mo4247()
            int r1 = 16 - r11
            int r0 = r0 >>> r1
            int r7 = r7 + r0
            r10.mo4251(r11)
        L_0x02ca:
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r7 < r0) goto L_0x02da
            int r6 = r6 + 1
            long r0 = (long) r7
            r2 = 262144(0x40000, double:1.295163E-318)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x02da
            int r6 = r6 + 1
        L_0x02da:
            r10.m1706(r6, r7)
            goto L_0x035b
        L_0x02df:
            r0 = 269(0x10d, float:3.77E-43)
            if (r11 != r0) goto L_0x02eb
            boolean r0 = r10.mo4169()
            if (r0 != 0) goto L_0x035b
            goto L_0x0363
        L_0x02eb:
            r0 = 256(0x100, float:3.59E-43)
            if (r11 != r0) goto L_0x02f8
            int r0 = r10.f5873
            int r1 = r10.f5856
            r10.m1706(r0, r1)
            goto L_0x035b
        L_0x02f8:
            r0 = 261(0x105, float:3.66E-43)
            if (r11 >= r0) goto L_0x033a
            int[] r0 = r10.f5842
            int r1 = r10.f5875
            int r2 = r11 + -256
            int r1 = r1 - r2
            r1 = r1 & 3
            r6 = r0[r1]
            o.za r0 = r10.f5885
            int r11 = r10.mo4178(r0)
            int[] r0 = f5877
            r0 = r0[r11]
            int r7 = r0 + 2
            byte[] r0 = f5878
            byte r11 = r0[r11]
            if (r11 <= 0) goto L_0x0324
            int r0 = r10.mo4247()
            int r1 = 16 - r11
            int r0 = r0 >>> r1
            int r7 = r7 + r0
            r10.mo4251(r11)
        L_0x0324:
            r0 = 257(0x101, float:3.6E-43)
            if (r6 < r0) goto L_0x0336
            int r7 = r7 + 1
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r6 < r0) goto L_0x0336
            int r7 = r7 + 1
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r6 < r0) goto L_0x0336
            int r7 = r7 + 1
        L_0x0336:
            r10.m1706(r7, r6)
            goto L_0x035b
        L_0x033a:
            r0 = 270(0x10e, float:3.78E-43)
            if (r11 >= r0) goto L_0x035b
            int[] r0 = f5882
            int r11 = r11 + -261
            r0 = r0[r11]
            int r6 = r0 + 1
            int[] r0 = f5880
            r11 = r0[r11]
            if (r11 <= 0) goto L_0x0357
            int r0 = r10.mo4247()
            int r1 = 16 - r11
            int r0 = r0 >>> r1
            int r6 = r6 + r0
            r10.mo4251(r11)
        L_0x0357:
            r0 = 2
            r10.m1706(r0, r6)
        L_0x035b:
            long r0 = r10.f5869
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0026
        L_0x0363:
            r11 = r10
            int r0 = r10.f5860
            int r1 = r11.f6014
            int r1 = r1 + 5
            if (r0 < r1) goto L_0x038f
            int r0 = r11.f5891
            if (r0 == 0) goto L_0x0382
            o.yz[] r0 = r11.f5883
            int r1 = r11.f5889
            r0 = r0[r1]
            int r0 = r11.mo4178(r0)
            r1 = 256(0x100, float:3.59E-43)
            if (r0 != r1) goto L_0x038f
            r11.mo4169()
            goto L_0x038f
        L_0x0382:
            o.yx r0 = r11.f5894
            int r0 = r11.mo4178(r0)
            r1 = 269(0x10d, float:3.77E-43)
            if (r0 != r1) goto L_0x038f
            r11.mo4169()
        L_0x038f:
            r10.mo4173()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0977yr.mo4177(boolean):void");
    }

    /* renamed from: 鷭 */
    private void m1706(int i, int i2) {
        int[] iArr = this.f5842;
        int i3 = this.f5875;
        this.f5875 = i3 + 1;
        iArr[i3 & 3] = i2;
        this.f5856 = i2;
        this.f5873 = i;
        this.f5869 -= (long) i;
        int i4 = this.f5874 - i2;
        if (i4 >= 4194004 || this.f5874 >= 4194004) {
            while (true) {
                int i5 = i;
                i--;
                if (i5 != 0) {
                    int i6 = i4;
                    i4++;
                    this.f5858[this.f5874] = this.f5858[i6 & 4194303];
                    this.f5874 = (this.f5874 + 1) & 4194303;
                } else {
                    return;
                }
            }
        } else {
            byte[] bArr = this.f5858;
            int i7 = this.f5874;
            this.f5874 = i7 + 1;
            int i8 = i4;
            int i9 = i4 + 1;
            bArr[i7] = this.f5858[i8];
            byte[] bArr2 = this.f5858;
            int i10 = this.f5874;
            this.f5874 = i10 + 1;
            int i11 = i9;
            int i12 = i9 + 1;
            bArr2[i10] = this.f5858[i11];
            while (i > 2) {
                i--;
                byte[] bArr3 = this.f5858;
                int i13 = this.f5874;
                this.f5874 = i13 + 1;
                int i14 = i12;
                i12++;
                bArr3[i13] = this.f5858[i14];
            }
        }
    }

    /* renamed from: 鷭 */
    protected static void m1707(byte[] bArr, int i, C0981yv yvVar, int i2) {
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        Arrays.fill(iArr, 0);
        Arrays.fill(yvVar.mo4179(), 0);
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr[i + i3] & 15;
            iArr[b] = iArr[b] + 1;
        }
        iArr[0] = 0;
        iArr2[0] = 0;
        yvVar.f5915[0] = 0;
        yvVar.f5916[0] = 0;
        long j = 0;
        for (int i4 = 1; i4 < 16; i4++) {
            long j2 = (((long) iArr[i4]) + j) * 2;
            j = j2;
            long j3 = j2 << (15 - i4);
            long j4 = j3;
            if (j3 > 65535) {
                j4 = 65535;
            }
            yvVar.f5916[i4] = (int) j4;
            int[] iArr3 = yvVar.f5915;
            int i5 = iArr3[i4 - 1] + iArr[i4 - 1];
            iArr3[i4] = i5;
            iArr2[i4] = i5;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            if (bArr[i + i6] != 0) {
                int[] r0 = yvVar.mo4179();
                byte b2 = bArr[i + i6] & 15;
                int i7 = iArr2[b2];
                iArr2[b2] = i7 + 1;
                r0[i7] = i6;
            }
        }
        yvVar.f5917 = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public final int mo4178(C0981yv yvVar) {
        int i;
        long r4 = (long) (mo4247() & 65534);
        int[] iArr = yvVar.f5916;
        if (r4 < ((long) iArr[8])) {
            if (r4 < ((long) iArr[4])) {
                if (r4 < ((long) iArr[2])) {
                    if (r4 < ((long) iArr[1])) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                } else if (r4 < ((long) iArr[3])) {
                    i = 3;
                } else {
                    i = 4;
                }
            } else if (r4 < ((long) iArr[6])) {
                if (r4 < ((long) iArr[5])) {
                    i = 5;
                } else {
                    i = 6;
                }
            } else if (r4 < ((long) iArr[7])) {
                i = 7;
            } else {
                i = 8;
            }
        } else if (r4 < ((long) iArr[12])) {
            if (r4 < ((long) iArr[10])) {
                if (r4 < ((long) iArr[9])) {
                    i = 9;
                } else {
                    i = 10;
                }
            } else if (r4 < ((long) iArr[11])) {
                i = 11;
            } else {
                i = 12;
            }
        } else if (r4 >= ((long) iArr[14])) {
            i = 15;
        } else if (r4 < ((long) iArr[13])) {
            i = 13;
        } else {
            i = 14;
        }
        mo4251(i);
        int i2 = yvVar.f5915[i] + ((((int) r4) - iArr[i - 1]) >>> (16 - i));
        if (i2 >= yvVar.f5917) {
            i2 = 0;
        }
        return yvVar.mo4179()[i2];
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 167 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean mo4169() {
        /*
            r7 = this;
            r0 = 19
            byte[] r3 = new byte[r0]
            r0 = 1028(0x404, float:1.44E-42)
            byte[] r4 = new byte[r0]
            int r0 = r7.f6014
            int r1 = r7.f5860
            int r1 = r1 + -25
            if (r0 <= r1) goto L_0x0018
            boolean r0 = r7.mo4174()
            if (r0 != 0) goto L_0x0018
            r0 = 0
            return r0
        L_0x0018:
            int r5 = r7.mo4247()
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r5
            r7.f5891 = r0
            r0 = r5 & 16384(0x4000, float:2.2959E-41)
            if (r0 != 0) goto L_0x002c
            byte[] r0 = r7.f5884
            r1 = 0
            java.util.Arrays.fill(r0, r1)
        L_0x002c:
            r0 = 2
            r7.mo4251(r0)
            int r0 = r7.f5891
            if (r0 == 0) goto L_0x004e
            int r0 = r5 >>> 12
            r0 = r0 & 3
            int r0 = r0 + 1
            r7.f5893 = r0
            int r0 = r7.f5889
            int r1 = r7.f5893
            if (r0 < r1) goto L_0x0045
            r0 = 0
            r7.f5889 = r0
        L_0x0045:
            r0 = 2
            r7.mo4251(r0)
            int r0 = r7.f5893
            int r5 = r0 * 257
            goto L_0x0050
        L_0x004e:
            r5 = 374(0x176, float:5.24E-43)
        L_0x0050:
            r6 = 0
            goto L_0x0061
        L_0x0052:
            int r0 = r7.mo4247()
            int r0 = r0 >>> 12
            byte r0 = (byte) r0
            r3[r6] = r0
            r0 = 4
            r7.mo4251(r0)
            int r6 = r6 + 1
        L_0x0061:
            r0 = 19
            if (r6 < r0) goto L_0x0052
            o.yu r0 = r7.f5886
            r1 = 0
            r2 = 19
            m1707(r3, r1, r0, r2)
            r6 = 0
            goto L_0x00e4
        L_0x0070:
            int r0 = r7.f6014
            int r1 = r7.f5860
            int r1 = r1 + -5
            if (r0 <= r1) goto L_0x0080
            boolean r0 = r7.mo4174()
            if (r0 != 0) goto L_0x0080
            r0 = 0
            return r0
        L_0x0080:
            o.yu r0 = r7.f5886
            int r3 = r7.mo4178(r0)
            r0 = 16
            if (r3 >= r0) goto L_0x0098
            byte[] r0 = r7.f5884
            byte r0 = r0[r6]
            int r0 = r0 + r3
            r0 = r0 & 15
            byte r0 = (byte) r0
            r4[r6] = r0
            int r6 = r6 + 1
            goto L_0x00e4
        L_0x0098:
            r0 = 16
            if (r3 != r0) goto L_0x00b9
            int r0 = r7.mo4247()
            int r0 = r0 >>> 14
            int r3 = r0 + 3
            r0 = 2
            r7.mo4251(r0)
            goto L_0x00b1
        L_0x00a9:
            int r0 = r6 + -1
            byte r0 = r4[r0]
            r4[r6] = r0
            int r6 = r6 + 1
        L_0x00b1:
            r0 = r3
            int r3 = r3 + -1
            if (r0 <= 0) goto L_0x00e4
            if (r6 < r5) goto L_0x00a9
            goto L_0x00e4
        L_0x00b9:
            r0 = 17
            if (r3 != r0) goto L_0x00ca
            int r0 = r7.mo4247()
            int r0 = r0 >>> 13
            int r3 = r0 + 3
            r0 = 3
            r7.mo4251(r0)
            goto L_0x00dd
        L_0x00ca:
            int r0 = r7.mo4247()
            int r0 = r0 >>> 9
            int r3 = r0 + 11
            r0 = 7
            r7.mo4251(r0)
            goto L_0x00dd
        L_0x00d7:
            r0 = r6
            int r6 = r6 + 1
            r1 = 0
            r4[r0] = r1
        L_0x00dd:
            r0 = r3
            int r3 = r3 + -1
            if (r0 <= 0) goto L_0x00e4
            if (r6 < r5) goto L_0x00d7
        L_0x00e4:
            if (r6 < r5) goto L_0x0070
            int r0 = r7.f6014
            int r1 = r7.f5860
            if (r0 <= r1) goto L_0x00ee
            r0 = 1
            return r0
        L_0x00ee:
            int r0 = r7.f5891
            if (r0 == 0) goto L_0x0106
            r6 = 0
            goto L_0x0101
        L_0x00f4:
            int r0 = r6 * 257
            o.yz[] r1 = r7.f5883
            r1 = r1[r6]
            r2 = 257(0x101, float:3.6E-43)
            m1707(r4, r0, r1, r2)
            int r6 = r6 + 1
        L_0x0101:
            int r0 = r7.f5893
            if (r6 < r0) goto L_0x00f4
            goto L_0x0120
        L_0x0106:
            o.yx r0 = r7.f5894
            r1 = 0
            r2 = 298(0x12a, float:4.18E-43)
            m1707(r4, r1, r0, r2)
            o.yw r0 = r7.f5890
            r1 = 298(0x12a, float:4.18E-43)
            r2 = 48
            m1707(r4, r1, r0, r2)
            o.za r0 = r7.f5885
            r1 = 346(0x15a, float:4.85E-43)
            r2 = 28
            m1707(r4, r1, r0, r2)
        L_0x0120:
            r3 = 0
            goto L_0x012a
        L_0x0122:
            byte[] r0 = r7.f5884
            byte r1 = r4[r3]
            r0[r3] = r1
            int r3 = r3 + 1
        L_0x012a:
            byte[] r0 = r7.f5884
            int r0 = r0.length
            if (r3 < r0) goto L_0x0122
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0977yr.mo4169():boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: ȃ */
    public final void mo4176(boolean z) {
        if (!z) {
            this.f5889 = 0;
            this.f5887 = 0;
            this.f5893 = 1;
            Arrays.fill(this.f5892, new C0979yt());
            Arrays.fill(this.f5884, 0);
        }
    }
}
