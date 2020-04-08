package android.support.p000v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.p000v4.media.MediaDescriptionCompat;
import android.support.p000v4.media.MediaMetadataCompat;
import android.support.p000v4.media.MediaMetadataCompat.Builder;
import android.support.p000v4.media.RatingCompat;
import android.support.p000v4.media.VolumeProviderCompat;
import android.support.p000v4.media.session.IMediaSession.Stub;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.net.finger.FingerClient;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {
    public static final String ACTION_ARGUMENT_EXTRAS = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
    public static final String ACTION_ARGUMENT_URI = "android.support.v4.media.session.action.ARGUMENT_URI";
    public static final String ACTION_PLAY_FROM_URI = "android.support.v4.media.session.action.PLAY_FROM_URI";
    public static final int FLAG_HANDLES_MEDIA_BUTTONS = 1;
    public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = 2;
    private static final String TAG = "MediaSessionCompat";
    private final ArrayList<OnActiveChangeListener> mActiveListeners;
    private final MediaControllerCompat mController;
    private final MediaSessionImpl mImpl;

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Callback */
    public static abstract class Callback {
        final Object mCallbackObj;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Callback$StubApi21 */
        class StubApi21 implements Callback {
            private StubApi21() {
            }

            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                Callback.this.onCommand(str, bundle, resultReceiver);
            }

            public boolean onMediaButtonEvent(Intent intent) {
                return Callback.this.onMediaButtonEvent(intent);
            }

            public void onPlay() {
                Callback.this.onPlay();
            }

            public void onPlayFromMediaId(String str, Bundle bundle) {
                Callback.this.onPlayFromMediaId(str, bundle);
            }

            public void onPlayFromSearch(String str, Bundle bundle) {
                Callback.this.onPlayFromSearch(str, bundle);
            }

            public void onSkipToQueueItem(long j) {
                Callback.this.onSkipToQueueItem(j);
            }

            public void onPause() {
                Callback.this.onPause();
            }

            public void onSkipToNext() {
                Callback.this.onSkipToNext();
            }

            public void onSkipToPrevious() {
                Callback.this.onSkipToPrevious();
            }

            public void onFastForward() {
                Callback.this.onFastForward();
            }

            public void onRewind() {
                Callback.this.onRewind();
            }

            public void onStop() {
                Callback.this.onStop();
            }

            public void onSeekTo(long j) {
                Callback.this.onSeekTo(j);
            }

            public void onSetRating(Object obj) {
                Callback.this.onSetRating(RatingCompat.fromRating(obj));
            }

            public void onCustomAction(String str, Bundle bundle) {
                if (str.equals(MediaSessionCompat.ACTION_PLAY_FROM_URI)) {
                    Callback.this.onPlayFromUri((Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI), (Bundle) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS));
                    return;
                }
                Callback.this.onCustomAction(str, bundle);
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Callback$StubApi23 */
        class StubApi23 extends StubApi21 implements android.support.p000v4.media.session.MediaSessionCompatApi23.Callback {
            private StubApi23() {
                super();
            }

            public void onPlayFromUri(Uri uri, Bundle bundle) {
                Callback.this.onPlayFromUri(uri, bundle);
            }
        }

        public Callback() {
            if (VERSION.SDK_INT >= 23) {
                this.mCallbackObj = MediaSessionCompatApi23.createCallback(new StubApi23());
            } else if (VERSION.SDK_INT >= 21) {
                this.mCallbackObj = MediaSessionCompatApi21.createCallback(new StubApi21());
            } else {
                this.mCallbackObj = null;
            }
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public boolean onMediaButtonEvent(Intent intent) {
            return false;
        }

        public void onPlay() {
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
        }

        public void onSkipToQueueItem(long j) {
        }

        public void onPause() {
        }

        public void onSkipToNext() {
        }

        public void onSkipToPrevious() {
        }

        public void onFastForward() {
        }

        public void onRewind() {
        }

        public void onStop() {
        }

        public void onSeekTo(long j) {
        }

        public void onSetRating(RatingCompat ratingCompat) {
        }

        public void onCustomAction(String str, Bundle bundle) {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$MediaSessionImpl */
    interface MediaSessionImpl {
        Object getMediaSession();

        Object getRemoteControlClient();

        Token getSessionToken();

        boolean isActive();

        void release();

        void sendSessionEvent(String str, Bundle bundle);

        void setActive(boolean z);

        void setCallback(Callback callback, Handler handler);

        void setExtras(Bundle bundle);

        void setFlags(int i);

        void setMediaButtonReceiver(PendingIntent pendingIntent);

        void setMetadata(MediaMetadataCompat mediaMetadataCompat);

        void setPlaybackState(PlaybackStateCompat playbackStateCompat);

        void setPlaybackToLocal(int i);

        void setPlaybackToRemote(VolumeProviderCompat volumeProviderCompat);

        void setQueue(List<QueueItem> list);

        void setQueueTitle(CharSequence charSequence);

        void setRatingType(int i);

        void setSessionActivity(PendingIntent pendingIntent);
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21 */
    static class MediaSessionImplApi21 implements MediaSessionImpl {
        private PendingIntent mMediaButtonIntent;
        private final Object mSessionObj;
        private final Token mToken = new Token(MediaSessionCompatApi21.getSessionToken(this.mSessionObj));

        public MediaSessionImplApi21(Context context, String str) {
            this.mSessionObj = MediaSessionCompatApi21.createSession(context, str);
        }

        public MediaSessionImplApi21(Object obj) {
            this.mSessionObj = MediaSessionCompatApi21.verifySession(obj);
        }

        public void setCallback(Callback callback, Handler handler) {
            MediaSessionCompatApi21.setCallback(this.mSessionObj, callback == null ? null : callback.mCallbackObj, handler);
        }

        public void setFlags(int i) {
            MediaSessionCompatApi21.setFlags(this.mSessionObj, i);
        }

        public void setPlaybackToLocal(int i) {
            MediaSessionCompatApi21.setPlaybackToLocal(this.mSessionObj, i);
        }

        public void setPlaybackToRemote(VolumeProviderCompat volumeProviderCompat) {
            MediaSessionCompatApi21.setPlaybackToRemote(this.mSessionObj, volumeProviderCompat.getVolumeProvider());
        }

        public void setActive(boolean z) {
            MediaSessionCompatApi21.setActive(this.mSessionObj, z);
        }

        public boolean isActive() {
            return MediaSessionCompatApi21.isActive(this.mSessionObj);
        }

        public void sendSessionEvent(String str, Bundle bundle) {
            MediaSessionCompatApi21.sendSessionEvent(this.mSessionObj, str, bundle);
        }

        public void release() {
            MediaSessionCompatApi21.release(this.mSessionObj);
        }

        public Token getSessionToken() {
            return this.mToken;
        }

        public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
            MediaSessionCompatApi21.setPlaybackState(this.mSessionObj, playbackStateCompat == null ? null : playbackStateCompat.getPlaybackState());
        }

        public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
            MediaSessionCompatApi21.setMetadata(this.mSessionObj, mediaMetadataCompat == null ? null : mediaMetadataCompat.getMediaMetadata());
        }

        public void setSessionActivity(PendingIntent pendingIntent) {
            MediaSessionCompatApi21.setSessionActivity(this.mSessionObj, pendingIntent);
        }

        public void setMediaButtonReceiver(PendingIntent pendingIntent) {
            this.mMediaButtonIntent = pendingIntent;
            MediaSessionCompatApi21.setMediaButtonReceiver(this.mSessionObj, pendingIntent);
        }

        public void setQueue(List<QueueItem> list) {
            ArrayList arrayList = null;
            if (list != null) {
                arrayList = new ArrayList();
                for (QueueItem queueItem : list) {
                    arrayList.add(queueItem.getQueueItem());
                }
            }
            MediaSessionCompatApi21.setQueue(this.mSessionObj, arrayList);
        }

        public void setQueueTitle(CharSequence charSequence) {
            MediaSessionCompatApi21.setQueueTitle(this.mSessionObj, charSequence);
        }

        public void setRatingType(int i) {
            if (VERSION.SDK_INT >= 22) {
                MediaSessionCompatApi22.setRatingType(this.mSessionObj, i);
            }
        }

        public void setExtras(Bundle bundle) {
            MediaSessionCompatApi21.setExtras(this.mSessionObj, bundle);
        }

        public Object getMediaSession() {
            return this.mSessionObj;
        }

        public Object getRemoteControlClient() {
            return null;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase */
    static class MediaSessionImplBase implements MediaSessionImpl {
        /* access modifiers changed from: private */
        public final AudioManager mAudioManager;
        /* access modifiers changed from: private */
        public volatile Callback mCallback;
        private final ComponentName mComponentName;
        private final Context mContext;
        /* access modifiers changed from: private */
        public final RemoteCallbackList<IMediaControllerCallback> mControllerCallbacks = new RemoteCallbackList<>();
        /* access modifiers changed from: private */
        public boolean mDestroyed = false;
        /* access modifiers changed from: private */
        public Bundle mExtras;
        /* access modifiers changed from: private */
        public int mFlags;
        private MessageHandler mHandler;
        private boolean mIsActive = false;
        private boolean mIsMbrRegistered = false;
        private boolean mIsRccRegistered = false;
        /* access modifiers changed from: private */
        public int mLocalStream;
        /* access modifiers changed from: private */
        public final Object mLock = new Object();
        private final PendingIntent mMediaButtonEventReceiver;
        /* access modifiers changed from: private */
        public MediaMetadataCompat mMetadata;
        /* access modifiers changed from: private */
        public final String mPackageName;
        /* access modifiers changed from: private */
        public List<QueueItem> mQueue;
        /* access modifiers changed from: private */
        public CharSequence mQueueTitle;
        /* access modifiers changed from: private */
        public int mRatingType;
        private final Object mRccObj;
        /* access modifiers changed from: private */
        public PendingIntent mSessionActivity;
        /* access modifiers changed from: private */
        public PlaybackStateCompat mState;
        private final MediaSessionStub mStub;
        /* access modifiers changed from: private */
        public final String mTag;
        private final Token mToken;
        private android.support.p000v4.media.VolumeProviderCompat.Callback mVolumeCallback = new android.support.p000v4.media.VolumeProviderCompat.Callback() {
            public void onVolumeChanged(VolumeProviderCompat volumeProviderCompat) {
                if (MediaSessionImplBase.this.mVolumeProvider == volumeProviderCompat) {
                    MediaSessionImplBase.this.sendVolumeInfoChanged(new ParcelableVolumeInfo(MediaSessionImplBase.this.mVolumeType, MediaSessionImplBase.this.mLocalStream, volumeProviderCompat.getVolumeControl(), volumeProviderCompat.getMaxVolume(), volumeProviderCompat.getCurrentVolume()));
                }
            }
        };
        /* access modifiers changed from: private */
        public VolumeProviderCompat mVolumeProvider;
        /* access modifiers changed from: private */
        public int mVolumeType;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$Command */
        static final class Command {
            public final String command;
            public final Bundle extras;
            public final ResultReceiver stub;

            public Command(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.command = str;
                this.extras = bundle;
                this.stub = resultReceiver;
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$MediaSessionStub */
        class MediaSessionStub extends Stub {
            MediaSessionStub() {
            }

            public void sendCommand(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                MediaSessionImplBase.this.postToHandler(15, new Command(str, bundle, resultReceiverWrapper.mResultReceiver));
            }

            public boolean sendMediaButton(KeyEvent keyEvent) {
                boolean z = (MediaSessionImplBase.this.mFlags & 1) != 0;
                if (z) {
                    MediaSessionImplBase.this.postToHandler(14, keyEvent);
                }
                return z;
            }

            public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                if (MediaSessionImplBase.this.mDestroyed) {
                    try {
                        iMediaControllerCallback.onSessionDestroyed();
                    } catch (Exception unused) {
                    }
                } else {
                    MediaSessionImplBase.this.mControllerCallbacks.register(iMediaControllerCallback);
                }
            }

            public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                MediaSessionImplBase.this.mControllerCallbacks.unregister(iMediaControllerCallback);
            }

            public String getPackageName() {
                return MediaSessionImplBase.this.mPackageName;
            }

            public String getTag() {
                return MediaSessionImplBase.this.mTag;
            }

            public PendingIntent getLaunchPendingIntent() {
                PendingIntent access$1500;
                synchronized (MediaSessionImplBase.this.mLock) {
                    access$1500 = MediaSessionImplBase.this.mSessionActivity;
                }
                return access$1500;
            }

            public long getFlags() {
                long access$900;
                synchronized (MediaSessionImplBase.this.mLock) {
                    access$900 = (long) MediaSessionImplBase.this.mFlags;
                }
                return access$900;
            }

            public ParcelableVolumeInfo getVolumeAttributes() {
                int access$400;
                int access$500;
                int i;
                int i2;
                int i3;
                synchronized (MediaSessionImplBase.this.mLock) {
                    access$400 = MediaSessionImplBase.this.mVolumeType;
                    access$500 = MediaSessionImplBase.this.mLocalStream;
                    VolumeProviderCompat access$300 = MediaSessionImplBase.this.mVolumeProvider;
                    if (access$400 == 2) {
                        i3 = access$300.getVolumeControl();
                        i2 = access$300.getMaxVolume();
                        i = access$300.getCurrentVolume();
                    } else {
                        i3 = 2;
                        i2 = MediaSessionImplBase.this.mAudioManager.getStreamMaxVolume(access$500);
                        i = MediaSessionImplBase.this.mAudioManager.getStreamVolume(access$500);
                    }
                }
                return new ParcelableVolumeInfo(access$400, access$500, i3, i2, i);
            }

            public void adjustVolume(int i, int i2, String str) {
                MediaSessionImplBase.this.adjustVolume(i, i2);
            }

            public void setVolumeTo(int i, int i2, String str) {
                MediaSessionImplBase.this.setVolumeTo(i, i2);
            }

            public void play() {
                MediaSessionImplBase.this.postToHandler(1);
            }

            public void playFromMediaId(String str, Bundle bundle) {
                MediaSessionImplBase.this.postToHandler(2, str, bundle);
            }

            public void playFromSearch(String str, Bundle bundle) {
                MediaSessionImplBase.this.postToHandler(3, str, bundle);
            }

            public void playFromUri(Uri uri, Bundle bundle) {
                MediaSessionImplBase.this.postToHandler(18, uri, bundle);
            }

            public void skipToQueueItem(long j) {
                MediaSessionImplBase.this.postToHandler(4, Long.valueOf(j));
            }

            public void pause() {
                MediaSessionImplBase.this.postToHandler(5);
            }

            public void stop() {
                MediaSessionImplBase.this.postToHandler(6);
            }

            public void next() {
                MediaSessionImplBase.this.postToHandler(7);
            }

            public void previous() {
                MediaSessionImplBase.this.postToHandler(8);
            }

            public void fastForward() {
                MediaSessionImplBase.this.postToHandler(9);
            }

            public void rewind() {
                MediaSessionImplBase.this.postToHandler(10);
            }

            public void seekTo(long j) {
                MediaSessionImplBase.this.postToHandler(11, Long.valueOf(j));
            }

            public void rate(RatingCompat ratingCompat) {
                MediaSessionImplBase.this.postToHandler(12, ratingCompat);
            }

            public void sendCustomAction(String str, Bundle bundle) {
                MediaSessionImplBase.this.postToHandler(13, str, bundle);
            }

            public MediaMetadataCompat getMetadata() {
                return MediaSessionImplBase.this.mMetadata;
            }

            public PlaybackStateCompat getPlaybackState() {
                return MediaSessionImplBase.this.getStateWithUpdatedPosition();
            }

            public List<QueueItem> getQueue() {
                List<QueueItem> access$2300;
                synchronized (MediaSessionImplBase.this.mLock) {
                    access$2300 = MediaSessionImplBase.this.mQueue;
                }
                return access$2300;
            }

            public CharSequence getQueueTitle() {
                return MediaSessionImplBase.this.mQueueTitle;
            }

            public Bundle getExtras() {
                Bundle access$2500;
                synchronized (MediaSessionImplBase.this.mLock) {
                    access$2500 = MediaSessionImplBase.this.mExtras;
                }
                return access$2500;
            }

            public int getRatingType() {
                return MediaSessionImplBase.this.mRatingType;
            }

            public boolean isTransportControlEnabled() {
                return (MediaSessionImplBase.this.mFlags & 2) != 0;
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$MessageHandler */
        class MessageHandler extends Handler {
            private static final int KEYCODE_MEDIA_PAUSE = 127;
            private static final int KEYCODE_MEDIA_PLAY = 126;
            private static final int MSG_ADJUST_VOLUME = 16;
            private static final int MSG_COMMAND = 15;
            private static final int MSG_CUSTOM_ACTION = 13;
            private static final int MSG_FAST_FORWARD = 9;
            private static final int MSG_MEDIA_BUTTON = 14;
            private static final int MSG_NEXT = 7;
            private static final int MSG_PAUSE = 5;
            private static final int MSG_PLAY = 1;
            private static final int MSG_PLAY_MEDIA_ID = 2;
            private static final int MSG_PLAY_SEARCH = 3;
            private static final int MSG_PLAY_URI = 18;
            private static final int MSG_PREVIOUS = 8;
            private static final int MSG_RATE = 12;
            private static final int MSG_REWIND = 10;
            private static final int MSG_SEEK_TO = 11;
            private static final int MSG_SET_VOLUME = 17;
            private static final int MSG_SKIP_TO_ITEM = 4;
            private static final int MSG_STOP = 6;

            public MessageHandler(Looper looper) {
                super(looper);
            }

            public void post(int i, Object obj, Bundle bundle) {
                Message obtainMessage = obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }

            public void post(int i, Object obj) {
                obtainMessage(i, obj).sendToTarget();
            }

            public void post(int i) {
                post(i, null);
            }

            public void post(int i, Object obj, int i2) {
                obtainMessage(i, i2, 0, obj).sendToTarget();
            }

            public void handleMessage(Message message) {
                Callback access$2700 = MediaSessionImplBase.this.mCallback;
                if (access$2700 != null) {
                    switch (message.what) {
                        case 1:
                            access$2700.onPlay();
                            return;
                        case 2:
                            access$2700.onPlayFromMediaId((String) message.obj, message.getData());
                            return;
                        case 3:
                            access$2700.onPlayFromSearch((String) message.obj, message.getData());
                            return;
                        case 4:
                            access$2700.onSkipToQueueItem(((Long) message.obj).longValue());
                            return;
                        case 5:
                            access$2700.onPause();
                            return;
                        case 6:
                            access$2700.onStop();
                            return;
                        case 7:
                            access$2700.onSkipToNext();
                            return;
                        case 8:
                            access$2700.onSkipToPrevious();
                            return;
                        case 9:
                            access$2700.onFastForward();
                            return;
                        case 10:
                            access$2700.onRewind();
                            return;
                        case 11:
                            access$2700.onSeekTo(((Long) message.obj).longValue());
                            return;
                        case 12:
                            access$2700.onSetRating((RatingCompat) message.obj);
                            return;
                        case 13:
                            access$2700.onCustomAction((String) message.obj, message.getData());
                            return;
                        case 14:
                            KeyEvent keyEvent = (KeyEvent) message.obj;
                            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                            intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                            if (!access$2700.onMediaButtonEvent(intent)) {
                                onMediaButtonEvent(keyEvent, access$2700);
                                return;
                            }
                            break;
                        case 15:
                            Command command = (Command) message.obj;
                            access$2700.onCommand(command.command, command.extras, command.stub);
                            return;
                        case 16:
                            MediaSessionImplBase.this.adjustVolume(((Integer) message.obj).intValue(), 0);
                            return;
                        case 17:
                            MediaSessionImplBase.this.setVolumeTo(((Integer) message.obj).intValue(), 0);
                            break;
                        case 18:
                            access$2700.onPlayFromUri((Uri) message.obj, message.getData());
                            return;
                    }
                }
            }

            private void onMediaButtonEvent(KeyEvent keyEvent, Callback callback) {
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    long actions = MediaSessionImplBase.this.mState == null ? 0 : MediaSessionImplBase.this.mState.getActions();
                    switch (keyEvent.getKeyCode()) {
                        case FingerClient.DEFAULT_PORT /*79*/:
                        case 85:
                            boolean z = MediaSessionImplBase.this.mState != null && MediaSessionImplBase.this.mState.getState() == 3;
                            boolean z2 = (516 & actions) != 0;
                            boolean z3 = (514 & actions) != 0;
                            if (!z || !z3) {
                                if (!z && z2) {
                                    callback.onPlay();
                                    break;
                                }
                            } else {
                                callback.onPause();
                                return;
                            }
                            break;
                        case 86:
                            if ((1 & actions) != 0) {
                                callback.onStop();
                                return;
                            }
                            break;
                        case 87:
                            if ((32 & actions) != 0) {
                                callback.onSkipToNext();
                                return;
                            }
                            break;
                        case 88:
                            if ((16 & actions) != 0) {
                                callback.onSkipToPrevious();
                                return;
                            }
                            break;
                        case 89:
                            if ((8 & actions) != 0) {
                                callback.onRewind();
                                return;
                            }
                            break;
                        case 90:
                            if ((64 & actions) != 0) {
                                callback.onFastForward();
                                return;
                            }
                            break;
                        case 126:
                            if ((4 & actions) != 0) {
                                callback.onPlay();
                                return;
                            }
                            break;
                        case 127:
                            if ((2 & actions) != 0) {
                                callback.onPause();
                                return;
                            }
                            break;
                    }
                }
            }
        }

        public MediaSessionImplBase(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            if (componentName == null) {
                throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
            }
            this.mContext = context;
            this.mPackageName = context.getPackageName();
            this.mAudioManager = (AudioManager) context.getSystemService("audio");
            this.mTag = str;
            this.mComponentName = componentName;
            this.mMediaButtonEventReceiver = pendingIntent;
            this.mStub = new MediaSessionStub();
            this.mToken = new Token(this.mStub);
            this.mRatingType = 0;
            this.mVolumeType = 1;
            this.mLocalStream = 3;
            if (VERSION.SDK_INT >= 14) {
                this.mRccObj = MediaSessionCompatApi14.createRemoteControlClient(pendingIntent);
            } else {
                this.mRccObj = null;
            }
        }

        public void setCallback(Callback callback, Handler handler) {
            this.mCallback = callback;
            if (callback == null) {
                if (VERSION.SDK_INT >= 18) {
                    MediaSessionCompatApi18.setOnPlaybackPositionUpdateListener(this.mRccObj, null);
                }
                if (VERSION.SDK_INT >= 19) {
                    MediaSessionCompatApi19.setOnMetadataUpdateListener(this.mRccObj, null);
                }
            } else {
                if (handler == null) {
                    handler = new Handler();
                }
                synchronized (this.mLock) {
                    this.mHandler = new MessageHandler(handler.getLooper());
                }
                C00812 r3 = new Callback() {
                    public void onSetRating(Object obj) {
                        MediaSessionImplBase.this.postToHandler(12, RatingCompat.fromRating(obj));
                    }

                    public void onSeekTo(long j) {
                        MediaSessionImplBase.this.postToHandler(11, Long.valueOf(j));
                    }
                };
                if (VERSION.SDK_INT >= 18) {
                    MediaSessionCompatApi18.setOnPlaybackPositionUpdateListener(this.mRccObj, MediaSessionCompatApi18.createPlaybackPositionUpdateListener(r3));
                }
                if (VERSION.SDK_INT >= 19) {
                    MediaSessionCompatApi19.setOnMetadataUpdateListener(this.mRccObj, MediaSessionCompatApi19.createMetadataUpdateListener(r3));
                }
            }
        }

        /* access modifiers changed from: private */
        public void postToHandler(int i) {
            postToHandler(i, null);
        }

        /* access modifiers changed from: private */
        public void postToHandler(int i, Object obj) {
            postToHandler(i, obj, null);
        }

        /* access modifiers changed from: private */
        public void postToHandler(int i, Object obj, Bundle bundle) {
            synchronized (this.mLock) {
                if (this.mHandler != null) {
                    this.mHandler.post(i, obj, bundle);
                }
            }
        }

        public void setFlags(int i) {
            synchronized (this.mLock) {
                this.mFlags = i;
            }
            update();
        }

        public void setPlaybackToLocal(int i) {
            if (this.mVolumeProvider != null) {
                this.mVolumeProvider.setCallback(null);
            }
            this.mVolumeType = 1;
            ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo(this.mVolumeType, this.mLocalStream, 2, this.mAudioManager.getStreamMaxVolume(this.mLocalStream), this.mAudioManager.getStreamVolume(this.mLocalStream));
            sendVolumeInfoChanged(parcelableVolumeInfo);
        }

        public void setPlaybackToRemote(VolumeProviderCompat volumeProviderCompat) {
            if (volumeProviderCompat == null) {
                throw new IllegalArgumentException("volumeProvider may not be null");
            }
            if (this.mVolumeProvider != null) {
                this.mVolumeProvider.setCallback(null);
            }
            this.mVolumeType = 2;
            this.mVolumeProvider = volumeProviderCompat;
            ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo(this.mVolumeType, this.mLocalStream, this.mVolumeProvider.getVolumeControl(), this.mVolumeProvider.getMaxVolume(), this.mVolumeProvider.getCurrentVolume());
            sendVolumeInfoChanged(parcelableVolumeInfo);
            volumeProviderCompat.setCallback(this.mVolumeCallback);
        }

        public void setActive(boolean z) {
            if (z != this.mIsActive) {
                this.mIsActive = z;
                if (update()) {
                    setMetadata(this.mMetadata);
                    setPlaybackState(this.mState);
                }
            }
        }

        public boolean isActive() {
            return this.mIsActive;
        }

        public void sendSessionEvent(String str, Bundle bundle) {
            sendEvent(str, bundle);
        }

        public void release() {
            this.mIsActive = false;
            this.mDestroyed = true;
            update();
            sendSessionDestroyed();
        }

        public Token getSessionToken() {
            return this.mToken;
        }

        public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.mLock) {
                this.mState = playbackStateCompat;
            }
            sendState(playbackStateCompat);
            if (this.mIsActive) {
                if (playbackStateCompat != null) {
                    if (VERSION.SDK_INT >= 18) {
                        MediaSessionCompatApi18.setState(this.mRccObj, playbackStateCompat.getState(), playbackStateCompat.getPosition(), playbackStateCompat.getPlaybackSpeed(), playbackStateCompat.getLastPositionUpdateTime());
                    } else if (VERSION.SDK_INT >= 14) {
                        MediaSessionCompatApi14.setState(this.mRccObj, playbackStateCompat.getState());
                    }
                    if (VERSION.SDK_INT >= 19) {
                        MediaSessionCompatApi19.setTransportControlFlags(this.mRccObj, playbackStateCompat.getActions());
                    } else if (VERSION.SDK_INT >= 18) {
                        MediaSessionCompatApi18.setTransportControlFlags(this.mRccObj, playbackStateCompat.getActions());
                    } else if (VERSION.SDK_INT >= 14) {
                        MediaSessionCompatApi14.setTransportControlFlags(this.mRccObj, playbackStateCompat.getActions());
                    }
                } else if (VERSION.SDK_INT >= 14) {
                    MediaSessionCompatApi14.setState(this.mRccObj, 0);
                    MediaSessionCompatApi14.setTransportControlFlags(this.mRccObj, 0);
                }
            }
        }

        private MediaMetadataCompat cloneMetadataIfNeeded(MediaMetadataCompat mediaMetadataCompat) {
            if (mediaMetadataCompat == null) {
                return null;
            }
            if (!mediaMetadataCompat.containsKey(MediaMetadataCompat.METADATA_KEY_ART) && !mediaMetadataCompat.containsKey(MediaMetadataCompat.METADATA_KEY_ALBUM_ART)) {
                return mediaMetadataCompat;
            }
            Builder builder = new Builder(mediaMetadataCompat);
            Bitmap bitmap = mediaMetadataCompat.getBitmap(MediaMetadataCompat.METADATA_KEY_ART);
            if (bitmap != null) {
                builder.putBitmap(MediaMetadataCompat.METADATA_KEY_ART, bitmap.copy(bitmap.getConfig(), false));
            }
            Bitmap bitmap2 = mediaMetadataCompat.getBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART);
            if (bitmap2 != null) {
                builder.putBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap2.copy(bitmap2.getConfig(), false));
            }
            return builder.build();
        }

        public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
            if (VERSION.SDK_INT >= 14 && mediaMetadataCompat != null) {
                mediaMetadataCompat = cloneMetadataIfNeeded(mediaMetadataCompat);
            }
            synchronized (this.mLock) {
                this.mMetadata = mediaMetadataCompat;
            }
            sendMetadata(mediaMetadataCompat);
            if (this.mIsActive) {
                if (VERSION.SDK_INT >= 19) {
                    MediaSessionCompatApi19.setMetadata(this.mRccObj, mediaMetadataCompat == null ? null : mediaMetadataCompat.getBundle(), this.mState == null ? 0 : this.mState.getActions());
                    return;
                }
                if (VERSION.SDK_INT >= 14) {
                    MediaSessionCompatApi14.setMetadata(this.mRccObj, mediaMetadataCompat == null ? null : mediaMetadataCompat.getBundle());
                }
            }
        }

        public void setSessionActivity(PendingIntent pendingIntent) {
            synchronized (this.mLock) {
                this.mSessionActivity = pendingIntent;
            }
        }

        public void setMediaButtonReceiver(PendingIntent pendingIntent) {
        }

        public void setQueue(List<QueueItem> list) {
            this.mQueue = list;
            sendQueue(list);
        }

        public void setQueueTitle(CharSequence charSequence) {
            this.mQueueTitle = charSequence;
            sendQueueTitle(charSequence);
        }

        public Object getMediaSession() {
            return null;
        }

        public Object getRemoteControlClient() {
            return this.mRccObj;
        }

        public void setRatingType(int i) {
            this.mRatingType = i;
        }

        public void setExtras(Bundle bundle) {
            this.mExtras = bundle;
        }

        private boolean update() {
            if (this.mIsActive) {
                if (VERSION.SDK_INT >= 8) {
                    if (!this.mIsMbrRegistered && (this.mFlags & 1) != 0) {
                        if (VERSION.SDK_INT >= 18) {
                            MediaSessionCompatApi18.registerMediaButtonEventReceiver(this.mContext, this.mMediaButtonEventReceiver, this.mComponentName);
                        } else {
                            MediaSessionCompatApi8.registerMediaButtonEventReceiver(this.mContext, this.mComponentName);
                        }
                        this.mIsMbrRegistered = true;
                    } else if (this.mIsMbrRegistered && (this.mFlags & 1) == 0) {
                        if (VERSION.SDK_INT >= 18) {
                            MediaSessionCompatApi18.unregisterMediaButtonEventReceiver(this.mContext, this.mMediaButtonEventReceiver, this.mComponentName);
                        } else {
                            MediaSessionCompatApi8.unregisterMediaButtonEventReceiver(this.mContext, this.mComponentName);
                        }
                        this.mIsMbrRegistered = false;
                    }
                }
                if (VERSION.SDK_INT < 14) {
                    return false;
                }
                if (!this.mIsRccRegistered && (this.mFlags & 2) != 0) {
                    MediaSessionCompatApi14.registerRemoteControlClient(this.mContext, this.mRccObj);
                    this.mIsRccRegistered = true;
                    return true;
                } else if (!this.mIsRccRegistered || (this.mFlags & 2) != 0) {
                    return false;
                } else {
                    MediaSessionCompatApi14.setState(this.mRccObj, 0);
                    MediaSessionCompatApi14.unregisterRemoteControlClient(this.mContext, this.mRccObj);
                    this.mIsRccRegistered = false;
                    return false;
                }
            } else {
                if (this.mIsMbrRegistered) {
                    if (VERSION.SDK_INT >= 18) {
                        MediaSessionCompatApi18.unregisterMediaButtonEventReceiver(this.mContext, this.mMediaButtonEventReceiver, this.mComponentName);
                    } else {
                        MediaSessionCompatApi8.unregisterMediaButtonEventReceiver(this.mContext, this.mComponentName);
                    }
                    this.mIsMbrRegistered = false;
                }
                if (!this.mIsRccRegistered) {
                    return false;
                }
                MediaSessionCompatApi14.setState(this.mRccObj, 0);
                MediaSessionCompatApi14.unregisterRemoteControlClient(this.mContext, this.mRccObj);
                this.mIsRccRegistered = false;
                return false;
            }
        }

        /* access modifiers changed from: private */
        public void adjustVolume(int i, int i2) {
            if (this.mVolumeType != 2) {
                this.mAudioManager.adjustStreamVolume(this.mLocalStream, i, i2);
            } else if (this.mVolumeProvider != null) {
                this.mVolumeProvider.onAdjustVolume(i);
            }
        }

        /* access modifiers changed from: private */
        public void setVolumeTo(int i, int i2) {
            if (this.mVolumeType != 2) {
                this.mAudioManager.setStreamVolume(this.mLocalStream, i, i2);
            } else if (this.mVolumeProvider != null) {
                this.mVolumeProvider.onSetVolumeTo(i);
            }
        }

        /* access modifiers changed from: private */
        public PlaybackStateCompat getStateWithUpdatedPosition() {
            PlaybackStateCompat playbackStateCompat;
            long j = -1;
            synchronized (this.mLock) {
                playbackStateCompat = this.mState;
                if (this.mMetadata != null && this.mMetadata.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
                    j = this.mMetadata.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
                }
            }
            PlaybackStateCompat playbackStateCompat2 = null;
            if (playbackStateCompat != null && (playbackStateCompat.getState() == 3 || playbackStateCompat.getState() == 4 || playbackStateCompat.getState() == 5)) {
                long lastPositionUpdateTime = playbackStateCompat.getLastPositionUpdateTime();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (lastPositionUpdateTime > 0) {
                    long playbackSpeed = ((long) (playbackStateCompat.getPlaybackSpeed() * ((float) (elapsedRealtime - lastPositionUpdateTime)))) + playbackStateCompat.getPosition();
                    if (j >= 0 && playbackSpeed > j) {
                        playbackSpeed = j;
                    } else if (playbackSpeed < 0) {
                        playbackSpeed = 0;
                    }
                    PlaybackStateCompat.Builder builder = new PlaybackStateCompat.Builder(playbackStateCompat);
                    builder.setState(playbackStateCompat.getState(), playbackSpeed, playbackStateCompat.getPlaybackSpeed(), elapsedRealtime);
                    playbackStateCompat2 = builder.build();
                }
            }
            return playbackStateCompat2 == null ? playbackStateCompat : playbackStateCompat2;
        }

        /* access modifiers changed from: private */
        public void sendVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) {
            for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(beginBroadcast)).onVolumeInfoChanged(parcelableVolumeInfo);
                } catch (RemoteException unused) {
                }
            }
            this.mControllerCallbacks.finishBroadcast();
        }

        private void sendSessionDestroyed() {
            for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(beginBroadcast)).onSessionDestroyed();
                } catch (RemoteException unused) {
                }
            }
            this.mControllerCallbacks.finishBroadcast();
            this.mControllerCallbacks.kill();
        }

        private void sendEvent(String str, Bundle bundle) {
            for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(beginBroadcast)).onEvent(str, bundle);
                } catch (RemoteException unused) {
                }
            }
            this.mControllerCallbacks.finishBroadcast();
        }

        private void sendState(PlaybackStateCompat playbackStateCompat) {
            for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(beginBroadcast)).onPlaybackStateChanged(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.mControllerCallbacks.finishBroadcast();
        }

        private void sendMetadata(MediaMetadataCompat mediaMetadataCompat) {
            for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(beginBroadcast)).onMetadataChanged(mediaMetadataCompat);
                } catch (RemoteException unused) {
                }
            }
            this.mControllerCallbacks.finishBroadcast();
        }

        private void sendQueue(List<QueueItem> list) {
            for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(beginBroadcast)).onQueueChanged(list);
                } catch (RemoteException unused) {
                }
            }
            this.mControllerCallbacks.finishBroadcast();
        }

        private void sendQueueTitle(CharSequence charSequence) {
            for (int beginBroadcast = this.mControllerCallbacks.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((IMediaControllerCallback) this.mControllerCallbacks.getBroadcastItem(beginBroadcast)).onQueueTitleChanged(charSequence);
                } catch (RemoteException unused) {
                }
            }
            this.mControllerCallbacks.finishBroadcast();
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$OnActiveChangeListener */
    public interface OnActiveChangeListener {
        void onActiveChanged();
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Creator<QueueItem> CREATOR = new Creator<QueueItem>() {
            public final QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public final QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        };
        public static final int UNKNOWN_ID = -1;
        private final MediaDescriptionCompat mDescription;
        private final long mId;
        private Object mItem;

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
            this(null, mediaDescriptionCompat, j);
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            } else {
                this.mDescription = mediaDescriptionCompat;
                this.mId = j;
                this.mItem = obj;
            }
        }

        private QueueItem(Parcel parcel) {
            this.mDescription = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.mId = parcel.readLong();
        }

        public final MediaDescriptionCompat getDescription() {
            return this.mDescription;
        }

        public final long getQueueId() {
            return this.mId;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.mDescription.writeToParcel(parcel, i);
            parcel.writeLong(this.mId);
        }

        public final int describeContents() {
            return 0;
        }

        public final Object getQueueItem() {
            if (this.mItem != null || VERSION.SDK_INT < 21) {
                return this.mItem;
            }
            this.mItem = QueueItem.createItem(this.mDescription.getMediaDescription(), this.mId);
            return this.mItem;
        }

        public static QueueItem obtain(Object obj) {
            return new QueueItem(obj, MediaDescriptionCompat.fromMediaDescription(QueueItem.getDescription(obj)), QueueItem.getQueueId(obj));
        }

        static {
        }

        public final String toString() {
            return "MediaSession.QueueItem {Description=" + this.mDescription + ", Id=" + this.mId + " }";
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    static final class ResultReceiverWrapper implements Parcelable {
        public static final Creator<ResultReceiverWrapper> CREATOR = new Creator<ResultReceiverWrapper>() {
            public final ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public final ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        };
        /* access modifiers changed from: private */
        public ResultReceiver mResultReceiver;

        public ResultReceiverWrapper(ResultReceiver resultReceiver) {
            this.mResultReceiver = resultReceiver;
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.mResultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        static {
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.mResultReceiver.writeToParcel(parcel, i);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$SessionFlags */
    public @interface SessionFlags {
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Creator<Token> CREATOR = new Creator<Token>() {
            public final Token createFromParcel(Parcel parcel) {
                Object obj;
                if (VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable(null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }

            public final Token[] newArray(int i) {
                return new Token[i];
            }
        };
        private final Object mInner;

        Token(Object obj) {
            this.mInner = obj;
        }

        public static Token fromToken(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            return new Token(MediaSessionCompatApi21.verifyToken(obj));
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            if (VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.mInner, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.mInner);
            }
        }

        public final Object getToken() {
            return this.mInner;
        }

        static {
        }
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this.mActiveListeners = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        } else {
            if (componentName == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(context.getPackageName());
                List queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ResolveInfo resolveInfo = (ResolveInfo) queryBroadcastReceivers.get(0);
                    componentName = new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
                } else {
                    queryBroadcastReceivers.size();
                }
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            if (VERSION.SDK_INT >= 21) {
                this.mImpl = new MediaSessionImplApi21(context, str);
                this.mImpl.setMediaButtonReceiver(pendingIntent);
            } else {
                this.mImpl = new MediaSessionImplBase(context, str, componentName, pendingIntent);
            }
            this.mController = new MediaControllerCompat(context, this);
        }
    }

    private MediaSessionCompat(Context context, MediaSessionImpl mediaSessionImpl) {
        this.mActiveListeners = new ArrayList<>();
        this.mImpl = mediaSessionImpl;
        this.mController = new MediaControllerCompat(context, this);
    }

    public void setCallback(Callback callback) {
        setCallback(callback, null);
    }

    public void setCallback(Callback callback, Handler handler) {
        this.mImpl.setCallback(callback, handler != null ? handler : new Handler());
    }

    public void setSessionActivity(PendingIntent pendingIntent) {
        this.mImpl.setSessionActivity(pendingIntent);
    }

    public void setMediaButtonReceiver(PendingIntent pendingIntent) {
        this.mImpl.setMediaButtonReceiver(pendingIntent);
    }

    public void setFlags(int i) {
        this.mImpl.setFlags(i);
    }

    public void setPlaybackToLocal(int i) {
        this.mImpl.setPlaybackToLocal(i);
    }

    public void setPlaybackToRemote(VolumeProviderCompat volumeProviderCompat) {
        if (volumeProviderCompat == null) {
            throw new IllegalArgumentException("volumeProvider may not be null!");
        }
        this.mImpl.setPlaybackToRemote(volumeProviderCompat);
    }

    public void setActive(boolean z) {
        this.mImpl.setActive(z);
        Iterator it = this.mActiveListeners.iterator();
        while (it.hasNext()) {
            ((OnActiveChangeListener) it.next()).onActiveChanged();
        }
    }

    public boolean isActive() {
        return this.mImpl.isActive();
    }

    public void sendSessionEvent(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        this.mImpl.sendSessionEvent(str, bundle);
    }

    public void release() {
        this.mImpl.release();
    }

    public Token getSessionToken() {
        return this.mImpl.getSessionToken();
    }

    public MediaControllerCompat getController() {
        return this.mController;
    }

    public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
        this.mImpl.setPlaybackState(playbackStateCompat);
    }

    public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
        this.mImpl.setMetadata(mediaMetadataCompat);
    }

    public void setQueue(List<QueueItem> list) {
        this.mImpl.setQueue(list);
    }

    public void setQueueTitle(CharSequence charSequence) {
        this.mImpl.setQueueTitle(charSequence);
    }

    public void setRatingType(int i) {
        this.mImpl.setRatingType(i);
    }

    public void setExtras(Bundle bundle) {
        this.mImpl.setExtras(bundle);
    }

    public Object getMediaSession() {
        return this.mImpl.getMediaSession();
    }

    public Object getRemoteControlClient() {
        return this.mImpl.getRemoteControlClient();
    }

    public void addOnActiveChangeListener(OnActiveChangeListener onActiveChangeListener) {
        if (onActiveChangeListener == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.mActiveListeners.add(onActiveChangeListener);
    }

    public void removeOnActiveChangeListener(OnActiveChangeListener onActiveChangeListener) {
        if (onActiveChangeListener == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.mActiveListeners.remove(onActiveChangeListener);
    }

    public static MediaSessionCompat obtain(Context context, Object obj) {
        return new MediaSessionCompat(context, (MediaSessionImpl) new MediaSessionImplApi21(obj));
    }
}
