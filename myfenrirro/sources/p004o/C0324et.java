package p004o;

/* renamed from: o.et */
class C0324et implements Runnable {

    /* renamed from: 鷭 */
    final /* synthetic */ C0317em f877;

    C0324et(C0317em emVar) {
        this.f877 = emVar;
    }

    public final void run() {
        this.f877.f860.f1341.interrupt();
        this.f877.f860 = null;
    }
}
