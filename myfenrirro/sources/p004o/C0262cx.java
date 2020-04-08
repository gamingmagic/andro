package p004o;

import android.app.AlertDialog.Builder;
import java.io.File;

/* renamed from: o.cx */
class C0262cx implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ File f704;

    /* renamed from: 鷭 */
    final /* synthetic */ C0261cw f705;

    C0262cx(C0261cw cwVar, File file) {
        this.f705 = cwVar;
        this.f704 = file;
    }

    public final void run() {
        Builder builder = new Builder(C1014.f6147);
        builder.setTitle("Fatal error");
        builder.setMessage(new StringBuilder(String.valueOf(this.f704.getAbsolutePath())).append(": file corrupted. Delete file to repair client directory?").toString());
        builder.setCancelable(false);
        builder.setNegativeButton("No (Quit)", new C0263cy(this));
        builder.setPositiveButton("Yes (recommended)", new C0264cz(this, this.f704));
        builder.show();
    }
}
