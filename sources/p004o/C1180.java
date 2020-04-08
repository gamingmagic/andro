package p004o;

import java.nio.ByteBuffer;
import org.apache.commons.net.ftp.FTPReply;

/* renamed from: o.ʨ */
final class C1180 extends C0762sz {
    C1180() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 367;
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[60];
        byteBuffer.get(bArr);
        String r6 = C0622ot.m741(bArr, opVar);
        C0618op opVar2 = C0618op.LOCAL;
        byte[] bArr2 = new byte[FTPReply.SERVICE_NOT_READY];
        byteBuffer.get(bArr2);
        String r5 = C0622ot.m741(bArr2, opVar2);
        if (!z) {
            if (C1014.f6137.f1636.f6541 == null) {
                C1014.f6137.f1636.f6541 = new C1503();
            }
            C1014.f6137.f1636.f6541.f7206 = r6;
            C1014.f6137.f1636.f6541.f7207 = r5;
            C1014.f6147.f51.f1427.mo4490(r6, 16776960);
            C1014.f6147.f51.f1427.mo4490(r5, 16776960);
            throw new C0828tx(this);
        }
    }
}
