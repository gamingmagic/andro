package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.xi */
public final class C0936xi {

    /* renamed from: Ą */
    public short f5614;

    /* renamed from: ą */
    public short f5615;

    /* renamed from: Ć */
    public String f5616;

    /* renamed from: ć */
    public byte f5617;

    /* renamed from: ȃ */
    public short f5618;

    /* renamed from: ˮ͈ */
    public short f5619;

    /* renamed from: 櫯 */
    public short f5620;

    /* renamed from: 鷭 */
    public short f5621;

    public C0936xi(ByteBuffer byteBuffer) {
        this.f5621 = byteBuffer.getShort();
        this.f5620 = byteBuffer.getShort();
        this.f5619 = byteBuffer.getShort();
        this.f5618 = byteBuffer.getShort();
        this.f5614 = byteBuffer.getShort();
        this.f5615 = byteBuffer.getShort();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        this.f5616 = C0622ot.m741(bArr, opVar);
        this.f5617 = byteBuffer.get();
    }
}
