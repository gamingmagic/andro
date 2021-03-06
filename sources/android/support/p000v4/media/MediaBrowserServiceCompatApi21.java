package android.support.p000v4.media;

import android.content.Intent;
import android.media.MediaDescription.Builder;
import android.media.browse.MediaBrowser.MediaItem;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.MediaBrowserServiceCompatApi21 */
class MediaBrowserServiceCompatApi21 {

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompatApi21$MediaBrowserServiceAdaptorApi21 */
    static class MediaBrowserServiceAdaptorApi21 {
        ServiceBinderProxyApi21 mBinder;

        /* renamed from: android.support.v4.media.MediaBrowserServiceCompatApi21$MediaBrowserServiceAdaptorApi21$ServiceBinderProxyApi21 */
        static class ServiceBinderProxyApi21 extends Stub {
            final ServiceImplApi21 mServiceImpl;

            ServiceBinderProxyApi21(ServiceImplApi21 serviceImplApi21) {
                this.mServiceImpl = serviceImplApi21;
            }

            public void connect(String str, Bundle bundle, Object obj) {
                this.mServiceImpl.connect(str, bundle, new ServiceCallbacksApi21(obj));
            }

            public void disconnect(Object obj) {
                this.mServiceImpl.disconnect(new ServiceCallbacksApi21(obj));
            }

            public void addSubscription(String str, Object obj) {
                this.mServiceImpl.addSubscription(str, new ServiceCallbacksApi21(obj));
            }

            public void removeSubscription(String str, Object obj) {
                this.mServiceImpl.removeSubscription(str, new ServiceCallbacksApi21(obj));
            }

            public void getMediaItem(String str, ResultReceiver resultReceiver) {
            }
        }

        MediaBrowserServiceAdaptorApi21() {
        }

        public void onCreate(ServiceImplApi21 serviceImplApi21) {
            this.mBinder = new ServiceBinderProxyApi21(serviceImplApi21);
        }

        public IBinder onBind(Intent intent) {
            if (MediaBrowserServiceCompat.SERVICE_INTERFACE.equals(intent.getAction())) {
                return this.mBinder;
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompatApi21$ServiceCallbacks */
    public interface ServiceCallbacks {
        IBinder asBinder();

        void onConnect(String str, Object obj, Bundle bundle);

        void onConnectFailed();

        void onLoadChildren(String str, List<Parcel> list);
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompatApi21$ServiceCallbacksApi21 */
    public static class ServiceCallbacksApi21 implements ServiceCallbacks {
        private static Object sNullParceledListSliceObj;
        private final IMediaBrowserServiceCallbacksAdapterApi21 mCallbacks;

        static {
            MediaItem mediaItem = new MediaItem(new Builder().setMediaId("android.support.v4.media.MediaBrowserCompat.NULL_MEDIA_ITEM").build(), 0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediaItem);
            sNullParceledListSliceObj = ParceledListSliceAdapterApi21.newInstance(arrayList);
        }

        ServiceCallbacksApi21(Object obj) {
            this.mCallbacks = new IMediaBrowserServiceCallbacksAdapterApi21(obj);
        }

        public IBinder asBinder() {
            return this.mCallbacks.asBinder();
        }

        public void onConnect(String str, Object obj, Bundle bundle) {
            this.mCallbacks.onConnect(str, obj, bundle);
        }

        public void onConnectFailed() {
            this.mCallbacks.onConnectFailed();
        }

        public void onLoadChildren(String str, List<Parcel> list) {
            ArrayList arrayList = null;
            if (list != null) {
                arrayList = new ArrayList();
                for (Parcel parcel : list) {
                    parcel.setDataPosition(0);
                    arrayList.add(MediaItem.CREATOR.createFromParcel(parcel));
                    parcel.recycle();
                }
            }
            Object obj = VERSION.SDK_INT > 23 ? arrayList == null ? null : ParceledListSliceAdapterApi21.newInstance(arrayList) : arrayList == null ? sNullParceledListSliceObj : ParceledListSliceAdapterApi21.newInstance(arrayList);
            this.mCallbacks.onLoadChildren(str, obj);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompatApi21$ServiceImplApi21 */
    public interface ServiceImplApi21 {
        void addSubscription(String str, ServiceCallbacks serviceCallbacks);

        void connect(String str, Bundle bundle, ServiceCallbacks serviceCallbacks);

        void disconnect(ServiceCallbacks serviceCallbacks);

        void removeSubscription(String str, ServiceCallbacks serviceCallbacks);
    }

    MediaBrowserServiceCompatApi21() {
    }

    public static Object createService() {
        return new MediaBrowserServiceAdaptorApi21();
    }

    public static void onCreate(Object obj, ServiceImplApi21 serviceImplApi21) {
        ((MediaBrowserServiceAdaptorApi21) obj).onCreate(serviceImplApi21);
    }

    public static IBinder onBind(Object obj, Intent intent) {
        return ((MediaBrowserServiceAdaptorApi21) obj).onBind(intent);
    }
}
