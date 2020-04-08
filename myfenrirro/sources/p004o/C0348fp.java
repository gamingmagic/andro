package p004o;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.io.File;

/* renamed from: o.fp */
class C0348fp implements OnClickListener {

    /* renamed from: 櫯 */
    private final /* synthetic */ File f932;

    /* renamed from: 鷭 */
    final /* synthetic */ C0346fn f933;

    C0348fp(C0346fn fnVar, File file) {
        this.f933 = fnVar;
        this.f932 = file;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Builder builder = new Builder(C1014.f6147);
        if (this.f932.mkdirs()) {
            C0595nv.f2874 = this.f932.getAbsolutePath();
            C1014.f6147.f51.f1386.f917.setText(C0595nv.f2874);
            builder.setMessage(C0595nv.f2874 + ": directory has been successfully created. Please restart application for the changes to take effect.");
            builder.setPositiveButton("Quit", new C0349fq(this));
            builder.setCancelable(false);
        } else {
            builder.setMessage(new StringBuilder(String.valueOf(this.f932.getAbsolutePath())).append(": couldn't create directory!").toString());
        }
        builder.show();
    }
}
