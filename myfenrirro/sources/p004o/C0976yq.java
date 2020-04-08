package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import android.support.p000v4.view.InputDeviceCompat;
import android.support.p000v4.view.MotionEventCompat;
import java.util.Arrays;

/* renamed from: o.yq */
public abstract class C0976yq extends C1001zn {

    /* renamed from: Ī */
    static int[] f5820;

    /* renamed from: ī */
    static int[] f5821;

    /* renamed from: Ĭ */
    static int[] f5822;

    /* renamed from: Į */
    private static int[] f5823;

    /* renamed from: į */
    private static int[] f5824 = {32768, 49152, 57344, 61952, 61952, 61952, 61952, 61952, SupportMenu.USER_MASK};

    /* renamed from: ĸ */
    private static int[] f5825;

    /* renamed from: ˮ͈ */
    private static int[] f5826 = {40960, 49152, 53248, 57344, 59904, 60928, 61440, 61952, 62016, SupportMenu.USER_MASK};

    /* renamed from: 䲑 */
    private static int[] f5827 = {4096, 9216, 32768, 49152, 64000, SupportMenu.USER_MASK, SupportMenu.USER_MASK, SupportMenu.USER_MASK};

    /* renamed from: 䲕 */
    private static int[] f5828 = {MotionEventCompat.ACTION_POINTER_INDEX_MASK, SupportMenu.USER_MASK, SupportMenu.USER_MASK, SupportMenu.USER_MASK, SupportMenu.USER_MASK, SupportMenu.USER_MASK};

    /* renamed from: 崲 */
    private static int[] f5829;

    /* renamed from: 差 */
    private static int[] f5830;

    /* renamed from: 廕 */
    static int[] f5831;

    /* renamed from: 櫯 */
    private static int[] f5832;

    /* renamed from: 瞣 */
    private static int[] f5833;

    /* renamed from: 簇 */
    private static int[] f5834;

    /* renamed from: 鷭 */
    private static int[] f5835 = {32768, 40960, 49152, 53248, 57344, 59904, 60928, 61440, 61952, 61952, SupportMenu.USER_MASK};

    /* renamed from: 黬 */
    private static int[] f5836 = {8192, 49152, 57344, 61440, 61952, 61952, 63456, SupportMenu.USER_MASK};

    /* renamed from: 齴 */
    private static int[] f5837 = {2048, 9216, 60928, 65152, SupportMenu.USER_MASK, SupportMenu.USER_MASK, SupportMenu.USER_MASK};

    /* renamed from: Ą */
    protected boolean f5838;

    /* renamed from: ą */
    protected boolean f5839;

    /* renamed from: Ć */
    protected C0974yo f5840;

    /* renamed from: ć */
    protected boolean f5841;

    /* renamed from: ċ */
    protected int[] f5842 = new int[4];

    /* renamed from: đ */
    protected int[] f5843 = new int[256];

    /* renamed from: Ē */
    protected int[] f5844 = new int[256];

    /* renamed from: ē */
    protected int[] f5845 = new int[256];

    /* renamed from: Ė */
    protected int[] f5846 = new int[256];

    /* renamed from: ė */
    protected int[] f5847 = new int[256];

    /* renamed from: Ę */
    protected int[] f5848 = new int[256];

    /* renamed from: ę */
    protected int[] f5849 = new int[256];

    /* renamed from: ġ */
    protected int f5850;

    /* renamed from: ģ */
    protected int f5851;

    /* renamed from: Ĥ */
    protected int f5852;

    /* renamed from: ĥ */
    protected int f5853;

    /* renamed from: Ħ */
    protected int f5854;

    /* renamed from: ħ */
    protected int f5855;

    /* renamed from: Ĩ */
    protected int f5856;

    /* renamed from: ȃ */
    protected int f5857;

    /* renamed from: Ȋ */
    protected byte[] f5858;

    /* renamed from: Ƞ */
    protected int f5859;

    /* renamed from: ˮ͍ */
    protected int f5860;

    /* renamed from: ܕ */
    protected int[] f5861 = new int[256];

    /* renamed from: ܨ */
    protected int f5862;

    /* renamed from: ঽ্ */
    protected int f5863;

    /* renamed from: 㥳 */
    protected int[] f5864 = new int[256];

    /* renamed from: 㱽 */
    protected int f5865;

    /* renamed from: 㵼 */
    protected int f5866;

    /* renamed from: 䒧 */
    protected int f5867;

    /* renamed from: 囃 */
    protected int f5868;

    /* renamed from: 岱 */
    protected long f5869;

    /* renamed from: 庸 */
    protected int[] f5870 = new int[256];

    /* renamed from: 廂 */
    protected int f5871;

    /* renamed from: 廅 */
    protected int f5872;

    /* renamed from: 廑 */
    protected int f5873;

    /* renamed from: 纫 */
    protected int f5874;

    /* renamed from: 躆 */
    protected int f5875;

    /* renamed from: 띥 */
    protected int[] f5876 = new int[256];

    /* access modifiers changed from: protected */
    /* renamed from: 鷭 */
    public abstract void mo4172(boolean z);

    static {
        int[] iArr = new int[13];
        iArr[3] = 2;
        iArr[4] = 3;
        iArr[5] = 5;
        iArr[6] = 7;
        iArr[7] = 11;
        iArr[8] = 16;
        iArr[9] = 20;
        iArr[10] = 24;
        iArr[11] = 32;
        iArr[12] = 32;
        f5832 = iArr;
        int[] iArr2 = new int[13];
        iArr2[4] = 5;
        iArr2[5] = 7;
        iArr2[6] = 9;
        iArr2[7] = 13;
        iArr2[8] = 18;
        iArr2[9] = 22;
        iArr2[10] = 26;
        iArr2[11] = 34;
        iArr2[12] = 36;
        f5823 = iArr2;
        int[] iArr3 = new int[13];
        iArr3[5] = 8;
        iArr3[6] = 16;
        iArr3[7] = 24;
        iArr3[8] = 33;
        iArr3[9] = 33;
        iArr3[10] = 33;
        iArr3[11] = 33;
        iArr3[12] = 33;
        f5833 = iArr3;
        int[] iArr4 = new int[13];
        iArr4[6] = 4;
        iArr4[7] = 44;
        iArr4[8] = 60;
        iArr4[9] = 76;
        iArr4[10] = 80;
        iArr4[11] = 80;
        iArr4[12] = 127;
        f5829 = iArr4;
        int[] iArr5 = new int[13];
        iArr5[6] = 2;
        iArr5[7] = 7;
        iArr5[8] = 53;
        iArr5[9] = 117;
        iArr5[10] = 233;
        f5834 = iArr5;
        int[] iArr6 = new int[13];
        iArr6[7] = 2;
        iArr6[8] = 16;
        iArr6[9] = 218;
        iArr6[10] = 251;
        f5830 = iArr6;
        int[] iArr7 = new int[13];
        iArr7[9] = 255;
        f5825 = iArr7;
        int[] iArr8 = new int[16];
        iArr8[0] = 1;
        iArr8[1] = 3;
        iArr8[2] = 4;
        iArr8[3] = 4;
        iArr8[4] = 5;
        iArr8[5] = 6;
        iArr8[6] = 7;
        iArr8[7] = 8;
        iArr8[8] = 8;
        iArr8[9] = 4;
        iArr8[10] = 4;
        iArr8[11] = 5;
        iArr8[12] = 6;
        iArr8[13] = 6;
        iArr8[14] = 4;
        f5820 = iArr8;
        int[] iArr9 = new int[15];
        iArr9[1] = 160;
        iArr9[2] = 208;
        iArr9[3] = 224;
        iArr9[4] = 240;
        iArr9[5] = 248;
        iArr9[6] = 252;
        iArr9[7] = 254;
        iArr9[8] = 255;
        iArr9[9] = 192;
        iArr9[10] = 128;
        iArr9[11] = 144;
        iArr9[12] = 152;
        iArr9[13] = 156;
        iArr9[14] = 176;
        f5821 = iArr9;
        int[] iArr10 = new int[16];
        iArr10[0] = 2;
        iArr10[1] = 3;
        iArr10[2] = 3;
        iArr10[3] = 3;
        iArr10[4] = 4;
        iArr10[5] = 4;
        iArr10[6] = 5;
        iArr10[7] = 6;
        iArr10[8] = 6;
        iArr10[9] = 4;
        iArr10[10] = 4;
        iArr10[11] = 5;
        iArr10[12] = 6;
        iArr10[13] = 6;
        iArr10[14] = 4;
        f5822 = iArr10;
        int[] iArr11 = new int[15];
        iArr11[1] = 64;
        iArr11[2] = 96;
        iArr11[3] = 160;
        iArr11[4] = 208;
        iArr11[5] = 224;
        iArr11[6] = 240;
        iArr11[7] = 248;
        iArr11[8] = 252;
        iArr11[9] = 192;
        iArr11[10] = 128;
        iArr11[11] = 144;
        iArr11[12] = 152;
        iArr11[13] = 156;
        iArr11[14] = 176;
        f5831 = iArr11;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: CFG modification limit reached, blocks count: 217 */
    /* renamed from: 櫯 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4175(boolean r9) {
        /*
            r8 = this;
            boolean r0 = r8.f5838
            if (r0 == 0) goto L_0x000a
            int r0 = r8.f5867
            r8.f5874 = r0
            goto L_0x00a7
        L_0x000a:
            r8.mo4172(r9)
            r4 = r8
            if (r9 != 0) goto L_0x0032
            r0 = 0
            r4.f5859 = r0
            r0 = 0
            r4.f5850 = r0
            r0 = 0
            r4.f5865 = r0
            r0 = 0
            r4.f5866 = r0
            r0 = 0
            r4.f5872 = r0
            r0 = 0
            r4.f5863 = r0
            r0 = 13568(0x3500, float:1.9013E-41)
            r4.f5868 = r0
            r0 = 8193(0x2001, float:1.1481E-41)
            r4.f5855 = r0
            r0 = 128(0x80, float:1.794E-43)
            r4.f5854 = r0
            r0 = 128(0x80, float:1.794E-43)
            r4.f5853 = r0
        L_0x0032:
            r0 = 0
            r4.f5852 = r0
            r0 = 0
            r4.f5871 = r0
            r0 = 0
            r4.f5862 = r0
            r0 = 0
            r4.f5851 = r0
            r0 = 0
            r4.f5860 = r0
            r8.mo4174()
            if (r9 != 0) goto L_0x009c
            r4 = r8
            r5 = 0
            goto L_0x007b
        L_0x0049:
            int[] r0 = r4.f5845
            int[] r1 = r4.f5876
            int[] r2 = r4.f5864
            r2[r5] = r5
            r1[r5] = r5
            r0[r5] = r5
            int[] r0 = r4.f5846
            r1 = r5 ^ -1
            int r1 = r1 + 1
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0[r5] = r1
            int[] r0 = r4.f5861
            int[] r2 = r4.f5843
            int r1 = r5 << 8
            r2[r5] = r1
            r0[r5] = r1
            int[] r0 = r4.f5870
            r0[r5] = r5
            int[] r0 = r4.f5844
            r1 = r5 ^ -1
            int r1 = r1 + 1
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0[r5] = r1
            int r5 = r5 + 1
        L_0x007b:
            r0 = 256(0x100, float:3.59E-43)
            if (r5 < r0) goto L_0x0049
            int[] r0 = r4.f5847
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r4.f5848
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r4.f5849
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r4.f5843
            int[] r1 = r4.f5848
            m1701(r0, r1)
            r0 = 0
            r8.f5874 = r0
            goto L_0x00a0
        L_0x009c:
            int r0 = r8.f5867
            r8.f5874 = r0
        L_0x00a0:
            long r0 = r8.f5869
            r2 = 1
            long r0 = r0 - r2
            r8.f5869 = r0
        L_0x00a7:
            long r0 = r8.f5869
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x02dd
            r8.m1696()
            r0 = 8
            r8.f5852 = r0
            goto L_0x02dd
        L_0x00b8:
            int r0 = r8.f5874
            r1 = 4194303(0x3fffff, float:5.87747E-39)
            r0 = r0 & r1
            r8.f5874 = r0
            int r0 = r8.f6014
            int r1 = r8.f5860
            int r1 = r1 + -30
            if (r0 <= r1) goto L_0x00ce
            boolean r0 = r8.mo4174()
            if (r0 == 0) goto L_0x02e5
        L_0x00ce:
            int r0 = r8.f5867
            int r1 = r8.f5874
            int r0 = r0 - r1
            r1 = 4194303(0x3fffff, float:5.87747E-39)
            r0 = r0 & r1
            r1 = 270(0x10e, float:3.78E-43)
            if (r0 >= r1) goto L_0x00e9
            int r0 = r8.f5867
            int r1 = r8.f5874
            if (r0 == r1) goto L_0x00e9
            r8.mo4173()
            boolean r0 = r8.f5838
            if (r0 == 0) goto L_0x00e9
            return
        L_0x00e9:
            int r0 = r8.f5862
            if (r0 == 0) goto L_0x00f2
            r8.mo4168()
            goto L_0x02dd
        L_0x00f2:
            int r0 = r8.f5852
            int r0 = r0 + -1
            r8.f5852 = r0
            if (r0 >= 0) goto L_0x0100
            r8.m1696()
            r0 = 7
            r8.f5852 = r0
        L_0x0100:
            int r0 = r8.f5871
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x011c
            int r0 = r8.f5871
            int r0 = r0 << 1
            r8.f5871 = r0
            int r0 = r8.f5854
            int r1 = r8.f5853
            if (r0 <= r1) goto L_0x0117
            r8.mo4169()
            goto L_0x02dd
        L_0x0117:
            r8.mo4168()
            goto L_0x02dd
        L_0x011c:
            int r0 = r8.f5871
            int r0 = r0 << 1
            r8.f5871 = r0
            int r0 = r8.f5852
            int r0 = r0 + -1
            r8.f5852 = r0
            if (r0 >= 0) goto L_0x0130
            r8.m1696()
            r0 = 7
            r8.f5852 = r0
        L_0x0130:
            int r0 = r8.f5871
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x014c
            int r0 = r8.f5871
            int r0 = r0 << 1
            r8.f5871 = r0
            int r0 = r8.f5854
            int r1 = r8.f5853
            if (r0 <= r1) goto L_0x0147
            r8.mo4168()
            goto L_0x02dd
        L_0x0147:
            r8.mo4169()
            goto L_0x02dd
        L_0x014c:
            int r0 = r8.f5871
            int r0 = r0 << 1
            r8.f5871 = r0
            r4 = r8
            r0 = 0
            r8.f5850 = r0
            int r9 = r4.mo4247()
            int r0 = r4.f5851
            r1 = 2
            if (r0 != r1) goto L_0x0176
            r0 = 1
            r4.mo4251(r0)
            r0 = 32768(0x8000, float:4.5918E-41)
            if (r9 < r0) goto L_0x0171
            int r0 = r4.f5856
            int r1 = r4.f5873
            r4.m1700(r0, r1)
            goto L_0x02dd
        L_0x0171:
            int r9 = r9 << 1
            r0 = 0
            r4.f5851 = r0
        L_0x0176:
            int r9 = r9 >>> 8
            int r0 = r4.f5872
            r1 = 37
            if (r0 >= r1) goto L_0x01b1
            r5 = 0
        L_0x017f:
            int[] r0 = f5821
            r0 = r0[r5]
            r0 = r0 ^ r9
            r6 = r5
            r7 = r4
            r1 = 1
            if (r6 != r1) goto L_0x018e
            int r1 = r7.f5859
            int r1 = r1 + 3
            goto L_0x0192
        L_0x018e:
            int[] r1 = f5820
            r1 = r1[r6]
        L_0x0192:
            r2 = 255(0xff, float:3.57E-43)
            int r1 = r2 >>> r1
            r1 = r1 ^ -1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x019e
            int r5 = r5 + 1
            goto L_0x017f
        L_0x019e:
            r6 = r5
            r7 = r4
            r0 = 1
            if (r6 != r0) goto L_0x01a8
            int r0 = r7.f5859
            int r0 = r0 + 3
            goto L_0x01ac
        L_0x01a8:
            int[] r0 = f5820
            r0 = r0[r6]
        L_0x01ac:
            r4.mo4251(r0)
            goto L_0x01e2
        L_0x01b1:
            r5 = 0
        L_0x01b2:
            int[] r0 = f5831
            r0 = r0[r5]
            r0 = r0 ^ r9
            r6 = r5
            r7 = r4
            r1 = 3
            if (r6 != r1) goto L_0x01c1
            int r1 = r7.f5859
            int r1 = r1 + 3
            goto L_0x01c5
        L_0x01c1:
            int[] r1 = f5822
            r1 = r1[r6]
        L_0x01c5:
            r2 = 255(0xff, float:3.57E-43)
            int r1 = r2 >> r1
            r1 = r1 ^ -1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x01d1
            int r5 = r5 + 1
            goto L_0x01b2
        L_0x01d1:
            r6 = r5
            r7 = r4
            r0 = 3
            if (r6 != r0) goto L_0x01db
            int r0 = r7.f5859
            int r0 = r0 + 3
            goto L_0x01df
        L_0x01db:
            int[] r0 = f5822
            r0 = r0[r6]
        L_0x01df:
            r4.mo4251(r0)
        L_0x01e2:
            r0 = 9
            if (r5 < r0) goto L_0x027b
            r0 = 9
            if (r5 != r0) goto L_0x01f9
            int r0 = r4.f5851
            int r0 = r0 + 1
            r4.f5851 = r0
            int r0 = r4.f5856
            int r1 = r4.f5873
            r4.m1700(r0, r1)
            goto L_0x02dd
        L_0x01f9:
            r0 = 14
            if (r5 != r0) goto L_0x0228
            r0 = 0
            r4.f5851 = r0
            int r0 = r4.mo4247()
            int[] r1 = f5826
            int[] r2 = f5823
            r3 = 3
            int r0 = r4.m1698(r0, r3, r1, r2)
            int r5 = r0 + 5
            int r0 = r4.mo4247()
            int r0 = r0 >> 1
            r1 = 32768(0x8000, float:4.5918E-41)
            r6 = r0 | r1
            r0 = 15
            r4.mo4251(r0)
            r4.f5873 = r5
            r4.f5856 = r6
            r4.m1700(r6, r5)
            goto L_0x02dd
        L_0x0228:
            r0 = 0
            r4.f5851 = r0
            r9 = r5
            int[] r0 = r4.f5842
            int r1 = r4.f5875
            int r2 = r5 + -9
            int r1 = r1 - r2
            r1 = r1 & 3
            r6 = r0[r1]
            int r0 = r4.mo4247()
            int[] r1 = f5835
            int[] r2 = f5832
            r3 = 2
            int r0 = r4.m1698(r0, r3, r1, r2)
            int r5 = r0 + 2
            r0 = 257(0x101, float:3.6E-43)
            if (r5 != r0) goto L_0x0256
            r0 = 10
            if (r9 != r0) goto L_0x0256
            int r0 = r4.f5859
            r0 = r0 ^ 1
            r4.f5859 = r0
            goto L_0x02dd
        L_0x0256:
            r0 = 256(0x100, float:3.59E-43)
            if (r6 <= r0) goto L_0x025c
            int r5 = r5 + 1
        L_0x025c:
            int r0 = r4.f5855
            if (r6 < r0) goto L_0x0262
            int r5 = r5 + 1
        L_0x0262:
            int[] r0 = r4.f5842
            int r1 = r4.f5875
            int r2 = r1 + 1
            r4.f5875 = r2
            r0[r1] = r6
            int r0 = r4.f5875
            r0 = r0 & 3
            r4.f5875 = r0
            r4.f5873 = r5
            r4.f5856 = r6
            r4.m1700(r6, r5)
            goto L_0x02dd
        L_0x027b:
            r0 = 0
            r4.f5851 = r0
            int r0 = r4.f5872
            int r0 = r0 + r5
            r4.f5872 = r0
            int r0 = r4.f5872
            int r1 = r4.f5872
            int r1 = r1 >> 4
            int r0 = r0 - r1
            r4.f5872 = r0
            int r0 = r4.mo4247()
            int[] r1 = f5827
            int[] r2 = f5834
            r3 = 5
            int r0 = r4.m1698(r0, r3, r1, r2)
            r7 = r0 & 255(0xff, float:3.57E-43)
            int[] r0 = r4.f5870
            r6 = r0[r7]
            int r7 = r7 + -1
            r0 = -1
            if (r7 == r0) goto L_0x02c2
            int[] r0 = r4.f5876
            r1 = r0[r6]
            int r1 = r1 + -1
            r0[r6] = r1
            int[] r0 = r4.f5870
            r9 = r0[r7]
            int[] r0 = r4.f5876
            r1 = r0[r9]
            int r1 = r1 + 1
            r0[r9] = r1
            int[] r0 = r4.f5870
            int r1 = r7 + 1
            r0[r1] = r9
            int[] r0 = r4.f5870
            r0[r7] = r6
        L_0x02c2:
            int r5 = r5 + 2
            int[] r0 = r4.f5842
            int r1 = r4.f5875
            int r2 = r1 + 1
            r4.f5875 = r2
            int r6 = r6 + 1
            r0[r1] = r6
            int r0 = r4.f5875
            r0 = r0 & 3
            r4.f5875 = r0
            r4.f5873 = r5
            r4.f5856 = r6
            r4.m1700(r6, r5)
        L_0x02dd:
            long r0 = r8.f5869
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b8
        L_0x02e5:
            r8.mo4173()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0976yq.mo4175(boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: ˮ͈ */
    public final boolean mo4174() {
        int i = this.f5860 - this.f6014;
        if (i < 0) {
            return false;
        }
        if (this.f6014 > 16384) {
            if (i > 0) {
                System.arraycopy(this.f6013, this.f6014, this.f6013, 0, i);
            }
            this.f6014 = 0;
            this.f5860 = i;
        } else {
            i = this.f5860;
        }
        int r4 = this.f5840.mo4166(this.f6013, i, (32768 - i) & -16);
        if (r4 > 0) {
            this.f5860 += r4;
        }
        this.f5857 = this.f5860 - 30;
        return r4 != -1;
    }

    /* renamed from: 鷭 */
    private void mo4169() {
        int i;
        int i2;
        int i3;
        int i4;
        this.f5850 = 0;
        this.f5854 += 16;
        if (this.f5854 > 255) {
            this.f5854 = 144;
            this.f5853 >>>= 1;
        }
        int i5 = this.f5866;
        int r4 = mo4247();
        if (this.f5866 >= 122) {
            i = m1698(r4, 3, f5826, f5823);
        } else if (this.f5866 >= 64) {
            i = m1698(r4, 2, f5835, f5832);
        } else if (r4 < 256) {
            i = r4;
            mo4251(16);
        } else {
            i = 0;
            while (((r4 << i) & 32768) == 0) {
                i++;
            }
            mo4251(i + 1);
        }
        this.f5866 += i;
        this.f5866 -= this.f5866 >>> 5;
        int r42 = mo4247();
        if (this.f5863 > 10495) {
            i2 = m1698(r42, 5, f5827, f5834);
        } else if (this.f5863 > 1791) {
            i2 = m1698(r42, 5, f5836, f5829);
        } else {
            i2 = m1698(r42, 4, f5824, f5833);
        }
        this.f5863 += i2;
        this.f5863 -= this.f5863 >> 8;
        while (true) {
            int i6 = this.f5843[i2 & 255];
            int[] iArr = this.f5848;
            int i7 = i6;
            i3 = i6 + 1;
            int i8 = i7 & 255;
            i4 = iArr[i8];
            iArr[i8] = i4 + 1;
            if ((i3 & 255) != 0) {
                break;
            }
            m1701(this.f5843, this.f5848);
        }
        int[] iArr2 = this.f5843;
        iArr2[i2] = iArr2[i4];
        this.f5843[i4] = i3;
        int r43 = ((65280 & i3) | (mo4247() >>> 8)) >>> 1;
        mo4251(7);
        int i9 = this.f5865;
        if (!(i == 1 || i == 4)) {
            if (i == 0 && r43 <= this.f5855) {
                this.f5865++;
                this.f5865 -= this.f5865 >> 8;
            } else if (this.f5865 > 0) {
                this.f5865--;
            }
        }
        int i10 = i + 3;
        if (r43 >= this.f5855) {
            i10++;
        }
        if (r43 <= 256) {
            i10 += 8;
        }
        if (i9 > 176 || (this.f5868 >= 10752 && i5 < 64)) {
            this.f5855 = 32512;
        } else {
            this.f5855 = 8193;
        }
        int[] iArr3 = this.f5842;
        int i11 = this.f5875;
        this.f5875 = i11 + 1;
        iArr3[i11] = r43;
        this.f5875 &= 3;
        this.f5873 = i10;
        this.f5856 = r43;
        m1700(r43, i10);
    }

    /* renamed from: 櫯 */
    private void mo4168() {
        int i;
        int r4 = mo4247();
        if (this.f5868 > 30207) {
            i = m1698(r4, 8, f5828, f5825);
        } else if (this.f5868 > 24063) {
            i = m1698(r4, 6, f5837, f5830);
        } else if (this.f5868 > 13823) {
            i = m1698(r4, 5, f5827, f5834);
        } else if (this.f5868 > 3583) {
            i = m1698(r4, 5, f5836, f5829);
        } else {
            i = m1698(r4, 4, f5824, f5833);
        }
        int i2 = i & 255;
        if (this.f5862 != 0) {
            if (i2 == 0 && r4 > 4095) {
                i2 = 256;
            }
            i2--;
            if (i2 == -1) {
                int r42 = mo4247();
                mo4251(1);
                if ((32768 & r42) != 0) {
                    this.f5862 = 0;
                    this.f5850 = 0;
                    return;
                }
                int i3 = (r42 & 16384) != 0 ? 4 : 3;
                mo4251(1);
                int r5 = (m1698(mo4247(), 5, f5827, f5834) << 5) | (mo4247() >>> 11);
                mo4251(5);
                m1700(r5, i3);
                return;
            }
        } else {
            int i4 = this.f5850;
            this.f5850 = i4 + 1;
            if (i4 >= 16 && this.f5852 == 0) {
                this.f5862 = 1;
            }
        }
        this.f5868 += i2;
        this.f5868 -= this.f5868 >>> 8;
        this.f5853 += 16;
        if (this.f5853 > 255) {
            this.f5853 = 144;
            this.f5854 >>>= 1;
        }
        byte[] bArr = this.f5858;
        int i5 = this.f5874;
        this.f5874 = i5 + 1;
        bArr[i5] = (byte) (this.f5861[i2] >>> 8);
        this.f5869--;
        while (true) {
            int i6 = this.f5861[i2];
            int[] iArr = this.f5847;
            int i7 = i6;
            int i8 = i6 + 1;
            int i9 = i7 & 255;
            int i10 = iArr[i9];
            iArr[i9] = i10 + 1;
            if ((i8 & 255) > 161) {
                m1701(this.f5861, this.f5847);
            } else {
                int[] iArr2 = this.f5861;
                iArr2[i2] = iArr2[i10];
                this.f5861[i10] = i8;
                return;
            }
        }
    }

    /* renamed from: ˮ͍ */
    private void m1696() {
        int r6 = m1698(mo4247(), 5, f5827, f5834);
        while (true) {
            int i = this.f5844[r6];
            this.f5871 = i >>> 8;
            int[] iArr = this.f5849;
            int i2 = i;
            int i3 = i + 1;
            int i4 = i2 & 255;
            int i5 = iArr[i4];
            iArr[i4] = i5 + 1;
            if ((i3 & 255) == 0) {
                m1701(this.f5844, this.f5849);
            } else {
                int[] iArr2 = this.f5844;
                iArr2[r6] = iArr2[i5];
                this.f5844[i5] = i3;
                return;
            }
        }
    }

    /* renamed from: 鷭 */
    private static void m1701(int[] iArr, int[] iArr2) {
        int i = 0;
        for (int i2 = 7; i2 >= 0; i2--) {
            int i3 = 0;
            while (i3 < 32) {
                iArr[i] = (iArr[i] & InputDeviceCompat.SOURCE_ANY) | i2;
                i3++;
                i++;
            }
        }
        Arrays.fill(iArr2, 0);
        for (int i4 = 6; i4 >= 0; i4--) {
            iArr2[i4] = (7 - i4) * 32;
        }
    }

    /* renamed from: 鷭 */
    private void m1700(int i, int i2) {
        this.f5869 -= (long) i2;
        while (true) {
            int i3 = i2;
            i2--;
            if (i3 != 0) {
                this.f5858[this.f5874] = this.f5858[(this.f5874 - i) & 4194303];
                this.f5874 = (this.f5874 + 1) & 4194303;
            } else {
                return;
            }
        }
    }

    /* renamed from: 鷭 */
    private int m1698(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = i & 65520;
        int i4 = 0;
        while (iArr[i4] <= i3) {
            i2++;
            i4++;
        }
        mo4251(i2);
        return ((i3 - (i4 != 0 ? iArr[i4 - 1] : 0)) >>> (16 - i2)) + iArr2[i2];
    }

    /* access modifiers changed from: protected */
    /* renamed from: ȃ */
    public final void mo4173() {
        if (this.f5874 != this.f5867) {
            this.f5841 = true;
        }
        if (this.f5874 < this.f5867) {
            this.f5840.mo4165(this.f5858, this.f5867, (-this.f5867) & 4194303);
            this.f5840.mo4165(this.f5858, 0, this.f5874);
            this.f5839 = true;
        } else {
            this.f5840.mo4165(this.f5858, this.f5867, this.f5874 - this.f5867);
        }
        this.f5867 = this.f5874;
    }
}
