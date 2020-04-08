package p004o;

import android.app.AlertDialog.Builder;
import com.roworkshop.andro.c_activity;

/* renamed from: o.ӗ */
public class C1296 implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ String f6480;

    /* renamed from: 鷭 */
    final /* synthetic */ c_activity f6481;

    C1296(c_activity c_activity, String str) {
        this.f6481 = c_activity;
        this.f6480 = str;
    }

    public final void run() {
        Builder builder = new Builder(C1014.f6147);
        builder.setTitle("Fatal error");
        builder.setMessage(this.f6480);
        builder.show();
    }
}
