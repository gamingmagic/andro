package p004o;

import android.graphics.Bitmap;

/* renamed from: o.덛 */
class C1913 implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ Bitmap f8606;

    /* renamed from: 鷭 */
    final /* synthetic */ C1497 f8607;

    C1913(C1497 r1, Bitmap bitmap) {
        this.f8607 = r1;
        this.f8606 = bitmap;
    }

    public final void run() {
        this.f8607.f7194.f7976.setImageBitmap(this.f8606);
    }
}
