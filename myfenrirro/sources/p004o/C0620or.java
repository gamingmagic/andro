package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.or */
public final class C0620or {
    /* renamed from: 鷭 */
    public static int[] m716(ByteBuffer byteBuffer, int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = byteBuffer.getInt();
        }
        return iArr;
    }

    /* renamed from: 鷭 */
    public static void m715(ByteBuffer byteBuffer, short[] sArr) {
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = byteBuffer.getShort();
        }
    }

    /* renamed from: 鷭 */
    public static void m714(ByteBuffer byteBuffer, float[] fArr) {
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = byteBuffer.getFloat();
        }
    }

    /* renamed from: 櫯 */
    public static float[] m713(ByteBuffer byteBuffer, int i) {
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = byteBuffer.getFloat();
        }
        return fArr;
    }
}
