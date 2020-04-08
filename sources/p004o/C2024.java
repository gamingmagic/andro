package p004o;

import android.graphics.Bitmap;

/* renamed from: o.춰 */
class C2024 implements Runnable {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ String f8914;

    /* renamed from: 櫯 */
    private final /* synthetic */ Bitmap f8915;

    /* renamed from: 鷭 */
    final /* synthetic */ C1799 f8916;

    C2024(C1799 r1, Bitmap bitmap, String str) {
        this.f8916 = r1;
        this.f8915 = bitmap;
        this.f8914 = str;
    }

    public final void run() {
        this.f8916.f8328.f8868 = this.f8915;
        if (this.f8916.f8328.f8870 != null) {
            this.f8916.f8328.f8870.setImageBitmap(this.f8915);
        }
        C1014.f6147.f51.f1425.put(this.f8914, this.f8915);
    }
}
