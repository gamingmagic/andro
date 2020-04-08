package p004o;

import android.app.AlertDialog.Builder;

/* renamed from: o.Ć */
class C1020 implements Runnable {

    /* renamed from: 鷭 */
    private final /* synthetic */ String f6190;

    C1020(String str) {
        this.f6190 = str;
    }

    public final void run() {
        String str;
        if (C1014.f6158 == null || C1014.f6158.f674 == null || C1014.f6158.f674.f617 == null) {
            str = "Disconnected from server";
        } else {
            C0252cp cpVar = C1014.f6158;
            String r3 = C1014.f6160.mo3796(3);
            str = r3 == null ? "MSG3" : r3;
        }
        if (this.f6190 != null) {
            str = new StringBuilder(String.valueOf(str)).append(": ").append(this.f6190).toString();
        }
        if (C1014.f6147.f51.f1436 == null) {
            new Builder(C1014.f6147).setTitle(null).setMessage(str).setPositiveButton("To login screen", new C1249(this)).setCancelable(false).show();
        } else {
            new Builder(C1014.f6147).setTitle(null).setMessage(str).show();
        }
    }
}
