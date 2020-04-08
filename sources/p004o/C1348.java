package p004o;

import com.roworkshop.andro.c_activity;

/* renamed from: o.ც */
public class C1348 implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ Runnable f6878;

    /* renamed from: 鷭 */
    final /* synthetic */ c_activity f6879;

    C1348(c_activity c_activity, Runnable runnable) {
        this.f6879 = c_activity;
        this.f6878 = runnable;
    }

    public final void run() {
        try {
            this.f6878.run();
        } catch (Throwable th) {
            this.f6879.f49.mo4354(Thread.currentThread(), th);
        }
    }
}
