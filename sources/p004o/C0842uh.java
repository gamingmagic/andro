package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.uh */
public final class C0842uh {
    @C0845uk(mo4122 = 3)

    /* renamed from: ˮ͈ */
    public byte f5059;
    @C0845uk(mo4122 = 2)

    /* renamed from: 櫯 */
    public short f5060;
    @C0845uk(mo4122 = 1)

    /* renamed from: 鷭 */
    public short f5061;

    public C0842uh() {
    }

    public C0842uh(ByteBuffer byteBuffer) {
        this.f5061 = byteBuffer.getShort();
        this.f5060 = byteBuffer.getShort();
        this.f5059 = byteBuffer.get();
    }
}
