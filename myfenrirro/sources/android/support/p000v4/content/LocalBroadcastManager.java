package android.support.p000v4.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: android.support.v4.content.LocalBroadcastManager */
public final class LocalBroadcastManager {
    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final String TAG = "LocalBroadcastManager";
    private static LocalBroadcastManager mInstance = null;
    private static final Object mLock = new Object();
    private final HashMap<String, ArrayList<ReceiverRecord>> mActions = new HashMap<>();
    private final Context mAppContext;
    private final Handler mHandler;
    private final ArrayList<BroadcastRecord> mPendingBroadcasts = new ArrayList<>();
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> mReceivers = new HashMap<>();

    /* renamed from: android.support.v4.content.LocalBroadcastManager$BroadcastRecord */
    static class BroadcastRecord {
        final Intent intent;
        final ArrayList<ReceiverRecord> receivers;

        BroadcastRecord(Intent intent2, ArrayList<ReceiverRecord> arrayList) {
            this.intent = intent2;
            this.receivers = arrayList;
        }
    }

    /* renamed from: android.support.v4.content.LocalBroadcastManager$ReceiverRecord */
    static class ReceiverRecord {
        boolean broadcasting;
        final IntentFilter filter;
        final BroadcastReceiver receiver;

        ReceiverRecord(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.filter = intentFilter;
            this.receiver = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.receiver);
            sb.append(" filter=");
            sb.append(this.filter);
            sb.append("}");
            return sb.toString();
        }
    }

    static {
    }

    public static LocalBroadcastManager getInstance(Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (mLock) {
            if (mInstance == null) {
                mInstance = new LocalBroadcastManager(context.getApplicationContext());
            }
            localBroadcastManager = mInstance;
        }
        return localBroadcastManager;
    }

    private LocalBroadcastManager(Context context) {
        this.mAppContext = context;
        this.mHandler = new Handler(context.getMainLooper()) {
            public void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        LocalBroadcastManager.this.executePendingBroadcasts();
                        return;
                    default:
                        super.handleMessage(message);
                        return;
                }
            }
        };
    }

    public final void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.mReceivers) {
            ReceiverRecord receiverRecord = new ReceiverRecord(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) this.mReceivers.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.mReceivers.put(broadcastReceiver, arrayList);
            }
            arrayList.add(intentFilter);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.mActions.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.mActions.put(action, arrayList2);
                }
                arrayList2.add(receiverRecord);
            }
        }
    }

    public final void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        synchronized (this.mReceivers) {
            ArrayList arrayList = (ArrayList) this.mReceivers.remove(broadcastReceiver);
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    IntentFilter intentFilter = (IntentFilter) arrayList.get(i);
                    for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                        String action = intentFilter.getAction(i2);
                        ArrayList arrayList2 = (ArrayList) this.mActions.get(action);
                        if (arrayList2 != null) {
                            int i3 = 0;
                            while (i3 < arrayList2.size()) {
                                if (((ReceiverRecord) arrayList2.get(i3)).receiver == broadcastReceiver) {
                                    arrayList2.remove(i3);
                                    i3--;
                                }
                                i3++;
                            }
                            if (arrayList2.size() <= 0) {
                                this.mActions.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010a, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean sendBroadcast(android.content.Intent r19) {
        /*
            r18 = this;
            r0 = r18
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.content.IntentFilter>> r7 = r0.mReceivers
            monitor-enter(r7)
            r0 = r19
            java.lang.String r8 = r0.getAction()     // Catch:{ all -> 0x010d }
            r0 = r18
            android.content.Context r0 = r0.mAppContext     // Catch:{ all -> 0x010d }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x010d }
            r1 = r19
            java.lang.String r9 = r1.resolveTypeIfNeeded(r0)     // Catch:{ all -> 0x010d }
            r0 = r19
            android.net.Uri r10 = r0.getData()     // Catch:{ all -> 0x010d }
            r0 = r19
            java.lang.String r11 = r0.getScheme()     // Catch:{ all -> 0x010d }
            r0 = r19
            java.util.Set r12 = r0.getCategories()     // Catch:{ all -> 0x010d }
            r0 = r19
            int r0 = r0.getFlags()     // Catch:{ all -> 0x010d }
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0037
            r13 = 1
            goto L_0x0038
        L_0x0037:
            r13 = 0
        L_0x0038:
            if (r13 == 0) goto L_0x005a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x010d }
            java.lang.String r1 = "Resolving type "
            r0.<init>(r1)     // Catch:{ all -> 0x010d }
            java.lang.StringBuilder r0 = r0.append(r9)     // Catch:{ all -> 0x010d }
            java.lang.String r1 = " scheme "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ all -> 0x010d }
            java.lang.StringBuilder r0 = r0.append(r11)     // Catch:{ all -> 0x010d }
            java.lang.String r1 = " of intent "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ all -> 0x010d }
            r1 = r19
            r0.append(r1)     // Catch:{ all -> 0x010d }
        L_0x005a:
            r0 = r18
            java.util.HashMap<java.lang.String, java.util.ArrayList<android.support.v4.content.LocalBroadcastManager$ReceiverRecord>> r0 = r0.mActions     // Catch:{ all -> 0x010d }
            r1 = r19
            java.lang.String r1 = r1.getAction()     // Catch:{ all -> 0x010d }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x010d }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x010d }
            r14 = r0
            if (r14 == 0) goto L_0x010b
            if (r13 == 0) goto L_0x0079
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x010d }
            java.lang.String r1 = "Action list: "
            r0.<init>(r1)     // Catch:{ all -> 0x010d }
            r0.append(r14)     // Catch:{ all -> 0x010d }
        L_0x0079:
            r15 = 0
            r16 = 0
        L_0x007c:
            int r0 = r14.size()     // Catch:{ all -> 0x010d }
            r1 = r16
            if (r1 >= r0) goto L_0x00cd
            r0 = r16
            java.lang.Object r0 = r14.get(r0)     // Catch:{ all -> 0x010d }
            android.support.v4.content.LocalBroadcastManager$ReceiverRecord r0 = (android.support.p000v4.content.LocalBroadcastManager.ReceiverRecord) r0     // Catch:{ all -> 0x010d }
            r17 = r0
            if (r13 == 0) goto L_0x009e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x010d }
            java.lang.String r1 = "Matching against filter "
            r0.<init>(r1)     // Catch:{ all -> 0x010d }
            r1 = r17
            android.content.IntentFilter r1 = r1.filter     // Catch:{ all -> 0x010d }
            r0.append(r1)     // Catch:{ all -> 0x010d }
        L_0x009e:
            r0 = r17
            boolean r0 = r0.broadcasting     // Catch:{ all -> 0x010d }
            if (r0 == 0) goto L_0x00a7
            if (r13 == 0) goto L_0x00c9
            goto L_0x00c9
        L_0x00a7:
            r0 = r17
            android.content.IntentFilter r0 = r0.filter     // Catch:{ all -> 0x010d }
            r1 = r8
            r2 = r9
            r3 = r11
            r4 = r10
            r5 = r12
            java.lang.String r6 = "LocalBroadcastManager"
            int r0 = r0.match(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x010d }
            if (r0 < 0) goto L_0x00c9
            if (r15 != 0) goto L_0x00bf
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x010d }
            r15.<init>()     // Catch:{ all -> 0x010d }
        L_0x00bf:
            r0 = r17
            r15.add(r0)     // Catch:{ all -> 0x010d }
            r0 = 1
            r1 = r17
            r1.broadcasting = r0     // Catch:{ all -> 0x010d }
        L_0x00c9:
            int r16 = r16 + 1
            goto L_0x007c
        L_0x00cd:
            if (r15 == 0) goto L_0x010b
            r16 = 0
        L_0x00d1:
            int r0 = r15.size()     // Catch:{ all -> 0x010d }
            r1 = r16
            if (r1 >= r0) goto L_0x00e7
            r0 = r16
            java.lang.Object r0 = r15.get(r0)     // Catch:{ all -> 0x010d }
            android.support.v4.content.LocalBroadcastManager$ReceiverRecord r0 = (android.support.p000v4.content.LocalBroadcastManager.ReceiverRecord) r0     // Catch:{ all -> 0x010d }
            r1 = 0
            r0.broadcasting = r1     // Catch:{ all -> 0x010d }
            int r16 = r16 + 1
            goto L_0x00d1
        L_0x00e7:
            r0 = r18
            java.util.ArrayList<android.support.v4.content.LocalBroadcastManager$BroadcastRecord> r0 = r0.mPendingBroadcasts     // Catch:{ all -> 0x010d }
            android.support.v4.content.LocalBroadcastManager$BroadcastRecord r1 = new android.support.v4.content.LocalBroadcastManager$BroadcastRecord     // Catch:{ all -> 0x010d }
            r2 = r19
            r1.<init>(r2, r15)     // Catch:{ all -> 0x010d }
            r0.add(r1)     // Catch:{ all -> 0x010d }
            r0 = r18
            android.os.Handler r0 = r0.mHandler     // Catch:{ all -> 0x010d }
            r1 = 1
            boolean r0 = r0.hasMessages(r1)     // Catch:{ all -> 0x010d }
            if (r0 != 0) goto L_0x0108
            r0 = r18
            android.os.Handler r0 = r0.mHandler     // Catch:{ all -> 0x010d }
            r1 = 1
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x010d }
        L_0x0108:
            monitor-exit(r7)     // Catch:{ all -> 0x010d }
            r0 = 1
            return r0
        L_0x010b:
            monitor-exit(r7)     // Catch:{ all -> 0x010d }
            goto L_0x0110
        L_0x010d:
            r19 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x010d }
            throw r19
        L_0x0110:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.content.LocalBroadcastManager.sendBroadcast(android.content.Intent):boolean");
    }

    public final void sendBroadcastSync(Intent intent) {
        if (sendBroadcast(intent)) {
            executePendingBroadcasts();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        if (r4 >= r3.length) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        r5 = r3[r4];
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        if (r6 >= r5.receivers.size()) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        ((android.support.p000v4.content.LocalBroadcastManager.ReceiverRecord) r5.receivers.get(r6)).receiver.onReceive(r7.mAppContext, r5.intent);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r4 = r4 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executePendingBroadcasts() {
        /*
            r7 = this;
        L_0x0000:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.content.IntentFilter>> r4 = r7.mReceivers
            monitor-enter(r4)
            java.util.ArrayList<android.support.v4.content.LocalBroadcastManager$BroadcastRecord> r0 = r7.mPendingBroadcasts     // Catch:{ all -> 0x001b }
            int r5 = r0.size()     // Catch:{ all -> 0x001b }
            if (r5 > 0) goto L_0x000d
            monitor-exit(r4)     // Catch:{ all -> 0x001b }
            return
        L_0x000d:
            android.support.v4.content.LocalBroadcastManager$BroadcastRecord[] r3 = new android.support.p000v4.content.LocalBroadcastManager.BroadcastRecord[r5]     // Catch:{ all -> 0x001b }
            java.util.ArrayList<android.support.v4.content.LocalBroadcastManager$BroadcastRecord> r0 = r7.mPendingBroadcasts     // Catch:{ all -> 0x001b }
            r0.toArray(r3)     // Catch:{ all -> 0x001b }
            java.util.ArrayList<android.support.v4.content.LocalBroadcastManager$BroadcastRecord> r0 = r7.mPendingBroadcasts     // Catch:{ all -> 0x001b }
            r0.clear()     // Catch:{ all -> 0x001b }
            monitor-exit(r4)     // Catch:{ all -> 0x001b }
            goto L_0x001e
        L_0x001b:
            r6 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x001b }
            throw r6
        L_0x001e:
            r4 = 0
        L_0x001f:
            int r0 = r3.length
            if (r4 >= r0) goto L_0x0044
            r5 = r3[r4]
            r6 = 0
        L_0x0025:
            java.util.ArrayList<android.support.v4.content.LocalBroadcastManager$ReceiverRecord> r0 = r5.receivers
            int r0 = r0.size()
            if (r6 >= r0) goto L_0x0041
            java.util.ArrayList<android.support.v4.content.LocalBroadcastManager$ReceiverRecord> r0 = r5.receivers
            java.lang.Object r0 = r0.get(r6)
            android.support.v4.content.LocalBroadcastManager$ReceiverRecord r0 = (android.support.p000v4.content.LocalBroadcastManager.ReceiverRecord) r0
            android.content.BroadcastReceiver r0 = r0.receiver
            android.content.Context r1 = r7.mAppContext
            android.content.Intent r2 = r5.intent
            r0.onReceive(r1, r2)
            int r6 = r6 + 1
            goto L_0x0025
        L_0x0041:
            int r4 = r4 + 1
            goto L_0x001f
        L_0x0044:
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.content.LocalBroadcastManager.executePendingBroadcasts():void");
    }
}
