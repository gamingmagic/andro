package p004o;

import android.widget.TextView;
import android.widget.Toast;
import java.nio.ByteBuffer;
import org.apache.commons.net.ftp.FTPReply;

/* renamed from: o.㼹 */
final class C1441 extends C0762sz {

    /* renamed from: o.㼹$鷭 */
    class C1442 {

        /* renamed from: Ą */
        int f7051;

        /* renamed from: ą */
        byte f7052;

        /* renamed from: Ć */
        byte f7053;

        /* renamed from: ć */
        byte f7054;

        /* renamed from: ȃ */
        byte f7055;

        /* renamed from: ˮ͈ */
        short f7057;

        /* renamed from: ˮ͍ */
        C1111 f7058;

        /* renamed from: 岱 */
        C1665 f7059;

        /* renamed from: 櫯 */
        short f7060;

        /* renamed from: 鷭 */
        int f7061;

        C1442(ByteBuffer byteBuffer) {
            this.f7061 = byteBuffer.getInt();
            this.f7060 = byteBuffer.getShort();
            this.f7057 = byteBuffer.getShort();
            this.f7055 = byteBuffer.get();
            this.f7051 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
            this.f7052 = byteBuffer.get();
            this.f7053 = byteBuffer.get();
            this.f7054 = byteBuffer.get();
            this.f7058 = new C1111(byteBuffer);
            if (C1014.f6140.f4456) {
                this.f7059 = new C1665(byteBuffer);
            }
        }
    }

    C1441() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 310;
        byteBuffer.getInt();
        C1442[] r19 = new C1442[i];
        for (int i3 = 0; i3 < r19.length; i3++) {
            r19[i3] = new C1442(byteBuffer);
        }
        if (!z) {
            C1992[] r21 = new C1992[r19.length];
            int[] iArr = new int[r19.length];
            int[] iArr2 = new int[r19.length];
            for (int i4 = 0; i4 < r21.length; i4++) {
                C1442 r16 = r19[i4];
                r21[i4] = new C1992(r16.f7051, r16.f7057, r16.f7054, C1472.values()[r16.f7055], r16.f7053 != 0, r16.f7052 != 0, false, 0, 0, 0, r16.f7058, 0, 0, r16.f7059);
                iArr[i4] = r19[i4].f7061;
                iArr2[i4] = r19[i4].f7060 - 2;
            }
            C0527lk lkVar = C1014.f6147.f51.f1385;
            int[] iArr3 = iArr2;
            int[] iArr4 = iArr;
            C1992[] r18 = r21;
            lkVar.f1654 = true;
            lkVar.f1653.setVisibility(4);
            lkVar.f1659.setVisibility(4);
            TextView textView = lkVar.f1660;
            C0252cp cpVar = C1014.f6158;
            String r15 = C1014.f6160.mo3796((int) FTPReply.ENTERING_PASSIVE_MODE);
            textView.setText(new StringBuilder(String.valueOf(r15 == null ? "MSG227" : r15)).append(" : ").append(lkVar.f1659.getText()).toString());
            lkVar.mo3964();
            lkVar.mo3965(r18.length);
            for (int i5 = 0; i5 < r18.length; i5++) {
                lkVar.mo3969(new C0512ky(r18[i5], iArr3[i5]), r18[i5].f8846, iArr4[i5]);
            }
            Toast.makeText(C1014.f6147, "You have successfully opened a vending shop! ^^", 1).show();
        }
    }
}
