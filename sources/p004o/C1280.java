package p004o;

import android.widget.Toast;
import java.nio.ByteBuffer;

/* renamed from: o.Й */
final class C1280 extends C0762sz {

    /* renamed from: o.Й$鷭 */
    enum C1281 {
        FAIL,
        SUCCESS,
        FAIL_DATABASE
    }

    C1280() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2092;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        if (!z) {
            C1281 r4 = C1281.values()[i4];
            if (r4 != C1281.SUCCESS) {
                Toast.makeText(C1014.f6147, "Failed to cancel character deletion : " + r4, 1).show();
            } else {
                C1014.f6147.f51.f1452.mo4561(i3, 0);
            }
        }
    }
}
