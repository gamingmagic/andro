package p004o;

import android.util.Log;
import org.apache.commons.net.bsd.RCommandClient;

/* renamed from: o.nt */
final class C0593nt {

    /* renamed from: ˮ͈ */
    private static final byte[][] f2857;

    /* renamed from: 櫯 */
    public static final short[] f2858;

    /* renamed from: 鷭 */
    public static final short[] f2859;

    C0593nt() {
    }

    static {
        byte[] bArr = new byte[3];
        bArr[0] = 1;
        bArr[2] = 7;
        f2857 = new byte[][]{bArr, new byte[]{2, -1, 6}, new byte[]{3, 4, 5}};
        short[] sArr = new short[8];
        sArr[1] = -1;
        sArr[2] = -1;
        sArr[3] = -1;
        sArr[5] = 1;
        sArr[6] = 1;
        sArr[7] = 1;
        f2859 = sArr;
        short[] sArr2 = new short[8];
        sArr2[0] = 1;
        sArr2[1] = 1;
        sArr2[3] = -1;
        sArr2[4] = -1;
        sArr2[5] = -1;
        sArr2[7] = 1;
        f2858 = sArr2;
    }

    /* renamed from: 鷭 */
    public static final boolean m677(int i, int i2, int i3) {
        return (i * i) + (i2 * i2) <= (i3 * i3) + ((i == 0 || i2 == 0) ? 0 : 1);
    }

    /* renamed from: 鷭 */
    public static final boolean m679(C1919 r3, int i, int i2, int i3) {
        int i4 = r3.f1634 - i;
        int i5 = r3.f1631 - i2;
        int i6 = i3;
        return (i4 * i4) + (i5 * i5) <= (i6 * i6) + ((i4 == 0 || i5 == 0) ? 0 : 1);
    }

    /* renamed from: 鷭 */
    private static final void m676(int[] iArr, C0447ir[] irVarArr, int i) {
        int i2 = iArr[0];
        iArr[0] = iArr[0] + 1;
        int i3 = (i2 - 1) / 2;
        while (i2 > 0 && irVarArr[i + 0].f1344 < irVarArr[iArr[i3 + 0 + 1] + 0].f1344) {
            iArr[i2 + 0 + 1] = iArr[i3 + 0 + 1];
            i2 = i3;
            i3 = (i3 - 1) / 2;
        }
        iArr[i2 + 0 + 1] = i;
    }

    /* renamed from: 鷭 */
    private static int m675(int[] iArr, C0447ir[] irVarArr, int i, int i2, int i3, int i4, int i5) {
        int i6 = i2;
        int i7 = ((i2 * 32) + i) & RCommandClient.MAX_CLIENT_PORT;
        if (irVarArr[i7 + 0].f1349 == i && irVarArr[i7 + 0].f1348 == i6) {
            if (irVarArr[i7 + 0].f1347 > i3) {
                irVarArr[i7 + 0].f1347 = i3;
                irVarArr[i7 + 0].f1346 = i4;
                irVarArr[i7 + 0].f1344 = i5;
                if (irVarArr[i7 + 0].f1345 != 0) {
                    m676(iArr, irVarArr, i7);
                } else {
                    C0447ir[] irVarArr2 = irVarArr;
                    int i8 = 0;
                    while (i8 < iArr[0] + 0 && iArr[i8 + 1] != i7) {
                        i8++;
                    }
                    if (i8 == iArr[0]) {
                        String str = "update_heap_path bug\n";
                        Log.e("AndRO", str);
                        throw new C0588no(str);
                    }
                    int i9 = (i8 - 1) / 2;
                    while (i8 > 0 && irVarArr2[i7 + 0].f1344 < irVarArr2[iArr[i9 + 0 + 1] + 0].f1344) {
                        iArr[i8 + 0 + 1] = iArr[i9 + 0 + 1];
                        i8 = i9;
                        i9 = (i9 - 1) / 2;
                    }
                    iArr[i8 + 0 + 1] = i7;
                }
                irVarArr[i7].f1345 = 0;
            }
            return 0;
        } else if (irVarArr[i7 + 0].f1349 != 0 || irVarArr[i7 + 0].f1348 != 0) {
            return 1;
        } else {
            irVarArr[i7 + 0].f1349 = i;
            irVarArr[i7 + 0].f1348 = i6;
            irVarArr[i7 + 0].f1347 = i3;
            irVarArr[i7 + 0].f1346 = i4;
            irVarArr[i7 + 0].f1344 = i5;
            irVarArr[i7 + 0].f1345 = 0;
            m676(iArr, irVarArr, i7);
            return 0;
        }
    }

    /* JADX WARNING: type inference failed for: r1v77, types: [byte[]] */
    /* JADX WARNING: CFG modification limit reached, blocks count: 279 */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007a, code lost:
        if (r14 == 0) goto L_0x0083;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m678(p004o.C0529lm r21, int r22, int r23, int r24, int r25, boolean r26, p004o.C0772tc r27) {
        /*
            r0 = 151(0x97, float:2.12E-43)
            int[] r8 = new int[r0]
            r0 = 1024(0x400, float:1.435E-42)
            o.ir[] r9 = new p004o.C0447ir[r0]
            if (r21 != 0) goto L_0x0011
            o.lm r21 = new o.lm
            r0 = r21
            r0.<init>()
        L_0x0011:
            r0 = r27
            r1 = r22
            r2 = r23
            r3 = -1
            boolean r0 = r0.mo4104(r1, r2, r3)
            if (r0 != 0) goto L_0x0020
            r0 = 0
            return r0
        L_0x0020:
            r0 = r27
            r1 = r22
            r2 = r23
            r3 = 0
            boolean r0 = r0.mo4104(r1, r2, r3)
            if (r0 == 0) goto L_0x002f
            r0 = 0
            return r0
        L_0x002f:
            int r13 = r24 - r22
            if (r13 == 0) goto L_0x0039
            if (r13 >= 0) goto L_0x0037
            r13 = -1
            goto L_0x003a
        L_0x0037:
            r13 = 1
            goto L_0x003a
        L_0x0039:
            r13 = 0
        L_0x003a:
            int r14 = r25 - r23
            if (r14 == 0) goto L_0x0044
            if (r14 >= 0) goto L_0x0042
            r14 = -1
            goto L_0x0045
        L_0x0042:
            r14 = 1
            goto L_0x0045
        L_0x0044:
            r14 = 0
        L_0x0045:
            r11 = r22
            r12 = r23
            r10 = 0
            goto L_0x007c
        L_0x004c:
            int r0 = r11 + r13
            int r1 = r12 + r14
            r2 = r27
            r3 = 0
            boolean r0 = r2.mo4104(r0, r1, r3)
            if (r0 != 0) goto L_0x0083
            r0 = r21
            int[] r0 = r0.f1662
            byte[][] r1 = f2857
            int r2 = -r14
            int r2 = r2 + 1
            r1 = r1[r2]
            int r2 = r13 + 1
            byte r1 = r1[r2]
            r0[r10] = r1
            int r10 = r10 + 1
            int r11 = r11 + r13
            int r12 = r12 + r14
            r0 = r24
            if (r11 != r0) goto L_0x0073
            r13 = 0
        L_0x0073:
            r0 = r25
            if (r12 != r0) goto L_0x0078
            r14 = 0
        L_0x0078:
            if (r13 != 0) goto L_0x007c
            if (r14 == 0) goto L_0x0083
        L_0x007c:
            r0 = r21
            int[] r0 = r0.f1662
            int r0 = r0.length
            if (r10 < r0) goto L_0x004c
        L_0x0083:
            r0 = r24
            if (r11 != r0) goto L_0x0096
            r0 = r25
            if (r12 != r0) goto L_0x0096
            r0 = r21
            r0.f1664 = r10
            r0 = 0
            r1 = r21
            r1.f1663 = r0
            r0 = 1
            return r0
        L_0x0096:
            if (r26 == 0) goto L_0x009a
            r0 = 0
            return r0
        L_0x009a:
            r14 = 0
            goto L_0x00a5
        L_0x009c:
            o.ir r0 = new o.ir
            r0.<init>()
            r9[r14] = r0
            int r14 = r14 + 1
        L_0x00a5:
            int r0 = r9.length
            if (r14 < r0) goto L_0x009c
            int r0 = r23 * 32
            int r0 = r22 + r0
            r10 = r0 & 1023(0x3ff, float:1.434E-42)
            r0 = r9[r10]
            r1 = r22
            r0.f1349 = r1
            r0 = r9[r10]
            r1 = r23
            r0.f1348 = r1
            r0 = r9[r10]
            r1 = 0
            r0.f1347 = r1
            r0 = r9[r10]
            r1 = 0
            r0.f1346 = r1
            r0 = r9[r10]
            r26 = r9
            r1 = r26[r10]
            int r1 = r1.f1349
            int r1 = r24 - r1
            int r17 = java.lang.Math.abs(r1)
            r1 = r26[r10]
            int r1 = r1.f1348
            int r1 = r25 - r1
            int r16 = java.lang.Math.abs(r1)
            int r1 = r17 + r16
            int r1 = r1 * 10
            r2 = r26[r10]
            int r2 = r2.f1347
            int r1 = r1 + r2
            r0.f1344 = r1
            r0 = r9[r10]
            r1 = 0
            r0.f1345 = r1
            r0 = 0
            r1 = 0
            r8[r1] = r0
            m676(r8, r9, r10)
            r0 = r27
            int r0 = r0.f4721
            int r10 = r0 + -1
            r0 = r27
            int r0 = r0.f4719
            int r13 = r0 + -1
        L_0x00ff:
            r14 = 0
            r15 = 0
            r0 = 4
            int[] r0 = new int[r0]
            r18 = r0
            r0 = 0
            r0 = r8[r0]
            if (r0 != 0) goto L_0x010d
            r0 = 0
            return r0
        L_0x010d:
            r12 = r9
            r26 = r8
            r0 = 0
            r0 = r8[r0]
            if (r0 > 0) goto L_0x0119
            r26 = -1
            goto L_0x01a6
        L_0x0119:
            r0 = 1
            r19 = r26[r0]
            r0 = 0
            r0 = r26[r0]
            int r0 = r0 + 0
            r20 = r26[r0]
            r0 = 0
            r0 = r26[r0]
            int r0 = r0 + -1
            r1 = 0
            r26[r1] = r0
            r16 = 0
            r11 = 2
            goto L_0x015b
        L_0x012f:
            int r0 = r11 + 0
            int r0 = r0 + 1
            r0 = r26[r0]
            int r0 = r0 + 0
            r0 = r12[r0]
            int r0 = r0.f1344
            int r1 = r11 + 0
            r1 = r26[r1]
            int r1 = r1 + 0
            r1 = r12[r1]
            int r1 = r1.f1344
            if (r0 <= r1) goto L_0x0149
            int r11 = r11 + -1
        L_0x0149:
            int r0 = r16 + 0
            int r0 = r0 + 1
            int r1 = r11 + 0
            int r1 = r1 + 1
            r1 = r26[r1]
            r26[r0] = r1
            r16 = r11
            int r0 = r11 * 2
            int r11 = r0 + 2
        L_0x015b:
            r0 = 0
            r0 = r26[r0]
            if (r11 < r0) goto L_0x012f
            r0 = 0
            r0 = r26[r0]
            if (r11 != r0) goto L_0x0171
            int r0 = r16 + 0
            int r0 = r0 + 1
            int r1 = r11 + 0
            r1 = r26[r1]
            r26[r0] = r1
            int r16 = r11 + -1
        L_0x0171:
            int r0 = r16 + -1
            int r17 = r0 / 2
            goto L_0x0188
        L_0x0176:
            int r0 = r16 + 0
            int r0 = r0 + 1
            int r1 = r17 + 0
            int r1 = r1 + 1
            r1 = r26[r1]
            r26[r0] = r1
            r16 = r17
            int r0 = r17 + -1
            int r17 = r0 / 2
        L_0x0188:
            if (r16 <= 0) goto L_0x019e
            int r0 = r17 + 0
            int r0 = r0 + 1
            r0 = r26[r0]
            int r0 = r0 + 0
            r0 = r12[r0]
            int r0 = r0.f1344
            int r1 = r20 + 0
            r1 = r12[r1]
            int r1 = r1.f1344
            if (r0 > r1) goto L_0x0176
        L_0x019e:
            int r0 = r16 + 0
            int r0 = r0 + 1
            r26[r0] = r20
            r26 = r19
        L_0x01a6:
            r0 = r9[r26]
            int r11 = r0.f1349
            r0 = r9[r26]
            int r12 = r0.f1348
            r0 = r9[r26]
            int r0 = r0.f1347
            int r16 = r0 + 10
            r0 = r9[r26]
            int r1 = r0.f1344
            r17 = r1
            r0 = r24
            if (r11 != r0) goto L_0x01c2
            r0 = r25
            if (r12 == r0) goto L_0x0338
        L_0x01c2:
            if (r12 >= r13) goto L_0x01ef
            int r0 = r12 + 1
            r1 = r27
            r2 = 0
            boolean r0 = r1.mo4104(r11, r0, r2)
            if (r0 != 0) goto L_0x01ef
            r15 = 1
            r0 = r25
            if (r12 < r0) goto L_0x01d7
            r0 = 20
            goto L_0x01d8
        L_0x01d7:
            r0 = 0
        L_0x01d8:
            r1 = 0
            r18[r1] = r0
            r0 = r8
            r1 = r9
            r2 = r11
            int r3 = r12 + 1
            r4 = r16
            r5 = r26
            r6 = 0
            r6 = r18[r6]
            int r6 = r17 + r6
            int r0 = m675(r0, r1, r2, r3, r4, r5, r6)
            int r14 = r0 + 0
        L_0x01ef:
            if (r11 <= 0) goto L_0x021c
            int r0 = r11 + -1
            r1 = r27
            r2 = 0
            boolean r0 = r1.mo4104(r0, r12, r2)
            if (r0 != 0) goto L_0x021c
            r15 = r15 | 2
            r0 = r24
            if (r11 > r0) goto L_0x0205
            r0 = 20
            goto L_0x0206
        L_0x0205:
            r0 = 0
        L_0x0206:
            r1 = 1
            r18[r1] = r0
            r0 = r8
            r1 = r9
            int r2 = r11 + -1
            r3 = r12
            r4 = r16
            r5 = r26
            r6 = 1
            r6 = r18[r6]
            int r6 = r17 + r6
            int r0 = m675(r0, r1, r2, r3, r4, r5, r6)
            int r14 = r14 + r0
        L_0x021c:
            if (r12 <= 0) goto L_0x0249
            int r0 = r12 + -1
            r1 = r27
            r2 = 0
            boolean r0 = r1.mo4104(r11, r0, r2)
            if (r0 != 0) goto L_0x0249
            r15 = r15 | 4
            r0 = r25
            if (r12 > r0) goto L_0x0232
            r0 = 20
            goto L_0x0233
        L_0x0232:
            r0 = 0
        L_0x0233:
            r1 = 2
            r18[r1] = r0
            r0 = r8
            r1 = r9
            r2 = r11
            int r3 = r12 + -1
            r4 = r16
            r5 = r26
            r6 = 2
            r6 = r18[r6]
            int r6 = r17 + r6
            int r0 = m675(r0, r1, r2, r3, r4, r5, r6)
            int r14 = r14 + r0
        L_0x0249:
            if (r11 >= r10) goto L_0x0276
            int r0 = r11 + 1
            r1 = r27
            r2 = 0
            boolean r0 = r1.mo4104(r0, r12, r2)
            if (r0 != 0) goto L_0x0276
            r15 = r15 | 8
            r0 = r24
            if (r11 < r0) goto L_0x025f
            r0 = 20
            goto L_0x0260
        L_0x025f:
            r0 = 0
        L_0x0260:
            r1 = 3
            r18[r1] = r0
            r0 = r8
            r1 = r9
            int r2 = r11 + 1
            r3 = r12
            r4 = r16
            r5 = r26
            r6 = 3
            r6 = r18[r6]
            int r6 = r17 + r6
            int r0 = m675(r0, r1, r2, r3, r4, r5, r6)
            int r14 = r14 + r0
        L_0x0276:
            r0 = r15 & 3
            r1 = 3
            if (r0 != r1) goto L_0x02a2
            int r0 = r11 + -1
            int r1 = r12 + 1
            r2 = r27
            r3 = 0
            boolean r0 = r2.mo4104(r0, r1, r3)
            if (r0 != 0) goto L_0x02a2
            r0 = r8
            r1 = r9
            int r2 = r11 + -1
            int r3 = r12 + 1
            int r4 = r16 + 4
            r5 = r26
            r6 = 1
            r6 = r18[r6]
            int r6 = r17 + r6
            r7 = 0
            r7 = r18[r7]
            int r6 = r6 + r7
            int r6 = r6 + -6
            int r0 = m675(r0, r1, r2, r3, r4, r5, r6)
            int r14 = r14 + r0
        L_0x02a2:
            r0 = r15 & 6
            r1 = 6
            if (r0 != r1) goto L_0x02ce
            int r0 = r11 + -1
            int r1 = r12 + -1
            r2 = r27
            r3 = 0
            boolean r0 = r2.mo4104(r0, r1, r3)
            if (r0 != 0) goto L_0x02ce
            r0 = r8
            r1 = r9
            int r2 = r11 + -1
            int r3 = r12 + -1
            int r4 = r16 + 4
            r5 = r26
            r6 = 1
            r6 = r18[r6]
            int r6 = r17 + r6
            r7 = 2
            r7 = r18[r7]
            int r6 = r6 + r7
            int r6 = r6 + -6
            int r0 = m675(r0, r1, r2, r3, r4, r5, r6)
            int r14 = r14 + r0
        L_0x02ce:
            r0 = r15 & 12
            r1 = 12
            if (r0 != r1) goto L_0x02fb
            int r0 = r11 + 1
            int r1 = r12 + -1
            r2 = r27
            r3 = 0
            boolean r0 = r2.mo4104(r0, r1, r3)
            if (r0 != 0) goto L_0x02fb
            r0 = r8
            r1 = r9
            int r2 = r11 + 1
            int r3 = r12 + -1
            int r4 = r16 + 4
            r5 = r26
            r6 = 3
            r6 = r18[r6]
            int r6 = r17 + r6
            r7 = 2
            r7 = r18[r7]
            int r6 = r6 + r7
            int r6 = r6 + -6
            int r0 = m675(r0, r1, r2, r3, r4, r5, r6)
            int r14 = r14 + r0
        L_0x02fb:
            r0 = r15 & 9
            r1 = 9
            if (r0 != r1) goto L_0x0328
            int r0 = r11 + 1
            int r1 = r12 + 1
            r2 = r27
            r3 = 0
            boolean r0 = r2.mo4104(r0, r1, r3)
            if (r0 != 0) goto L_0x0328
            r0 = r8
            r1 = r9
            int r2 = r11 + 1
            int r3 = r12 + 1
            int r4 = r16 + 4
            r5 = r26
            r6 = 3
            r6 = r18[r6]
            int r6 = r17 + r6
            r7 = 0
            r7 = r18[r7]
            int r6 = r6 + r7
            int r6 = r6 + -6
            int r0 = m675(r0, r1, r2, r3, r4, r5, r6)
            int r14 = r14 + r0
        L_0x0328:
            r0 = r9[r26]
            r1 = 1
            r0.f1345 = r1
            if (r14 != 0) goto L_0x0336
            r0 = 0
            r0 = r8[r0]
            r1 = 145(0x91, float:2.03E-43)
            if (r0 < r1) goto L_0x00ff
        L_0x0336:
            r0 = 0
            return r0
        L_0x0338:
            r0 = r24
            if (r11 != r0) goto L_0x0340
            r0 = r25
            if (r12 == r0) goto L_0x0342
        L_0x0340:
            r0 = 0
            return r0
        L_0x0342:
            r24 = 0
            r10 = r26
            goto L_0x034d
        L_0x0347:
            r0 = r9[r10]
            int r10 = r0.f1346
            int r24 = r24 + 1
        L_0x034d:
            r0 = r24
            r1 = 100
            if (r0 >= r1) goto L_0x035b
            int r0 = r23 * 32
            int r0 = r22 + r0
            r0 = r0 & 1023(0x3ff, float:1.434E-42)
            if (r10 != r0) goto L_0x0347
        L_0x035b:
            r0 = r24
            r1 = 100
            if (r0 == r1) goto L_0x036a
            r0 = r21
            int[] r0 = r0.f1662
            int r0 = r0.length
            r1 = r24
            if (r1 < r0) goto L_0x036c
        L_0x036a:
            r0 = 0
            return r0
        L_0x036c:
            r0 = r24
            r1 = r21
            r1.f1664 = r0
            r0 = 0
            r1 = r21
            r1.f1663 = r0
            r10 = r26
            int r22 = r24 + -1
            goto L_0x03c2
        L_0x037d:
            r0 = r9[r10]
            int r0 = r0.f1349
            r1 = r9[r10]
            int r1 = r1.f1346
            r1 = r9[r1]
            int r1 = r1.f1349
            int r13 = r0 - r1
            r0 = r9[r10]
            int r0 = r0.f1348
            r1 = r9[r10]
            int r1 = r1.f1346
            r1 = r9[r1]
            int r1 = r1.f1348
            int r14 = r0 - r1
            if (r13 != 0) goto L_0x03a1
            if (r14 <= 0) goto L_0x039f
            r14 = 0
            goto L_0x03a0
        L_0x039f:
            r14 = 4
        L_0x03a0:
            goto L_0x03b6
        L_0x03a1:
            if (r13 <= 0) goto L_0x03ad
            if (r14 != 0) goto L_0x03a7
            r14 = 6
            goto L_0x03ac
        L_0x03a7:
            if (r14 >= 0) goto L_0x03ab
            r14 = 5
            goto L_0x03ac
        L_0x03ab:
            r14 = 7
        L_0x03ac:
            goto L_0x03b6
        L_0x03ad:
            if (r14 != 0) goto L_0x03b1
            r14 = 2
            goto L_0x03b6
        L_0x03b1:
            if (r14 <= 0) goto L_0x03b5
            r14 = 1
            goto L_0x03b6
        L_0x03b5:
            r14 = 3
        L_0x03b6:
            r0 = r21
            int[] r0 = r0.f1662
            r0[r22] = r14
            r0 = r9[r10]
            int r10 = r0.f1346
            int r22 = r22 + -1
        L_0x03c2:
            if (r22 >= 0) goto L_0x037d
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0593nt.m678(o.lm, int, int, int, int, boolean, o.tc):boolean");
    }
}
