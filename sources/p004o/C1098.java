package p004o;

import android.widget.Toast;
import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;
import org.apache.http.HttpStatus;

/* renamed from: o.ǐ */
final class C1098 extends C0762sz {
    C1098() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 112;
        byte b = byteBuffer.get();
        if (!z) {
            if (b != 0) {
                C0592ns.m674("unexpected chardelete reply " + b);
            }
            c_activity c_activity = C1014.f6147;
            C0252cp cpVar = C1014.f6158;
            String r5 = C1014.f6160.mo3796((int) HttpStatus.SC_MOVED_TEMPORARILY);
            Toast.makeText(c_activity, r5 == null ? "MSG302" : r5, 1).show();
        }
    }
}
