package org.apache.commons.net.util;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

public class Base64 {
    private static final byte[] CHUNK_SEPARATOR = {13, 10};
    static final int CHUNK_SIZE = 76;
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, PAD, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    private static final int DEFAULT_BUFFER_RESIZE_FACTOR = 2;
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private static final int MASK_6BITS = 63;
    private static final int MASK_8BITS = 255;
    private static final byte PAD = 61;
    private static final byte[] STANDARD_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private byte[] buffer;
    private int currentLinePos;
    private final int decodeSize;
    private final int encodeSize;
    private final byte[] encodeTable;
    private boolean eof;
    private final int lineLength;
    private final byte[] lineSeparator;
    private int modulus;
    private int pos;
    private int readPos;

    /* renamed from: x */
    private int f9002x;

    static {
    }

    public Base64() {
        this(false);
    }

    public Base64(boolean z) {
        this(CHUNK_SIZE, CHUNK_SEPARATOR, z);
    }

    public Base64(int i) {
        this(i, CHUNK_SEPARATOR);
    }

    public Base64(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public Base64(int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            i = 0;
            bArr = EMPTY_BYTE_ARRAY;
        }
        this.lineLength = i > 0 ? (i / 4) * 4 : 0;
        this.lineSeparator = new byte[bArr.length];
        System.arraycopy(bArr, 0, this.lineSeparator, 0, bArr.length);
        if (i > 0) {
            this.encodeSize = bArr.length + 4;
        } else {
            this.encodeSize = 4;
        }
        this.decodeSize = this.encodeSize - 1;
        if (containsBase64Byte(bArr)) {
            throw new IllegalArgumentException("lineSeperator must not contain base64 characters: [" + newStringUtf8(bArr) + "]");
        }
        this.encodeTable = z ? URL_SAFE_ENCODE_TABLE : STANDARD_ENCODE_TABLE;
    }

    public boolean isUrlSafe() {
        return this.encodeTable == URL_SAFE_ENCODE_TABLE;
    }

    /* access modifiers changed from: 0000 */
    public boolean hasData() {
        return this.buffer != null;
    }

    /* access modifiers changed from: 0000 */
    public int avail() {
        if (this.buffer != null) {
            return this.pos - this.readPos;
        }
        return 0;
    }

    private void resizeBuffer() {
        if (this.buffer == null) {
            this.buffer = new byte[8192];
            this.pos = 0;
            this.readPos = 0;
            return;
        }
        byte[] bArr = new byte[(this.buffer.length * 2)];
        System.arraycopy(this.buffer, 0, bArr, 0, this.buffer.length);
        this.buffer = bArr;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r2.readPos >= r2.pos) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int readResults(byte[] r3, int r4, int r5) {
        /*
            r2 = this;
            byte[] r0 = r2.buffer
            if (r0 == 0) goto L_0x0026
            int r0 = r2.avail()
            int r5 = java.lang.Math.min(r0, r5)
            byte[] r0 = r2.buffer
            if (r0 == r3) goto L_0x0022
            byte[] r0 = r2.buffer
            int r1 = r2.readPos
            java.lang.System.arraycopy(r0, r1, r3, r4, r5)
            int r0 = r2.readPos
            int r0 = r0 + r5
            r2.readPos = r0
            int r0 = r2.readPos
            int r1 = r2.pos
            if (r0 < r1) goto L_0x0025
        L_0x0022:
            r0 = 0
            r2.buffer = r0
        L_0x0025:
            return r5
        L_0x0026:
            boolean r0 = r2.eof
            if (r0 == 0) goto L_0x002c
            r0 = -1
            return r0
        L_0x002c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.util.Base64.readResults(byte[], int, int):int");
    }

    /* access modifiers changed from: 0000 */
    public void setInitialBuffer(byte[] bArr, int i, int i2) {
        if (bArr != null && bArr.length == i2) {
            this.buffer = bArr;
            this.pos = i;
            this.readPos = i;
        }
    }

    /* JADX WARNING: type inference failed for: r6v3 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r6v0, types: [byte, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void encode(byte[] r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.eof
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            if (r10 >= 0) goto L_0x00e0
            r0 = 1
            r7.eof = r0
            byte[] r0 = r7.buffer
            if (r0 == 0) goto L_0x0018
            byte[] r0 = r7.buffer
            int r0 = r0.length
            int r1 = r7.pos
            int r0 = r0 - r1
            int r1 = r7.encodeSize
            if (r0 >= r1) goto L_0x001b
        L_0x0018:
            r7.resizeBuffer()
        L_0x001b:
            int r0 = r7.modulus
            switch(r0) {
                case 1: goto L_0x002c;
                case 2: goto L_0x0074;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x00c2
        L_0x002c:
            byte[] r0 = r7.buffer
            int r1 = r7.pos
            int r2 = r1 + 1
            r7.pos = r2
            byte[] r2 = r7.encodeTable
            int r3 = r7.f9002x
            int r3 = r3 >> 2
            r3 = r3 & 63
            byte r2 = r2[r3]
            r0[r1] = r2
            byte[] r0 = r7.buffer
            int r1 = r7.pos
            int r2 = r1 + 1
            r7.pos = r2
            byte[] r2 = r7.encodeTable
            int r3 = r7.f9002x
            int r3 = r3 << 4
            r3 = r3 & 63
            byte r2 = r2[r3]
            r0[r1] = r2
            byte[] r0 = r7.encodeTable
            byte[] r1 = STANDARD_ENCODE_TABLE
            if (r0 != r1) goto L_0x00c2
            byte[] r0 = r7.buffer
            int r1 = r7.pos
            int r2 = r1 + 1
            r7.pos = r2
            r2 = 61
            r0[r1] = r2
            byte[] r0 = r7.buffer
            int r1 = r7.pos
            int r2 = r1 + 1
            r7.pos = r2
            r2 = 61
            r0[r1] = r2
            goto L_0x00c2
        L_0x0074:
            byte[] r0 = r7.buffer
            int r1 = r7.pos
            int r2 = r1 + 1
            r7.pos = r2
            byte[] r2 = r7.encodeTable
            int r3 = r7.f9002x
            int r3 = r3 >> 10
            r3 = r3 & 63
            byte r2 = r2[r3]
            r0[r1] = r2
            byte[] r0 = r7.buffer
            int r1 = r7.pos
            int r2 = r1 + 1
            r7.pos = r2
            byte[] r2 = r7.encodeTable
            int r3 = r7.f9002x
            int r3 = r3 >> 4
            r3 = r3 & 63
            byte r2 = r2[r3]
            r0[r1] = r2
            byte[] r0 = r7.buffer
            int r1 = r7.pos
            int r2 = r1 + 1
            r7.pos = r2
            byte[] r2 = r7.encodeTable
            int r3 = r7.f9002x
            int r3 = r3 << 2
            r3 = r3 & 63
            byte r2 = r2[r3]
            r0[r1] = r2
            byte[] r0 = r7.encodeTable
            byte[] r1 = STANDARD_ENCODE_TABLE
            if (r0 != r1) goto L_0x00c2
            byte[] r0 = r7.buffer
            int r1 = r7.pos
            int r2 = r1 + 1
            r7.pos = r2
            r2 = 61
            r0[r1] = r2
        L_0x00c2:
            int r0 = r7.lineLength
            if (r0 <= 0) goto L_0x018c
            int r0 = r7.pos
            if (r0 <= 0) goto L_0x018c
            byte[] r0 = r7.lineSeparator
            byte[] r1 = r7.buffer
            int r2 = r7.pos
            byte[] r3 = r7.lineSeparator
            int r3 = r3.length
            r4 = 0
            java.lang.System.arraycopy(r0, r4, r1, r2, r3)
            int r0 = r7.pos
            byte[] r1 = r7.lineSeparator
            int r1 = r1.length
            int r0 = r0 + r1
            r7.pos = r0
            return
        L_0x00e0:
            r5 = 0
        L_0x00e1:
            if (r5 >= r10) goto L_0x018c
            byte[] r0 = r7.buffer
            if (r0 == 0) goto L_0x00f1
            byte[] r0 = r7.buffer
            int r0 = r0.length
            int r1 = r7.pos
            int r0 = r0 - r1
            int r1 = r7.encodeSize
            if (r0 >= r1) goto L_0x00f4
        L_0x00f1:
            r7.resizeBuffer()
        L_0x00f4:
            int r0 = r7.modulus
            int r0 = r0 + 1
            r7.modulus = r0
            int r0 = r0 % 3
            r7.modulus = r0
            r0 = r9
            int r9 = r9 + 1
            byte r6 = r8[r0]
            if (r6 >= 0) goto L_0x0107
            int r6 = r6 + 256
        L_0x0107:
            int r0 = r7.f9002x
            int r0 = r0 << 8
            int r0 = r0 + r6
            r7.f9002x = r0
            int r0 = r7.modulus
            if (r0 != 0) goto L_0x0188
            byte[] r0 = r7.buffer
            int r1 = r7.pos
            int r2 = r1 + 1
            r7.pos = r2
            byte[] r2 = r7.encodeTable
            int r3 = r7.f9002x
            int r3 = r3 >> 18
            r3 = r3 & 63
            byte r2 = r2[r3]
            r0[r1] = r2
            byte[] r0 = r7.buffer
            int r1 = r7.pos
            int r2 = r1 + 1
            r7.pos = r2
            byte[] r2 = r7.encodeTable
            int r3 = r7.f9002x
            int r3 = r3 >> 12
            r3 = r3 & 63
            byte r2 = r2[r3]
            r0[r1] = r2
            byte[] r0 = r7.buffer
            int r1 = r7.pos
            int r2 = r1 + 1
            r7.pos = r2
            byte[] r2 = r7.encodeTable
            int r3 = r7.f9002x
            int r3 = r3 >> 6
            r3 = r3 & 63
            byte r2 = r2[r3]
            r0[r1] = r2
            byte[] r0 = r7.buffer
            int r1 = r7.pos
            int r2 = r1 + 1
            r7.pos = r2
            byte[] r2 = r7.encodeTable
            int r3 = r7.f9002x
            r3 = r3 & 63
            byte r2 = r2[r3]
            r0[r1] = r2
            int r0 = r7.currentLinePos
            int r0 = r0 + 4
            r7.currentLinePos = r0
            int r0 = r7.lineLength
            if (r0 <= 0) goto L_0x0188
            int r0 = r7.lineLength
            int r1 = r7.currentLinePos
            if (r0 > r1) goto L_0x0188
            byte[] r0 = r7.lineSeparator
            byte[] r1 = r7.buffer
            int r2 = r7.pos
            byte[] r3 = r7.lineSeparator
            int r3 = r3.length
            r4 = 0
            java.lang.System.arraycopy(r0, r4, r1, r2, r3)
            int r0 = r7.pos
            byte[] r1 = r7.lineSeparator
            int r1 = r1.length
            int r0 = r0 + r1
            r7.pos = r0
            r0 = 0
            r7.currentLinePos = r0
        L_0x0188:
            int r5 = r5 + 1
            goto L_0x00e1
        L_0x018c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.util.Base64.encode(byte[], int, int):void");
    }

    /* access modifiers changed from: 0000 */
    public void decode(byte[] bArr, int i, int i2) {
        if (!this.eof) {
            if (i2 < 0) {
                this.eof = true;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                if (this.buffer == null || this.buffer.length - this.pos < this.decodeSize) {
                    resizeBuffer();
                }
                int i4 = i;
                i++;
                byte b = bArr[i4];
                if (b == 61) {
                    this.eof = true;
                    break;
                }
                if (b >= 0 && b < DECODE_TABLE.length) {
                    byte b2 = DECODE_TABLE[b];
                    if (b2 >= 0) {
                        int i5 = this.modulus + 1;
                        this.modulus = i5;
                        this.modulus = i5 % 4;
                        this.f9002x = (this.f9002x << 6) + b2;
                        if (this.modulus == 0) {
                            byte[] bArr2 = this.buffer;
                            int i6 = this.pos;
                            this.pos = i6 + 1;
                            bArr2[i6] = (byte) ((this.f9002x >> 16) & 255);
                            byte[] bArr3 = this.buffer;
                            int i7 = this.pos;
                            this.pos = i7 + 1;
                            bArr3[i7] = (byte) ((this.f9002x >> 8) & 255);
                            byte[] bArr4 = this.buffer;
                            int i8 = this.pos;
                            this.pos = i8 + 1;
                            bArr4[i8] = (byte) (this.f9002x & 255);
                        }
                    }
                }
                i3++;
            }
            if (this.eof && this.modulus != 0) {
                this.f9002x <<= 6;
                switch (this.modulus) {
                    case 2:
                        this.f9002x <<= 6;
                        byte[] bArr5 = this.buffer;
                        int i9 = this.pos;
                        this.pos = i9 + 1;
                        bArr5[i9] = (byte) ((this.f9002x >> 16) & 255);
                        return;
                    case 3:
                        byte[] bArr6 = this.buffer;
                        int i10 = this.pos;
                        this.pos = i10 + 1;
                        bArr6[i10] = (byte) ((this.f9002x >> 16) & 255);
                        byte[] bArr7 = this.buffer;
                        int i11 = this.pos;
                        this.pos = i11 + 1;
                        bArr7[i11] = (byte) ((this.f9002x >> 8) & 255);
                        break;
                }
            }
        }
    }

    public static boolean isBase64(byte b) {
        return b == 61 || (b >= 0 && b < DECODE_TABLE.length && DECODE_TABLE[b] != -1);
    }

    public static boolean isArrayByteBase64(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (!isBase64(bArr[i]) && !isWhiteSpace(bArr[i])) {
                return false;
            }
        }
        return true;
    }

    private static boolean containsBase64Byte(byte[] bArr) {
        for (byte isBase64 : bArr) {
            if (isBase64(isBase64)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return encodeBase64(bArr, false);
    }

    public static String encodeBase64String(byte[] bArr) {
        return newStringUtf8(encodeBase64(bArr, true));
    }

    public static String encodeBase64StringUnChunked(byte[] bArr) {
        return newStringUtf8(encodeBase64(bArr, false));
    }

    public static String encodeBase64String(byte[] bArr, boolean z) {
        return newStringUtf8(encodeBase64(bArr, z));
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return encodeBase64(bArr, false, true);
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        return newStringUtf8(encodeBase64(bArr, false, true));
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64(bArr, true);
    }

    public byte[] decode(String str) {
        return decode(getBytesUtf8(str));
    }

    private byte[] getBytesUtf8(String str) {
        try {
            return str.getBytes("UTF8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public byte[] decode(byte[] bArr) {
        reset();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[((bArr.length * 3) / 4)];
        setInitialBuffer(bArr2, 0, bArr2.length);
        decode(bArr, 0, bArr.length);
        decode(bArr, 0, -1);
        byte[] bArr3 = new byte[this.pos];
        readResults(bArr3, 0, bArr3.length);
        return bArr3;
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z) {
        return encodeBase64(bArr, z, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2) {
        return encodeBase64(bArr, z, z2, Integer.MAX_VALUE);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2, int i) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        long encodeLength = getEncodeLength(bArr, z ? CHUNK_SIZE : 0, z ? CHUNK_SEPARATOR : EMPTY_BYTE_ARRAY);
        long j = encodeLength;
        if (encodeLength > ((long) i)) {
            throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + j + ") than the specified maxium size of " + i);
        }
        return (z ? new Base64(z2) : new Base64(0, CHUNK_SEPARATOR, z2)).encode(bArr);
    }

    public static byte[] decodeBase64(String str) {
        return new Base64().decode(str);
    }

    public static byte[] decodeBase64(byte[] bArr) {
        return new Base64().decode(bArr);
    }

    private static boolean isWhiteSpace(byte b) {
        switch (b) {
            case 9:
            case 10:
            case 13:
            case 32:
                return true;
            default:
                return false;
        }
    }

    public String encodeToString(byte[] bArr) {
        return newStringUtf8(encode(bArr));
    }

    private static String newStringUtf8(byte[] bArr) {
        try {
            return new String(bArr, "UTF8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public byte[] encode(byte[] bArr) {
        reset();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[((int) getEncodeLength(bArr, this.lineLength, this.lineSeparator))];
        setInitialBuffer(bArr2, 0, bArr2.length);
        encode(bArr, 0, bArr.length);
        encode(bArr, 0, -1);
        if (this.buffer != bArr2) {
            readResults(bArr2, 0, bArr2.length);
        }
        if (isUrlSafe() && this.pos < bArr2.length) {
            byte[] bArr3 = new byte[this.pos];
            System.arraycopy(bArr2, 0, bArr3, 0, this.pos);
            bArr2 = bArr3;
        }
        return bArr2;
    }

    private static long getEncodeLength(byte[] bArr, int i, byte[] bArr2) {
        int i2 = (i / 4) * 4;
        long length = (long) ((bArr.length * 4) / 3);
        long j = length;
        long j2 = length % 4;
        long j3 = j2;
        if (j2 != 0) {
            j += 4 - j3;
        }
        if (i2 <= 0) {
            return j;
        }
        boolean z = j % ((long) i2) == 0;
        long length2 = j + ((j / ((long) i2)) * ((long) bArr2.length));
        if (!z) {
            return length2 + ((long) bArr2.length);
        }
        return length2;
    }

    public static BigInteger decodeInteger(byte[] bArr) {
        return new BigInteger(1, decodeBase64(bArr));
    }

    public static byte[] encodeInteger(BigInteger bigInteger) {
        if (bigInteger != null) {
            return encodeBase64(toIntegerBytes(bigInteger), false);
        }
        throw new NullPointerException("encodeInteger called with null parameter");
    }

    static byte[] toIntegerBytes(BigInteger bigInteger) {
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == bitLength / 8) {
            return byteArray;
        }
        int i = 0;
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            i = 1;
            length--;
        }
        int i2 = (bitLength / 8) - length;
        byte[] bArr = new byte[(bitLength / 8)];
        System.arraycopy(byteArray, i, bArr, i2, length);
        return bArr;
    }

    private void reset() {
        this.buffer = null;
        this.pos = 0;
        this.readPos = 0;
        this.currentLinePos = 0;
        this.modulus = 0;
        this.eof = false;
    }

    /* access modifiers changed from: 0000 */
    public int getLineLength() {
        return this.lineLength;
    }

    /* access modifiers changed from: 0000 */
    public byte[] getLineSeparator() {
        return (byte[]) this.lineSeparator.clone();
    }
}
