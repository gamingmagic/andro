package p004o;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: o.jy */
class C0485jy implements Runnable {

    /* renamed from: ȃ */
    private final /* synthetic */ Drawable f1520;

    /* renamed from: ˮ͈ */
    private final /* synthetic */ ImageView f1521;

    /* renamed from: 櫯 */
    private final /* synthetic */ String f1522;

    /* renamed from: 鷭 */
    final /* synthetic */ C0453ix f1523;

    C0485jy(C0453ix ixVar, String str, ImageView imageView, Drawable drawable) {
        this.f1523 = ixVar;
        this.f1522 = str;
        this.f1521 = imageView;
        this.f1520 = drawable;
    }

    public final void run() {
        try {
            C1014.f6147.mo3387((Runnable) new C0486jz(this, this.f1521, this.f1520, C1014.f6158.mo3617(this.f1522, 1), this.f1522));
        } catch (C0825tu unused) {
        }
    }
}
