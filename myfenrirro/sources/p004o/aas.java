package p004o;

import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import net.hockeyapp.android.LoginActivity;

/* renamed from: o.aas */
public class aas extends Handler {

    /* renamed from: 鷭 */
    final /* synthetic */ LoginActivity f143;

    public aas(LoginActivity loginActivity) {
        this.f143 = loginActivity;
    }

    public final void handleMessage(Message message) {
        if (message.getData().getBoolean("success")) {
            this.f143.finish();
            if (aat.f148 != null) {
            }
        } else {
            Toast.makeText(this.f143, "Login failed. Check your credentials.", 1).show();
        }
    }
}
