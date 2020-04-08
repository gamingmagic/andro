package p004o;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.text.method.LinkMovementMethod;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.libroserver.apk.R;

/* renamed from: o.g */
final class C0360g extends C0519ld {

    /* renamed from: Ą */
    OnClickListener f989 = new C0393h(this);

    /* renamed from: ą */
    OnClickListener f990 = new C0427i(this);

    /* renamed from: ȃ */
    C0525li f991 = new C0525li();

    /* renamed from: ˮ͈ */
    TextView f992 = ((TextView) this.f1626.findViewById(R.id.text_view));

    /* renamed from: 櫯 */
    Button f993 = ((Button) this.f1626.findViewById(R.id.button));

    /* renamed from: 鷭 */
    int f994;

    C0360g() {
        super(R.layout.npcdialog);
        this.f992.setMovementMethod(LinkMovementMethod.getInstance());
        this.f1626.setOnTouchListener(new C0460j(this));
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"NewApi"})
    /* renamed from: Ć */
    public final void mo3733() {
        LayoutParams layoutParams = (LayoutParams) this.f1626.getLayoutParams();
        if (VERSION.SDK_INT >= 17) {
            layoutParams.removeRule(13);
        }
        layoutParams.topMargin = ((int) this.f991.f1648) - this.f1626.getHeight();
        layoutParams.leftMargin = ((int) this.f991.f1649) - (this.f1626.getWidth() / 2);
        this.f1626.setLayoutParams(layoutParams);
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        if (this.f991.f1649 == 0.0f && this.f991.f1648 == 0.0f) {
            mo3948();
        } else {
            mo3733();
        }
    }

    /* renamed from: Ą */
    public final void mo3544() {
        this.f992.setText("");
        this.f993.setVisibility(4);
        C1014.f6147.f51.f1387.mo3538();
    }
}
