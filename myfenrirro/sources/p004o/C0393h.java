package p004o;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.h */
class C0393h implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0360g f1113;

    C0393h(C0360g gVar) {
        this.f1113 = gVar;
    }

    public final void onClick(View view) {
        C0360g gVar = this.f1113;
        gVar.f992.setText("");
        gVar.f993.setVisibility(4);
        if (C1014.f6144 != null) {
            C1014.f6144.mo3652((C0839ue) new C1079(gVar.f994));
        }
    }
}
