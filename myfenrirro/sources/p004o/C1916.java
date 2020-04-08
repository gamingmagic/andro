package p004o;

import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.TextView;
import com.libroserver.apk.R;
import p004o.C0643pc.aux;

/* renamed from: o.돁 */
final class C1916 {

    /* renamed from: Ą */
    private Button f8611 = ((Button) C1014.f6147.findViewById(R.id.button3));

    /* renamed from: ą */
    private TextView f8612 = ((TextView) C1014.f6147.findViewById(R.id.textView1));

    /* renamed from: Ć */
    private Button f8613 = ((Button) C1014.f6147.findViewById(R.id.button1));

    /* renamed from: ć */
    private Button f8614 = ((Button) C1014.f6147.findViewById(R.id.button2));

    /* renamed from: ċ */
    private OnCheckedChangeListener f8615 = new C1787(this);

    /* renamed from: ȃ */
    CheckBox f8616 = ((CheckBox) C1014.f6147.findViewById(R.id.checkBox2));

    /* renamed from: Ȋ */
    private OnClickListener f8617 = new C1844(this);

    /* renamed from: ˮ͈ */
    CheckBox f8618 = ((CheckBox) C1014.f6147.findViewById(R.id.checkBox1));

    /* renamed from: ˮ͍ */
    private Button f8619 = ((Button) C1014.f6147.findViewById(R.id.button5));

    /* renamed from: ܕ */
    private OnClickListener f8620 = new C1654(this);

    /* renamed from: 䒧 */
    private OnClickListener f8621 = new C1768(this);

    /* renamed from: 岱 */
    private Button f8622 = ((Button) C1014.f6147.findViewById(R.id.button6));

    /* renamed from: 庸 */
    private OnClickListener f8623 = new C1276(this);

    /* renamed from: 櫯 */
    EditText f8624 = ((EditText) C1014.f6147.findViewById(R.id.editText1));

    /* renamed from: 纫 */
    private OnCheckedChangeListener f8625 = new C1361(this);

    /* renamed from: 躆 */
    private OnClickListener f8626 = new C1317(this);

    /* renamed from: 鷭 */
    AutoCompleteTextView f8627 = ((AutoCompleteTextView) C1014.f6147.findViewById(R.id.autoCompleteTextView1));

    C1916() {
        String str;
        AutoCompleteTextView autoCompleteTextView;
        String str2;
        EditText editText;
        this.f8611.setOnClickListener(this.f8617);
        this.f8613.setOnClickListener(this.f8626);
        this.f8612.setText("Server: " + C1014.f6140.f4522);
        this.f8614.setVisibility((C1014.f6140.f4481 == null || C1014.f6140.f4481.length() <= 0) ? 4 : 0);
        this.f8613.setOnClickListener(this.f8626);
        CheckBox checkBox = this.f8618;
        String r4 = C1014.f6160.mo3802("save_login", 0);
        String str3 = r4 == null ? null : r4;
        checkBox.setChecked(str3 == null ? false : Boolean.parseBoolean(str3));
        this.f8618.setOnCheckedChangeListener(this.f8615);
        CheckBox checkBox2 = this.f8616;
        String r42 = C1014.f6160.mo3802("save_password", 0);
        String str4 = r42 == null ? null : r42;
        checkBox2.setChecked(str4 == null ? false : Boolean.parseBoolean(str4));
        this.f8616.setOnCheckedChangeListener(this.f8625);
        this.f8614.setOnClickListener(this.f8620);
        this.f8619.setOnClickListener(this.f8621);
        this.f8622.setOnClickListener(this.f8623);
        if (C0595nv.f2876 == null || C0595nv.f2876.f442 == null || C0595nv.f2876.f442.length() <= 0) {
            autoCompleteTextView = this.f8627;
            String r43 = C1014.f6160.mo3802("last_login", 0);
            str = r43 == null ? null : r43;
        } else {
            autoCompleteTextView = this.f8627;
            str = C0595nv.f2876.f442;
        }
        autoCompleteTextView.setText(str);
        if (C0595nv.f2876 == null || C0595nv.f2876.f441 == null || C0595nv.f2876.f441.length() <= 0) {
            editText = this.f8624;
            String r44 = C1014.f6160.mo3802("last_password", 0);
            str2 = r44 == null ? null : r44;
        } else {
            editText = this.f8624;
            str2 = C0595nv.f2876.f441;
        }
        editText.setText(str2);
        this.f8611.setVisibility(C1014.f6161.f6168 ? 0 : 4);
        this.f8619.setVisibility(C1014.f6140.f4505 != null ? 0 : 4);
        this.f8622.setVisibility((C1014.f6140.f4445 == null || !(C1014.f6140.f4443 == aux.RagnarevivalCom || C1014.f6140.f4443 == aux.RebirthRO_Ancyker)) ? 4 : 0);
        C0453ix.m477(R.id.relativeLayout1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4572() {
        boolean isChecked = this.f8618.isChecked();
        C1014.f6160.mo3805("save_login", 0, String.valueOf(isChecked));
        if (isChecked) {
            C1014.f6160.mo3805("last_login", 0, this.f8627.getText().toString());
        } else {
            C1014.f6160.mo3805("last_login", 0, null);
        }
        boolean isChecked2 = this.f8616.isChecked();
        C1014.f6160.mo3805("save_password", 0, String.valueOf(isChecked2));
        if (isChecked2) {
            C1014.f6160.mo3805("last_password", 0, this.f8624.getText().toString());
        } else {
            C1014.f6160.mo3805("last_password", 0, null);
        }
    }
}
