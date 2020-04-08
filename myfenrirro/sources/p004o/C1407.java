package p004o;

import android.app.AlertDialog.Builder;
import java.nio.ByteBuffer;

/* renamed from: o.㐒 */
final class C1407 extends C0762sz {
    C1407() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        String str;
        this.f4671 = 108;
        byte b = byteBuffer.get();
        if (!z) {
            if (b == 0) {
                C0252cp cpVar = C1014.f6158;
                String r4 = C1014.f6160.mo3796(10);
                str = r4 == null ? "MSG10" : r4;
            } else if (b == 1) {
                C0252cp cpVar2 = C1014.f6158;
                String r42 = C1014.f6160.mo3796(209);
                str = r42 == null ? "MSG209" : r42;
            } else {
                str = "Disconnected from char-server (unknown reason)";
            }
            Builder builder = new Builder(C1014.f6147);
            builder.setMessage(str);
            builder.setCancelable(true);
            builder.show();
            C1428 r3 = C1014.f6144;
            if (r3.f7007 != null) {
                r3.f7007.f7024 = true;
            }
        }
    }
}
