package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.bg */
final class C0212bg {

    /* renamed from: 鷭 */
    byte[] f489 = new byte[3];

    C0212bg(int i, int i2, int i3) {
        this.f489[0] = (byte) ((i >> 2) & 255);
        this.f489[1] = (byte) ((i << 6) | ((i2 >> 4) & 63));
        this.f489[2] = (byte) ((i2 << 4) | 0);
    }

    C0212bg(byte[] bArr) {
        this.f489[0] = bArr[0];
        this.f489[1] = bArr[1];
        this.f489[2] = bArr[2];
    }

    C0212bg(ByteBuffer byteBuffer) {
        byteBuffer.get(this.f489);
    }

    C0212bg() {
    }
}
