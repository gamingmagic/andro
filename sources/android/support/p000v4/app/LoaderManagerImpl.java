package android.support.p000v4.app;

import android.os.Bundle;
import android.support.p000v4.app.LoaderManager.LoaderCallbacks;
import android.support.p000v4.content.Loader;
import android.support.p000v4.content.Loader.OnLoadCanceledListener;
import android.support.p000v4.content.Loader.OnLoadCompleteListener;
import android.support.p000v4.util.DebugUtils;
import android.support.p000v4.util.SparseArrayCompat;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: android.support.v4.app.LoaderManagerImpl */
class LoaderManagerImpl extends LoaderManager {
    static boolean DEBUG = false;
    static final String TAG = "LoaderManager";
    boolean mCreatingLoader;
    /* access modifiers changed from: private */
    public FragmentHostCallback mHost;
    final SparseArrayCompat<LoaderInfo> mInactiveLoaders = new SparseArrayCompat<>();
    final SparseArrayCompat<LoaderInfo> mLoaders = new SparseArrayCompat<>();
    boolean mRetaining;
    boolean mRetainingStarted;
    boolean mStarted;
    final String mWho;

    /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderInfo */
    final class LoaderInfo implements OnLoadCanceledListener<Object>, OnLoadCompleteListener<Object> {
        final Bundle mArgs;
        LoaderCallbacks<Object> mCallbacks;
        Object mData;
        boolean mDeliveredData;
        boolean mDestroyed;
        boolean mHaveData;
        final int mId;
        boolean mListenerRegistered;
        Loader<Object> mLoader;
        LoaderInfo mPendingLoader;
        boolean mReportNextStart;
        boolean mRetaining;
        boolean mRetainingStarted;
        boolean mStarted;

        public LoaderInfo(int i, Bundle bundle, LoaderCallbacks<Object> loaderCallbacks) {
            this.mId = i;
            this.mArgs = bundle;
            this.mCallbacks = loaderCallbacks;
        }

        /* access modifiers changed from: 0000 */
        public final void start() {
            if (this.mRetaining && this.mRetainingStarted) {
                this.mStarted = true;
            } else if (!this.mStarted) {
                this.mStarted = true;
                if (LoaderManagerImpl.DEBUG) {
                    new StringBuilder("  Starting: ").append(this);
                }
                if (this.mLoader == null && this.mCallbacks != null) {
                    this.mLoader = this.mCallbacks.onCreateLoader(this.mId, this.mArgs);
                }
                if (this.mLoader != null) {
                    if (!this.mLoader.getClass().isMemberClass() || Modifier.isStatic(this.mLoader.getClass().getModifiers())) {
                        if (!this.mListenerRegistered) {
                            this.mLoader.registerListener(this.mId, this);
                            this.mLoader.registerOnLoadCanceledListener(this);
                            this.mListenerRegistered = true;
                        }
                        this.mLoader.startLoading();
                    } else {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.mLoader);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void retain() {
            if (LoaderManagerImpl.DEBUG) {
                new StringBuilder("  Retaining: ").append(this);
            }
            this.mRetaining = true;
            this.mRetainingStarted = this.mStarted;
            this.mStarted = false;
            this.mCallbacks = null;
        }

        /* access modifiers changed from: 0000 */
        public final void finishRetain() {
            if (this.mRetaining) {
                if (LoaderManagerImpl.DEBUG) {
                    new StringBuilder("  Finished Retaining: ").append(this);
                }
                this.mRetaining = false;
                if (this.mStarted != this.mRetainingStarted && !this.mStarted) {
                    stop();
                }
            }
            if (this.mStarted && this.mHaveData && !this.mReportNextStart) {
                callOnLoadFinished(this.mLoader, this.mData);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void reportStart() {
            if (this.mStarted && this.mReportNextStart) {
                this.mReportNextStart = false;
                if (this.mHaveData) {
                    callOnLoadFinished(this.mLoader, this.mData);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void stop() {
            if (LoaderManagerImpl.DEBUG) {
                new StringBuilder("  Stopping: ").append(this);
            }
            this.mStarted = false;
            if (!this.mRetaining && this.mLoader != null && this.mListenerRegistered) {
                this.mListenerRegistered = false;
                this.mLoader.unregisterListener(this);
                this.mLoader.unregisterOnLoadCanceledListener(this);
                this.mLoader.stopLoading();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void cancel() {
            if (LoaderManagerImpl.DEBUG) {
                new StringBuilder("  Canceling: ").append(this);
            }
            if (this.mStarted && this.mLoader != null && this.mListenerRegistered && !this.mLoader.cancelLoad()) {
                onLoadCanceled(this.mLoader);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void destroy() {
            while (true) {
                if (LoaderManagerImpl.DEBUG) {
                    new StringBuilder("  Destroying: ").append(this);
                }
                this.mDestroyed = true;
                boolean z = this.mDeliveredData;
                this.mDeliveredData = false;
                if (this.mCallbacks != null && this.mLoader != null && this.mHaveData && z) {
                    if (LoaderManagerImpl.DEBUG) {
                        new StringBuilder("  Reseting: ").append(this);
                    }
                    String str = null;
                    if (LoaderManagerImpl.this.mHost != null) {
                        str = LoaderManagerImpl.this.mHost.mFragmentManager.mNoTransactionsBecause;
                        LoaderManagerImpl.this.mHost.mFragmentManager.mNoTransactionsBecause = "onLoaderReset";
                    }
                    try {
                        this.mCallbacks.onLoaderReset(this.mLoader);
                    } finally {
                        if (LoaderManagerImpl.this.mHost != null) {
                            LoaderManagerImpl.this.mHost.mFragmentManager.mNoTransactionsBecause = str;
                        }
                    }
                }
                this.mCallbacks = null;
                this.mData = null;
                this.mHaveData = false;
                if (this.mLoader != null) {
                    if (this.mListenerRegistered) {
                        this.mListenerRegistered = false;
                        this.mLoader.unregisterListener(this);
                        this.mLoader.unregisterOnLoadCanceledListener(this);
                    }
                    this.mLoader.reset();
                }
                if (this.mPendingLoader != null) {
                    this = this.mPendingLoader;
                } else {
                    return;
                }
            }
        }

        public final void onLoadCanceled(Loader<Object> loader) {
            if (LoaderManagerImpl.DEBUG) {
                new StringBuilder("onLoadCanceled: ").append(this);
            }
            if (this.mDestroyed) {
                boolean z = LoaderManagerImpl.DEBUG;
            } else if (LoaderManagerImpl.this.mLoaders.get(this.mId) != this) {
                boolean z2 = LoaderManagerImpl.DEBUG;
            } else {
                LoaderInfo loaderInfo = this.mPendingLoader;
                if (loaderInfo != null) {
                    if (LoaderManagerImpl.DEBUG) {
                        new StringBuilder("  Switching to pending loader: ").append(loaderInfo);
                    }
                    this.mPendingLoader = null;
                    LoaderManagerImpl.this.mLoaders.put(this.mId, null);
                    destroy();
                    LoaderManagerImpl.this.installLoader(loaderInfo);
                }
            }
        }

        public final void onLoadComplete(Loader<Object> loader, Object obj) {
            if (LoaderManagerImpl.DEBUG) {
                new StringBuilder("onLoadComplete: ").append(this);
            }
            if (this.mDestroyed) {
                boolean z = LoaderManagerImpl.DEBUG;
            } else if (LoaderManagerImpl.this.mLoaders.get(this.mId) != this) {
                boolean z2 = LoaderManagerImpl.DEBUG;
            } else {
                LoaderInfo loaderInfo = this.mPendingLoader;
                if (loaderInfo != null) {
                    if (LoaderManagerImpl.DEBUG) {
                        new StringBuilder("  Switching to pending loader: ").append(loaderInfo);
                    }
                    this.mPendingLoader = null;
                    LoaderManagerImpl.this.mLoaders.put(this.mId, null);
                    destroy();
                    LoaderManagerImpl.this.installLoader(loaderInfo);
                    return;
                }
                if (this.mData != obj || !this.mHaveData) {
                    this.mData = obj;
                    this.mHaveData = true;
                    if (this.mStarted) {
                        callOnLoadFinished(loader, obj);
                    }
                }
                LoaderInfo loaderInfo2 = (LoaderInfo) LoaderManagerImpl.this.mInactiveLoaders.get(this.mId);
                if (!(loaderInfo2 == null || loaderInfo2 == this)) {
                    loaderInfo2.mDeliveredData = false;
                    loaderInfo2.destroy();
                    LoaderManagerImpl.this.mInactiveLoaders.remove(this.mId);
                }
                if (LoaderManagerImpl.this.mHost != null && !LoaderManagerImpl.this.hasRunningLoaders()) {
                    LoaderManagerImpl.this.mHost.mFragmentManager.startPendingDeferredFragments();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void callOnLoadFinished(Loader<Object> loader, Object obj) {
            if (this.mCallbacks != null) {
                String str = null;
                if (LoaderManagerImpl.this.mHost != null) {
                    str = LoaderManagerImpl.this.mHost.mFragmentManager.mNoTransactionsBecause;
                    LoaderManagerImpl.this.mHost.mFragmentManager.mNoTransactionsBecause = "onLoadFinished";
                }
                try {
                    if (LoaderManagerImpl.DEBUG) {
                        new StringBuilder("  onLoadFinished in ").append(loader).append(": ").append(loader.dataToString(obj));
                    }
                    this.mCallbacks.onLoadFinished(loader, obj);
                    this.mDeliveredData = true;
                } finally {
                    if (LoaderManagerImpl.this.mHost != null) {
                        LoaderManagerImpl.this.mHost.mFragmentManager.mNoTransactionsBecause = str;
                    }
                }
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.mId);
            sb.append(" : ");
            DebugUtils.buildShortClassTag(this.mLoader, sb);
            sb.append("}}");
            return sb.toString();
        }

        public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            while (true) {
                printWriter.print(str);
                printWriter.print("mId=");
                printWriter.print(this.mId);
                printWriter.print(" mArgs=");
                printWriter.println(this.mArgs);
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.mCallbacks);
                printWriter.print(str);
                printWriter.print("mLoader=");
                printWriter.println(this.mLoader);
                if (this.mLoader != null) {
                    this.mLoader.dump(str + "  ", fileDescriptor, printWriter, strArr);
                }
                if (this.mHaveData || this.mDeliveredData) {
                    printWriter.print(str);
                    printWriter.print("mHaveData=");
                    printWriter.print(this.mHaveData);
                    printWriter.print("  mDeliveredData=");
                    printWriter.println(this.mDeliveredData);
                    printWriter.print(str);
                    printWriter.print("mData=");
                    printWriter.println(this.mData);
                }
                printWriter.print(str);
                printWriter.print("mStarted=");
                printWriter.print(this.mStarted);
                printWriter.print(" mReportNextStart=");
                printWriter.print(this.mReportNextStart);
                printWriter.print(" mDestroyed=");
                printWriter.println(this.mDestroyed);
                printWriter.print(str);
                printWriter.print("mRetaining=");
                printWriter.print(this.mRetaining);
                printWriter.print(" mRetainingStarted=");
                printWriter.print(this.mRetainingStarted);
                printWriter.print(" mListenerRegistered=");
                printWriter.println(this.mListenerRegistered);
                if (this.mPendingLoader != null) {
                    printWriter.print(str);
                    printWriter.println("Pending Loader ");
                    printWriter.print(this.mPendingLoader);
                    printWriter.println(":");
                    this = this.mPendingLoader;
                    str = str + "  ";
                } else {
                    return;
                }
            }
        }
    }

    static {
    }

    LoaderManagerImpl(String str, FragmentHostCallback fragmentHostCallback, boolean z) {
        this.mWho = str;
        this.mHost = fragmentHostCallback;
        this.mStarted = z;
    }

    /* access modifiers changed from: 0000 */
    public void updateHostController(FragmentHostCallback fragmentHostCallback) {
        this.mHost = fragmentHostCallback;
    }

    private LoaderInfo createLoader(int i, Bundle bundle, LoaderCallbacks<Object> loaderCallbacks) {
        LoaderInfo loaderInfo = new LoaderInfo(i, bundle, loaderCallbacks);
        loaderInfo.mLoader = loaderCallbacks.onCreateLoader(i, bundle);
        return loaderInfo;
    }

    private LoaderInfo createAndInstallLoader(int i, Bundle bundle, LoaderCallbacks<Object> loaderCallbacks) {
        try {
            this.mCreatingLoader = true;
            LoaderInfo createLoader = createLoader(i, bundle, loaderCallbacks);
            installLoader(createLoader);
            return createLoader;
        } finally {
            this.mCreatingLoader = false;
        }
    }

    /* access modifiers changed from: 0000 */
    public void installLoader(LoaderInfo loaderInfo) {
        this.mLoaders.put(loaderInfo.mId, loaderInfo);
        if (this.mStarted) {
            loaderInfo.start();
        }
    }

    public <D> Loader<D> initLoader(int i, Bundle bundle, LoaderCallbacks<D> loaderCallbacks) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.get(i);
        if (DEBUG) {
            new StringBuilder("initLoader in ").append(this).append(": args=").append(bundle);
        }
        if (loaderInfo == null) {
            loaderInfo = createAndInstallLoader(i, bundle, loaderCallbacks);
            if (DEBUG) {
                new StringBuilder("  Created new loader ").append(loaderInfo);
            }
        } else {
            if (DEBUG) {
                new StringBuilder("  Re-using existing loader ").append(loaderInfo);
            }
            loaderInfo.mCallbacks = loaderCallbacks;
        }
        if (loaderInfo.mHaveData && this.mStarted) {
            loaderInfo.callOnLoadFinished(loaderInfo.mLoader, loaderInfo.mData);
        }
        return loaderInfo.mLoader;
    }

    public <D> Loader<D> restartLoader(int i, Bundle bundle, LoaderCallbacks<D> loaderCallbacks) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.get(i);
        if (DEBUG) {
            new StringBuilder("restartLoader in ").append(this).append(": args=").append(bundle);
        }
        if (loaderInfo != null) {
            LoaderInfo loaderInfo2 = (LoaderInfo) this.mInactiveLoaders.get(i);
            if (loaderInfo2 != null) {
                if (loaderInfo.mHaveData) {
                    if (DEBUG) {
                        new StringBuilder("  Removing last inactive loader: ").append(loaderInfo);
                    }
                    loaderInfo2.mDeliveredData = false;
                    loaderInfo2.destroy();
                } else if (!loaderInfo.mStarted) {
                    this.mLoaders.put(i, null);
                    loaderInfo.destroy();
                } else {
                    loaderInfo.cancel();
                    if (loaderInfo.mPendingLoader != null) {
                        if (DEBUG) {
                            new StringBuilder("  Removing pending loader: ").append(loaderInfo.mPendingLoader);
                        }
                        loaderInfo.mPendingLoader.destroy();
                        loaderInfo.mPendingLoader = null;
                    }
                    loaderInfo.mPendingLoader = createLoader(i, bundle, loaderCallbacks);
                    return loaderInfo.mPendingLoader.mLoader;
                }
            } else if (DEBUG) {
                new StringBuilder("  Making last loader inactive: ").append(loaderInfo);
            }
            loaderInfo.mLoader.abandon();
            this.mInactiveLoaders.put(i, loaderInfo);
        }
        return createAndInstallLoader(i, bundle, loaderCallbacks).mLoader;
    }

    public void destroyLoader(int i) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (DEBUG) {
            new StringBuilder("destroyLoader in ").append(this).append(" of ").append(i);
        }
        int indexOfKey = this.mLoaders.indexOfKey(i);
        if (indexOfKey >= 0) {
            LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.valueAt(indexOfKey);
            this.mLoaders.removeAt(indexOfKey);
            loaderInfo.destroy();
        }
        int indexOfKey2 = this.mInactiveLoaders.indexOfKey(i);
        if (indexOfKey2 >= 0) {
            LoaderInfo loaderInfo2 = (LoaderInfo) this.mInactiveLoaders.valueAt(indexOfKey2);
            this.mInactiveLoaders.removeAt(indexOfKey2);
            loaderInfo2.destroy();
        }
        if (this.mHost != null && !hasRunningLoaders()) {
            this.mHost.mFragmentManager.startPendingDeferredFragments();
        }
    }

    public <D> Loader<D> getLoader(int i) {
        if (this.mCreatingLoader) {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.get(i);
        if (loaderInfo == null) {
            return null;
        }
        if (loaderInfo.mPendingLoader != null) {
            return loaderInfo.mPendingLoader.mLoader;
        }
        return loaderInfo.mLoader;
    }

    /* access modifiers changed from: 0000 */
    public void doStart() {
        if (DEBUG) {
            new StringBuilder("Starting in ").append(this);
        }
        if (this.mStarted) {
            new RuntimeException("here").fillInStackTrace();
            new StringBuilder("Called doStart when already started: ").append(this);
            return;
        }
        this.mStarted = true;
        for (int size = this.mLoaders.size() - 1; size >= 0; size--) {
            ((LoaderInfo) this.mLoaders.valueAt(size)).start();
        }
    }

    /* access modifiers changed from: 0000 */
    public void doStop() {
        if (DEBUG) {
            new StringBuilder("Stopping in ").append(this);
        }
        if (!this.mStarted) {
            new RuntimeException("here").fillInStackTrace();
            new StringBuilder("Called doStop when not started: ").append(this);
            return;
        }
        for (int size = this.mLoaders.size() - 1; size >= 0; size--) {
            ((LoaderInfo) this.mLoaders.valueAt(size)).stop();
        }
        this.mStarted = false;
    }

    /* access modifiers changed from: 0000 */
    public void doRetain() {
        if (DEBUG) {
            new StringBuilder("Retaining in ").append(this);
        }
        if (!this.mStarted) {
            new RuntimeException("here").fillInStackTrace();
            new StringBuilder("Called doRetain when not started: ").append(this);
            return;
        }
        this.mRetaining = true;
        this.mStarted = false;
        for (int size = this.mLoaders.size() - 1; size >= 0; size--) {
            ((LoaderInfo) this.mLoaders.valueAt(size)).retain();
        }
    }

    /* access modifiers changed from: 0000 */
    public void finishRetain() {
        if (this.mRetaining) {
            if (DEBUG) {
                new StringBuilder("Finished Retaining in ").append(this);
            }
            this.mRetaining = false;
            for (int size = this.mLoaders.size() - 1; size >= 0; size--) {
                ((LoaderInfo) this.mLoaders.valueAt(size)).finishRetain();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void doReportNextStart() {
        for (int size = this.mLoaders.size() - 1; size >= 0; size--) {
            ((LoaderInfo) this.mLoaders.valueAt(size)).mReportNextStart = true;
        }
    }

    /* access modifiers changed from: 0000 */
    public void doReportStart() {
        for (int size = this.mLoaders.size() - 1; size >= 0; size--) {
            ((LoaderInfo) this.mLoaders.valueAt(size)).reportStart();
        }
    }

    /* access modifiers changed from: 0000 */
    public void doDestroy() {
        if (!this.mRetaining) {
            if (DEBUG) {
                new StringBuilder("Destroying Active in ").append(this);
            }
            for (int size = this.mLoaders.size() - 1; size >= 0; size--) {
                ((LoaderInfo) this.mLoaders.valueAt(size)).destroy();
            }
            this.mLoaders.clear();
        }
        if (DEBUG) {
            new StringBuilder("Destroying Inactive in ").append(this);
        }
        for (int size2 = this.mInactiveLoaders.size() - 1; size2 >= 0; size2--) {
            ((LoaderInfo) this.mInactiveLoaders.valueAt(size2)).destroy();
        }
        this.mInactiveLoaders.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        DebugUtils.buildShortClassTag(this.mHost, sb);
        sb.append("}}");
        return sb.toString();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (this.mLoaders.size() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < this.mLoaders.size(); i++) {
                LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.valueAt(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.mLoaders.keyAt(i));
                printWriter.print(": ");
                printWriter.println(loaderInfo.toString());
                loaderInfo.dump(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.mInactiveLoaders.size() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            for (int i2 = 0; i2 < this.mInactiveLoaders.size(); i2++) {
                LoaderInfo loaderInfo2 = (LoaderInfo) this.mInactiveLoaders.valueAt(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.mInactiveLoaders.keyAt(i2));
                printWriter.print(": ");
                printWriter.println(loaderInfo2.toString());
                loaderInfo2.dump(str3, fileDescriptor, printWriter, strArr);
            }
        }
    }

    public boolean hasRunningLoaders() {
        boolean z = false;
        for (int i = 0; i < this.mLoaders.size(); i++) {
            LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.valueAt(i);
            z |= loaderInfo.mStarted && !loaderInfo.mDeliveredData;
        }
        return z;
    }
}
