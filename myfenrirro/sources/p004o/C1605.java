package p004o;

import android.widget.Toast;
import java.nio.ByteBuffer;

/* renamed from: o.扜 */
final class C1605 extends C0762sz {

    /* renamed from: o.扜$鷭 */
    enum C1606 {
        FAIL,
        SUCCESS,
        FAIL_CONFIGURATION,
        FAIL_DATABASE,
        FAIL_GUILD,
        FAIL_PARTY
    }

    C1605() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2088;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        if (!z) {
            C1606 r6 = C1606.values()[i4];
            if (r6 != C1606.SUCCESS) {
                Toast.makeText(C1014.f6147, "Failed to set character for deletion: " + r6, 1).show();
            } else {
                C1014.f6147.f51.f1452.mo4561(i3, i5);
            }
        }
    }
}
