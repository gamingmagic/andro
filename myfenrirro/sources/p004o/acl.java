package p004o;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import net.hockeyapp.android.FeedbackActivity;
import p004o.acp.C0175;

/* renamed from: o.acl */
public final class acl extends AsyncTask<Void, Void, abw> {

    /* renamed from: Ą */
    private String f281 = null;

    /* renamed from: ȃ */
    private String f282;

    /* renamed from: ˮ͈ */
    private Handler f283;

    /* renamed from: 櫯 */
    private String f284;

    /* renamed from: 鷭 */
    private Context f285;

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        if (this.f285 == null || this.f284 == null) {
            return null;
        }
        acp acp = C0175.f311;
        abw r4 = acp.m119(this.f284);
        if (!(r4 == null || r4.f229 == null)) {
            ArrayList<abv> arrayList = r4.f229.f202;
            if (arrayList != null && !arrayList.isEmpty()) {
                int i = ((abv) arrayList.get(arrayList.size() - 1)).f216;
                SharedPreferences sharedPreferences = this.f285.getSharedPreferences("net.hockeyapp.android.feedback", 0);
                if (this.f282.equals("send")) {
                    sharedPreferences.edit().putInt("idLastMessageSend", i).putInt("idLastMessageProcessed", i).apply();
                } else if (this.f282.equals("fetch")) {
                    int i2 = sharedPreferences.getInt("idLastMessageSend", -1);
                    int i3 = sharedPreferences.getInt("idLastMessageProcessed", -1);
                    if (!(i == i2 || i == i3)) {
                        sharedPreferences.edit().putInt("idLastMessageProcessed", i).apply();
                        boolean z = false;
                        aaq aaq = aap.f139;
                        if (aaq != null) {
                            z = aaq.mo3442();
                        }
                        if (!z) {
                            Context context = this.f285;
                            if (this.f281 != null) {
                                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                                int identifier = context.getResources().getIdentifier("ic_menu_refresh", "drawable", "android");
                                Class<FeedbackActivity> cls = null;
                                if (aap.f139 != null) {
                                    cls = FeedbackActivity.class;
                                }
                                if (cls == null) {
                                    cls = FeedbackActivity.class;
                                }
                                Intent intent = new Intent();
                                intent.setFlags(805306368);
                                intent.setClass(context, cls);
                                intent.putExtra("url", this.f281);
                                Notification r11 = acx.m141(context, PendingIntent.getActivity(context, 0, intent, 1073741824), "HockeyApp Feedback", "A new answer to your feedback is available.", identifier);
                                if (r11 != null) {
                                    notificationManager.notify(2, r11);
                                }
                            }
                        }
                    }
                }
            }
        }
        return r4;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        abw abw = (abw) obj;
        if (abw != null && this.f283 != null) {
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putSerializable("parse_feedback_response", abw);
            message.setData(bundle);
            this.f283.sendMessage(message);
        }
    }

    public acl(FeedbackActivity feedbackActivity, String str, Handler handler, String str2) {
        this.f285 = feedbackActivity;
        this.f284 = str;
        this.f283 = handler;
        this.f282 = str2;
    }
}
