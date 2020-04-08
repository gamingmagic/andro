package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import net.hockeyapp.android.UpdateActivity;

/* renamed from: o.aba */
public class aba implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ UpdateActivity f156;

    public aba(UpdateActivity updateActivity) {
        this.f156 = updateActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f156.f97 = null;
        dialogInterface.cancel();
    }
}
