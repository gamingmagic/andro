package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ㆢ */
final class C1400 extends C0762sz {
    C1400() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2570;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        int i4 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        byte b4 = byteBuffer.get();
        C1111 r14 = new C1111(byteBuffer);
        C1665 r16 = new C1665(byteBuffer);
        if (!z) {
            C2019.m2688(s, i3, i4, b, b2, b3, b4, r14, r16);
        }
    }
}
