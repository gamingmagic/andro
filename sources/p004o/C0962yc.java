package p004o;

/* renamed from: o.yc */
public final class C0962yc {
    /* renamed from: 鷭 */
    public static String m1666(byte[] bArr, int i) {
        int i2 = 0;
        byte b = 0;
        int i3 = 0;
        int i4 = i;
        int i5 = i + 1;
        byte b2 = bArr[i4] & 255;
        StringBuffer stringBuffer = new StringBuffer();
        while (i5 < bArr.length) {
            if (i3 == 0) {
                int i6 = i5;
                i5++;
                b = bArr[i6] & 255;
                i3 = 8;
            }
            switch (b >> 6) {
                case 0:
                    int i7 = i5;
                    i5++;
                    stringBuffer.append((char) (bArr[i7] & 255));
                    i2++;
                    break;
                case 1:
                    int i8 = i5;
                    i5++;
                    stringBuffer.append((char) ((bArr[i8] & 255) + (b2 << 8)));
                    i2++;
                    break;
                case 2:
                    stringBuffer.append((char) (((bArr[i5 + 1] & 255) << 8) + (bArr[i5] & 255)));
                    i2++;
                    i5 += 2;
                    break;
                case 3:
                    int i9 = i5;
                    i5++;
                    byte b3 = bArr[i9] & 255;
                    if ((b3 & 128) != 0) {
                        int i10 = i5;
                        i5++;
                        byte b4 = bArr[i10] & 255;
                        int i11 = (b3 & Byte.MAX_VALUE) + 2;
                        while (i11 > 0 && i2 < bArr.length) {
                            stringBuffer.append((char) ((b2 << 8) + (((bArr[i2] & 255) + b4) & 255)));
                            i11--;
                            i2++;
                        }
                    } else {
                        int i12 = b3 + 2;
                        while (i12 > 0 && i2 < bArr.length) {
                            stringBuffer.append((char) (bArr[i2] & 255));
                            i12--;
                            i2++;
                        }
                    }
                    break;
            }
            b = (b << 2) & 255;
            i3 -= 2;
        }
        return stringBuffer.toString();
    }
}
