package p004o;

import com.roworkshop.andro.c_activity;

/* renamed from: o.嫺 */
public class C1561 implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ int f7366;

    /* renamed from: 鷭 */
    final /* synthetic */ c_activity f7367;

    C1561(c_activity c_activity, int i) {
        this.f7367 = c_activity;
        this.f7366 = i;
    }

    public final void run() {
        if (this.f7367.f51.f1371 != null) {
            this.f7367.f51.f1371.setProgress(this.f7366);
        }
    }
}
