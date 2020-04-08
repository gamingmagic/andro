package p004o;

import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.libroserver.apk.R;

/* renamed from: o.盂 */
final class C1695 extends C0519ld {

    /* renamed from: Ą */
    OnClickListener f7746;

    /* renamed from: ą */
    OnClickListener f7747 = new C1707(this);

    /* renamed from: ȃ */
    String f7748;

    /* renamed from: ˮ͈ */
    Button f7749 = ((Button) this.f1626.findViewById(R.id.button));

    /* renamed from: 櫯 */
    EditText f7750 = ((EditText) this.f1626.findViewById(R.id.edit_text));

    /* renamed from: 鷭 */
    TextView f7751 = ((TextView) this.f1626.findViewById(R.id.text_view));

    C1695(String str, boolean z, String str2, OnClickListener onClickListener) {
        super(R.layout.npcinput);
        this.f7751.setText(str);
        if (z) {
            this.f7750.setInputType(12290);
        } else {
            this.f7750.setInputType(0);
            this.f7750.setRawInputType(1);
        }
        this.f7748 = str2;
        this.f7746 = onClickListener;
        this.f7749.setOnClickListener(this.f7747);
        this.f7750.setOnKeyListener(new C1444(this));
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        this.f7750.setText(this.f7748);
        LayoutParams layoutParams = (LayoutParams) this.f1626.getLayoutParams();
        layoutParams.addRule(15);
        this.f1626.setLayoutParams(layoutParams);
        ((InputMethodManager) C1014.f6147.getSystemService("input_method")).toggleSoftInput(1, 0);
        this.f7750.requestFocus();
        this.f7750.selectAll();
    }

    /* renamed from: Ą */
    public final void mo3544() {
        ((InputMethodManager) C1014.f6147.getSystemService("input_method")).toggleSoftInput(1, 0);
    }
}
