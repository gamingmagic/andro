package p004o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: o.jz */
class C0486jz implements Runnable {

    /* renamed from: Ą */
    private final /* synthetic */ String f1524;

    /* renamed from: ȃ */
    private final /* synthetic */ Bitmap f1525;

    /* renamed from: ˮ͈ */
    private final /* synthetic */ Drawable f1526;

    /* renamed from: 櫯 */
    private final /* synthetic */ ImageView f1527;

    /* renamed from: 鷭 */
    final /* synthetic */ C0485jy f1528;

    C0486jz(C0485jy jyVar, ImageView imageView, Drawable drawable, Bitmap bitmap, String str) {
        this.f1528 = jyVar;
        this.f1527 = imageView;
        this.f1526 = drawable;
        this.f1525 = bitmap;
        this.f1524 = str;
    }

    public final void run() {
        if (this.f1527.getDrawable() == this.f1526) {
            this.f1527.setImageBitmap(this.f1525);
        }
        C1014.f6147.f51.f1425.put(this.f1524, this.f1525);
    }
}
