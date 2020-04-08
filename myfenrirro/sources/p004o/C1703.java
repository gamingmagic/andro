package p004o;

import android.app.AlertDialog.Builder;
import java.nio.ByteBuffer;
import org.apache.http.HttpHeaders;

/* renamed from: o.碚 */
final class C1703 extends C0762sz {
    C1703() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 500;
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r6 = C0622ot.m741(bArr, opVar);
        byteBuffer.getInt();
        short s = byteBuffer.getShort();
        if (!z) {
            C1014.f6141.f6187 = r6;
            Builder builder = new Builder(C1014.f6147);
            StringBuilder append = new StringBuilder("(").append(r6).append(") Lv ").append(s).append(" ");
            C0252cp cpVar = C1014.f6158;
            String r3 = C1014.f6160.mo3796(94);
            builder.setMessage(append.append(r3 == null ? "MSG94" : r3).toString());
            builder.setPositiveButton(HttpHeaders.ACCEPT, new C1865(this));
            builder.setNegativeButton("Decline", new C1502(this));
            builder.setOnCancelListener(new C1273(this));
            builder.show();
        }
    }
}
