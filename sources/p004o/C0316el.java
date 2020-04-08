package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.io.File;

/* renamed from: o.el */
class C0316el implements OnClickListener {

    /* renamed from: 櫯 */
    private final /* synthetic */ File f858;

    /* renamed from: 鷭 */
    final /* synthetic */ C0312eh f859;

    C0316el(C0312eh ehVar, File file) {
        this.f859 = ehVar;
        this.f858 = file;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String absolutePath = this.f858.getAbsolutePath();
        C0595nv.f2869 = absolutePath;
        C0595nv.f2874 = absolutePath;
        this.f859.f854.mo3386(this.f858);
    }
}
