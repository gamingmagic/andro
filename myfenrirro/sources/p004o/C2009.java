package p004o;

import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;

/* renamed from: o.쨌 */
public final class C2009 extends C0519ld {

    /* renamed from: Ą */
    TextView f8876 = ((TextView) this.f1626.findViewById(R.id.textView11));

    /* renamed from: ą */
    TextView f8877 = ((TextView) this.f1626.findViewById(R.id.textView12));

    /* renamed from: Ć */
    TextView f8878 = ((TextView) this.f1626.findViewById(R.id.textView15));

    /* renamed from: ć */
    TextView f8879 = ((TextView) this.f1626.findViewById(R.id.textView16));

    /* renamed from: ċ */
    TextView f8880 = ((TextView) this.f1626.findViewById(R.id.textView25));

    /* renamed from: đ */
    Button f8881 = ((Button) this.f1626.findViewById(R.id.buttonskill));

    /* renamed from: Ē */
    Button f8882 = ((Button) this.f1626.findViewById(R.id.buttonfeed));

    /* renamed from: ē */
    ProgressBar f8883 = ((ProgressBar) this.f1626.findViewById(R.id.EXPbar));

    /* renamed from: Ė */
    ProgressBar f8884 = ((ProgressBar) this.f1626.findViewById(R.id.SPbar));

    /* renamed from: ȃ */
    TextView f8885 = ((TextView) this.f1626.findViewById(R.id.textView10));

    /* renamed from: Ȋ */
    TextView f8886 = ((TextView) this.f1626.findViewById(R.id.TextView02));

    /* renamed from: ˮ͈ */
    TextView f8887 = ((TextView) this.f1626.findViewById(R.id.textView9));

    /* renamed from: ˮ͍ */
    TextView f8888 = ((TextView) this.f1626.findViewById(R.id.textViewlvl));

    /* renamed from: ܕ */
    Button f8889 = ((Button) this.f1626.findViewById(R.id.buttonrename));

    /* renamed from: 㥳 */
    ProgressBar f8890 = ((ProgressBar) this.f1626.findViewById(R.id.HPbar));

    /* renamed from: 䒧 */
    TextView f8891 = ((TextView) this.f1626.findViewById(R.id.textViewintimacy));

    /* renamed from: 岱 */
    TextView f8892 = ((TextView) this.f1626.findViewById(R.id.textView20));

    /* renamed from: 庸 */
    Button f8893 = ((Button) this.f1626.findViewById(R.id.buttondel));

    /* renamed from: 櫯 */
    TextView f8894 = ((TextView) this.f1626.findViewById(R.id.textView8));

    /* renamed from: 纫 */
    TextView f8895 = ((TextView) this.f1626.findViewById(R.id.TextView04));

    /* renamed from: 躆 */
    EditText f8896 = ((EditText) this.f1626.findViewById(R.id.editText1));

    /* renamed from: 鷭 */
    TextView f8897 = ((TextView) this.f1626.findViewById(R.id.textView7));

    /* renamed from: 띥 */
    ProgressBar f8898 = ((ProgressBar) this.f1626.findViewById(R.id.Hungerbar));

    public C2009(LayoutInflater layoutInflater) {
        super(R.layout.statushomun);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ć */
    public final void mo4620() {
        C1302if ifVar = C1014.f6137.f1636.f6524;
        C1305 r4 = C1014.f6137.f1636.f6524.f6567;
        if (ifVar != null && r4 != null) {
            this.f8897.setText(String.valueOf(ifVar.f6573));
            this.f8894.setText(String.valueOf(ifVar.f6564));
            this.f8887.setText(String.valueOf(ifVar.f6562));
            this.f8885.setText(String.valueOf(ifVar.f6550));
            this.f8876.setText(String.valueOf(ifVar.f6551));
            this.f8877.setText(String.valueOf(ifVar.f6552));
            this.f8878.setText(String.valueOf(ifVar.f6553));
            this.f8879.setText(String.valueOf(ifVar.f6565));
            this.f8888.setText(String.valueOf(r4.f6593));
            this.f8880.setText(ifVar.f6563 + "/" + ifVar.f6554);
            this.f8886.setText(r4.f6594 + "/" + r4.f6592);
            this.f8884.setMax(r4.f6592);
            this.f8884.setProgress(r4.f6594);
            this.f8892.setText(r4.f6599 + "/" + r4.f6597);
            this.f8890.setMax(r4.f6597);
            this.f8890.setProgress(r4.f6599);
            this.f8898.setMax(100);
            this.f8898.setProgress(r4.f6587);
            this.f8895.setText(String.valueOf(r4.f6587));
            TextView textView = this.f8891;
            c_activity c_activity = C1014.f6147;
            textView.setText(C0453ix.m484((int) r4.f6589));
            if (ifVar.f6558 == 1) {
                this.f8889.setVisibility(4);
                this.f8896.setEnabled(false);
                this.f8896.setInputType(524288);
                this.f8896.setTextColor(-1);
                this.f8896.setText(r4.f6596);
            } else {
                this.f8889.setVisibility(0);
                this.f8896.setEnabled(true);
                this.f8896.setText(r4.f6596);
            }
            if (this.f8881.getVisibility() != 4) {
                this.f8889.setOnClickListener(new C1533(this));
            }
            this.f8893.setOnClickListener(new C1500(this));
            this.f8881.setOnClickListener(new C1762(this));
            this.f8882.setOnClickListener(new C1542(this));
            C0540lv r3 = C1014.f6142.mo3978(r4.f6595);
            if (r3 != null) {
                r3.mo4004(r4);
                r3.mo3995(r4);
                r3.mo3993(r4);
            }
        }
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        c_activity c_activity = C1014.f6147;
        ((ImageView) C1014.f6147.findViewById(R.id.imageview_status)).setImageBitmap(C1014.f6147.f51.f1411[1]);
    }

    /* renamed from: Ą */
    public final void mo3544() {
        c_activity c_activity = C1014.f6147;
        ((ImageView) C1014.f6147.findViewById(R.id.imageview_status)).setImageBitmap(C1014.f6147.f51.f1411[0]);
    }
}
