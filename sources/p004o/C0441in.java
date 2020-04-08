package p004o;

import android.graphics.Point;
import android.util.Log;
import com.roworkshop.andro.Quantize32;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: o.in */
public final class C0441in {

    /* renamed from: ć */
    public static int f1306 = 4096;

    /* renamed from: Ą */
    int f1307;

    /* renamed from: ą */
    int f1308;

    /* renamed from: Ć */
    boolean f1309;

    /* renamed from: ċ */
    private C0443[] f1310;

    /* renamed from: đ */
    private int f1311;

    /* renamed from: Ē */
    private byte[] f1312;

    /* renamed from: ȃ */
    int f1313;

    /* renamed from: Ȋ */
    C0442if[] f1314;

    /* renamed from: ˮ͈ */
    Point f1315;

    /* renamed from: ˮ͍ */
    HashMap<String, C0442if> f1316;

    /* renamed from: ܕ */
    private int f1317;

    /* renamed from: 䒧 */
    private int[] f1318;

    /* renamed from: 岱 */
    HashMap<String, C0443> f1319;

    /* renamed from: 庸 */
    private int f1320;

    /* renamed from: 櫯 */
    int f1321;

    /* renamed from: 纫 */
    private int[] f1322;

    /* renamed from: 躆 */
    private final int f1323;

    /* renamed from: 鷭 */
    int f1324;

    /* renamed from: o.in$if */
    class C0442if {

        /* renamed from: Ą */
        short f1325;

        /* renamed from: ą */
        short f1326;

        /* renamed from: Ć */
        int f1327;

        /* renamed from: ć */
        boolean f1328;

        /* renamed from: ȃ */
        short f1329;

        /* renamed from: ˮ͈ */
        short f1330;

        /* renamed from: ˮ͍ */
        boolean f1331 = m464();

        /* renamed from: 櫯 */
        String f1333;

        /* renamed from: 鷭 */
        byte[] f1334;

        C0442if(byte[] bArr, short s, short s2, short s3, short s4, String str, int i) {
            this.f1330 = s;
            this.f1329 = s2;
            this.f1325 = s3;
            this.f1326 = s4;
            this.f1333 = str;
            this.f1327 = i;
            this.f1334 = Arrays.copyOf(bArr, s3 * s4);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: 鷭 */
        public final float[] mo3839() {
            short s = C0595nv.f2860 ? (short) 1 : 0;
            return new float[]{0.0f, 0.0f, (float) this.f1330, (float) this.f1329, 0.0f, (float) (this.f1326 - s), (float) this.f1330, (float) this.f1329, (float) (this.f1325 - s), 0.0f, (float) this.f1330, (float) this.f1329, (float) (this.f1325 - s), (float) (this.f1326 - s), (float) this.f1330, (float) this.f1329};
        }

        /* renamed from: 櫯 */
        private boolean m464() {
            int i = 1;
            while (i < this.f1325) {
                i *= 2;
            }
            if (i != this.f1325) {
                return false;
            }
            int i2 = 1;
            while (i2 < this.f1326) {
                i2 *= 2;
            }
            if (i2 != this.f1326) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: o.in$鷭 */
    class C0443 {

        /* renamed from: ȃ */
        int[] f1336;

        /* renamed from: ˮ͈ */
        String f1337;

        /* renamed from: 櫯 */
        int f1338;

        /* renamed from: 鷭 */
        int f1339;

        C0443() {
        }
    }

    static {
    }

    C0441in() {
        this(0, 0, 0, false);
    }

    C0441in(int i, int i2, int i3, boolean z) {
        this.f1315 = new Point();
        this.f1309 = false;
        this.f1323 = 1;
        this.f1316 = new HashMap<>(30);
        this.f1319 = new HashMap<>(30);
        this.f1309 = false;
        this.f1308 = i > 0 ? i : 1;
        this.f1317 = f1306;
        this.f1324 = 1;
        this.f1321 = 1;
        this.f1313 = 1;
        this.f1307 = 1;
        while (this.f1313 < 32) {
            this.f1313 *= 2;
        }
        while (this.f1307 < 32) {
            this.f1307 *= 2;
        }
        this.f1322 = new int[((this.f1313 * this.f1307) / 8)];
        this.f1318 = new int[this.f1307];
        this.f1310 = new C0443[(this.f1324 * this.f1321)];
    }

    /* renamed from: 鷭 */
    private final boolean m459(int i, int i2) {
        int i3 = i + (this.f1313 * i2);
        return (this.f1322[i3 >> 5] & (1 << (i3 & 31))) != 0;
    }

    /* renamed from: 鷭 */
    private final int m457(int i, int i2, int i3, int i4, boolean z) {
        int i5 = this.f1313 >>> 5;
        int i6 = i + (this.f1313 * i2);
        int i7 = i3 + (i6 - 1);
        int i8 = -1 << (i6 & 31);
        int i9 = -1 >>> ((i7 & 31) ^ 31);
        int i10 = i7 >> 5;
        int i11 = i10 - (i6 >> 5);
        if (i11 == 0) {
            i9 &= i8;
            i8 = i9;
        }
        if (z) {
            int i12 = 0;
            int i13 = 0;
            while (i13 < i4) {
                if ((this.f1322[i10] & i9) != 0) {
                    i8 = i9;
                    i12 = (i11 > 0 ? 0 : i12) | (this.f1322[i10] & i9);
                    i11 = 0;
                }
                for (int i14 = (i10 - i11) + 1; i14 < i10; i14++) {
                    if (this.f1322[i14] != 0) {
                        i8 = -1;
                        i11 = i10 - i14;
                        i12 = this.f1322[i14];
                    }
                }
                if (i11 > 0 && (this.f1322[i10 - i11] & i8) != 0) {
                    i12 |= this.f1322[i10 - i11] & i8;
                }
                i13++;
                i10 += i5;
            }
            if (i12 == 0) {
                return -1;
            }
            int i15 = (((i10 - i11) % (this.f1313 >> 5)) << 5) - 1;
            while (i12 != 0) {
                i12 >>>= 1;
                i15++;
            }
            return i15;
        }
        int i16 = 0;
        while (i16 < i4) {
            int[] iArr = this.f1322;
            int i17 = i10 - i11;
            iArr[i17] = iArr[i17] | i8;
            int[] iArr2 = this.f1322;
            iArr2[i10] = iArr2[i10] | i9;
            for (int i18 = (i10 - i11) + 1; i18 < i10; i18++) {
                this.f1322[i18] = -1;
            }
            i16++;
            i10 += i5;
        }
        return 0;
    }

    /* renamed from: 櫯 */
    private int m455(int i, int i2) {
        int i3;
        for (int i4 = 0; i4 < (this.f1307 + 1) - i2; i4++) {
            if (this.f1318[i4] <= 0 || i < this.f1318[i4]) {
                int i5 = 0;
                while (true) {
                    int i6 = this.f1313 - i;
                    int i7 = i5;
                    int i8 = i4 * (this.f1313 >> 5);
                    int i9 = i7 >> 5;
                    int i10 = -1 << (i7 & 31);
                    if ((this.f1322[i9 + i8] & i10) == i10) {
                        do {
                            i9++;
                            if ((i9 << 5) > i6) {
                                break;
                            }
                        } while (this.f1322[i8 + i9] == -1);
                        i7 = i9 << 5;
                    }
                    while (true) {
                        if (i7 > i6) {
                            i3 = -1;
                            break;
                        } else if ((this.f1322[i8 + i9] & (1 << (i7 & 31))) == 0) {
                            i3 = i7;
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (i3 >= 0) {
                        int i11 = i4;
                        int i12 = i3;
                        int i13 = (i12 + i > this.f1313 || i11 + i2 > this.f1307) ? this.f1313 : (m459((i12 + i) + -1, i11) || m459((i12 + i) + -1, (i11 + i2) + -1)) ? (i12 + i) - 1 : (m459(i12, i11) || m459(i12, (i11 + i2) + -1)) ? i12 : m457(i12, i11, i, i2, true);
                        if (i13 < 0) {
                            return (this.f1313 * i4) + i3;
                        }
                        i5 = i13 + 1;
                    } else if (this.f1318[i4] == 0 || this.f1318[i4] > i) {
                        this.f1318[i4] = i;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: ˮ͈ */
    private void m454(int i, int i2) {
        int i3;
        int i4;
        if (this.f1313 == this.f1317 && this.f1307 == this.f1317) {
            throw new C0588no("Texture atlas reached its maximum dimension of " + this.f1317 + " x " + this.f1317 + " and can't be resized further. Downsampling=" + this.f1308);
        }
        if (i > 0 && i2 > 0) {
            int max = Math.max(i, this.f1313);
            int max2 = Math.max(i2, this.f1307);
            int i5 = 1;
            int i6 = 1;
            while (i5 < max) {
                i5 *= 2;
            }
            while (i6 < max2) {
                i6 *= 2;
            }
            i4 = i5;
            i3 = i6;
        } else if (this.f1313 < this.f1307) {
            i4 = this.f1313 * 2;
            i3 = this.f1307;
        } else {
            i3 = this.f1307 * 2;
            i4 = this.f1313;
        }
        int[] iArr = new int[((i4 * i3) / 32)];
        for (int i7 = 0; i7 < this.f1307; i7++) {
            System.arraycopy(this.f1322, (this.f1313 * i7) / 32, iArr, (i7 * i4) / 32, this.f1313 / 32);
        }
        this.f1313 = i4;
        this.f1307 = i3;
        this.f1322 = iArr;
        this.f1318 = new int[this.f1307];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final int[] mo3838() {
        int i = this.f1324;
        int i2 = this.f1321;
        int i3 = this.f1324 * 16;
        C0443[] r7 = this.f1310;
        int[] iArr = new int[(i * 16 * i2 * 16)];
        for (int i4 = 0; i4 < r7.length; i4++) {
            if (r7[i4] != null) {
                Point point = new Point(i4 % i, i4 / i);
                Point point2 = new Point(point.x * 16, point.y * 16);
                Point point3 = new Point();
                Point point4 = new Point();
                point3.y = 0;
                while (point3.y < 16) {
                    point3.x = 0;
                    while (point3.x < 16) {
                        point4.x = point2.x + point3.x;
                        point4.y = point2.y + point3.y;
                        iArr[point4.x + (point4.y * i3)] = r7[i4].f1336[point3.x + (point3.y * 16)];
                        point3.x++;
                    }
                    point3.y++;
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: used method not loaded: o.no.<init>(java.lang.String):null, types can be incorrect */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r11 == null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r25 > 0) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r25 = r18.f1308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r25 <= 1) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        r13 = java.lang.Math.max(r21 / r25, 1);
        r14 = java.lang.Math.max(r22 / r25, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        if (r18.f1312 == null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (r18.f1312.length >= (r13 * r14)) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        r18.f1312 = new byte[(r13 * r14)];
        r10 = r18.f1312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        if (r20 == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        r22 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006f, code lost:
        r10[r15 + (r13 * r22)] = (byte) r19[(r15 * r25) + (r21 * (r22 * r25))];
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
        if (r15 < r13) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        r22 = r22 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0088, code lost:
        if (r22 < r14) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008c, code lost:
        r20 = new int[256];
        r22 = new int[(r13 * r14)];
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009a, code lost:
        r16 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009d, code lost:
        r22[r16 + (r13 * r15)] = r19[(r16 * r25) + (r21 * (r15 * r25))];
        r16 = r16 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b0, code lost:
        if (r16 < r13) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b2, code lost:
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b4, code lost:
        if (r15 < r14) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b6, code lost:
        m458(r22, r13, r10, r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bd, code lost:
        r21 = r13;
        r22 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c6, code lost:
        if (r18.f1312 == null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cf, code lost:
        if (r18.f1312.length >= (r21 * r22)) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d1, code lost:
        r18.f1312 = new byte[(r21 * r22)];
        r10 = r18.f1312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dd, code lost:
        if (r20 == null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00df, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e1, code lost:
        r10[r11] = (byte) r19[r11];
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00eb, code lost:
        if (r11 < r19.length) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ee, code lost:
        r20 = new int[256];
        m458(r19, r21, r10, r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0105, code lost:
        if (r18.f1316.size() != 0) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0107, code lost:
        r18.f1320 = r21;
        r18.f1311 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0114, code lost:
        r18.f1320 = java.lang.Math.min(r18.f1320, r21);
        r18.f1311 = java.lang.Math.min(r18.f1311, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0130, code lost:
        r11 = r22;
        r25 = r21;
        r19 = r18;
        r12 = m455(r25, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013f, code lost:
        if (r12 == -1) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0141, code lost:
        r11 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0143, code lost:
        m454(0, 0);
        r12 = m455(r25, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0153, code lost:
        if (r12 == -1) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0155, code lost:
        r11 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0157, code lost:
        r19 = "Couldn't find a place for " + r25 + "x" + r11 + " texture even after resize";
        android.util.Log.e("AndRO", r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0186, code lost:
        throw new p004o.C0588no(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0187, code lost:
        r12 = r11 % r18.f1313;
        r13 = r11 / r18.f1313;
        m457(r12, r13, r21, r22, false);
        r22 = new p004o.C0441in.C0442if(r18, r10, (short) r12, (short) r13, (short) r21, (short) r22, r23, mo3835(r20, r24));
        r18.f1316.put(r23, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01cd, code lost:
        if (r18.f1314 != null) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01cf, code lost:
        r18.f1314 = new p004o.C0441in.C0442if[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01d7, code lost:
        r18.f1314 = (p004o.C0441in.C0442if[]) java.util.Arrays.copyOf(r18.f1314, r18.f1314.length + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ec, code lost:
        r18.f1314[r18.f1314.length - 1] = r22;
        java.util.Arrays.sort(r18.f1314, new p004o.C0444io(r18));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0207, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0208, code lost:
        return r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        r10 = r18.f1312;
        r11 = (p004o.C0441in.C0442if) r18.f1316.get(r23);
     */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p004o.C0441in.C0442if mo3837(int[] r19, int[] r20, int r21, int r22, java.lang.String r23, java.lang.String r24, int r25) {
        /*
            r18 = this;
            r9 = r18
            monitor-enter(r18)
            goto L_0x000d
        L_0x0004:
            r0 = r18
            r1 = r21
            r2 = r22
            r0.m454(r1, r2)     // Catch:{ all -> 0x0209 }
        L_0x000d:
            r0 = r18
            int r0 = r0.f1313     // Catch:{ all -> 0x0209 }
            r1 = r21
            if (r0 < r1) goto L_0x0004
            r0 = r18
            int r0 = r0.f1307     // Catch:{ all -> 0x0209 }
            r1 = r22
            if (r0 < r1) goto L_0x0004
            r0 = r18
            byte[] r10 = r0.f1312     // Catch:{ all -> 0x0209 }
            r0 = r18
            java.util.HashMap<java.lang.String, o.in$if> r0 = r0.f1316     // Catch:{ all -> 0x0209 }
            r1 = r23
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0209 }
            o.in$if r0 = (p004o.C0441in.C0442if) r0     // Catch:{ all -> 0x0209 }
            r11 = r0
            if (r11 == 0) goto L_0x0032
            monitor-exit(r9)     // Catch:{ all -> 0x0209 }
            return r11
        L_0x0032:
            if (r25 > 0) goto L_0x003a
            r0 = r18
            int r0 = r0.f1308     // Catch:{ all -> 0x0209 }
            r25 = r0
        L_0x003a:
            r0 = r25
            r1 = 1
            if (r0 <= r1) goto L_0x00c2
            int r0 = r21 / r25
            r1 = 1
            int r13 = java.lang.Math.max(r0, r1)     // Catch:{ all -> 0x0209 }
            int r0 = r22 / r25
            r1 = 1
            int r14 = java.lang.Math.max(r0, r1)     // Catch:{ all -> 0x0209 }
            r0 = r18
            byte[] r0 = r0.f1312     // Catch:{ all -> 0x0209 }
            if (r0 == 0) goto L_0x005c
            r0 = r18
            byte[] r0 = r0.f1312     // Catch:{ all -> 0x0209 }
            int r0 = r0.length     // Catch:{ all -> 0x0209 }
            int r1 = r13 * r14
            if (r0 >= r1) goto L_0x0068
        L_0x005c:
            int r0 = r13 * r14
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0209 }
            r1 = r18
            r1.f1312 = r0     // Catch:{ all -> 0x0209 }
            r0 = r18
            byte[] r10 = r0.f1312     // Catch:{ all -> 0x0209 }
        L_0x0068:
            if (r20 == 0) goto L_0x008c
            r22 = 0
            goto L_0x0086
        L_0x006d:
            r15 = 0
            goto L_0x0082
        L_0x006f:
            int r16 = r15 * r25
            int r11 = r22 * r25
            int r0 = r13 * r22
            int r12 = r15 + r0
            int r0 = r21 * r11
            int r11 = r16 + r0
            r0 = r19[r11]     // Catch:{ all -> 0x0209 }
            byte r0 = (byte) r0     // Catch:{ all -> 0x0209 }
            r10[r12] = r0     // Catch:{ all -> 0x0209 }
            int r15 = r15 + 1
        L_0x0082:
            if (r15 < r13) goto L_0x006f
            int r22 = r22 + 1
        L_0x0086:
            r0 = r22
            if (r0 < r14) goto L_0x006d
            goto L_0x00bd
        L_0x008c:
            r0 = 256(0x100, float:3.59E-43)
            int[] r0 = new int[r0]     // Catch:{ all -> 0x0209 }
            r20 = r0
            int r0 = r13 * r14
            int[] r1 = new int[r0]     // Catch:{ all -> 0x0209 }
            r22 = r1
            r15 = 0
            goto L_0x00b4
        L_0x009a:
            r16 = 0
            goto L_0x00ae
        L_0x009d:
            int r11 = r16 * r25
            int r17 = r15 * r25
            int r0 = r13 * r15
            int r12 = r16 + r0
            int r0 = r21 * r17
            int r11 = r11 + r0
            r0 = r19[r11]     // Catch:{ all -> 0x0209 }
            r22[r12] = r0     // Catch:{ all -> 0x0209 }
            int r16 = r16 + 1
        L_0x00ae:
            r0 = r16
            if (r0 < r13) goto L_0x009d
            int r15 = r15 + 1
        L_0x00b4:
            if (r15 < r14) goto L_0x009a
            r0 = r22
            r1 = r20
            m458(r0, r13, r10, r1)     // Catch:{ all -> 0x0209 }
        L_0x00bd:
            r21 = r13
            r22 = r14
            goto L_0x00fd
        L_0x00c2:
            r0 = r18
            byte[] r0 = r0.f1312     // Catch:{ all -> 0x0209 }
            if (r0 == 0) goto L_0x00d1
            r0 = r18
            byte[] r0 = r0.f1312     // Catch:{ all -> 0x0209 }
            int r0 = r0.length     // Catch:{ all -> 0x0209 }
            int r1 = r21 * r22
            if (r0 >= r1) goto L_0x00dd
        L_0x00d1:
            int r0 = r21 * r22
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0209 }
            r1 = r18
            r1.f1312 = r0     // Catch:{ all -> 0x0209 }
            r0 = r18
            byte[] r10 = r0.f1312     // Catch:{ all -> 0x0209 }
        L_0x00dd:
            if (r20 == 0) goto L_0x00ee
            r11 = 0
            goto L_0x00e8
        L_0x00e1:
            r0 = r19[r11]     // Catch:{ all -> 0x0209 }
            byte r0 = (byte) r0     // Catch:{ all -> 0x0209 }
            r10[r11] = r0     // Catch:{ all -> 0x0209 }
            int r11 = r11 + 1
        L_0x00e8:
            r0 = r19
            int r0 = r0.length     // Catch:{ all -> 0x0209 }
            if (r11 < r0) goto L_0x00e1
            goto L_0x00fd
        L_0x00ee:
            r0 = 256(0x100, float:3.59E-43)
            int[] r0 = new int[r0]     // Catch:{ all -> 0x0209 }
            r20 = r0
            r0 = r19
            r1 = r21
            r2 = r20
            m458(r0, r1, r10, r2)     // Catch:{ all -> 0x0209 }
        L_0x00fd:
            r0 = r18
            java.util.HashMap<java.lang.String, o.in$if> r0 = r0.f1316     // Catch:{ all -> 0x0209 }
            int r0 = r0.size()     // Catch:{ all -> 0x0209 }
            if (r0 != 0) goto L_0x0114
            r0 = r21
            r1 = r18
            r1.f1320 = r0     // Catch:{ all -> 0x0209 }
            r0 = r22
            r1 = r18
            r1.f1311 = r0     // Catch:{ all -> 0x0209 }
            goto L_0x0130
        L_0x0114:
            r0 = r18
            int r0 = r0.f1320     // Catch:{ all -> 0x0209 }
            r1 = r21
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x0209 }
            r1 = r18
            r1.f1320 = r0     // Catch:{ all -> 0x0209 }
            r0 = r18
            int r0 = r0.f1311     // Catch:{ all -> 0x0209 }
            r1 = r22
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x0209 }
            r1 = r18
            r1.f1311 = r0     // Catch:{ all -> 0x0209 }
        L_0x0130:
            r11 = r22
            r25 = r21
            r19 = r18
            r0 = r18
            r1 = r25
            int r12 = r0.m455(r1, r11)     // Catch:{ all -> 0x0209 }
            r0 = -1
            if (r12 == r0) goto L_0x0143
            r11 = r12
            goto L_0x0187
        L_0x0143:
            r0 = r19
            r1 = 0
            r2 = 0
            r0.m454(r1, r2)     // Catch:{ all -> 0x0209 }
            r0 = r19
            r1 = r25
            int r12 = r0.m455(r1, r11)     // Catch:{ all -> 0x0209 }
            r0 = -1
            if (r12 == r0) goto L_0x0157
            r11 = r12
            goto L_0x0187
        L_0x0157:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0209 }
            java.lang.String r1 = "Couldn't find a place for "
            r0.<init>(r1)     // Catch:{ all -> 0x0209 }
            r1 = r25
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ all -> 0x0209 }
            java.lang.String r1 = "x"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ all -> 0x0209 }
            java.lang.StringBuilder r0 = r0.append(r11)     // Catch:{ all -> 0x0209 }
            java.lang.String r1 = " texture even after resize"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ all -> 0x0209 }
            java.lang.String r19 = r0.toString()     // Catch:{ all -> 0x0209 }
            java.lang.String r0 = "AndRO"
            r1 = r19
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x0209 }
            o.no r0 = new o.no     // Catch:{ all -> 0x0209 }
            r1 = r19
            r0.<init>(r1)     // Catch:{ all -> 0x0209 }
            throw r0     // Catch:{ all -> 0x0209 }
        L_0x0187:
            r0 = r18
            int r0 = r0.f1313     // Catch:{ all -> 0x0209 }
            int r12 = r11 % r0
            r0 = r18
            int r0 = r0.f1313     // Catch:{ all -> 0x0209 }
            int r13 = r11 / r0
            r0 = r18
            r1 = r12
            r2 = r13
            r3 = r21
            r4 = r22
            r5 = 0
            r0.m457(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0209 }
            r0 = r18
            r1 = r20
            r2 = r24
            int r14 = r0.mo3835(r1, r2)     // Catch:{ all -> 0x0209 }
            o.in$if r0 = new o.in$if     // Catch:{ all -> 0x0209 }
            r1 = r18
            r2 = r10
            short r3 = (short) r12     // Catch:{ all -> 0x0209 }
            short r4 = (short) r13     // Catch:{ all -> 0x0209 }
            r5 = r21
            short r5 = (short) r5     // Catch:{ all -> 0x0209 }
            r6 = r22
            short r6 = (short) r6     // Catch:{ all -> 0x0209 }
            r7 = r23
            r8 = r14
            r0.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0209 }
            r22 = r0
            r0 = r18
            java.util.HashMap<java.lang.String, o.in$if> r0 = r0.f1316     // Catch:{ all -> 0x0209 }
            r1 = r23
            r2 = r22
            r0.put(r1, r2)     // Catch:{ all -> 0x0209 }
            r0 = r18
            o.in$if[] r0 = r0.f1314     // Catch:{ all -> 0x0209 }
            if (r0 != 0) goto L_0x01d7
            r0 = 1
            o.in$if[] r0 = new p004o.C0441in.C0442if[r0]     // Catch:{ all -> 0x0209 }
            r1 = r18
            r1.f1314 = r0     // Catch:{ all -> 0x0209 }
            goto L_0x01ec
        L_0x01d7:
            r0 = r18
            o.in$if[] r0 = r0.f1314     // Catch:{ all -> 0x0209 }
            r1 = r18
            o.in$if[] r1 = r1.f1314     // Catch:{ all -> 0x0209 }
            int r1 = r1.length     // Catch:{ all -> 0x0209 }
            int r1 = r1 + 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch:{ all -> 0x0209 }
            o.in$if[] r0 = (p004o.C0441in.C0442if[]) r0     // Catch:{ all -> 0x0209 }
            r1 = r18
            r1.f1314 = r0     // Catch:{ all -> 0x0209 }
        L_0x01ec:
            r0 = r18
            o.in$if[] r0 = r0.f1314     // Catch:{ all -> 0x0209 }
            r1 = r18
            o.in$if[] r1 = r1.f1314     // Catch:{ all -> 0x0209 }
            int r1 = r1.length     // Catch:{ all -> 0x0209 }
            int r1 = r1 + -1
            r0[r1] = r22     // Catch:{ all -> 0x0209 }
            r0 = r18
            o.in$if[] r0 = r0.f1314     // Catch:{ all -> 0x0209 }
            o.io r1 = new o.io     // Catch:{ all -> 0x0209 }
            r2 = r18
            r1.<init>(r2)     // Catch:{ all -> 0x0209 }
            java.util.Arrays.sort(r0, r1)     // Catch:{ all -> 0x0209 }
            monitor-exit(r9)     // Catch:{ all -> 0x0209 }
            return r22
        L_0x0209:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0209 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0441in.mo3837(int[], int[], int, int, java.lang.String, java.lang.String, int):o.in$if");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final int mo3835(int[] iArr, String str) {
        int i;
        int i2;
        synchronized (this) {
            if (str != null) {
                C0443 r4 = (C0443) this.f1319.get(str);
                if (r4 != null) {
                    r4.f1338++;
                    int i3 = r4.f1339;
                    return i3;
                }
            }
            int[] iArr2 = new int[256];
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                iArr2[i4] = (-16711936 & i5) | ((16711680 & i5) >> 16) | ((i5 & 255) << 16);
            }
            int i6 = 0;
            while (true) {
                if (i6 >= this.f1310.length) {
                    i = -1;
                    break;
                } else if (this.f1310[i6] == null) {
                    i = i6;
                    break;
                } else {
                    i6++;
                }
            }
            int i7 = i;
            if (i == -1) {
                int i8 = this.f1324;
                int i9 = this.f1321;
                if (this.f1324 < this.f1321) {
                    i8 *= 2;
                } else {
                    i9 *= 2;
                }
                this.f1310 = (C0443[]) Arrays.copyOf(this.f1310, i8 * i9);
                this.f1324 = i8;
                this.f1321 = i9;
                int i10 = 0;
                while (true) {
                    if (i10 >= this.f1310.length) {
                        i2 = -1;
                        break;
                    } else if (this.f1310[i10] == null) {
                        i2 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
                i7 = i2;
                if (i2 == -1) {
                    String str2 = "Failed to find palette rect even after resize.";
                    Log.e("AndRO", str2);
                    throw new C0588no(str2);
                }
            }
            C0443 r9 = new C0443();
            r9.f1338 = 1;
            r9.f1339 = i7;
            r9.f1337 = str;
            r9.f1336 = Arrays.copyOf(iArr2, 256);
            for (int i11 = 0; i11 < r9.f1336.length; i11++) {
                if ((r9.f1336[i11] & -986896) == -1048336) {
                    r9.f1336[i11] = 0;
                }
            }
            this.f1310[i7] = r9;
            if (str != null) {
                this.f1319.put(str, r9);
            }
            return i7;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C0442if mo3836(byte[] bArr, int[] iArr, int i, int i2, String str, String str2) {
        int[] iArr2 = new int[bArr.length];
        for (int i3 = 0; i3 < bArr.length; i3++) {
            iArr2[i3] = C0622ot.m730(bArr[i3]);
        }
        return mo3837(iArr2, iArr, i, i2, str, str2, this.f1308);
    }

    /* renamed from: 櫯 */
    private static boolean m456(int[] iArr, int i, byte[] bArr, int[] iArr2) {
        int i2 = 0;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = 0;
            while (i4 < i2 && iArr2[i4] != iArr[i3]) {
                i4++;
            }
            bArr[i3] = (byte) i4;
            if (i4 >= i2) {
                if (i2 == i) {
                    return false;
                }
                iArr2[i2] = iArr[i3];
                i2++;
            }
            i3++;
        }
        return true;
    }

    /* renamed from: 鷭 */
    static void m458(int[] iArr, int i, byte[] bArr, int[] iArr2) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if ((iArr[i2] & -986896) == -1048336) {
                iArr[i2] = 0;
            }
        }
        if (!m456(iArr, iArr2.length, bArr, iArr2)) {
            int[] r5 = Quantize32.m18(iArr, i, iArr2.length);
            for (int i3 = 0; i3 < iArr.length; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
            System.arraycopy(r5, 0, iArr2, 0, r5.length);
        }
    }
}
