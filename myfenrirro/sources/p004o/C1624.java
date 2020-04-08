package p004o;

import android.app.AlertDialog.Builder;
import com.roworkshop.andro.c_activity;

/* renamed from: o.斺 */
public class C1624 implements Runnable {

    /* renamed from: 鷭 */
    final /* synthetic */ c_activity f7550;

    C1624(c_activity c_activity) {
        this.f7550 = c_activity;
    }

    public final void run() {
        Builder builder = new Builder(C1014.f6147);
        builder.setMessage("Disconnected from master-server");
        builder.setCancelable(true);
        builder.setOnCancelListener(new C1421(this));
        builder.show();
    }
}
