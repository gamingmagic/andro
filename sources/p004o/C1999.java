package p004o;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.libroserver.apk.R;

/* renamed from: o.윷 */
final class C1999 {

    /* renamed from: Ą */
    RelativeLayout f8864;

    /* renamed from: ą */
    TextView f8865;

    /* renamed from: Ć */
    TextView f8866;

    /* renamed from: ć */
    TextView f8867;

    /* renamed from: ȃ */
    Bitmap f8868;

    /* renamed from: ˮ͈ */
    int f8869;

    /* renamed from: ˮ͍ */
    ImageView f8870;

    /* renamed from: 櫯 */
    int f8871 = 0;

    /* renamed from: 鷭 */
    C1992 f8872;

    C1999(C1992 r5, int i, int i2) {
        this.f8872 = r5;
        this.f8871 = i;
        this.f8869 = i2;
        String r52 = C1014.f6158.f674.mo3608(this.f8872.f8848, true, false);
        Bitmap bitmap = (Bitmap) C1014.f6147.f51.f1425.get(r52);
        if (bitmap != null) {
            this.f8868 = bitmap;
            return;
        }
        this.f8868 = C1014.f6147.f51.f1450;
        C1014.f6158.mo3387((Runnable) new C1799(this, r52));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final RelativeLayout mo4618(RelativeLayout relativeLayout, boolean z) {
        this.f8864 = relativeLayout;
        this.f8865 = (TextView) this.f8864.findViewById(R.id.text_view_name);
        this.f8867 = (TextView) this.f8864.findViewById(R.id.text_view_price);
        this.f8866 = (TextView) this.f8864.findViewById(R.id.text_view_amount);
        this.f8870 = (ImageView) this.f8864.findViewById(R.id.image_view);
        m2671(z);
        return this.f8864;
    }

    /* renamed from: 鷭 */
    private void m2671(boolean z) {
        this.f8865.setText(this.f8872.mo4615(C1014.f6158.f674.f608));
        this.f8865.setTextColor(this.f8872.mo4610());
        if (!z) {
            TextView textView = this.f8866;
            C0252cp cpVar = C1014.f6158;
            String r6 = C1014.f6160.mo3796(183);
            textView.setText(String.format(r6 == null ? "MSG183" : r6, new Object[]{Integer.valueOf(this.f8872.f8846)}));
        } else {
            TextView textView2 = this.f8866;
            C0252cp cpVar2 = C1014.f6158;
            String r62 = C1014.f6160.mo3796(183);
            textView2.setText(String.format(r62 == null ? "MSG183" : r62, new Object[]{Integer.valueOf(this.f8872.f8846)}));
        }
        TextView textView3 = this.f8867;
        StringBuilder sb = new StringBuilder(" ");
        C0252cp cpVar3 = C1014.f6158;
        String r63 = C1014.f6160.mo3796(370);
        textView3.setText(String.valueOf(sb.append(r63 == null ? "MSG370" : r63).append(C0622ot.m736((long) this.f8871)).toString()));
        this.f8870.setImageBitmap(this.f8868);
        if (this.f8872 == null) {
            this.f8865.setText(null);
            this.f8866.setText(null);
            this.f8867.setText(null);
            this.f8870.setImageBitmap(null);
        }
    }
}
