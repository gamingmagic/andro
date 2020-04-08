package p004o;

import android.support.p000v4.view.InputDeviceCompat;
import java.nio.ByteBuffer;

/* renamed from: o.榫 */
final class C1643 extends C0762sz {
    C1643() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 154;
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (!z) {
            C1014.f6147.f51.mo3873(C0622ot.m741(bArr, C0618op.LOCAL), (int) InputDeviceCompat.SOURCE_ANY);
        }
    }
}
