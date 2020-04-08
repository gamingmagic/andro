package p004o;

import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import com.libroserver.apk.R;

/* renamed from: o.ge */
public final class C0365ge extends C0519ld {

    /* renamed from: ˮ͈ */
    OnClickListener f999 = new C0366gf(this);

    /* renamed from: 櫯 */
    Button f1000;

    /* renamed from: 鷭 */
    ListView f1001 = ((ListView) this.f1626.findViewById(R.id.listView1));

    C0365ge() {
        super(R.layout.shortcuts);
        this.f1001.setAdapter(new C0367gg());
        this.f1000 = (Button) this.f1626.findViewById(R.id.button1);
        this.f1000.setOnClickListener(this.f999);
    }

    /* renamed from: ȃ */
    public final void mo3546() {
    }

    /* renamed from: Ą */
    public final void mo3544() {
        C0367gg ggVar = (C0367gg) this.f1001.getAdapter();
        for (int i = 0; i < ggVar.f1003.size(); i++) {
            C0368 r6 = (C0368) ggVar.f1003.get(i);
            C1014.f6160.mo3805("shortcuts", r6.mo3743(), r6.mo3744());
        }
    }
}
