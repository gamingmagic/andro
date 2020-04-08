package p004o;

import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;

/* renamed from: o.s */
final class C0735s extends C0519ld {

    /* renamed from: Ą */
    Button f4639 = ((Button) this.f1626.findViewById(R.id.button6));

    /* renamed from: ą */
    private OnClickListener f4640 = new C0764t(this);

    /* renamed from: Ć */
    private OnClickListener f4641 = new C0834u(this);

    /* renamed from: ć */
    private OnClickListener f4642 = new C0866v(this);

    /* renamed from: ȃ */
    Button f4643 = ((Button) this.f1626.findViewById(R.id.button4));

    /* renamed from: ˮ͈ */
    Button f4644 = ((Button) this.f1626.findViewById(R.id.button3));

    /* renamed from: ˮ͍ */
    private OnClickListener f4645 = new C0895w(this);

    /* renamed from: 岱 */
    private OnClickListener f4646 = new C0925x(this);

    /* renamed from: 櫯 */
    Button f4647 = ((Button) this.f1626.findViewById(R.id.button1));

    /* renamed from: 鷭 */
    Button f4648 = ((Button) this.f1626.findViewById(R.id.button2));

    C0735s() {
        super(R.layout.option);
        this.f4647.setOnClickListener(this.f4640);
        this.f4643.setOnClickListener(this.f4645);
        this.f4644.setOnClickListener(this.f4642);
        this.f4648.setOnClickListener(this.f4641);
        this.f4639.setOnClickListener(this.f4646);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ą */
    public final void mo3948() {
        LayoutParams layoutParams = (LayoutParams) this.f1626.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.addRule(13);
            this.f1626.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        LayoutParams layoutParams = (LayoutParams) this.f1626.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.addRule(13);
            this.f1626.setLayoutParams(layoutParams);
        }
        c_activity c_activity = C1014.f6147;
        ((ImageView) C1014.f6147.findViewById(R.id.imageview_option)).setImageBitmap(C1014.f6147.f51.f1419[1]);
        this.f4639.setVisibility((C1014.f6137 == null || C1014.f6137.f1636 == null || !C1014.f6137.f1636.f8660) ? 8 : 0);
    }

    /* renamed from: Ą */
    public final void mo3544() {
        c_activity c_activity = C1014.f6147;
        if (((ImageView) C1014.f6147.findViewById(R.id.imageview_option)) != null) {
            c_activity c_activity2 = C1014.f6147;
            ((ImageView) C1014.f6147.findViewById(R.id.imageview_option)).setImageBitmap(C1014.f6147.f51.f1419[0]);
        }
    }
}
