package p004o;

import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.libroserver.apk.R;

/* renamed from: o.ey */
final class C0330ey extends C0519ld {

    /* renamed from: 櫯 */
    private OnItemClickListener f898 = new C0331ez(this);

    /* renamed from: 鷭 */
    ListView f899 = ((ListView) this.f1626.findViewById(R.id.listView1));

    C0330ey() {
        super(R.layout.settings_ingame);
        this.f899.setOnItemClickListener(this.f898);
    }

    /* renamed from: ȃ */
    public final void mo3546() {
        this.f899.setAdapter(new C0333fa());
    }

    /* renamed from: Ą */
    public final void mo3544() {
    }
}
