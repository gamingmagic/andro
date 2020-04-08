package p004o;

import android.support.p000v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;

/* renamed from: o.ˮ̼ */
final class C1240 extends C0762sz {
    C1240() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 712;
        int i3 = byteBuffer.getInt();
        int i4 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        C1111 r0 = new C1111(byteBuffer);
        short s = byteBuffer.getShort();
        byte b4 = byteBuffer.get();
        if (!z) {
            C1992 r21 = new C1992(i4, 1, b3, C1472.values()[b4], b2 != 0, b != 0, false, s, 0, 0, r0, 0, 0, null);
            Object obj = null;
            if (C1014.f6137.f1636.f6502 != null) {
                C0188[] r17 = C1014.f6137.f1636.f6502.f386;
                int length = r17.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    C0188 r24 = r17[i5];
                    if (r24.f398 == i3) {
                        obj = r24.f397;
                        break;
                    }
                    i5++;
                }
            }
            C1014.f6147.f51.f1427.mo4490(new StringBuilder(String.valueOf(obj)).append(" has picked up ").append(r21.mo4615(C1014.f6158.f674.f608)).toString(), (int) SupportMenu.USER_MASK);
        }
    }
}
