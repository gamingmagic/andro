package p004o;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.jt */
class C0480jt implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0453ix f1512;

    C0480jt(C0453ix ixVar) {
        this.f1512 = ixVar;
    }

    public final void onClick(View view) {
        if (!C1014.f6140.f4477) {
            if (C1014.f6152.f7978.f6454.size() <= 0 && C1014.f6140.f4470 >= 20110614) {
                C1014.f6144.mo3652((C0839ue) new C1789());
            }
            C1014.f6144.mo3652((C0839ue) new C1425());
            return;
        }
        C1014.f6147.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(C1014.f6140.f4517)));
    }
}
