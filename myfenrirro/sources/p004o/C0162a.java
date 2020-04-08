package p004o;

import android.app.ProgressDialog;

/* renamed from: o.a */
class C0162a implements Runnable {

    /* renamed from: 鷭 */
    final /* synthetic */ C1428 f109;

    C0162a(C1428 r1) {
        this.f109 = r1;
    }

    public final void run() {
        C1014.f6147.f51.f1408 = new ProgressDialog(C1014.f6147);
        C1014.f6147.f51.f1408.setTitle("Please wait");
        C1014.f6147.f51.f1408.setMessage("Connecting");
        C1014.f6147.f51.f1408.show();
    }
}
