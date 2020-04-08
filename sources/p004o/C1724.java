package p004o;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.libroserver.apk.R;

/* renamed from: o.築 */
public final class C1724 extends C0519ld {

    /* renamed from: Ą */
    TextView f7951 = ((TextView) this.f1626.findViewById(R.id.textViewOnHand));

    /* renamed from: ą */
    TextView f7952 = ((TextView) this.f1626.findViewById(R.id.textViewInBankValue));

    /* renamed from: Ć */
    TextView f7953 = ((TextView) this.f1626.findViewById(R.id.textViewOnHandValue));

    /* renamed from: ȃ */
    TextView f7954 = ((TextView) this.f1626.findViewById(R.id.textViewInBank));

    /* renamed from: ˮ͈ */
    EditText f7955 = ((EditText) this.f1626.findViewById(R.id.editTextZeny));

    /* renamed from: 櫯 */
    Button f7956 = ((Button) this.f1626.findViewById(R.id.buttonWithdraw));

    /* renamed from: 鷭 */
    Button f7957 = ((Button) this.f1626.findViewById(R.id.buttonDeposit));

    public C1724() {
        super(R.layout.bank);
        TextView textView = this.f7954;
        C0252cp cpVar = C1014.f6158;
        String r3 = C1014.f6160.mo3796(2773);
        textView.setText(r3 == null ? "MSG2773" : r3);
        TextView textView2 = this.f7951;
        C0252cp cpVar2 = C1014.f6158;
        String r32 = C1014.f6160.mo3796(2774);
        textView2.setText(r32 == null ? "MSG2774" : r32);
        Button button = this.f7956;
        C0252cp cpVar3 = C1014.f6158;
        String r33 = C1014.f6160.mo3796(2776);
        button.setText(r33 == null ? "MSG2776" : r33);
        Button button2 = this.f7957;
        C0252cp cpVar4 = C1014.f6158;
        String r34 = C1014.f6160.mo3796(2775);
        button2.setText(r34 == null ? "MSG2775" : r34);
        this.f7957.setOnClickListener(new C1287(this));
        this.f7956.setOnClickListener(new C1309(this));
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        this.f7953.setText(new StringBuilder(String.valueOf(String.valueOf(C1014.f6137.f1636.f6542))).append(" z").toString());
        C1014.f6144.mo3652((C0839ue) new C1063());
    }

    /* renamed from: Ą */
    public final void mo3544() {
        C1014.f6144.mo3652((C0839ue) new C1061());
    }
}
