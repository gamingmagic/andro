package p004o;

import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.nio.ByteBuffer;

/* renamed from: o.ˮ̘ */
final class C1217 extends C0762sz {
    C1217() {
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 2067;
        byteBuffer.getInt();
        int i3 = byteBuffer.getInt();
        C1360[] r5 = new C1360[i];
        for (int i4 = 0; i4 < i; i4++) {
            r5[i4] = new C1360(byteBuffer);
        }
        if (!z) {
            C1992[] r6 = new C1992[r5.length];
            int[] iArr = new int[r5.length];
            for (int i5 = 0; i5 < r5.length; i5++) {
                C1360 r7 = r5[i5];
                C1992 r11 = new C1992(r7.f6899, r7.f6901, true);
                r11.f8839 = C1472.values()[r7.f6900];
                r6[i5] = r11;
                iArr[i5] = r5[i5].f6902;
            }
            C0527lk lkVar = C1014.f6147.f51.f1385;
            int[] iArr2 = iArr;
            C1992[] r10 = r6;
            C0527lk lkVar2 = lkVar;
            lkVar.f1654 = true;
            lkVar2.f1653.setVisibility(4);
            lkVar2.f1659.setVisibility(4);
            TextView textView = lkVar2.f1660;
            C0252cp cpVar = C1014.f6158;
            String r52 = C1014.f6160.mo3796(1735);
            textView.setText(new StringBuilder(String.valueOf(r52 == null ? "MSG1735" : r52)).append(" : ").append(lkVar2.f1659.getText()).toString());
            EditText editText = lkVar2.f1658;
            C0252cp cpVar2 = C1014.f6158;
            String r53 = C1014.f6160.mo3796(1736);
            editText.setText(String.format(r53 == null ? "MSG1736" : r53, new Object[]{C0622ot.m736((long) i3)}));
            lkVar2.f1658.setInputType(524288);
            lkVar2.f1658.setEnabled(false);
            lkVar2.mo3965(r10.length);
            for (int i6 = 0; i6 < r10.length; i6++) {
                lkVar2.mo3969(new C0512ky(r10[i6], i6), r10[i6].f8846, iArr2[i6]);
            }
            Toast.makeText(C1014.f6147, "You have successfully opened a buying store! ^^", 1).show();
        }
    }
}
