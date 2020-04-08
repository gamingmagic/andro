package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.Ƞ */
final class C1120 {

    /* renamed from: ˮ͈ */
    String f6222;

    /* renamed from: 櫯 */
    short f6223;

    /* renamed from: 鷭 */
    int f6224;

    C1120(ByteBuffer byteBuffer) {
        this.f6224 = byteBuffer.getInt();
        this.f6223 = byteBuffer.getShort();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        this.f6222 = C0622ot.m741(bArr, opVar);
    }
}
