package p004o;

/* renamed from: o.驇 */
class C1816 implements Runnable {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ Throwable f8409;

    /* renamed from: 櫯 */
    private final /* synthetic */ Thread f8410;

    /* renamed from: 鷭 */
    final /* synthetic */ C1493 f8411;

    C1816(C1493 r1, Thread thread, Throwable th) {
        this.f8411 = r1;
        this.f8410 = thread;
        this.f8409 = th;
    }

    public final void run() {
        this.f8411.mo4354(this.f8410, this.f8409);
    }
}
