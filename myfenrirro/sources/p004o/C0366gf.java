package p004o;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

/* renamed from: o.gf */
class C0366gf implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0365ge f1002;

    C0366gf(C0365ge geVar) {
        this.f1002 = geVar;
    }

    public final void onClick(View view) {
        C0367gg ggVar = (C0367gg) this.f1002.f1001.getAdapter();
        if (ggVar == null) {
            ggVar = new C0367gg();
        }
        List<C0368> list = ggVar.f1003;
        list.add(0, new C0368("/!"));
        for (int i = 0; i < list.size(); i++) {
            C1014.f6160.mo3805("shortcuts", i, ((C0368) list.get(i)).mo3744());
        }
        this.f1002.f1001.setAdapter(new C0367gg());
    }
}
