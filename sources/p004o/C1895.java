package p004o;

import android.widget.ListView;
import android.widget.TextView;
import com.libroserver.apk.R;
import org.apache.http.HttpStatus;

/* renamed from: o.꿪 */
final class C1895 extends C2041 {

    /* renamed from: ˮ͈ */
    ListView f8530 = ((ListView) this.f8943.findViewById(R.id.listView1));

    /* renamed from: 櫯 */
    TextView f8531 = ((TextView) this.f8943.findViewById(R.id.textView2));

    /* renamed from: 鷭 */
    TextView f8532 = ((TextView) this.f8943.findViewById(R.id.textView1));

    C1895() {
        super(R.layout.guild_expulsions, C0571my.EXPULSIONS);
        TextView textView = this.f8532;
        C0252cp cpVar = C1014.f6158;
        String r3 = C1014.f6160.mo3796((int) HttpStatus.SC_REQUEST_TIMEOUT);
        textView.setText(r3 == null ? "MSG408" : r3);
        TextView textView2 = this.f8531;
        C0252cp cpVar2 = C1014.f6158;
        String r32 = C1014.f6160.mo3796(463);
        textView2.setText(r32 == null ? "MSG463" : r32);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: 鷭 */
    public final void mo4444() {
        this.f8530.setAdapter(new C1613());
    }
}
