package p004o;

/* renamed from: o.iq */
class C0446iq implements Runnable {

    /* renamed from: 鷭 */
    final /* synthetic */ C0445ip f1343;

    C0446iq(C0445ip ipVar) {
        this.f1343 = ipVar;
    }

    public final void run() {
        do {
            try {
                this.f1343.mo3842();
            } catch (InterruptedException unused) {
                return;
            }
        } while (!Thread.interrupted());
    }
}
