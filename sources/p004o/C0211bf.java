package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.bf */
final class C0211bf {

    /* renamed from: Ą */
    public short f482;

    /* renamed from: ą */
    public String f483;

    /* renamed from: Ć */
    public byte f484;

    /* renamed from: ȃ */
    public short f485;

    /* renamed from: ˮ͈ */
    public short f486;

    /* renamed from: 櫯 */
    public int f487;

    /* renamed from: 鷭 */
    public short f488;

    C0211bf(ByteBuffer byteBuffer) {
        this.f488 = byteBuffer.getShort();
        this.f487 = byteBuffer.getInt();
        this.f486 = byteBuffer.getShort();
        this.f485 = byteBuffer.getShort();
        this.f482 = byteBuffer.getShort();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        this.f483 = C0622ot.m741(bArr, opVar);
        this.f484 = byteBuffer.get();
    }
}
