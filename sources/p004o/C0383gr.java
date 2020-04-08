package p004o;

import android.text.method.ScrollingMovementMethod;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.libroserver.apk.R;

/* renamed from: o.gr */
final class C0383gr extends C0519ld {

    /* renamed from: Ą */
    TextView f1079 = ((TextView) this.f1626.findViewById(R.id.textView3));

    /* renamed from: ą */
    TextView f1080 = ((TextView) this.f1626.findViewById(R.id.textView2));

    /* renamed from: Ć */
    TextView f1081 = ((TextView) this.f1626.findViewById(R.id.textView4));

    /* renamed from: ć */
    ImageView f1082 = ((ImageView) this.f1626.findViewById(R.id.imageView1));

    /* renamed from: ċ */
    private OnClickListener f1083 = new C0386gu(this);

    /* renamed from: ȃ */
    SeekBar f1084 = ((SeekBar) this.f1626.findViewById(R.id.seekBar1));

    /* renamed from: Ȋ */
    private OnClickListener f1085 = new C0385gt(this);

    /* renamed from: ˮ͈ */
    Button f1086 = ((Button) this.f1626.findViewById(R.id.button1));

    /* renamed from: ˮ͍ */
    C0377gm f1087;

    /* renamed from: 岱 */
    OnSeekBarChangeListener f1088 = new C0384gs(this);

    /* renamed from: 櫯 */
    Button f1089 = ((Button) this.f1626.findViewById(R.id.button2));

    /* renamed from: 鷭 */
    TextView f1090 = ((TextView) this.f1626.findViewById(R.id.textView1));

    C0383gr() {
        super(R.layout.skill_menu);
        this.f1090.setMovementMethod(new ScrollingMovementMethod());
        this.f1089.setOnClickListener(this.f1085);
        this.f1086.setOnClickListener(this.f1083);
        this.f1084.setOnSeekBarChangeListener(this.f1088);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3753(int i) {
        C0381gq r4 = C1014.f6158.f674.f609.mo3752(this.f1087.f1053);
        this.f1080.setText("Lv. : " + i + " / " + this.f1087.f1051);
        if (r4.f1066 == null || i <= 0 || i > r4.f1066.length) {
            this.f1081.setText("SP : ???");
        } else {
            this.f1081.setText("SP : " + r4.f1066[i - 1]);
        }
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        C0381gq r5 = C1014.f6158.f674.f609.mo3752(this.f1087.f1053);
        this.f1079.setText(r5.f1071);
        C0453ix ixVar = C1014.f6147.f51;
        ixVar.mo3871(this.f1082, C1014.f6158.f674.mo3609(C1014.f6158.f674.f609.mo3752(this.f1087.f1053).f1073), ixVar.f1456);
        this.f1090.setText(C0453ix.m483(r5.f1072, false));
        this.f1086.setEnabled(!(this.f1087.f1052 == 0) && this.f1087.f1051 > 0);
        this.f1089.setEnabled(!(this.f1087.f1052 == 0) && this.f1087.f1051 > 0);
        if (this.f1087.f1051 > 0) {
            this.f1080.setText("Lv : " + this.f1087.f1051);
        } else {
            this.f1080.setText(null);
        }
        if (this.f1087.f1051 > 0) {
            if (this.f1087.f1052 == 0) {
                this.f1081.setText("Passive");
            } else {
                this.f1081.setText("SP : " + this.f1087.f1050);
            }
        } else if (r5.f1066 != null) {
            this.f1081.setText("SP : " + r5.f1066[0] + " (Lv1)");
        } else {
            this.f1081.setText(null);
        }
        if (this.f1087.f1051 > 0 && r5.f1068) {
            if (!(this.f1087.f1052 == 0)) {
                this.f1084.setVisibility(0);
                this.f1084.setMax(this.f1087.f1051 - 1);
                this.f1084.setProgress(this.f1087.f1051 - 1);
                mo3753(this.f1087.f1051);
                return;
            }
        }
        this.f1084.setVisibility(4);
    }

    /* renamed from: Ą */
    public final void mo3544() {
    }
}
