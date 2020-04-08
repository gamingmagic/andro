package p004o;

import android.graphics.Bitmap;

/* renamed from: o.lc */
class C0518lc implements Runnable {

    /* renamed from: ˮ͈ */
    private final /* synthetic */ String f1623;

    /* renamed from: 櫯 */
    private final /* synthetic */ Bitmap f1624;

    /* renamed from: 鷭 */
    final /* synthetic */ C0517lb f1625;

    C0518lc(C0517lb lbVar, Bitmap bitmap, String str) {
        this.f1625 = lbVar;
        this.f1624 = bitmap;
        this.f1623 = str;
    }

    public final void run() {
        this.f1625.f1622.f1600 = this.f1624;
        if (this.f1625.f1622.f1588 != null) {
            this.f1625.f1622.f1588.setImageBitmap(this.f1624);
        }
        C1014.f6147.f51.f1425.put(this.f1623, this.f1624);
    }
}
