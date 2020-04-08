package p004o;

import android.widget.Toast;
import java.nio.ByteBuffer;

/* renamed from: o.롛 */
final class C1952 extends C0762sz {

    /* renamed from: o.롛$鷭 */
    enum C1953 {
        FAIL,
        SUCCESS,
        FAIL_CONFIGURATION,
        FAIL_DATABASE,
        FAIL_DATE,
        FAIL_BIRTH
    }

    C1952() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2090;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        if (!z) {
            C1953 r4 = C1953.values()[i4];
            if (r4 != C1953.SUCCESS) {
                Toast.makeText(C1014.f6147, "Failed to delete character, error " + r4, 1).show();
            } else {
                C1014.f6147.f51.f1452.mo4560(i3);
            }
        }
    }
}
