package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;

/* renamed from: o.䓒 */
final class C1476 extends C0762sz {
    C1476() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 331;
        byte b = byteBuffer.get();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r6 = C0622ot.m741(bArr, opVar);
        if (!z) {
            if (b == 0) {
                C1746 r0 = C1014.f6147.f51.f1427;
                C0252cp cpVar = C1014.f6158;
                String r4 = C1014.f6160.mo3796(388);
                r0.mo4490(String.format(r4 == null ? "MSG388" : r4, new Object[]{r6}), (int) SupportMenu.USER_MASK);
                return;
            }
            C1746 r02 = C1014.f6147.f51.f1427;
            C0252cp cpVar2 = C1014.f6158;
            String r42 = C1014.f6160.mo3796(389);
            r02.mo4490(String.format(r42 == null ? "MSG389" : r42, new Object[]{r6}), 16711680);
        }
    }
}
