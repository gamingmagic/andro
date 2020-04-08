package p004o;

import android.graphics.Bitmap;

/* renamed from: o.盅 */
class C1696 implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ Bitmap f7752;

    /* renamed from: 鷭 */
    final /* synthetic */ C1871 f7753;

    C1696(C1871 r1, Bitmap bitmap) {
        this.f7753 = r1;
        this.f7752 = bitmap;
    }

    public final void run() {
        C1014.f6147.f51.f1383.f7300.f8457.put(this.f7753.f8461.mo4636(), this.f7752);
        this.f7753.f8461.f8971 = this.f7752;
        this.f7753.f8461.f8970.setImageBitmap(this.f7752);
    }
}
