package p004o;

import android.app.AlertDialog.Builder;
import android.text.method.ScrollingMovementMethod;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.libroserver.apk.R;
import p004o.C1288.C1289;

/* renamed from: o.東 */
public final class C1629 extends C0519ld {

    /* renamed from: Ą */
    TextView f7554 = ((TextView) this.f1626.findViewById(R.id.textView3));

    /* renamed from: ą */
    Button f7555;

    /* renamed from: Ć */
    Button f7556 = ((Button) this.f1626.findViewById(R.id.button1));

    /* renamed from: ć */
    EditText f7557;

    /* renamed from: ċ */
    int f7558 = -1;

    /* renamed from: ȃ */
    TextView f7559 = ((TextView) this.f1626.findViewById(R.id.textView6));

    /* renamed from: Ȋ */
    TextView f7560;

    /* renamed from: ˮ͈ */
    TextView f7561 = ((TextView) this.f1626.findViewById(R.id.textView4));

    /* renamed from: ˮ͍ */
    ImageView f7562;

    /* renamed from: 岱 */
    TextView f7563;

    /* renamed from: 櫯 */
    GridView f7564;

    /* renamed from: 纫 */
    private OnClickListener f7565 = new C1663(this);

    /* renamed from: 鷭 */
    GridView f7566;

    /* renamed from: o.東$鷭 */
    class C1630 {

        /* renamed from: ˮ͈ */
        int f7568;

        /* renamed from: 櫯 */
        int f7569;

        /* renamed from: 鷭 */
        int f7570;

        C1630() {
        }
    }

    public C1629() {
        super(R.layout.cashshop);
        LinearLayout linearLayout = (LinearLayout) this.f1626.findViewById(R.id.linearLayout1);
        this.f7566 = (GridView) linearLayout.findViewById(R.id.gridView1);
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(R.id.linearLayout2);
        this.f7564 = (GridView) linearLayout2.findViewById(R.id.gridView2);
        this.f7560 = (TextView) linearLayout2.findViewById(R.id.textView5);
        LinearLayout linearLayout3 = (LinearLayout) linearLayout2.findViewById(R.id.linearLayout2_1);
        this.f7562 = (ImageView) linearLayout3.findViewById(R.id.imageView1);
        this.f7563 = (TextView) linearLayout3.findViewById(R.id.textView7);
        LinearLayout linearLayout4 = (LinearLayout) linearLayout2.findViewById(R.id.linearLayout3);
        this.f7555 = (Button) linearLayout4.findViewById(R.id.button2);
        this.f7557 = (EditText) linearLayout4.findViewById(R.id.editText1);
        this.f7566.setOnItemClickListener(new C1631(this));
        this.f7564.setOnItemClickListener(new C1930(this));
        this.f7555.setOnClickListener(new C2053(this));
        this.f7560.setMovementMethod(new ScrollingMovementMethod());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C1379[] mo4420() {
        C1753 r1 = (C1753) this.f7564.getAdapter();
        if (r1 == null) {
            return new C1379[0];
        }
        return (C1379[]) r1.f8049;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final C1630 mo4419(C1379[] r7) {
        C1630 r2 = new C1630();
        r2.f7570 = C1014.f6152.f7978.f6456;
        r2.f7569 = C1014.f6152.f7978.f6455;
        C1379[] r5 = r7;
        int length = r7.length;
        for (int i = 0; i < length; i++) {
            C1379 r72 = r5[i];
            int i2 = r72.f6945 * r72.f6944;
            r2.f7568 += i2;
            if (i2 > r2.f7569) {
                int i3 = i2 - r2.f7569;
                r2.f7569 = 0;
                if (i3 > r2.f7570) {
                    return null;
                }
                r2.f7570 -= i3;
            } else {
                r2.f7569 -= i2;
            }
        }
        return r2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e_ */
    public final void mo4416e_() {
        C1630 r4 = mo4419(mo4420());
        if (r4 != null) {
            this.f7561.setText("Cash points : " + C0622ot.m736((long) r4.f7570));
            this.f7559.setText("Kafra points : " + C0622ot.m736((long) r4.f7569));
            this.f7554.setText("Purchase : " + C0622ot.m736((long) r4.f7568));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f_ */
    public final void mo4417f_() {
        C1379 r4 = (C1379) this.f7566.getItemAtPosition(this.f7558);
        boolean z = r4 != null;
        this.f7562.setVisibility(z ? 0 : 8);
        this.f7563.setVisibility(z ? 0 : 8);
        this.f7560.setVisibility(z ? 0 : 8);
        this.f7557.setVisibility(z ? 0 : 8);
        this.f7555.setVisibility(z ? 0 : 8);
        if (z) {
            TextView textView = this.f7563;
            C1701 r5 = C1014.f6158.f674.f608.mo4465(r4.f6946);
            textView.setText(r5 == null ? null : r5.mo4462(true));
            TextView textView2 = this.f7560;
            C1701 r6 = C1014.f6158.f674.f608.mo4465(r4.f6946);
            textView2.setText(C0453ix.m483(r6 == null ? null : r6.f7764, true));
            this.f7560.setScrollY(0);
            C0453ix ixVar = C1014.f6147.f51;
            ImageView imageView = this.f7562;
            C1992 r62 = new C1992(r4.f6946);
            ixVar.mo3871(imageView, C1014.f6158.f674.mo3608(r62.f8848, r62.f8837, false), ixVar.f1450);
        }
    }

    /* renamed from: g_ */
    public final void mo4418g_() {
        C1379[] r5 = new C1379[C1014.f6152.f7978.f6454.size()];
        for (int i = 0; i < r5.length; i++) {
            r5[i] = new C1379(((C1289) C1014.f6152.f7978.f6454.get(i)).f6459, ((C1289) C1014.f6152.f7978.f6454.get(i)).f6458, 0, ((C1289) C1014.f6152.f7978.f6454.get(i)).f6460);
        }
        if (this.f7558 >= r5.length) {
            this.f7558 = -1;
        }
        this.f7566.setAdapter(new C1753(r5));
        mo4416e_();
        mo4417f_();
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        mo4418g_();
        this.f7564.setAdapter(null);
        if (C1014.f6140.f4448 && C1014.f6154.endsWith("@ragnadeep.com")) {
            if (C1014.f6152.f7978.f6456 == 0 && C1014.f6152.f7978.f6455 == 0) {
                new Builder(C1014.f6147).setMessage("You haven't got any cash points. Go to character select screen to purchase cash points").show();
            }
            this.f7556.setText("Buy cash points");
            this.f7556.setOnClickListener(this.f7565);
        }
    }

    /* renamed from: Ą */
    public final void mo3544() {
        this.f7566.setAdapter(null);
        this.f7564.setAdapter(null);
        C1014.f6144.mo3652((C0839ue) new C1627());
    }
}
