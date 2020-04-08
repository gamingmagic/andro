package p004o;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: o.jo */
class C0475jo implements Runnable {

    /* renamed from: ȃ */
    private final /* synthetic */ ImageView f1504;

    /* renamed from: ˮ͈ */
    private final /* synthetic */ Bitmap f1505;

    /* renamed from: 櫯 */
    private final /* synthetic */ String f1506;

    /* renamed from: 鷭 */
    final /* synthetic */ C0474jn f1507;

    C0475jo(C0474jn jnVar, String str, Bitmap bitmap, ImageView imageView) {
        this.f1507 = jnVar;
        this.f1506 = str;
        this.f1505 = bitmap;
        this.f1504 = imageView;
    }

    public final void run() {
        C1014.f6147.f51.f1425.put(this.f1506, this.f1505);
        this.f1504.setImageBitmap(this.f1505);
    }
}
