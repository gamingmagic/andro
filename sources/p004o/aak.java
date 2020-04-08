package p004o;

import net.hockeyapp.android.FeedbackActivity;

/* renamed from: o.aak */
class aak implements Runnable {

    /* renamed from: 鷭 */
    final /* synthetic */ aaj f129;

    aak(aaj aaj) {
        this.f129 = aaj;
    }

    public final void run() {
        FeedbackActivity feedbackActivity = this.f129.f128;
        if (feedbackActivity.f86 != null) {
            feedbackActivity.f86.setEnabled(true);
        }
        this.f129.f128.showDialog(0);
    }
}
