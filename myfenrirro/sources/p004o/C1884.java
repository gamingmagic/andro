package p004o;

import android.graphics.Bitmap;

/* renamed from: o.궱 */
class C1884 implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ Bitmap f8498;

    /* renamed from: 鷭 */
    final /* synthetic */ C1292 f8499;

    C1884(C1292 r1, Bitmap bitmap) {
        this.f8499 = r1;
        this.f8498 = bitmap;
    }

    public final void run() {
        this.f8499.f6472.f8583.setImageBitmap(this.f8498);
    }
}
