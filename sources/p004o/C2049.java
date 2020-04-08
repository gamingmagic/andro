package p004o;

import java.nio.ByteBuffer;
import p004o.C0643pc.aux;

/* renamed from: o.憎 */
final class C2049 extends C0762sz {
    C2049() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2043;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        byteBuffer.get();
        C0564mr mrVar = C0595nv.f2879;
        if ((mrVar == C0564mr.MOTR || mrVar == C0564mr.all) && C1014.f6140.f4443 == aux.MOTR) {
            i5 ^= -391688254;
            s3 = (short) (((i5 << 3) & 983039) ^ s3);
            i4 ^= 476474;
            i3 ^= 30494367;
        }
        if (!z) {
            C1263.m2014(i3, i4, s, s2, s3, i5);
        }
    }
}
