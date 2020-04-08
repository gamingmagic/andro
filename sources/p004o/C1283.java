package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.С */
final class C1283 extends C0762sz {
    C1283() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2757;
        int i3 = byteBuffer.getInt();
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        int i4 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        byteBuffer.get(new byte[128]);
        if (!z) {
            try {
                Object[] objArr = new Object[4];
                objArr[3] = Short.valueOf(s);
                objArr[2] = Integer.valueOf(i4);
                objArr[1] = bArr;
                objArr[0] = Integer.valueOf(i3);
                C2117$.m2299("o.朤").getDeclaredMethod("鷭", new Class[]{Integer.TYPE, byte[].class, Integer.TYPE, Short.TYPE}).invoke(null, objArr);
            } catch (Throwable th) {
                throw th.getCause();
            }
        }
    }
}
