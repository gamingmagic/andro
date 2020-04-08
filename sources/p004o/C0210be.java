package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.be */
final class C0210be {

    /* renamed from: Ą */
    public short f474;

    /* renamed from: ą */
    public short f475;

    /* renamed from: Ć */
    public String f476;

    /* renamed from: ć */
    public byte f477;

    /* renamed from: ȃ */
    public short f478;

    /* renamed from: ˮ͈ */
    public short f479;

    /* renamed from: 櫯 */
    public short f480;

    /* renamed from: 鷭 */
    public short f481;

    C0210be(ByteBuffer byteBuffer) {
        this.f481 = byteBuffer.getShort();
        this.f480 = byteBuffer.getShort();
        this.f479 = byteBuffer.getShort();
        this.f478 = byteBuffer.getShort();
        this.f474 = byteBuffer.getShort();
        this.f475 = byteBuffer.getShort();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        this.f476 = C0622ot.m741(bArr, opVar);
        this.f477 = byteBuffer.get();
    }
}
