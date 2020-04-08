package p004o;

import android.widget.TextView;
import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;
import org.apache.commons.net.ftp.FTPReply;
import p004o.C0357fy.C0358;

/* renamed from: o.ˮ̜ */
final class C1221 extends C0762sz {

    /* renamed from: 鷭 */
    C1222[] f6346;

    /* renamed from: o.ˮ̜$鷭 */
    class C1222 {

        /* renamed from: ȃ */
        int f6348;

        /* renamed from: ˮ͈ */
        byte f6349;

        /* renamed from: 櫯 */
        int f6350;

        /* renamed from: 鷭 */
        int f6351;

        C1222(ByteBuffer byteBuffer) {
            this.f6351 = byteBuffer.getInt();
            this.f6350 = byteBuffer.getInt();
            this.f6349 = byteBuffer.get();
            this.f6348 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        }
    }

    C1221() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 198;
        this.f6346 = new C1222[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.f6346[i3] = new C1222(byteBuffer);
        }
        if (!z) {
            C0357fy fyVar = C1014.f6147.f51.f1377;
            c_activity c_activity = (c_activity) fyVar.f1626.getContext();
            C0354fv[] fvVarArr = new C0354fv[this.f6346.length];
            fyVar.f979 = C0358.NPCSHOP_BUYFROMNPC;
            for (int i4 = 0; i4 < this.f6346.length; i4++) {
                C1222 r8 = this.f6346[i4];
                fvVarArr[i4] = new C0354fv(c_activity, new C1992(r8.f6348, -1, true, C1472.values()[r8.f6349]), 0, r8.f6351, r8.f6350, fyVar.f979);
            }
            TextView textView = fyVar.f963;
            C0252cp cpVar = C1014.f6158;
            String r7 = C1014.f6160.mo3796(187);
            textView.setText(r7 == null ? "MSG187" : r7);
            TextView textView2 = fyVar.f964;
            C0252cp cpVar2 = C1014.f6158;
            String r72 = C1014.f6160.mo3796((int) FTPReply.ENTERING_EPSV_MODE);
            textView2.setText(r72 == null ? "MSG229" : r72);
            fyVar.mo3730(c_activity, fvVarArr);
            C1014.f6147.f51.f1377.mo3537h_();
        }
    }
}
