package p004o;

import com.roworkshop.andro.c_activity;

/* renamed from: o.fw */
class C0355fw implements Runnable {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ String f954;

    /* renamed from: 櫯 */
    private final /* synthetic */ c_activity f955;

    /* renamed from: 鷭 */
    final /* synthetic */ C0354fv f956;

    C0355fw(C0354fv fvVar, c_activity c_activity, String str) {
        this.f956 = fvVar;
        this.f955 = c_activity;
        this.f954 = str;
    }

    public final void run() {
        this.f955.mo3387((Runnable) new C0356fx(this, C1014.f6158.mo3615(this.f956.f947.f8848), this.f955, this.f954));
    }
}
