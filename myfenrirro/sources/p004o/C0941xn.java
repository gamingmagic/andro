package p004o;

/* renamed from: o.xn */
public final class C0941xn {

    /* renamed from: 鷭 */
    private static final int[] f5637 = new int[256];

    static {
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                if ((i2 & 1) != 0) {
                    i2 = (i2 >>> 1) ^ -306674912;
                } else {
                    i2 >>>= 1;
                }
            }
            f5637[i] = i2;
        }
    }

    /* renamed from: 鷭 */
    public static int m1633(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < Math.min(bArr.length - i2, i3); i4++) {
            i = f5637[(bArr[i2 + i4] ^ i) & 255] ^ (i >>> 8);
        }
        return i;
    }
}
