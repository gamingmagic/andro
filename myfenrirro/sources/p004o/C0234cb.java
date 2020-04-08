package p004o;

import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;
import java.text.NumberFormat;

/* renamed from: o.cb */
public final class C0234cb extends C0519ld {

    /* renamed from: Ą */
    TextView f533 = ((TextView) this.f1626.findViewById(R.id.textview_hp));

    /* renamed from: ą */
    TextView f534 = ((TextView) this.f1626.findViewById(R.id.textview_class));

    /* renamed from: Ć */
    TextView f535 = ((TextView) this.f1626.findViewById(R.id.textview_lv));

    /* renamed from: ć */
    TextView f536 = ((TextView) this.f1626.findViewById(R.id.textview_weight));

    /* renamed from: ċ */
    ProgressBar f537 = ((ProgressBar) this.f1626.findViewById(R.id.progressBar4));

    /* renamed from: ȃ */
    TextView f538 = ((TextView) this.f1626.findViewById(R.id.textview_sp));

    /* renamed from: Ȋ */
    ProgressBar f539 = ((ProgressBar) this.f1626.findViewById(R.id.progressBar3));

    /* renamed from: ˮ͈ */
    TextView f540 = ((TextView) this.f1626.findViewById(R.id.textview_jlv));

    /* renamed from: ˮ͍ */
    ProgressBar f541 = ((ProgressBar) this.f1626.findViewById(R.id.progressBar1));

    /* renamed from: 岱 */
    ProgressBar f542 = ((ProgressBar) this.f1626.findViewById(R.id.progressBar2));

    /* renamed from: 櫯 */
    TextView f543 = ((TextView) this.f1626.findViewById(R.id.textview_zeny));

    /* renamed from: 纫 */
    public C0235 f544 = new C0235();

    /* renamed from: 鷭 */
    TextView f545 = ((TextView) this.f1626.findViewById(R.id.textview_name));

    /* renamed from: o.cb$鷭 */
    public class C0235 extends C0519ld {

        /* renamed from: Ą */
        TextView f546 = ((TextView) this.f1626.findViewById(R.id.textView3));

        /* renamed from: ą */
        TextView f547 = ((TextView) this.f1626.findViewById(R.id.textView7));

        /* renamed from: ȃ */
        TextView f549 = ((TextView) this.f1626.findViewById(R.id.textView5));

        /* renamed from: ˮ͈ */
        TextView f550 = ((TextView) this.f1626.findViewById(R.id.textView6));

        /* renamed from: 櫯 */
        ProgressBar f551 = ((ProgressBar) this.f1626.findViewById(R.id.progressBar2));

        /* renamed from: 鷭 */
        ProgressBar f552 = ((ProgressBar) this.f1626.findViewById(R.id.progressBar1));

        C0235() {
            super(R.layout.profile_mini);
        }

        /* renamed from: ȃ */
        public final void mo3546() {
            LayoutParams layoutParams = (LayoutParams) C1014.f6147.f51.f1458.getLayoutParams();
            layoutParams.addRule(3, this.f1626.getId());
            C1014.f6147.f51.f1458.setLayoutParams(layoutParams);
        }

        /* renamed from: Ą */
        public final void mo3544() {
        }
    }

    C0234cb(c_activity c_activity) {
        super(R.layout.profile);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3590(C1301 r4) {
        this.f535.setText("Base Lv. " + r4.f8656);
        this.f544.f549.setText("Lv" + r4.f8656);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final void mo3589(C1301 r4) {
        this.f540.setText("Job Lv. " + r4.f6537);
        this.f544.f546.setText("JLv" + r4.f6537);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final void mo3588(C1301 r6) {
        if (r6.f6525 < 1) {
            this.f539.setVisibility(4);
            this.f544.f552.setVisibility(4);
            return;
        }
        this.f539.setVisibility(0);
        this.f544.f552.setVisibility(0);
        this.f539.setMax(100);
        this.f539.setProgress((int) ((r6.f6497 * 100) / r6.f6525));
        this.f544.f552.setMax(this.f539.getMax());
        this.f544.f552.setProgress(this.f539.getProgress());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ȃ */
    public final void mo3587(C1301 r6) {
        if (r6.f6539 < 1) {
            this.f537.setVisibility(4);
            this.f544.f551.setVisibility(4);
            return;
        }
        this.f537.setVisibility(0);
        this.f544.f551.setVisibility(0);
        this.f537.setMax(100);
        this.f537.setProgress((int) ((r6.f6536 * 100) / r6.f6539));
        this.f544.f551.setMax(this.f537.getMax());
        this.f544.f551.setProgress(this.f537.getProgress());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ą */
    public final void mo3583(C1301 r4) {
        this.f533.setText(r4.f8635 + " / " + r4.f8647);
        this.f541.setMax(r4.f8647);
        this.f541.setProgress(r4.f8635);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ą */
    public final void mo3584(C1301 r4) {
        this.f538.setText(r4.f8653 + " / " + r4.f8645);
        this.f542.setMax(r4.f8645);
        this.f542.setProgress(r4.f8653);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ć */
    public final void mo3585(C1301 r4) {
        String format = NumberFormat.getInstance().format((long) r4.f6542);
        this.f543.setText(new StringBuilder(String.valueOf(format)).append(" Z").toString());
        this.f544.f550.setText(new StringBuilder(String.valueOf(format)).append(" Z").toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ć */
    public final void mo3586(C1301 r5) {
        this.f536.setText("Weight : " + (r5.f6545 / 10) + " / " + (r5.f6549 / 10));
        this.f544.f547.setText("W: " + C0622ot.m736((long) (r5.f6545 / 10)) + " / " + C0622ot.m736((long) (r5.f6549 / 10)));
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        this.f544.mo3538();
        LayoutParams layoutParams = (LayoutParams) C1014.f6147.f51.f1458.getLayoutParams();
        layoutParams.addRule(3, this.f1626.getId());
        C1014.f6147.f51.f1458.setLayoutParams(layoutParams);
    }

    /* renamed from: Ą */
    public final void mo3544() {
        c_activity c_activity = C1014.f6147;
        ((ImageView) C1014.f6147.findViewById(R.id.imageview_profile)).setImageBitmap(C1014.f6147.f51.f1394[0]);
    }
}
