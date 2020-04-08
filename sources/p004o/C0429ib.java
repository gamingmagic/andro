package p004o;

import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.libroserver.apk.R;
import com.roworkshop.andro.c_activity;

/* renamed from: o.ib */
final class C0429ib extends C0519ld {

    /* renamed from: Ą */
    TextView f1242 = ((TextView) this.f1626.findViewById(R.id.textView11));

    /* renamed from: ą */
    TextView f1243 = ((TextView) this.f1626.findViewById(R.id.textView12));

    /* renamed from: Ć */
    TextView f1244 = ((TextView) this.f1626.findViewById(R.id.material1));

    /* renamed from: ć */
    TextView f1245 = ((TextView) this.f1626.findViewById(R.id.material2));

    /* renamed from: ċ */
    TextView f1246 = ((TextView) this.f1626.findViewById(R.id.TextView06));

    /* renamed from: đ */
    Button f1247 = ((Button) this.f1626.findViewById(R.id.Button05));

    /* renamed from: Ē */
    TextView f1248 = ((TextView) this.f1626.findViewById(R.id.textView14));

    /* renamed from: ē */
    TextView f1249 = ((TextView) this.f1626.findViewById(R.id.TextView17));

    /* renamed from: Ė */
    TextView f1250 = ((TextView) this.f1626.findViewById(R.id.TextView10));

    /* renamed from: ė */
    TextView f1251 = ((TextView) this.f1626.findViewById(R.id.TextView19));

    /* renamed from: Ę */
    TextView f1252 = ((TextView) this.f1626.findViewById(R.id.TextView12));

    /* renamed from: ę */
    TextView f1253 = ((TextView) this.f1626.findViewById(R.id.TextView20));

    /* renamed from: ȃ */
    TextView f1254 = ((TextView) this.f1626.findViewById(R.id.textView10));

    /* renamed from: Ȋ */
    TextView f1255 = ((TextView) this.f1626.findViewById(R.id.TextView05));

    /* renamed from: ˮ͈ */
    TextView f1256 = ((TextView) this.f1626.findViewById(R.id.textView9));

    /* renamed from: ˮ͍ */
    TextView f1257 = ((TextView) this.f1626.findViewById(R.id.material3));

    /* renamed from: ܕ */
    Button f1258 = ((Button) this.f1626.findViewById(R.id.Button03));

    /* renamed from: ঽ্ */
    OnClickListener f1259 = new C0430ic(this);

    /* renamed from: 㥳 */
    TextView f1260 = ((TextView) this.f1626.findViewById(R.id.TextView18));

    /* renamed from: 䒧 */
    Button f1261 = ((Button) this.f1626.findViewById(R.id.Button01));

    /* renamed from: 囃 */
    TextView f1262 = ((TextView) this.f1626.findViewById(R.id.TextView24));

    /* renamed from: 岱 */
    TextView f1263 = ((TextView) this.f1626.findViewById(R.id.TextView04));

    /* renamed from: 庸 */
    Button f1264 = ((Button) this.f1626.findViewById(R.id.Button04));

    /* renamed from: 廂 */
    TextView f1265 = ((TextView) this.f1626.findViewById(R.id.TextView22));

    /* renamed from: 櫯 */
    TextView f1266 = ((TextView) this.f1626.findViewById(R.id.textView8));

    /* renamed from: 纫 */
    Button f1267 = ((Button) this.f1626.findViewById(R.id.button1));

    /* renamed from: 躆 */
    Button f1268 = ((Button) this.f1626.findViewById(R.id.Button02));

    /* renamed from: 鷭 */
    TextView f1269 = ((TextView) this.f1626.findViewById(R.id.textView7));

    /* renamed from: 띥 */
    TextView f1270 = ((TextView) this.f1626.findViewById(R.id.TextView08));

    C0429ib(LayoutInflater layoutInflater) {
        super(R.layout.status);
        this.f1267.setOnClickListener(this.f1259);
        this.f1261.setOnClickListener(this.f1259);
        this.f1258.setOnClickListener(this.f1259);
        this.f1268.setOnClickListener(this.f1259);
        this.f1264.setOnClickListener(this.f1259);
        this.f1247.setOnClickListener(this.f1259);
    }

    /* renamed from: 鷭 */
    private static void m442(TextView textView, int i, int i2) {
        if (i2 == 0) {
            textView.setText(String.valueOf(i));
        } else {
            textView.setText(new StringBuilder(String.valueOf(i)).append(" + ").append(i2).toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ć */
    public final void mo3820() {
        C1301 r5 = C1014.f6137.f1636;
        if (r5 != null) {
            if (this.f1626.getParent() != null) {
                this.f1265.setText(String.valueOf(r5.f6530));
                this.f1267.setEnabled(r5.f6530 >= r5.f6487 && r5.f6487 > 0);
                this.f1261.setEnabled(r5.f6530 >= r5.f6488 && r5.f6488 > 0);
                this.f1268.setEnabled(r5.f6530 >= r5.f6489 && r5.f6489 > 0);
                this.f1258.setEnabled(r5.f6530 >= r5.f6490 && r5.f6490 > 0);
                this.f1264.setEnabled(r5.f6530 >= r5.f6491 && r5.f6491 > 0);
                this.f1247.setEnabled(r5.f6530 >= r5.f6492 && r5.f6492 > 0);
                TextView textView = this.f1244;
                int i = r5.f6487;
                textView.setText(i > 0 ? String.valueOf(i) : "");
                TextView textView2 = this.f1245;
                int i2 = r5.f6488;
                textView2.setText(i2 > 0 ? String.valueOf(i2) : "");
                TextView textView3 = this.f1257;
                int i3 = r5.f6489;
                textView3.setText(i3 > 0 ? String.valueOf(i3) : "");
                TextView textView4 = this.f1263;
                int i4 = r5.f6490;
                textView4.setText(i4 > 0 ? String.valueOf(i4) : "");
                TextView textView5 = this.f1255;
                int i5 = r5.f6491;
                textView5.setText(i5 > 0 ? String.valueOf(i5) : "");
                TextView textView6 = this.f1246;
                int i6 = r5.f6492;
                textView6.setText(i6 > 0 ? String.valueOf(i6) : "");
                m442(this.f1269, r5.f6532, r5.f6533);
                m442(this.f1266, r5.f6521, r5.f6493);
                m442(this.f1256, r5.f6520, r5.f6494);
                m442(this.f1254, r5.f6514, r5.f6495);
                m442(this.f1242, r5.f6486, r5.f6534);
                m442(this.f1243, r5.f6518, r5.f6496);
                this.f1248.setText(new StringBuilder(String.valueOf(String.valueOf(r5.f6526))).append(" + ").append(String.valueOf(r5.f6540)).toString());
                this.f1270.setText(new StringBuilder(String.valueOf(String.valueOf(r5.f6503))).append(C1014.f6140.f4496 ? " ~ " : " + ").append(String.valueOf(r5.f6535)).toString());
                this.f1249.setText(new StringBuilder(String.valueOf(String.valueOf(r5.f6504))).append(" + ").append(String.valueOf(r5.f6505)).toString());
                this.f1260.setText(new StringBuilder(String.valueOf(String.valueOf(r5.f6529))).append(" + ").append(String.valueOf(r5.f6506)).toString());
                this.f1250.setText(String.valueOf(r5.f6507));
                this.f1251.setText(String.valueOf(r5.f6508));
                if (r5.f6509 > 0) {
                    this.f1251.append(" + " + r5.f6509);
                }
                this.f1252.setText(String.valueOf(r5.f6523));
                this.f1253.setText(String.valueOf(200 - ((int) (((double) r5.f6510) / 10.0d))));
                this.f1262.setText(C1014.f6137.f1636.f8658 != null ? C1014.f6137.f1636.f8658 : "None");
            }
        }
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        c_activity c_activity = C1014.f6147;
        ((ImageView) C1014.f6147.findViewById(R.id.imageview_status)).setImageBitmap(C1014.f6147.f51.f1411[1]);
        LayoutParams layoutParams = (LayoutParams) this.f1626.getLayoutParams();
        layoutParams.addRule(3, R.id.button1);
        this.f1626.setLayoutParams(layoutParams);
        mo3820();
    }

    /* renamed from: Ą */
    public final void mo3544() {
        c_activity c_activity = C1014.f6147;
        ((ImageView) C1014.f6147.findViewById(R.id.imageview_status)).setImageBitmap(C1014.f6147.f51.f1411[0]);
    }
}
