package p004o;

import android.widget.ListView;
import android.widget.TextView;
import com.libroserver.apk.R;
import org.apache.commons.net.bsd.RCommandClient;

/* renamed from: o.欢 */
final class C1656 extends C2041 {

    /* renamed from: Ą */
    TextView f7629 = ((TextView) this.f8943.findViewById(R.id.textView2));

    /* renamed from: ȃ */
    TextView f7630 = ((TextView) this.f8943.findViewById(R.id.textView3));

    /* renamed from: ˮ͈ */
    TextView f7631 = ((TextView) this.f8943.findViewById(R.id.textView4));

    /* renamed from: 櫯 */
    TextView f7632 = ((TextView) this.f8943.findViewById(R.id.textView1));

    /* renamed from: 鷭 */
    ListView f7633 = ((ListView) this.f8943.findViewById(R.id.listView1));

    C1656() {
        super(R.layout.guild_positions, C0571my.POSITIONS);
        TextView textView = this.f7632;
        C0252cp cpVar = C1014.f6158;
        String r3 = C1014.f6160.mo3796(512);
        textView.setText(r3 == null ? "MSG512" : r3);
        TextView textView2 = this.f7631;
        C0252cp cpVar2 = C1014.f6158;
        String r32 = C1014.f6160.mo3796(513);
        textView2.setText(r32 == null ? "MSG513" : r32);
        TextView textView3 = this.f7630;
        C0252cp cpVar3 = C1014.f6158;
        String r33 = C1014.f6160.mo3796((int) RCommandClient.DEFAULT_PORT);
        textView3.setText(r33 == null ? "MSG514" : r33);
        TextView textView4 = this.f7629;
        C0252cp cpVar4 = C1014.f6158;
        String r34 = C1014.f6160.mo3796(515);
        textView4.setText(r34 == null ? "MSG515" : r34);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4444() {
        this.f7633.setAdapter(new C2055());
    }
}
