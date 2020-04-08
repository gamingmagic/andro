package com.roworkshop.andro;

import org.apache.http.message.TokenParser;

public class Quantize32 {

    /* renamed from: 櫯 */
    static int[] f18 = new int[9];

    /* renamed from: 鷭 */
    static int[] f19 = new int[511];

    /* renamed from: com.roworkshop.andro.Quantize32$鷭 */
    static class C0158 {

        /* renamed from: Ą */
        C0160 f20;

        /* renamed from: ą */
        int f21 = 1;

        /* renamed from: Ć */
        int f22;

        /* renamed from: ć */
        int f23;

        /* renamed from: ȃ */
        int[] f24;

        /* renamed from: ˮ͈ */
        int f25;

        /* renamed from: 櫯 */
        int[] f26;

        /* renamed from: 鷭 */
        int f27;

        /* renamed from: com.roworkshop.andro.Quantize32$鷭$if */
        static class C0159if {
            C0159if() {
            }
        }

        /* renamed from: com.roworkshop.andro.Quantize32$鷭$鷭 */
        static class C0160 {

            /* renamed from: Ą */
            int f28;

            /* renamed from: ą */
            int f29;

            /* renamed from: Ć */
            int f30;

            /* renamed from: ć */
            int f31;

            /* renamed from: ċ */
            int f32;

            /* renamed from: ȃ */
            int f33;

            /* renamed from: Ȋ */
            long f34;

            /* renamed from: ˮ͈ */
            C0160[] f35;

            /* renamed from: ˮ͍ */
            int f36;

            /* renamed from: ܕ */
            int f37;

            /* renamed from: 䒧 */
            int f38;

            /* renamed from: 岱 */
            int f39;

            /* renamed from: 庸 */
            int f40;

            /* renamed from: 櫯 */
            C0160 f41;

            /* renamed from: 纫 */
            int f42;

            /* renamed from: 躆 */
            int f43;

            /* renamed from: 鷭 */
            C0158 f44;

            C0160(C0158 r3) {
                this.f44 = r3;
                this.f41 = this;
                this.f35 = new C0160[16];
                this.f28 = 0;
                this.f29 = 0;
                this.f34 = Long.MAX_VALUE;
                this.f31 = 128;
                this.f36 = 128;
                this.f39 = 128;
                this.f30 = 128;
            }

            C0160(C0160 r4, int i, int i2) {
                this.f44 = r4.f44;
                this.f41 = r4;
                this.f35 = new C0160[16];
                this.f28 = i;
                this.f29 = i2;
                this.f44.f23++;
                if (i2 == this.f44.f21) {
                    this.f44.f22++;
                }
                r4.f33++;
                r4.f35[i] = this;
                int i3 = (1 << (8 - i2)) >> 1;
                this.f31 = r4.f31 + ((i & 1) > 0 ? i3 : -i3);
                this.f36 = r4.f36 + ((i & 2) > 0 ? i3 : -i3);
                this.f39 = r4.f39 + ((i & 4) > 0 ? i3 : -i3);
                this.f30 = r4.f30 + ((i & 8) > 0 ? i3 : -i3);
            }

            /* renamed from: ˮ͈ */
            private void m19() {
                this.f41.f33--;
                this.f41.f32 += this.f32;
                this.f41.f42 += this.f42;
                this.f41.f38 += this.f38;
                this.f41.f43 += this.f43;
                this.f41.f37 += this.f37;
                this.f41.f35[this.f28] = null;
                this.f44.f23--;
                this.f44 = null;
                this.f41 = null;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: 鷭 */
            public final void mo3375() {
                if (this.f33 != 0) {
                    for (int i = 0; i < this.f35.length; i++) {
                        if (this.f35[i] != null) {
                            this.f35[i].mo3375();
                        }
                    }
                }
                if (this.f29 == this.f44.f21) {
                    m19();
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: 鷭 */
            public final long mo3374(long j, long j2) {
                if (this.f33 != 0) {
                    for (int i = 0; i < this.f35.length; i++) {
                        if (this.f35[i] != null) {
                            j2 = this.f35[i].mo3374(j, j2);
                        }
                    }
                }
                if (this.f34 <= j) {
                    m19();
                    return j2;
                }
                if (this.f32 != 0) {
                    this.f44.f22++;
                }
                if (this.f34 < j2) {
                    return this.f34;
                }
                return j2;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: 櫯 */
            public final void mo3373() {
                if (this.f33 != 0) {
                    for (int i = 0; i < this.f35.length; i++) {
                        if (this.f35[i] != null) {
                            this.f35[i].mo3373();
                        }
                    }
                }
                if (this.f32 != 0) {
                    this.f44.f24[this.f44.f22] = ((((this.f42 + (this.f32 >> 1)) / this.f32) & 255) << 24) | ((((this.f38 + (this.f32 >> 1)) / this.f32) & 255) << 16) | ((((this.f43 + (this.f32 >> 1)) / this.f32) & 255) << 8) | ((((this.f37 + (this.f32 >> 1)) / this.f32) & 255) << 0);
                    C0158 r1 = this.f44;
                    int i2 = r1.f22;
                    r1.f22 = i2 + 1;
                    this.f40 = i2;
                }
            }

            public final String toString() {
                StringBuffer stringBuffer = new StringBuffer();
                if (this.f41 == this) {
                    stringBuffer.append("root");
                } else {
                    stringBuffer.append("node");
                }
                stringBuffer.append(TokenParser.f9030SP);
                stringBuffer.append(this.f29);
                stringBuffer.append(" [");
                stringBuffer.append(this.f30);
                stringBuffer.append(',');
                stringBuffer.append(this.f31);
                stringBuffer.append(',');
                stringBuffer.append(this.f36);
                stringBuffer.append(',');
                stringBuffer.append(this.f39);
                stringBuffer.append(']');
                return new String(stringBuffer);
            }
        }

        C0158(int[] iArr, int i, int i2) {
            this.f27 = i;
            this.f26 = iArr;
            this.f25 = i2;
            int i3 = i2;
            while (i3 != 0) {
                i3 /= 4;
                this.f21++;
            }
            if (this.f21 > 1) {
                this.f21--;
            }
            if (this.f21 > 8) {
                this.f21 = 8;
            } else if (this.f21 < 2) {
                this.f21 = 2;
            }
            this.f20 = new C0160(this);
        }
    }

    static {
        for (int i = 0; i < f19.length; i++) {
            f19[i] = (i - 255) * (i - 255);
        }
        for (int i2 = 0; i2 < 9; i2++) {
            f18[i2] = 1 << (15 - i2);
        }
    }

    /* renamed from: 鷭 */
    public static int[] m18(int[] iArr, int i, int i2) {
        C0158 r0 = new C0158(iArr, i, i2);
        C0158 r16 = r0;
        C0158 r17 = r0;
        int[] iArr2 = r0.f26;
        int i3 = r17.f27;
        int length = iArr2.length / i3;
        int i4 = i3;
        while (true) {
            int i5 = i4;
            i4--;
            if (i5 <= 0) {
                break;
            }
            int i6 = length;
            while (true) {
                int i7 = i6;
                i6--;
                if (i7 > 0) {
                    int i8 = iArr2[(i6 * i3) + i4];
                    int i9 = (i8 >> 24) & 255;
                    int i10 = (i8 >> 16) & 255;
                    int i11 = (i8 >> 8) & 255;
                    int i12 = (i8 >> 0) & 255;
                    if (r17.f23 > 266817) {
                        r17.f20.mo3375();
                        r17.f21--;
                    }
                    C0160 r13 = r17.f20;
                    for (int i13 = 1; i13 <= r17.f21; i13++) {
                        int i14 = ((i10 > r13.f31 ? 1 : 0) << 0) | ((i11 > r13.f36 ? 1 : 0) << 1) | ((i12 > r13.f39 ? 1 : 0) << 2) | ((i9 > r13.f30 ? 1 : 0) << 3);
                        if (r13.f35[i14] == null) {
                            new C0160(r13, i14, i13);
                        }
                        r13 = r13.f35[i14];
                        r13.f34 += (long) f18[i13];
                    }
                    r13.f32++;
                    r13.f42 += i9;
                    r13.f38 += i10;
                    r13.f43 += i11;
                    r13.f37 += i12;
                }
            }
        }
        C0158 r172 = r16;
        long j = 1;
        while (r172.f22 > r172.f25) {
            r172.f22 = 0;
            j = r172.f20.mo3374(j, Long.MAX_VALUE);
        }
        C0158 r173 = r16;
        r16.f24 = new int[r16.f22];
        r173.f22 = 0;
        r173.f20.mo3373();
        int[] iArr3 = r173.f26;
        int i15 = r173.f27;
        int length2 = iArr3.length / i15;
        new C0159if();
        int i16 = i15;
        while (true) {
            int i17 = i16;
            i16--;
            if (i17 <= 0) {
                return r16.f24;
            }
            int i18 = length2;
            while (true) {
                int i19 = i18;
                i18--;
                if (i19 > 0) {
                    int i20 = iArr3[(i18 * i15) + i16];
                    int i21 = (i20 >> 24) & 255;
                    int i22 = (i20 >> 16) & 255;
                    int i23 = (i20 >> 8) & 255;
                    int i24 = (i20 >> 0) & 255;
                    C0160 r14 = r173.f20;
                    while (true) {
                        int i25 = ((i22 > r14.f31 ? 1 : 0) << 0) | ((i23 > r14.f36 ? 1 : 0) << 1) | ((i24 > r14.f39 ? 1 : 0) << 2) | ((i21 > r14.f30 ? 1 : 0) << 3);
                        if (r14.f35[i25] == null) {
                            break;
                        }
                        r14 = r14.f35[i25];
                    }
                    iArr3[(i18 * i15) + i16] = r14.f40;
                }
            }
        }
    }
}
