package p004o;

import android.app.AlertDialog.Builder;
import java.nio.ByteBuffer;

/* renamed from: o.ꂈ */
final class C1869 extends C0762sz {
    C1869() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 519;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        C0618op opVar = C0618op.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String r6 = C0622ot.m741(bArr, opVar);
        if (!z) {
            C0252cp cpVar = C1014.f6158;
            String r4 = C1014.f6160.mo3796(819);
            new Builder(C1014.f6147).setTitle(null).setMessage(String.format(r4 == null ? "MSG819" : r4, new Object[]{r6})).setPositiveButton("Yes", new C1603(this, i3, i4)).setNegativeButton("No", new C1156(this, i3, i4)).setOnCancelListener(new C1157(this, i3, i4)).show();
        }
    }
}
