package p004o;

import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: o.䙒 */
public final class C1496 extends C0519ld {

    /* renamed from: Ą */
    TextView f7173 = ((TextView) this.f1626.findViewById(R.id.textView11));

    /* renamed from: ą */
    TextView f7174 = ((TextView) this.f1626.findViewById(R.id.textView12));

    /* renamed from: Ć */
    TextView f7175 = ((TextView) this.f1626.findViewById(R.id.textView15));

    /* renamed from: ć */
    TextView f7176 = ((TextView) this.f1626.findViewById(R.id.textView16));

    /* renamed from: ċ */
    TextView f7177 = ((TextView) this.f1626.findViewById(R.id.textViewintimacy));

    /* renamed from: đ */
    Button f7178 = ((Button) this.f1626.findViewById(R.id.buttonskill));

    /* renamed from: Ē */
    ProgressBar f7179 = ((ProgressBar) this.f1626.findViewById(R.id.HPbar));

    /* renamed from: ē */
    ProgressBar f7180 = ((ProgressBar) this.f1626.findViewById(R.id.SPbar));

    /* renamed from: ȃ */
    TextView f7181 = ((TextView) this.f1626.findViewById(R.id.textView10));

    /* renamed from: Ȋ */
    TextView f7182 = ((TextView) this.f1626.findViewById(R.id.TextView02));

    /* renamed from: ˮ͈ */
    TextView f7183 = ((TextView) this.f1626.findViewById(R.id.textView9));

    /* renamed from: ˮ͍ */
    TextView f7184 = ((TextView) this.f1626.findViewById(R.id.textViewlvl));

    /* renamed from: ܕ */
    TextView f7185 = ((TextView) this.f1626.findViewById(R.id.editText1));

    /* renamed from: 䒧 */
    TextView f7186 = ((TextView) this.f1626.findViewById(R.id.textView27));

    /* renamed from: 岱 */
    TextView f7187 = ((TextView) this.f1626.findViewById(R.id.textView20));

    /* renamed from: 庸 */
    Button f7188 = ((Button) this.f1626.findViewById(R.id.buttondel));

    /* renamed from: 櫯 */
    TextView f7189 = ((TextView) this.f1626.findViewById(R.id.textView8));

    /* renamed from: 纫 */
    TextView f7190 = ((TextView) this.f1626.findViewById(R.id.textView25));

    /* renamed from: 躆 */
    TextView f7191 = ((TextView) this.f1626.findViewById(R.id.textView23));

    /* renamed from: 鷭 */
    TextView f7192 = ((TextView) this.f1626.findViewById(R.id.textView7));

    public C1496(LayoutInflater layoutInflater) {
        super(R.layout.statusmercenary);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ć */
    public final void mo4358() {
        C1302if ifVar = C1014.f6137.f1636.f6538;
        C1305 r8 = C1014.f6137.f1636.f6538.f6567;
        if (ifVar != null && r8 != null) {
            this.f7182.setText(r8.f6594 + "/" + r8.f6592);
            this.f7180.setMax(r8.f6592);
            this.f7180.setProgress(r8.f6594);
            this.f7187.setText(r8.f6599 + "/" + r8.f6597);
            this.f7179.setMax(r8.f6597);
            this.f7179.setProgress(r8.f6599);
            this.f7192.setText(String.valueOf(ifVar.f6573));
            this.f7189.setText(String.valueOf(ifVar.f6564));
            this.f7183.setText(String.valueOf(ifVar.f6562));
            this.f7181.setText(String.valueOf(ifVar.f6550));
            this.f7173.setText(String.valueOf(ifVar.f6551));
            this.f7174.setText(String.valueOf(ifVar.f6552));
            this.f7175.setText(String.valueOf(ifVar.f6553));
            this.f7176.setText(String.valueOf(ifVar.f6565));
            this.f7184.setText(String.valueOf(r8.f6593));
            this.f7190.setText(String.valueOf(ifVar.f6575));
            this.f7177.setText(String.valueOf(r8.f6589));
            this.f7186.setText(String.valueOf(ifVar.f6566));
            this.f7191.setText(String.valueOf(new SimpleDateFormat("MM/dd HH:mm").format(new Date(ifVar.f6568 * 1000))));
            this.f7185.setText(r8.f6596);
            this.f7188.setOnClickListener(new C1819(this));
            this.f7178.setOnClickListener(new C1468(this));
            C0540lv r7 = C1014.f6142.mo3978(r8.f6595);
            if (r7 != null) {
                r7.mo3995(r8);
                r7.mo3993(r8);
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
