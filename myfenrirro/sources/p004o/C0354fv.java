package p004o;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;
import p004o.C0357fy.C0358;

/* renamed from: o.fv */
final class C0354fv {

    /* renamed from: Ą */
    Bitmap f943;

    /* renamed from: ą */
    RelativeLayout f944;

    /* renamed from: Ć */
    TextView f945;

    /* renamed from: ć */
    TextView f946;

    /* renamed from: ȃ */
    C1992 f947;

    /* renamed from: Ȋ */
    C0358 f948;

    /* renamed from: ˮ͈ */
    int f949;

    /* renamed from: ˮ͍ */
    TextView f950;

    /* renamed from: 岱 */
    ImageView f951;

    /* renamed from: 櫯 */
    int f952;

    /* renamed from: 鷭 */
    int f953;

    C0354fv(c_activity c_activity, C1992 r6, int i, int i2, int i3, C0358 r10) {
        this.f948 = r10;
        this.f947 = r6.mo4612();
        this.f953 = i;
        this.f952 = i2;
        this.f949 = i3;
        String r62 = C1014.f6158.f674.mo3608(this.f947.f8848, true, false);
        Bitmap bitmap = (Bitmap) c_activity.f51.f1425.get(r62);
        if (bitmap != null) {
            this.f943 = bitmap;
            return;
        }
        this.f943 = c_activity.f51.f1450;
        C1014.f6158.mo3387((Runnable) new C0355fw(this, c_activity, r62));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3723(RelativeLayout relativeLayout) {
        this.f944 = relativeLayout;
        if (this.f944 != null) {
            this.f945 = (TextView) this.f944.findViewById(R.id.text_view_name);
            this.f946 = (TextView) this.f944.findViewById(R.id.text_view_amount);
            this.f950 = (TextView) this.f944.findViewById(R.id.text_view_price);
            this.f951 = (ImageView) this.f944.findViewById(R.id.image_view);
            this.f951.setImageBitmap(this.f943);
            this.f945.setText(this.f947.mo4615(C1014.f6158.f674.f608));
            this.f945.setTextColor(this.f947.mo4610());
            this.f946.setText(String.valueOf(this.f947.f8846));
            if (this.f947.f8846 > 0) {
                this.f946.setVisibility(0);
                this.f944.setEnabled(true);
                this.f951.setEnabled(true);
                this.f945.setEnabled(true);
            } else if (this.f947.f8846 < 0) {
                this.f946.setVisibility(4);
                this.f944.setEnabled(true);
                this.f951.setEnabled(true);
                this.f945.setEnabled(true);
            } else if (this.f947.f8846 == 0) {
                this.f944.setEnabled(false);
                this.f951.setEnabled(false);
                this.f945.setEnabled(false);
            }
            String str = this.f948 == C0358.CASHSHOP ? "CP" : "Z";
            if (this.f952 == this.f949) {
                this.f950.setText(new StringBuilder(String.valueOf(C0622ot.m736((long) this.f952))).append(" ").append(str).toString());
            } else {
                this.f950.setText(new StringBuilder(String.valueOf(C0622ot.m736((long) this.f952))).append(" -> ").append(C0622ot.m736((long) this.f949)).append(" ").append(str).toString());
            }
        }
    }
}
