package p004o;

import android.widget.TextView;
import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p004o.C0357fy.C0358;

/* renamed from: o.驓 */
final class C1817 extends C0762sz {

    /* renamed from: 鷭 */
    C1818[] f8412;

    /* renamed from: o.驓$鷭 */
    class C1818 {

        /* renamed from: ˮ͈ */
        int f8414;

        /* renamed from: 櫯 */
        int f8415;

        /* renamed from: 鷭 */
        short f8416;

        C1818(ByteBuffer byteBuffer) {
            this.f8416 = byteBuffer.getShort();
            this.f8415 = byteBuffer.getInt();
            this.f8414 = byteBuffer.getInt();
        }
    }

    C1817() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 199;
        this.f8412 = new C1818[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.f8412[i3] = new C1818(byteBuffer);
        }
        if (!z) {
            C0357fy fyVar = C1014.f6147.f51.f1377;
            c_activity c_activity = (c_activity) fyVar.f1626.getContext();
            C0354fv[] fvVarArr = new C0354fv[this.f8412.length];
            int i4 = 0;
            fyVar.f979 = C0358.NPCSHOP_SELLTONPC;
            for (C1818 r10 : this.f8412) {
                int i5 = r10.f8416 - 2;
                C1992 r12 = (C1992) C1014.f6137.f1636.f6528.get(Integer.valueOf(i5));
                if (r12 != null && r12.f8836 == 0 && r12.f8846 > 0) {
                    int i6 = i4;
                    i4++;
                    fvVarArr[i6] = new C0354fv(c_activity, r12, i5, r10.f8415, r10.f8414, fyVar.f979);
                }
            }
            TextView textView = fyVar.f963;
            C0252cp cpVar = C1014.f6158;
            String r9 = C1014.f6160.mo3796(186);
            textView.setText(r9 == null ? "MSG186" : r9);
            TextView textView2 = fyVar.f964;
            C0252cp cpVar2 = C1014.f6158;
            String r92 = C1014.f6160.mo3796(169);
            textView2.setText(r92 == null ? "MSG169" : r92);
            fyVar.mo3730(c_activity, (C0354fv[]) Arrays.copyOf(fvVarArr, i4));
            C1014.f6147.f51.f1377.mo3537h_();
        }
    }
}
