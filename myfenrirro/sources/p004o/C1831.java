package p004o;

import android.app.AlertDialog.Builder;
import java.nio.ByteBuffer;

/* renamed from: o.鬍 */
final class C1831 extends C0762sz {
    C1831() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 595;
        byteBuffer.get();
        if (!z) {
            Builder builder = new Builder(C1014.f6147);
            C0252cp cpVar = C1014.f6158;
            String r5 = C1014.f6160.mo3796(1029);
            builder.setMessage(r5 == null ? "MSG1029" : r5);
            builder.setPositiveButton("OK", new C1151(this));
            builder.setNegativeButton("Cancel", null);
            builder.show();
        }
    }
}
