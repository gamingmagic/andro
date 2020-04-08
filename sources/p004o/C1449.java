package p004o;

/* renamed from: o.䅑 */
class C1449 implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ C0280do f7068;

    /* renamed from: 鷭 */
    final /* synthetic */ C1569 f7069;

    C1449(C1569 r1, C0280do doVar) {
        this.f7069 = r1;
        this.f7068 = doVar;
    }

    public final void run() {
        this.f7068.mo4333();
        this.f7069.f7369.f54 = null;
        this.f7068.f1341.interrupt();
    }
}
