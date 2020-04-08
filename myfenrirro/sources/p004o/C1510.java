package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.䱌 */
final class C1510 {

    /* renamed from: Ą */
    int f7256;

    /* renamed from: ą */
    C1111 f7257;

    /* renamed from: Ć */
    int f7258;

    /* renamed from: ć */
    byte f7259;

    /* renamed from: ȃ */
    short f7260;

    /* renamed from: ˮ͈ */
    byte f7261;

    /* renamed from: 櫯 */
    int f7262;

    /* renamed from: 鷭 */
    short f7263;

    C1510() {
    }

    C1510(short s, int i, byte b, short s2, int i2, C1111 r6, int i3, byte b2) {
        this.f7263 = s;
        this.f7262 = i;
        this.f7261 = b;
        this.f7260 = s2;
        this.f7256 = i2;
        this.f7257 = r6;
        this.f7258 = i3;
        this.f7259 = b2;
    }

    /* renamed from: 鷭 */
    static C1510 m2208(ByteBuffer byteBuffer, int i, boolean z) {
        short s;
        int i2;
        byte b;
        C1111 r13;
        int i3;
        short s2;
        byte b2;
        int i4;
        if (i == 0) {
            i = C1014.f6140.f4470;
        }
        if (i >= 20120712 || z) {
            s = byteBuffer.getShort();
            i4 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
            b2 = byteBuffer.get();
            s2 = byteBuffer.getShort();
            i3 = C1014.f6140.f4510 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
            r13 = new C1111(byteBuffer);
            i2 = byteBuffer.getInt();
            b = byteBuffer.get();
        } else {
            s = byteBuffer.getShort();
            i4 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
            b2 = byteBuffer.get();
            if (byteBuffer.get() != 0) {
                b = 1;
            } else {
                b = 0;
            }
            s2 = byteBuffer.getShort();
            i3 = byteBuffer.getShort();
            if (i >= 5) {
                r13 = new C1111(byteBuffer);
            } else {
                r13 = new C1111(new short[4]);
            }
            if (i >= 20080102) {
                i2 = byteBuffer.getInt();
            } else {
                i2 = 0;
            }
        }
        return new C1510(s, i4, b2, s2, i3, r13, i2, b);
    }
}
