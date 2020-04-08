package p004o;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

/* renamed from: o.gj */
class C0371gj implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0368 f1017;

    C0371gj(C0368 r1) {
        this.f1017 = r1;
    }

    public final void onClick(View view) {
        List<C0368> list = C0367gg.this.f1003;
        int r4 = this.f1017.mo3743();
        if (r4 == -1) {
            C0592ns.m674("Failed to find element");
            return;
        }
        list.remove(r4);
        for (C0368 r42 : list) {
            C1014.f6160.mo3805("shortcuts", r42.mo3743(), r42.mo3744());
        }
        C1014.f6160.mo3805("shortcuts", list.size(), null);
        C1014.f6147.f51.f1437.f1001.setAdapter(new C0367gg());
    }
}
