package p004o;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.support.p000v4.view.ViewCompat;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_point;

/* renamed from: o.gk */
public final class C0372gk {

    /* renamed from: Ą */
    c_point f1018;

    /* renamed from: ȃ */
    C0374if f1019;

    /* renamed from: ˮ͈ */
    ImageView f1020 = ((ImageView) this.f1022.findViewById(R.id.imageView1));

    /* renamed from: 櫯 */
    TextView f1021 = ((TextView) this.f1022.findViewById(R.id.textView1));

    /* renamed from: 鷭 */
    RelativeLayout f1022 = ((RelativeLayout) C1014.f6147.getLayoutInflater().inflate(R.layout.overhead_box, null));

    @SuppressLint({"NewApi"})
    C0372gk(C0374if ifVar) {
        this.f1019 = ifVar;
        this.f1021.setText(this.f1019.f1027);
        if (this.f1019.f1028 != 0) {
            this.f1021.setTextColor(this.f1019.f1028 | ViewCompat.MEASURED_STATE_MASK);
        }
        C1014.f6147.f51.mo3871(this.f1020, "data/texture/" + this.f1019.f1026, (Bitmap) null);
        if (this.f1019.f1025 != C0375.SIGNBOARD) {
            LayoutParams layoutParams = this.f1021.getLayoutParams();
            layoutParams.width = -2;
            this.f1021.setLayoutParams(layoutParams);
            this.f1021.setVisibility(8);
            if (VERSION.SDK_INT < 16) {
                this.f1022.setBackgroundDrawable(null);
            } else {
                this.f1022.setBackground(null);
            }
        }
        C1014.f6147.f51.f1412.addView(this.f1022);
        C1014.f6147.f51.f1412.bringChildToFront(this.f1022);
        this.f1022.measure(0, 0);
        this.f1018 = new c_point(this.f1022.getMeasuredWidth(), this.f1022.getMeasuredHeight());
    }
}
