package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: o.鮝 */
final class C1849 extends C0762sz {

    /* renamed from: o.鮝$鷭 */
    enum C1850 {
        SUCCESS,
        FAIL
    }

    C1849() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 261;
        int i3 = byteBuffer.getInt();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r9 = C0622ot.m741(bArr, opVar);
        byte b = byteBuffer.get();
        if (!z) {
            if (C1850.values()[b] == C1850.FAIL) {
                C1014.f6147.f51.f1427.mo4490(new StringBuilder(String.valueOf(r9)).append(" failed to leave the party o_O").toString(), 16711680);
            } else if (C1014.f6137 != null && C1014.f6137.f1636 != null && C1014.f6137.f1636.f6502 != null) {
                if (i3 == C1014.f6137.f1636.f1630) {
                    C1014.f6137.f1636.f6502 = null;
                    C1014.f6147.f51.f1381.mo3538();
                    C1746 r0 = C1014.f6147.f51.f1427;
                    C0252cp cpVar = C1014.f6158;
                    String r4 = C1014.f6160.mo3796(85);
                    r0.mo4490(r4 == null ? "MSG85" : r4, (int) SupportMenu.USER_MASK);
                    if (C1014.f6142.f1695.f7347 != null) {
                        C1014.f6142.f1695.f7347.f8014 = new HashMap<>();
                    }
                } else {
                    C0188[] r6 = new C0188[C1014.f6137.f1636.f6502.f386.length];
                    int i4 = 0;
                    for (int i5 = 0; i5 < r6.length; i5++) {
                        if (C1014.f6137.f1636.f6502.f386[i5].f398 != i3) {
                            int i6 = i4;
                            i4++;
                            r6[i6] = C1014.f6137.f1636.f6502.f386[i5];
                        }
                    }
                    if (i4 != r6.length) {
                        C1014.f6137.f1636.f6502.f386 = (C0188[]) Arrays.copyOf(r6, i4);
                        if (C1014.f6147.f51.f1381.f1626.getParent() != null) {
                            C1014.f6147.f51.f1381.mo3545();
                        }
                        if (C1014.f6142.f1695.f7347 != null) {
                            C1739 r92 = C1014.f6142.f1695.f7347;
                            r92.f8014 = (HashMap) r92.f8014.clone();
                            r92.f8014.remove(Integer.valueOf(i3));
                        }
                    }
                }
            }
        }
    }
}
