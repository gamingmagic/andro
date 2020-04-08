package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.긛 */
final class C1889 extends C0762sz {
    C1889() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 115;
        int i3 = byteBuffer.getInt();
        byte[] bArr = new byte[3];
        byteBuffer.get(bArr);
        byte[] bArr2 = bArr;
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        if (!z) {
            C1642 r6 = new C1642();
            r6.f5181 = i3;
            r6.f5180 = bArr2;
            r6.f5179 = -1;
            r6.f5177[0] = b;
            r6.f5177[1] = b2;
            r6.mo4051();
        }
    }
}
