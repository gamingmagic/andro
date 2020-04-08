package p004o;

import android.app.AlertDialog.Builder;

/* renamed from: o.cu */
class C0259cu implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ boolean[] f699;

    /* renamed from: 鷭 */
    final /* synthetic */ C0252cp f700;

    C0259cu(C0252cp cpVar, boolean[] zArr) {
        this.f700 = cpVar;
        this.f699 = zArr;
    }

    public final void run() {
        Builder builder = new Builder(C1014.f6147);
        builder.setCancelable(false);
        builder.setMessage("Game client resources have been successfully downloaded");
        builder.setPositiveButton("Ok", new C0260cv(this, this.f699));
        builder.show();
    }
}
