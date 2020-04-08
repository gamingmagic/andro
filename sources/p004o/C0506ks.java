package p004o;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: o.ks */
class C0506ks implements Runnable {

    /* renamed from: 櫯 */
    private final /* synthetic */ C0405hk f1579;

    /* renamed from: 鷭 */
    final /* synthetic */ C0505kr f1580;

    C0506ks(C0505kr krVar, C0405hk hkVar) {
        this.f1580 = krVar;
        this.f1579 = hkVar;
    }

    public final void run() {
        ImageView imageView = this.f1580.f1578.f1550;
        C0252cp cpVar = C1014.f6158;
        imageView.setImageBitmap(Bitmap.createScaledBitmap(C0252cp.m268(this.f1579), this.f1580.f1578.f1565.x, this.f1580.f1578.f1565.y, false));
    }
}
