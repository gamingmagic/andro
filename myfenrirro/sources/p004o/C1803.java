package p004o;

import java.nio.ByteBuffer;
import org.apache.commons.net.nntp.NNTPReply;

/* renamed from: o.風 */
final class C1803 extends C0762sz {

    /* renamed from: 鷭 */
    static final int[] f8333 = {7, 8, 9, 10, 267, 311, 704, NNTPReply.POSTING_NOT_ALLOWED, 682, 706, 1373, 2439, 576, 708, 709, 709, 810, 811, 812, 860, 811, 861, 2572};

    C1803() {
    }

    static {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 106;
        byte b = byteBuffer.get();
        String r3 = C0622ot.m741(byteBuffer.get(new byte[20]).array(), C0618op.LOCAL);
        if (!z) {
            m2456(b, r3);
        }
    }

    /* renamed from: 鷭 */
    static final void m2456(int i, String str) {
        int i2;
        if (i < 0 || i >= f8333.length) {
            i2 = 3;
        } else {
            i2 = f8333[i];
        }
        C0252cp cpVar = C1014.f6158;
        String r4 = C1014.f6160.mo3796(i2);
        String sb = new StringBuilder(String.valueOf(r4 == null ? "MSG" + i2 : r4)).append(" (").append(i).append(")").toString();
        if (str != null && str.length() > 0) {
            sb = new StringBuilder(String.valueOf(sb)).append("\n").append(str).toString();
        }
        C1014.f6156 = sb;
        C1428 r3 = C1014.f6144;
        if (r3.f7007 != null) {
            r3.f7007.f7024 = true;
        }
    }
}
