package p004o;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.libroserver.apk.R;

/* renamed from: o.dr */
final class C0286dr extends C0519ld {

    /* renamed from: Ą */
    TextView[] f774 = new TextView[5];

    /* renamed from: ą */
    ImageView f775;

    /* renamed from: Ć */
    EditText f776;

    /* renamed from: ć */
    Button f777;

    /* renamed from: ċ */
    C1992[] f778;

    /* renamed from: ȃ */
    ImageView[] f779 = new ImageView[5];

    /* renamed from: Ȋ */
    long f780;

    /* renamed from: ˮ͈ */
    TextView f781 = ((TextView) this.f1626.findViewById(R.id.textViewBody));

    /* renamed from: ˮ͍ */
    C1973 f782;

    /* renamed from: 岱 */
    String f783;

    /* renamed from: 櫯 */
    EditText f784 = ((EditText) this.f1626.findViewById(R.id.editTextTitle));

    /* renamed from: 鷭 */
    EditText f785 = ((EditText) this.f1626.findViewById(R.id.editTextFrom));

    public C0286dr() {
        super(R.layout.rodex_letter_read);
        this.f779[0] = (ImageView) this.f1626.findViewById(R.id.imageView1);
        this.f779[1] = (ImageView) this.f1626.findViewById(R.id.imageView2);
        this.f779[2] = (ImageView) this.f1626.findViewById(R.id.imageView3);
        this.f779[3] = (ImageView) this.f1626.findViewById(R.id.imageView4);
        this.f779[4] = (ImageView) this.f1626.findViewById(R.id.imageView5);
        this.f774[0] = (TextView) this.f1626.findViewById(R.id.textViewItem1);
        this.f774[1] = (TextView) this.f1626.findViewById(R.id.textViewItem2);
        this.f774[2] = (TextView) this.f1626.findViewById(R.id.textViewItem3);
        this.f774[3] = (TextView) this.f1626.findViewById(R.id.textViewItem4);
        this.f774[4] = (TextView) this.f1626.findViewById(R.id.textViewItem5);
        this.f775 = (ImageView) this.f1626.findViewById(R.id.imageViewZeny);
        this.f776 = (EditText) this.f1626.findViewById(R.id.editTextZeny);
        this.f777 = (Button) this.f1626.findViewById(R.id.button1);
        C1014.f6147.f51.mo3871(this.f775, "data\\texture\\" + C1014.f6158.f674.f623.f7904.f7928 + "\\basic_interface\\rodexsystem\\renewal\\icon_zeny.bmp", (Bitmap) null);
        this.f777.setOnClickListener(new C0287ds(this));
        C0288dt dtVar = new C0288dt(this);
        for (ImageView onClickListener : this.f779) {
            onClickListener.setOnClickListener(dtVar);
        }
        C0289du duVar = new C0289du(this);
        this.f775.setOnClickListener(duVar);
        this.f776.setOnClickListener(duVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3656(long j) {
        this.f780 = j;
        this.f776.setText(C0622ot.m736(j) + " Z");
        if (j > 0) {
            this.f775.setColorFilter(null);
            this.f775.setAlpha(255);
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        this.f775.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.f775.setAlpha(128);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3657(C1992[] r9) {
        this.f778 = r9;
        for (int i = 0; i < this.f779.length; i++) {
            if (i < r9.length) {
                C0453ix ixVar = C1014.f6147.f51;
                ImageView imageView = this.f779[i];
                C1992 r7 = r9[i];
                ixVar.mo3871(imageView, C1014.f6158.f674.mo3608(r7.f8848, r7.f8837, false), ixVar.f1450);
                if (r9[i].f8846 > 1) {
                    this.f774[i].setVisibility(0);
                    this.f774[i].setText(String.valueOf(r9[i].f8846));
                } else {
                    this.f774[i].setVisibility(4);
                }
            } else {
                this.f779[i].setImageBitmap(null);
                this.f774[i].setVisibility(4);
            }
        }
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        mo3948();
    }

    /* renamed from: Ą */
    public final void mo3544() {
    }
}
