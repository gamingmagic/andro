package p004o;

import android.app.AlertDialog.Builder;
import com.roworkshop.andro.c_activity;

/* renamed from: o.샖 */
public class C1984 implements Runnable {

    /* renamed from: 鷭 */
    final /* synthetic */ c_activity f8809;

    C1984(c_activity c_activity) {
        this.f8809 = c_activity;
    }

    public final void run() {
        Builder builder = new Builder(C1014.f6147);
        builder.setMessage("Failed to connect to master-server");
        builder.setCancelable(true);
        builder.setOnCancelListener(new C1417(this));
        builder.show();
    }
}
