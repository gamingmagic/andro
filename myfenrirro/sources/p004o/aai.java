package p004o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import net.hockeyapp.android.FeedbackActivity;

/* renamed from: o.aai */
public class aai implements OnClickListener {

    /* renamed from: 鷭 */
    final /* synthetic */ FeedbackActivity f127;

    public aai(FeedbackActivity feedbackActivity) {
        this.f127 = feedbackActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f127.f78 = null;
        dialogInterface.cancel();
    }
}
