package p004o;

import java.nio.ByteBuffer;
import org.apache.commons.net.nntp.NNTPReply;

/* renamed from: o.ˮ̀ */
final class C1201 extends C0762sz {

    /* renamed from: 鷭 */
    static int[] f6305 = {66, 16, 69, -1, 56, 433, 434, NNTPReply.ARTICLE_NOT_WANTED};

    C1201() {
    }

    static {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 218;
        byte b = byteBuffer.get();
        if (!z) {
            if (b >= 0 || b < f6305.length || f6305[b] != -1) {
                C1746 r0 = C1014.f6147.f51.f1427;
                C0252cp cpVar = C1014.f6158;
                int i3 = f6305[b];
                String r5 = C1014.f6160.mo3796(i3);
                r0.mo4490(r5 == null ? "MSG" + i3 : r5, 16711680);
            }
            C1014.f6147.f51.f1390.mo3538();
            C1014.f6137.f1636.f6522 = null;
        }
    }
}
