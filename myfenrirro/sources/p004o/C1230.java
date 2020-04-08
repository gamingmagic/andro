package p004o;

import android.app.AlertDialog.Builder;
import java.nio.ByteBuffer;

/* renamed from: o.ˮ̫ */
final class C1230 extends C0762sz {
    C1230() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 710;
        int i3 = byteBuffer.getInt();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r3 = C0622ot.m741(bArr, opVar);
        if (!z) {
            m1983(i3, r3);
        }
    }

    /* renamed from: 鷭 */
    static void m1983(int i, String str) {
        StringBuilder append = new StringBuilder("(").append(str).append(") ");
        C0252cp cpVar = C1014.f6158;
        String r4 = C1014.f6160.mo3796(95);
        new Builder(C1014.f6147).setTitle(null).setMessage(append.append(r4 == null ? "MSG95" : r4).toString()).setPositiveButton("Yes", new C1231(i)).setNegativeButton("No", new C1350(i)).setOnCancelListener(new C1848(i)).show();
    }
}
