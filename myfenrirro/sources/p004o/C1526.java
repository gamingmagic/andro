package p004o;

import android.view.ViewGroup;

/* renamed from: o.免 */
class C1526 implements Runnable {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ Runnable f7277;

    /* renamed from: 櫯 */
    private final /* synthetic */ long f7278;

    /* renamed from: 鷭 */
    final /* synthetic */ C1796 f7279;

    C1526(C1796 r1, long j, Runnable runnable) {
        this.f7279 = r1;
        this.f7278 = j;
        this.f7277 = runnable;
    }

    public final void run() {
        ((ViewGroup) this.f7279.f8325.getWindow().getDecorView()).removeView(this.f7279.f8325.f57);
        this.f7277.run();
    }
}
