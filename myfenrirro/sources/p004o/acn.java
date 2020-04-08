package p004o;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import java.util.concurrent.Executor;

/* renamed from: o.acn */
public final class acn {

    /* renamed from: 鷭 */
    private static Executor f299;

    @SuppressLint({"InlinedApi"})
    /* renamed from: 鷭 */
    public static void m116(AsyncTask<Void, ?, ?> asyncTask) {
        if (VERSION.SDK_INT <= 12) {
            asyncTask.execute(new Void[0]);
        } else {
            asyncTask.executeOnExecutor(f299 != null ? f299 : AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }
}
