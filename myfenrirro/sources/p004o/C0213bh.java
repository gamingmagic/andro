package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.bh */
public final class C0213bh {

    /* renamed from: 鷭 */
    public byte[] f490 = new byte[6];

    public C0213bh(ByteBuffer byteBuffer) {
        byteBuffer.get(this.f490);
    }

    /* renamed from: 鷭 */
    public final short mo3562() {
        return (short) ((((this.f490[1] & 255) & 63) << 4) | ((this.f490[2] & 255) >> 4));
    }

    /* renamed from: 櫯 */
    public final short mo3561() {
        return (short) ((((this.f490[2] & 255) & 15) << 6) | (((this.f490[3] & 255) & 252) >> 2));
    }

    /* renamed from: ˮ͈ */
    public final short mo3560() {
        return (short) ((((short) ((this.f490[3] & 255) & 3)) << 8) + ((short) (this.f490[4] & 255)));
    }
}
