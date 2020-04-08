package p004o;

import android.content.res.ColorStateList;
import android.support.p000v4.internal.view.SupportMenu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.libroserver.apk.R;
import java.util.Arrays;

/* renamed from: o.dv */
final class C0290dv extends C0519ld {

    /* renamed from: Ą */
    ImageView[] f789 = new ImageView[5];

    /* renamed from: ą */
    TextView[] f790 = new TextView[5];

    /* renamed from: Ć */
    ImageView f791;

    /* renamed from: ć */
    EditText f792;

    /* renamed from: ċ */
    Button f793;

    /* renamed from: ȃ */
    EditText f794 = ((EditText) this.f1626.findViewById(R.id.editTextBody));

    /* renamed from: Ȋ */
    TextView f795;

    /* renamed from: ˮ͈ */
    EditText f796 = ((EditText) this.f1626.findViewById(R.id.editTextTitle));

    /* renamed from: ˮ͍ */
    TextView f797;

    /* renamed from: ܕ */
    C1695 f798;

    /* renamed from: 䒧 */
    C1992[] f799 = new C1992[5];

    /* renamed from: 岱 */
    TextView f800;

    /* renamed from: 庸 */
    ColorStateList f801;

    /* renamed from: 櫯 */
    Button f802 = ((Button) this.f1626.findViewById(R.id.button1));

    /* renamed from: 纫 */
    int[] f803 = new int[5];

    /* renamed from: 躆 */
    int f804;

    /* renamed from: 鷭 */
    EditText f805 = ((EditText) this.f1626.findViewById(R.id.editTextTo));

    C0290dv() {
        super(R.layout.rodex_letter_write);
        this.f789[0] = (ImageView) this.f1626.findViewById(R.id.imageViewItem1);
        this.f789[1] = (ImageView) this.f1626.findViewById(R.id.imageViewItem2);
        this.f789[2] = (ImageView) this.f1626.findViewById(R.id.imageViewItem3);
        this.f789[3] = (ImageView) this.f1626.findViewById(R.id.imageViewItem4);
        this.f789[4] = (ImageView) this.f1626.findViewById(R.id.imageViewItem5);
        this.f790[0] = (TextView) this.f1626.findViewById(R.id.textViewItem1);
        this.f790[1] = (TextView) this.f1626.findViewById(R.id.textViewItem2);
        this.f790[2] = (TextView) this.f1626.findViewById(R.id.textViewItem3);
        this.f790[3] = (TextView) this.f1626.findViewById(R.id.textViewItem4);
        this.f790[4] = (TextView) this.f1626.findViewById(R.id.textViewItem5);
        this.f791 = (ImageView) this.f1626.findViewById(R.id.imageViewZeny);
        this.f792 = (EditText) this.f1626.findViewById(R.id.editTextZeny);
        this.f797 = (TextView) this.f1626.findViewById(R.id.textViewTax);
        this.f800 = (TextView) this.f1626.findViewById(R.id.textViewWeight);
        this.f795 = (TextView) this.f1626.findViewById(R.id.textViewDstCharInfo);
        this.f801 = this.f797.getTextColors();
        this.f793 = (Button) this.f1626.findViewById(R.id.buttonSend);
        Arrays.fill(this.f803, -1);
        this.f802.setOnClickListener(new C0291dw(this));
        this.f793.setOnClickListener(new C0292dx(this));
        C0293dy dyVar = new C0293dy(this);
        for (int i = 0; i < this.f789.length; i++) {
            this.f789[i].setOnClickListener(dyVar);
            this.f789[i].setImageBitmap(null);
            this.f790[i].setVisibility(4);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ć */
    public final long mo3661() {
        try {
            return Long.parseLong(this.f792.getText().toString());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3664(int i, int i2, int i3, String str) {
        this.f804 = i;
        this.f802.setVisibility(4);
        this.f795.setVisibility(0);
        C0523 r5 = (C0523) C1014.f6158.f674.f626.f1638.get(Integer.valueOf(i2));
        this.f795.setText("Lv" + i3 + " " + (r5 != null ? r5.f1645 : "Poring"));
        if (str != null) {
            this.f805.setText(str);
        }
        this.f805.setEnabled(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ć */
    public final void mo3662() {
        long r4 = mo3661() / 50;
        for (C1992 r0 : this.f799) {
            if (r0 != null) {
                r4 += 2500;
            }
        }
        this.f797.setText("Tax: " + C0622ot.m736(r4) + " Z");
        if (r4 > ((long) C1014.f6137.f1636.f6542)) {
            this.f797.setTextColor(SupportMenu.CATEGORY_MASK);
        } else {
            this.f797.setTextColor(this.f801);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo3663(int i) {
        TextView textView = this.f800;
        C0252cp cpVar = C1014.f6158;
        String r5 = C1014.f6160.mo3796(1993);
        textView.setText(String.format(r5 == null ? "MSG1993" : r5, new Object[]{Integer.valueOf(i), Integer.valueOf(2000)}));
        if (i > 2000) {
            this.f800.setTextColor(SupportMenu.CATEGORY_MASK);
        } else {
            this.f800.setTextColor(this.f801);
        }
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        mo3948();
        this.f805.setEnabled(true);
        this.f802.setVisibility(0);
        this.f795.setVisibility(4);
    }

    /* renamed from: Ą */
    public final void mo3544() {
        C1014.f6144.mo3652((C0839ue) new C1069());
    }
}
