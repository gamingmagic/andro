package p004o;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

/* renamed from: o.oh */
public final class C0608oh {

    /* renamed from: o.oh$if */
    public enum C0609if {
        TGA_OK,
        TGA_ERROR_FILE_OPEN,
        TGA_ERROR_READING_FILE,
        TGA_ERROR_INDEXED_COLOR,
        TGA_ERROR_MEMORY,
        TGA_ERROR_COMPRESSED_FILE
    }

    /* renamed from: o.oh$鷭 */
    public static class C0610 {

        /* renamed from: Ą */
        public int f2983;

        /* renamed from: ą */
        public byte[] f2984;

        /* renamed from: Ć */
        int f2985;

        /* renamed from: ȃ */
        public int f2986;

        /* renamed from: ˮ͈ */
        public int f2987;

        /* renamed from: 櫯 */
        public int f2988;

        /* renamed from: 鷭 */
        C0609if f2989;
    }

    /* renamed from: 鷭 */
    private static void m695(BufferedInputStream bufferedInputStream, C0610 r6) {
        int i = r6.f2987 / 8;
        int i2 = r6.f2983 * r6.f2986 * i;
        bufferedInputStream.read(r6.f2984, 0, i2);
        if (i >= 3) {
            for (int i3 = 0; i3 < i2; i3 += i) {
                byte b = r6.f2984[i3];
                byte[] bArr = r6.f2984;
                bArr[i3] = bArr[i3 + 2];
                r6.f2984[i3 + 2] = b;
            }
        }
    }

    /* renamed from: 櫯 */
    private static void m693(BufferedInputStream bufferedInputStream, C0610 r13) {
        boolean z;
        int i = 0;
        byte[] bArr = new byte[4];
        int i2 = 0;
        int i3 = 0;
        int i4 = r13.f2987 / 8;
        int i5 = r13.f2983 * r13.f2986;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i2 != 0) {
                i2--;
                z = i3 != 0;
            } else {
                i2 = bufferedInputStream.read();
                if (i2 != -1) {
                    i3 = i2 & 128;
                    if (i3 != 0) {
                        i2 -= 128;
                    }
                    z = false;
                } else {
                    return;
                }
            }
            if (!z) {
                if (bufferedInputStream.read(bArr, 0, i4) == i4) {
                    if (i4 >= 3) {
                        byte b = bArr[0];
                        bArr[0] = bArr[2];
                        bArr[2] = b;
                    }
                } else {
                    return;
                }
            }
            System.arraycopy(bArr, 0, r13.f2984, i, i4);
            i += i4;
        }
    }

    /* renamed from: 鷭 */
    private static void m696(C0610 r9) {
        int i = (r9.f2987 / 8) * r9.f2986;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < r9.f2983 / 2; i2++) {
            System.arraycopy(r9.f2984, i2 * i, bArr, 0, i);
            System.arraycopy(r9.f2984, (r9.f2983 - (i2 + 1)) * i, r9.f2984, i2 * i, i);
            System.arraycopy(bArr, 0, r9.f2984, (r9.f2983 - (i2 + 1)) * i, i);
        }
        r9.f2985 = 0;
    }

    /* renamed from: 鷭 */
    public static C0610 m694(ByteArrayInputStream byteArrayInputStream) {
        C0610 r3 = new C0610();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream);
            C0610 r5 = r3;
            BufferedInputStream bufferedInputStream2 = bufferedInputStream;
            try {
                bufferedInputStream.read();
                bufferedInputStream2.read();
                r5.f2988 = (byte) bufferedInputStream2.read();
                bufferedInputStream2.read();
                bufferedInputStream2.read();
                bufferedInputStream2.read();
                bufferedInputStream2.read();
                bufferedInputStream2.read();
                bufferedInputStream2.read();
                bufferedInputStream2.read();
                bufferedInputStream2.read();
                bufferedInputStream2.read();
                r5.f2986 = (bufferedInputStream2.read() & 255) | ((bufferedInputStream2.read() & 255) << 8);
                r5.f2983 = (bufferedInputStream2.read() & 255) | ((bufferedInputStream2.read() & 255) << 8);
                r5.f2987 = bufferedInputStream2.read() & 255;
                int read = bufferedInputStream2.read();
                r5.f2985 = 0;
                if ((read & 32) != 0) {
                    r5.f2985 = 1;
                }
                if (r3.f2988 == 1) {
                    r3.f2989 = C0609if.TGA_ERROR_INDEXED_COLOR;
                    bufferedInputStream.close();
                    return r3;
                } else if (r3.f2988 == 2 || r3.f2988 == 3 || r3.f2988 == 10) {
                    r3.f2984 = new byte[((r3.f2987 / 8) * r3.f2983 * r3.f2986)];
                    try {
                        if (r3.f2988 == 10) {
                            m693(bufferedInputStream, r3);
                        } else {
                            m695(bufferedInputStream, r3);
                        }
                        bufferedInputStream.close();
                        r3.f2989 = C0609if.TGA_OK;
                        if (r3.f2985 != 0) {
                            m696(r3);
                            if (r3.f2985 != 0) {
                                r3.f2989 = C0609if.TGA_ERROR_MEMORY;
                            }
                        }
                        return r3;
                    } catch (Exception unused) {
                        r3.f2989 = C0609if.TGA_ERROR_READING_FILE;
                        bufferedInputStream.close();
                        return r3;
                    }
                } else {
                    r3.f2989 = C0609if.TGA_ERROR_COMPRESSED_FILE;
                    bufferedInputStream.close();
                    return r3;
                }
            } catch (Exception unused2) {
                r3.f2989 = C0609if.TGA_ERROR_READING_FILE;
                bufferedInputStream.close();
                return r3;
            }
        } catch (Exception unused3) {
            r3.f2989 = C0609if.TGA_ERROR_FILE_OPEN;
            return r3;
        }
    }
}
