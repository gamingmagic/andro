package p004o;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.Ђ */
class C1276 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1916 f6437;

    C1276(C1916 r1) {
        this.f6437 = r1;
    }

    public final void onClick(View view) {
        C1014.f6147.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(C1014.f6140.f4445)));
    }
}
