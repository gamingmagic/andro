package android.support.p000v4.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.p000v4.p002os.CancellationSignal;
import android.support.p000v4.p002os.OperationCanceledException;

/* renamed from: android.support.v4.content.ContentResolverCompat */
public final class ContentResolverCompat {
    private static final ContentResolverCompatImpl IMPL;

    /* renamed from: android.support.v4.content.ContentResolverCompat$ContentResolverCompatImpl */
    interface ContentResolverCompatImpl {
        Cursor query(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);
    }

    /* renamed from: android.support.v4.content.ContentResolverCompat$ContentResolverCompatImplBase */
    static class ContentResolverCompatImplBase implements ContentResolverCompatImpl {
        ContentResolverCompatImplBase() {
        }

        public Cursor query(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            if (cancellationSignal != null) {
                cancellationSignal.throwIfCanceled();
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2);
        }
    }

    /* renamed from: android.support.v4.content.ContentResolverCompat$ContentResolverCompatImplJB */
    static class ContentResolverCompatImplJB extends ContentResolverCompatImplBase {
        ContentResolverCompatImplJB() {
        }

        public Cursor query(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            Object obj;
            ContentResolver contentResolver2 = contentResolver;
            Uri uri2 = uri;
            String[] strArr3 = strArr;
            String str3 = str;
            String[] strArr4 = strArr2;
            String str4 = str2;
            if (cancellationSignal != null) {
                try {
                    obj = cancellationSignal.getCancellationSignalObject();
                } catch (Exception e) {
                    if (ContentResolverCompatJellybean.isFrameworkOperationCanceledException(e)) {
                        throw new OperationCanceledException();
                    }
                    throw e;
                }
            } else {
                obj = null;
            }
            return ContentResolverCompatJellybean.query(contentResolver2, uri2, strArr3, str3, strArr4, str4, obj);
        }
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            IMPL = new ContentResolverCompatImplJB();
        } else {
            IMPL = new ContentResolverCompatImplBase();
        }
    }

    private ContentResolverCompat() {
    }

    public static Cursor query(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        return IMPL.query(contentResolver, uri, strArr, str, strArr2, str2, cancellationSignal);
    }
}
