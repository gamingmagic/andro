package p004o;

import java.nio.ByteBuffer;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;

/* renamed from: o.饪 */
final class C1808 extends C0762sz {

    /* renamed from: 鷭 */
    static final int[] f8337 = {4, 5, 6, 242, 265, 306, 439, NNTPReply.POSTING_NOT_ALLOWED, NNTPReply.POSTING_FAILED, FTPReply.NOT_LOGGED_IN, 531, 576, 577, 578, 579, 1818, 607, 608, 679};

    C1808() {
    }

    static {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 129;
        byte b = byteBuffer.get();
        if (!z) {
            C0252cp cpVar = C1014.f6158;
            int i3 = f8337[(b < 0 || b >= f8337.length) ? 0 : b];
            String r6 = C1014.f6160.mo3796(i3);
            C1014.f6156 = new StringBuilder(String.valueOf(r6 == null ? "MSG" + i3 : r6)).append("(").append(b).append(")").toString();
            C1428 r5 = C1014.f6144;
            if (r5.f7007 != null) {
                r5.f7007.f7024 = true;
            }
        }
    }
}
