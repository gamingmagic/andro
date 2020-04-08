package p004o;

import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;

/* renamed from: o.䑚 */
final class C1462 extends C0762sz {
    C1462() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 327;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        short s4 = byteBuffer.getShort();
        short s5 = byteBuffer.getShort();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        C0622ot.m741(bArr, opVar);
        byte b = byteBuffer.get();
        if (!z) {
            c_activity c_activity = C1014.f6147;
            C0453ix.m488(new C0377gm(s, s2, s3, s4, s5, b > 0), (int) s3, (C0587nn) null);
        }
    }
}
