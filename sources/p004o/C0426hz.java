package p004o;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: o.hz */
public class C0426hz implements OnClickListener {

    /* renamed from: 櫯 */
    private final /* synthetic */ ProgressDialog f1233;

    /* renamed from: 鷭 */
    final /* synthetic */ C0421hu f1234;

    public C0426hz(C0421hu huVar, ProgressDialog progressDialog) {
        this.f1234 = huVar;
        this.f1233 = progressDialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1233.dismiss();
    }
}
