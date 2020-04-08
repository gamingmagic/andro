package p004o;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.io.File;
import java.util.Iterator;
import p004o.C0643pc.C0650.C0651;

/* renamed from: o.cz */
class C0264cz implements OnClickListener {

    /* renamed from: 櫯 */
    private final /* synthetic */ File f707;

    /* renamed from: 鷭 */
    final /* synthetic */ C0262cx f708;

    C0264cz(C0262cx cxVar, File file) {
        this.f708 = cxVar;
        this.f707 = file;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f707.delete();
        if (!this.f707.getName().equals("ddata.grf")) {
            String r5 = C0623ou.m752(this.f707, C0595nv.f2869);
            Iterator it = C1014.f6140.f4529.iterator();
            while (true) {
                if (it.hasNext()) {
                    C0651 r6 = (C0651) it.next();
                    if (r6.f4534.equals(r5)) {
                        new File(C0595nv.f2869, r6.f4532).delete();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        Builder builder = new Builder(C1014.f6147);
        builder.setMessage("Corrupted GRF has been successfully deleted. Please restart application.");
        builder.setPositiveButton("Quit", new C0266da(this));
        builder.show();
    }
}
