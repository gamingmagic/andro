package p004o;

import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;

/* renamed from: o.ao */
final class C0192ao extends C0499km {

    /* renamed from: Ą */
    RadioButton f400 = ((RadioButton) this.f418.findViewById(R.id.radioButton2));

    /* renamed from: ą */
    TextView f401 = ((TextView) this.f418.findViewById(R.id.textView2));

    /* renamed from: Ć */
    RadioButton f402 = ((RadioButton) this.f418.findViewById(R.id.radioButton3));

    /* renamed from: ć */
    RadioButton f403 = ((RadioButton) this.f418.findViewById(R.id.radioButton4));

    /* renamed from: ċ */
    Button f404 = ((Button) this.f418.findViewById(R.id.button1));

    /* renamed from: đ */
    OnCheckedChangeListener f405 = new C0195ar(this);

    /* renamed from: Ē */
    OnClickListener f406 = new C0196as(this);

    /* renamed from: ȃ */
    RadioButton f407 = ((RadioButton) this.f418.findViewById(R.id.radioButton1));

    /* renamed from: Ȋ */
    RadioButton f408 = ((RadioButton) this.f418.findViewById(R.id.radioButton6));

    /* renamed from: ˮ͈ */
    TextView f409 = ((TextView) this.f418.findViewById(R.id.textView1));

    /* renamed from: ˮ͍ */
    TextView f410 = ((TextView) this.f418.findViewById(R.id.textView3));

    /* renamed from: ܕ */
    OnCheckedChangeListener f411 = new C0193ap(this);

    /* renamed from: 䒧 */
    C0580ng f412 = C0580ng.KILLER;

    /* renamed from: 岱 */
    RadioButton f413 = ((RadioButton) this.f418.findViewById(R.id.radioButton5));

    /* renamed from: 庸 */
    OnCheckedChangeListener f414 = new C0194aq(this);

    /* renamed from: 櫯 */
    EditText f415 = ((EditText) this.f418.findViewById(R.id.editText1));

    /* renamed from: 纫 */
    C0579nf f416 = C0579nf.EACH_TAKE;

    /* renamed from: 躆 */
    C0581nh f417 = C0581nh.PICKER;

    /* renamed from: 鷭 */
    ScrollView f418 = ((ScrollView) C1014.f6147.getLayoutInflater().inflate(R.layout.party_organization, null));

    C0192ao() {
        this.f407.setOnCheckedChangeListener(this.f411);
        this.f400.setOnCheckedChangeListener(this.f411);
        this.f403.setOnCheckedChangeListener(this.f414);
        this.f402.setOnCheckedChangeListener(this.f414);
        this.f413.setOnCheckedChangeListener(this.f405);
        this.f408.setOnCheckedChangeListener(this.f405);
        this.f404.setOnClickListener(this.f406);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 櫯 */
    public final boolean mo3539() {
        return this.f418.getParent() != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h_ */
    public final void mo3537h_() {
        if (!(this.f418.getParent() != null)) {
            C1014.f6147.f51.f1412.addView(this.f418);
            C1014.f6147.f51.f1434.push(this);
        }
        C1014.f6147.f51.f1412.bringChildToFront(this.f418);
        c_activity c_activity = C1014.f6147;
        ((ImageView) C1014.f6147.findViewById(R.id.imageview_status)).setImageBitmap(C1014.f6147.f51.f1411[1]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˮ͈ */
    public final void mo3538() {
        if (this.f418.getParent() != null) {
            C1014.f6147.f51.f1412.removeView(this.f418);
            do {
            } while (C1014.f6147.f51.f1434.remove(this));
        }
        c_activity c_activity = C1014.f6147;
        ((ImageView) C1014.f6147.findViewById(R.id.imageview_status)).setImageBitmap(C1014.f6147.f51.f1411[0]);
    }
}
