package android.support.p000v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.support.p000v4.app.RemoteInputCompatBase.RemoteInput;

/* renamed from: android.support.v4.app.NotificationCompatBase */
public class NotificationCompatBase {

    /* renamed from: android.support.v4.app.NotificationCompatBase$Action */
    public static abstract class Action {

        /* renamed from: android.support.v4.app.NotificationCompatBase$Action$Factory */
        public interface Factory {
            Action build(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr);

            Action[] newArray(int i);
        }

        public abstract PendingIntent getActionIntent();

        public abstract Bundle getExtras();

        public abstract int getIcon();

        public abstract RemoteInput[] getRemoteInputs();

        public abstract CharSequence getTitle();
    }

    /* renamed from: android.support.v4.app.NotificationCompatBase$UnreadConversation */
    public static abstract class UnreadConversation {

        /* renamed from: android.support.v4.app.NotificationCompatBase$UnreadConversation$Factory */
        public interface Factory {
            UnreadConversation build(String[] strArr, RemoteInput remoteInput, PendingIntent pendingIntent, PendingIntent pendingIntent2, String[] strArr2, long j);
        }

        /* access modifiers changed from: 0000 */
        public abstract long getLatestTimestamp();

        /* access modifiers changed from: 0000 */
        public abstract String[] getMessages();

        /* access modifiers changed from: 0000 */
        public abstract String getParticipant();

        /* access modifiers changed from: 0000 */
        public abstract String[] getParticipants();

        /* access modifiers changed from: 0000 */
        public abstract PendingIntent getReadPendingIntent();

        /* access modifiers changed from: 0000 */
        public abstract RemoteInput getRemoteInput();

        /* access modifiers changed from: 0000 */
        public abstract PendingIntent getReplyPendingIntent();
    }

    public static Notification add(Notification notification, Context context, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
        notification.setLatestEventInfo(context, charSequence, charSequence2, pendingIntent);
        return notification;
    }
}
