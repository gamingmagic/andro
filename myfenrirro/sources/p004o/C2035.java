package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.턗 */
final class C2035 extends C0762sz {
    C2035() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2526;
        byteBuffer.getInt();
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        byte[] bArr2 = bArr;
        byte b = byteBuffer.get();
        byte[] bArr3 = new byte[i];
        byteBuffer.get(bArr3);
        byte[] bArr4 = bArr3;
        if (!z) {
            C1971.m2637(bArr2, bArr4, b);
        }
    }
}
