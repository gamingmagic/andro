package p004o;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: o.oq */
public final class C0619oq {
    /* renamed from: 鷭 */
    public static final byte[] m711(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length + bArr2.length);
        for (int i = 0; i < bArr2.length; i++) {
            copyOf[i + length] = bArr2[i];
        }
        return copyOf;
    }

    /* renamed from: 鷭 */
    public static final <T> T[] m712(T[] tArr, int i) {
        if (i < 0 || i >= tArr.length) {
            throw new IndexOutOfBoundsException("length=" + tArr.length + ", index=" + i);
        }
        Object[] objArr = (Object[]) Array.newInstance(tArr[0].getClass(), tArr.length - 1);
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = tArr[i2];
        }
        for (int i3 = i; i3 < objArr.length; i3++) {
            objArr[i3] = tArr[i3 + 1];
        }
        return objArr;
    }
}
