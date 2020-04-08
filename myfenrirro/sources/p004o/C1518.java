package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.仯 */
final class C1518 extends C0762sz {
    C1518() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2576;
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        C0622ot.m741(bArr, opVar);
        C1888[] r5 = new C1888[i];
        for (int i3 = 0; i3 < r5.length; i3++) {
            r5[i3] = C1888.m2559(byteBuffer);
        }
        if (!z) {
            C1427.m2125(r5);
        }
    }
}
