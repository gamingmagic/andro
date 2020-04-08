package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import org.apache.http.message.TokenParser;

/* renamed from: o.쥞 */
final class C2005 extends C0762sz {
    C2005() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 724;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        C1111 r0 = new C1111(byteBuffer);
        short s4 = byteBuffer.getShort();
        byte b4 = byteBuffer.get();
        byte b5 = byteBuffer.get();
        int i3 = byteBuffer.getInt();
        short s5 = byteBuffer.getShort();
        if (!z) {
            m2676(s, s2, C0622ot.m731(s3), b, b2, b3, r0, s4, b4, b5, i3, s5, null, 0, 0);
        }
    }

    /* renamed from: 鷭 */
    static void m2676(int i, short s, int i2, byte b, byte b2, byte b3, C1111 r22, int i3, byte b4, byte b5, int i4, short s2, C1665 r28, byte b6, short s3) {
        if (b5 > 0) {
            C1014.f6147.f51.f1427.mo4490("Failed to get item", (int) SupportMenu.CATEGORY_MASK);
            return;
        }
        C1708 r0 = C1014.f6158.f674.f608;
        boolean z = b > 0;
        C1701 r25 = r0.mo4465(i2);
        String r252 = r25 == null ? null : r25.mo4462(z);
        if (r252 != null) {
            r252 = r252.replace('_', TokenParser.f9030SP);
        }
        C1014.f6147.f51.f1427.mo4490("You got " + r252 + " (" + s + ")", (int) SupportMenu.USER_MASK);
        int i5 = i - 2;
        C1992 r17 = new C1992(i2, s, b3, C1472.values()[b4], b2 != 0, b != 0, b6 != 0, i3, 0, s3, r22, i4, s2, r28);
        C1992 r18 = (C1992) C1014.f6137.f1636.f6528.get(Integer.valueOf(i5));
        if (r18 != null) {
            r17.f8846 += r18.f8846;
        }
        C1014.f6137.f1636.f6528.put(Integer.valueOf(i5), r17);
        C1014.f6147.f51.f1445.mo4536(r17.f8839);
        C1014.f6147.f51.mo3869(r17.f8848, r17.f8846);
    }
}
