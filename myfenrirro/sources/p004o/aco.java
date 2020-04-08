package p004o;

import android.util.Log;
import java.io.UnsupportedEncodingException;

/* renamed from: o.aco */
public final class aco {

    /* renamed from: o.aco$if */
    static class C0173if extends C0174 {

        /* renamed from: Ć */
        private static final byte[] f300 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: ć */
        private static final byte[] f301 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: Ą */
        public final boolean f302;

        /* renamed from: ą */
        public final boolean f303;

        /* renamed from: ȃ */
        public final boolean f304;

        /* renamed from: Ȋ */
        private final byte[] f305;

        /* renamed from: ˮ͈ */
        int f306;

        /* renamed from: ˮ͍ */
        private final byte[] f307;

        /* renamed from: 岱 */
        private int f308;

        static {
        }

        public C0173if(int i, byte[] bArr) {
            this.f310 = null;
            this.f304 = true;
            this.f302 = false;
            this.f303 = false;
            this.f305 = f300;
            this.f307 = new byte[2];
            this.f306 = 0;
            this.f308 = this.f302 ? 19 : -1;
        }

        /* renamed from: 鷭 */
        public final boolean mo3499(byte[] bArr, int i) {
            int i2;
            int i3;
            byte b;
            byte b2;
            byte b3;
            byte[] bArr2 = this.f305;
            byte[] bArr3 = this.f310;
            int i4 = 0;
            int i5 = this.f308;
            int i6 = 0;
            int i7 = i + 0;
            byte b4 = -1;
            switch (this.f306) {
                case 1:
                    if (2 <= i7) {
                        i6 = 0 + 1 + 1;
                        b4 = ((this.f307[0] & 255) << 16) | ((bArr[0] & 255) << 8) | (bArr[1] & 255);
                        this.f306 = 0;
                        break;
                    }
                    break;
                case 2:
                    if (i7 > 0) {
                        i6 = 0 + 1;
                        b4 = ((this.f307[0] & 255) << 16) | ((this.f307[1] & 255) << 8) | (bArr[0] & 255);
                        this.f306 = 0;
                        break;
                    }
                    break;
            }
            if (b4 != -1) {
                int i8 = 0 + 1;
                bArr3[0] = bArr2[(b4 >> 18) & 63];
                int i9 = i8 + 1;
                bArr3[1] = bArr2[(b4 >> 12) & 63];
                int i10 = i9 + 1;
                bArr3[2] = bArr2[(b4 >> 6) & 63];
                i4 = i10 + 1;
                bArr3[3] = bArr2[b4 & 63];
                i5--;
                if (i5 == 0) {
                    if (this.f303) {
                        i4++;
                        bArr3[4] = 13;
                    }
                    int i11 = i4;
                    i4++;
                    bArr3[i11] = 10;
                    i5 = 19;
                }
            }
            while (i6 + 3 <= i7) {
                byte b5 = ((bArr[i6] & 255) << 16) | ((bArr[i6 + 1] & 255) << 8) | (bArr[i6 + 2] & 255);
                bArr3[i3] = bArr2[(b5 >> 18) & 63];
                bArr3[i3 + 1] = bArr2[(b5 >> 12) & 63];
                bArr3[i3 + 2] = bArr2[(b5 >> 6) & 63];
                bArr3[i3 + 3] = bArr2[b5 & 63];
                i6 += 3;
                i3 += 4;
                i2--;
                if (i2 == 0) {
                    if (this.f303) {
                        int i12 = i3;
                        i3++;
                        bArr3[i12] = 13;
                    }
                    int i13 = i3;
                    i3++;
                    bArr3[i13] = 10;
                    i2 = 19;
                }
            }
            if (i6 - this.f306 == i7 - 1) {
                int i14 = 0;
                if (this.f306 > 0) {
                    i14 = 0 + 1;
                    b3 = this.f307[0];
                } else {
                    int i15 = i6;
                    i6++;
                    b3 = bArr[i15];
                }
                int i16 = (b3 & 255) << 4;
                this.f306 -= i14;
                int i17 = i3;
                int i18 = i3 + 1;
                bArr3[i17] = bArr2[(i16 >> 6) & 63];
                int i19 = i18;
                int i20 = i18 + 1;
                bArr3[i19] = bArr2[i16 & 63];
                if (this.f304) {
                    int i21 = i20;
                    int i22 = i20 + 1;
                    bArr3[i21] = 61;
                    int i23 = i22;
                    i20 = i22 + 1;
                    bArr3[i23] = 61;
                }
                if (this.f302) {
                    if (this.f303) {
                        int i24 = i3;
                        i3++;
                        bArr3[i24] = 13;
                    }
                    int i25 = i3;
                    i3++;
                    bArr3[i25] = 10;
                }
            } else if (i6 - this.f306 == i7 - 2) {
                int i26 = 0;
                if (this.f306 > 1) {
                    i26 = 0 + 1;
                    b = this.f307[0];
                } else {
                    int i27 = i6;
                    i6++;
                    b = bArr[i27];
                }
                int i28 = (b & 255) << 10;
                if (this.f306 > 0) {
                    int i29 = i26;
                    i26++;
                    b2 = this.f307[i29];
                } else {
                    int i30 = i6;
                    i6++;
                    b2 = bArr[i30];
                }
                int i31 = i28 | ((b2 & 255) << 2);
                this.f306 -= i26;
                int i32 = i3;
                int i33 = i3 + 1;
                bArr3[i32] = bArr2[(i31 >> 12) & 63];
                int i34 = i33;
                int i35 = i33 + 1;
                bArr3[i34] = bArr2[(i31 >> 6) & 63];
                int i36 = i35;
                int i37 = i35 + 1;
                bArr3[i36] = bArr2[i31 & 63];
                if (this.f304) {
                    int i38 = i37;
                    i37++;
                    bArr3[i38] = 61;
                }
                if (this.f302) {
                    if (this.f303) {
                        int i39 = i3;
                        i3++;
                        bArr3[i39] = 13;
                    }
                    int i40 = i3;
                    i3++;
                    bArr3[i40] = 10;
                }
            } else if (this.f302 && i3 > 0 && i2 != 19) {
                if (this.f303) {
                    int i41 = i3;
                    i3++;
                    bArr3[i41] = 13;
                }
                int i42 = i3;
                i3++;
                bArr3[i42] = 10;
            }
            if (this.f306 != 0) {
                String str = "BASE64";
                String str2 = "Error during encoding";
                if (str.length() == 0 || str.length() > 23) {
                    str = "HockeyApp";
                }
                if (acr.f312 <= 6) {
                    Log.e(str, str2);
                }
            }
            if (i6 != i7) {
                String str3 = "BASE64";
                String str4 = "Error during encoding";
                if (str3.length() == 0 || str3.length() > 23) {
                    str3 = "HockeyApp";
                }
                if (acr.f312 <= 6) {
                    Log.e(str3, str4);
                }
            }
            this.f309 = i3;
            this.f308 = i2;
            return true;
        }
    }

    /* renamed from: o.aco$鷭 */
    static abstract class C0174 {

        /* renamed from: 櫯 */
        public int f309;

        /* renamed from: 鷭 */
        public byte[] f310;

        C0174() {
        }
    }

    /* renamed from: 鷭 */
    public static String m117(byte[] bArr) {
        try {
            int length = bArr.length;
            C0173if ifVar = new C0173if(2, null);
            int i = (length / 3) * 4;
            if (!ifVar.f304) {
                switch (length % 3) {
                    case 0:
                        break;
                    case 1:
                        i += 2;
                        break;
                    case 2:
                        i += 3;
                        break;
                }
            } else if (length % 3 > 0) {
                i += 4;
            }
            if (ifVar.f302 && length > 0) {
                i += (((length - 1) / 57) + 1) * (ifVar.f303 ? 2 : 1);
            }
            ifVar.f310 = new byte[i];
            ifVar.mo3499(bArr, length);
            if (ifVar.f309 == i) {
                return new String(ifVar.f310, "US-ASCII");
            }
            throw new AssertionError();
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
