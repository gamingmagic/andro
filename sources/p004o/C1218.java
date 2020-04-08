package p004o;

import java.nio.ByteBuffer;
import org.apache.commons.net.ftp.FTPReply;

/* renamed from: o.ˮ̚ */
final class C1218 extends C0762sz {

    /* renamed from: 鷭 */
    C1219[] f6338;

    /* renamed from: o.ˮ̚$鷭 */
    class C1219 {

        /* renamed from: ȃ */
        C1111 f6340;

        /* renamed from: ˮ͈ */
        byte f6341;

        /* renamed from: 櫯 */
        int f6342;

        /* renamed from: 鷭 */
        short f6343;

        C1219(ByteBuffer byteBuffer) {
            this.f6343 = byteBuffer.getShort();
            this.f6342 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
            this.f6341 = byteBuffer.get();
            this.f6340 = new C1111(byteBuffer);
        }
    }

    C1218() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 545;
        this.f6338 = new C1219[i];
        for (int i3 = 0; i3 < this.f6338.length; i3++) {
            this.f6338[i3] = new C1219(byteBuffer);
        }
        if (!z) {
            if (i == 0) {
                C1746 r0 = C1014.f6147.f51.f1427;
                C0252cp cpVar = C1014.f6158;
                String r6 = C1014.f6160.mo3796((int) FTPReply.CANNOT_OPEN_DATA_CONNECTION);
                r0.mo4490(r6 == null ? "MSG425" : r6, 16711680);
                return;
            }
            C1992[] r4 = new C1992[this.f6338.length];
            for (int i4 = 0; i4 < this.f6338.length; i4++) {
                r4[i4] = (C1992) C1014.f6137.f1636.f6528.get(Integer.valueOf(this.f6338[i4].f6343 - 2));
            }
            C1528 r02 = C1014.f6147.f51.f1388;
            C1220 r7 = new C1220(this, r4);
            C1992[] r5 = r4;
            C1528 r42 = r02;
            r02.f7283 = r7;
            r42.f7284.setAdapter(new C1323((int[]) null, r5));
            r42.mo3537h_();
        }
    }
}
