package android.support.p000v4.provider;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;

/* renamed from: android.support.v4.provider.DocumentsContractApi19 */
class DocumentsContractApi19 {
    private static final String TAG = "DocumentFile";

    DocumentsContractApi19() {
    }

    public static boolean isDocumentUri(Context context, Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    public static String getName(Context context, Uri uri) {
        return queryForString(context, uri, "_display_name", null);
    }

    private static String getRawType(Context context, Uri uri) {
        return queryForString(context, uri, "mime_type", null);
    }

    public static String getType(Context context, Uri uri) {
        String rawType = getRawType(context, uri);
        if ("vnd.android.document/directory".equals(rawType)) {
            return null;
        }
        return rawType;
    }

    public static boolean isDirectory(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(getRawType(context, uri));
    }

    public static boolean isFile(Context context, Uri uri) {
        String rawType = getRawType(context, uri);
        if ("vnd.android.document/directory".equals(rawType) || TextUtils.isEmpty(rawType)) {
            return false;
        }
        return true;
    }

    public static long lastModified(Context context, Uri uri) {
        return queryForLong(context, uri, "last_modified", 0);
    }

    public static long length(Context context, Uri uri) {
        return queryForLong(context, uri, "_size", 0);
    }

    public static boolean canRead(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 1) != 0) {
            return false;
        }
        if (TextUtils.isEmpty(getRawType(context, uri))) {
            return false;
        }
        return true;
    }

    public static boolean canWrite(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String rawType = getRawType(context, uri);
        int queryForInt = queryForInt(context, uri, "flags", 0);
        if (TextUtils.isEmpty(rawType)) {
            return false;
        }
        if ((queryForInt & 4) != 0) {
            return true;
        }
        if ("vnd.android.document/directory".equals(rawType) && (queryForInt & 8) != 0) {
            return true;
        }
        if (TextUtils.isEmpty(rawType) || (queryForInt & 2) == 0) {
            return false;
        }
        return true;
    }

    public static boolean delete(Context context, Uri uri) {
        return DocumentsContract.deleteDocument(context.getContentResolver(), uri);
    }

    /* JADX INFO: finally extract failed */
    public static boolean exists(Context context, Uri uri) {
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            Cursor cursor = query;
            boolean z = query.getCount() > 0;
            closeQuietly(cursor);
            return z;
        } catch (Exception e) {
            new StringBuilder("Failed query: ").append(e);
            closeQuietly(null);
            return false;
        } catch (Throwable th) {
            closeQuietly(null);
            throw th;
        }
    }

    private static String queryForString(Context context, Uri uri, String str, String str2) {
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            cursor = query;
            if (query.moveToFirst() && !cursor.isNull(0)) {
                return cursor.getString(0);
            }
            String str3 = str2;
            closeQuietly(cursor);
            return str3;
        } catch (Exception e) {
            new StringBuilder("Failed query: ").append(e);
            return str2;
        } finally {
            closeQuietly(cursor);
        }
    }

    private static int queryForInt(Context context, Uri uri, String str, int i) {
        return (int) queryForLong(context, uri, str, (long) i);
    }

    private static long queryForLong(Context context, Uri uri, String str, long j) {
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            cursor = query;
            if (query.moveToFirst() && !cursor.isNull(0)) {
                return cursor.getLong(0);
            }
            closeQuietly(cursor);
            return j;
        } catch (Exception e) {
            new StringBuilder("Failed query: ").append(e);
            return j;
        } finally {
            closeQuietly(cursor);
        }
    }

    private static void closeQuietly(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
