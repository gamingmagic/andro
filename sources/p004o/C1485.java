package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;

/* renamed from: o.䔲 */
final class C1485 extends C0762sz {
    C1485() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 220;
        byteBuffer.getShort();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r5 = C0622ot.m741(bArr, opVar);
        if (!z) {
            if (C1014.f6137.f1636.f6522 == null) {
                C1014.f6137.f1636.f6522 = new C2012();
            }
            C2012 r6 = C1014.f6137.f1636.f6522;
            r6.f8900.add(new C2013(r5, true));
            C1014.f6147.f51.f1390.mo3537h_();
            C1294 r0 = C1014.f6147.f51.f1390;
            C0252cp cpVar = C1014.f6158;
            String r8 = C1014.f6160.mo3796(180);
            r0.mo4285(String.format(r8 == null ? "MSG180" : r8, new Object[]{r5}), SupportMenu.USER_MASK);
        }
    }
}
