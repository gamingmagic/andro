package p004o;

import java.nio.ByteBuffer;
import p004o.C0928xc.C0929;

/* renamed from: o.귦 */
final class C1888 {

    /* renamed from: Ą */
    int f8514;

    /* renamed from: ą */
    byte f8515;

    /* renamed from: Ć */
    C1111 f8516;

    /* renamed from: ć */
    int f8517;

    /* renamed from: ċ */
    C1665 f8518;

    /* renamed from: ȃ */
    int f8519;

    /* renamed from: Ȋ */
    int f8520;

    /* renamed from: ˮ͈ */
    byte f8521;

    /* renamed from: ˮ͍ */
    short f8522;

    /* renamed from: 岱 */
    short f8523;

    /* renamed from: 櫯 */
    int f8524;

    /* renamed from: 纫 */
    byte f8525;

    /* renamed from: 鷭 */
    short f8526;

    C1888() {
    }

    C1888(short s, int i, byte b, int i2, int i3, byte b2, C1111 r8, int i4, short s2, short s3, byte b3, C0842uh[] uhVarArr, byte b4) {
        this.f8526 = s;
        this.f8524 = i;
        this.f8521 = b;
        this.f8519 = i2;
        this.f8514 = i3;
        this.f8515 = b2;
        this.f8516 = r8;
        this.f8517 = i4;
        this.f8522 = s2;
        this.f8523 = s3;
        this.f8520 = b3;
        if (uhVarArr != null) {
            this.f8518 = new C1665(uhVarArr);
        }
        this.f8525 = b4;
    }

    C1888(C0929 r16) {
        short s = r16.f5600;
        int r2 = C0622ot.m731(r16.f5599);
        byte b = r16.f5596;
        short s2 = r16.f5591;
        short s3 = r16.f5592;
        byte b2 = r16.f5594;
        C1111 r7 = new C1111(r16.f5597);
        C1701 r14 = C1014.f6158.f674.f608.mo4465(C0622ot.m731(r16.f5599));
        this(s, r2, b, s2, s3, b2, r7, 0, 0, (short) (r14 == null ? -1 : r14.f7762), 0, null, (byte) ((r16.f5593 != 0 ? 2 : 0) | (r16.f5595 != 0 ? 1 : 0)));
    }

    C1888(C0841ug ugVar) {
        short s = ugVar.f5058;
        int r2 = C0622ot.m731(ugVar.f5057);
        byte b = ugVar.f5054;
        short s2 = ugVar.f5049;
        short s3 = ugVar.f5050;
        byte b2 = ugVar.f5052;
        C1111 r7 = new C1111(ugVar.f5055);
        int i = ugVar.f5056;
        C1701 r14 = C1014.f6158.f674.f608.mo4465(C0622ot.m731(ugVar.f5057));
        this(s, r2, b, s2, s3, b2, r7, i, 0, (short) (r14 == null ? -1 : r14.f7762), 0, null, (byte) ((ugVar.f5051 != 0 ? 2 : 0) | (ugVar.f5053 != 0 ? 1 : 0)));
    }

    /* renamed from: 鷭 */
    static C1888 m2559(ByteBuffer byteBuffer) {
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        int i = byteBuffer.getInt();
        int i2 = byteBuffer.getInt();
        byte b2 = byteBuffer.get();
        C1111 r0 = new C1111(byteBuffer);
        int i3 = byteBuffer.getInt();
        short s3 = byteBuffer.getShort();
        short s4 = byteBuffer.getShort();
        byte b3 = byteBuffer.get();
        C0842uh[] uhVarArr = new C0842uh[5];
        for (int i4 = 0; i4 < 5; i4++) {
            uhVarArr[i4] = new C0842uh(byteBuffer);
        }
        return new C1888(s, C0622ot.m731(s2), b, i, i2, b2, r0, i3, s3, s4, b3, uhVarArr, byteBuffer.get());
    }

    /* renamed from: 鷭 */
    static C1888 m2560(ByteBuffer byteBuffer, int i, boolean z) {
        short s;
        C1111 r19;
        byte b;
        int i2;
        int i3;
        byte b2;
        int i4;
        if (i <= 0) {
            i = C1014.f6140.f4470;
        }
        int i5 = 0;
        short s2 = 0;
        short s3 = 0;
        byte b3 = 0;
        byte b4 = 0;
        C0842uh[] uhVarArr = null;
        if (i >= 20120712 || z) {
            s = byteBuffer.getShort();
            i4 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
            b2 = byteBuffer.get();
            i3 = C1014.f6140.f4510 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
            i2 = C1014.f6140.f4510 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
            b = byteBuffer.get();
            r19 = new C1111(byteBuffer);
            i5 = byteBuffer.getInt();
            s2 = byteBuffer.getShort();
            s3 = byteBuffer.getShort();
            if (C1014.f6140.f4456) {
                b4 = byteBuffer.get();
                uhVarArr = new C0842uh[5];
                for (int i6 = 0; i6 < uhVarArr.length; i6++) {
                    uhVarArr[i6] = new C0842uh(byteBuffer);
                }
            }
            b3 = byteBuffer.get();
        } else {
            s = byteBuffer.getShort();
            i4 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
            b2 = byteBuffer.get();
            if (byteBuffer.get() != 0) {
                b3 = 1;
            }
            i3 = C0622ot.m731(byteBuffer.getShort());
            i2 = C0622ot.m731(byteBuffer.getShort());
            if (byteBuffer.get() != 0) {
                b3 = (byte) (b3 | 2);
            }
            b = byteBuffer.get();
            r19 = new C1111(byteBuffer);
            if (i >= 20071002) {
                i5 = byteBuffer.getInt();
                s2 = byteBuffer.getShort();
            }
            if (i >= 20100629) {
                s3 = byteBuffer.getShort();
            }
        }
        return new C1888(s, i4, b2, i3, i2, b, r19, i5, s2, s3, b4, uhVarArr, b3);
    }
}
