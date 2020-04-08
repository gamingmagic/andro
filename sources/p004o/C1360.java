package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.ᕏ */
final class C1360 {

    /* renamed from: ȃ */
    int f6899;

    /* renamed from: ˮ͈ */
    byte f6900;

    /* renamed from: 櫯 */
    short f6901;

    /* renamed from: 鷭 */
    int f6902;

    C1360(ByteBuffer byteBuffer) {
        this.f6902 = byteBuffer.getInt();
        this.f6901 = byteBuffer.getShort();
        this.f6900 = byteBuffer.get();
        this.f6899 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
    }
}
