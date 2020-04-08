package p004o;

import net.hockeyapp.android.FeedbackActivity;
import p004o.acu.C0176;

/* renamed from: o.aao */
public class aao implements Runnable {

    /* renamed from: 鷭 */
    final /* synthetic */ FeedbackActivity f134;

    public aao(FeedbackActivity feedbackActivity) {
        this.f134 = feedbackActivity;
    }

    public final void run() {
        C0176.f323.mo3505(this.f134, null);
        this.f134.getSharedPreferences("net.hockeyapp.android.feedback", 0).edit().remove("idLastMessageSend").remove("idLastMessageProcessed").apply();
        this.f134.mo3403(false);
    }
}
