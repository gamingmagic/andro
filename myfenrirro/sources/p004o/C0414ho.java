package p004o;

/* renamed from: o.ho */
class C0414ho implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ int f1208;

    /* renamed from: 鷭 */
    final /* synthetic */ C0412hn f1209;

    C0414ho(C0412hn hnVar, int i) {
        this.f1209 = hnVar;
        this.f1208 = i;
    }

    public final void run() {
        if (this.f1209.f1190 == null) {
            this.f1209.f1190 = new C0208bd(this.f1208);
            return;
        }
        this.f1209.f1190.f466 = C0209.UNKNOWN;
    }
}
