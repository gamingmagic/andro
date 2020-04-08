package p004o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import org.apache.http.HttpStatus;

/* renamed from: o.yp */
public final class C0975yp extends C0977yr {

    /* renamed from: ˮ͈ */
    public static int[] f5804;

    /* renamed from: ō */
    private boolean f5805;

    /* renamed from: Ŏ */
    private int f5806;

    /* renamed from: ŏ */
    private int f5807;

    /* renamed from: 䍼 */
    private List<Integer> f5808 = new ArrayList();

    /* renamed from: 䕌 */
    private C0988zb f5809;

    /* renamed from: 櫯 */
    public int f5810;

    /* renamed from: 漐 */
    private boolean f5811;

    /* renamed from: 釫 */
    private C1002zo f5812 = new C1002zo();

    /* renamed from: 釯 */
    private int f5813;

    /* renamed from: 釳 */
    private long f5814;

    /* renamed from: 鷭 */
    public final C0990zd f5815 = new C0990zd();

    /* renamed from: ꑣ */
    private List<C0978ys> f5816 = new ArrayList();

    /* renamed from: 냆 */
    private boolean f5817;

    /* renamed from: 졸 */
    private List<C0978ys> f5818 = new ArrayList();

    /* renamed from: 진 */
    private byte[] f5819 = new byte[HttpStatus.SC_NOT_FOUND];

    static {
        int[] iArr = new int[19];
        iArr[0] = 4;
        iArr[1] = 2;
        iArr[2] = 2;
        iArr[3] = 2;
        iArr[4] = 2;
        iArr[5] = 2;
        iArr[6] = 2;
        iArr[7] = 2;
        iArr[8] = 2;
        iArr[9] = 2;
        iArr[10] = 2;
        iArr[11] = 2;
        iArr[12] = 2;
        iArr[13] = 2;
        iArr[14] = 2;
        iArr[15] = 2;
        iArr[16] = 14;
        iArr[18] = 12;
        f5804 = iArr;
    }

    public C0975yp(C0974yo yoVar) {
        this.f5840 = yoVar;
        this.f5858 = null;
        this.f5838 = false;
        this.f5839 = false;
        this.f5841 = false;
    }

    /* renamed from: 鷭 */
    public final void mo4169() {
        this.f5858 = new byte[4194304];
        this.f6014 = 0;
        mo4172(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:191:0x034d, code lost:
        m1684();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00af, code lost:
        if (r5.f5817 != false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        if (m1682() != false) goto L_0x00b7;
     */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4170(int r14, boolean r15) {
        /*
            r13 = this;
            o.yo r0 = r13.f5840
            o.yb r0 = r0.f5782
            byte r0 = r0.f5709
            r1 = 48
            if (r0 != r1) goto L_0x0047
            r5 = r13
            r0 = 65536(0x10000, float:9.18355E-41)
            byte[] r6 = new byte[r0]
        L_0x000f:
            o.yo r0 = r5.f5840
            int r1 = r6.length
            long r1 = (long) r1
            long r3 = r5.f5869
            long r1 = java.lang.Math.min(r1, r3)
            int r1 = (int) r1
            r2 = 0
            int r7 = r0.mo4166(r6, r2, r1)
            if (r7 == 0) goto L_0x0047
            r0 = -1
            if (r7 == r0) goto L_0x0047
            long r0 = (long) r7
            long r2 = r5.f5869
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x002d
            r0 = r7
            goto L_0x0030
        L_0x002d:
            long r0 = r5.f5869
            int r0 = (int) r0
        L_0x0030:
            r7 = r0
            o.yo r0 = r5.f5840
            r1 = 0
            r0.mo4165(r6, r1, r7)
            long r0 = r5.f5869
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x000f
            long r0 = r5.f5869
            long r2 = (long) r7
            long r0 = r0 - r2
            r5.f5869 = r0
            goto L_0x000f
        L_0x0047:
            switch(r14) {
                case 15: goto L_0x0062;
                case 20: goto L_0x0066;
                case 26: goto L_0x0066;
                case 29: goto L_0x006a;
                case 36: goto L_0x006a;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x0350
        L_0x0062:
            r13.mo4175(r15)
            return
        L_0x0066:
            r13.mo4177(r15)
            return
        L_0x006a:
            r6 = r15
            r5 = r13
            r0 = 60
            int[] r7 = new int[r0]
            r0 = 60
            byte[] r14 = new byte[r0]
            r0 = 1
            r0 = r7[r0]
            if (r0 != 0) goto L_0x009b
            r15 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            goto L_0x0096
        L_0x007e:
            int[] r0 = f5804
            r11 = r0[r10]
            r12 = 0
            goto L_0x0090
        L_0x0084:
            r7[r9] = r15
            byte r0 = (byte) r8
            r14[r9] = r0
            int r12 = r12 + 1
            int r9 = r9 + 1
            r0 = 1
            int r0 = r0 << r8
            int r15 = r15 + r0
        L_0x0090:
            if (r12 < r11) goto L_0x0084
            int r10 = r10 + 1
            int r8 = r8 + 1
        L_0x0096:
            int[] r0 = f5804
            int r0 = r0.length
            if (r10 < r0) goto L_0x007e
        L_0x009b:
            r0 = 1
            r5.f5811 = r0
            boolean r0 = r5.f5838
            if (r0 != 0) goto L_0x00b7
            r5.mo4172(r6)
            boolean r0 = r5.mo4174()
            if (r0 == 0) goto L_0x0350
            if (r6 == 0) goto L_0x00b1
            boolean r0 = r5.f5817
            if (r0 != 0) goto L_0x00b7
        L_0x00b1:
            boolean r0 = r5.m1682()
            if (r0 == 0) goto L_0x0350
        L_0x00b7:
            boolean r0 = r5.f5805
            if (r0 != 0) goto L_0x0350
        L_0x00bb:
            int r0 = r5.f5874
            r1 = 4194303(0x3fffff, float:5.87747E-39)
            r0 = r0 & r1
            r5.f5874 = r0
            int r0 = r5.f6014
            int r1 = r5.f5857
            if (r0 <= r1) goto L_0x00cf
            boolean r0 = r5.mo4174()
            if (r0 == 0) goto L_0x034d
        L_0x00cf:
            int r0 = r5.f5867
            int r1 = r5.f5874
            int r0 = r0 - r1
            r1 = 4194303(0x3fffff, float:5.87747E-39)
            r0 = r0 & r1
            r1 = 260(0x104, float:3.64E-43)
            if (r0 >= r1) goto L_0x00f5
            int r0 = r5.f5867
            int r1 = r5.f5874
            if (r0 == r1) goto L_0x00f5
            r5.m1684()
            long r0 = r5.f5814
            long r2 = r5.f5869
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0350
            boolean r0 = r5.f5838
            if (r0 == 0) goto L_0x00f5
            r0 = 0
            r5.f5811 = r0
            return
        L_0x00f5:
            o.zb r0 = r5.f5809
            o.zb r1 = p004o.C0988zb.BLOCK_PPM
            if (r0 != r1) goto L_0x01e0
            o.zd r0 = r5.f5815
            int r15 = r0.mo4190()
            r0 = -1
            if (r15 != r0) goto L_0x0109
            r0 = 1
            r5.f5805 = r0
            goto L_0x034d
        L_0x0109:
            int r0 = r5.f5810
            if (r15 != r0) goto L_0x01d3
            o.zd r0 = r5.f5815
            int r8 = r0.mo4190()
            if (r8 != 0) goto L_0x011d
            boolean r0 = r5.m1682()
            if (r0 != 0) goto L_0x00bb
            goto L_0x034d
        L_0x011d:
            r0 = 2
            if (r8 == r0) goto L_0x034d
            r0 = -1
            if (r8 == r0) goto L_0x034d
            r0 = 3
            if (r8 != r0) goto L_0x018e
            r15 = r5
            o.zd r0 = r5.f5815
            int r6 = r0.mo4190()
            r0 = -1
            if (r6 != r0) goto L_0x0133
            r0 = 0
            goto L_0x018a
        L_0x0133:
            r0 = r6 & 7
            int r8 = r0 + 1
            r0 = 7
            if (r8 != r0) goto L_0x0149
            o.zd r0 = r15.f5815
            int r9 = r0.mo4190()
            r0 = -1
            if (r9 != r0) goto L_0x0146
            r0 = 0
            goto L_0x018a
        L_0x0146:
            int r8 = r9 + 7
            goto L_0x0168
        L_0x0149:
            r0 = 8
            if (r8 != r0) goto L_0x0168
            o.zd r0 = r15.f5815
            int r9 = r0.mo4190()
            r0 = -1
            if (r9 != r0) goto L_0x0159
            r0 = 0
            goto L_0x018a
        L_0x0159:
            o.zd r0 = r15.f5815
            int r10 = r0.mo4190()
            r0 = -1
            if (r10 != r0) goto L_0x0164
            r0 = 0
            goto L_0x018a
        L_0x0164:
            int r0 = r9 * 256
            int r8 = r0 + r10
        L_0x0168:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r10 = 0
            goto L_0x0184
        L_0x016f:
            o.zd r0 = r15.f5815
            int r11 = r0.mo4190()
            r0 = -1
            if (r11 != r0) goto L_0x017a
            r0 = 0
            goto L_0x018a
        L_0x017a:
            byte r0 = (byte) r11
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r9.add(r0)
            int r10 = r10 + 1
        L_0x0184:
            if (r10 < r8) goto L_0x016f
            boolean r0 = r15.m1690(r6, (java.util.List<java.lang.Byte>) r9)
        L_0x018a:
            if (r0 != 0) goto L_0x00bb
            goto L_0x034d
        L_0x018e:
            r0 = 4
            if (r8 != r0) goto L_0x01bf
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            goto L_0x01af
        L_0x0196:
            o.zd r0 = r5.f5815
            int r15 = r0.mo4190()
            r0 = -1
            if (r15 != r0) goto L_0x01a1
            r11 = 1
            goto L_0x01ad
        L_0x01a1:
            r0 = 3
            if (r12 != r0) goto L_0x01a7
            r10 = r15 & 255(0xff, float:3.57E-43)
            goto L_0x01ad
        L_0x01a7:
            int r0 = r9 << 8
            r1 = r15 & 255(0xff, float:3.57E-43)
            int r9 = r0 + r1
        L_0x01ad:
            int r12 = r12 + 1
        L_0x01af:
            r0 = 4
            if (r12 >= r0) goto L_0x01b4
            if (r11 == 0) goto L_0x0196
        L_0x01b4:
            if (r11 != 0) goto L_0x034d
            int r0 = r10 + 32
            int r1 = r9 + 2
            r5.m1686(r0, r1)
            goto L_0x00bb
        L_0x01bf:
            r0 = 5
            if (r8 != r0) goto L_0x01d3
            o.zd r0 = r5.f5815
            int r9 = r0.mo4190()
            r0 = -1
            if (r9 == r0) goto L_0x034d
            int r0 = r9 + 4
            r1 = 1
            r5.m1686(r0, r1)
            goto L_0x00bb
        L_0x01d3:
            byte[] r0 = r5.f5858
            int r1 = r5.f5874
            int r2 = r1 + 1
            r5.f5874 = r2
            byte r2 = (byte) r15
            r0[r1] = r2
            goto L_0x00bb
        L_0x01e0:
            o.yx r0 = r5.f5894
            int r15 = r5.mo4178(r0)
            r0 = 256(0x100, float:3.59E-43)
            if (r15 >= r0) goto L_0x01f7
            byte[] r0 = r5.f5858
            int r1 = r5.f5874
            int r2 = r1 + 1
            r5.f5874 = r2
            byte r2 = (byte) r15
            r0[r1] = r2
            goto L_0x00bb
        L_0x01f7:
            r0 = 271(0x10f, float:3.8E-43)
            if (r15 < r0) goto L_0x0286
            int[] r0 = f5877
            int r15 = r15 + -271
            r0 = r0[r15]
            int r8 = r0 + 3
            byte[] r0 = f5878
            byte r15 = r0[r15]
            if (r15 <= 0) goto L_0x0214
            int r0 = r5.mo4247()
            int r1 = 16 - r15
            int r0 = r0 >>> r1
            int r8 = r8 + r0
            r5.mo4251(r15)
        L_0x0214:
            o.yw r0 = r5.f5890
            int r9 = r5.mo4178(r0)
            r0 = r7[r9]
            int r10 = r0 + 1
            byte r15 = r14[r9]
            if (r15 <= 0) goto L_0x0267
            r0 = 9
            if (r9 <= r0) goto L_0x025c
            r0 = 4
            if (r15 <= r0) goto L_0x0238
            int r0 = r5.mo4247()
            int r1 = 20 - r15
            int r0 = r0 >>> r1
            int r0 = r0 << 4
            int r10 = r10 + r0
            int r0 = r15 + -4
            r5.mo4251(r0)
        L_0x0238:
            int r0 = r5.f5807
            if (r0 <= 0) goto L_0x0246
            int r0 = r5.f5807
            int r0 = r0 + -1
            r5.f5807 = r0
            int r0 = r5.f5806
            int r10 = r10 + r0
            goto L_0x0267
        L_0x0246:
            o.yy r0 = r5.f5888
            int r11 = r5.mo4178(r0)
            r0 = 16
            if (r11 != r0) goto L_0x0258
            r0 = 15
            r5.f5807 = r0
            int r0 = r5.f5806
            int r10 = r10 + r0
            goto L_0x0267
        L_0x0258:
            int r10 = r10 + r11
            r5.f5806 = r11
            goto L_0x0267
        L_0x025c:
            int r0 = r5.mo4247()
            int r1 = 16 - r15
            int r0 = r0 >>> r1
            int r10 = r10 + r0
            r5.mo4251(r15)
        L_0x0267:
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r10 < r0) goto L_0x0277
            int r8 = r8 + 1
            long r0 = (long) r10
            r2 = 262144(0x40000, double:1.295163E-318)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0277
            int r8 = r8 + 1
        L_0x0277:
            r5.m1683(r10)
            r12 = r10
            r15 = r8
            r6 = r5
            r5.f5856 = r12
            r6.f5873 = r15
            r5.m1686(r8, r10)
            goto L_0x00bb
        L_0x0286:
            r0 = 256(0x100, float:3.59E-43)
            if (r15 != r0) goto L_0x02be
            r15 = r5
            int r6 = r5.mo4247()
            r9 = 0
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r6
            if (r0 == 0) goto L_0x029c
            r8 = 1
            r0 = 1
            r15.mo4251(r0)
            goto L_0x02a8
        L_0x029c:
            r9 = 1
            r0 = r6 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x02a3
            r8 = 1
            goto L_0x02a4
        L_0x02a3:
            r8 = 0
        L_0x02a4:
            r0 = 2
            r15.mo4251(r0)
        L_0x02a8:
            if (r8 == 0) goto L_0x02ac
            r0 = 0
            goto L_0x02ad
        L_0x02ac:
            r0 = 1
        L_0x02ad:
            r15.f5817 = r0
            if (r9 != 0) goto L_0x02b7
            boolean r0 = r15.m1682()
            if (r0 != 0) goto L_0x02b9
        L_0x02b7:
            r0 = 0
            goto L_0x02ba
        L_0x02b9:
            r0 = 1
        L_0x02ba:
            if (r0 != 0) goto L_0x00bb
            goto L_0x034d
        L_0x02be:
            r0 = 257(0x101, float:3.6E-43)
            if (r15 != r0) goto L_0x02ca
            boolean r0 = r5.m1681()
            if (r0 != 0) goto L_0x00bb
            goto L_0x034d
        L_0x02ca:
            r0 = 258(0x102, float:3.62E-43)
            if (r15 != r0) goto L_0x02db
            int r0 = r5.f5873
            if (r0 == 0) goto L_0x00bb
            int r0 = r5.f5873
            int r1 = r5.f5856
            r5.m1686(r0, r1)
            goto L_0x00bb
        L_0x02db:
            r0 = 263(0x107, float:3.69E-43)
            if (r15 >= r0) goto L_0x0320
            int r8 = r15 + -259
            int[] r0 = r5.f5842
            r9 = r0[r8]
            r10 = r8
            goto L_0x02f1
        L_0x02e7:
            int[] r0 = r5.f5842
            int r1 = r10 + -1
            r1 = r0[r1]
            r0[r10] = r1
            int r10 = r10 + -1
        L_0x02f1:
            if (r10 > 0) goto L_0x02e7
            int[] r0 = r5.f5842
            r1 = 0
            r0[r1] = r9
            o.za r0 = r5.f5885
            int r10 = r5.mo4178(r0)
            int[] r0 = f5877
            r0 = r0[r10]
            int r11 = r0 + 2
            byte[] r0 = f5878
            byte r15 = r0[r10]
            if (r15 <= 0) goto L_0x0315
            int r0 = r5.mo4247()
            int r1 = 16 - r15
            int r0 = r0 >>> r1
            int r11 = r11 + r0
            r5.mo4251(r15)
        L_0x0315:
            r15 = r11
            r6 = r5
            r5.f5856 = r9
            r6.f5873 = r15
            r5.m1686(r11, r9)
            goto L_0x00bb
        L_0x0320:
            r0 = 272(0x110, float:3.81E-43)
            if (r15 >= r0) goto L_0x00bb
            int[] r0 = f5882
            int r15 = r15 + -263
            r0 = r0[r15]
            int r8 = r0 + 1
            int[] r0 = f5880
            r15 = r0[r15]
            if (r15 <= 0) goto L_0x033d
            int r0 = r5.mo4247()
            int r1 = 16 - r15
            int r0 = r0 >>> r1
            int r8 = r8 + r0
            r5.mo4251(r15)
        L_0x033d:
            r5.m1683(r8)
            r12 = r8
            r6 = r5
            r5.f5856 = r12
            r0 = 2
            r6.f5873 = r0
            r0 = 2
            r5.m1686(r0, r8)
            goto L_0x00bb
        L_0x034d:
            r5.m1684()
        L_0x0350:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0975yp.mo4170(int, boolean):void");
    }

    /* renamed from: ˮ͍ */
    private void m1684() {
        int i = this.f5867;
        int i2 = (this.f5874 - i) & 4194303;
        int i3 = 0;
        while (i3 < this.f5818.size()) {
            C0978ys ysVar = (C0978ys) this.f5818.get(i3);
            if (ysVar != null) {
                if (ysVar.f5897) {
                    ysVar.f5897 = false;
                } else {
                    int i4 = ysVar.f5900;
                    int i5 = ysVar.f5899;
                    if (((i4 - i) & 4194303) >= i2) {
                        continue;
                    } else {
                        if (i != i4) {
                            m1687(i, i4);
                            i = i4;
                            i2 = (this.f5874 - i) & 4194303;
                        }
                        if (i5 <= i2) {
                            int i6 = (i4 + i5) & 4194303;
                            if (i4 < i6 || i6 == 0) {
                                this.f5812.mo4252(0, this.f5858, i4, i5);
                            } else {
                                int i7 = 4194304 - i4;
                                this.f5812.mo4252(0, this.f5858, i4, i7);
                                this.f5812.mo4252(i7, this.f5858, 0, i6);
                            }
                            C1009zv zvVar = ((C0978ys) this.f5816.get(ysVar.f5895)).f5896;
                            C1009zv zvVar2 = ysVar.f5896;
                            if (zvVar.f6105.size() > 64) {
                                zvVar2.f6105.setSize(zvVar.f6105.size());
                                for (int i8 = 0; i8 < zvVar.f6105.size() - 64; i8++) {
                                    zvVar2.f6105.set(i8 + 64, (Byte) zvVar.f6105.get(i8 + 64));
                                }
                            }
                            m1688(zvVar2);
                            if (zvVar2.f6105.size() > 64) {
                                if (zvVar.f6105.size() < zvVar2.f6105.size()) {
                                    zvVar.f6105.setSize(zvVar2.f6105.size());
                                }
                                for (int i9 = 0; i9 < zvVar2.f6105.size() - 64; i9++) {
                                    zvVar.f6105.set(i9 + 64, (Byte) zvVar2.f6105.get(i9 + 64));
                                }
                            } else {
                                zvVar.f6105.clear();
                            }
                            int i10 = zvVar2.f6103;
                            int i11 = zvVar2.f6104;
                            byte[] bArr = new byte[i11];
                            for (int i12 = 0; i12 < i11; i12++) {
                                bArr[i12] = this.f5812.f6023[i10 + i12];
                            }
                            this.f5818.set(i3, null);
                            while (i3 + 1 < this.f5818.size()) {
                                C0978ys ysVar2 = (C0978ys) this.f5818.get(i3 + 1);
                                if (ysVar2 == null || ysVar2.f5900 != i4 || ysVar2.f5899 != i11 || ysVar2.f5897) {
                                    break;
                                }
                                this.f5812.mo4252(0, bArr, 0, i11);
                                C1009zv zvVar3 = ((C0978ys) this.f5816.get(ysVar2.f5895)).f5896;
                                C1009zv zvVar4 = ysVar2.f5896;
                                if (zvVar3.f6105.size() > 64) {
                                    zvVar4.f6105.setSize(zvVar3.f6105.size());
                                    for (int i13 = 0; i13 < zvVar3.f6105.size() - 64; i13++) {
                                        zvVar4.f6105.set(i13 + 64, (Byte) zvVar3.f6105.get(i13 + 64));
                                    }
                                }
                                m1688(zvVar4);
                                if (zvVar4.f6105.size() > 64) {
                                    if (zvVar3.f6105.size() < zvVar4.f6105.size()) {
                                        zvVar3.f6105.setSize(zvVar4.f6105.size());
                                    }
                                    for (int i14 = 0; i14 < zvVar4.f6105.size() - 64; i14++) {
                                        zvVar3.f6105.set(i14 + 64, (Byte) zvVar4.f6105.get(i14 + 64));
                                    }
                                } else {
                                    zvVar3.f6105.clear();
                                }
                                int i15 = zvVar4.f6103;
                                i11 = zvVar4.f6104;
                                bArr = new byte[i11];
                                for (int i16 = 0; i16 < i11; i16++) {
                                    bArr[i16] = ((Byte) zvVar4.f6105.get(i15 + i16)).byteValue();
                                }
                                i3++;
                                this.f5818.set(i3, null);
                            }
                            this.f5840.mo4165(bArr, 0, i11);
                            this.f5841 = true;
                            this.f5814 += (long) i11;
                            i = i6;
                            i2 = (this.f5874 - i) & 4194303;
                        } else {
                            for (int i17 = i3; i17 < this.f5818.size(); i17++) {
                                C0978ys ysVar3 = (C0978ys) this.f5818.get(i17);
                                if (ysVar3 != null && ysVar3.f5897) {
                                    ysVar3.f5897 = false;
                                }
                            }
                            this.f5867 = i;
                            return;
                        }
                    }
                }
            }
            i3++;
        }
        m1687(i, this.f5874);
        this.f5867 = this.f5874;
    }

    /* renamed from: 鷭 */
    private void m1687(int i, int i2) {
        if (i2 != i) {
            this.f5841 = true;
        }
        if (i2 < i) {
            m1689(this.f5858, i, (-i) & 4194303);
            m1689(this.f5858, 0, i2);
            this.f5839 = true;
            return;
        }
        m1689(this.f5858, i, i2 - i);
    }

    /* renamed from: 鷭 */
    private void m1689(byte[] bArr, int i, int i2) {
        if (this.f5814 < this.f5869) {
            int i3 = i2;
            long j = this.f5869 - this.f5814;
            if (((long) i2) > j) {
                i3 = (int) j;
            }
            this.f5840.mo4165(bArr, i, i3);
            this.f5814 += (long) i2;
        }
    }

    /* renamed from: ˮ͈ */
    private void m1683(int i) {
        this.f5842[3] = this.f5842[2];
        this.f5842[2] = this.f5842[1];
        this.f5842[1] = this.f5842[0];
        this.f5842[0] = i;
    }

    /* renamed from: 櫯 */
    private void m1686(int i, int i2) {
        int i3 = this.f5874 - i2;
        if (i3 < 0 || i3 >= 4194044 || this.f5874 >= 4194044) {
            while (true) {
                int i4 = i;
                i--;
                if (i4 != 0) {
                    int i5 = i3;
                    i3++;
                    this.f5858[this.f5874] = this.f5858[i5 & 4194303];
                    this.f5874 = (this.f5874 + 1) & 4194303;
                } else {
                    return;
                }
            }
        } else {
            do {
                byte[] bArr = this.f5858;
                int i6 = this.f5874;
                this.f5874 = i6 + 1;
                int i7 = i3;
                i3++;
                bArr[i6] = this.f5858[i7];
                i--;
            } while (i > 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public final void mo4172(boolean z) {
        if (!z) {
            this.f5817 = false;
            Arrays.fill(this.f5842, 0);
            this.f5875 = 0;
            this.f5856 = 0;
            this.f5873 = 0;
            Arrays.fill(this.f5819, 0);
            this.f5874 = 0;
            this.f5867 = 0;
            this.f5810 = 2;
            m1685();
        }
        mo4246();
        this.f5805 = false;
        this.f5814 = 0;
        this.f5860 = 0;
        this.f5857 = 0;
        mo4176(z);
    }

    /* renamed from: 岱 */
    private void m1685() {
        this.f5808.clear();
        this.f5813 = 0;
        this.f5816.clear();
        this.f5818.clear();
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 179 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
    /* renamed from: Ȋ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1682() {
        /*
            r9 = this;
            r0 = 20
            byte[] r4 = new byte[r0]
            r0 = 404(0x194, float:5.66E-43)
            byte[] r5 = new byte[r0]
            int r0 = r9.f6014
            int r1 = r9.f5860
            int r1 = r1 + -25
            if (r0 <= r1) goto L_0x0018
            boolean r0 = r9.mo4174()
            if (r0 != 0) goto L_0x0018
            r0 = 0
            return r0
        L_0x0018:
            int r0 = r9.f6015
            int r0 = 8 - r0
            r0 = r0 & 7
            r9.mo4251(r0)
            int r0 = r9.mo4247()
            r0 = r0 & -1
            long r0 = (long) r0
            r6 = r0
            r2 = 32768(0x8000, double:1.61895E-319)
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x003e
            o.zb r0 = p004o.C0988zb.BLOCK_PPM
            r9.f5809 = r0
            o.zd r0 = r9.f5815
            boolean r0 = r0.mo4191(r9)
            return r0
        L_0x003e:
            o.zb r0 = p004o.C0988zb.BLOCK_LZ
            r9.f5809 = r0
            r0 = 0
            r9.f5806 = r0
            r0 = 0
            r9.f5807 = r0
            r0 = 16384(0x4000, double:8.0948E-320)
            long r0 = r0 & r6
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0057
            byte[] r0 = r9.f5819
            r1 = 0
            java.util.Arrays.fill(r0, r1)
        L_0x0057:
            r0 = 2
            r9.mo4251(r0)
            r6 = 0
            goto L_0x009a
        L_0x005e:
            int r0 = r9.mo4247()
            int r0 = r0 >>> 12
            r7 = r0 & 255(0xff, float:3.57E-43)
            r0 = 4
            r9.mo4251(r0)
            r0 = 15
            if (r7 != r0) goto L_0x0095
            int r0 = r9.mo4247()
            int r0 = r0 >>> 12
            r8 = r0 & 255(0xff, float:3.57E-43)
            r0 = 4
            r9.mo4251(r0)
            if (r8 != 0) goto L_0x0081
            r0 = 15
            r4[r6] = r0
            goto L_0x0098
        L_0x0081:
            int r8 = r8 + 2
            goto L_0x008a
        L_0x0084:
            r0 = r6
            int r6 = r6 + 1
            r1 = 0
            r4[r0] = r1
        L_0x008a:
            r0 = r8
            int r8 = r8 + -1
            if (r0 <= 0) goto L_0x0092
            int r0 = r4.length
            if (r6 < r0) goto L_0x0084
        L_0x0092:
            int r6 = r6 + -1
            goto L_0x0098
        L_0x0095:
            byte r0 = (byte) r7
            r4[r6] = r0
        L_0x0098:
            int r6 = r6 + 1
        L_0x009a:
            r0 = 20
            if (r6 < r0) goto L_0x005e
            o.yu r0 = r9.f5886
            r1 = 0
            r2 = 20
            m1707(r4, r1, r0, r2)
            r7 = 0
            goto L_0x0132
        L_0x00a9:
            int r0 = r9.f6014
            int r1 = r9.f5860
            int r1 = r1 + -5
            if (r0 <= r1) goto L_0x00b9
            boolean r0 = r9.mo4174()
            if (r0 != 0) goto L_0x00b9
            r0 = 0
            return r0
        L_0x00b9:
            o.yu r0 = r9.f5886
            int r8 = r9.mo4178(r0)
            r0 = 16
            if (r8 >= r0) goto L_0x00d1
            byte[] r0 = r9.f5819
            byte r0 = r0[r7]
            int r0 = r0 + r8
            r0 = r0 & 15
            byte r0 = (byte) r0
            r5[r7] = r0
            int r7 = r7 + 1
            goto L_0x0132
        L_0x00d1:
            r0 = 18
            if (r8 >= r0) goto L_0x0105
            r0 = 16
            if (r8 != r0) goto L_0x00e6
            int r0 = r9.mo4247()
            int r0 = r0 >>> 13
            int r4 = r0 + 3
            r0 = 3
            r9.mo4251(r0)
            goto L_0x00fb
        L_0x00e6:
            int r0 = r9.mo4247()
            int r0 = r0 >>> 9
            int r4 = r0 + 11
            r0 = 7
            r9.mo4251(r0)
            goto L_0x00fb
        L_0x00f3:
            int r0 = r7 + -1
            byte r0 = r5[r0]
            r5[r7] = r0
            int r7 = r7 + 1
        L_0x00fb:
            r0 = r4
            int r4 = r4 + -1
            if (r0 <= 0) goto L_0x0132
            r0 = 404(0x194, float:5.66E-43)
            if (r7 < r0) goto L_0x00f3
            goto L_0x0132
        L_0x0105:
            r0 = 18
            if (r8 != r0) goto L_0x0116
            int r0 = r9.mo4247()
            int r0 = r0 >>> 13
            int r4 = r0 + 3
            r0 = 3
            r9.mo4251(r0)
            goto L_0x0129
        L_0x0116:
            int r0 = r9.mo4247()
            int r0 = r0 >>> 9
            int r4 = r0 + 11
            r0 = 7
            r9.mo4251(r0)
            goto L_0x0129
        L_0x0123:
            r0 = r7
            int r7 = r7 + 1
            r1 = 0
            r5[r0] = r1
        L_0x0129:
            r0 = r4
            int r4 = r4 + -1
            if (r0 <= 0) goto L_0x0132
            r0 = 404(0x194, float:5.66E-43)
            if (r7 < r0) goto L_0x0123
        L_0x0132:
            r0 = 404(0x194, float:5.66E-43)
            if (r7 < r0) goto L_0x00a9
            r0 = 1
            r9.f5817 = r0
            int r0 = r9.f6014
            int r1 = r9.f5860
            if (r0 <= r1) goto L_0x0141
            r0 = 0
            return r0
        L_0x0141:
            o.yx r0 = r9.f5894
            r1 = 0
            r2 = 299(0x12b, float:4.19E-43)
            m1707(r5, r1, r0, r2)
            o.yw r0 = r9.f5890
            r1 = 299(0x12b, float:4.19E-43)
            r2 = 60
            m1707(r5, r1, r0, r2)
            o.yy r0 = r9.f5888
            r1 = 359(0x167, float:5.03E-43)
            r2 = 17
            m1707(r5, r1, r0, r2)
            o.za r0 = r9.f5885
            r1 = 376(0x178, float:5.27E-43)
            r2 = 28
            m1707(r5, r1, r0, r2)
            r7 = 0
            goto L_0x016e
        L_0x0166:
            byte[] r0 = r9.f5819
            byte r1 = r5[r7]
            r0[r7] = r1
            int r7 = r7 + 1
        L_0x016e:
            byte[] r0 = r9.f5819
            int r0 = r0.length
            if (r7 < r0) goto L_0x0166
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0975yp.m1682():boolean");
    }

    /* renamed from: ċ */
    private boolean m1681() {
        int r3 = mo4247() >> 8;
        mo4251(8);
        int i = (r3 & 7) + 1;
        if (i == 7) {
            i = (mo4247() >> 8) + 7;
            mo4251(8);
        } else if (i == 8) {
            i = mo4247();
            mo4251(16);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f6014 >= this.f5860 - 1 && !mo4174() && i2 < i - 1) {
                return false;
            }
            arrayList.add(Byte.valueOf((byte) (mo4247() >> 8)));
            mo4251(8);
        }
        return m1690(r3, (List<Byte>) arrayList);
    }

    /* renamed from: 鷭 */
    private boolean m1690(int i, List<Byte> list) {
        int i2;
        C0978ys ysVar;
        int i3;
        C0978ys ysVar2;
        C1001zn znVar = new C1001zn();
        znVar.mo4246();
        for (int i4 = 0; i4 < Math.min(32768, list.size()); i4++) {
            znVar.mo4249()[i4] = ((Byte) list.get(i4)).byteValue();
        }
        C1002zo zoVar = this.f5812;
        if (zoVar.f6023 == null) {
            zoVar.f6023 = new byte[262148];
        }
        if ((i & 128) != 0) {
            i2 = C1002zo.m1791(znVar);
            if (i2 == 0) {
                m1685();
            } else {
                i2--;
            }
        } else {
            i2 = this.f5813;
        }
        if (i2 > this.f5816.size() || i2 > this.f5808.size()) {
            return false;
        }
        this.f5813 = i2;
        boolean z = i2 == this.f5816.size();
        C0978ys ysVar3 = new C0978ys();
        if (!z) {
            ysVar = (C0978ys) this.f5816.get(i2);
            ysVar3.f5895 = i2;
            ysVar.f5898++;
        } else if (i2 > 1024) {
            return false;
        } else {
            ysVar = new C0978ys();
            this.f5816.add(ysVar);
            ysVar3.f5895 = this.f5816.size() - 1;
            this.f5808.add(Integer.valueOf(0));
            ysVar.f5898 = 0;
        }
        this.f5818.add(ysVar3);
        ysVar3.f5898 = ysVar.f5898;
        int r7 = C1002zo.m1791(znVar);
        if ((i & 64) != 0) {
            r7 += 258;
        }
        ysVar3.f5900 = (this.f5874 + r7) & 4194303;
        if ((i & 32) != 0) {
            ysVar2 = ysVar3;
            i3 = C1002zo.m1791(znVar);
        } else {
            ysVar2 = ysVar3;
            if (i2 < this.f5808.size()) {
                i3 = ((Integer) this.f5808.get(i2)).intValue();
            } else {
                i3 = 0;
            }
        }
        ysVar2.f5899 = i3;
        ysVar3.f5897 = this.f5867 != this.f5874 && ((this.f5867 - this.f5874) & 4194303) <= r7;
        this.f5808.set(i2, Integer.valueOf(ysVar3.f5899));
        Arrays.fill(ysVar3.f5896.f6102, 0);
        ysVar3.f5896.f6102[3] = 245760;
        ysVar3.f5896.f6102[4] = ysVar3.f5899;
        ysVar3.f5896.f6102[5] = ysVar3.f5898;
        if ((i & 16) != 0) {
            int r4 = znVar.mo4247() >>> 9;
            znVar.mo4251(7);
            for (int i5 = 0; i5 < 7; i5++) {
                if (((1 << i5) & r4) != 0) {
                    ysVar3.f5896.f6102[i5] = C1002zo.m1791(znVar);
                }
            }
        }
        if (z) {
            int r42 = C1002zo.m1791(znVar);
            if (r42 >= 65536 || r42 == 0) {
                return false;
            }
            byte[] bArr = new byte[r42];
            for (int i6 = 0; i6 < r42; i6++) {
                if (znVar.mo4248()) {
                    return false;
                }
                bArr[i6] = (byte) (znVar.mo4247() >> 8);
                znVar.mo4251(8);
            }
            this.f5812.mo4254(bArr, r42, ysVar.f5896);
        }
        ysVar3.f5896.f6107 = ysVar.f5896.f6108;
        ysVar3.f5896.f6106 = ysVar.f5896.f6106;
        int size = ysVar.f5896.f6101.size();
        if (size > 0 && size < 8192) {
            ysVar3.f5896.f6101 = ysVar.f5896.f6101;
        }
        if (ysVar3.f5896.f6105.size() < 64) {
            ysVar3.f5896.f6105.clear();
            ysVar3.f5896.f6105.setSize(64);
        }
        Vector<Byte> vector = ysVar3.f5896.f6105;
        for (int i7 = 0; i7 < 7; i7++) {
            C1002zo.m1795(vector, i7 * 4, ysVar3.f5896.f6102[i7]);
        }
        C1002zo.m1795(vector, 28, ysVar3.f5899);
        C1002zo.m1795(vector, 32, 0);
        C1002zo.m1795(vector, 36, 0);
        C1002zo.m1795(vector, 40, 0);
        C1002zo.m1795(vector, 44, ysVar3.f5898);
        for (int i8 = 0; i8 < 16; i8++) {
            vector.set(i8 + 48, Byte.valueOf(0));
        }
        if ((i & 8) != 0) {
            if (znVar.mo4248()) {
                return false;
            }
            int r10 = C1002zo.m1791(znVar);
            if (r10 > 8128) {
                return false;
            }
            int size2 = ysVar3.f5896.f6105.size();
            if (size2 < r10 + 64) {
                ysVar3.f5896.f6105.setSize((r10 + 64) - size2);
            }
            Vector<Byte> vector2 = ysVar3.f5896.f6105;
            for (int i9 = 0; i9 < r10; i9++) {
                if (znVar.mo4248()) {
                    return false;
                }
                vector2.set(i9 + 64, Byte.valueOf((byte) (znVar.mo4247() >>> 8)));
                znVar.mo4251(8);
            }
        }
        return true;
    }

    /* renamed from: 鷭 */
    private void m1688(C1009zv zvVar) {
        if (zvVar.f6105.size() > 0) {
            zvVar.f6102[6] = (int) this.f5814;
            C1002zo.m1795(zvVar.f6105, 36, (int) this.f5814);
            C1002zo.m1795(zvVar.f6105, 40, (int) (this.f5814 >>> 32));
            this.f5812.mo4253(zvVar);
        }
    }

    /* renamed from: 鷭 */
    public final void mo4171(long j) {
        this.f5869 = j;
        this.f5811 = false;
    }

    /* renamed from: 櫯 */
    public final int mo4168() {
        if (this.f6014 > 32738) {
            mo4174();
        }
        byte[] bArr = this.f6013;
        int i = this.f6014;
        this.f6014 = i + 1;
        return bArr[i] & 255;
    }
}
