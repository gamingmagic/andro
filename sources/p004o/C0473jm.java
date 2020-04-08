package p004o;

/* renamed from: o.jm */
class C0473jm implements Runnable {

    /* renamed from: 鷭 */
    final /* synthetic */ C0453ix f1499;

    C0473jm(C0453ix ixVar) {
        this.f1499 = ixVar;
    }

    public final void run() {
        if (this.f1499.f1369 != null) {
            this.f1499.f1369.dismiss();
            this.f1499.f1369 = null;
        }
        if (this.f1499.f1370 != null) {
            this.f1499.f1370.dismiss();
            this.f1499.f1370 = null;
        }
    }
}
