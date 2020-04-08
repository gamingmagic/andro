package p004o;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: o.hx */
class C0424hx implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ C0421hu f1229;

    C0424hx(C0421hu huVar) {
        this.f1229 = huVar;
    }

    public final void onClick(View view) {
        C1014.f6147.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://rink.hockeyapp.net/apps/" + this.f1229.f1226.f58.f60)));
    }
}
