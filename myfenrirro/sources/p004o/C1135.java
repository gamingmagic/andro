package p004o;

import android.support.p000v4.view.ViewCompat;
import java.nio.ByteBuffer;

/* renamed from: o.ɘ */
final class C1135 extends C0762sz {
    C1135() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 141;
        int i3 = byteBuffer.getInt();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (!z) {
            String r3 = C1014.m1837(bArr);
            if (C1014.f6137.f1636.f6522 == null) {
                C1014.f6147.f51.f1427.mo4490(r3, (int) ViewCompat.MEASURED_SIZE_MASK);
                C0540lv r4 = C1014.f6142.mo3978(i3);
                if (r4 != null) {
                    r4.mo3999(r3, -1);
                    return;
                }
                return;
            }
            C1014.f6147.f51.f1390.mo4285(r3, ViewCompat.MEASURED_SIZE_MASK);
        }
    }
}
