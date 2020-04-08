package p004o;

import android.os.Handler;
import android.os.Message;
import net.hockeyapp.android.FeedbackActivity;
import p004o.acu.C0176;

/* renamed from: o.aal */
public class aal extends Handler {

    /* renamed from: 鷭 */
    final /* synthetic */ FeedbackActivity f130;

    public aal(FeedbackActivity feedbackActivity) {
        this.f130 = feedbackActivity;
    }

    public final void handleMessage(Message message) {
        boolean z = false;
        this.f130.f78 = new abr();
        if (!(message == null || message.getData() == null)) {
            abw abw = (abw) message.getData().getSerializable("parse_feedback_response");
            if (abw != null) {
                if (abw.f230.equalsIgnoreCase("success")) {
                    z = true;
                    if (abw.f228 != null) {
                        C0176.f323.mo3505(this.f130.f73, abw.f228);
                        this.f130.runOnUiThread(new aan(this.f130, abw));
                        this.f130.f71 = false;
                    }
                } else {
                    z = false;
                }
            }
        }
        if (!z) {
            this.f130.runOnUiThread(new aam(this));
        }
        FeedbackActivity feedbackActivity = this.f130;
        if (feedbackActivity.f86 != null) {
            feedbackActivity.f86.setEnabled(true);
        }
    }
}
