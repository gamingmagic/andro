package p004o;

/* renamed from: o.欘 */
class C1655 implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ C0652pd[] f7627;

    /* renamed from: 鷭 */
    final /* synthetic */ C1428 f7628;

    C1655(C1428 r1, C0652pd[] pdVarArr) {
        this.f7628 = r1;
        this.f7627 = pdVarArr;
    }

    public final void run() {
        if (this.f7627 != null) {
            for (C0652pd r1 : this.f7627) {
                this.f7628.mo3652((C0839ue) r1);
            }
        }
    }
}
