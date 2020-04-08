package p004o;

import android.app.ProgressDialog;

/* renamed from: o.jk */
class C0471jk implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ String f1496;

    /* renamed from: 鷭 */
    final /* synthetic */ C0453ix f1497;

    C0471jk(C0453ix ixVar, String str) {
        this.f1497 = ixVar;
        this.f1496 = str;
    }

    public final void run() {
        if (this.f1497.f1369 == null) {
            this.f1497.f1369 = ProgressDialog.show(C1014.f6147, "Loading", this.f1496);
            return;
        }
        this.f1497.f1369.setMessage(this.f1496);
    }
}
