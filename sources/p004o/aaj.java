package p004o;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import net.hockeyapp.android.FeedbackActivity;
import p004o.aay.C0165;

/* renamed from: o.aaj */
public class aaj extends Handler {

    /* renamed from: 鷭 */
    final /* synthetic */ FeedbackActivity f128;

    public aaj(FeedbackActivity feedbackActivity) {
        this.f128 = feedbackActivity;
    }

    public final void handleMessage(Message message) {
        boolean z = false;
        this.f128.f78 = new abr();
        if (message == null || message.getData() == null) {
            this.f128.f78.f201 = this.f128.getString(C0165.hockeyapp_feedback_send_generic_error);
        } else {
            Bundle data = message.getData();
            String string = data.getString("feedback_response");
            String string2 = data.getString("feedback_status");
            String string3 = data.getString("request_type");
            if (string3.equals("send") && (string == null || Integer.parseInt(string2) != 201)) {
                this.f128.f78.f201 = this.f128.getString(C0165.hockeyapp_feedback_send_generic_error);
            } else if (string3.equals("fetch") && string2 != null && (Integer.parseInt(string2) == 404 || Integer.parseInt(string2) == 422)) {
                this.f128.runOnUiThread(new aao(this.f128));
                z = true;
            } else if (string != null) {
                FeedbackActivity.m44(this.f128, string, string3);
                z = true;
            } else {
                this.f128.f78.f201 = this.f128.getString(C0165.hockeyapp_feedback_send_network_error);
            }
        }
        if (!z) {
            this.f128.runOnUiThread(new aak(this));
        }
    }
}
