package p004o;

import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.libroserver.apk.R;

/* renamed from: o.at */
final class C0197at extends C0519ld {

    /* renamed from: ˮ͈ */
    OnItemClickListener f423 = new C0198au(this);

    /* renamed from: 櫯 */
    ListView f424 = ((ListView) this.f1626.findViewById(R.id.listView1));

    /* renamed from: 鷭 */
    TextView f425 = ((TextView) this.f1626.findViewById(R.id.textView1));

    C0197at() {
        super(R.layout.party);
        this.f424.setOnItemClickListener(this.f423);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Ć */
    public final void mo3545() {
        TextView textView = this.f425;
        C0252cp cpVar = C1014.f6158;
        String r4 = C1014.f6160.mo3796(104);
        textView.setText(new StringBuilder(String.valueOf(r4 == null ? "MSG104" : r4)).append(" (").append(C1014.f6137.f1636.f6502.f390).append(")").toString());
        this.f424.setAdapter(new C0202ay());
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        mo3545();
    }

    /* renamed from: Ą */
    public final void mo3544() {
        this.f425.setText(null);
        this.f424.setAdapter(null);
    }
}
