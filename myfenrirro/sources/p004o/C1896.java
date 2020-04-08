package p004o;

import android.widget.Button;
import android.widget.TextView;
import com.libroserver.apk.R;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;

/* renamed from: o.꿻 */
final class C1896 extends C2041 {

    /* renamed from: Ą */
    TextView f8533 = ((TextView) this.f8943.findViewById(R.id.textView5));

    /* renamed from: ą */
    TextView f8534 = ((TextView) this.f8943.findViewById(R.id.textView6));

    /* renamed from: Ć */
    TextView f8535 = ((TextView) this.f8943.findViewById(R.id.textView7));

    /* renamed from: ć */
    TextView f8536 = ((TextView) this.f8943.findViewById(R.id.textView8));

    /* renamed from: ċ */
    Button f8537 = ((Button) this.f8943.findViewById(R.id.button1));

    /* renamed from: ȃ */
    TextView f8538 = ((TextView) this.f8943.findViewById(R.id.textView4));

    /* renamed from: Ȋ */
    TextView[] f8539 = new TextView[3];

    /* renamed from: ˮ͈ */
    TextView f8540 = ((TextView) this.f8943.findViewById(R.id.textView1));

    /* renamed from: ˮ͍ */
    TextView f8541;

    /* renamed from: 岱 */
    TextView[] f8542 = new TextView[3];

    /* renamed from: 櫯 */
    TextView f8543 = ((TextView) this.f8943.findViewById(R.id.textView3));

    /* renamed from: 鷭 */
    TextView f8544 = ((TextView) this.f8943.findViewById(R.id.textView2));

    C1896() {
        super(R.layout.guild_basic, C0571my.BASIC);
        this.f8542[0] = (TextView) this.f8943.findViewById(R.id.textView9);
        this.f8542[1] = (TextView) this.f8943.findViewById(R.id.textView10);
        this.f8542[2] = (TextView) this.f8943.findViewById(R.id.textView11);
        this.f8541 = (TextView) this.f8943.findViewById(R.id.textView12);
        this.f8539[0] = (TextView) this.f8943.findViewById(R.id.textView13);
        this.f8539[1] = (TextView) this.f8943.findViewById(R.id.textView14);
        this.f8539[2] = (TextView) this.f8943.findViewById(R.id.textView15);
        TextView textView = this.f8536;
        C0252cp cpVar = C1014.f6158;
        String r3 = C1014.f6160.mo3796(339);
        textView.setText(r3 == null ? "MSG339" : r3);
        TextView textView2 = this.f8541;
        C0252cp cpVar2 = C1014.f6158;
        String r32 = C1014.f6160.mo3796((int) NNTPReply.SEND_ARTICLE_TO_POST);
        textView2.setText(r32 == null ? "MSG340" : r32);
        Button button = this.f8537;
        C0252cp cpVar3 = C1014.f6158;
        String r33 = C1014.f6160.mo3796(509);
        button.setText(r33 == null ? "MSG509" : r33);
        this.f8537.setOnClickListener(new C1298(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4444() {
        if (C1014.f6137.f1636.f6541 != null) {
            C1503 r4 = C1014.f6137.f1636.f6541;
            TextView textView = this.f8544;
            C0252cp cpVar = C1014.f6158;
            String r6 = C1014.f6160.mo3796(519);
            textView.setText(new StringBuilder(String.valueOf(r6 == null ? "MSG519" : r6)).append(" : ").append(r4.f7210).toString());
            TextView textView2 = this.f8543;
            C0252cp cpVar2 = C1014.f6158;
            String r62 = C1014.f6160.mo3796((int) FTPReply.NEED_PASSWORD);
            textView2.setText(new StringBuilder(String.valueOf(r62 == null ? "MSG331" : r62)).append(" : ").append(r4.f7219).toString());
            TextView textView3 = this.f8540;
            C0252cp cpVar3 = C1014.f6158;
            String r63 = C1014.f6160.mo3796((int) FTPReply.NEED_ACCOUNT);
            textView3.setText(new StringBuilder(String.valueOf(r63 == null ? "MSG332" : r63)).append(" : ").append(r4.f7201).toString());
            this.f8538.setText(String.valueOf(r4.f7208));
            TextView textView4 = this.f8533;
            C0252cp cpVar4 = C1014.f6158;
            String r64 = C1014.f6160.mo3796(333);
            textView4.setText(new StringBuilder(String.valueOf(r64 == null ? "MSG333" : r64)).append(" : ").append(r4.f7202).toString());
            TextView textView5 = this.f8534;
            C0252cp cpVar5 = C1014.f6158;
            String r65 = C1014.f6160.mo3796((int) FTPReply.SECURITY_MECHANISM_IS_OK);
            textView5.setText(new StringBuilder(String.valueOf(r65 == null ? "MSG334" : r65)).append(" : ").append(r4.f7216).toString());
            if (r4.f7204 == 0 || r4.f7204 == r4.f7203) {
                TextView textView6 = this.f8535;
                C0252cp cpVar6 = C1014.f6158;
                String r66 = C1014.f6160.mo3796(336);
                textView6.setText(new StringBuilder(String.valueOf(r66 == null ? "MSG336" : r66)).append(" : ").append(r4.f7203).toString());
            } else {
                TextView textView7 = this.f8535;
                C0252cp cpVar7 = C1014.f6158;
                String r67 = C1014.f6160.mo3796(336);
                textView7.setText(new StringBuilder(String.valueOf(r67 == null ? "MSG336" : r67)).append(" : ").append(C0622ot.m736((long) r4.f7203)).append(" / ").append(C0622ot.m736((long) r4.f7204)).toString());
            }
            for (int i = 0; i < this.f8542.length; i++) {
                C1507 r68 = null;
                if (i < r4.f7205.size()) {
                    r68 = (C1507) r4.f7205.get(i);
                }
                if (r68 != null) {
                    this.f8542[i].setText(r68.f7242);
                } else {
                    this.f8542[i].setText(null);
                }
            }
            for (int i2 = 0; i2 < this.f8539.length; i2++) {
                C1507 r69 = null;
                if (i2 < r4.f7217.size()) {
                    r69 = (C1507) r4.f7217.get(i2);
                }
                if (r69 != null) {
                    this.f8539[i2].setText(r69.f7242);
                } else {
                    this.f8539[i2].setText(null);
                }
            }
        }
    }
}
