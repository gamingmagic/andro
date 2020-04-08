package p004o;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.Log;
import android.widget.ImageView;

/* renamed from: o.jn */
class C0474jn implements Runnable {

    /* renamed from: ȃ */
    private final /* synthetic */ ImageView f1500;

    /* renamed from: ˮ͈ */
    private final /* synthetic */ String f1501;

    /* renamed from: 櫯 */
    private final /* synthetic */ String f1502;

    /* renamed from: 鷭 */
    final /* synthetic */ C0453ix f1503;

    C0474jn(C0453ix ixVar, String str, String str2, ImageView imageView) {
        this.f1503 = ixVar;
        this.f1502 = str;
        this.f1501 = str2;
        this.f1500 = imageView;
    }

    public final void run() {
        C1621 r8 = C0596nw.m683(this.f1501, (byte[]) C1014.f6158.f677.mo3613(this.f1502, false));
        if (r8.f7545 != 32) {
            String str = "Only 32bpp images supported for status icons";
            Log.e("AndRO", str);
            throw new C0588no(str);
        }
        Bitmap createBitmap = Bitmap.createBitmap(r8.f7546.x, r8.f7546.y, Config.ARGB_8888);
        createBitmap.setPixels(r8.f7548, 0, r8.f7546.x, 0, 0, r8.f7546.x, r8.f7546.y);
        C1014.f6147.mo3387((Runnable) new C0475jo(this, this.f1501, createBitmap, this.f1500));
    }
}
