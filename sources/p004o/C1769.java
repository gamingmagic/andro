package p004o;

import android.app.AlertDialog.Builder;
import java.nio.ByteBuffer;

/* renamed from: o.鄛 */
final class C1769 extends C0762sz {
    C1769() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 369;
        int i3 = byteBuffer.getInt();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r5 = C0622ot.m741(bArr, opVar);
        if (!z) {
            Builder builder = new Builder(C1014.f6147);
            StringBuilder append = new StringBuilder("(").append(r5).append(")");
            C0252cp cpVar = C1014.f6158;
            String r3 = C1014.f6160.mo3796(394);
            builder.setMessage(append.append(r3 == null ? "MSG394" : r3).toString());
            builder.setPositiveButton("Yes", new C1592(this, i3));
            builder.setNegativeButton("No", new C1165(this, i3));
            builder.setOnCancelListener(new C1166(this, i3));
        }
    }
}
