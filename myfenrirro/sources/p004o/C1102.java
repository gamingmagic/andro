package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.Ǘ */
class C1102 extends C0762sz {

    /* renamed from: 鷭 */
    private final int f6208;

    C1102(short s, int i) {
        this.f4671 = s;
        this.f6208 = i;
    }

    /* renamed from: 鷭 */
    public void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        byte[] bArr = new byte[(this.f6208 > 0 ? this.f6208 - 2 : i)];
        byteBuffer.get(bArr);
        byte[] bArr2 = bArr;
        if (!z) {
            C0622ot.m740(bArr2, " ");
        }
    }
}
