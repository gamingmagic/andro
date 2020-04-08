package p004o;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.櫲 */
class C1654 implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C1916 f7626;

    C1654(C1916 r1) {
        this.f7626 = r1;
    }

    public final void onClick(View view) {
        String str = C1014.f6140.f4481;
        if (str.startsWith("www.")) {
            str = "http://" + str;
        }
        C1014.f6147.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }
}
