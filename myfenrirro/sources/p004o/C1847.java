package p004o;

import android.support.p000v4.view.MotionEventCompat;
import java.nio.ByteBuffer;

/* renamed from: o.鮅 */
final class C1847 extends C0762sz {
    C1847() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 142;
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (!z && C1014.f6137 != null && C1014.f6137.f1636 != null) {
            String r3 = C1014.m1837(bArr);
            if (C1014.f6137.f1636.f6522 == null) {
                C1014.f6147.f51.f1427.mo4490(r3, (int) MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                C1014.f6142.f1680.f1195.mo3999(r3, -1);
                return;
            }
            C1014.f6147.f51.f1390.mo4285(r3, MotionEventCompat.ACTION_POINTER_INDEX_MASK);
        }
    }
}
