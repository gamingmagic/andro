package android.support.p000v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.support.p000v4.app.BundleCompat;
import android.support.p000v4.media.session.MediaSessionCompat;
import android.support.p000v4.media.session.MediaSessionCompat.Token;
import android.support.p000v4.p002os.ResultReceiver;
import android.support.p000v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {
    public static final String EXTRA_PAGE = "android.media.browse.extra.PAGE";
    public static final String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
    private static final String TAG = "MediaBrowserCompat";
    private final MediaBrowserImpl mImpl;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CallbackHandler */
    static class CallbackHandler extends Handler {
        private final MediaBrowserServiceCallbackImpl mCallbackImpl;
        private WeakReference<Messenger> mCallbacksMessengerRef;

        CallbackHandler(MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl) {
            this.mCallbackImpl = mediaBrowserServiceCallbackImpl;
        }

        public void handleMessage(Message message) {
            if (this.mCallbacksMessengerRef != null) {
                Bundle data = message.getData();
                data.setClassLoader(MediaSessionCompat.class.getClassLoader());
                switch (message.what) {
                    case 1:
                        this.mCallbackImpl.onServiceConnected((Messenger) this.mCallbacksMessengerRef.get(), data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), (Token) data.getParcelable(MediaBrowserProtocol.DATA_MEDIA_SESSION_TOKEN), data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS));
                        return;
                    case 2:
                        this.mCallbackImpl.onConnectionFailed((Messenger) this.mCallbacksMessengerRef.get());
                        return;
                    case 3:
                        this.mCallbackImpl.onLoadChildren((Messenger) this.mCallbacksMessengerRef.get(), data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), data.getParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST), data.getBundle(MediaBrowserProtocol.DATA_OPTIONS));
                        return;
                    default:
                        new StringBuilder("Unhandled message: ").append(message).append("\n  Client version: 1\n  Service version: ").append(message.arg1);
                        return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void setCallbacksMessenger(Messenger messenger) {
            this.mCallbacksMessengerRef = new WeakReference<>(messenger);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ConnectionCallback */
    public static class ConnectionCallback {
        /* access modifiers changed from: private */
        public ConnectionCallbackInternal mConnectionCallbackInternal;
        final Object mConnectionCallbackObj;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$ConnectionCallback$ConnectionCallbackInternal */
        interface ConnectionCallbackInternal {
            void onConnected();

            void onConnectionFailed();

            void onConnectionSuspended();
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$ConnectionCallback$StubApi21 */
        class StubApi21 implements ConnectionCallback {
            private StubApi21() {
            }

            public void onConnected() {
                if (ConnectionCallback.this.mConnectionCallbackInternal != null) {
                    ConnectionCallback.this.mConnectionCallbackInternal.onConnected();
                }
                ConnectionCallback.this.onConnected();
            }

            public void onConnectionSuspended() {
                if (ConnectionCallback.this.mConnectionCallbackInternal != null) {
                    ConnectionCallback.this.mConnectionCallbackInternal.onConnectionSuspended();
                }
                ConnectionCallback.this.onConnectionSuspended();
            }

            public void onConnectionFailed() {
                if (ConnectionCallback.this.mConnectionCallbackInternal != null) {
                    ConnectionCallback.this.mConnectionCallbackInternal.onConnectionFailed();
                }
                ConnectionCallback.this.onConnectionFailed();
            }
        }

        public ConnectionCallback() {
            if (VERSION.SDK_INT >= 21) {
                this.mConnectionCallbackObj = MediaBrowserCompatApi21.createConnectionCallback(new StubApi21());
            } else {
                this.mConnectionCallbackObj = null;
            }
        }

        public void onConnected() {
        }

        public void onConnectionSuspended() {
        }

        public void onConnectionFailed() {
        }

        /* access modifiers changed from: 0000 */
        public void setInternalConnectionCallback(ConnectionCallbackInternal connectionCallbackInternal) {
            this.mConnectionCallbackInternal = connectionCallbackInternal;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemCallback */
    public static abstract class ItemCallback {
        final Object mItemCallbackObj;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemCallback$StubApi23 */
        class StubApi23 implements ItemCallback {
            private StubApi23() {
            }

            public void onItemLoaded(Parcel parcel) {
                parcel.setDataPosition(0);
                MediaItem mediaItem = (MediaItem) MediaItem.CREATOR.createFromParcel(parcel);
                parcel.recycle();
                ItemCallback.this.onItemLoaded(mediaItem);
            }

            public void onError(String str) {
                ItemCallback.this.onError(str);
            }
        }

        public ItemCallback() {
            if (VERSION.SDK_INT >= 23) {
                this.mItemCallbackObj = MediaBrowserCompatApi23.createItemCallback(new StubApi23());
            } else {
                this.mItemCallbackObj = null;
            }
        }

        public void onItemLoaded(MediaItem mediaItem) {
        }

        public void onError(String str) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    static class ItemReceiver extends ResultReceiver {
        private final ItemCallback mCallback;
        private final String mMediaId;

        ItemReceiver(String str, ItemCallback itemCallback, Handler handler) {
            super(handler);
            this.mMediaId = str;
            this.mCallback = itemCallback;
        }

        /* access modifiers changed from: protected */
        public void onReceiveResult(int i, Bundle bundle) {
            bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
                this.mCallback.onError(this.mMediaId);
                return;
            }
            Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM);
            if (parcelable instanceof MediaItem) {
                this.mCallback.onItemLoaded((MediaItem) parcelable);
            } else {
                this.mCallback.onError(this.mMediaId);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImpl */
    interface MediaBrowserImpl {
        void connect();

        void disconnect();

        Bundle getExtras();

        void getItem(String str, ItemCallback itemCallback);

        String getRoot();

        ComponentName getServiceComponent();

        Token getSessionToken();

        boolean isConnected();

        void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback);

        void unsubscribe(String str, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21 */
    static class MediaBrowserImplApi21 implements ConnectionCallbackInternal, MediaBrowserImpl, MediaBrowserServiceCallbackImpl {
        private static final boolean DBG = false;
        protected Object mBrowserObj;
        private Messenger mCallbacksMessenger;
        private final CallbackHandler mHandler = new CallbackHandler(this);
        private ServiceBinderWrapper mServiceBinderWrapper;
        private final ComponentName mServiceComponent;
        private final ArrayMap<String, Subscription> mSubscriptions = new ArrayMap<>();

        public MediaBrowserImplApi21(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            this.mServiceComponent = componentName;
            connectionCallback.setInternalConnectionCallback(this);
            this.mBrowserObj = MediaBrowserCompatApi21.createBrowser(context, componentName, connectionCallback.mConnectionCallbackObj, bundle);
        }

        public void connect() {
            MediaBrowserCompatApi21.connect(this.mBrowserObj);
        }

        public void disconnect() {
            MediaBrowserCompatApi21.disconnect(this.mBrowserObj);
        }

        public boolean isConnected() {
            return MediaBrowserCompatApi21.isConnected(this.mBrowserObj);
        }

        public ComponentName getServiceComponent() {
            return MediaBrowserCompatApi21.getServiceComponent(this.mBrowserObj);
        }

        public String getRoot() {
            return MediaBrowserCompatApi21.getRoot(this.mBrowserObj);
        }

        public Bundle getExtras() {
            return MediaBrowserCompatApi21.getExtras(this.mBrowserObj);
        }

        public Token getSessionToken() {
            return Token.fromToken(MediaBrowserCompatApi21.getSessionToken(this.mBrowserObj));
        }

        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            SubscriptionCallbackApi21 subscriptionCallbackApi21 = new SubscriptionCallbackApi21(subscriptionCallback, bundle);
            Subscription subscription = (Subscription) this.mSubscriptions.get(str);
            if (subscription == null) {
                subscription = new Subscription();
                this.mSubscriptions.put(str, subscription);
            }
            subscription.setCallbackForOptions(subscriptionCallbackApi21, bundle);
            if (MediaBrowserCompatApi21.isConnected(this.mBrowserObj)) {
                if (bundle == null || this.mServiceBinderWrapper == null) {
                    MediaBrowserCompatApi21.subscribe(this.mBrowserObj, str, subscriptionCallbackApi21.mSubscriptionCallbackObj);
                } else {
                    try {
                        this.mServiceBinderWrapper.addSubscription(str, bundle, this.mCallbacksMessenger);
                    } catch (RemoteException unused) {
                    }
                }
            }
        }

        public void unsubscribe(String str, Bundle bundle) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("parentId is empty.");
            }
            Subscription subscription = (Subscription) this.mSubscriptions.get(str);
            if (subscription != null && subscription.remove(bundle)) {
                if (bundle == null || this.mServiceBinderWrapper == null) {
                    if (this.mServiceBinderWrapper != null || subscription.isEmpty()) {
                        MediaBrowserCompatApi21.unsubscribe(this.mBrowserObj, str);
                    }
                } else if (this.mServiceBinderWrapper == null) {
                    try {
                        this.mServiceBinderWrapper.removeSubscription(str, bundle, this.mCallbacksMessenger);
                    } catch (RemoteException unused) {
                    }
                }
            }
            if (subscription != null && subscription.isEmpty()) {
                this.mSubscriptions.remove(str);
            }
        }

        public void getItem(final String str, final ItemCallback itemCallback) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty.");
            } else if (itemCallback == null) {
                throw new IllegalArgumentException("cb is null.");
            } else if (!MediaBrowserCompatApi21.isConnected(this.mBrowserObj)) {
                this.mHandler.post(new Runnable() {
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
            } else if (this.mServiceBinderWrapper == null) {
                this.mHandler.post(new Runnable() {
                    public void run() {
                        itemCallback.onItemLoaded(null);
                    }
                });
            } else {
                try {
                    this.mServiceBinderWrapper.getMediaItem(str, new ItemReceiver(str, itemCallback, this.mHandler));
                } catch (RemoteException unused) {
                    this.mHandler.post(new Runnable() {
                        public void run() {
                            itemCallback.onError(str);
                        }
                    });
                }
            }
        }

        public void onConnected() {
            Bundle extras = MediaBrowserCompatApi21.getExtras(this.mBrowserObj);
            if (extras != null) {
                IBinder binder = BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_MESSENGER_BINDER);
                if (binder != null) {
                    this.mServiceBinderWrapper = new ServiceBinderWrapper(binder);
                    this.mCallbacksMessenger = new Messenger(this.mHandler);
                    this.mHandler.setCallbacksMessenger(this.mCallbacksMessenger);
                    try {
                        this.mServiceBinderWrapper.registerCallbackMessenger(this.mCallbacksMessenger);
                    } catch (RemoteException unused) {
                    }
                    onServiceConnected(this.mCallbacksMessenger, null, null, null);
                }
            }
        }

        public void onConnectionSuspended() {
            this.mServiceBinderWrapper = null;
            this.mCallbacksMessenger = null;
        }

        public void onConnectionFailed() {
        }

        public void onServiceConnected(Messenger messenger, String str, Token token, Bundle bundle) {
            for (Entry entry : this.mSubscriptions.entrySet()) {
                String str2 = (String) entry.getKey();
                Subscription subscription = (Subscription) entry.getValue();
                List optionsList = subscription.getOptionsList();
                List callbacks = subscription.getCallbacks();
                for (int i = 0; i < optionsList.size(); i++) {
                    if (optionsList.get(i) == null) {
                        MediaBrowserCompatApi21.subscribe(this.mBrowserObj, str2, ((SubscriptionCallbackApi21) callbacks.get(i)).mSubscriptionCallbackObj);
                    } else {
                        try {
                            this.mServiceBinderWrapper.addSubscription(str2, (Bundle) optionsList.get(i), this.mCallbacksMessenger);
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }
        }

        public void onConnectionFailed(Messenger messenger) {
        }

        public void onLoadChildren(Messenger messenger, String str, List list, Bundle bundle) {
            if (this.mCallbacksMessenger == messenger) {
                List list2 = list;
                Subscription subscription = (Subscription) this.mSubscriptions.get(str);
                if (subscription != null) {
                    subscription.getCallback(bundle).onChildrenLoaded(str, list2, bundle);
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi23 */
    static class MediaBrowserImplApi23 extends MediaBrowserImplApi21 {
        public MediaBrowserImplApi23(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }

        public void getItem(String str, ItemCallback itemCallback) {
            MediaBrowserCompatApi23.getItem(this.mBrowserObj, str, itemCallback.mItemCallbackObj);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserServiceCallbackImpl */
    interface MediaBrowserServiceCallbackImpl {
        void onConnectionFailed(Messenger messenger);

        void onLoadChildren(Messenger messenger, String str, List list, Bundle bundle);

        void onServiceConnected(Messenger messenger, String str, Token token, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserServiceImplBase */
    static class MediaBrowserServiceImplBase implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl {
        private static final int CONNECT_STATE_CONNECTED = 2;
        private static final int CONNECT_STATE_CONNECTING = 1;
        private static final int CONNECT_STATE_DISCONNECTED = 0;
        private static final int CONNECT_STATE_SUSPENDED = 3;
        private static final boolean DBG = false;
        /* access modifiers changed from: private */
        public final ConnectionCallback mCallback;
        /* access modifiers changed from: private */
        public Messenger mCallbacksMessenger;
        /* access modifiers changed from: private */
        public final Context mContext;
        private Bundle mExtras;
        /* access modifiers changed from: private */
        public final CallbackHandler mHandler = new CallbackHandler(this);
        private Token mMediaSessionToken;
        /* access modifiers changed from: private */
        public final Bundle mRootHints;
        private String mRootId;
        /* access modifiers changed from: private */
        public ServiceBinderWrapper mServiceBinderWrapper;
        /* access modifiers changed from: private */
        public final ComponentName mServiceComponent;
        /* access modifiers changed from: private */
        public MediaServiceConnection mServiceConnection;
        /* access modifiers changed from: private */
        public int mState = 0;
        private final ArrayMap<String, Subscription> mSubscriptions = new ArrayMap<>();

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserServiceImplBase$MediaServiceConnection */
        class MediaServiceConnection implements ServiceConnection {
            private MediaServiceConnection() {
            }

            public void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
                postOrRun(new Runnable() {
                    public void run() {
                        if (MediaServiceConnection.this.isCurrent("onServiceConnected")) {
                            MediaBrowserServiceImplBase.this.mServiceBinderWrapper = new ServiceBinderWrapper(iBinder);
                            MediaBrowserServiceImplBase.this.mCallbacksMessenger = new Messenger(MediaBrowserServiceImplBase.this.mHandler);
                            MediaBrowserServiceImplBase.this.mHandler.setCallbacksMessenger(MediaBrowserServiceImplBase.this.mCallbacksMessenger);
                            MediaBrowserServiceImplBase.this.mState = 1;
                            try {
                                MediaBrowserServiceImplBase.this.mServiceBinderWrapper.connect(MediaBrowserServiceImplBase.this.mContext, MediaBrowserServiceImplBase.this.mRootHints, MediaBrowserServiceImplBase.this.mCallbacksMessenger);
                            } catch (RemoteException unused) {
                                new StringBuilder("RemoteException during connect for ").append(MediaBrowserServiceImplBase.this.mServiceComponent);
                            }
                        }
                    }
                });
            }

            public void onServiceDisconnected(final ComponentName componentName) {
                postOrRun(new Runnable() {
                    public void run() {
                        if (MediaServiceConnection.this.isCurrent("onServiceDisconnected")) {
                            MediaBrowserServiceImplBase.this.mServiceBinderWrapper = null;
                            MediaBrowserServiceImplBase.this.mCallbacksMessenger = null;
                            MediaBrowserServiceImplBase.this.mHandler.setCallbacksMessenger(null);
                            MediaBrowserServiceImplBase.this.mState = 3;
                            MediaBrowserServiceImplBase.this.mCallback.onConnectionSuspended();
                        }
                    }
                });
            }

            private void postOrRun(Runnable runnable) {
                if (Thread.currentThread() == MediaBrowserServiceImplBase.this.mHandler.getLooper().getThread()) {
                    runnable.run();
                } else {
                    MediaBrowserServiceImplBase.this.mHandler.post(runnable);
                }
            }

            /* access modifiers changed from: private */
            public boolean isCurrent(String str) {
                if (MediaBrowserServiceImplBase.this.mServiceConnection == this) {
                    return true;
                }
                if (MediaBrowserServiceImplBase.this.mState != 0) {
                    new StringBuilder().append(str).append(" for ").append(MediaBrowserServiceImplBase.this.mServiceComponent).append(" with mServiceConnection=").append(MediaBrowserServiceImplBase.this.mServiceConnection).append(" this=").append(this);
                }
                return MediaBrowserServiceImplBase.DBG;
            }
        }

        public MediaBrowserServiceImplBase(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (connectionCallback == null) {
                throw new IllegalArgumentException("connection callback must not be null");
            } else {
                this.mContext = context;
                this.mServiceComponent = componentName;
                this.mCallback = connectionCallback;
                this.mRootHints = bundle;
            }
        }

        public void connect() {
            if (this.mState != 0) {
                throw new IllegalStateException("connect() called while not disconnected (state=" + getStateLabel(this.mState) + ")");
            } else if (this.mServiceBinderWrapper != null) {
                throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + this.mServiceBinderWrapper);
            } else if (this.mCallbacksMessenger != null) {
                throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + this.mCallbacksMessenger);
            } else {
                this.mState = 1;
                Intent intent = new Intent(MediaBrowserServiceCompat.SERVICE_INTERFACE);
                intent.setComponent(this.mServiceComponent);
                final MediaServiceConnection mediaServiceConnection = new MediaServiceConnection();
                this.mServiceConnection = mediaServiceConnection;
                boolean z = DBG;
                try {
                    z = this.mContext.bindService(intent, this.mServiceConnection, 1);
                } catch (Exception unused) {
                    Log.e(MediaBrowserCompat.TAG, "Failed binding to service " + this.mServiceComponent);
                }
                if (!z) {
                    this.mHandler.post(new Runnable() {
                        public void run() {
                            if (mediaServiceConnection == MediaBrowserServiceImplBase.this.mServiceConnection) {
                                MediaBrowserServiceImplBase.this.forceCloseConnection();
                                MediaBrowserServiceImplBase.this.mCallback.onConnectionFailed();
                            }
                        }
                    });
                }
            }
        }

        public void disconnect() {
            if (this.mCallbacksMessenger != null) {
                try {
                    this.mServiceBinderWrapper.disconnect(this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                    new StringBuilder("RemoteException during connect for ").append(this.mServiceComponent);
                }
            }
            forceCloseConnection();
        }

        /* access modifiers changed from: private */
        public void forceCloseConnection() {
            if (this.mServiceConnection != null) {
                this.mContext.unbindService(this.mServiceConnection);
            }
            this.mState = 0;
            this.mServiceConnection = null;
            this.mServiceBinderWrapper = null;
            this.mCallbacksMessenger = null;
            this.mRootId = null;
            this.mMediaSessionToken = null;
        }

        public boolean isConnected() {
            if (this.mState == 2) {
                return true;
            }
            return DBG;
        }

        public ComponentName getServiceComponent() {
            if (isConnected()) {
                return this.mServiceComponent;
            }
            throw new IllegalStateException("getServiceComponent() called while not connected (state=" + this.mState + ")");
        }

        public String getRoot() {
            if (isConnected()) {
                return this.mRootId;
            }
            throw new IllegalStateException("getRoot() called while not connected(state=" + getStateLabel(this.mState) + ")");
        }

        public Bundle getExtras() {
            if (isConnected()) {
                return this.mExtras;
            }
            throw new IllegalStateException("getExtras() called while not connected (state=" + getStateLabel(this.mState) + ")");
        }

        public Token getSessionToken() {
            if (isConnected()) {
                return this.mMediaSessionToken;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.mState + ")");
        }

        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("parentId is empty.");
            } else if (subscriptionCallback == null) {
                throw new IllegalArgumentException("callback is null");
            } else {
                Subscription subscription = (Subscription) this.mSubscriptions.get(str);
                if (subscription == null) {
                    subscription = new Subscription();
                    this.mSubscriptions.put(str, subscription);
                }
                subscription.setCallbackForOptions(subscriptionCallback, bundle);
                if (this.mState == 2) {
                    try {
                        this.mServiceBinderWrapper.addSubscription(str, bundle, this.mCallbacksMessenger);
                    } catch (RemoteException unused) {
                    }
                }
            }
        }

        public void unsubscribe(String str, Bundle bundle) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("parentId is empty.");
            }
            Subscription subscription = (Subscription) this.mSubscriptions.get(str);
            if (subscription != null && subscription.remove(bundle) && this.mState == 2) {
                try {
                    this.mServiceBinderWrapper.removeSubscription(str, bundle, this.mCallbacksMessenger);
                } catch (RemoteException unused) {
                }
            }
            if (subscription != null && subscription.isEmpty()) {
                this.mSubscriptions.remove(str);
            }
        }

        public void getItem(final String str, final ItemCallback itemCallback) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty.");
            } else if (itemCallback == null) {
                throw new IllegalArgumentException("cb is null.");
            } else if (this.mState != 2) {
                this.mHandler.post(new Runnable() {
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
            } else {
                try {
                    this.mServiceBinderWrapper.getMediaItem(str, new ItemReceiver(str, itemCallback, this.mHandler));
                } catch (RemoteException unused) {
                    this.mHandler.post(new Runnable() {
                        public void run() {
                            itemCallback.onError(str);
                        }
                    });
                }
            }
        }

        public void onServiceConnected(Messenger messenger, String str, Token token, Bundle bundle) {
            if (isCurrent(messenger, "onConnect")) {
                if (this.mState != 1) {
                    getStateLabel(this.mState);
                    return;
                }
                this.mRootId = str;
                this.mMediaSessionToken = token;
                this.mExtras = bundle;
                this.mState = 2;
                this.mCallback.onConnected();
                try {
                    for (Entry entry : this.mSubscriptions.entrySet()) {
                        String str2 = (String) entry.getKey();
                        for (Bundle addSubscription : ((Subscription) entry.getValue()).getOptionsList()) {
                            this.mServiceBinderWrapper.addSubscription(str2, addSubscription, this.mCallbacksMessenger);
                        }
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        public void onConnectionFailed(Messenger messenger) {
            Log.e(MediaBrowserCompat.TAG, "onConnectFailed for " + this.mServiceComponent);
            if (isCurrent(messenger, "onConnectFailed")) {
                if (this.mState != 1) {
                    getStateLabel(this.mState);
                    return;
                }
                forceCloseConnection();
                this.mCallback.onConnectionFailed();
            }
        }

        public void onLoadChildren(Messenger messenger, String str, List list, Bundle bundle) {
            if (isCurrent(messenger, "onLoadChildren")) {
                List list2 = list;
                Subscription subscription = (Subscription) this.mSubscriptions.get(str);
                if (subscription != null) {
                    SubscriptionCallback callback = subscription.getCallback(bundle);
                    if (callback != null) {
                        if (bundle == null) {
                            callback.onChildrenLoaded(str, list2);
                            return;
                        }
                        callback.onChildrenLoaded(str, list2, bundle);
                    }
                }
            }
        }

        private static String getStateLabel(int i) {
            switch (i) {
                case 0:
                    return "CONNECT_STATE_DISCONNECTED";
                case 1:
                    return "CONNECT_STATE_CONNECTING";
                case 2:
                    return "CONNECT_STATE_CONNECTED";
                case 3:
                    return "CONNECT_STATE_SUSPENDED";
                default:
                    return "UNKNOWN/" + i;
            }
        }

        private boolean isCurrent(Messenger messenger, String str) {
            if (this.mCallbacksMessenger == messenger) {
                return true;
            }
            if (this.mState != 0) {
                new StringBuilder().append(str).append(" for ").append(this.mServiceComponent).append(" with mCallbacksMessenger=").append(this.mCallbacksMessenger).append(" this=").append(this);
            }
            return DBG;
        }

        /* access modifiers changed from: 0000 */
        public void dump() {
            new StringBuilder("  mServiceComponent=").append(this.mServiceComponent);
            new StringBuilder("  mCallback=").append(this.mCallback);
            new StringBuilder("  mRootHints=").append(this.mRootHints);
            getStateLabel(this.mState);
            new StringBuilder("  mServiceConnection=").append(this.mServiceConnection);
            new StringBuilder("  mServiceBinderWrapper=").append(this.mServiceBinderWrapper);
            new StringBuilder("  mCallbacksMessenger=").append(this.mCallbacksMessenger);
            new StringBuilder("  mMediaSessionToken=").append(this.mMediaSessionToken);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Creator<MediaItem> CREATOR = new Creator<MediaItem>() {
            public final MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            public final MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;
        private final MediaDescriptionCompat mDescription;
        private final int mFlags;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$Flags */
        public @interface Flags {
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (TextUtils.isEmpty(mediaDescriptionCompat.getMediaId())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            } else {
                this.mFlags = i;
                this.mDescription = mediaDescriptionCompat;
            }
        }

        private MediaItem(Parcel parcel) {
            this.mFlags = parcel.readInt();
            this.mDescription = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mFlags);
            this.mDescription.writeToParcel(parcel, i);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=").append(this.mFlags);
            sb.append(", mDescription=").append(this.mDescription);
            sb.append('}');
            return sb.toString();
        }

        static {
        }

        public int getFlags() {
            return this.mFlags;
        }

        public boolean isBrowsable() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isPlayable() {
            return (this.mFlags & 2) != 0;
        }

        public MediaDescriptionCompat getDescription() {
            return this.mDescription;
        }

        public String getMediaId() {
            return this.mDescription.getMediaId();
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ServiceBinderWrapper */
    static class ServiceBinderWrapper {
        private Messenger mMessenger;

        public ServiceBinderWrapper(IBinder iBinder) {
            this.mMessenger = new Messenger(iBinder);
        }

        /* access modifiers changed from: 0000 */
        public void connect(Context context, Bundle bundle, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
            bundle2.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, bundle);
            sendRequest(1, bundle2, messenger);
        }

        /* access modifiers changed from: 0000 */
        public void disconnect(Messenger messenger) {
            sendRequest(2, null, messenger);
        }

        /* access modifiers changed from: 0000 */
        public void addSubscription(String str, Bundle bundle, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle2.putBundle(MediaBrowserProtocol.DATA_OPTIONS, bundle);
            sendRequest(3, bundle2, messenger);
        }

        /* access modifiers changed from: 0000 */
        public void removeSubscription(String str, Bundle bundle, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle2.putBundle(MediaBrowserProtocol.DATA_OPTIONS, bundle);
            sendRequest(4, bundle2, messenger);
        }

        /* access modifiers changed from: 0000 */
        public void getMediaItem(String str, ResultReceiver resultReceiver) {
            Bundle bundle = new Bundle();
            bundle.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle.putParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER, resultReceiver);
            sendRequest(5, bundle, null);
        }

        /* access modifiers changed from: 0000 */
        public void registerCallbackMessenger(Messenger messenger) {
            sendRequest(6, null, messenger);
        }

        private void sendRequest(int i, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.mMessenger.send(obtain);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$Subscription */
    static class Subscription {
        private final List<SubscriptionCallback> mCallbacks = new ArrayList();
        private final List<Bundle> mOptionsList = new ArrayList();

        public boolean isEmpty() {
            return this.mCallbacks.isEmpty();
        }

        public List<Bundle> getOptionsList() {
            return this.mOptionsList;
        }

        public List<SubscriptionCallback> getCallbacks() {
            return this.mCallbacks;
        }

        public void setCallbackForOptions(SubscriptionCallback subscriptionCallback, Bundle bundle) {
            for (int i = 0; i < this.mOptionsList.size(); i++) {
                if (MediaBrowserCompatUtils.areSameOptions((Bundle) this.mOptionsList.get(i), bundle)) {
                    this.mCallbacks.set(i, subscriptionCallback);
                    return;
                }
            }
            this.mCallbacks.add(subscriptionCallback);
            this.mOptionsList.add(bundle);
        }

        public boolean remove(Bundle bundle) {
            for (int i = 0; i < this.mOptionsList.size(); i++) {
                if (MediaBrowserCompatUtils.areSameOptions((Bundle) this.mOptionsList.get(i), bundle)) {
                    this.mCallbacks.remove(i);
                    this.mOptionsList.remove(i);
                    return true;
                }
            }
            return false;
        }

        public SubscriptionCallback getCallback(Bundle bundle) {
            for (int i = 0; i < this.mOptionsList.size(); i++) {
                if (MediaBrowserCompatUtils.areSameOptions((Bundle) this.mOptionsList.get(i), bundle)) {
                    return (SubscriptionCallback) this.mCallbacks.get(i);
                }
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SubscriptionCallback */
    public static abstract class SubscriptionCallback {
        public void onChildrenLoaded(String str, List<MediaItem> list) {
        }

        public void onChildrenLoaded(String str, List<MediaItem> list, Bundle bundle) {
        }

        public void onError(String str) {
        }

        public void onError(String str, Bundle bundle) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SubscriptionCallbackApi21 */
    static class SubscriptionCallbackApi21 extends SubscriptionCallback {
        /* access modifiers changed from: private */
        public Bundle mOptions;
        SubscriptionCallback mSubscriptionCallback;
        /* access modifiers changed from: private */
        public final Object mSubscriptionCallbackObj = MediaBrowserCompatApi21.createSubscriptionCallback(new StubApi21());

        /* renamed from: android.support.v4.media.MediaBrowserCompat$SubscriptionCallbackApi21$StubApi21 */
        class StubApi21 implements SubscriptionCallback {
            private StubApi21() {
            }

            public void onChildrenLoaded(String str, List<Parcel> list) {
                ArrayList arrayList = null;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Parcel parcel : list) {
                        parcel.setDataPosition(0);
                        arrayList.add(MediaItem.CREATOR.createFromParcel(parcel));
                        parcel.recycle();
                    }
                }
                if (SubscriptionCallbackApi21.this.mOptions != null) {
                    SubscriptionCallbackApi21.this.onChildrenLoaded(str, MediaBrowserCompatUtils.applyOptions(arrayList, SubscriptionCallbackApi21.this.mOptions), SubscriptionCallbackApi21.this.mOptions);
                } else {
                    SubscriptionCallbackApi21.this.onChildrenLoaded(str, arrayList);
                }
            }

            public void onError(String str) {
                if (SubscriptionCallbackApi21.this.mOptions != null) {
                    SubscriptionCallbackApi21.this.onError(str, SubscriptionCallbackApi21.this.mOptions);
                } else {
                    SubscriptionCallbackApi21.this.onError(str);
                }
            }
        }

        public SubscriptionCallbackApi21(SubscriptionCallback subscriptionCallback, Bundle bundle) {
            this.mSubscriptionCallback = subscriptionCallback;
            this.mOptions = bundle;
        }

        public void onChildrenLoaded(String str, List<MediaItem> list) {
            this.mSubscriptionCallback.onChildrenLoaded(str, list);
        }

        public void onChildrenLoaded(String str, List<MediaItem> list, Bundle bundle) {
            this.mSubscriptionCallback.onChildrenLoaded(str, list, bundle);
        }

        public void onError(String str) {
            this.mSubscriptionCallback.onError(str);
        }

        public void onError(String str, Bundle bundle) {
            this.mSubscriptionCallback.onError(str, bundle);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
        if (VERSION.SDK_INT >= 23) {
            this.mImpl = new MediaBrowserImplApi23(context, componentName, connectionCallback, bundle);
        } else if (VERSION.SDK_INT >= 21) {
            this.mImpl = new MediaBrowserImplApi21(context, componentName, connectionCallback, bundle);
        } else {
            this.mImpl = new MediaBrowserServiceImplBase(context, componentName, connectionCallback, bundle);
        }
    }

    public final void connect() {
        this.mImpl.connect();
    }

    public final void disconnect() {
        this.mImpl.disconnect();
    }

    public final boolean isConnected() {
        return this.mImpl.isConnected();
    }

    public final ComponentName getServiceComponent() {
        return this.mImpl.getServiceComponent();
    }

    public final String getRoot() {
        return this.mImpl.getRoot();
    }

    public final Bundle getExtras() {
        return this.mImpl.getExtras();
    }

    public final Token getSessionToken() {
        return this.mImpl.getSessionToken();
    }

    public final void subscribe(String str, SubscriptionCallback subscriptionCallback) {
        this.mImpl.subscribe(str, null, subscriptionCallback);
    }

    public final void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
        if (bundle == null) {
            throw new IllegalArgumentException("options are null");
        }
        this.mImpl.subscribe(str, bundle, subscriptionCallback);
    }

    public final void unsubscribe(String str) {
        this.mImpl.unsubscribe(str, null);
    }

    public final void unsubscribe(String str, Bundle bundle) {
        if (bundle == null) {
            throw new IllegalArgumentException("options are null");
        }
        this.mImpl.unsubscribe(str, bundle);
    }

    public final void getItem(String str, ItemCallback itemCallback) {
        this.mImpl.getItem(str, itemCallback);
    }
}
