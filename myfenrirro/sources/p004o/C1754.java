package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.詀 */
final class C1754 extends C0762sz {
    C1754() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 747;
        int i3 = byteBuffer.getInt();
        byte[] bArr = new byte[3];
        byteBuffer.get(bArr);
        byte[] bArr2 = bArr;
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        short s = byteBuffer.getShort();
        if (!z) {
            C1642 r7 = new C1642();
            r7.f5181 = i3;
            r7.f5180 = bArr2;
            r7.f5179 = -1;
            r7.f5177[0] = b;
            r7.f5177[1] = b2;
            r7.f5178 = s;
            r7.mo4051();
        }
    }
}
